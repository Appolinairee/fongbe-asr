#!/bin/bash
# Script de téléchargement automatique MASSIF - Datasets Fongbe
# Pompe TOUT ce qui est accessible directement

set -e
BASE_DIR="/home/appolinaire/Projects/fongbe/data/raw"
mkdir -p "$BASE_DIR"
cd "$BASE_DIR"

echo "🚀 POMPAGE MASSIF FONGBE - Téléchargement automatique"
echo "======================================================="

# ============================================================================
# HUGGING FACE DATASETS
# ============================================================================
echo -e "\n📦 HUGGING FACE DATASETS"
echo "========================"

HF_DATASETS=(
    "masakhane/mafand"
    "masakhane/lafand"
    "Sunbird/salt"
    "facebook/flores"
)

for dataset in "${HF_DATASETS[@]}"; do
    dir_name=$(echo "$dataset" | tr '/' '_')
    if [ -d "$dir_name" ]; then
        echo "⏭️  Skip: $dataset (existe déjà)"
    else
        echo "🔽 Téléchargement: $dataset"
        git clone "https://huggingface.co/datasets/$dataset" "$dir_name" 2>&1 | grep -v "Cloning" || true
    fi
done

# ============================================================================
# OPUS-MT CORPORA (via API)
# ============================================================================
echo -e "\n📦 OPUS CORPORA"
echo "==============="

OPUS_PAIRS=(
    "fon-fr"
    "fon-en"
)

mkdir -p opus_corpora
cd opus_corpora

for pair in "${OPUS_PAIRS[@]}"; do
    echo "🔽 OPUS: $pair"
    # Télécharger via OPUS API
    wget -q --timeout=30 -O "${pair}.txt.gz" \
        "https://opus.nlpl.eu/download.php?f=GlobalVoices/v2018q4/moses/${pair}.txt.zip" 2>/dev/null || \
        echo "   ⚠️  Pas de données OPUS pour $pair"
done

cd "$BASE_DIR"

# ============================================================================
# GITHUB REPOS
# ============================================================================
echo -e "\n📦 GITHUB REPOSITORIES"
echo "======================"

declare -A GITHUB_REPOS=(
    ["https://github.com/bonaventuredossou/ffr-v1.git"]="ffr-v1-extra"
    ["https://github.com/masakhane-io/masakhane-mt.git"]="masakhane-mt"
    ["https://github.com/dossvi/NLP-on-Fon.git"]="nlp-fon"
    ["https://github.com/laleye/pyFongbe.git"]="pyFongbe"
)

for url in "${!GITHUB_REPOS[@]}"; do
    dir="${GITHUB_REPOS[$url]}"
    
    if [ -d "$dir" ]; then
        echo "⏭️  Skip: $dir (existe déjà)"
    else
        echo "🔽 Git clone: $dir"
        git clone --depth 1 "$url" "$dir" 2>&1 | grep -v "Cloning" || true
    fi
done

# ============================================================================
# ZENODO DATASETS
# ============================================================================
echo -e "\n📦 ZENODO DATASETS"
echo "=================="

# Laleye dataset (déjà téléchargé normalement)
if [ ! -d "Fongbe_Speech_Dataset" ]; then
    echo "🔽 Laleye Fongbe Speech Dataset"
    wget -q --show-progress -O fongbe_speech.zip \
        "https://zenodo.org/records/6604637/files/Fongbe_Speech_Dataset.zip?download=1"
    unzip -q fongbe_speech.zip
    rm fongbe_speech.zip
else
    echo "⏭️  Skip: Laleye dataset (existe déjà)"
fi

# ============================================================================
# BIBLE DATASETS
# ============================================================================
echo -e "\n📦 BIBLE PARALLEL CORPORA"
echo "========================="

mkdir -p bible_corpora
cd bible_corpora

# Bible.com fongbe
echo "🔽 Bible Fongbe (Christodora)"
wget -q --timeout=30 -O fon_christodora.txt \
    "https://raw.githubusercontent.com/christos-c/bible-corpus/master/bibles/Fongbe.xml" 2>/dev/null || \
    echo "   ⚠️  Échec téléchargement Bible"

# Parallel Bible Corpus
echo "🔽 Parallel Bible Corpus"
wget -q --timeout=30 -O parallel_bible_fon.txt \
    "https://github.com/christos-c/bible-corpus/raw/master/bibles/Fongbe.xml" 2>/dev/null || \
    echo "   ⚠️  Échec"

cd "$BASE_DIR"

# ============================================================================
# TATOEBA
# ============================================================================
echo -e "\n📦 TATOEBA SENTENCES"
echo "===================="

mkdir -p tatoeba
cd tatoeba

echo "🔽 Tatoeba Fon sentences"
wget -q --timeout=30 -O fon_sentences.csv \
    "https://downloads.tatoeba.org/exports/per_language/fon/fon_sentences.tsv.bz2" 2>/dev/null && \
    bunzip2 -f fon_sentences.csv 2>/dev/null || \
    echo "   ⚠️  Pas de données Tatoeba fon"

cd "$BASE_DIR"

# ============================================================================
# CMU WILDERNESS (si disponible)
# ============================================================================
echo -e "\n📦 CMU WILDERNESS"
echo "================="

mkdir -p cmu_wilderness
cd cmu_wilderness

echo "🔽 CMU Wilderness Fongbe"
wget -q --timeout=30 -O fon_wilderness.tar.gz \
    "http://festvox.org/cmu_wilderness/packed/fon_wiki.tar.gz" 2>/dev/null && \
    tar -xzf fon_wilderness.tar.gz 2>/dev/null || \
    echo "   ⚠️  CMU Wilderness non disponible"

cd "$BASE_DIR"

# ============================================================================
# STATISTIQUES FINALES
# ============================================================================
echo -e "\n📊 STATISTIQUES FINALES"
echo "======================="

total_size=$(du -sh "$BASE_DIR" | cut -f1)
file_count=$(find "$BASE_DIR" -type f | wc -l)
audio_count=$(find "$BASE_DIR" -name "*.wav" -o -name "*.mp3" | wc -l)
text_count=$(find "$BASE_DIR" -name "*.txt" -o -name "*.csv" | wc -l)

echo "📁 Emplacement: $BASE_DIR"
echo "💾 Taille totale: $total_size"
echo "📄 Fichiers totaux: $file_count"
echo "🔊 Fichiers audio: $audio_count"
echo "📝 Fichiers texte: $text_count"

echo -e "\n✨ TÉLÉCHARGEMENT TERMINÉ!"
