package com.google.android.material.bottomappbar;

import android.support.v4.graphics.drawable.C0008;
import android.text.C0011;
import androidx.core.graphics.drawable.C0045;
import androidx.core.graphics.drawable.C0047;
import androidx.graphics.path.C0055;
import com.google.android.material.snackbar.C0137;
import defpackage.C0156;
import defpackage.iq;
import defpackage.lr0;
import defpackage.mz;
import defpackage.qz;
import defpackage.rz;
import defpackage.vd;
import defpackage.zc1;
import defpackage.zd;
import java.io.ByteArrayOutputStream;
import javax.net.ssl.SSLContext;

/* JADX INFO: renamed from: com.google.android.material.bottomappbar.ۣ۠۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0097 {

    /* JADX INFO: renamed from: ۡۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int f103 = 553;

    /* JADX INFO: renamed from: ۣ۟۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static qz m1241(Object obj) {
        if (C0045.m596() < 0) {
            return ((mz) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۧۡ, reason: not valid java name and contains not printable characters */
    public static int m1242() {
        return (-342) ^ C0156.f233;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m1243(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static zc1 m1245(Object obj) {
        if (C0137.m1727() < 0) {
            return ((rz) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m1246(double d) {
        if (C0011.m150() <= 0) {
            return lr0.h(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static SSLContext m1247(Object obj) {
        if (C0047.m622() < 0) {
            return SSLContext.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۧۡ, reason: not valid java name and contains not printable characters */
    public static int m1248(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡ۟, reason: not valid java name and contains not printable characters */
    public static int m1249(Object obj) {
        if (C0008.m116() > 0) {
            return ((zd) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static iq m1250(Object obj) {
        if (C0055.m723() >= 0) {
            return ((vd) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static String m1244(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
