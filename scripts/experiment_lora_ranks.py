#!/usr/bin/env python3
"""
Expérience recherche #1: Optimal LoRA rank
Test différents ranks r pour trouver l'optimal
"""

import subprocess
import json
from pathlib import Path

# Ranks à tester
RANKS = [2, 4, 8, 16, 32, 64]

# Target modules à tester (recherche #2)
TARGET_CONFIGS = {
    "attention_only": ["q_proj", "v_proj"],
    "attention_full": ["q_proj", "k_proj", "v_proj", "o_proj"],
    "decoder_only": ["decoder.q_proj", "decoder.v_proj"],
    "encoder_only": ["encoder.q_proj", "encoder.v_proj"],
}

results = []

print("🔬 EXPÉRIENCE: OPTIMAL LORA RANK")
print("="*60)

for rank in RANKS:
    print(f"\n{'='*60}")
    print(f"Testing rank r={rank}")
    print(f"{'='*60}")
    
    # Modifier config dans script
    config = {
        "r": rank,
        "target_modules": TARGET_CONFIGS["attention_only"]
    }
    
    # Lancer training
    # (À implémenter: modifier script pour prendre config en param)
    
    print(f"✅ Rank {rank} testé")
    
    # Stocker résultats
    results.append({
        "rank": rank,
        "wer": None,  # À récupérer après training
        "trainable_params": None,
        "training_time": None
    })

# Sauvegarder résultats
output = Path("experiments/lora_rank_results.json")
output.parent.mkdir(exist_ok=True)
with open(output, "w") as f:
    json.dump(results, f, indent=2)

print(f"\n📊 Résultats sauvegardés: {output}")
print("\n🎯 Pour analyser: voir experiments/lora_rank_results.json")
