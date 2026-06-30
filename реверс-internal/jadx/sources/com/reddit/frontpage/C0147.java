package com.reddit.frontpage;

import android.content.ContentResolver;
import android.content.Context;
import android.support.v4.graphics.drawable.C0008;
import androidx.recyclerview.widget.C0067;
import androidx.versionedparcelable.C0076;
import com.google.android.material.appbar.C0087;
import com.google.android.material.bottomappbar.C0097;
import com.google.android.material.bottomappbar.C0100;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.carousel.C0110;
import com.google.android.material.snackbar.C0138;
import defpackage.C0157;
import defpackage.af1;
import defpackage.bk;
import defpackage.bl;
import defpackage.bm;
import defpackage.d02;
import defpackage.dn1;
import defpackage.ez1;
import defpackage.fx1;
import defpackage.l81;
import defpackage.lk;
import defpackage.lk0;
import defpackage.nk0;
import defpackage.ob0;
import defpackage.pc1;
import defpackage.ql0;
import defpackage.sa0;
import defpackage.tv0;
import defpackage.wa0;
import defpackage.xw;
import defpackage.ye0;
import defpackage.ym1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.reddit.frontpage.۟ۤۦۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0147 {

    /* JADX INFO: renamed from: ۟ۡۡ۟۟, reason: not valid java name and contains not printable characters */
    public static int f153 = 611;

    /* JADX INFO: renamed from: ۣ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static int m1840(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static ql0 m1842(Object obj) {
        if (C0105.m1343() < 0) {
            return bl.P((xw) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m1843() {
        return 124 ^ C0067.f67;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static ContentResolver m1844(Object obj) {
        if (C0087.m1123() <= 0) {
            return ((Context) obj).getContentResolver();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۨ, reason: not valid java name and contains not printable characters */
    public static String m1845(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۤۨۢ۠, reason: not valid java name and contains not printable characters */
    public static float m1846(Object obj) {
        if (C0008.m116() >= 0) {
            return ((dn1) obj).j;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۤۨۤ, reason: not valid java name and contains not printable characters */
    public static void m1847(Object obj, Object obj2, Object obj3, boolean z, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, boolean z2, int i, int i2, Object obj12, Object obj13, Object obj14, int i3, int i4, int i5) {
        if (C0076.m975() <= 0) {
            af1.e((String) obj, (sa0) obj2, (tv0) obj3, z, (d02) obj4, (wa0) obj5, (wa0) obj6, (wa0) obj7, (wa0) obj8, (ez1) obj9, (nk0) obj10, (lk0) obj11, z2, i, i2, (ym1) obj12, (fx1) obj13, (ob0) obj14, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: ۥۣۤ۠, reason: contains not printable characters */
    public static boolean m1848(float f) {
        if (C0097.m1242() < 0) {
            return Float.isNaN(f);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۥ, reason: contains not printable characters */
    public static boolean m1849(Object obj, long j) {
        if (C0100.m1278() > 0) {
            return ((pc1) obj).a(j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۡۨ, reason: not valid java name and contains not printable characters */
    public static ye0 m1850() {
        if (C0110.m1397() > 0) {
            return bk.C();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1851(Object obj) {
        if (C0157.m2038() >= 0) {
            return lk.t((l81) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۧ۠, reason: not valid java name and contains not printable characters */
    public static long m1852(Object obj) {
        if (C0138.m1738() > 0) {
            return ((bm) obj).i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m1841(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
