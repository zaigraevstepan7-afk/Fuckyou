package androidx.profileinstaller;

import com.google.android.material.snackbar.C1157;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.profileinstaller.ۣۤ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1148 {

    /* JADX INFO: renamed from: ۥۨۦۢ, reason: contains not printable characters */
    public static int f4874 = -618;

    /* JADX INFO: renamed from: ۟ۦۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m3907(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m3908() {
        return (-765) ^ C1157.f4883;
    }

    /* JADX INFO: renamed from: ۧۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String m3910(String str) {
        String string = "";
        int i2 = 0;
        String str2 = "";
        while (i2 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i2)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i2).toString();
            i2++;
            str2 = string2;
        }
        while (string.length() > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i3 = 0; i3 < str.length(); i3 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i3)) << 4) | string.indexOf(str.charAt(i3 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i4 = 0; i4 < length; i4++) {
            byteArray[i4] = (byte) (byteArray[i4] ^ str2.charAt(i4 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۡۥۨۦ, reason: not valid java name and contains not printable characters */
    public static String m3909(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
