# Configuration Agent AI - Projet Voice LLM Fongbe

## 🎯 Contexte du Projet

**Projet** : Voice LLM pour la langue fongbe (langue à faibles ressources)

**Approche** : 
- Recherche approfondie (papers, état de l'art)
- Ingénierie de données rigoureuse
- Modélisation scientifique avec suivi strict
- TDD, clean code, évolutivité

**Stack** : Python 3.10+, PyTorch, Transformers, Librosa, Poetry

---

## 📚 Skills Disponibles

Le projet dispose de **47+ skills** organisées en 6 catégories dans `/skills/` :

### 1. Engineering (17 skills)
- TDD, Code Quality, Debugging, Documentation
- Git Workflow, CI/CD, Planning
- API Design, Performance, Security
- Styles spécialisés (zero-hallucination, karpathy)

### 2. Research (4 skills)
- Autoresearch (papers), Paper Writing
- Research Ideation, Evaluation Frameworks

### 3. ML Engineering (6 skills)
- Architecture, Training, Fine-tuning
- Post-training, Optimization, MLOps

### 4. Data (6 skills)
- Processing, Tokenization, Quality
- Audio (Whisper, Audiocraft)

### 5. Testing (2 skills)
- Pytest, Testing Conventions

### 6. Workflow (7 skills)
- Planning, Execution, Subagent Development
- Verification, Brainstorming, Git Worktrees

**Voir `/skills/README.md` pour le détail complet**

---

## 🎨 Directives de Développement

### Priorités

1. **Qualité > Vitesse** - Code propre, testé, documenté
2. **Recherche d'abord** - Comprendre l'état de l'art avant d'implémenter
3. **Data-centric** - Focus sur la qualité et l'ingénierie des données
4. **Scientifique** - Tout est mesurable, reproductible, documenté
5. **Itératif** - Petits incréments, validation continue

### Méthodologie

- **TDD systématique** : Tests avant code (`skills/engineering/tdd/`)
- **Code Review** : Auto-review avec `skills/engineering/code-quality/`
- **Documentation continue** : ADRs pour chaque décision (`skills/engineering/documentation/`)
- **Planning structuré** : Décomposition avant implémentation (`skills/workflow/writing-plans/`)
- **Vérification finale** : Checklist avant completion (`skills/workflow/verification/`)

### Style de Code

- **Karpathy-style** préféré : Simple, from scratch, compréhensible (`skills/engineering/karpathy-style/`)
- **Zero hallucination** : Vérification des faits, pas d'invention (`skills/engineering/zero-hallucination/`)
- **Clean code** : Simplification continue (`skills/engineering/code-simplification/`)

---

## 🔬 Workflow de Recherche

### Phase Exploration
```
1. Autoresearch (skills/research/autoresearch/)
   - Recherche de papers pertinents
   - Analyse de l'état de l'art
   
2. Ideation (skills/research/ideation/)
   - Brainstorming structuré
   - Identification des gaps
   
3. Data Audit (skills/data/quality/)
   - Inventaire des données existantes
   - Évaluation de la qualité
```

### Phase Data Engineering
```
1. Data Processing (skills/data/processing/)
   - Pipeline de traitement
   - Nettoyage, normalisation
   
2. Tokenization (skills/data/tokenization/)
   - Tokenizer adapté au fongbe
   - Gestion des tons, dialectes
   
3. Audio Processing (skills/data/audio/)
   - Preprocessing audio
   - Features extraction
```

### Phase Modeling
```
1. Architecture Design (skills/ml-engineering/architecture/)
   - Choix d'architecture baseline
   - Adaptations pour low-resource
   
2. Training (skills/ml-engineering/training/)
   - Distributed training setup
   - Hyperparameter tuning
   
3. Fine-tuning (skills/ml-engineering/fine-tuning/)
   - PEFT/LoRA pour efficiency
   - Domain adaptation
   
4. Evaluation (skills/research/evaluation/)
   - Métriques spécifiques fongbe
   - Benchmarking
   
5. MLOps (skills/ml-engineering/mlops/)
   - Tracking avec W&B/MLflow
   - Versioning des expériences
```

---

## 📝 Guidelines par Tâche

### Quand tu écris du code
- [ ] Lire les skills `engineering/tdd/` et `engineering/code-quality/`
- [ ] Tests d'abord, implémentation ensuite
- [ ] Auto-review avec checklist de qualité
- [ ] Documentation inline et ADRs pour décisions importantes

### Quand tu travailles sur les données
- [ ] Lire `data/quality/` pour audit
- [ ] Lire `data/processing/` pour pipelines
- [ ] Métriques de qualité à chaque étape
- [ ] Versionning des datasets

### Quand tu fais de la recherche
- [ ] Lire `research/autoresearch/` pour méthode
- [ ] Papers dans `academic-ressources/` à analyser d'abord
- [ ] Notes structurées dans `docs/`
- [ ] Utiliser `research/paper-writing/` pour rédaction

### Quand tu entraînes un modèle
- [ ] Lire `ml-engineering/` skills pertinentes
- [ ] Configuration dans `configs/`
- [ ] Tracking dans `ml-engineering/mlops/`
- [ ] Logs et métriques détaillés

### Quand tu planifies une tâche complexe
- [ ] Lire `workflow/writing-plans/`
- [ ] Décomposer en sous-tâches
- [ ] Utiliser `workflow/subagent-dev/` si parallélisable
- [ ] Vérification finale avec `workflow/verification/`

---

## 🗂️ Structure du Projet

```
fongbe/
├── skills/                    # Skills library (ce fichier)
├── src/fongbe_voice/         # Code source principal
├── tests/                    # Tests (unitaires, intégration)
├── docs/                     # Documentation
├── data/                     # Données (raw, processed, interim)
├── models/                   # Modèles (checkpoints, configs, exports)
├── configs/                  # Configurations
├── scripts/                  # Scripts utilitaires
├── notebooks/                # Jupyter notebooks (exploration)
├── academic-ressources/      # Papers & ressources académiques
└── collecte/                 # Données collectées (corpus, dictionnaires)
```

---

## 🚀 Commandes Utiles

### Activer les skills dans une conversation
```markdown
# Dans ton prompt, référence explicitement :
Utilise la skill `skills/engineering/tdd/SKILL.md` pour écrire les tests.
Applique `skills/data/quality/` pour l'audit des données.
```

### Explorer une skill
```bash
cat skills/engineering/tdd/SKILL.md
cat skills/research/autoresearch/SKILL.md
```

### Lister toutes les skills
```bash
find skills -name "SKILL.md" -type f
```

---

## 💡 Principes Directeurs

1. **Mesurable** : Toute amélioration est quantifiée
2. **Reproductible** : Code + config + data = résultats identiques
3. **Documenté** : Chaque décision importante a une ADR
4. **Testé** : Couverture de tests élevée
5. **Évolutif** : Architecture modulaire, extensible
6. **Rigoureux** : Validation scientifique à chaque étape

---

## 📖 Ressources Clés

- **Skills README** : `/skills/README.md`
- **Import Plan** : `/SKILLS_IMPORT_PLAN.md`
- **Analysis** : `/SKILLS_ANALYSIS.md`
- **Papers** : `/academic-ressources/`
- **Data** : `/collecte/`

---

**Version** : 1.0
**Date** : 2026-08-06
**Projet** : Fongbe Voice LLM
