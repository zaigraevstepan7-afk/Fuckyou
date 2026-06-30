package defpackage;

import androidx.window.reflection.C0079;
import com.google.android.material.appbar.C0087;
import com.google.android.material.bottomappbar.C0095;
import com.google.android.material.floatingactionbutton.C0117;
import com.google.android.material.sidesheet.C0131;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: ۨۤۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0157 {

    /* JADX INFO: renamed from: ۟ۤۡۨۥ, reason: not valid java name and contains not printable characters */
    public static int f234 = -639;

    /* JADX INFO: renamed from: ۟۟ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static int m2032(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۢۡ۠, reason: not valid java name and contains not printable characters */
    public static String m2033(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static void m2035() {
        if (C0079.m1016() < 0) {
            hk.V();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۤۤ, reason: not valid java name and contains not printable characters */
    public static void m2036(Object obj, Object obj2) throws IOException {
        if (C0095.m1228() >= 0) {
            ((OutputStream) obj).write((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۧ, reason: not valid java name and contains not printable characters */
    public static gi m2037(Object obj) {
        if (C0087.m1123() < 0) {
            return yh.c((ob0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۨۥ, reason: not valid java name and contains not printable characters */
    public static int m2038() {
        return (-20) ^ C0131.f137;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static long m2039(Object obj) {
        if (C0117.m1475() > 0) {
            return ((bm) obj).A;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m2034(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
