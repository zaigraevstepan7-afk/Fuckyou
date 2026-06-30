package com.google.android.material.bottomappbar;

import android.media.MediaPlayer;
import android.text.C0015;
import androidx.core.graphics.drawable.C0049;
import com.google.android.material.bottomsheet.C0107;
import com.reddit.frontpage.C0147;
import com.reddit.frontpage.C0149;
import defpackage.bc1;
import defpackage.dr0;
import defpackage.jt1;
import defpackage.kr0;
import defpackage.qs1;
import defpackage.wq0;
import defpackage.xk;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.bottomappbar.ۣ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0099 {

    /* JADX INFO: renamed from: ۣۡۤۨ, reason: not valid java name and contains not printable characters */
    public static int f105 = 696;

    /* JADX INFO: renamed from: ۟۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static MediaPlayer m1268(Object obj) {
        if (C0015.m195() >= 0) {
            return ((kr0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m1269(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static bc1 m1270(Object obj) {
        if (C0107.m1359() < 0) {
            return xk.e((qs1) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۨۦ, reason: not valid java name and contains not printable characters */
    public static Long m1271(Object obj) {
        if (C0149.m1865() <= 0) {
            return jt1.K((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۥ, reason: not valid java name and contains not printable characters */
    public static int m1272() {
        return (-959) ^ C0049.f49;
    }

    /* JADX INFO: renamed from: ۣۥ, reason: not valid java name and contains not printable characters */
    public static dr0 m1273() {
        if (C0147.m1843() >= 0) {
            return wq0.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m1274(String str) {
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

    /* JADX INFO: renamed from: ۤۨۥۨ, reason: not valid java name and contains not printable characters */
    public static String m1275(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
