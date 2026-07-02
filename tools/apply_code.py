#!/usr/bin/env python3
# Translates hardcoded Chinese UI literals in a whitelist of app smali files.
# Re-encodes Russian as \uXXXX escapes (baksmali style); ASCII stays literal.
# Skips logic/parsing tokens by translating ONLY strings present in the dict.
import json, re, os

BASE = os.path.dirname(os.path.abspath(__file__))
DECODED = os.environ.get("DECODED_DIR", os.path.join(BASE, "decoded_full2"))
TR = json.load(open(os.path.join(BASE, "translations_code.json"), encoding="utf-8"))

WHITELIST = [
    "smali_classes2/Y/b.smali",
    "smali_classes2/T/Y.smali",
    "smali_classes2/T/x0.smali",
    "smali_classes2/G/G.smali",
    "smali_classes2/G/a.smali",
    "smali_classes2/G/f.smali",
    "smali_classes2/d0/d.smali",
    "smali_classes2/T/p0.smali",
    "smali_classes2/com/ydgn/doka/activity/VipPurchaseActivity.smali",
    "smali_classes2/com/ydgn/doka/wxapi/WXEntryActivity.smali",
]

# Price-parsing tokens in VipPurchaseActivity that MUST stay Chinese (used by
# contains()-style matchers on the server price string). Not in TR, but guard anyway.
FORBIDDEN = {"约", "/天", "每天"}  # 约 /天 每天

def smali_escape(s: str) -> str:
    out = []
    for ch in s:
        o = ord(ch)
        if ch == '\\':
            out.append('\\\\')
        elif ch == '"':
            out.append('\\"')
        elif ch == '\n':
            out.append('\\n')
        elif 0x20 <= o < 0x7f:
            out.append(ch)
        else:
            out.append('\\u%04x' % o)
    return ''.join(out)

def dec(raw):
    return re.sub(r'\\u([0-9a-fA-F]{4})', lambda m: chr(int(m.group(1), 16)), raw)

const = re.compile(r'^(\s*const-string(?:/jumbo)?\s+[vp]\d+,\s*")(.*)("\s*)$')
total = 0
for rel in WHITELIST:
    path = os.path.join(DECODED, rel)
    lines = open(path, encoding="utf-8").read().split("\n")
    changed = 0
    for i, line in enumerate(lines):
        m = const.match(line)
        if not m:
            continue
        raw = m.group(2)
        d = dec(raw)
        if raw in FORBIDDEN or d in FORBIDDEN:
            continue
        if d in TR:
            new_raw = smali_escape(TR[d])
            lines[i] = m.group(1) + new_raw + m.group(3)
            changed += 1
    open(path, "w", encoding="utf-8").write("\n".join(lines))
    print(f"{rel}: translated {changed} literals")
    total += changed
print("TOTAL code literals translated:", total, " dict size:", len(TR))
