#!/usr/bin/env python3
"""
Script pour télécharger TOUS les datasets fongbe disponibles
Stratégie: Pomper un maximum de données pour maximiser le corpus
"""

import os
from pathlib import Path
import subprocess

# Configuration
DATA_DIR = Path("/home/appolinaire/Projects/fongbe/data/raw")
DATA_DIR.mkdir(parents=True, exist_ok=True)

print("=" * 80)
print("🚀 POMPAGE MASSIF DE DONNÉES FONGBE")
print("=" * 80)

# ============================================================================
# 1. DATASETS HUGGING FACE (via git)
# ============================================================================
print("\n📦 PARTIE 1: DATASETS HUGGING FACE")
print("=" * 80)

HF_DATASETS = [
    ("godwinh/fongbe-asr", "godwinh_fongbe-asr"),
    ("kaith/dataset_fongbe", "kaith_dataset_fongbe"),
]

for dataset_name, dir_name in HF_DATASETS:
    print(f"\n🔽 Téléchargement: {dataset_name}")
    output_dir = DATA_DIR / dir_name
    
    if output_dir.exists():
        print(f"   ⚠️ Déjà existant: {output_dir}")
    else:
        print(f"   Destination: {output_dir}")
        try:
            url = f"https://huggingface.co/datasets/{dataset_name}"
            result = subprocess.run(
                ["git", "clone", url, str(output_dir)],
                capture_output=True,
                text=True
            )
            if result.returncode == 0:
                print(f"   ✅ Cloné avec succès!")
            else:
                print(f"   ❌ Erreur: {result.stderr[:200]}")
        except Exception as e:
            print(f"   ❌ Erreur: {e}")

# ============================================================================
# 2. GITHUB REPOSITORIES
# ============================================================================
print("\n\n📦 PARTIE 2: REPOSITORIES GITHUB")
print("=" * 80)

GITHUB_REPOS = [
    {
        "name": "FFR v1 (Corpus Fon-Français)",
        "url": "https://github.com/bonaventuredossou/ffr-v1.git",
        "dir": "ffr-v1"
    },
]

for repo in GITHUB_REPOS:
    print(f"\n🔽 Clonage: {repo['name']}")
    output_dir = DATA_DIR / repo['dir']
    
    if output_dir.exists():
        print(f"   ⚠️ Déjà existant: {output_dir}")
    else:
        print(f"   Destination: {output_dir}")
        try:
            result = subprocess.run(
                ["git", "clone", repo['url'], str(output_dir)],
                capture_output=True,
                text=True
            )
            if result.returncode == 0:
                print(f"   ✅ Cloné avec succès!")
            else:
                print(f"   ❌ Erreur: {result.stderr[:200]}")
        except Exception as e:
            print(f"   ❌ Erreur: {e}")

# ============================================================================
# 3. DATASETS LOCAUX DÉJÀ PRÉSENTS
# ============================================================================
print("\n\n📦 PARTIE 3: VÉRIFICATION DATASETS LOCAUX")
print("=" * 80)

base_path = Path("/home/appolinaire/Projects/fongbe")
LOCAL_DIRS = [
    "collecte/fon-fr.txt",
    "collecte/4432712",
    "collecte/4266935",
    "collecte/App \"Dictionnaire Fongbé-Français_2.1.0\"",
    "radio nlp",
    "data/raw/Fongbe_Speech_Dataset",
]

for local_dir in LOCAL_DIRS:
    full_path = base_path / local_dir
    if full_path.exists():
        if full_path.is_dir():
            file_count = len(list(full_path.rglob("*")))
            size = sum(f.stat().st_size for f in full_path.rglob("*") if f.is_file())
            print(f"   ✅ {local_dir}: {file_count} fichiers ({size/(1024**2):.1f} MB)")
        else:
            print(f"   ✅ {local_dir}: fichier présent")
    else:
        print(f"   ❌ {local_dir}: NON TROUVÉ")

# ============================================================================
# RÉSUMÉ FINAL
# ============================================================================
print("\n\n" + "=" * 80)
print("📊 RÉSUMÉ DU POMPAGE")
print("=" * 80)

# Compter tous les fichiers dans data/raw
total_size = 0
file_counts = {}

for item in DATA_DIR.rglob("*"):
    if item.is_file():
        try:
            total_size += item.stat().st_size
            ext = item.suffix.lower()
            file_counts[ext] = file_counts.get(ext, 0) + 1
        except:
            pass

print(f"\n📁 Emplacement: {DATA_DIR}")
print(f"💾 Taille totale: {total_size / (1024**3):.2f} GB")
print(f"📄 Fichiers par type:")
for ext, count in sorted(file_counts.items(), key=lambda x: -x[1])[:10]:
    print(f"   {ext or '(sans ext)'}: {count}")

print("\n✨ POMPAGE TERMINÉ!")
print("=" * 80)
