#!/bin/bash
# Upload automatique du dataset vers Google Drive

set -e

DATASET_FILE="fongbe_dataset.tar.gz"
DRIVE_FOLDER="fongbe-asr"
REMOTE_NAME="gdrive"

echo "═══════════════════════════════════════"
echo "  📤 UPLOAD DATASET VERS GOOGLE DRIVE"
echo "═══════════════════════════════════════"
echo ""

# Vérifier que le fichier existe
if [ ! -f "$DATASET_FILE" ]; then
    echo "❌ Erreur: $DATASET_FILE introuvable"
    exit 1
fi

echo "📊 Fichier: $DATASET_FILE"
ls -lh "$DATASET_FILE"
echo ""

# Vérifier rclone
if ! command -v rclone &> /dev/null; then
    echo "❌ rclone non installé"
    echo "Installation: sudo apt install rclone"
    exit 1
fi

# Vérifier la configuration
echo "🔍 Vérification configuration rclone..."
if ! rclone listremotes | grep -q "^${REMOTE_NAME}:"; then
    echo "❌ Remote '$REMOTE_NAME' non configuré"
    echo ""
    echo "Configuration requise:"
    echo "  rclone config"
    echo "  → Choisir 'n' (new remote)"
    echo "  → Nom: gdrive"
    echo "  → Type: 'drive' (Google Drive)"
    echo "  → Suivre les étapes d'authentification"
    exit 1
fi

# Test connexion
echo "🔗 Test connexion Google Drive..."
if ! rclone lsd "${REMOTE_NAME}:" --max-depth 1 &>/dev/null; then
    echo "⚠️  Token expiré - Reconnexion nécessaire:"
    echo ""
    echo "  rclone config reconnect ${REMOTE_NAME}:"
    echo ""
    echo "Puis relancer ce script."
    exit 1
fi

echo "✅ Connexion OK"
echo ""

# Créer le dossier sur Drive (si n'existe pas)
echo "📁 Création dossier ${DRIVE_FOLDER}/ sur Drive..."
rclone mkdir "${REMOTE_NAME}:${DRIVE_FOLDER}" 2>/dev/null || true

# Upload avec barre de progression
echo "📤 Upload en cours..."
rclone copy "$DATASET_FILE" "${REMOTE_NAME}:${DRIVE_FOLDER}/" \
    --progress \
    --stats 1s \
    --stats-one-line

echo ""
echo "✅ Upload terminé !"
echo ""
echo "📍 Emplacement Drive:"
echo "   ${REMOTE_NAME}:${DRIVE_FOLDER}/$DATASET_FILE"
echo ""
echo "🔗 Vérification:"
rclone ls "${REMOTE_NAME}:${DRIVE_FOLDER}/" | grep "$DATASET_FILE"
