package com.google.android.material.transformation;

import android.view.translation.C0020;
import androidx.appcompat.app.C0028;
import androidx.core.graphics.drawable.C0047;
import androidx.core.widget.C0051;
import androidx.graphics.path.C0054;
import androidx.graphics.path.C0057;
import androidx.versionedparcelable.C0074;
import com.google.android.material.bottomappbar.C0100;
import com.google.android.material.bottomsheet.C0104;
import defpackage.C0157;
import defpackage.ay0;
import defpackage.cn1;
import defpackage.f20;
import defpackage.jc1;
import defpackage.ns1;
import defpackage.qc;
import defpackage.td;
import defpackage.uq;
import defpackage.uz;
import defpackage.vm;
import defpackage.vx;
import defpackage.y2;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.transformation.۟ۦۡۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0143 {

    /* JADX INFO: renamed from: ۦۤۡۨ, reason: contains not printable characters */
    public static int f149 = 578;

    /* JADX INFO: renamed from: ۟۟ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static uz m1795() {
        if (C0074.m963() > 0) {
            return cn1.i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static int m1796() {
        return 808 ^ C0057.f57;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m1797(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۦۨۨ, reason: not valid java name and contains not printable characters */
    public static ns1 m1798(Object obj) {
        if (C0157.m2038() > 0) {
            return ((qc) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۧۡ, reason: not valid java name and contains not printable characters */
    public static f20 m1799(Object obj) {
        if (C0020.m271() > 0) {
            return ((vm) obj).G();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static ay0 m1800(Object obj) {
        if (C0051.m670() > 0) {
            return ((jc1) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static String m1801(Object obj) {
        if (C0100.m1278() > 0) {
            return ((y2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦۢ, reason: not valid java name and contains not printable characters */
    public static int m1802(boolean z) {
        if (C0054.m711() > 0) {
            return Boolean.hashCode(z);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static int m1803(Object obj) {
        if (C0028.m368() <= 0) {
            return ((uq) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m1804(String str) {
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

    /* JADX INFO: renamed from: ۤۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m1805(Object obj) {
        if (C0104.m1332() >= 0) {
            return ((vx) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m1806(Object obj) {
        if (C0047.m622() < 0) {
            return ((td) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m1794(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
