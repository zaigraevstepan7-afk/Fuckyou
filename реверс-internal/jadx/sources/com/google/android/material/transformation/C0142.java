package com.google.android.material.transformation;

import android.app.C0000;
import android.text.C0015;
import androidx.appcompat.app.C0029;
import androidx.compose.ui.input.pointer.C0034;
import androidx.recyclerview.widget.C0065;
import androidx.versionedparcelable.C0074;
import androidx.window.reflection.C0082;
import com.google.android.material.bottomsheet.C0104;
import com.google.android.material.carousel.C0110;
import com.google.android.material.sidesheet.C0130;
import defpackage.ag1;
import defpackage.bq;
import defpackage.er0;
import defpackage.ga1;
import defpackage.hb;
import defpackage.l91;
import defpackage.lr0;
import defpackage.oz;
import defpackage.rr;
import defpackage.td;
import defpackage.yh;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.material.transformation.۟ۢۧ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0142 {

    /* JADX INFO: renamed from: ۧ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static int f148 = 811;

    /* JADX INFO: renamed from: ۣ۟ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static l91 m1781(Object obj) {
        if (C0065.m853() <= 0) {
            return ((ag1) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static int m1782(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static int m1783(Object obj) {
        if (C0074.m963() > 0) {
            return ((td) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static lr0 m1784(Object obj) {
        if (C0029.m384() > 0) {
            return ((er0) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static List m1785(Object obj) {
        if (C0034.m451() <= 0) {
            return ((hb) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۢ, reason: not valid java name and contains not printable characters */
    public static float m1786() {
        if (C0000.m0() <= 0) {
            return yh.d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static double m1787(Object obj) {
        if (C0082.m1058() < 0) {
            return ((oz) obj).d;
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨ, reason: not valid java name and contains not printable characters */
    public static int m1788() {
        return (-611) ^ C0015.f15;
    }

    /* JADX INFO: renamed from: ۠ۦۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m1789(Object obj, Object obj2) {
        if (C0110.m1397() >= 0) {
            return ((ga1) obj).q(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static bq m1790() {
        if (C0104.m1332() > 0) {
            return rr.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۢ, reason: contains not printable characters */
    public static String m1792(String str) {
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

    /* JADX INFO: renamed from: ۣۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m1793(Object obj, int i) {
        if (C0130.m1641() > 0) {
            return ((StringBuilder) obj).append(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۨ۠, reason: not valid java name and contains not printable characters */
    public static String m1791(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
