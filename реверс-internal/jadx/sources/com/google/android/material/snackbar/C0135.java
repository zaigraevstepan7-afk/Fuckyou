package com.google.android.material.snackbar;

import android.media.MediaPlayer;
import android.support.v4.app.C0002;
import android.support.v4.graphics.drawable.C0006;
import android.view.translation.C0020;
import androidx.core.app.C0037;
import androidx.lifecycle.C0060;
import androidx.window.reflection.C0080;
import com.google.android.material.carousel.C0110;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.transformation.C0145;
import defpackage.am1;
import defpackage.bk;
import defpackage.f20;
import defpackage.s22;
import defpackage.vm;
import defpackage.yd;
import defpackage.ye0;
import defpackage.yl1;
import defpackage.zf1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.snackbar.۟۠ۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0135 {

    /* JADX INFO: renamed from: ۣ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static int f141 = -950;

    /* JADX INFO: renamed from: ۟۟۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m1695(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m1696(int i, Object obj) {
        if (C0037.m496() <= 0) {
            s22.i(i, obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static void m1697(Object obj) {
        if (C0110.m1397() > 0) {
            ((MediaPlayer) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static void m1698(Object obj, int i) {
        if (C0080.m1033() <= 0) {
            yl1.b((am1) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۢۨ, reason: not valid java name and contains not printable characters */
    public static f20 m1699(Object obj) {
        if (C0145.m1828() <= 0) {
            return ((vm) obj).B();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1700(Object obj) {
        if (C0112.m1424() < 0) {
            return ((yd) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۤ۠, reason: not valid java name and contains not printable characters */
    public static int m1701() {
        return (-538) ^ C0060.f60;
    }

    /* JADX INFO: renamed from: ۣۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static float m1702(Object obj) {
        if (C0020.m271() > 0) {
            return ((Float) obj).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۨۧ, reason: not valid java name and contains not printable characters */
    public static int m1704(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۧۡ۠, reason: not valid java name and contains not printable characters */
    public static ye0 m1705() {
        if (C0002.m39() > 0) {
            return bk.G();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1706(Object obj) {
        if (C0006.m96() >= 0) {
            return ((zf1) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۢ, reason: not valid java name and contains not printable characters */
    public static String m1703(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
