#!/usr/bin/env python3
"""Audit complet de TOUTES les données fongbe"""

from pathlib import Path
import wave

def get_wav_duration(path):
    try:
        with wave.open(str(path), 'rb') as w:
            return w.getnframes() / w.getframerate()
    except:
        return 0

def analyze_audio_dataset(name, path):
    """Analyse un dataset audio"""
    p = Path(path)
    if not p.exists():
        return None
    
    wavs = list(p.rglob("*.wav"))
    mp3s = list(p.rglob("*.mp3"))
    audio_files = wavs + mp3s
    
    if not audio_files:
        return None
    
    print(f"\n{'='*60}")
    print(f"📦 {name}")
    print(f"{'='*60}")
    print(f"📁 Path: {path}")
    print(f"🔊 Fichiers: {len(audio_files)} ({len(wavs)} WAV, {len(mp3s)} MP3)")
    
    # Sample durées (pas tout pour aller vite)
    sample_size = min(100, len(wavs))
    if sample_size > 0:
        durations = [get_wav_duration(w) for w in wavs[:sample_size]]
        avg_duration = sum(durations) / len(durations) if durations else 0
        total_estimated = (avg_duration * len(audio_files)) / 3600
        print(f"⏱️  Durée estimée: {total_estimated:.2f}h")
        print(f"📊 Moyenne/sample: {avg_duration:.2f}s")
    
    # Chercher transcriptions
    txt_files = list(p.rglob("*.txt"))
    csv_files = list(p.rglob("*.csv"))
    tsv_files = list(p.rglob("*.tsv"))
    
    if txt_files or csv_files or tsv_files:
        print(f"📝 Transcriptions: {len(txt_files)} TXT, {len(csv_files)} CSV, {len(tsv_files)} TSV")
    
    return {
        'name': name,
        'audio_count': len(audio_files),
        'duration_hours': total_estimated if sample_size > 0 else 0
    }

def analyze_text_dataset(name, path):
    """Analyse un dataset texte"""
    p = Path(path)
    if not p.exists():
        return None
    
    txt_files = list(p.rglob("*.txt"))
    csv_files = list(p.rglob("*.csv"))
    tsv_files = list(p.rglob("*.tsv"))
    json_files = list(p.rglob("*.json"))
    
    all_files = txt_files + csv_files + tsv_files + json_files
    if not all_files:
        return None
    
    print(f"\n{'='*60}")
    print(f"📝 {name}")
    print(f"{'='*60}")
    print(f"📁 Path: {path}")
    print(f"📄 Fichiers: {len(txt_files)} TXT, {len(csv_files)} CSV, {len(json_files)} JSON")
    
    # Estimer nombre de lignes
    total_lines = 0
    for f in csv_files[:3]:  # Sample
        try:
            lines = len(open(f, 'r', encoding='utf-8', errors='ignore').readlines())
            total_lines += lines
            print(f"   {f.name}: {lines:,} lignes")
        except:
            pass
    
    return {
        'name': name,
        'file_count': len(all_files),
        'estimated_lines': total_lines
    }

def main():
    base = Path("/home/appolinaire/Projects/fongbe")
    
    print("🔍 AUDIT COMPLET DONNÉES FONGBE")
    print("="*60)
    
    # DATASETS AUDIO
    print("\n\n🔊 DATASETS AUDIO")
    print("="*60)
    
    audio_datasets = [
        ("Laleye Zenodo", "data/raw/Fongbe_Speech_Dataset"),
        ("pyFongbe", "data/raw/pyFongbe"),
        ("Professor HF", "data/raw/professor_fongbe_speech"),
        ("godwinh ASR", "data/raw/godwinh_fongbe-asr"),
    ]
    
    audio_stats = []
    for name, path in audio_datasets:
        stat = analyze_audio_dataset(name, base / path)
        if stat:
            audio_stats.append(stat)
    
    # DATASETS TEXTE
    print("\n\n📝 DATASETS TEXTE")
    print("="*60)
    
    text_datasets = [
        ("FFR v1", "data/raw/ffr-v1"),
        ("FFR v1 extra", "data/raw/ffr-v1-extra"),
        ("kaith HF", "data/raw/kaith_dataset_fongbe"),
        ("masakhane-mt", "data/raw/masakhane-mt"),
        ("Collecte locale", "collecte"),
    ]
    
    text_stats = []
    for name, path in text_datasets:
        stat = analyze_text_dataset(name, base / path)
        if stat:
            text_stats.append(stat)
    
    # RÉSUMÉ FINAL
    print("\n\n" + "="*60)
    print("📊 RÉSUMÉ FINAL")
    print("="*60)
    
    total_audio_hours = sum(s['duration_hours'] for s in audio_stats)
    total_audio_files = sum(s['audio_count'] for s in audio_stats)
    
    print(f"\n🔊 AUDIO TOTAL:")
    print(f"   {total_audio_hours:.2f} heures")
    print(f"   {total_audio_files:,} fichiers")
    print(f"\nDétail par dataset:")
    for s in audio_stats:
        print(f"   • {s['name']}: {s['duration_hours']:.2f}h ({s['audio_count']} fichiers)")
    
    print(f"\n📝 TEXTE TOTAL:")
    total_text_files = sum(s['file_count'] for s in text_stats)
    print(f"   {total_text_files} fichiers")
    for s in text_stats:
        print(f"   • {s['name']}: {s['file_count']} fichiers")

if __name__ == "__main__":
    main()
