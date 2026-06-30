package com.google.android.material.carousel;

import androidx.graphics.path.C0056;
import androidx.recyclerview.widget.C0065;
import androidx.versionedparcelable.C0074;
import com.google.android.material.appbar.C0086;
import com.google.android.material.behavior.C0089;
import com.google.android.material.bottomappbar.C0096;
import com.google.android.material.floatingactionbutton.C0116;
import com.google.android.material.snackbar.C0136;
import com.google.android.material.transformation.C0142;
import defpackage.cr0;
import defpackage.es1;
import defpackage.fy0;
import defpackage.hq;
import defpackage.kg1;
import defpackage.mg1;
import defpackage.sa0;
import defpackage.vq;
import defpackage.wi0;
import defpackage.ye0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.material.carousel.۟ۥۣۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0110 {

    /* JADX INFO: renamed from: ۥۣ۟ۢ, reason: contains not printable characters */
    public static int f116 = 713;

    /* JADX INFO: renamed from: ۟۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static String m1393(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static es1 m1394() {
        if (C0116.m1470() <= 0) {
            return es1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۦۨ, reason: not valid java name and contains not printable characters */
    public static Object m1395(Object obj, Object obj2) {
        if (C0056.m738() <= 0) {
            return ((sa0) obj).i(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m1396(Object obj) {
        if (C0086.m1107() >= 0) {
            return ((cr0) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m1397() {
        return 51 ^ C0096.f102;
    }

    /* JADX INFO: renamed from: ۟ۤۥۢۨ, reason: not valid java name and contains not printable characters */
    public static int m1398(Object obj) {
        if (C0074.m963() > 0) {
            return ((hq) obj).n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static kg1 m1399() {
        if (C0136.m1712() < 0) {
            return mg1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static fy0 m1400(Object obj) {
        if (C0142.m1788() >= 0) {
            return ((vq) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1402(Object obj, Object obj2) {
        if (C0089.m1150() >= 0) {
            return ((ArrayList) obj).remove(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ۦۤ, reason: contains not printable characters */
    public static ye0 m1403() {
        if (C0065.m853() <= 0) {
            return wi0.K;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۡ۠, reason: contains not printable characters */
    public static int m1404(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m1401(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
