package com.google.android.material.floatingactionbutton;

import android.content.ContentResolver;
import android.net.Uri;
import android.support.v4.app.C0004;
import android.text.C0011;
import com.google.android.material.bottomappbar.C0095;
import com.google.android.material.focus.C0119;
import com.google.android.material.transformation.C0146;
import defpackage.C0153;
import defpackage.f20;
import defpackage.h20;
import defpackage.h22;
import defpackage.hk;
import defpackage.kg1;
import defpackage.ng0;
import defpackage.pn1;
import defpackage.vd;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ۣ۟ۧ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0116 {

    /* JADX INFO: renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static int f122 = -871;

    /* JADX INFO: renamed from: ۟۠ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static InputStream m1463(Object obj, Object obj2) {
        if (C0095.m1228() >= 0) {
            return ((ContentResolver) obj).openInputStream((Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static long m1464(Object obj, Object obj2) {
        if (C0004.m65() > 0) {
            return hk.y((f20) obj, (h20) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static int m1465(Object obj) {
        if (C0011.m150() <= 0) {
            return ((vd) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m1466(Object obj) {
        if (C0153.m1994() >= 0) {
            ng0.a((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۢۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static kg1 m1467(Object obj) {
        if (C0113.m1443() >= 0) {
            return ((pn1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۣۧ, reason: not valid java name and contains not printable characters */
    public static String m1468(String str) {
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

    /* JADX INFO: renamed from: ۥۧ۟ۥ, reason: contains not printable characters */
    public static int m1469(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static int m1470() {
        return (-994) ^ C0146.f152;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static h22 m1471() {
        if (C0119.m1511() > 0) {
            return h22.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۡۥ, reason: not valid java name and contains not printable characters */
    public static String m1462(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
