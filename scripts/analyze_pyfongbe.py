#!/usr/bin/env python3
"""Analyse dataset audio pyFongbe"""

import os
import wave
import json
from pathlib import Path

def get_wav_duration(wav_path):
    """Durée d'un fichier WAV en secondes"""
    try:
        with wave.open(str(wav_path), 'rb') as wav:
            frames = wav.getnframes()
            rate = wav.getframerate()
            return frames / float(rate)
    except:
        return 0

def analyze_pyfongbe():
    base = Path("/home/appolinaire/Projects/fongbe/data/raw/pyFongbe")
    
    print("🔊 ANALYSE pyFongbe Dataset")
    print("=" * 50)
    
    # Trouver tous les WAV
    wav_files = list(base.rglob("*.wav"))
    print(f"\n📄 Fichiers trouvés: {len(wav_files)}")
    
    # Calculer durée totale
    total_duration = 0
    valid_count = 0
    
    for i, wav in enumerate(wav_files):
        if i % 1000 == 0:
            print(f"   Analyse: {i}/{len(wav_files)}...", end='\r')
        
        duration = get_wav_duration(wav)
        if duration > 0:
            total_duration += duration
            valid_count += 1
    
    print(f"\n✅ Fichiers valides: {valid_count}")
    
    # Stats
    hours = total_duration / 3600
    avg_duration = total_duration / valid_count if valid_count > 0 else 0
    
    print(f"\n📊 STATISTIQUES")
    print(f"   Durée totale: {hours:.2f}h ({total_duration:.0f}s)")
    print(f"   Durée moyenne: {avg_duration:.2f}s")
    print(f"   Durée min estimée: {avg_duration * 0.5:.2f}s")
    print(f"   Durée max estimée: {avg_duration * 2:.2f}s")
    
    # Vérifier structure
    print(f"\n📁 STRUCTURE")
    for subset in ['train', 'dev', 'test']:
        subset_dir = base / 'data' / subset / 'wav'
        if subset_dir.exists():
            count = len(list(subset_dir.rglob("*.wav")))
            print(f"   {subset}: {count} fichiers")
    
    # Chercher transcriptions
    print(f"\n📝 TRANSCRIPTIONS")
    text_files = list(base.rglob("*.txt"))
    print(f"   Fichiers .txt trouvés: {len(text_files)}")
    
    for txt in text_files[:5]:
        print(f"   - {txt.relative_to(base)}")

if __name__ == "__main__":
    analyze_pyfongbe()
