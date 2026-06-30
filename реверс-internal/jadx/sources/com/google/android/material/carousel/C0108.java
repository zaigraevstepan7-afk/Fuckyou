package com.google.android.material.carousel;

import android.text.C0016;
import androidx.core.app.C0044;
import androidx.core.widget.C0050;
import androidx.profileinstaller.C0061;
import com.google.android.material.sidesheet.C0132;
import com.google.android.material.sidesheet.C0134;
import com.google.android.material.transformation.C0144;
import com.google.android.material.transformation.C0146;
import com.reddit.frontpage.C0151;
import defpackage.bk;
import defpackage.dr;
import defpackage.ef1;
import defpackage.er0;
import defpackage.fy0;
import defpackage.g12;
import defpackage.g70;
import defpackage.ih1;
import defpackage.mp;
import defpackage.nz;
import defpackage.ye0;
import defpackage.z91;
import defpackage.zx0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.carousel.ۣ۟ۢۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0108 {

    /* JADX INFO: renamed from: ۦۥۣۤ, reason: contains not printable characters */
    public static int f114 = -941;

    /* JADX INFO: renamed from: ۟ۡۡۡۡ, reason: not valid java name and contains not printable characters */
    public static ye0 m1367() {
        if (C0146.m1831() >= 0) {
            return bk.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static zx0 m1368(Object obj) {
        if (C0132.m1666() <= 0) {
            return ((ih1) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Void m1369(Object obj) {
        if (C0061.m803() <= 0) {
            return mp.b((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۥ, reason: not valid java name and contains not printable characters */
    public static g12 m1370(double d, double d2) {
        if (C0134.m1687() < 0) {
            return ef1.h(d, d2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static long m1371(Object obj) {
        if (C0044.m586() < 0) {
            return ((nz) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static int m1372(Object obj) {
        if (C0016.m218() < 0) {
            return ((er0) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m1373() {
        return 680 ^ C0050.f50;
    }

    /* JADX INFO: renamed from: ۦۣۤۤ, reason: contains not printable characters */
    public static String m1374(String str) {
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

    /* JADX INFO: renamed from: ۣۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static g70 m1375(Object obj) {
        if (C0144.m1814() < 0) {
            return ((z91) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static fy0 m1376(Object obj) {
        if (C0151.m1894() >= 0) {
            return ((dr) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۡ, reason: not valid java name and contains not printable characters */
    public static int m1377(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m1366(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
