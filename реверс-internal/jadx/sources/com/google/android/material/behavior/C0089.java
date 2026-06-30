package com.google.android.material.behavior;

import android.text.C0010;
import android.text.C0015;
import android.view.C0021;
import android.view.C0025;
import androidx.core.app.C0040;
import androidx.core.widget.C0052;
import androidx.graphics.path.C0055;
import androidx.lifecycle.C0060;
import androidx.versionedparcelable.C0076;
import com.google.android.material.transformation.C0146;
import com.reddit.frontpage.C0147;
import com.reddit.frontpage.C0149;
import defpackage.bq;
import defpackage.cd0;
import defpackage.dr0;
import defpackage.f70;
import defpackage.g70;
import defpackage.hq;
import defpackage.ks;
import defpackage.nt0;
import defpackage.pb1;
import defpackage.ry1;
import defpackage.tx;
import defpackage.xl;
import defpackage.xr1;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: renamed from: com.google.android.material.behavior.۟۠ۥۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0089 {

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int f95 = 752;

    /* JADX INFO: renamed from: ۟۠ۥۤۡ, reason: not valid java name and contains not printable characters */
    public static void m1149(Object obj, Object obj2) {
        if (C0052.m681() >= 0) {
            ((ry1) obj).q((cd0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۢ, reason: not valid java name and contains not printable characters */
    public static int m1150() {
        return (-253) ^ C0015.f15;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static void m1151(Object obj, Object obj2) {
        if (C0076.m975() <= 0) {
            ((nt0) obj).w(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠۟, reason: not valid java name and contains not printable characters */
    public static long m1152() {
        if (C0147.m1843() > 0) {
            return xl.f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۨ, reason: not valid java name and contains not printable characters */
    public static Object m1153(Object obj, Object obj2, Object obj3) {
        if (C0010.m137() < 0) {
            return ((f70) obj).c((g70) obj2, (ks) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۤ, reason: not valid java name and contains not printable characters */
    public static int m1154(Object obj) {
        if (C0149.m1865() < 0) {
            return ((hq) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۠۠, reason: not valid java name and contains not printable characters */
    public static String m1155(Object obj) {
        if (C0040.m542() <= 0) {
            return ((xr1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۧ۠, reason: not valid java name and contains not printable characters */
    public static void m1156(Object obj, Object obj2) {
        if (C0021.m285() < 0) {
            ((HttpsURLConnection) obj).setHostnameVerifier((HostnameVerifier) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static void m1157(Object obj, boolean z) {
        if (C0025.m340() > 0) {
            ((URLConnection) obj).setDoInput(z);
        }
    }

    /* JADX INFO: renamed from: ۣۢۢۨ, reason: not valid java name and contains not printable characters */
    public static List m1158(Object obj) {
        if (C0060.m781() <= 0) {
            return ((dr0) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۥۧ, reason: not valid java name and contains not printable characters */
    public static int m1159(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۥۣۨ, reason: not valid java name and contains not printable characters */
    public static pb1 m1161(Object obj, Object obj2) {
        if (C0055.m723() >= 0) {
            return ((bq) obj).a(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1162(Object obj) {
        if (C0146.m1831() > 0) {
            return ((tx) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۧۥۣ, reason: not valid java name and contains not printable characters */
    public static String m1163(String str) {
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

    /* JADX INFO: renamed from: ۢۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m1160(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
