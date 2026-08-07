# 🗣️ ASR Fongbe - Automatic Speech Recognition

**Finetuning Whisper pour la langue fongbe (Bénin)**

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

---

## 📊 Dataset

- **13,581 samples** audio + transcription fongbe
- **12.22h** audio total
- Sources: Laleye Zenodo + pyFongbe
- Splits: 80% train / 10% val / 10% test

## 🚀 Quick Start

### Local (si GPU)
```bash
git clone https://github.com/TON_USER/fongbe.git
cd fongbe
python -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
python scripts/finetune_whisper.py
```

### Google Colab (GPU gratuit)
```python
# Dans Colab
!git clone https://github.com/TON_USER/fongbe.git
%cd fongbe

# Monter Drive (dataset)
from google.colab import drive
drive.mount('/content/drive')
!cp -r /content/drive/MyDrive/fongbe_data data/processed/

# Run training
!python scripts/finetune_whisper.py
```

**OU** utiliser notebook: `colab_training.ipynb`

---

## 📁 Structure

```
fongbe/
├── data/
│   └── processed/fongbe_asr_unified/  # Dataset (à télécharger)
├── scripts/
│   ├── finetune_whisper.py           # Training principal
│   ├── experiment_lora_ranks.py      # Expériences recherche
│   └── prepare_dataset_hf.py         # Data preprocessing
├── skills/                            # AI research skills
├── colab_training.ipynb               # Notebook Colab
└── TRAINING_GUIDE.md                  # Documentation
```

---

## 🔬 Recherche

**Questions explorées :**
1. Optimal LoRA rank (r ∈ {2,4,8,16,32,64})
2. Target modules (encoder vs decoder)
3. Few-shot learning (faibles ressources)

Voir `TRAINING_GUIDE.md` pour détails.

---

## 🎯 Résultats attendus

- **Baseline WER**: 20-40%
- **Training time**: 3-6h (GPU T4)
- **Modèle final**: ~10MB (LoRA adapters)

---

## 📦 Dataset Download

**Option 1: Google Drive**
```bash
# Depuis projet GitHub
rclone copy gdrive:fongbe_data data/processed/fongbe_asr_unified
```

**Option 2: HuggingFace** (si publié)
```python
from datasets import load_dataset
dataset = load_dataset("TON_USER/fongbe-asr")
```

---

## 📚 Citation

```bibtex
@misc{fongbe-asr-2026,
  title={Fongbe Automatic Speech Recognition with Low-Resource Fine-tuning},
  author={Votre Nom},
  year={2026},
  url={https://github.com/TON_USER/fongbe}
}
```

---

## 📝 License

MIT License - voir [LICENSE](LICENSE)

---

## 🤝 Acknowledgments

- Dataset Laleye: [Zenodo](https://doi.org/10.5281/zenodo.6604637)
- pyFongbe: [GitHub](https://github.com/laleye/pyFongbe)
- Whisper: [OpenAI](https://github.com/openai/whisper)
