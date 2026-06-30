package com.google.android.material.sidesheet;

import android.text.C0016;
import com.google.android.material.bottomappbar.C0096;
import com.google.android.material.floatingactionbutton.C0117;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0142;
import com.google.android.material.transformation.C0143;
import defpackage.br0;
import defpackage.d02;
import defpackage.f32;
import defpackage.rz;
import defpackage.sp1;
import defpackage.vq;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* JADX INFO: renamed from: com.google.android.material.sidesheet.۟ۨ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0132 {

    /* JADX INFO: renamed from: ۣ۟۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static int f138 = 925;

    /* JADX INFO: renamed from: ۟۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static d02 m1661(Object obj) {
        if (C0096.m1232() > 0) {
            return ((f32) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۢۡ, reason: not valid java name and contains not printable characters */
    public static int m1662(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۤ, reason: not valid java name and contains not printable characters */
    public static int m1663(Object obj) {
        if (C0142.m1788() >= 0) {
            return ((br0) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1664(Object obj, boolean z, boolean z2) {
        if (C0138.m1738() > 0) {
            return ((File) obj).setWritable(z, z2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m1666() {
        return (-875) ^ C0096.f102;
    }

    /* JADX INFO: renamed from: ۤ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m1667(Object obj) {
        if (C0016.m218() <= 0) {
            return ((vq) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤ۠, reason: not valid java name and contains not printable characters */
    public static String m1668(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۦ۠ۡۢ, reason: contains not printable characters */
    public static long m1669(Object obj) {
        if (C0117.m1475() >= 0) {
            return ((rz) obj).q;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣۨۦ, reason: contains not printable characters */
    public static long m1670(Object obj) {
        if (C0143.m1796() > 0) {
            return ((sp1) obj).g();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m1665(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
