package defpackage;

import android.support.v4.app.C0005;
import android.support.v4.graphics.drawable.C0008;
import android.view.KeyEvent;
import androidx.core.app.C0037;
import androidx.window.reflection.C0081;
import com.google.android.material.bottomappbar.C0095;
import com.google.android.material.floatingactionbutton.C0116;
import com.google.android.material.focus.C0122;
import com.google.android.material.search.C0127;
import com.google.android.material.sidesheet.C0134;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: ۟ۧ۠ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0153 {

    /* JADX INFO: renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static int f230 = -308;

    /* JADX INFO: renamed from: ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1987(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m1988(Object obj) {
        if (C0134.m1687() < 0) {
            return ((ez1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m1989(Object obj) {
        if (C0127.m1604() >= 0) {
            return ((ga1) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦۨ, reason: not valid java name and contains not printable characters */
    public static KeyEvent m1990(Object obj) {
        if (C0037.m496() <= 0) {
            return ((gk0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static float m1991() {
        if (C0122.m1542() < 0) {
            return xi0.J;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1992(Object obj) {
        if (C0095.m1228() >= 0) {
            return ((ga2) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢۥ, reason: not valid java name and contains not printable characters */
    public static f40 m1993() {
        if (C0005.m75() >= 0) {
            return f40.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۨ, reason: not valid java name and contains not printable characters */
    public static int m1994() {
        return 868 ^ C0081.f81;
    }

    /* JADX INFO: renamed from: ۦۣۧ, reason: contains not printable characters */
    public static int m1996(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۤ۟۟, reason: not valid java name and contains not printable characters */
    public static iq m1997(Object obj) {
        if (C0008.m116() >= 0) {
            return ((gq) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۡ, reason: not valid java name and contains not printable characters */
    public static long m1998(Object obj) {
        if (C0116.m1470() < 0) {
            return ((bm) obj).P;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦ۠ۦ۟, reason: contains not printable characters */
    public static String m1995(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
