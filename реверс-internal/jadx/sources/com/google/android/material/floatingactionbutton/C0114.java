package com.google.android.material.floatingactionbutton;

import androidx.core.graphics.drawable.C0049;
import com.google.android.material.behavior.C0092;
import com.google.android.material.bottomsheet.C0102;
import defpackage.f20;
import defpackage.ob0;
import defpackage.rd;
import defpackage.vm;
import defpackage.xg0;
import defpackage.zu1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.۟ۥۢۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0114 {

    /* JADX INFO: renamed from: ۧ۠۟۟, reason: not valid java name and contains not printable characters */
    public static int f120 = -763;

    /* JADX INFO: renamed from: ۟۟ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static String m1445(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m1446(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۤۨ, reason: not valid java name and contains not printable characters */
    public static Object m1447(Object obj, Object obj2, Object obj3) {
        if (C0049.m645() > 0) {
            return ((xg0) obj).y((rd) obj2, (zu1) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡۢ, reason: not valid java name and contains not printable characters */
    public static int m1448() {
        return 395 ^ C0112.f118;
    }

    /* JADX INFO: renamed from: ۠۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1449(Object obj, Object obj2) {
        if (C0102.m1309() >= 0) {
            return ((ob0) obj).h(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧ۟۟, reason: not valid java name and contains not printable characters */
    public static f20 m1451(Object obj) {
        if (C0092.m1194() > 0) {
            return ((vm) obj).q();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤ, reason: not valid java name and contains not printable characters */
    public static String m1450(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
