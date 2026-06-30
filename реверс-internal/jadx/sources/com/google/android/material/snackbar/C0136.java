package com.google.android.material.snackbar;

import android.text.C0012;
import android.view.Window;
import androidx.compose.ui.input.pointer.C0035;
import androidx.core.app.C0040;
import androidx.recyclerview.widget.C0067;
import androidx.startup.C0072;
import com.google.android.material.focus.C0118;
import com.google.android.material.focus.C0120;
import com.google.android.material.search.C0127;
import com.google.android.material.transformation.C0146;
import defpackage.ay0;
import defpackage.bm;
import defpackage.ca1;
import defpackage.dr0;
import defpackage.h1;
import defpackage.l91;
import defpackage.ls;
import defpackage.ob0;
import defpackage.oc;
import defpackage.ri1;
import defpackage.xg0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.snackbar.ۣۣ۟ۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0136 {

    /* JADX INFO: renamed from: ۥۣۢۡ, reason: contains not printable characters */
    public static int f142 = -976;

    /* JADX INFO: renamed from: ۣ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static xg0 m1707(Object obj) {
        if (C0127.m1604() > 0) {
            return ((ca1) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m1708(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۡۥۤ, reason: not valid java name and contains not printable characters */
    public static ay0 m1709(Object obj) {
        if (C0072.m936() <= 0) {
            return ((ri1) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۢۧ, reason: not valid java name and contains not printable characters */
    public static void m1710(Object obj, boolean z) {
        if (C0035.m461() >= 0) {
            h1.e((Window) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ۠, reason: not valid java name and contains not printable characters */
    public static void m1711(Object obj, Object obj2) {
        if (C0118.m1484() > 0) {
            ((ob0) obj).g0(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۤ, reason: not valid java name and contains not printable characters */
    public static int m1712() {
        return 1011 ^ C0012.f12;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static Object m1713(Object obj, Object obj2) {
        if (C0120.m1522() >= 0) {
            return ((oc) obj).p((ls) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m1714(Object obj, boolean z) {
        if (C0040.m542() < 0) {
            return ((StringBuilder) obj).append(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۤۨ, reason: not valid java name and contains not printable characters */
    public static String m1715(String str) {
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

    /* JADX INFO: renamed from: ۣۦۣ۠, reason: not valid java name and contains not printable characters */
    public static long m1717(Object obj) {
        if (C0146.m1831() > 0) {
            return ((bm) obj).M;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۦ, reason: contains not printable characters */
    public static Object m1718(Object obj, Object obj2, Object obj3) {
        if (C0067.m876() > 0) {
            return ((l91) obj).n((dr0) obj2, (ls) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤۡ, reason: not valid java name and contains not printable characters */
    public static String m1716(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
