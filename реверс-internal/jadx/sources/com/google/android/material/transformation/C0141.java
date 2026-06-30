package com.google.android.material.transformation;

import android.support.v4.graphics.drawable.C0008;
import android.view.Window;
import androidx.compose.ui.input.pointer.C0035;
import androidx.versionedparcelable.C0077;
import com.google.android.material.behavior.C0089;
import com.google.android.material.behavior.C0091;
import com.google.android.material.behavior.C0093;
import defpackage.C0155;
import defpackage.ar0;
import defpackage.ez1;
import defpackage.h1;
import defpackage.ij;
import defpackage.im1;
import defpackage.iy0;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;

/* JADX INFO: renamed from: com.google.android.material.transformation.ۣ۟ۢ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0141 {

    /* JADX INFO: renamed from: ۟ۥ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static int f147 = 867;

    /* JADX INFO: renamed from: ۣ۟۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m1770(Object obj) {
        if (C0093.m1203() >= 0) {
            return ((ar0) obj).q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static int m1771(Object obj) {
        if (C0077.m996() > 0) {
            return ((iy0) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m1772(Object obj) {
        if (C0091.m1182() > 0) {
            return ((ij) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨۡۢ, reason: not valid java name and contains not printable characters */
    public static Object m1773(Object obj, Object obj2) {
        if (C0008.m116() >= 0) {
            return ((im1) obj).t(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۥ, reason: not valid java name and contains not printable characters */
    public static void m1774(Object obj, boolean z) {
        if (C0089.m1150() >= 0) {
            h1.d((Window) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۧ, reason: not valid java name and contains not printable characters */
    public static int m1775(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۥۢۢ, reason: not valid java name and contains not printable characters */
    public static String m1776(String str) {
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

    /* JADX INFO: renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
    public static void m1777(Object obj, boolean z) {
        if (C0091.m1182() >= 0) {
            ((URLConnection) obj).setDoOutput(z);
        }
    }

    /* JADX INFO: renamed from: ۥۣۡۨ, reason: contains not printable characters */
    public static int m1778() {
        return 775 ^ C0155.f232;
    }

    /* JADX INFO: renamed from: ۥۦ۟ۧ, reason: contains not printable characters */
    public static void m1779() {
        if (C0035.m461() >= 0) {
            ez1.a();
        }
    }

    /* JADX INFO: renamed from: ۦ۠ۤۨ, reason: contains not printable characters */
    public static String m1780(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
