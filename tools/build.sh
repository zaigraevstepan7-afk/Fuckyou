#!/usr/bin/env bash
# Reproducible pipeline: decode Doka相机 APK -> apply Russian translations ->
# rebuild -> zipalign -> sign. Run from repo root.
#
#   tools/build.sh /path/to/Doka_original.apk
#
# Requires: apktool 2.12+ (fat jar), aapt2, zipalign, apksigner, keytool, JDK 17+.
set -euo pipefail

SRC_APK="${1:?usage: build.sh <original.apk>}"
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
WORK="$ROOT/.build"
APKTOOL="${APKTOOL_JAR:-$WORK/apktool.jar}"
KS="$WORK/doka.keystore"
KS_PASS="${KS_PASS:-dokaru123}"
OUT="$ROOT/Doka_ru.apk"

mkdir -p "$WORK"

# 0. apktool fat jar (Maven Central; GitHub is often blocked behind proxies)
if [ ! -f "$APKTOOL" ]; then
  curl -sSL -o "$APKTOOL" \
    "https://repo1.maven.org/maven2/org/apktool/apktool-cli/2.12.1/apktool-cli-2.12.1.jar"
fi

# 1. Decode (smali + resources)
rm -rf "$WORK/decoded"
java -jar "$APKTOOL" d -f "$SRC_APK" -o "$WORK/decoded"

# 2. Fix aapt2 private framework refs (Material3 dynamic colors on v31/v34)
python3 - "$WORK/decoded" <<'PY'
import sys,glob
for f in glob.glob(sys.argv[1]+'/res/values-v31/*.xml')+glob.glob(sys.argv[1]+'/res/values-v34/*.xml'):
    t=open(f,encoding='utf-8').read(); n=t.replace('@android:','@*android:')
    if n!=t: open(f,'w',encoding='utf-8').write(n)
PY

# 3. Apply translations + auth removal (DECODED dir read from scripts via env)
DECODED_DIR="$WORK/decoded" python3 "$ROOT/tools/apply_res.py"
DECODED_DIR="$WORK/decoded" python3 "$ROOT/tools/apply_code.py"
DECODED_DIR="$WORK/decoded" python3 "$ROOT/tools/patch_auth.py"
DECODED_DIR="$WORK/decoded" python3 "$ROOT/tools/patch_security.py"

# 4. Rebuild
java -jar "$APKTOOL" b "$WORK/decoded" -o "$WORK/unsigned.apk"

# 5. Align
zipalign -f -p 4 "$WORK/unsigned.apk" "$OUT"

# 6. Keystore (self-signed; the ORIGINAL developer key cannot be reproduced)
if [ ! -f "$KS" ]; then
  keytool -genkeypair -v -keystore "$KS" -storepass "$KS_PASS" -keypass "$KS_PASS" \
    -alias doka -keyalg RSA -keysize 2048 -validity 10000 \
    -dname "CN=Doka RU, OU=Localization, O=Doka, C=RU"
fi

# 7. Sign (v2+v3 cover Android 9+/API 29 minSdk of this app)
apksigner sign --ks "$KS" --ks-pass "pass:$KS_PASS" --key-pass "pass:$KS_PASS" \
  --min-sdk-version 29 \
  --v1-signing-enabled true --v2-signing-enabled true --v3-signing-enabled true "$OUT"
apksigner verify --min-sdk-version 29 "$OUT" && echo "OK: $OUT"
