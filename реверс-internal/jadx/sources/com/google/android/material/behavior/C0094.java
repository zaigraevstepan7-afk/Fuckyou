package com.google.android.material.behavior;

import android.support.v4.app.C0002;
import android.view.C0024;
import android.view.InputDevice;
import androidx.core.app.C0038;
import androidx.recyclerview.widget.C0068;
import com.google.android.material.floatingactionbutton.C0114;
import com.google.android.material.search.C0128;
import com.google.android.material.sidesheet.C0130;
import com.google.android.material.transformation.C0146;
import defpackage.b3;
import defpackage.hr0;
import defpackage.jo;
import defpackage.lr0;
import defpackage.nu0;
import defpackage.ob0;
import defpackage.sa0;
import defpackage.tv0;
import defpackage.wr;
import defpackage.xr;
import defpackage.zq;
import defpackage.zx0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.behavior.ۦ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0094 {

    /* JADX INFO: renamed from: ۡ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static int f100 = 292;

    /* JADX INFO: renamed from: ۣۣ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static wr m1213() {
        if (C0130.m1641() >= 0) {
            return xr.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static int m1214(Object obj) {
        if (C0128.m1607() <= 0) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static int m1215() {
        return 516 ^ C0146.f152;
    }

    /* JADX INFO: renamed from: ۟ۧۡۥ۟, reason: not valid java name and contains not printable characters */
    public static lr0 m1216(Object obj) {
        if (C0114.m1448() >= 0) {
            return ((hr0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static String m1217(String str) {
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

    /* JADX INFO: renamed from: ۡۥۥۢ, reason: not valid java name and contains not printable characters */
    public static long[] m1218(Object obj) {
        if (C0002.m39() >= 0) {
            return ((zx0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static int m1219(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۢۨ۟, reason: not valid java name and contains not printable characters */
    public static void m1220(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        if (C0024.m321() > 0) {
            nu0.b(obj, (tv0) obj2, (sa0) obj3, (b3) obj4, (String) obj5, (sa0) obj6, (jo) obj7, (ob0) obj8, i);
        }
    }

    /* JADX INFO: renamed from: ۣۤۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1221(Object obj) {
        if (C0038.m509() > 0) {
            return ((InputDevice) obj).isVirtual();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۨۡ۟, reason: contains not printable characters */
    public static Object m1222(Object obj) {
        if (C0068.m888() < 0) {
            return ((zq) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧۨ, reason: not valid java name and contains not printable characters */
    public static String m1212(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
