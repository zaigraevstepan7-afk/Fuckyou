package android.support.v4.graphics.drawable;

import androidx.graphics.path.C0054;
import androidx.recyclerview.widget.C0065;
import androidx.startup.C0070;
import androidx.window.reflection.C0083;
import com.google.android.material.floatingactionbutton.C0114;
import com.google.android.material.focus.C0120;
import defpackage.bl;
import defpackage.d02;
import defpackage.dl;
import defpackage.f32;
import defpackage.ht;
import defpackage.kg1;
import defpackage.o62;
import defpackage.r2;
import defpackage.u4;
import defpackage.ye0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: android.support.v4.graphics.drawable.۟ۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0007 {

    /* JADX INFO: renamed from: ۟۠ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static int f7 = -373;

    /* JADX INFO: renamed from: ۟۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static ye0 m98() {
        if (C0114.m1448() > 0) {
            return bl.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m99(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static int m100() {
        return 97 ^ C0083.f83;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۣ, reason: not valid java name and contains not printable characters */
    public static int m101() {
        if (C0054.m711() > 0) {
            return r2.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static kg1 m102(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        if (C0120.m1522() >= 0) {
            return kg1.c((kg1) obj, (ht) obj2, (ht) obj3, (ht) obj4, (ht) obj5, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۢۦ, reason: not valid java name and contains not printable characters */
    public static d02 m103(Object obj) {
        if (C0065.m853() < 0) {
            return ((f32) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦۤ, reason: not valid java name and contains not printable characters */
    public static String m104(String str) {
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

    /* JADX INFO: renamed from: ۦ۠ۧۧ, reason: contains not printable characters */
    public static dl m106(Object obj) {
        if (C0070.m915() <= 0) {
            return u4.i((o62) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m105(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
