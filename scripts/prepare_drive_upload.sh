#!/bin/bash
# Script pour préparer et uploader dataset vers Google Drive

set -e

PROJECT_ROOT="/home/appolinaire/Projects/fongbe"
DATASET_DIR="$PROJECT_ROOT/data/processed/fongbe_asr_unified"
OUTPUT_FILE="$PROJECT_ROOT/fongbe_dataset.tar.gz"

echo "📦 Compression dataset..."
cd "$PROJECT_ROOT"
tar -czf "$OUTPUT_FILE" -C data/processed fongbe_asr_unified

echo ""
echo "✅ Dataset compressé: $OUTPUT_FILE"
ls -lh "$OUTPUT_FILE"

echo ""
echo "📤 INSTRUCTIONS UPLOAD VERS GOOGLE DRIVE:"
echo ""
echo "1. Ouvrir https://drive.google.com"
echo "2. Créer dossier: fongbe-asr/"
echo "3. Upload fongbe_dataset.tar.gz dans ce dossier"
echo ""
echo "4. Dans Colab, après avoir monté Drive:"
echo "   !cd /content/drive/MyDrive/fongbe-asr"
echo "   !tar -xzf fongbe_dataset.tar.gz -C data/processed/"
echo ""
echo "Ou utiliser cette commande complète dans Colab:"
echo "---"
cat << 'EOF'
# Extraire dataset depuis Drive
from pathlib import Path
import subprocess

DATA_ROOT = Path('/content/drive/MyDrive/fongbe-asr/data/processed')
DATA_ROOT.mkdir(parents=True, exist_ok=True)

archive = Path('/content/drive/MyDrive/fongbe-asr/fongbe_dataset.tar.gz')
if archive.exists():
    print("📦 Extraction dataset...")
    subprocess.run(['tar', '-xzf', str(archive), '-C', str(DATA_ROOT.parent)], check=True)
    print("✅ Dataset extrait")
else:
    print(f"❌ Archive introuvable: {archive}")
EOF
