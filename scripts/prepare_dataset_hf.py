#!/usr/bin/env python3
"""
Unification datasets Laleye + pyFongbe → Format HuggingFace
Création dataset ASR fongbe pour finetuning Whisper
"""

from pathlib import Path
import os
from datasets import Dataset, DatasetDict, Audio
from tqdm import tqdm
import pandas as pd


RAW_DATA_DIR = Path(os.getenv("RAW_DATA_DIR", "data/raw"))
OUTPUT_DATASET_PATH = os.getenv("DATASET_PATH", "data/processed/fongbe_asr_unified")

def load_laleye():
    """Charge dataset Laleye"""
    print("📦 Chargement Laleye...")
    
    base = RAW_DATA_DIR / "Fongbe_Speech_Dataset/fongbe_speech_audio_files"
    wav_dir = base / "wav"
    txt_dir = base / "lab"
    metadata = pd.read_csv(RAW_DATA_DIR / "Fongbe_Speech_Dataset/fongbe_speech_dataset_metadata.csv")
    
    data = []
    for wav_file in tqdm(list(wav_dir.glob("*.wav"))):
        txt_file = txt_dir / wav_file.with_suffix('.txt').name
        
        if txt_file.exists():
            transcript = open(txt_file, encoding='utf-8').read().strip()
            
            # Metadata du speaker
            row = metadata[metadata['audio filename'] == wav_file.name]
            speaker_id = row['speaker ID'].values[0] if len(row) > 0 else "unknown"
            gender = row['gender'].values[0] if len(row) > 0 else "unknown"
            
            data.append({
                'audio': str(wav_file.absolute()),
                'text': transcript,
                'speaker_id': f"laleye_{speaker_id}",
                'gender': gender,
                'source': 'laleye',
                'duration': None  # Sera calculé automatiquement
            })
    
    print(f"✅ Laleye: {len(data)} samples")
    return data

def load_pyfongbe():
    """Charge dataset pyFongbe"""
    print("\n📦 Chargement pyFongbe...")
    
    base = RAW_DATA_DIR / "pyFongbe/data"
    
    data = []
    
    # Train + Test
    for split in ['train', 'test']:
        split_dir = base / split
        text_file = split_dir / "text"
        
        # Lire transcriptions
        transcripts = {}
        for line in open(text_file, encoding='utf-8'):
            parts = line.strip().split(maxsplit=1)
            if len(parts) == 2:
                transcripts[parts[0]] = parts[1]
        
        # Parcourir WAVs
        wav_files = list(split_dir.glob("wav/*/*.wav"))
        
        for wav_file in tqdm(wav_files):
            file_id = wav_file.stem
            speaker = wav_file.parent.name
            
            if file_id in transcripts:
                data.append({
                    'audio': str(wav_file.absolute()),
                    'text': transcripts[file_id],
                    'speaker_id': f"pyfongbe_{speaker}",
                    'gender': 'unknown',
                    'source': 'pyfongbe',
                    'duration': None
                })
    
    print(f"✅ pyFongbe: {len(data)} samples")
    return data

def create_unified_dataset():
    """Crée dataset unifié HuggingFace"""
    print("\n🔨 CRÉATION DATASET UNIFIÉ")
    print("="*60)
    
    # Charger données
    laleye_data = load_laleye()
    pyfongbe_data = load_pyfongbe()
    
    # Combiner
    all_data = laleye_data + pyfongbe_data
    print(f"\n✅ Total: {len(all_data)} samples")
    
    # Créer Dataset HF (version simple - chemins audio seulement)
    print("\n🔄 Conversion en HuggingFace Dataset...")
    
    dataset = Dataset.from_dict({
        'audio_path': [d['audio'] for d in all_data],
        'text': [d['text'] for d in all_data],
        'speaker_id': [d['speaker_id'] for d in all_data],
        'gender': [d['gender'] for d in all_data],
        'source': [d['source'] for d in all_data],
    })
    
    # Splits train/val/test (80/10/10)
    print("\n✂️  Création splits train/val/test...")
    
    # Shuffle avec seed fixe
    dataset = dataset.shuffle(seed=42)
    
    # Split
    train_test = dataset.train_test_split(test_size=0.2, seed=42)
    test_val = train_test['test'].train_test_split(test_size=0.5, seed=42)
    
    dataset_dict = DatasetDict({
        'train': train_test['train'],
        'validation': test_val['train'],
        'test': test_val['test']
    })
    
    # Stats
    print("\n📊 STATISTIQUES:")
    print(f"   Train: {len(dataset_dict['train'])} samples")
    print(f"   Validation: {len(dataset_dict['validation'])} samples")
    print(f"   Test: {len(dataset_dict['test'])} samples")
    
    # Sauvegarder
    output_dir = OUTPUT_DATASET_PATH
    print(f"\n💾 Sauvegarde dans {output_dir}...")
    dataset_dict.save_to_disk(output_dir)
    
    print("\n✅ DATASET UNIFIÉ CRÉÉ!")
    print(f"📁 Chemin: {output_dir}")
    
    # Afficher exemples
    print("\n🔍 EXEMPLES:")
    for i in range(3):
        sample = dataset_dict['train'][i]
        print(f"\n[{i+1}]")
        print(f"  Audio: {sample['audio_path']}")
        print(f"  Text: {sample['text'][:80]}...")
        print(f"  Speaker: {sample['speaker_id']}")
        print(f"  Source: {sample['source']}")
    
    return dataset_dict

if __name__ == "__main__":
    dataset = create_unified_dataset()
    
    print("\n" + "="*60)
    print("🎯 PRÊT POUR FINETUNING WHISPER!")
    print("="*60)
