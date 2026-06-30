package com.google.android.material.bottomappbar;

import android.app.C0001;
import android.content.res.Configuration;
import android.support.v4.app.C0003;
import android.view.View;
import androidx.core.graphics.drawable.C0047;
import androidx.startup.C0070;
import androidx.window.reflection.C0081;
import com.google.android.material.appbar.C0085;
import com.google.android.material.behavior.C0091;
import com.google.android.material.bottomsheet.C0106;
import com.google.android.material.search.C0124;
import com.google.android.material.search.C0127;
import com.google.android.material.transformation.C0139;
import com.reddit.frontpage.C0148;
import defpackage.ax1;
import defpackage.br;
import defpackage.ck0;
import defpackage.e72;
import defpackage.fy0;
import defpackage.ha0;
import defpackage.kt1;
import defpackage.lw;
import defpackage.ns1;
import defpackage.ob0;
import defpackage.qs1;
import defpackage.qy;
import defpackage.rc;
import defpackage.rw1;
import defpackage.sa0;
import defpackage.tv0;
import defpackage.x2;
import defpackage.xq0;
import defpackage.yl1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.bottomappbar.ۣۡۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0098 {

    /* JADX INFO: renamed from: ۠ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static int f104 = 535;

    /* JADX INFO: renamed from: ۟۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static void m1251(Object obj, Object obj2) {
        if (C0101.m1291() <= 0) {
            ((fy0) obj).setValue(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m1252(Object obj, Object obj2, long j, long j2, Object obj3, Object obj4, float f, float f2, Object obj5, float f3, float f4, Object obj6, int i) {
        if (C0085.m1094() > 0) {
            e72.a((ha0) obj, (tv0) obj2, j, j2, (kt1) obj3, (kt1) obj4, f, f2, (sa0) obj5, f3, f4, (ob0) obj6, i);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static lw m1253() {
        if (C0127.m1604() >= 0) {
            return qy.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۣ, reason: not valid java name and contains not printable characters */
    public static String m1254(Object obj) {
        if (C0139.m1754() <= 0) {
            return ((br) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۥۣ, reason: not valid java name and contains not printable characters */
    public static String m1255(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۤۡۦ, reason: not valid java name and contains not printable characters */
    public static ns1 m1256(Object obj) {
        if (C0148.m1860() > 0) {
            return ((rc) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۡ, reason: not valid java name and contains not printable characters */
    public static int m1257(Object obj) {
        if (C0001.m16() <= 0) {
            return ((ax1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1258(Object obj) {
        if (C0106.m1348() >= 0) {
            return ((xq0) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۢۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m1259(Object obj) {
        if (C0047.m622() <= 0) {
            return ((View) obj).isInEditMode();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m1260(Object obj) {
        if (C0124.m1574() >= 0) {
            return ((x2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static int m1261(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۥۧۧ, reason: not valid java name and contains not printable characters */
    public static ck0[] m1262() {
        if (C0081.m1040() > 0) {
            return yl1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۨۢ, reason: not valid java name and contains not printable characters */
    public static int m1263(Object obj) {
        if (C0001.m16() < 0) {
            return ((Configuration) obj).uiMode;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۦۤ, reason: not valid java name and contains not printable characters */
    public static String m1264(Object obj) {
        if (C0070.m915() < 0) {
            return ((rw1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۥۥ, reason: contains not printable characters */
    public static void m1265(Object obj, Object obj2) {
        if (C0091.m1182() > 0) {
            ((qs1) obj).j(obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۥ۠ۧ, reason: contains not printable characters */
    public static int m1266() {
        return (-188) ^ C0003.f3;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m1267(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
