package com.google.android.material.bottomsheet;

import android.support.v4.app.C0002;
import android.view.C0023;
import com.google.android.material.behavior.C0088;
import com.google.android.material.behavior.C0091;
import defpackage.dp;
import defpackage.fr0;
import defpackage.ha0;
import defpackage.lr0;
import defpackage.ob0;
import defpackage.pv;
import defpackage.r9;
import defpackage.sa0;
import defpackage.tv0;
import defpackage.wa0;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.ۤۡۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0106 {

    /* JADX INFO: renamed from: ۨۡۧ۠, reason: not valid java name and contains not printable characters */
    public static int f112 = 689;

    /* JADX INFO: renamed from: ۣ۟ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static int m1348() {
        return 136 ^ C0088.f94;
    }

    /* JADX INFO: renamed from: ۟ۤۢۦۡ, reason: not valid java name and contains not printable characters */
    public static String m1349() {
        if (C0023.m313() > 0) {
            return "ۡ۟ۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟۟, reason: not valid java name and contains not printable characters */
    public static String m1351(String str) {
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

    /* JADX INFO: renamed from: ۢ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m1352(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static r9 m1353() {
        if (C0091.m1182() > 0) {
            return dp.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۢۦ, reason: not valid java name and contains not printable characters */
    public static lr0 m1354(Object obj) {
        if (C0107.m1359() <= 0) {
            return ((fr0) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ, reason: contains not printable characters */
    public static void m1355(Object obj, boolean z, Object obj2, int i, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, int i2) {
        if (C0002.m39() >= 0) {
            pv.a((List) obj, z, (List) obj2, i, (sa0) obj3, (sa0) obj4, (wa0) obj5, (wa0) obj6, (sa0) obj7, (ha0) obj8, (ha0) obj9, (wa0) obj10, (String) obj11, (sa0) obj12, (ha0) obj13, (tv0) obj14, (ob0) obj15, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m1350(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
