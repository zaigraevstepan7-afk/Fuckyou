package com.reddit.frontpage;

import androidx.appcompat.widget.C0031;
import androidx.profileinstaller.C0061;
import androidx.recyclerview.widget.C0065;
import androidx.window.reflection.C0081;
import com.google.android.material.focus.C0122;
import defpackage.bs1;
import defpackage.c2;
import defpackage.c41;
import defpackage.gi;
import defpackage.ha0;
import defpackage.jo;
import defpackage.ob0;
import defpackage.pz;
import defpackage.tv0;
import defpackage.xh;
import defpackage.zf1;
import java.io.ByteArrayOutputStream;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.reddit.frontpage.ۥۤۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0151 {

    /* JADX INFO: renamed from: ۤۦۨۧ, reason: not valid java name and contains not printable characters */
    public static int f157 = 410;

    /* JADX INFO: renamed from: ۣ۟۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m1889(Object obj, Object obj2, Object obj3, boolean z, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        if (C0031.m407() >= 0) {
            c2.h((ha0) obj, (gi) obj2, (tv0) obj3, z, (xh) obj4, (c41) obj5, (jo) obj6, (ob0) obj7, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static int m1890(Object obj) {
        if (C0065.m853() < 0) {
            return ((zf1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟۟, reason: not valid java name and contains not printable characters */
    public static pz m1891(Object obj) {
        if (C0061.m803() <= 0) {
            return ((bs1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۣۤ, reason: not valid java name and contains not printable characters */
    public static void m1892(Object obj, Object obj2, Object obj3) throws CertificateException {
        if (C0081.m1040() >= 0) {
            ((X509TrustManager) obj).checkServerTrusted((X509Certificate[]) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۧۧ۟, reason: not valid java name and contains not printable characters */
    public static String m1893(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m1894() {
        return 825 ^ C0122.f128;
    }

    /* JADX INFO: renamed from: ۨۢۥۣ, reason: not valid java name and contains not printable characters */
    public static int m1895(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۨۨۥ, reason: not valid java name and contains not printable characters */
    public static String m1896(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
