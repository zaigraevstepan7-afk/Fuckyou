package androidx.versionedparcelable;

import android.text.C0014;
import android.text.C0016;
import androidx.compose.ui.input.pointer.C0036;
import androidx.core.app.C0040;
import androidx.core.app.C0041;
import androidx.core.graphics.drawable.C0049;
import androidx.lifecycle.C0059;
import com.google.android.material.appbar.C0086;
import defpackage.C0156;
import defpackage.ar;
import defpackage.ba2;
import defpackage.bm;
import defpackage.fy0;
import defpackage.ij;
import defpackage.ns1;
import defpackage.rc;
import defpackage.sa0;
import defpackage.wq;
import defpackage.xq;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;

/* JADX INFO: renamed from: androidx.versionedparcelable.ۦۤۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0077 {

    /* JADX INFO: renamed from: ۟ۢ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static int f77 = -260;

    /* JADX INFO: renamed from: ۟۟ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static void m986(Object obj, Object obj2) throws ProtocolException {
        if (C0016.m218() <= 0) {
            ((HttpURLConnection) obj).setRequestMethod((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static int m987(Object obj) {
        if (C0049.m645() >= 0) {
            return ((ij) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static ns1 m988(Object obj) {
        if (C0040.m542() <= 0) {
            return ((rc) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m989(Object obj) {
        if (C0041.m550() >= 0) {
            return ((ar) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static sa0 m990(Object obj) {
        if (C0014.m186() <= 0) {
            return ((wq) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static fy0 m991(Object obj) {
        if (C0059.m769() > 0) {
            return ((xq) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۦۥ, reason: not valid java name and contains not printable characters */
    public static String m992(Object obj) {
        if (C0086.m1107() > 0) {
            return ((ba2) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۦ, reason: not valid java name and contains not printable characters */
    public static String m993(String str) {
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

    /* JADX INFO: renamed from: ۢۥۡۧ, reason: not valid java name and contains not printable characters */
    public static int m995(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m996() {
        return 561 ^ C0036.f36;
    }

    /* JADX INFO: renamed from: ۦۦۧۤ, reason: contains not printable characters */
    public static long m997(Object obj) {
        if (C0156.m2031() >= 0) {
            return ((bm) obj).h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m994(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
