package com.google.android.material.bottomsheet;

import android.view.KeyEvent;
import androidx.appcompat.widget.C0033;
import androidx.window.reflection.C0083;
import com.google.android.material.appbar.C0085;
import com.google.android.material.appbar.C0086;
import com.google.android.material.behavior.C0093;
import com.google.android.material.focus.C0121;
import com.google.android.material.transformation.C0139;
import com.google.android.material.transformation.C0140;
import defpackage.al;
import defpackage.f20;
import defpackage.fy0;
import defpackage.h20;
import defpackage.hb;
import defpackage.kq;
import defpackage.sv0;
import defpackage.vd;
import defpackage.wk;
import defpackage.yw;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.۟ۦۢۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0103 {

    /* JADX INFO: renamed from: ۦۨۧ۠, reason: contains not printable characters */
    public static int f109 = -401;

    /* JADX INFO: renamed from: ۟۟ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static String m1316(Object obj) {
        if (C0083.m1068() > 0) {
            return ((kq) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static double m1317(Object obj, Object obj2) {
        if (C0085.m1094() > 0) {
            return ((f20) obj).a((h20) obj2);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m1318(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۢۨۥ, reason: not valid java name and contains not printable characters */
    public static String m1319(String str) {
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

    /* JADX INFO: renamed from: ۣ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m1321(Object obj) {
        if (C0139.m1754() < 0) {
            return ((String) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۣۢ, reason: not valid java name and contains not printable characters */
    public static int m1322() {
        return 715 ^ C0140.f146;
    }

    /* JADX INFO: renamed from: ۢ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static wk m1323(Object obj) {
        if (C0121.m1535() > 0) {
            return al.R((hb) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۨۡ, reason: contains not printable characters */
    public static sv0 m1324(Object obj) {
        if (C0093.m1203() > 0) {
            return ((yw) obj).t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۥ, reason: contains not printable characters */
    public static int m1325(Object obj) {
        if (C0086.m1107() >= 0) {
            return ((KeyEvent) obj).getKeyCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static fy0 m1326(Object obj) {
        if (C0033.m436() > 0) {
            return ((vd) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۢۤ, reason: not valid java name and contains not printable characters */
    public static String m1320(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
