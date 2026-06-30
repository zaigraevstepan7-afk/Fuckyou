package com.google.android.material.bottomappbar;

import android.text.C0012;
import android.view.translation.C0017;
import androidx.compose.ui.input.pointer.C0034;
import androidx.core.app.C0040;
import com.google.android.material.behavior.C0089;
import com.google.android.material.focus.C0119;
import defpackage.bm;
import defpackage.cg1;
import defpackage.ha0;
import defpackage.lt0;
import defpackage.ob0;
import defpackage.wi0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.bottomappbar.۟ۧۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0096 {

    /* JADX INFO: renamed from: ۡۤۤ۠, reason: not valid java name and contains not printable characters */
    public static int f102 = 727;

    /* JADX INFO: renamed from: ۟۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static int m1232() {
        return 116 ^ C0089.f95;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static float m1233() {
        if (C0040.m542() <= 0) {
            return wi0.n;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣ۟, reason: not valid java name and contains not printable characters */
    public static String m1234(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۧۥۣ, reason: not valid java name and contains not printable characters */
    public static int m1235(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۡۨۡ, reason: not valid java name and contains not printable characters */
    public static ha0 m1236(Object obj) {
        if (C0017.m229() < 0) {
            return ((lt0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۥۡ, reason: not valid java name and contains not printable characters */
    public static long m1237(Object obj) {
        if (C0119.m1511() > 0) {
            return ((bm) obj).j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۢۢۤ, reason: not valid java name and contains not printable characters */
    public static long m1239(Object obj) {
        if (C0012.m162() >= 0) {
            return ((cg1) obj).j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m1240(Object obj, int i) {
        if (C0034.m451() < 0) {
            ((ob0) obj).W(i);
        }
    }

    /* JADX INFO: renamed from: ۦۣۧۦ, reason: contains not printable characters */
    public static String m1238(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
