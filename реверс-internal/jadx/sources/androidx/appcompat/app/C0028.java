package androidx.appcompat.app;

import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.focus.C0120;
import com.google.android.material.snackbar.C0138;
import defpackage.C0154;
import defpackage.en1;
import defpackage.i22;
import defpackage.ko1;
import defpackage.tv0;
import defpackage.wi0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.appcompat.app.۟ۡۨۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0028 {

    /* JADX INFO: renamed from: ۣ۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static int f28 = 982;

    /* JADX INFO: renamed from: ۣ۟ۨۥۣ, reason: not valid java name and contains not printable characters */
    public static int m368() {
        return 527 ^ C0138.f144;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۤ, reason: not valid java name and contains not printable characters */
    public static String m370(String str) {
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

    /* JADX INFO: renamed from: ۠ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int m371(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۧۥ۟, reason: not valid java name and contains not printable characters */
    public static tv0 m372(Object obj, float f, float f2) {
        if (C0120.m1522() > 0) {
            return ko1.a((tv0) obj, f, f2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۢۢ, reason: not valid java name and contains not printable characters */
    public static en1 m373() {
        if (C0154.m2006() >= 0) {
            return wi0.t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public static Object m374(Object obj) {
        if (C0105.m1343() <= 0) {
            return ((i22) obj).p();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static String m369(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
