package com.google.android.material.bottomappbar;

import android.support.v4.app.C0004;
import androidx.core.app.C0040;
import androidx.core.app.C0042;
import androidx.recyclerview.widget.C0065;
import androidx.window.reflection.C0081;
import androidx.window.reflection.C0082;
import com.google.android.material.focus.C0120;
import com.google.android.material.transformation.C0144;
import defpackage.bm;
import defpackage.el;
import defpackage.i91;
import defpackage.ob0;
import defpackage.rz;
import defpackage.tv0;
import defpackage.uc1;
import defpackage.ut0;
import defpackage.xg0;
import defpackage.xi0;
import defpackage.ye0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/* JADX INFO: renamed from: com.google.android.material.bottomappbar.ۥۨۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0100 {

    /* JADX INFO: renamed from: ۠ۥۨۦ, reason: not valid java name and contains not printable characters */
    public static int f106 = -687;

    /* JADX INFO: renamed from: ۟۟۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static Boolean m1276() {
        if (C0095.m1228() >= 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m1277(Object obj, Object obj2) {
        if (C0042.m566() < 0) {
            el.p((Closeable) obj, (Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m1278() {
        return (-665) ^ C0082.f82;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨۥ, reason: not valid java name and contains not printable characters */
    public static ut0 m1279() {
        if (C0065.m853() < 0) {
            return ut0.r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static TrustManager[] m1281(Object obj) {
        if (C0120.m1522() >= 0) {
            return ((TrustManagerFactory) obj).getTrustManagers();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int m1282(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static i91 m1283() {
        if (C0098.m1266() < 0) {
            return xg0.j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۦۢ, reason: contains not printable characters */
    public static void m1284(Object obj, long j, long j2, Object obj2, int i) {
        if (C0004.m65() > 0) {
            uc1.a((ye0) obj, j, j2, (ob0) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۥۥۣۢ, reason: contains not printable characters */
    public static String m1285(Object obj) {
        if (C0040.m542() <= 0) {
            return ((rz) obj).y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣۨ, reason: contains not printable characters */
    public static tv0 m1286(Object obj, float f) {
        if (C0144.m1814() <= 0) {
            return xi0.C((tv0) obj, f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۡۦ, reason: contains not printable characters */
    public static String m1287(String str) {
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

    /* JADX INFO: renamed from: ۨۦۥۨ, reason: not valid java name and contains not printable characters */
    public static long m1288(Object obj) {
        if (C0081.m1040() >= 0) {
            return ((bm) obj).K;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m1280(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
