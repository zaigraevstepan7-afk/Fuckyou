package com.reddit.frontpage;

import androidx.appcompat.app.C0029;
import androidx.startup.C0071;
import com.google.android.material.carousel.C0109;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.floatingactionbutton.C0114;
import com.google.android.material.snackbar.C0137;
import defpackage.a3;
import defpackage.bd;
import defpackage.e20;
import defpackage.f20;
import defpackage.ob0;
import defpackage.sf;
import defpackage.sg1;
import defpackage.tg1;
import defpackage.v20;
import defpackage.vr1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.reddit.frontpage.۟ۦ۟ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0148 {

    /* JADX INFO: renamed from: ۟ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static int f154 = -676;

    /* JADX INFO: renamed from: ۟۠ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static Double m1853(double d) {
        if (C0029.m384() > 0) {
            return Double.valueOf(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m1854(Object obj, long j) {
        if (C0113.m1443() >= 0) {
            return ((StringBuilder) obj).append(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static f20 m1855(Object obj) {
        if (C0109.m1383() > 0) {
            return ((e20) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static String m1856(String str) {
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

    /* JADX INFO: renamed from: ۠ۥۤ۟, reason: not valid java name and contains not printable characters */
    public static sf m1858() {
        if (C0137.m1727() <= 0) {
            return v20.r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static tg1 m1859(Object obj, Object obj2, Object obj3, int i) {
        if (C0114.m1448() > 0) {
            return sg1.a((bd) obj, (a3) obj2, (ob0) obj3, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۧۢ, reason: contains not printable characters */
    public static int m1860() {
        return 369 ^ C0113.f119;
    }

    /* JADX INFO: renamed from: ۧۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m1861(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1862(Object obj) {
        if (C0071.m922() <= 0) {
            return ((vr1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m1857(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
