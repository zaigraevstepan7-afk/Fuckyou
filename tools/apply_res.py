#!/usr/bin/env python3
# Applies Russian translations to Android string resources, preserving names,
# placeholders and file format. Wraps values in double quotes (safe for aapt2).
import json, re, sys, os

BASE = os.path.dirname(os.path.abspath(__file__))
DECODED = os.environ.get("DECODED_DIR", os.path.join(BASE, "decoded_full2"))
TR = json.load(open(os.path.join(BASE, "translations_res.json"), encoding="utf-8"))

# strings.xml files to localize: default + Chinese/Japanese variants (so those
# locales also show Russian instead of overriding with the original language).
TARGETS = [
    "res/values/strings.xml",
    "res/values-zh-rCN/strings.xml",
    "res/values-zh-rTW/strings.xml",
    "res/values-zh-rHK/strings.xml",
    "res/values-zh/strings.xml",
    "res/values-ja/strings.xml",
]

def esc(v: str) -> str:
    # XML-escape, then wrap in quotes to preserve whitespace/newlines and
    # to neutralise apostrophes. Inner double-quotes -> \" (none expected).
    v = v.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;")
    v = v.replace('"', '\\"')
    return '"' + v + '"'

CJK = re.compile(r'[一-鿿]')
total_changed = 0
for rel in TARGETS:
    path = os.path.join(DECODED, rel)
    if not os.path.exists(path):
        continue
    text = open(path, encoding="utf-8").read()
    changed = 0
    for name, ru in TR.items():
        pat = re.compile(r'(<string name="' + re.escape(name) + r'"[^>]*>)(.*?)(</string>)', re.S)
        def repl(m):
            return m.group(1) + esc(ru) + m.group(3)
        text, n = pat.subn(repl, text)
        changed += n
    open(path, "w", encoding="utf-8").write(text)
    # report leftover CJK app strings in this file
    leftover = len(CJK.findall(text))
    print(f"{rel}: replaced {changed} strings, CJK chars remaining in file: {leftover}")
    total_changed += changed

print("TOTAL string replacements:", total_changed)
print("dict size:", len(TR))
