package com.google.android.material.bottomsheet;

import android.text.C0016;
import androidx.profileinstaller.C0061;
import com.google.android.material.focus.C0118;
import com.google.android.material.sidesheet.C0131;
import com.google.android.material.transformation.C0144;
import defpackage.ba2;
import defpackage.h31;
import defpackage.qq;
import defpackage.qz;
import defpackage.rd;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.ۡۤ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0104 {

    /* JADX INFO: renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static int f110 = 786;

    /* JADX INFO: renamed from: ۣ۟ۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m1327(Object obj) {
        if (C0016.m218() < 0) {
            return ((ba2) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static int m1328(Object obj) {
        if (C0131.m1649() < 0) {
            return ((qz) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۥ, reason: not valid java name and contains not printable characters */
    public static int m1329(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۢۨۡ, reason: not valid java name and contains not printable characters */
    public static String m1330(Object obj) {
        if (C0144.m1814() <= 0) {
            return ((h31) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۨ, reason: contains not printable characters */
    public static int m1332() {
        return 405 ^ C0061.f61;
    }

    /* JADX INFO: renamed from: ۦۦ۟ۡ, reason: contains not printable characters */
    public static rd m1333(Object obj) {
        if (C0118.m1484() > 0) {
            return ((qq) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣ۠, reason: not valid java name and contains not printable characters */
    public static String m1334(String str) {
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

    /* JADX INFO: renamed from: ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static String m1331(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
