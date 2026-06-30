package androidx.appcompat.widget;

import android.os.Build;
import android.support.v4.graphics.drawable.C0008;
import android.text.C0011;
import android.view.C0024;
import androidx.profileinstaller.C0061;
import androidx.recyclerview.widget.C0068;
import androidx.window.reflection.C0081;
import com.google.android.material.behavior.C0089;
import com.google.android.material.bottomappbar.C0097;
import defpackage.dr;
import defpackage.eb0;
import defpackage.fb0;
import defpackage.g20;
import defpackage.ha0;
import defpackage.hb;
import defpackage.rd;
import defpackage.u2;
import defpackage.wq;
import defpackage.x61;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۨ۟ۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0033 {

    /* JADX INFO: renamed from: ۟ۦۣۨۨ, reason: not valid java name and contains not printable characters */
    public static int f33 = 850;

    /* JADX INFO: renamed from: ۣ۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static ha0 m433(Object obj) {
        if (C0068.m888() <= 0) {
            return ((wq) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static int m434(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m436() {
        return (-165) ^ C0008.f8;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m437(Object obj, int i) {
        if (C0081.m1040() > 0) {
            ((URLConnection) obj).setReadTimeout(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۨ۟, reason: not valid java name and contains not printable characters */
    public static rd m438(Object obj) {
        if (C0089.m1150() > 0) {
            return ((dr) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static g20 m439() {
        if (C0061.m803() <= 0) {
            return g20.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static String m440(Object obj) {
        if (C0011.m150() <= 0) {
            return ((hb) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m441(String str) {
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

    /* JADX INFO: renamed from: ۤۥۤ۠, reason: not valid java name and contains not printable characters */
    public static ha0 m442(Object obj) {
        if (C0081.m1040() >= 0) {
            return ((u2) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۢۢ, reason: contains not printable characters */
    public static eb0 m443(Object obj) {
        if (C0097.m1242() < 0) {
            return ((fb0) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۨ, reason: contains not printable characters */
    public static String m444() {
        if (C0061.m803() <= 0) {
            return Build.CPU_ABI;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static HttpURLConnection m445(Object obj) {
        if (C0030.m397() > 0) {
            return x61.a((URL) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۤ۟, reason: not valid java name and contains not printable characters */
    public static double m446(Object obj) {
        if (C0024.m321() > 0) {
            return ((Number) obj).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤ۟, reason: not valid java name and contains not printable characters */
    public static String m435(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
