package com.google.android.material.search;

import android.view.C0021;
import android.view.C0027;
import androidx.appcompat.app.C0029;
import androidx.appcompat.widget.C0030;
import androidx.core.graphics.drawable.C0049;
import androidx.recyclerview.widget.C0068;
import androidx.versionedparcelable.C0075;
import androidx.window.reflection.C0083;
import com.google.android.material.behavior.C0089;
import com.google.android.material.sidesheet.C0134;
import com.google.android.material.transformation.C0140;
import com.google.android.material.transformation.C0141;
import defpackage.bl;
import defpackage.bm;
import defpackage.bp;
import defpackage.ea2;
import defpackage.ha0;
import defpackage.iy0;
import defpackage.ns1;
import defpackage.nz;
import defpackage.ob0;
import defpackage.qq;
import defpackage.qs1;
import defpackage.rc;
import defpackage.sv0;
import defpackage.uc1;
import defpackage.ye0;
import defpackage.z2;
import defpackage.zx0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.search.ۣ۟۟۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0123 {

    /* JADX INFO: renamed from: ۥۣۣۧ, reason: contains not printable characters */
    public static int f129 = 259;

    /* JADX INFO: renamed from: ۣ۟۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m1549(Object obj) {
        if (C0049.m645() > 0) {
            return ((bp) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static long m1550(Object obj) {
        if (C0083.m1068() > 0) {
            return ((bm) obj).z;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨۧ, reason: not valid java name and contains not printable characters */
    public static double m1552(Object obj) {
        if (C0089.m1150() >= 0) {
            return ((nz) obj).b;
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static ye0 m1553(Object obj) {
        if (C0075.m968() >= 0) {
            return ((ea2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m1554(Object obj, Object obj2) {
        if (C0021.m285() <= 0) {
            bl.h((iy0) obj, (sv0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static String m1555(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۤۧۥ, reason: not valid java name and contains not printable characters */
    public static int m1556(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static ns1 m1557(Object obj) {
        if (C0027.m365() < 0) {
            return ((rc) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m1558(Object obj, char c) {
        if (C0030.m397() > 0) {
            return ((StringBuilder) obj).append(c);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1559(Object obj) {
        if (C0029.m384() >= 0) {
            return ((qq) obj).m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static Object[] m1560(Object obj) {
        if (C0140.m1768() >= 0) {
            return ((zx0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static Object m1561(Object obj) {
        if (C0134.m1687() < 0) {
            return ((qs1) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۡۧ, reason: not valid java name and contains not printable characters */
    public static int m1562() {
        return 376 ^ C0068.f68;
    }

    /* JADX INFO: renamed from: ۣۧۤۢ, reason: not valid java name and contains not printable characters */
    public static void m1563(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        if (C0141.m1778() <= 0) {
            uc1.c((z2) obj, (ha0) obj2, (ha0) obj3, (ob0) obj4, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠۠۠, reason: not valid java name and contains not printable characters */
    public static String m1551(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
