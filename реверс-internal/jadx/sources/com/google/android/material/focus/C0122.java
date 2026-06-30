package com.google.android.material.focus;

import android.support.v4.graphics.drawable.C0009;
import android.text.C0012;
import androidx.appcompat.widget.C0033;
import androidx.window.area.reflectionguard.C0078;
import androidx.window.reflection.C0083;
import com.google.android.material.snackbar.C0136;
import com.google.android.material.transformation.C0142;
import defpackage.C0153;
import defpackage.eu;
import defpackage.ft0;
import defpackage.g12;
import defpackage.g20;
import defpackage.hq;
import defpackage.ld0;
import defpackage.lk;
import defpackage.om;
import defpackage.tv0;
import defpackage.u42;
import defpackage.wq;
import defpackage.xi0;
import defpackage.xk;
import defpackage.ym1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.focus.ۣۤ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0122 {

    /* JADX INFO: renamed from: ۡۧۢۤ, reason: not valid java name and contains not printable characters */
    public static int f128 = 801;

    /* JADX INFO: renamed from: ۟۟ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1537(Object obj) {
        if (C0136.m1712() < 0) {
            return ((wq) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static long m1538(Object obj) {
        if (C0142.m1788() >= 0) {
            return ((ft0) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۤۥۣ, reason: not valid java name and contains not printable characters */
    public static String m1539(String str) {
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
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static tv0 m1540(Object obj, Object obj2) {
        if (C0120.m1522() >= 0) {
            return xk.h((tv0) obj, (ym1) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥۥ, reason: not valid java name and contains not printable characters */
    public static tv0 m1541(Object obj) {
        if (C0033.m436() >= 0) {
            return ((hq) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m1542() {
        return (-319) ^ C0083.f83;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static byte[] m1543() {
        if (C0009.m122() >= 0) {
            return eu.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static tv0 m1544(Object obj, float f, float f2) {
        if (C0153.m1994() >= 0) {
            return xi0.D((tv0) obj, f, f2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static long m1545(long j, long j2) {
        if (C0078.m998() <= 0) {
            return lk.E(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۠۠, reason: not valid java name and contains not printable characters */
    public static int m1546(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۡۡۨ, reason: not valid java name and contains not printable characters */
    public static g12 m1547(Object obj, Object obj2, Object obj3, boolean z, Object obj4, double d) {
        if (C0012.m162() > 0) {
            return ((om) obj).i((u42) obj2, (ld0) obj3, z, (g20) obj4, d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۧۧ, reason: contains not printable characters */
    public static String m1548(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
