package com.google.android.material.bottomappbar;

import android.text.C0012;
import android.view.InputDevice;
import androidx.core.app.C0043;
import androidx.recyclerview.widget.C0065;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.carousel.C0108;
import com.google.android.material.transformation.C0140;
import defpackage.ct1;
import defpackage.ha0;
import defpackage.iy0;
import defpackage.od1;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: com.google.android.material.bottomappbar.۟۟ۢۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0095 {

    /* JADX INFO: renamed from: ۦۨ۟۠, reason: contains not printable characters */
    public static int f101 = -221;

    /* JADX INFO: renamed from: ۟۠ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static Object m1223(Object obj, int i) {
        if (C0107.m1359() < 0) {
            return ((iy0) obj).k(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۡۦ, reason: not valid java name and contains not printable characters */
    public static int m1224(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۣۥ۟, reason: not valid java name and contains not printable characters */
    public static ha0 m1225(Object obj) {
        if (C0108.m1373() <= 0) {
            return ((od1) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۢۡ, reason: not valid java name and contains not printable characters */
    public static void m1226(Object obj, int i, Object obj2, Object obj3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (C0012.m162() >= 0) {
            ((Cipher) obj).init(i, (Key) obj2, (AlgorithmParameterSpec) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static String m1227(String str) {
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

    /* JADX INFO: renamed from: ۣۢۨ۠, reason: not valid java name and contains not printable characters */
    public static int m1228() {
        return (-428) ^ C0140.f146;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1229(Object obj, Object obj2) {
        if (C0065.m853() < 0) {
            return ct1.M((String) obj, (String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m1231(Object obj, int i) {
        if (C0043.m578() >= 0) {
            return ((InputDevice) obj).supportsSource(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static String m1230(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
