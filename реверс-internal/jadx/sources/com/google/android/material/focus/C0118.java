package com.google.android.material.focus;

import android.support.v4.graphics.drawable.C0009;
import androidx.core.app.C0037;
import androidx.core.app.C0041;
import androidx.core.graphics.drawable.C0046;
import androidx.core.graphics.drawable.C0047;
import androidx.versionedparcelable.C0075;
import androidx.window.reflection.C0079;
import com.google.android.material.search.C0124;
import com.google.android.material.snackbar.C0135;
import defpackage.ca2;
import defpackage.ds1;
import defpackage.ea1;
import defpackage.g40;
import defpackage.gk1;
import defpackage.nu0;
import defpackage.p20;
import defpackage.pl;
import defpackage.ri0;
import defpackage.tv0;
import defpackage.v2;
import defpackage.xg0;
import defpackage.xq0;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.material.focus.۟ۡۨۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0118 {

    /* JADX INFO: renamed from: ۦ۠ۧۨ, reason: contains not printable characters */
    public static int f124 = -550;

    /* JADX INFO: renamed from: ۟۟ۢۦۦ, reason: not valid java name and contains not printable characters */
    public static ds1 m1482() {
        if (m1484() > 0) {
            return ds1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m1483(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m1484() {
        return (-451) ^ C0041.f41;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static int m1485() {
        if (C0075.m968() > 0) {
            return p20.b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۦۦۧ, reason: not valid java name and contains not printable characters */
    public static Object m1486(Object obj) {
        if (C0009.m122() > 0) {
            return pl.d0((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۦۨ, reason: not valid java name and contains not printable characters */
    public static xg0 m1487(Object obj) {
        if (C0037.m496() <= 0) {
            return ((ea1) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static long m1488(Object obj) {
        if (C0041.m550() >= 0) {
            return ((gk1) obj).k;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۡۡۦ, reason: not valid java name and contains not printable characters */
    public static tv0 m1489(Object obj, Object obj2) {
        if (C0135.m1701() > 0) {
            return nu0.O((tv0) obj, (ri0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۡ, reason: not valid java name and contains not printable characters */
    public static v2 m1490(Object obj) {
        if (C0046.m616() <= 0) {
            return ((ca2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۨۨ, reason: not valid java name and contains not printable characters */
    public static g40 m1491() {
        if (C0124.m1574() > 0) {
            return g40.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1492(Object obj) {
        if (C0079.m1016() <= 0) {
            return ((xq0) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۤۤ, reason: not valid java name and contains not printable characters */
    public static String m1493(String str) {
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

    /* JADX INFO: renamed from: ۣۢ, reason: not valid java name and contains not printable characters */
    public static String m1494(Object obj) {
        if (C0047.m622() <= 0) {
            return nu0.C((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static String m1495(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
