package androidx.core.widget;

import android.view.View;
import android.view.translation.C0018;
import androidx.compose.ui.input.pointer.C0035;
import androidx.core.app.C0038;
import defpackage.ko1;
import defpackage.tv0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.core.widget.۟ۦۤۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0051 {

    /* JADX INFO: renamed from: ۟ۥۣۤۧ, reason: not valid java name and contains not printable characters */
    public static int f51 = -805;

    /* JADX INFO: renamed from: ۟۠ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static int m666(Object obj) {
        if (C0018.m241() < 0) {
            return ((View) obj).getSystemUiVisibility();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static tv0 m668(Object obj, float f) {
        if (C0035.m461() >= 0) {
            return ko1.h((tv0) obj, f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static int m669(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۧۥۧ, reason: contains not printable characters */
    public static int m670() {
        return 497 ^ C0038.f38;
    }

    /* JADX INFO: renamed from: ۥۨۧ, reason: contains not printable characters */
    public static String m671(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۥۥۡ, reason: not valid java name and contains not printable characters */
    public static String m667(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
