package com.google.android.material.bottomsheet;

import android.support.v4.app.C0002;
import android.view.C0023;
import android.view.C0027;
import android.view.translation.C0018;
import androidx.versionedparcelable.C0077;
import com.google.android.material.snackbar.C0137;
import com.reddit.frontpage.C0150;
import defpackage.cr;
import defpackage.fa1;
import defpackage.hs1;
import defpackage.ls;
import defpackage.oc;
import defpackage.xg0;
import defpackage.xq0;
import defpackage.ya1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.ۦۡ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0107 {

    /* JADX INFO: renamed from: ۣۤۨۡ, reason: not valid java name and contains not printable characters */
    public static int f113 = 204;

    /* JADX INFO: renamed from: ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m1356(Object obj) {
        if (C0077.m996() >= 0) {
            return ((cr) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static hs1 m1358() {
        if (C0137.m1727() < 0) {
            return hs1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1359() {
        return 273 ^ C0027.f27;
    }

    /* JADX INFO: renamed from: ۟ۤۤۥۥ, reason: not valid java name and contains not printable characters */
    public static int m1360(Object obj) {
        if (C0018.m241() < 0) {
            return ((fa1) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m1361(Object obj, boolean z, Object obj2) {
        if (C0150.m1876() > 0) {
            return ((xg0) obj).E(z, (ls) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m1362(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m1363(Object obj, boolean z) {
        if (C0023.m313() >= 0) {
            ((Thread) obj).setDaemon(z);
        }
    }

    /* JADX INFO: renamed from: ۣۤۥۦ, reason: not valid java name and contains not printable characters */
    public static Object m1364(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0002.m39() >= 0) {
            return oc.b((oc) obj, (ya1) obj2, (xq0) obj3, (String) obj4, (String) obj5, (ls) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m1365(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m1357(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
