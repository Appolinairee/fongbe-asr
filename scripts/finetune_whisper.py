#!/usr/bin/env python3
"""
Finetuning Whisper pour ASR Fongbe avec LoRA
Approche recherche : expérimentations sur rank, target modules, etc.
"""

import os
import sys
from pathlib import Path
import torch
from transformers import (
    WhisperProcessor,
    WhisperForConditionalGeneration,
    Seq2SeqTrainingArguments,
    Seq2SeqTrainer,
)
from peft import LoraConfig, get_peft_model, prepare_model_for_kbit_training
import evaluate
from dataclasses import dataclass
from typing import Any, Dict, List, Union

sys.path.insert(0, str(Path(__file__).resolve().parents[1] / "src"))

from fongbe_asr.hf_dataset import load_fongbe_dataset, normalize_audio_column

# Configuration
MODEL_NAME = "openai/whisper-small"  # 244M params
DATASET_PATH = os.getenv("DATASET_PATH", "data/processed/fongbe_asr_unified")
HF_DATASET_ID = os.getenv("HF_DATASET_ID", "").strip()
HF_DATASET_CACHE_DIR = os.getenv("HF_DATASET_CACHE_DIR", "").strip() or None
OUTPUT_DIR = os.getenv("OUTPUT_DIR", "outputs/whisper-fongbe-lora")

# Hyperparamètres LoRA (à expérimenter)
LORA_CONFIG = {
    "r": 8,  # Rank - Question recherche #1
    "lora_alpha": 32,
    "target_modules": ["q_proj", "v_proj"],  # Question recherche #2
    "lora_dropout": 0.1,
    "bias": "none",
}

print("🔧 FINETUNING WHISPER FONGBE")
print("="*60)
print(f"Modèle: {MODEL_NAME}")
print(f"LoRA rank: {LORA_CONFIG['r']}")
print(f"Target modules: {LORA_CONFIG['target_modules']}")
print("="*60)


# 1. Charger dataset
print("\n📦 Chargement dataset...")
dataset = load_fongbe_dataset(DATASET_PATH, HF_DATASET_ID, HF_DATASET_CACHE_DIR)
dataset = normalize_audio_column(dataset)

print(f"✅ Dataset chargé:")
print(f"   Train: {len(dataset['train'])} samples")
print(f"   Validation: {len(dataset['validation'])} samples")
print(f"   Test: {len(dataset['test'])} samples")


# 2. Charger modèle et processeur
print("\n🤖 Chargement Whisper...")
processor = WhisperProcessor.from_pretrained(MODEL_NAME)
model = WhisperForConditionalGeneration.from_pretrained(MODEL_NAME)

# Forcer langue fongbe (utilise code le plus proche)
model.config.forced_decoder_ids = processor.get_decoder_prompt_ids(
    language="yo",  # Yoruba (langue proche)
    task="transcribe"
)

print(f"✅ Modèle chargé: {MODEL_NAME}")
print(f"   Paramètres totaux: {model.num_parameters():,}")


# 3. Appliquer LoRA
print("\n🔬 Application LoRA...")
lora_config = LoraConfig(**LORA_CONFIG)
model = get_peft_model(model, lora_config)

trainable_params = sum(p.numel() for p in model.parameters() if p.requires_grad)
total_params = sum(p.numel() for p in model.parameters())

print(f"✅ LoRA appliqué:")
print(f"   Paramètres entraînables: {trainable_params:,} ({trainable_params/total_params*100:.2f}%)")
print(f"   Paramètres gelés: {total_params - trainable_params:,}")


# 4. Preprocessing
print("\n⚙️  Configuration preprocessing...")

@dataclass
class DataCollatorSpeechSeq2SeqWithPadding:
    """Collator pour batch audio + texte"""
    processor: Any

    def __call__(self, features: List[Dict[str, Union[List[int], torch.Tensor]]]) -> Dict[str, torch.Tensor]:
        # Padding des features audio déjà extraites par prepare_dataset()
        input_features = [{"input_features": feature["input_features"]} for feature in features]
        batch = self.processor.feature_extractor.pad(input_features, return_tensors="pt")

        # Extraire texte (labels)
        label_features = [{"input_ids": feature["labels"]} for feature in features]
        labels_batch = self.processor.tokenizer.pad(label_features, return_tensors="pt")

        # Remplacer padding par -100 (ignoré dans loss)
        labels = labels_batch["input_ids"].masked_fill(
            labels_batch.attention_mask.ne(1), -100
        )

        # Si bos token au début, supprimer (Whisper l'ajoute)
        if (labels[:, 0] == self.processor.tokenizer.bos_token_id).all().cpu().item():
            labels = labels[:, 1:]

        batch["labels"] = labels
        return batch


def prepare_dataset(batch):
    """Prépare un batch pour training"""
    # Audio déjà chargé par Audio feature
    audio = batch["audio"]
    
    # Compute input features
    batch["input_features"] = processor.feature_extractor(
        audio["array"], sampling_rate=audio["sampling_rate"]
    ).input_features[0]

    # Tokenize text
    batch["labels"] = processor.tokenizer(batch["text"]).input_ids
    return batch


print("🔄 Preprocessing dataset...")
dataset = dataset.map(
    prepare_dataset,
    remove_columns=dataset.column_names["train"],
    num_proc=4
)

data_collator = DataCollatorSpeechSeq2SeqWithPadding(processor=processor)
print("✅ Dataset preprocessé")


# 5. Métriques
print("\n📊 Configuration métriques...")
wer_metric = evaluate.load("wer")

def compute_metrics(pred):
    """Calcule WER sur prédictions"""
    pred_ids = pred.predictions
    label_ids = pred.label_ids

    # Remplacer -100 par pad_token_id
    label_ids[label_ids == -100] = processor.tokenizer.pad_token_id

    # Decode
    pred_str = processor.tokenizer.batch_decode(pred_ids, skip_special_tokens=True)
    label_str = processor.tokenizer.batch_decode(label_ids, skip_special_tokens=True)

    # Compute WER
    wer = wer_metric.compute(predictions=pred_str, references=label_str)
    return {"wer": wer}


# 6. Training arguments
print("\n🎯 Configuration training...")
training_args = Seq2SeqTrainingArguments(
    output_dir=OUTPUT_DIR,
    per_device_train_batch_size=8,
    gradient_accumulation_steps=2,  # Effective batch size = 16
    learning_rate=1e-3,
    warmup_steps=500,
    num_train_epochs=3,
    evaluation_strategy="steps",
    eval_steps=500,
    save_steps=500,
    save_total_limit=2,
    logging_steps=100,
    report_to=["tensorboard"],
    load_best_model_at_end=True,
    metric_for_best_model="wer",
    greater_is_better=False,
    push_to_hub=False,
    predict_with_generate=True,
    generation_max_length=225,
    fp16=torch.cuda.is_available(),
)

print(f"✅ Training config:")
print(f"   Batch size: {training_args.per_device_train_batch_size}")
print(f"   Learning rate: {training_args.learning_rate}")
print(f"   Epochs: {training_args.num_train_epochs}")
print(f"   FP16: {training_args.fp16}")


# 7. Trainer
print("\n🚀 Initialisation Trainer...")
trainer = Seq2SeqTrainer(
    model=model,
    args=training_args,
    train_dataset=dataset["train"],
    eval_dataset=dataset["validation"],
    data_collator=data_collator,
    compute_metrics=compute_metrics,
    tokenizer=processor.feature_extractor,
)

print("✅ Trainer prêt")


# 8. Training
print("\n" + "="*60)
print("🔥 DÉBUT TRAINING")
print("="*60)

try:
    trainer.train()
    print("\n✅ Training terminé!")
    
    # 9. Évaluation finale
    print("\n📊 Évaluation finale sur test set...")
    metrics = trainer.evaluate(dataset["test"])
    
    print("\n🎯 RÉSULTATS FINAUX:")
    print(f"   WER test: {metrics['eval_wer']*100:.2f}%")
    
    # Sauvegarder modèle
    print("\n💾 Sauvegarde modèle...")
    model.save_pretrained(f"{OUTPUT_DIR}/final")
    processor.save_pretrained(f"{OUTPUT_DIR}/final")
    
    print(f"\n✅ Modèle sauvegardé dans {OUTPUT_DIR}/final")
    
except KeyboardInterrupt:
    print("\n⚠️  Training interrompu par utilisateur")
except Exception as e:
    print(f"\n❌ Erreur: {e}")
    raise


print("\n" + "="*60)
print("✨ FINETUNING TERMINÉ")
print("="*60)
