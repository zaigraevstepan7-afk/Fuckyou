package com.google.android.material.appbar;

import android.text.C0014;
import androidx.window.reflection.C0079;
import com.google.android.material.behavior.C0088;
import com.google.android.material.behavior.C0094;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.floatingactionbutton.C0117;
import com.google.android.material.focus.C0119;
import com.google.android.material.sidesheet.C0134;
import com.google.android.material.snackbar.C0136;
import defpackage.C0154;
import defpackage.bq;
import defpackage.gk1;
import defpackage.gr0;
import defpackage.ks;
import defpackage.ob0;
import defpackage.rd;
import defpackage.rz;
import defpackage.s22;
import defpackage.tf;
import defpackage.tv0;
import defpackage.v20;
import defpackage.vq;
import defpackage.w4;
import defpackage.xa0;
import defpackage.yc;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.material.appbar.ۥۦۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0087 {

    /* JADX INFO: renamed from: ۟ۢۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int f93 = -931;

    /* JADX INFO: renamed from: ۣ۟۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m1123() {
        return 512 ^ C0154.f231;
    }

    /* JADX INFO: renamed from: ۟۠۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static ks m1124(Object obj, Object obj2, Object obj3) {
        if (C0119.m1511() >= 0) {
            return ((gr0) obj).o((ks) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۤ۠, reason: not valid java name and contains not printable characters */
    public static rd m1125(Object obj) {
        if (C0119.m1511() > 0) {
            return ((vq) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static bq m1126() {
        if (C0117.m1475() > 0) {
            return w4.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static tv0 m1127(Object obj, Object obj2) {
        if (C0098.m1266() < 0) {
            return s22.y((tv0) obj, (xa0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1128(Object obj, Object obj2) {
        if (C0088.m1147() < 0) {
            return ((ArrayList) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨۢ, reason: not valid java name and contains not printable characters */
    public static long m1129(Object obj) {
        if (C0136.m1712() < 0) {
            return ((gk1) obj).h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۤ, reason: not valid java name and contains not printable characters */
    public static Object m1131(Object obj) {
        if (C0079.m1016() <= 0) {
            return ((ob0) obj).K();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۨ, reason: not valid java name and contains not printable characters */
    public static void m1132(Object obj) {
        if (C0134.m1687() <= 0) {
            yc.l((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static int m1133(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤۥۡ, reason: not valid java name and contains not printable characters */
    public static int m1134(Object obj) {
        if (C0094.m1215() >= 0) {
            return ((rz) obj).u;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۥۧ, reason: not valid java name and contains not printable characters */
    public static String m1135(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۨۤۥ۠, reason: not valid java name and contains not printable characters */
    public static tf m1136() {
        if (C0014.m186() <= 0) {
            return v20.p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠۠, reason: not valid java name and contains not printable characters */
    public static String m1130(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
