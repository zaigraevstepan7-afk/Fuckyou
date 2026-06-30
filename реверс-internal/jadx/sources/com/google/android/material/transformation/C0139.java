package com.google.android.material.transformation;

import android.app.C0000;
import android.support.v4.app.C0005;
import androidx.core.graphics.drawable.C0046;
import androidx.lifecycle.C0059;
import androidx.recyclerview.widget.C0068;
import com.google.android.material.appbar.C0087;
import com.google.android.material.bottomappbar.C0101;
import com.google.android.material.floatingactionbutton.C0116;
import defpackage.bm;
import defpackage.d40;
import defpackage.dr0;
import defpackage.hk;
import defpackage.oi1;
import defpackage.pz1;
import defpackage.s41;
import defpackage.tk0;
import defpackage.tv0;
import defpackage.vw0;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.material.transformation.۟۟۠ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0139 {

    /* JADX INFO: renamed from: ۟ۧ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int f145 = -254;

    /* JADX INFO: renamed from: ۟۟ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static List m1750(Object obj) {
        if (C0005.m75() > 0) {
            return hk.H((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۢ۠, reason: not valid java name and contains not printable characters */
    public static int m1751(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1752(Object obj) {
        if (C0059.m769() > 0) {
            return ((dr0) obj).l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static int m1754() {
        return 129 ^ C0101.f107;
    }

    /* JADX INFO: renamed from: ۟ۦۨۡۤ, reason: not valid java name and contains not printable characters */
    public static d40 m1755() {
        if (C0046.m616() <= 0) {
            return d40.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۤۤ, reason: not valid java name and contains not printable characters */
    public static tv0 m1756(Object obj) {
        if (C0116.m1470() <= 0) {
            return ((oi1) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۧ۠, reason: not valid java name and contains not printable characters */
    public static vw0 m1757(Object obj) {
        if (C0087.m1123() < 0) {
            return ((pz1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦۧ, reason: not valid java name and contains not printable characters */
    public static Object m1758(Object obj) {
        if (C0000.m0() <= 0) {
            return ((tk0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦ۠ۤ, reason: contains not printable characters */
    public static long m1759(Object obj) {
        if (C0142.m1788() >= 0) {
            return ((bm) obj).S;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m1760(Object obj) {
        if (C0068.m888() <= 0) {
            return ((s41) obj).g();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۢۧ, reason: not valid java name and contains not printable characters */
    public static String m1761(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۥۣ۟, reason: not valid java name and contains not printable characters */
    public static String m1753(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
