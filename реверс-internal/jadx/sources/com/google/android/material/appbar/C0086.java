package com.google.android.material.appbar;

import android.support.v4.app.C0002;
import android.text.C0010;
import android.text.C0012;
import android.view.C0021;
import android.view.C0024;
import android.view.C0026;
import android.view.View;
import android.view.translation.C0017;
import android.view.translation.C0018;
import androidx.core.widget.C0050;
import androidx.window.reflection.C0079;
import androidx.window.reflection.C0080;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.search.C0127;
import com.google.android.material.sidesheet.C0130;
import defpackage.C0155;
import defpackage.aq1;
import defpackage.ay0;
import defpackage.cm;
import defpackage.da1;
import defpackage.dv0;
import defpackage.g32;
import defpackage.gk1;
import defpackage.hd1;
import defpackage.ln;
import defpackage.lz;
import defpackage.mu0;
import defpackage.qv0;
import defpackage.rz;
import defpackage.t62;
import defpackage.uc1;
import defpackage.v20;
import defpackage.vx;
import defpackage.wi0;
import defpackage.xi0;
import defpackage.y41;
import defpackage.yp1;
import defpackage.ys1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.appbar.ۣۨۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0086 {

    /* JADX INFO: renamed from: ۟ۦ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static int f92 = 930;

    /* JADX INFO: renamed from: ۟۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m1104(String str) {
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

    /* JADX INFO: renamed from: ۟ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static ay0 m1105(Object obj) {
        if (C0017.m229() < 0) {
            return ((hd1) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static v20 m1106(Object obj) {
        if (C0127.m1604() >= 0) {
            return ((vx) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static int m1107() {
        return 928 ^ C0130.f136;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static ys1 m1108() {
        if (C0113.m1443() >= 0) {
            return mu0.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۦۨ, reason: not valid java name and contains not printable characters */
    public static lz m1109() {
        if (C0018.m241() < 0) {
            return lz.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۧ, reason: not valid java name and contains not printable characters */
    public static void m1110(Object obj, float f, float f2, float f3, float f4, float f5, float f6) {
        if (C0021.m285() < 0) {
            ((y41) obj).r(f, f2, f3, f4, f5, f6);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ۠, reason: not valid java name and contains not printable characters */
    public static cm m1111() {
        if (C0002.m39() > 0) {
            return xi0.A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۢ۟, reason: not valid java name and contains not printable characters */
    public static g32 m1112() {
        if (C0087.m1123() < 0) {
            return wi0.o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static ln m1113(Object obj) {
        if (C0026.m355() >= 0) {
            return ((dv0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static t62 m1114(Object obj) {
        if (C0024.m321() >= 0) {
            return uc1.k((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1115(Object obj) {
        if (C0010.m137() <= 0) {
            return ((da1) obj).k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static cm m1116() {
        if (C0012.m162() >= 0) {
            return xi0.Q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int m1117(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۢ۟, reason: not valid java name and contains not printable characters */
    public static yp1 m1118() {
        if (C0079.m1016() <= 0) {
            return aq1.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m1119(Object obj) {
        if (C0080.m1033() < 0) {
            return ((rz) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۨۥ, reason: not valid java name and contains not printable characters */
    public static qv0 m1121() {
        if (C0155.m2019() > 0) {
            return qv0.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static long m1122(Object obj) {
        if (C0050.m661() >= 0) {
            return ((gk1) obj).e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m1120(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
