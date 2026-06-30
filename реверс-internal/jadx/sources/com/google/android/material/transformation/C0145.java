package com.google.android.material.transformation;

import android.app.C0000;
import android.view.C0023;
import androidx.appcompat.widget.C0032;
import androidx.lifecycle.C0058;
import androidx.startup.C0069;
import androidx.startup.C0072;
import androidx.versionedparcelable.C0074;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.carousel.C0111;
import com.google.android.material.search.C0123;
import com.google.android.material.sidesheet.C0134;
import defpackage.aa2;
import defpackage.ba2;
import defpackage.da2;
import defpackage.ei1;
import defpackage.f20;
import defpackage.fp;
import defpackage.fy0;
import defpackage.gh1;
import defpackage.sq;
import defpackage.vm;
import defpackage.vq;
import defpackage.wa0;
import defpackage.wd;
import defpackage.x61;
import defpackage.xg0;
import defpackage.y41;
import defpackage.ye0;
import defpackage.yh1;
import java.io.ByteArrayOutputStream;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.google.android.material.transformation.ۥۢۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0145 {

    /* JADX INFO: renamed from: ۦۤۢۢ, reason: contains not printable characters */
    public static int f151 = 695;

    /* JADX INFO: renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m1815(Object obj, Object obj2) {
        if (C0069.m906() < 0) {
            ((fp) obj).setContent((wa0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static f20 m1816(Object obj) {
        if (C0072.m936() < 0) {
            return ((vm) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m1817(Object obj) {
        if (C0074.m963() >= 0) {
            return ((aa2) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m1818(Object obj) {
        if (C0058.m756() < 0) {
            return ((wd) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static fy0 m1819(Object obj) {
        if (C0023.m313() >= 0) {
            return ((vq) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡۤ, reason: not valid java name and contains not printable characters */
    public static void m1820(Object obj, float f) {
        if (C0000.m0() <= 0) {
            ((y41) obj).u(f);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static ye0 m1821(Object obj) {
        if (C0123.m1562() < 0) {
            return ((ba2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۡۦ, reason: not valid java name and contains not printable characters */
    public static int m1822(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static ye0 m1823(Object obj) {
        if (C0111.m1412() <= 0) {
            return ((da2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧۡ, reason: not valid java name and contains not printable characters */
    public static SSLSocketFactory m1824() {
        if (C0069.m906() < 0) {
            return x61.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧ۟, reason: not valid java name and contains not printable characters */
    public static String m1825(String str) {
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
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۤۧۢۥ, reason: not valid java name and contains not printable characters */
    public static Object m1826(Object obj, Object obj2, Object obj3) {
        if (C0032.m419() <= 0) {
            return ei1.a(obj, (yh1) obj2, (gh1) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۢۥ, reason: not valid java name and contains not printable characters */
    public static int m1828() {
        return (-158) ^ C0098.f104;
    }

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public static xg0 m1829(Object obj) {
        if (C0134.m1687() < 0) {
            return ((sq) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤ۟, reason: contains not printable characters */
    public static String m1827(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
