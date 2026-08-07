# Skills Library - Projet Voice LLM Fongbe

Bibliothèque de skills importées pour un développement rigoureux et professionnel.

## 📊 Statistiques

- **Total de fichiers** : 262+ fichiers markdown
- **Catégories** : 6 catégories principales
- **Skills importées** : ~47 skills

## 📂 Structure

### 🔧 Engineering (Ingénierie de Code)

Skills pour un code de qualité professionnelle.

#### Core Development
- **`tdd/`** - Test-Driven Development
- **`code-quality/`** - Code Review & Quality Assurance
- **`code-simplification/`** - Code Simplification & Clean Code
- **`debugging/`** - Debugging & Error Recovery
- **`systematic-debugging/`** - Systematic Debugging (avancé)

#### Documentation & Architecture
- **`documentation/`** - Documentation & ADRs (Architecture Decision Records)
- **`api-design/`** - API & Interface Design
- **`context-management/`** - Context Engineering

#### Development Workflow
- **`git-workflow/`** - Git Workflow & Versioning
- **`ci-cd/`** - CI/CD & Automation
- **`planning/`** - Planning & Task Breakdown
- **`incremental-impl/`** - Incremental Implementation

#### Performance & Operations
- **`performance/`** - Performance Optimization
- **`observability/`** - Observability & Instrumentation
- **`security/`** - Security & Hardening

#### Specialized Coding Styles
- **`zero-hallucination/`** - Zero Hallucination Coder
- **`karpathy-style/`** - Karpathy-style Coder (simple, from scratch)

---

### 🔬 Research

Skills pour la recherche scientifique et académique.

- **`autoresearch/`** - Automated Research (paper discovery, analysis)
- **`paper-writing/`** - ML Paper Writing (academic writing, systems papers)
- **`ideation/`** - Research Ideation (creative thinking, brainstorming)
- **`evaluation/`** - Evaluation Frameworks (lm-evaluation-harness, bigcode, nemo)

---

### 🤖 ML Engineering

Skills pour l'entraînement et le déploiement de modèles.

#### Architecture & Training
- **`architecture/`** - Model Architectures (nanogpt, litgpt, mamba, torchtitan, rwkv)
- **`training/`** - Distributed Training (deepspeed, accelerate, pytorch-fsdp2, megatron, ray)
- **`fine-tuning/`** - Fine-tuning (PEFT, LoRA, axolotl, llama-factory, unsloth)
- **`post-training/`** - Post-training (RLHF, DPO, SimPO, GRPO, verl, trl)

#### Optimization & Operations
- **`optimization/`** - Optimization (quantization, flash-attention, bitsandbytes, GPTQ, AWQ)
- **`mlops/`** - MLOps (weights-and-biases, mlflow, tensorboard, swanlab)

---

### 📊 Data

Skills pour le traitement et la qualité des données.

#### Core Data Processing
- **`processing/`** - Data Processing Pipelines (nemo-curator, ray-data)
- **`tokenization/`** - Tokenization (sentencepiece, huggingface-tokenizers)
- **`quality/`** - Data Quality Auditing
- **`statistics/`** - Statistical Analysis

#### Audio-Specific
- **`audio/whisper/`** - Whisper (speech recognition baseline)
- **`audio/audiocraft/`** - Audiocraft (audio generation & processing)

---

### 🧪 Testing

Skills pour les tests automatisés.

- **`pytest/`** - Pytest Skills (Python testing)
- **`conventions/`** - Testing Conventions & Shared Practices

---

### ⚙️ Workflow

Skills pour la productivité et l'organisation.

- **`writing-plans/`** - Writing Plans (structured planning)
- **`executing-plans/`** - Executing Plans (implementation)
- **`subagent-dev/`** - Subagent-Driven Development
- **`verification/`** - Verification Before Completion
- **`brainstorming/`** - Brainstorming (structured ideation)
- **`git-worktrees/`** - Using Git Worktrees

---

## 🎯 Utilisation

### Pour les Agents AI (Claude, Kiro)

Référencer les skills pertinentes dans vos prompts :

```markdown
Utilise les skills suivantes :
- engineering/tdd/ pour écrire les tests
- engineering/code-quality/ pour la review
- data/tokenization/ pour le tokenizer fongbe
```

### Structure Typique d'une Skill

Chaque skill contient généralement :
- `SKILL.md` - Documentation principale de la skill
- Fichiers de référence (patterns, exemples, frameworks)
- Scripts et outils associés

### Exemples d'Usage par Phase

#### Phase Recherche
```bash
skills/research/autoresearch/    # Recherche de papers
skills/research/ideation/         # Idéation de solutions
skills/data/quality/              # Audit des données existantes
```

#### Phase Data Engineering
```bash
skills/data/processing/           # Pipeline de données
skills/data/tokenization/         # Tokenizer pour fongbe
skills/data/audio/whisper/        # Baseline speech recognition
```

#### Phase Modeling
```bash
skills/ml-engineering/architecture/    # Choix d'architecture
skills/ml-engineering/fine-tuning/     # Fine-tuning
skills/ml-engineering/optimization/    # Quantization
skills/ml-engineering/mlops/           # Tracking d'expériences
```

#### Phase Development
```bash
skills/engineering/tdd/           # Tests d'abord
skills/engineering/code-quality/  # Review continue
skills/workflow/subagent-dev/     # Délégation de tâches
```

---

## 📚 Documentation

- **SKILLS_IMPORT_PLAN.md** - Plan d'import détaillé
- **SKILLS_ANALYSIS.md** - Analyse des besoins du projet
- **../CLAUDE.md** - Configuration pour agents (à créer)

---

## 🔄 Mise à Jour

Les skills sont importées depuis `~/starred-skills/`. Pour mettre à jour :

```bash
# Mettre à jour les sources
cd ~/starred-skills
for dir in */*/.git; do (cd "$(dirname "$dir")" && git pull); done

# Ré-importer (si nécessaire)
# Voir SKILLS_IMPORT_PLAN.md pour les commandes
```

---

## 📖 Sources

Skills importées depuis :
- **agent-skills** - Development skills
- **superpowers** - Workflow & productivity
- **ai-research-skills** - ML research & engineering
- **alirezarezvani-claude-skills** - Specialized engineering
- **lambdatest-agent-skills** - Testing frameworks

---

**Note** : Cette bibliothèque est conçue pour évoluer avec le projet. Ajoutez ou retirez des skills selon vos besoins.
