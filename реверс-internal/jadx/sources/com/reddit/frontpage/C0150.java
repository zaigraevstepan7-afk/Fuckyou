package com.reddit.frontpage;

import android.app.C0001;
import androidx.lifecycle.C0058;
import androidx.lifecycle.C0060;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.bottomappbar.C0101;
import com.google.android.material.search.C0127;
import com.google.android.material.snackbar.C0135;
import defpackage.bm;
import defpackage.f20;
import defpackage.ha0;
import defpackage.hq;
import defpackage.jc1;
import defpackage.lq;
import defpackage.s91;
import defpackage.sv0;
import defpackage.vm;
import java.io.ByteArrayOutputStream;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.reddit.frontpage.ۥ۠ۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0150 {

    /* JADX INFO: renamed from: ۟ۥۧۡ۟, reason: not valid java name and contains not printable characters */
    public static int f156 = 648;

    /* JADX INFO: renamed from: ۟۠۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m1876() {
        return (-280) ^ C0058.f58;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟۠, reason: not valid java name and contains not printable characters */
    public static String m1877(Object obj) {
        if (C0001.m16() <= 0) {
            return ((lq) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static f20 m1878(Object obj) {
        if (C0099.m1272() < 0) {
            return ((vm) obj).D();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m1879(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static long m1880(Object obj) {
        if (C0101.m1291() <= 0) {
            return ((bm) obj).p;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m1881(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static sv0 m1882(Object obj) {
        if (C0060.m781() < 0) {
            return ((sv0) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۤ, reason: not valid java name and contains not printable characters */
    public static int m1883(Object obj) {
        if (C0060.m781() < 0) {
            return ((hq) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۥ, reason: not valid java name and contains not printable characters */
    public static int m1884(int i, int i2, boolean z) {
        if (C0127.m1604() > 0) {
            return s91.d(i, i2, z);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۢۡۢ, reason: not valid java name and contains not printable characters */
    public static Object m1886(Object obj) {
        if (C0147.m1843() > 0) {
            return ((jc1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۧ۟, reason: contains not printable characters */
    public static void m1887(Object obj, Object obj2, Object obj3) throws CertificateException {
        if (C0135.m1701() >= 0) {
            ((X509TrustManager) obj).checkClientTrusted((X509Certificate[]) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۡۦۥ, reason: not valid java name and contains not printable characters */
    public static ha0 m1888(Object obj) {
        if (C0098.m1266() < 0) {
            return ((hq) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static String m1885(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
