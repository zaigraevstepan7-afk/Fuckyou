package com.google.android.material.behavior;

import android.view.C0025;
import androidx.compose.ui.input.pointer.C0034;
import androidx.core.app.C0038;
import com.google.android.material.appbar.C0086;
import com.google.android.material.search.C0123;
import com.google.android.material.search.C0126;
import com.google.android.material.transformation.C0142;
import defpackage.bm;
import defpackage.fy0;
import defpackage.rc;
import defpackage.w4;
import defpackage.wr1;
import defpackage.ys1;
import defpackage.z91;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;

/* JADX INFO: renamed from: com.google.android.material.behavior.ۣۤ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0093 {

    /* JADX INFO: renamed from: ۟ۥۣۨۨ, reason: not valid java name and contains not printable characters */
    public static int f99 = -823;

    /* JADX INFO: renamed from: ۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static fy0 m1202(Object obj) {
        if (C0034.m451() < 0) {
            return ((rc) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m1203() {
        return 922 ^ C0142.f148;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m1205(Object obj) {
        if (C0086.m1107() >= 0) {
            return ((z91) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥ۟, reason: not valid java name and contains not printable characters */
    public static String m1206(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static ys1 m1207() {
        if (C0038.m509() >= 0) {
            return w4.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠۠, reason: not valid java name and contains not printable characters */
    public static void m1208(Object obj, int i) {
        if (C0025.m340() >= 0) {
            ((URLConnection) obj).setConnectTimeout(i);
        }
    }

    /* JADX INFO: renamed from: ۣۥۧۨ, reason: not valid java name and contains not printable characters */
    public static String m1209(Object obj) {
        if (C0126.m1590() >= 0) {
            return ((wr1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۤ, reason: not valid java name and contains not printable characters */
    public static int m1210(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static long m1211(Object obj) {
        if (C0123.m1562() <= 0) {
            return ((bm) obj).O;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static String m1204(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
