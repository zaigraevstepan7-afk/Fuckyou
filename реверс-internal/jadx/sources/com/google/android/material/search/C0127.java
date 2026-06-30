package com.google.android.material.search;

import android.os.BaseBundle;
import android.support.v4.app.C0005;
import android.view.Window;
import androidx.core.graphics.drawable.C0045;
import androidx.core.graphics.drawable.C0048;
import androidx.recyclerview.widget.C0066;
import androidx.window.reflection.C0081;
import com.google.android.material.behavior.C0088;
import com.google.android.material.behavior.C0093;
import com.google.android.material.behavior.C0094;
import com.google.android.material.focus.C0119;
import defpackage.ft0;
import defpackage.ha0;
import defpackage.q20;
import defpackage.sg;
import defpackage.uf;
import defpackage.uu0;
import defpackage.v20;
import defpackage.vd;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.material.search.ۢ۠ۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0127 {

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static int f133 = 166;

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m1593(Object obj, Object obj2) {
        if (C0094.m1215() >= 0) {
            return ((BaseBundle) obj).get((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static void m1594(Object obj, Object obj2) {
        if (C0081.m1040() > 0) {
            ((q20) obj).a((Window) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1595(Object obj) {
        if (C0119.m1511() >= 0) {
            return ((File) obj).delete();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static ha0 m1596(Object obj) {
        if (C0005.m75() >= 0) {
            return ((vd) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢ, reason: not valid java name and contains not printable characters */
    public static String m1597(String str) {
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

    /* JADX INFO: renamed from: ۡۥۤ۠, reason: not valid java name and contains not printable characters */
    public static String m1598(Object obj, Object obj2) {
        if (C0066.m857() > 0) {
            return ((String) obj).toLowerCase((Locale) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۡۦ, reason: not valid java name and contains not printable characters */
    public static int m1599(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۥۡۤ, reason: not valid java name and contains not printable characters */
    public static v20 m1600() {
        if (C0045.m596() <= 0) {
            return v20.C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۦۢ, reason: contains not printable characters */
    public static void m1601(Object obj, long j, long j2) {
        if (C0093.m1203() > 0) {
            ((ft0) obj).a(j, j2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۥ۠, reason: contains not printable characters */
    public static uu0 m1603(Object obj, boolean z) {
        if (C0088.m1147() < 0) {
            return sg.d((uf) obj, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1604() {
        return (-613) ^ C0048.f48;
    }

    /* JADX INFO: renamed from: ۦ۟۠ۢ, reason: contains not printable characters */
    public static String m1602(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
