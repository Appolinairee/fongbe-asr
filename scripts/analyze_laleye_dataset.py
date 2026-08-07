#!/usr/bin/env python3
"""
Script pour analyser le Fongbe Speech Dataset de Laleye (Zenodo)
Dataset téléchargé depuis: https://doi.org/10.5281/zenodo.6604637
"""

import pandas as pd
import os
from pathlib import Path
import wave
from collections import Counter

# Chemins
DATASET_ROOT = Path("/home/appolinaire/Projects/fongbe/data/raw/Fongbe_Speech_Dataset")
AUDIO_DIR = DATASET_ROOT / "fongbe_speech_audio_files"
METADATA_CSV = DATASET_ROOT / "fongbe_speech_dataset_metadata.csv"

def get_audio_duration(wav_file):
    """Obtenir la durée d'un fichier audio WAV en secondes"""
    try:
        with wave.open(str(wav_file), 'rb') as wf:
            frames = wf.getnframes()
            rate = wf.getframerate()
            duration = frames / float(rate)
            return duration
    except Exception as e:
        print(f"Erreur lecture {wav_file}: {e}")
        return 0

def analyze_dataset():
    """Analyse complète du dataset"""
    
    print("=" * 80)
    print("ANALYSE DATASET FONGBE SPEECH (LALEYE - ZENODO)")
    print("=" * 80)
    
    # 1. Lire les métadonnées
    if METADATA_CSV.exists():
        df = pd.read_csv(METADATA_CSV)
        print(f"\n📊 Métadonnées chargées: {len(df)} samples")
        print(f"Colonnes: {list(df.columns)}")
        
        # Distribution par speakers
        print("\n👥 Distribution par speakers:")
        speaker_counts = df['speaker ID'].value_counts()
        print(speaker_counts)
        
        # Distribution genre
        print("\n⚥ Distribution par genre:")
        print(df['gender'].value_counts())
        
        # Distribution âge
        print("\n🎂 Distribution par âge:")
        print(df['age'].describe())
        
        # Dialecte
        print("\n🗣️ Dialecte(s):")
        print(df['dialect'].value_counts())
    else:
        print(f"⚠️ Fichier metadata CSV non trouvé: {METADATA_CSV}")
        df = None
    
    # 2. Analyser les fichiers audio
    print("\n" + "=" * 80)
    print("ANALYSE FICHIERS AUDIO")
    print("=" * 80)
    
    wav_files = list((AUDIO_DIR / "wav").glob("*.wav")) if (AUDIO_DIR / "wav").exists() else []
    if not wav_files:
        # Essayer à la racine fongbe_speech_audio_files
        wav_files = list(AUDIO_DIR.rglob("*.wav"))
    
    print(f"\n🔊 Nombre de fichiers WAV trouvés: {len(wav_files)}")
    
    if len(wav_files) > 0:
        # Calculer durées (échantillon de 50 fichiers pour rapidité)
        sample_files = wav_files[:50] if len(wav_files) > 50 else wav_files
        print(f"Calcul durée sur échantillon de {len(sample_files)} fichiers...")
        
        durations = []
        for wav_file in sample_files:
            dur = get_audio_duration(wav_file)
            durations.append(dur)
        
        if durations:
            total_sample = sum(durations)
            avg_duration = total_sample / len(durations)
            
            # Estimer durée totale
            estimated_total_hours = (avg_duration * len(wav_files)) / 3600
            
            print(f"\n⏱️ Durée moyenne par sample: {avg_duration:.2f} secondes")
            print(f"📈 Durée totale estimée: {estimated_total_hours:.2f} heures")
            print(f"   ({estimated_total_hours * 60:.1f} minutes)")
    
    # 3. Analyser les transcriptions
    print("\n" + "=" * 80)
    print("ANALYSE TRANSCRIPTIONS")
    print("=" * 80)
    
    txt_files = list((AUDIO_DIR / "lab").glob("*.txt"))
    print(f"\n📝 Nombre de fichiers transcription: {len(txt_files)}")
    
    if len(txt_files) > 0:
        # Lire échantillon de transcriptions
        sample_txts = txt_files[:20]
        print(f"\n📖 Échantillon de {len(sample_txts)} transcriptions:")
        
        total_chars = 0
        for i, txt_file in enumerate(sample_txts, 1):
            try:
                with open(txt_file, 'r', encoding='utf-8') as f:
                    text = f.read().strip()
                    total_chars += len(text)
                    if i <= 3:
                        print(f"   [{i}] ({len(text)} chars): {text[:100]}...")
            except Exception as e:
                print(f"Erreur lecture {txt_file}: {e}")
        
        avg_chars = total_chars / len(sample_txts) if sample_txts else 0
        print(f"\n📏 Longueur moyenne transcription: {avg_chars:.1f} caractères")
    
    # 4. Structure du dataset
    print("\n" + "=" * 80)
    print("STRUCTURE DATASET")
    print("=" * 80)
    
    print(f"\n📁 Racine: {DATASET_ROOT}")
    print(f"📁 Audio: {AUDIO_DIR}")
    
    # Lister répertoires
    subdirs = [d for d in AUDIO_DIR.iterdir() if d.is_dir()]
    print(f"\n📂 Sous-répertoires ({len(subdirs)}):")
    for subdir in sorted(subdirs):
        file_count = len(list(subdir.glob("*")))
        print(f"   - {subdir.name}/  ({file_count} fichiers)")
    
    # 5. Statistiques finales
    print("\n" + "=" * 80)
    print("RÉSUMÉ")
    print("=" * 80)
    
    print(f"\n✅ Total samples (metadata): {len(df) if df is not None else 'N/A'}")
    print(f"✅ Total fichiers audio: {len(wav_files)}")
    print(f"✅ Total transcriptions: {len(txt_files)}")
    print(f"✅ Speakers uniques: {df['speaker ID'].nunique() if df is not None else 'N/A'}")
    
    if len(wav_files) > 0 and durations:
        print(f"✅ Durée totale estimée: ~{estimated_total_hours:.1f}h")
    
    print("\n" + "=" * 80)
    print("✨ Analyse terminée !")
    print("=" * 80)

if __name__ == "__main__":
    analyze_dataset()
