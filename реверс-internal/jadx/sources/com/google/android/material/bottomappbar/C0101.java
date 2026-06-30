package com.google.android.material.bottomappbar;

import androidx.lifecycle.C0060;
import androidx.profileinstaller.C0063;
import androidx.window.reflection.C0082;
import com.google.android.material.search.C0128;
import com.google.android.material.sidesheet.C0134;
import com.reddit.frontpage.C0150;
import defpackage.C0153;
import defpackage.bl;
import defpackage.ca1;
import defpackage.ek;
import defpackage.i91;
import defpackage.l32;
import defpackage.l81;
import defpackage.ob0;
import defpackage.ry1;
import defpackage.vj0;
import defpackage.wa0;
import defpackage.wq;
import defpackage.xg0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.bottomappbar.ۧۦۣۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0101 {

    /* JADX INFO: renamed from: ۡۤۦ۟, reason: not valid java name and contains not printable characters */
    public static int f107 = -469;

    /* JADX INFO: renamed from: ۟۟ۨ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m1289(Object obj) {
        if (C0134.m1687() < 0) {
            return ((l32) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m1291() {
        return (-531) ^ C0098.f104;
    }

    /* JADX INFO: renamed from: ۟ۢۢۧۧ, reason: not valid java name and contains not printable characters */
    public static int m1292(Object obj) {
        if (C0150.m1876() >= 0) {
            return ((ca1) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۤۤ, reason: not valid java name and contains not printable characters */
    public static void m1293(Object obj, boolean z, Object obj2, int i) {
        if (C0063.m824() >= 0) {
            bl.e((ry1) obj, z, (ob0) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m1294(Object obj) {
        if (C0153.m1994() > 0) {
            return ((l81) obj).n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m1295(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static wa0 m1296(Object obj) {
        if (C0128.m1607() <= 0) {
            return ((wq) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۥۥ, reason: not valid java name and contains not printable characters */
    public static ek m1297(Object obj) {
        if (C0082.m1058() < 0) {
            return ((vj0) obj).O();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static i91 m1298() {
        if (C0060.m781() <= 0) {
            return xg0.k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۤۢ, reason: not valid java name and contains not printable characters */
    public static String m1299(String str) {
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

    /* JADX INFO: renamed from: ۣ۟۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m1290(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
