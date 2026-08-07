#!/usr/bin/env python3
"""Vérification exhaustive: Laleye vs pyFongbe - doublons potentiels"""

from pathlib import Path
import wave
import hashlib

def get_audio_hash(wav_path, sample_size=1000):
    """Hash partiel audio pour détecter doublons"""
    try:
        with wave.open(str(wav_path), 'rb') as w:
            frames = w.readframes(sample_size)
            return hashlib.md5(frames).hexdigest()
    except:
        return None

def analyze_datasets():
    base = Path("/home/appolinaire/Projects/fongbe/data/raw")
    
    print("🔍 ANALYSE DOUBLONS LALEYE vs PYFONGBE")
    print("="*60)
    
    # Laleye
    laleye_dir = base / "Fongbe_Speech_Dataset/fongbe_speech_audio_files/wav"
    laleye_wavs = list(laleye_dir.glob("*.wav"))
    
    # pyFongbe
    pyfongbe_dir = base / "pyFongbe/data"
    pyfongbe_wavs = list(pyfongbe_dir.rglob("*.wav"))
    
    print(f"\n📊 STATS:")
    print(f"   Laleye: {len(laleye_wavs)} fichiers")
    print(f"   pyFongbe: {len(pyfongbe_wavs)} fichiers")
    
    # Vérifier durées
    print(f"\n⏱️  DURÉES:")
    
    def get_duration(wav):
        try:
            with wave.open(str(wav), 'rb') as w:
                return w.getnframes() / w.getframerate()
        except:
            return 0
    
    laleye_durations = [get_duration(w) for w in laleye_wavs[:100]]
    pyfongbe_durations = [get_duration(w) for w in pyfongbe_wavs[:100]]
    
    laleye_avg = sum(laleye_durations) / len(laleye_durations)
    pyfongbe_avg = sum(pyfongbe_durations) / len(pyfongbe_durations)
    
    print(f"   Laleye moy: {laleye_avg:.2f}s")
    print(f"   pyFongbe moy: {pyfongbe_avg:.2f}s")
    
    # Vérifier hashes (sample)
    print(f"\n🔑 HASH CHECK (100 samples):")
    laleye_hashes = {}
    for wav in laleye_wavs[:100]:
        h = get_audio_hash(wav)
        if h:
            laleye_hashes[h] = wav.name
    
    pyfongbe_hashes = {}
    duplicates = []
    for wav in pyfongbe_wavs[:100]:
        h = get_audio_hash(wav)
        if h:
            pyfongbe_hashes[h] = wav.name
            if h in laleye_hashes:
                duplicates.append((laleye_hashes[h], wav.name))
    
    if duplicates:
        print(f"   ⚠️  {len(duplicates)} doublons détectés!")
        for l, p in duplicates[:5]:
            print(f"      {l} == {p}")
    else:
        print(f"   ✅ Aucun doublon détecté")
    
    # Structure transcriptions
    print(f"\n📝 TRANSCRIPTIONS:")
    
    # Laleye
    laleye_txt = base / "Fongbe_Speech_Dataset/fongbe_speech_audio_files/lab"
    laleye_txts = list(laleye_txt.glob("*.txt"))
    print(f"   Laleye: {len(laleye_txts)} fichiers .txt")
    
    # pyFongbe
    pyfongbe_text = base / "pyFongbe/data/train/text"
    if pyfongbe_text.exists():
        lines = open(pyfongbe_text).readlines()
        print(f"   pyFongbe: {len(lines)} lignes dans 'text'")
    
    # Format transcription
    print(f"\n📄 FORMAT:")
    print(f"   Laleye: 1 fichier TXT par audio")
    print(f"   pyFongbe: 1 fichier 'text' (Kaldi format)")
    
    # Conclusion
    print(f"\n✅ CONCLUSION:")
    if len(duplicates) == 0:
        print(f"   → Datasets INDÉPENDANTS")
        print(f"   → Peuvent être COMBINÉS")
        print(f"   → Total: {len(laleye_wavs) + len(pyfongbe_wavs)} samples")
    else:
        print(f"   → {len(duplicates)} doublons à filtrer")
        print(f"   → Vérification complète nécessaire")

if __name__ == "__main__":
    analyze_datasets()
