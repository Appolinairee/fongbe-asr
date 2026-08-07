# 🔄 Workflow Développement Fongbe ASR

## Architecture

```
LOCAL (dev)           GITHUB (sync code)        GOOGLE DRIVE (data persist)
    ↓                       ↓                             ↓
  Code                  Repository                   Dataset + Models
    ↓                       ↓                             ↓
  Push  ────────────→  Main branch  ←────────────  Colab pulls
                                                         ↓
                                                    GPU Training
                                                         ↓
                                                  Save to Drive
```

## Composants

### 1. **Code** (GitHub)
- Scripts training
- Notebooks Colab
- Configuration
- Documentation

**Exclus du repo:**
- `data/` (trop gros)
- `outputs/` (checkpoints)
- `.venv/`

### 2. **Data** (Google Drive)
- Dataset audio fongbe (13,581 samples)
- Checkpoints modèles
- Logs TensorBoard
- Résultats expériences

### 3. **Compute** (Google Colab)
- GPU gratuit (T4, 15GB)
- Pull code depuis GitHub
- Load data depuis Drive
- Save outputs vers Drive

---

## Setup Initial

### Local → GitHub

```bash
cd /home/appolinaire/Projects/fongbe

# 1. Créer repo GitHub (https://github.com/new)
# Nom: fongbe-asr

# 2. Push code
git remote add origin https://github.com/TON_USER/fongbe-asr.git
git branch -M main
git push -u origin main
```

### Local → Google Drive

```bash
# 1. Compresser dataset
tar -czf fongbe_dataset.tar.gz -C data/processed fongbe_asr_unified

# 2. Upload vers Drive (manuel)
# - Ouvrir drive.google.com
# - Créer dossier: fongbe-asr/
# - Upload fongbe_dataset.tar.gz

# Taille: ~510KB (compressé)
```

---

## Workflow Quotidien

### 1. Développement Local

```bash
# Modifier code
vim scripts/finetune_whisper.py

# Test local (CPU)
python scripts/finetune_whisper.py --dry-run

# Commit + push
git add scripts/finetune_whisper.py
git commit -m "feat: améliorer config LoRA"
git push
```

### 2. Training sur Colab

**Ouvrir `colab_training.ipynb` dans Colab:**

1. **Setup** (cellules 1-4)
   - Monte Drive
   - Pull code GitHub
   - Vérifie dataset

2. **Training** (cellule principale)
   - Lance `scripts/finetune_whisper.py`
   - Logs sauvegardés Drive automatiquement

3. **Download résultats** (optionnel)
   ```python
   # Déjà sur Drive, accessible après session
   ```

### 3. Sync résultats vers local

```bash
# Option A: Download manuel depuis Drive

# Option B: Utiliser rclone (si configuré)
rclone copy gdrive:fongbe-asr/outputs outputs/
```

---

## Structure Projet

```
fongbe/                          # Local + GitHub
├── scripts/
│   ├── finetune_whisper.py     # ✅ Git
│   └── experiment_lora_ranks.py
├── colab_training.ipynb         # ✅ Git (notebook)
├── TRAINING_GUIDE.md            # ✅ Git (doc)
├── requirements.txt             # ✅ Git
├── .gitignore                   # ✅ Git
└── data/                        # ❌ Git ignored
    └── processed/               # → Sur Drive seulement

fongbe-asr/ (Google Drive)
├── fongbe_dataset.tar.gz        # Dataset compressé
├── data/
│   └── processed/
│       └── fongbe_asr_unified/  # Dataset extrait
├── outputs/
│   └── whisper-fongbe/
│       ├── checkpoint-500/
│       ├── checkpoint-1000/
│       └── final/
└── scripts/                     # Sync depuis GitHub
```

---

## Avantages

✅ **Code versionné** (GitHub)
✅ **Data persistent** (Drive, pas reupload)
✅ **Training reproductible** (Colab + GPU)
✅ **Checkpoints sauvegardés** (Drive)
✅ **Pas de limite sessions** (reprend où on s'arrête)

---

## Commandes Utiles

### Compresser dataset
```bash
tar -czf fongbe_dataset.tar.gz -C data/processed fongbe_asr_unified
```

### Extraire dans Colab
```python
!tar -xzf /content/drive/MyDrive/fongbe-asr/fongbe_dataset.tar.gz \
     -C /content/drive/MyDrive/fongbe-asr/data/processed/
```

### Push code depuis local
```bash
git add -A
git commit -m "update: training config"
git push
```

### Pull dans Colab
```python
!git -C /content/drive/MyDrive/fongbe-asr pull
```

---

## Troubleshooting

### Dataset introuvable dans Colab
```python
# Vérifier chemin
!ls /content/drive/MyDrive/fongbe-asr/data/processed/

# Si vide, extraire archive
!tar -xzf /content/drive/MyDrive/fongbe-asr/fongbe_dataset.tar.gz \
     -C /content/drive/MyDrive/fongbe-asr/data/processed/
```

### Code pas à jour dans Colab
```python
# Force pull
!git -C /content/drive/MyDrive/fongbe-asr reset --hard
!git -C /content/drive/MyDrive/fongbe-asr pull
```

### Session Colab expirée
- Checkpoints déjà sur Drive ✅
- Relancer cellules setup
- Training reprend depuis dernier checkpoint

---

## Next Steps

1. ✅ Push code vers GitHub
2. ✅ Upload dataset vers Drive
3. 🔄 Ouvrir `colab_training.ipynb` dans Colab
4. 🔄 Run training
5. 🔄 Analyser résultats
