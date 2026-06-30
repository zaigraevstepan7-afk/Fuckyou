package com.google.android.material.search;

import androidx.graphics.path.C0056;
import androidx.profileinstaller.C0062;
import com.google.android.material.behavior.C0093;
import com.google.android.material.bottomsheet.C0106;
import com.google.android.material.floatingactionbutton.C0113;
import com.reddit.frontpage.C0148;
import defpackage.C0152;
import defpackage.bm;
import defpackage.cm;
import defpackage.dm;
import defpackage.ea2;
import defpackage.g6;
import defpackage.ha0;
import defpackage.l91;
import defpackage.ls;
import defpackage.ob0;
import defpackage.oc;
import defpackage.oi1;
import defpackage.sa0;
import defpackage.xq0;
import defpackage.ya1;
import defpackage.zd;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.search.ۣ۟ۡ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0124 {

    /* JADX INFO: renamed from: ۟۠ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static int f130 = -861;

    /* JADX INFO: renamed from: ۟۠۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m1564(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0148.m1860() >= 0) {
            return oc.a((oc) obj, (ya1) obj2, (xq0) obj3, (String) obj4, (String) obj5, (ls) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static sa0 m1565(Object obj) {
        if (C0056.m738() < 0) {
            return ((oi1) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۢۥ, reason: not valid java name and contains not printable characters */
    public static int m1566(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static long m1567(Object obj, Object obj2) {
        if (C0127.m1604() >= 0) {
            return dm.c((cm) obj, (ob0) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۢ, reason: not valid java name and contains not printable characters */
    public static l91 m1568() {
        if (C0062.m818() < 0) {
            return l91.g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static String m1569(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۤۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m1570(Object obj) {
        if (C0113.m1443() > 0) {
            return ((g6) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۧۢ, reason: not valid java name and contains not printable characters */
    public static ha0 m1572(Object obj) {
        if (C0128.m1607() <= 0) {
            return ((ea2) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m1573(Object obj) {
        if (C0093.m1203() > 0) {
            return ((zd) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۥۧ, reason: not valid java name and contains not printable characters */
    public static int m1574() {
        return 352 ^ C0152.f229;
    }

    /* JADX INFO: renamed from: ۨۨۡۡ, reason: not valid java name and contains not printable characters */
    public static long m1575(Object obj) {
        if (C0106.m1348() >= 0) {
            return ((bm) obj).f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۤۦۧ, reason: not valid java name and contains not printable characters */
    public static String m1571(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
