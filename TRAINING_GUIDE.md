# 🔬 Finetuning Whisper Fongbe - Guide

## Scripts créés

### 1. `finetune_whisper.py` - Training principal
```bash
python scripts/finetune_whisper.py
```

**Configuration actuelle :**
- Modèle : `whisper-small` (244M params)
- LoRA rank : r=8
- Target modules : `q_proj`, `v_proj`
- Epochs : 3
- Batch size : 8 × 2 (gradient accumulation)

**Output :** `outputs/whisper-fongbe-lora/`

---

### 2. `experiment_lora_ranks.py` - Recherche optimal rank
Test différents ranks pour trouver l'optimal.

```bash
python scripts/experiment_lora_ranks.py
```

**Tests :** r ∈ {2, 4, 8, 16, 32, 64}

---

## Questions de recherche

### ✅ Implémentées

**Q1 : Optimal rank**
- Script : `experiment_lora_ranks.py`
- Mesures : WER, params, temps training
- Analyse : Courbe WER vs rank

**Q2 : Target modules**
- Configs testées :
  - `attention_only` : q_proj, v_proj
  - `attention_full` : q_proj, k_proj, v_proj, o_proj
  - `decoder_only` : Seulement decoder
  - `encoder_only` : Seulement encoder

### 🔄 À implémenter

**Q3 : Few-shot learning**
- Tester avec 10%, 25%, 50%, 100% données
- Mesurer courbe d'apprentissage

**Q4 : Multilingual bridging**
- Initialiser avec checkpoint yoruba/igbo
- Comparer vs init standard

**Q5 : Phonetic priors**
- Injecter embeddings tons fongbe
- Architecture custom pour langues tonales

---

## Lancer training

### Prérequis
- GPU 12GB+ VRAM (recommandé)
- Python 3.8+
- Dataset préparé : `data/processed/fongbe_asr_unified/`

### Commande
```bash
cd /home/appolinaire/Projects/fongbe
source .venv/bin/activate
python scripts/finetune_whisper.py
```

### Monitoring
```bash
# TensorBoard
tensorboard --logdir outputs/whisper-fongbe-lora/runs
```

---

## Résultats attendus

**Baseline (12.22h données) :**
- WER : 20-40%
- Training : 3-6h GPU
- Modèle final : ~10MB (LoRA adapters)

**Bon modèle :**
- WER : 10-20%
- Besoin : Plus de données (30h+) ou meilleure architecture

---

## Modifications recherche

### Changer rank
```python
# Dans finetune_whisper.py, ligne 22
LORA_CONFIG = {
    "r": 16,  # Modifier ici
    ...
}
```

### Changer target modules
```python
# Ligne 24
"target_modules": ["q_proj", "k_proj", "v_proj", "o_proj"],
```

### Utiliser modèle plus grand
```python
# Ligne 15
MODEL_NAME = "openai/whisper-medium"  # 769M params, besoin 24GB GPU
```

---

## Analyse post-training

### SVD Analysis (optimal rank)
```python
# Après full finetuning
import torch

W_pretrained = torch.load("pretrained_weights.pt")
W_finetuned = torch.load("finetuned_weights.pt")

ΔW = W_finetuned - W_pretrained
U, S, V = torch.svd(ΔW)

# Plot singular values
import matplotlib.pyplot as plt
plt.plot(S.cpu().numpy())
plt.xlabel("Rank")
plt.ylabel("Singular Value")
plt.title("Spectrum singulier - Intrinsic rank")
plt.savefig("analysis/singular_spectrum.png")
```

---

## Prochaines étapes

1. ✅ Training baseline (r=8)
2. 📊 Évaluer WER test
3. 🔬 Expériences ranks
4. 📈 Analyse résultats
5. 📝 Paper si résultats intéressants
