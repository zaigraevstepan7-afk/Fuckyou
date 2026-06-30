package androidx.core.graphics.drawable;

import android.text.C0011;
import androidx.appcompat.widget.C0032;
import androidx.core.app.C0043;
import androidx.window.reflection.C0082;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.sidesheet.C0130;
import com.reddit.frontpage.C0151;
import defpackage.bm;
import defpackage.bq;
import defpackage.fa2;
import defpackage.gc1;
import defpackage.s91;
import defpackage.w4;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.core.graphics.drawable.ۨۧۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0049 {

    /* JADX INFO: renamed from: ۣۣۥۨ, reason: not valid java name and contains not printable characters */
    public static int f49 = 957;

    /* JADX INFO: renamed from: ۟۟ۨۨۡ, reason: not valid java name and contains not printable characters */
    public static int m644(int i, int i2, long j) {
        if (C0151.m1894() > 0) {
            return s91.c(i, i2, j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static int m645() {
        return (-273) ^ C0082.f82;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static long m646(Object obj) {
        if (C0043.m578() > 0) {
            return ((bm) obj).V;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static int m647(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۢ, reason: not valid java name and contains not printable characters */
    public static String m648(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m649(Object obj, Object obj2) {
        if (C0130.m1641() >= 0) {
            return ((StringBuilder) obj).append(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static bq m650() {
        if (C0032.m419() <= 0) {
            return w4.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static gc1 m651() {
        if (C0011.m150() < 0) {
            return gc1.i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static String m652(Object obj) {
        if (C0107.m1359() <= 0) {
            return System.getProperty((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۡ۠, reason: not valid java name and contains not printable characters */
    public static int m654(Object obj) {
        if (C0046.m616() <= 0) {
            return ((fa2) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m653(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
