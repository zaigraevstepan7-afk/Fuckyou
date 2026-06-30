package com.google.android.material.floatingactionbutton;

import android.content.Context;
import androidx.core.app.C0037;
import androidx.core.app.C0042;
import androidx.graphics.path.C0054;
import androidx.lifecycle.C0059;
import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.bottomappbar.C0101;
import com.google.android.material.search.C0126;
import defpackage.dn1;
import defpackage.i91;
import defpackage.ig0;
import defpackage.lt0;
import defpackage.ob0;
import defpackage.pl;
import defpackage.sa0;
import defpackage.tv0;
import defpackage.wx0;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ۦۨۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0117 {

    /* JADX INFO: renamed from: ۣۨۦۢ, reason: not valid java name and contains not printable characters */
    public static int f123 = 518;

    /* JADX INFO: renamed from: ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m1473(Object obj, Object obj2, Object obj3) {
        if (C0099.m1272() < 0) {
            ((wx0) obj).d((i91) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m1474(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۦ, reason: not valid java name and contains not printable characters */
    public static int m1475() {
        return (-982) ^ C0054.f54;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1476(Object obj, Object obj2) {
        if (C0101.m1291() < 0) {
            return pl.b0((Iterable) obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static File m1477(Object obj) {
        if (C0037.m496() < 0) {
            return ((Context) obj).getCacheDir();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۨ۠, reason: not valid java name and contains not printable characters */
    public static String m1478(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۧۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static tv0 m1479(Object obj) {
        if (C0126.m1590() >= 0) {
            return ((dn1) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static sa0 m1480(Object obj) {
        if (C0059.m769() >= 0) {
            return ((lt0) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static void m1481(Object obj, Object obj2, int i) {
        if (C0042.m566() <= 0) {
            ((ig0) obj).a((ob0) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m1472(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
