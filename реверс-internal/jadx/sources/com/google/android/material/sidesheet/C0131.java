package com.google.android.material.sidesheet;

import android.view.C0021;
import android.view.View;
import androidx.graphics.path.C0054;
import androidx.lifecycle.C0060;
import androidx.versionedparcelable.C0075;
import com.google.android.material.behavior.C0090;
import com.google.android.material.carousel.C0110;
import com.google.android.material.carousel.C0111;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.search.C0124;
import defpackage.C0157;
import defpackage.bm;
import defpackage.dg1;
import defpackage.gk1;
import defpackage.gr0;
import defpackage.lr0;
import defpackage.ns1;
import defpackage.rc;
import defpackage.tv0;
import defpackage.xg0;
import defpackage.xi0;
import defpackage.ym1;
import java.io.ByteArrayOutputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import javax.net.ssl.TrustManagerFactory;

/* JADX INFO: renamed from: com.google.android.material.sidesheet.ۣ۟ۢۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0131 {

    /* JADX INFO: renamed from: ۨ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int f137 = -893;

    /* JADX INFO: renamed from: ۟ۢ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m1648(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static int m1649() {
        return 496 ^ C0060.f60;
    }

    /* JADX INFO: renamed from: ۟ۦۥۨۢ, reason: not valid java name and contains not printable characters */
    public static void m1650(Object obj) {
        if (C0111.m1412() <= 0) {
            ((lr0) obj).i();
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static tv0 m1651(Object obj, long j, Object obj2) {
        if (C0090.m1175() < 0) {
            return xi0.p((tv0) obj, j, (ym1) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۥۧ, reason: not valid java name and contains not printable characters */
    public static ns1 m1652(Object obj) {
        if (C0157.m2038() > 0) {
            return ((rc) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m1653(String str) {
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

    /* JADX INFO: renamed from: ۤۥۦۦ, reason: not valid java name and contains not printable characters */
    public static void m1654(Object obj, boolean z) {
        if (C0075.m968() > 0) {
            ((View) obj).setWillNotDraw(z);
        }
    }

    /* JADX INFO: renamed from: ۤۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m1655(Object obj, Object obj2) throws KeyStoreException {
        if (C0112.m1424() <= 0) {
            ((TrustManagerFactory) obj).init((KeyStore) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥ۠۟ۡ, reason: contains not printable characters */
    public static gk1 m1656(Object obj) {
        if (C0110.m1397() >= 0) {
            return ((bm) obj).b0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۤۥ, reason: contains not printable characters */
    public static int m1657(Object obj) {
        if (C0021.m285() <= 0) {
            return ((gr0) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m1659(Object obj) {
        if (C0124.m1574() > 0) {
            return ((xg0) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static int m1660(Object obj) {
        if (C0054.m711() > 0) {
            return ((dg1) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۢۥ, reason: contains not printable characters */
    public static String m1658(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
