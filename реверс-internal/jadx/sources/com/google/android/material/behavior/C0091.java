package com.google.android.material.behavior;

import android.app.C0001;
import android.graphics.Bitmap;
import android.text.C0012;
import android.view.translation.C0020;
import androidx.core.app.C0039;
import androidx.core.graphics.drawable.C0049;
import androidx.lifecycle.C0058;
import androidx.profileinstaller.C0064;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.transformation.C0142;
import com.google.android.material.transformation.C0144;
import defpackage.am1;
import defpackage.bm;
import defpackage.d02;
import defpackage.dr0;
import defpackage.f32;
import defpackage.hk;
import defpackage.iq;
import defpackage.jo;
import defpackage.ob0;
import defpackage.wz1;
import defpackage.xi0;
import defpackage.ym0;
import defpackage.zl1;
import defpackage.zr1;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* JADX INFO: renamed from: com.google.android.material.behavior.۟ۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0091 {

    /* JADX INFO: renamed from: ۣۤۤۦ, reason: not valid java name and contains not printable characters */
    public static int f97 = -383;

    /* JADX INFO: renamed from: ۣ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1178(Object obj) {
        if (C0001.m16() <= 0) {
            return ((dr0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۥۤ, reason: not valid java name and contains not printable characters */
    public static Bitmap m1179(Object obj, int i) {
        if (C0058.m756() <= 0) {
            return xi0.l((File) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static int m1180(long j) {
        if (C0039.m516() < 0) {
            return wz1.e(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۢۢ, reason: not valid java name and contains not printable characters */
    public static int m1181(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۧ, reason: not valid java name and contains not printable characters */
    public static int m1182() {
        return 69 ^ C0107.f113;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static long m1183(Object obj) {
        if (C0020.m271() >= 0) {
            return ((bm) obj).R;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static void m1185(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        if (C0012.m162() >= 0) {
            hk.e(obj, i, (ym0) obj2, (jo) obj3, (ob0) obj4, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۧ, reason: not valid java name and contains not printable characters */
    public static zr1 m1186() {
        if (C0144.m1814() <= 0) {
            return zr1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟۠, reason: not valid java name and contains not printable characters */
    public static void m1187(Object obj, Object obj2, Object obj3) {
        if (C0142.m1788() >= 0) {
            ((am1) obj).a((zl1) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m1188(String str) {
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

    /* JADX INFO: renamed from: ۥ۟ۥۣ, reason: contains not printable characters */
    public static String m1189(Object obj) {
        if (C0049.m645() >= 0) {
            return ((iq) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static d02 m1190(Object obj) {
        if (C0064.m840() > 0) {
            return ((f32) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۣ, reason: not valid java name and contains not printable characters */
    public static String m1184(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
