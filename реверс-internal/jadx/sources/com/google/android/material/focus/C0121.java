package com.google.android.material.focus;

import android.support.v4.app.C0005;
import android.text.C0012;
import android.view.KeyEvent;
import androidx.profileinstaller.C0064;
import androidx.recyclerview.widget.C0067;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.search.C0126;
import com.google.android.material.search.C0127;
import defpackage.bl;
import defpackage.f20;
import defpackage.ha0;
import defpackage.pd1;
import defpackage.s91;
import defpackage.sa0;
import defpackage.vm;
import defpackage.wq;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.focus.ۣۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0121 {

    /* JADX INFO: renamed from: ۠ۥ۠۟, reason: not valid java name and contains not printable characters */
    public static int f127 = 268;

    /* JADX INFO: renamed from: ۟۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static long m1527(Object obj) {
        if (C0127.m1604() > 0) {
            return bl.A((KeyEvent) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۟۠, reason: not valid java name and contains not printable characters */
    public static ha0 m1528(Object obj) {
        if (C0005.m75() >= 0) {
            return ((wq) obj).s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠, reason: not valid java name and contains not printable characters */
    public static int m1529(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۨۦۧ, reason: not valid java name and contains not printable characters */
    public static String m1530(Object obj, Object obj2, Object obj3) {
        if (C0064.m840() > 0) {
            return s91.l((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۤۦ, reason: not valid java name and contains not printable characters */
    public static float m1531(Object obj, Object obj2) {
        if (C0012.m162() >= 0) {
            return pd1.k((float[]) obj, (float[]) obj2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۦۡ۠, reason: not valid java name and contains not printable characters */
    public static f20 m1533(Object obj) {
        if (C0107.m1359() < 0) {
            return ((vm) obj).I();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۧۡ, reason: not valid java name and contains not printable characters */
    public static sa0 m1534(Object obj) {
        if (C0067.m876() > 0) {
            return ((wq) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int m1535() {
        return 294 ^ C0126.f132;
    }

    /* JADX INFO: renamed from: ۨۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m1536(String str) {
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

    /* JADX INFO: renamed from: ۤ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m1532(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
