package com.google.android.material.behavior;

import android.graphics.Path;
import android.support.v4.app.C0003;
import android.view.C0026;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.C0045;
import androidx.core.widget.C0051;
import androidx.startup.C0072;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.search.C0126;
import com.google.android.material.sidesheet.C0130;
import com.google.android.material.transformation.C0144;
import defpackage.ay0;
import defpackage.cd0;
import defpackage.dn1;
import defpackage.f20;
import defpackage.jo0;
import defpackage.ng0;
import defpackage.vm;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.material.behavior.۟ۤۤۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0090 {

    /* JADX INFO: renamed from: ۟ۦۨۦ۟, reason: not valid java name and contains not printable characters */
    public static int f96 = 936;

    /* JADX INFO: renamed from: ۟ۢۡۦۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m1164(Object obj) {
        if (C0144.m1814() <= 0) {
            return ((ay0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static void m1165(Object obj) {
        if (C0003.m50() >= 0) {
            ng0.b((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۥ, reason: not valid java name and contains not printable characters */
    public static void m1166(Object obj, Object obj2) {
        if (C0130.m1641() >= 0) {
            ((ViewGroup) obj).addView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1167(Object obj) {
        if (C0026.m355() >= 0) {
            return ((Iterator) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢۢۧ, reason: not valid java name and contains not printable characters */
    public static String m1168(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۤۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m1169(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static Class m1170(Object obj) {
        if (C0045.m596() < 0) {
            return obj.getClass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static float m1172(Object obj) {
        if (C0051.m670() > 0) {
            return ((dn1) obj).i;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۨۧۤ, reason: not valid java name and contains not printable characters */
    public static void m1173(Object obj, float f, float f2, float f3, float f4, float f5, float f6) {
        if (C0091.m1182() >= 0) {
            ((Path) obj).cubicTo(f, f2, f3, f4, f5, f6);
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۥۡ, reason: contains not printable characters */
    public static void m1174(Object obj, Object obj2, int i, int i2) throws IOException {
        if (C0126.m1590() > 0) {
            ((BufferedOutputStream) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۤۧ, reason: contains not printable characters */
    public static int m1175() {
        return (-847) ^ C0098.f104;
    }

    /* JADX INFO: renamed from: ۧۢۡۨ, reason: not valid java name and contains not printable characters */
    public static cd0 m1176(Object obj) {
        if (C0072.m936() < 0) {
            return ((jo0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۦ۟, reason: not valid java name and contains not printable characters */
    public static f20 m1177(Object obj) {
        if (C0003.m50() > 0) {
            return ((vm) obj).y();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1171(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
