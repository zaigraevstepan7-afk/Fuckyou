package com.google.android.material.sidesheet;

import android.net.Uri;
import android.text.C0011;
import androidx.appcompat.widget.C0030;
import androidx.core.widget.C0052;
import androidx.startup.C0070;
import com.google.android.material.behavior.C0090;
import com.google.android.material.bottomappbar.C0096;
import com.google.android.material.focus.C0120;
import defpackage.ct1;
import defpackage.hj;
import defpackage.jc1;
import defpackage.jo;
import defpackage.qq;
import defpackage.qq1;
import defpackage.qs1;
import defpackage.wi0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.material.sidesheet.ۣ۟ۡۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0130 {

    /* JADX INFO: renamed from: ۟ۤۨۢ۟, reason: not valid java name and contains not printable characters */
    public static int f136 = 528;

    /* JADX INFO: renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static Uri m1637(Object obj) {
        if (C0070.m915() < 0) {
            return ((qq) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1638(Object obj) {
        if (C0096.m1232() >= 0) {
            return ((qq1) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m1639(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static Object m1640(Object obj, int i) {
        if (C0052.m681() >= 0) {
            return ((ArrayList) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m1641() {
        return 666 ^ C0030.f30;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static jo m1642() {
        if (C0090.m1175() < 0) {
            return wi0.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۧۧ, reason: not valid java name and contains not printable characters */
    public static int m1643(Object obj) {
        if (C0131.m1649() < 0) {
            return ((hj) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۥۦ, reason: not valid java name and contains not printable characters */
    public static qs1 m1644(Object obj) {
        if (C0011.m150() <= 0) {
            return ((jc1) obj).u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۤۥ, reason: contains not printable characters */
    public static int m1645(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static String m1646(Object obj) {
        if (C0120.m1522() >= 0) {
            return ct1.V((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m1647(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
