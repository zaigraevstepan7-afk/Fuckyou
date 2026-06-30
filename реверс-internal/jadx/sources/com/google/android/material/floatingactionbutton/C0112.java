package com.google.android.material.floatingactionbutton;

import android.support.v4.graphics.drawable.C0007;
import androidx.core.app.C0037;
import androidx.lifecycle.C0060;
import com.google.android.material.search.C0126;
import defpackage.lt0;
import defpackage.ns1;
import defpackage.ob0;
import defpackage.qc;
import defpackage.tv0;
import defpackage.xi0;
import defpackage.xl;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ۣ۟ۡۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0112 {

    /* JADX INFO: renamed from: ۡۨۥۥ, reason: not valid java name and contains not printable characters */
    public static int f118 = 199;

    /* JADX INFO: renamed from: ۟۟ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static String m1419(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m1421(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static long m1422() {
        if (C0060.m781() < 0) {
            return xl.e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m1423(Object obj, Object obj2, int i) {
        if (C0126.m1590() > 0) {
            xi0.b((String) obj, (ob0) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m1424() {
        return (-448) ^ C0037.f37;
    }

    /* JADX INFO: renamed from: ۟ۧۤۡۥ, reason: not valid java name and contains not printable characters */
    public static ns1 m1425(Object obj) {
        if (C0037.m496() <= 0) {
            return ((qc) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۡۡ, reason: not valid java name and contains not printable characters */
    public static tv0 m1426(Object obj) {
        if (C0007.m100() > 0) {
            return ((lt0) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣ۠, reason: not valid java name and contains not printable characters */
    public static String m1420(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
