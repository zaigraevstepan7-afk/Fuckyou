package androidx.recyclerview.widget;

import android.app.C0000;
import android.view.C0027;
import androidx.lifecycle.C0060;
import androidx.profileinstaller.C0062;
import androidx.versionedparcelable.C0074;
import androidx.window.reflection.C0081;
import com.google.android.material.bottomappbar.C0095;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.sidesheet.C0129;
import com.google.android.material.sidesheet.C0131;
import defpackage.aa0;
import defpackage.bm;
import defpackage.cm;
import defpackage.d02;
import defpackage.dw1;
import defpackage.ga2;
import defpackage.iq;
import defpackage.ks;
import defpackage.mz1;
import defpackage.ns1;
import defpackage.ob0;
import defpackage.qq;
import defpackage.rz;
import defpackage.tv0;
import defpackage.w61;
import defpackage.wi0;
import defpackage.xl;
import defpackage.zd;
import defpackage.zx0;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۨ۠ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0068 {

    /* JADX INFO: renamed from: ۟ۥ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int f68 = -575;

    /* JADX INFO: renamed from: ۣ۟۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m885(Object obj) {
        if (C0095.m1228() >= 0) {
            return ((ns1) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m887(Object obj, Object obj2, long j, long j2, Object obj3, long j3, Object obj4, long j4, int i, boolean z, int i2, int i3, Object obj5, Object obj6, int i4, int i5, int i6) {
        if (C0027.m365() < 0) {
            mz1.b((String) obj, (tv0) obj2, j, j2, (aa0) obj3, j3, (dw1) obj4, j4, i, z, i2, i3, (d02) obj5, (ob0) obj6, i4, i5, i6);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۢ۟, reason: not valid java name and contains not printable characters */
    public static int m888() {
        return 57 ^ C0074.f74;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static long m889(Object obj) {
        if (C0131.m1649() < 0) {
            return ((bm) obj).L;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۡ, reason: not valid java name and contains not printable characters */
    public static String m890(Object obj) {
        if (C0000.m0() <= 0) {
            return ((ga2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۦۢ, reason: not valid java name and contains not printable characters */
    public static SimpleDateFormat m891() {
        if (C0060.m781() < 0) {
            return iq.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static X509TrustManager m892(Object obj) {
        if (C0081.m1040() > 0) {
            return ((w61) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡۡ, reason: not valid java name and contains not printable characters */
    public static cm m893() {
        if (C0129.m1627() <= 0) {
            return wi0.l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static String m894(Object obj) {
        if (C0000.m0() < 0) {
            return ((qq) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static int m895(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static Object[] m896(Object obj) {
        if (C0081.m1040() > 0) {
            return ((zx0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۧۤ, reason: not valid java name and contains not printable characters */
    public static int m897(Object obj) {
        if (C0062.m818() < 0) {
            return ((rz) obj).t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static ks m898(Object obj, Object obj2, Object obj3) {
        if (C0095.m1228() > 0) {
            return ((zd) obj).o((ks) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۧ, reason: not valid java name and contains not printable characters */
    public static long m899() {
        if (C0105.m1343() < 0) {
            return xl.b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣۤۢ, reason: contains not printable characters */
    public static String m900(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static String m886(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
