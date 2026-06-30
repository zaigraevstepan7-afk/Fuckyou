package android.text;

import android.graphics.Path;
import android.support.v4.app.C0005;
import androidx.appcompat.app.C0029;
import androidx.lifecycle.C0059;
import com.google.android.material.behavior.C0093;
import com.google.android.material.bottomappbar.C0095;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.floatingactionbutton.C0115;
import com.google.android.material.focus.C0120;
import com.google.android.material.transformation.C0143;
import com.reddit.frontpage.C0151;
import defpackage.C0153;
import defpackage.c01;
import defpackage.ek;
import defpackage.gs1;
import defpackage.ji;
import defpackage.ob0;
import defpackage.oj0;
import defpackage.rd;
import defpackage.rz;
import defpackage.sa0;
import defpackage.sv0;
import defpackage.wq;
import defpackage.wr;
import defpackage.xr;
import java.io.ByteArrayOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: android.text.۟ۡۧۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0010 {

    /* JADX INFO: renamed from: ۥ۟ۨۦ, reason: contains not printable characters */
    public static int f10 = 950;

    /* JADX INFO: renamed from: ۣ۟ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static long m123(Object obj) {
        if (C0005.m75() >= 0) {
            return ((rz) obj).o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۤۧ۠, reason: not valid java name and contains not printable characters */
    public static sa0 m124(Object obj) {
        if (C0151.m1894() > 0) {
            return ((wq) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static sv0 m126(Object obj) {
        if (C0095.m1228() >= 0) {
            return ((c01) obj).W0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static String m127(Object obj) {
        if (C0115.m1456() >= 0) {
            return ((gs1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m128(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static oj0 m129(Object obj) {
        if (C0120.m1522() > 0) {
            return ((ek) obj).getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static void m130(Object obj, Object obj2) {
        if (C0029.m384() >= 0) {
            ((HttpsURLConnection) obj).setSSLSocketFactory((SSLSocketFactory) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۦۦۢ, reason: not valid java name and contains not printable characters */
    public static byte m131(Object obj, int i) {
        if (C0153.m1994() > 0) {
            return ((ji) obj).a(i);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۤۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static wr m132() {
        if (C0143.m1796() >= 0) {
            return xr.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢۨ, reason: contains not printable characters */
    public static boolean m133(Object obj, int i) {
        if (C0093.m1203() > 0) {
            return ((ob0) obj).d(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۢۡ, reason: contains not printable characters */
    public static void m134(Object obj, float f, float f2) {
        if (C0059.m769() >= 0) {
            ((Path) obj).moveTo(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۧۦ, reason: contains not printable characters */
    public static String m135(Object obj) {
        if (C0153.m1994() >= 0) {
            return ((rd) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m136(String str) {
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

    /* JADX INFO: renamed from: ۨۡۡ۟, reason: not valid java name and contains not printable characters */
    public static int m137() {
        return (-950) ^ C0107.f113;
    }

    /* JADX INFO: renamed from: ۟ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static String m125(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
