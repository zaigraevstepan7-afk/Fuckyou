#!/usr/bin/env python3
# Bypasses the local anti-tamper block (libdoka_security / SecurityBlockActivity,
# error codes SEC-100x). The block decision is made in Java by the verdict object
# Lc0/c;: a() returns the list of active violations, d() returns whether blocked.
# L/h launches SecurityBlockActivity when a() is non-empty. We force the verdict
# to "clean": a() -> empty list, d() -> false. Native code only supplies raw
# signals; the decision is Java-side, so this fully neutralises the local block.
# Idempotent. Honors DECODED_DIR (defaults to decoded_full2 next to this script).
import os, re

BASE = os.path.dirname(os.path.abspath(__file__))
DECODED = os.environ.get("DECODED_DIR", os.path.join(BASE, "decoded_full2"))
cc = os.path.join(DECODED, "smali_classes2/c0/c.smali")
src = open(cc, encoding="utf-8").read()

# a() -> empty list (Li0/t;->a is kotlin EmptyList, an immutable java.util.List)
a_stub = (".method public final a()Ljava/util/List;\n"
          "    .locals 1\n\n"
          "    sget-object v0, Li0/t;->a:Li0/t;\n\n"
          "    return-object v0\n"
          ".end method")
src, na = re.subn(r"\.method public final a\(\)Ljava/util/List;\n.*?\.end method",
                  a_stub, src, count=1, flags=re.S)
assert na == 1, "c0/c->a() not found"

# d() -> false (no violations)
d_stub = (".method public final d()Z\n"
          "    .locals 1\n\n"
          "    const/4 v0, 0x0\n\n"
          "    return v0\n"
          ".end method")
src, nd = re.subn(r"\.method public final d\(\)Z\n.*?\.end method",
                  d_stub, src, count=1, flags=re.S)
assert nd == 1, "c0/c->d() not found"

open(cc, "w", encoding="utf-8").write(src)
print("patched Lc0/c->a() -> empty list, Lc0/c->d() -> false (anti-tamper bypass)")
