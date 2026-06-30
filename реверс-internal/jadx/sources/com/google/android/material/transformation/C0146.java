package com.google.android.material.transformation;

import android.util.Base64;
import android.view.translation.C0018;
import androidx.appcompat.widget.C0033;
import androidx.startup.C0070;
import androidx.versionedparcelable.C0076;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.floatingactionbutton.C0116;
import defpackage.C0157;
import defpackage.lt0;
import defpackage.ry1;
import defpackage.sa0;
import defpackage.xq;
import defpackage.z80;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.transformation.ۥۣۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0146 {

    /* JADX INFO: renamed from: ۣۣۡۧ, reason: not valid java name and contains not printable characters */
    public static int f152 = 289;

    /* JADX INFO: renamed from: ۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static sa0 m1830(Object obj) {
        if (C0157.m2038() >= 0) {
            return ((lt0) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static int m1831() {
        return 196 ^ C0112.f118;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static String m1832(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m1833(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۧۨۢ, reason: not valid java name and contains not printable characters */
    public static sa0 m1834(Object obj) {
        if (C0076.m975() <= 0) {
            return ((xq) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟, reason: not valid java name and contains not printable characters */
    public static String m1835(Object obj, int i) {
        if (C0070.m915() <= 0) {
            return Base64.encodeToString((byte[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۧ۟, reason: not valid java name and contains not printable characters */
    public static int m1836(Object obj) {
        if (C0033.m436() > 0) {
            return ((Enum) obj).ordinal();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۦۤ, reason: not valid java name and contains not printable characters */
    public static sa0 m1837(Object obj) {
        if (C0018.m241() <= 0) {
            return ((z80) obj).v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static sa0 m1839(Object obj) {
        if (C0116.m1470() <= 0) {
            return ((ry1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m1838(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
