package com.google.android.material.snackbar;

import android.support.v4.graphics.drawable.C0009;
import androidx.recyclerview.widget.C0066;
import com.google.android.material.behavior.C0093;
import com.google.android.material.floatingactionbutton.C0114;
import com.google.android.material.focus.C0118;
import com.google.android.material.search.C0126;
import com.google.android.material.sidesheet.C0133;
import defpackage.C0153;
import defpackage.C0155;
import defpackage.az1;
import defpackage.cr0;
import defpackage.hb;
import defpackage.je0;
import defpackage.kd1;
import defpackage.kf;
import defpackage.p3;
import defpackage.sv0;
import defpackage.wk;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.snackbar.۟ۦۡ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0137 {

    /* JADX INFO: renamed from: ۟۠ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static int f143 = 412;

    /* JADX INFO: renamed from: ۟۠۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static int m1720(float f) {
        if (C0133.m1681() >= 0) {
            return Math.round(f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m1721(Object obj, Object obj2) {
        if (C0093.m1203() > 0) {
            return ((cr0) obj).q(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static void m1722(Object obj, Object obj2) {
        if (C0114.m1448() > 0) {
            ((p3) obj).a((wk) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥۥۥ, reason: not valid java name and contains not printable characters */
    public static String m1723(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۨۡۧ, reason: not valid java name and contains not printable characters */
    public static Object m1724(Object obj, Object obj2) {
        if (C0118.m1484() >= 0) {
            return ((kf) obj).i(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m1725(Object obj, double d) {
        if (C0153.m1994() > 0) {
            return ((StringBuilder) obj).append(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static int m1726(Object obj) {
        if (C0066.m857() > 0) {
            return ((je0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۧ, reason: contains not printable characters */
    public static int m1727() {
        return 628 ^ C0155.f232;
    }

    /* JADX INFO: renamed from: ۥۤ۠ۢ, reason: contains not printable characters */
    public static int m1728(Object obj) {
        if (C0126.m1590() > 0) {
            return ((sv0) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥۤۦ, reason: contains not printable characters */
    public static int m1729(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۥۤۥ, reason: contains not printable characters */
    public static hb m1730(Object obj) {
        if (C0009.m122() > 0) {
            return kd1.o((az1) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m1719(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
