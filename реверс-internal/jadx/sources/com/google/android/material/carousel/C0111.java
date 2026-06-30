package com.google.android.material.carousel;

import android.text.C0015;
import android.view.C0022;
import android.view.C0025;
import android.view.View;
import androidx.appcompat.widget.C0032;
import androidx.core.app.C0043;
import androidx.core.app.C0044;
import androidx.graphics.path.C0054;
import com.google.android.material.behavior.C0093;
import com.google.android.material.sidesheet.C0133;
import com.google.android.material.snackbar.C0135;
import defpackage.C0152;
import defpackage.ba1;
import defpackage.bm;
import defpackage.cm;
import defpackage.cs1;
import defpackage.f20;
import defpackage.ha0;
import defpackage.ob0;
import defpackage.pq;
import defpackage.vm;
import defpackage.xg0;
import defpackage.xi0;
import defpackage.yr1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.carousel.۟ۦۤۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0111 {

    /* JADX INFO: renamed from: ۟ۢۥۨۤ, reason: not valid java name and contains not printable characters */
    public static int f117 = 932;

    /* JADX INFO: renamed from: ۟۠۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static float m1405() {
        if (C0152.m1979() > 0) {
            return xi0.D;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static cm m1406() {
        if (C0022.m288() <= 0) {
            return xi0.I;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static Object m1407(Object obj, Object obj2) {
        if (C0054.m711() >= 0) {
            return ((ba1) obj).q(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static f20 m1408(Object obj) {
        if (C0032.m419() < 0) {
            return ((vm) obj).s();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۡ, reason: not valid java name and contains not printable characters */
    public static String m1409() {
        if (C0044.m586() <= 0) {
            return "۟ۦۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m1410(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۨۧ۠, reason: not valid java name and contains not printable characters */
    public static void m1411(Object obj, Object obj2) {
        if (C0093.m1203() >= 0) {
            ((ob0) obj).k((ha0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m1412() {
        return (-933) ^ C0025.f25;
    }

    /* JADX INFO: renamed from: ۦۨۦۢ, reason: contains not printable characters */
    public static long m1414(Object obj) {
        if (C0043.m578() >= 0) {
            return ((bm) obj).B;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۡۤۢ, reason: not valid java name and contains not printable characters */
    public static xg0 m1415(Object obj) {
        if (C0015.m195() >= 0) {
            return ((pq) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۠۠, reason: not valid java name and contains not printable characters */
    public static String m1416(String str) {
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

    /* JADX INFO: renamed from: ۣۨۢۢ, reason: not valid java name and contains not printable characters */
    public static yr1 m1417(Object obj) {
        if (C0135.m1701() > 0) {
            return ((cs1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۥۡ, reason: not valid java name and contains not printable characters */
    public static void m1418(Object obj, int i) {
        if (C0133.m1681() >= 0) {
            ((View) obj).setSystemUiVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۥۦۨۤ, reason: contains not printable characters */
    public static String m1413(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
