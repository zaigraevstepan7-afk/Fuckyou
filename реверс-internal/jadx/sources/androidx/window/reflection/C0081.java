package androidx.window.reflection;

import android.support.v4.graphics.drawable.C0008;
import android.view.translation.C0017;
import android.view.translation.C0019;
import androidx.recyclerview.widget.C0065;
import androidx.recyclerview.widget.C0067;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.carousel.C0111;
import defpackage.ih1;
import defpackage.ob0;
import defpackage.qq;
import defpackage.ry1;
import defpackage.w01;
import defpackage.wz1;
import defpackage.xg0;
import defpackage.zc1;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import javax.net.ssl.TrustManagerFactory;

/* JADX INFO: renamed from: androidx.window.reflection.ۢۦۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0081 {

    /* JADX INFO: renamed from: ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static int f81 = 227;

    /* JADX INFO: renamed from: ۟۟ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m1038(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static String m1039(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۦۥۡ, reason: not valid java name and contains not printable characters */
    public static int m1040() {
        return (-582) ^ C0082.f82;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤۡ, reason: not valid java name and contains not printable characters */
    public static void m1042(Object obj, Object obj2) {
        if (C0111.m1412() < 0) {
            ((ry1) obj).g((w01) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1043(long j) {
        if (C0017.m229() <= 0) {
            return wz1.c(j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static zc1 m1044(Object obj) {
        if (C0067.m876() > 0) {
            return ((qq) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m1045(Object obj) {
        if (C0065.m853() <= 0) {
            ((ob0) obj).S();
        }
    }

    /* JADX INFO: renamed from: ۣۡۢ۟, reason: not valid java name and contains not printable characters */
    public static Map m1046(Object obj) {
        if (C0107.m1359() < 0) {
            return ((ih1) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۧ۠, reason: not valid java name and contains not printable characters */
    public static TrustManagerFactory m1047(Object obj) {
        if (C0019.m251() > 0) {
            return TrustManagerFactory.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۨۨ, reason: not valid java name and contains not printable characters */
    public static String m1048(Object obj, Object obj2) {
        if (C0008.m116() > 0) {
            return xg0.o((xg0) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۤ, reason: not valid java name and contains not printable characters */
    public static String m1041(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
