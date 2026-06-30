package com.google.android.material.sidesheet;

import android.app.C0001;
import android.view.C0027;
import androidx.core.app.C0044;
import androidx.startup.C0069;
import com.google.android.material.behavior.C0088;
import com.google.android.material.bottomappbar.C0097;
import com.google.android.material.snackbar.C0135;
import com.google.android.material.transformation.C0139;
import com.reddit.frontpage.C0148;
import defpackage.bg1;
import defpackage.g12;
import defpackage.g20;
import defpackage.g70;
import defpackage.ha0;
import defpackage.iq;
import defpackage.ji;
import defpackage.ks;
import defpackage.ld0;
import defpackage.ob0;
import defpackage.om;
import defpackage.tv0;
import defpackage.u42;
import defpackage.wa0;
import defpackage.wq;
import defpackage.xi0;
import java.io.ByteArrayOutputStream;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import java.util.Iterator;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* JADX INFO: renamed from: com.google.android.material.sidesheet.ۦۣۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0134 {

    /* JADX INFO: renamed from: ۟۟ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static int f140 = -69;

    /* JADX INFO: renamed from: ۣ۟۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m1683(Object obj, Object obj2, Object obj3, Object obj4) throws KeyManagementException {
        if (C0148.m1860() >= 0) {
            ((SSLContext) obj).init((KeyManager[]) obj2, (TrustManager[]) obj3, (SecureRandom) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static ha0 m1684(Object obj) {
        if (C0069.m906() <= 0) {
            return ((wq) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۦۣ, reason: not valid java name and contains not printable characters */
    public static int m1685(Object obj) {
        if (C0135.m1701() > 0) {
            return ((ji) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨۧۧ, reason: not valid java name and contains not printable characters */
    public static String m1686(Object obj) {
        if (C0027.m365() < 0) {
            return ((bg1) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m1687() {
        return (-820) ^ C0001.f1;
    }

    /* JADX INFO: renamed from: ۠۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static Iterator m1688(Object obj) {
        if (C0097.m1242() <= 0) {
            return ((Iterable) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m1689(Object obj, Object obj2, Object obj3) {
        if (C0139.m1754() <= 0) {
            return ((g70) obj).l(obj2, (ks) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۥ۟, reason: not valid java name and contains not printable characters */
    public static g12 m1690(Object obj, Object obj2, Object obj3, boolean z, Object obj4, double d) {
        if (C0044.m586() < 0) {
            return ((om) obj).j((u42) obj2, (ld0) obj3, z, (g20) obj4, d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static void m1691(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        if (C0088.m1147() < 0) {
            xi0.k((iq) obj, (wa0) obj2, (tv0) obj3, (ob0) obj4, i);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m1692(String str) {
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

    /* JADX INFO: renamed from: ۨۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m1693(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m1694(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
