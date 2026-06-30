package com.google.android.material.search;

import android.support.v4.graphics.drawable.C0007;
import androidx.core.app.C0044;
import androidx.startup.C0071;
import androidx.startup.C0072;
import androidx.startup.C0073;
import com.google.android.material.snackbar.C0135;
import com.google.android.material.transformation.C0142;
import defpackage.br;
import defpackage.cr;
import defpackage.da2;
import defpackage.en1;
import defpackage.ob0;
import defpackage.qn1;
import defpackage.sa0;
import defpackage.sg;
import defpackage.tv0;
import defpackage.ym1;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.android.material.search.ۣ۟ۢۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0125 {

    /* JADX INFO: renamed from: ۣۤۡ۠, reason: not valid java name and contains not printable characters */
    public static int f131 = 494;

    /* JADX INFO: renamed from: ۟ۢۡۡۨ, reason: not valid java name and contains not printable characters */
    public static InputStream m1577(Object obj) {
        if (C0007.m100() >= 0) {
            return ((Process) obj).getInputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m1578(String str) {
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

    /* JADX INFO: renamed from: ۠ۥۤ۟, reason: not valid java name and contains not printable characters */
    public static ym1 m1579(Object obj, Object obj2) {
        if (C0135.m1701() >= 0) {
            return qn1.b((en1) obj, (ob0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۡۤ, reason: not valid java name and contains not printable characters */
    public static long m1580(Object obj) {
        if (C0142.m1788() > 0) {
            return ((da2) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۡ, reason: contains not printable characters */
    public static Object m1581(Object obj) {
        if (C0072.m936() < 0) {
            return ((cr) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۟, reason: contains not printable characters */
    public static sa0 m1582(Object obj) {
        if (C0044.m586() < 0) {
            return ((br) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۥ, reason: contains not printable characters */
    public static int m1583(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۢ, reason: not valid java name and contains not printable characters */
    public static int m1584() {
        return (-119) ^ C0073.f73;
    }

    /* JADX INFO: renamed from: ۨۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m1585(Object obj, Object obj2, int i) {
        if (C0071.m922() < 0) {
            sg.a((tv0) obj, (ob0) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m1576(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
