package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.translation.C0018;
import com.google.android.material.behavior.C0091;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.transformation.C0146;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* JADX INFO: renamed from: ۥ۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0156 {

    /* JADX INFO: renamed from: ۦ۟ۢ۠, reason: contains not printable characters */
    public static int f233 = 291;

    /* JADX INFO: renamed from: ۟۠ۥۡۥ, reason: not valid java name and contains not printable characters */
    public static String m2025(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۢ۟۟, reason: not valid java name and contains not printable characters */
    public static PackageInfo m2027(Object obj, Object obj2, int i) {
        if (C0018.m241() < 0) {
            return ((PackageManager) obj).getPackageInfo((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m2028(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static List m2029(Object obj) {
        if (C0091.m1182() > 0) {
            return ((wq) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m2030(Object obj) {
        if (C0112.m1424() <= 0) {
            return ((cg1) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥۣ۟, reason: contains not printable characters */
    public static int m2031() {
        return 917 ^ C0146.f152;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۨ, reason: not valid java name and contains not printable characters */
    public static String m2026(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
