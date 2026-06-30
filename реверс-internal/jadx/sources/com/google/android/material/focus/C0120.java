package com.google.android.material.focus;

import android.view.C0025;
import android.view.View;
import android.view.translation.C0018;
import androidx.core.app.C0037;
import androidx.startup.C0072;
import com.google.android.material.bottomsheet.C0102;
import com.google.android.material.bottomsheet.C0106;
import com.google.android.material.carousel.C0111;
import com.google.android.material.snackbar.C0136;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0141;
import com.reddit.frontpage.C0148;
import defpackage.C0152;
import defpackage.al0;
import defpackage.ay0;
import defpackage.ha1;
import defpackage.iq;
import defpackage.jo;
import defpackage.ob0;
import defpackage.qc1;
import defpackage.qs1;
import defpackage.tc;
import defpackage.tv0;
import defpackage.uf;
import defpackage.xl;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: com.google.android.material.focus.۟ۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0120 {

    /* JADX INFO: renamed from: ۣۧۦۦ, reason: not valid java name and contains not printable characters */
    public static int f126 = 43;

    /* JADX INFO: renamed from: ۟۟ۡۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m1512(Object obj, Object obj2, Object obj3) {
        if (C0072.m936() <= 0) {
            return ((jo) obj).h(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۤۤ, reason: not valid java name and contains not printable characters */
    public static long m1513(Object obj, long j, long j2, Object obj2) {
        if (C0152.m1979() >= 0) {
            return ((uf) obj).a(j, j2, (al0) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۥۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m1514(Object obj) {
        if (C0102.m1309() >= 0) {
            return ((tc) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۧۥ, reason: not valid java name and contains not printable characters */
    public static long m1515(Object obj) {
        if (C0106.m1348() > 0) {
            return ((iq) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m1516(Object obj, Object obj2) {
        if (C0018.m241() <= 0) {
            qc1.b((ob0) obj, (tv0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m1517(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static long m1518() {
        if (C0141.m1778() <= 0) {
            return xl.c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۥۤ۟, reason: not valid java name and contains not printable characters */
    public static View m1519(Object obj, int i) {
        if (C0025.m340() >= 0) {
            return ((View) obj).findViewById(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1520(Object obj, Object obj2, Object obj3) {
        if (C0148.m1860() >= 0) {
            return ((qs1) obj).k(obj2, obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۢۧ, reason: contains not printable characters */
    public static int m1521(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۣ, reason: contains not printable characters */
    public static int m1522() {
        return (-279) ^ C0138.f144;
    }

    /* JADX INFO: renamed from: ۥۥ۟۟, reason: contains not printable characters */
    public static int m1524(Object obj) {
        if (C0111.m1412() < 0) {
            return ((ha1) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۢۡ, reason: contains not printable characters */
    public static boolean m1525(Object obj, Object obj2) {
        if (C0037.m496() <= 0) {
            return ((ay0) obj).a(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m1526(Object obj) {
        if (C0136.m1712() <= 0) {
            ((HttpURLConnection) obj).disconnect();
        }
    }

    /* JADX INFO: renamed from: ۥۣۢۧ, reason: contains not printable characters */
    public static String m1523(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
