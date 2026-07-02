#!/usr/bin/env python3
# Removes the authorization wall from Doka Камера:
#  1) Forces the central "is logged in" check LW/j->h()Z to always return true,
#     so none of the ~20 "login required" guards block the user.
#  2) Hides the WeChat login button (ivWechatLogin) in the login screen.
# Idempotent. Honors DECODED_DIR (defaults to decoded_full2 next to this script).
import os, re

BASE = os.path.dirname(os.path.abspath(__file__))
DECODED = os.environ.get("DECODED_DIR", os.path.join(BASE, "decoded_full2"))

# --- 1. LW/j->h()Z  => always true --------------------------------------------
wj = os.path.join(DECODED, "smali_classes2/W/j.smali")
src = open(wj, encoding="utf-8").read()
stub = (".method public static h()Z\n"
        "    .locals 1\n\n"
        "    const/4 v0, 0x1\n\n"
        "    return v0\n"
        ".end method")
new, n = re.subn(r"\.method public static h\(\)Z\n.*?\.end method", stub, src, count=1, flags=re.S)
assert n == 1, "h()Z method not found in W/j.smali"
open(wj, "w", encoding="utf-8").write(new)
print("patched LW/j->h()Z -> always true")

# --- 2. Hide WeChat login button ----------------------------------------------
lay = os.path.join(DECODED, "res/layout/activity_login.xml")
t = open(lay, encoding="utf-8").read()
if 'android:id="@id/ivWechatLogin"' in t and "ivWechatLogin" in t:
    # insert visibility="gone" into the ivWechatLogin element if not present
    def add_gone(m):
        tag = m.group(0)
        if "android:visibility=" in tag:
            return re.sub(r'android:visibility="[^"]*"', 'android:visibility="gone"', tag)
        return tag.replace('<ImageView ', '<ImageView android:visibility="gone" ', 1)
    t2 = re.sub(r'<ImageView [^>]*android:id="@id/ivWechatLogin"[^>]*/>', add_gone, t)
    assert t2 != t, "could not patch ivWechatLogin visibility"
    open(lay, "w", encoding="utf-8").write(t2)
    print("hid WeChat login button (ivWechatLogin -> gone)")
else:
    print("WARN: ivWechatLogin not found in activity_login.xml")
