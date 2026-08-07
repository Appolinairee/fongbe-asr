# 🚀 Guide Training Whisper sur Google Colab

## Option 1 : Via Notebook (RECOMMANDÉ)

### Étapes
1. **Ouvrir** : https://colab.research.google.com
2. **Upload notebook** : `colab_training.ipynb`
3. **Runtime** → Change runtime type → **GPU (T4)**
4. **Exécuter cellules** une par une

### Upload dataset (2 options)

**A. Via Google Drive** (si dataset < 15GB) :
```python
# Dans Colab, cellule 1
from google.colab import drive
drive.mount('/content/drive')

# Upload depuis local vers Drive d'abord
# Puis dans Colab:
!cp -r /content/drive/MyDrive/fongbe_data .
```

**B. Direct upload** (plus lent) :
```python
from google.colab import files
uploaded = files.upload()  # Sélectionner fichier ZIP
!unzip dataset.zip
```

---

## Option 2 : Via SSH/Terminal vers Colab

### Installation colab-ssh
```bash
# Sur ta machine locale
pip install colab-ssh

# Puis dans notebook Colab
!pip install colab-ssh
from colab_ssh import launch_ssh
launch_ssh(password='ton_mdp')
```

### Se connecter
```bash
# Depuis ton terminal local
ssh root@colab_ip
# Puis accès terminal Colab
```

**Limitation** : Nécessite ngrok (gratuit mais setup complexe)

---

## Option 3 : CLI avec Kaggle (Alternative)

Kaggle = plus facile via CLI

```bash
# Installer
pip install kaggle

# Config API token
# Télécharger depuis kaggle.com/settings
mkdir -p ~/.kaggle
mv kaggle.json ~/.kaggle/

# Créer kernel/notebook
kaggle kernels push -p ./notebook

# Monitoring
kaggle kernels status YOUR_KERNEL
```

---

## 🎯 Recommandation

**Pour toi : Option 1 (Notebook Colab)**

**Pourquoi :**
- ✅ Le plus simple
- ✅ Interface web
- ✅ GPU gratuit T4 (15GB)
- ✅ Pas de setup SSH compliqué

**Process :**
1. Compresser dataset local
```bash
cd /home/appolinaire/Projects/fongbe
zip -r fongbe_data.zip data/processed/fongbe_asr_unified
```

2. Upload vers Google Drive (ou direct dans Colab)

3. Ouvrir `colab_training.ipynb` dans Colab

4. Run cells

**Temps total : 4-7h**

---

## ⚠️ Limitations Colab gratuit

- Session 12h max
- Disconnect après inactivité
- GPU T4 (15GB VRAM)

**Solutions :**
- Sauvegarder checkpoints vers Drive régulièrement
- Colab Pro ($10/mois) : 24h sessions

---

## 📦 Préparer dataset pour upload

```bash
cd /home/appolinaire/Projects/fongbe

# Compresser (déjà fait si dataset HF)
tar -czf fongbe_asr_dataset.tar.gz data/processed/fongbe_asr_unified

# Taille
ls -lh fongbe_asr_dataset.tar.gz
```

Upload ce fichier vers Google Drive, puis utilise dans Colab.
