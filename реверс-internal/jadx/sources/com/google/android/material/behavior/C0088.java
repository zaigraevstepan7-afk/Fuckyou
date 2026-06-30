package com.google.android.material.behavior;

import android.view.C0027;
import androidx.core.graphics.drawable.C0045;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.carousel.C0108;
import com.google.android.material.sidesheet.C0133;
import defpackage.C0155;
import defpackage.aq0;
import defpackage.bm;
import defpackage.fr0;
import defpackage.pd1;
import defpackage.qq;
import defpackage.tf;
import defpackage.tv0;
import defpackage.v20;
import defpackage.w6;
import defpackage.y2;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.behavior.۟۟۠ۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0088 {

    /* JADX INFO: renamed from: ۟ۦ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int f94 = 898;

    /* JADX INFO: renamed from: ۟ۡ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m1137(Object obj) {
        if (C0098.m1266() <= 0) {
            return ((qq) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Object m1138(Object obj) {
        if (C0105.m1343() <= 0) {
            return ((fr0) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۨ۠, reason: not valid java name and contains not printable characters */
    public static int m1139(Object obj) {
        if (C0092.m1194() >= 0) {
            return ((fr0) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m1140(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static tf m1141() {
        if (C0108.m1373() < 0) {
            return v20.o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۢۥ, reason: not valid java name and contains not printable characters */
    public static long m1142(Object obj) {
        if (C0155.m2019() >= 0) {
            return ((bm) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۦۨ۟, reason: not valid java name and contains not printable characters */
    public static tv0 m1143(Object obj, Object obj2) {
        if (C0133.m1681() > 0) {
            return ((tv0) obj).c((tv0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۧۨ, reason: contains not printable characters */
    public static String m1144(Object obj) {
        if (C0045.m596() <= 0) {
            return ((y2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۠ۤ, reason: contains not printable characters */
    public static String m1145(String str) {
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

    /* JADX INFO: renamed from: ۧۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m1146(Object obj, Object obj2, float f, float f2) {
        if (C0133.m1681() > 0) {
            pd1.n((w6) obj, (aq0) obj2, f, f2);
        }
    }

    /* JADX INFO: renamed from: ۨ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m1147() {
        return 541 ^ C0027.f27;
    }

    /* JADX INFO: renamed from: ۨۤۧۨ, reason: not valid java name and contains not printable characters */
    public static String m1148(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
