package com.google.android.material.transformation;

import android.os.BaseBundle;
import com.google.android.material.appbar.C0085;
import com.google.android.material.appbar.C0087;
import com.google.android.material.behavior.C0089;
import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.carousel.C0110;
import defpackage.fy0;
import defpackage.h22;
import defpackage.ob0;
import defpackage.os1;
import defpackage.wa0;
import defpackage.wq;
import defpackage.xc;
import java.io.ByteArrayOutputStream;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.material.transformation.۟۟ۡۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0140 {

    /* JADX INFO: renamed from: ۥۨۨۨ, reason: contains not printable characters */
    public static int f146 = -628;

    /* JADX INFO: renamed from: ۟۟۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static fy0 m1762(Object obj, Object obj2) {
        if (C0099.m1272() <= 0) {
            return xc.n((os1) obj, (ob0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static h22 m1763() {
        if (C0085.m1094() > 0) {
            return h22.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۤ۠, reason: not valid java name and contains not printable characters */
    public static Set m1764(Object obj) {
        if (C0110.m1397() > 0) {
            return ((BaseBundle) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۥۣ, reason: not valid java name and contains not printable characters */
    public static wa0 m1765(Object obj) {
        if (C0087.m1123() < 0) {
            return ((wq) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۦ, reason: not valid java name and contains not printable characters */
    public static String m1767(String str) {
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

    /* JADX INFO: renamed from: ۤۢۤ۠, reason: not valid java name and contains not printable characters */
    public static int m1768() {
        return 295 ^ C0089.f95;
    }

    /* JADX INFO: renamed from: ۨۡۤۨ, reason: not valid java name and contains not printable characters */
    public static int m1769(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ۠, reason: not valid java name and contains not printable characters */
    public static String m1766(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
