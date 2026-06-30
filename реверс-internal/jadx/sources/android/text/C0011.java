package android.text;

import android.app.C0001;
import android.support.v4.graphics.drawable.C0006;
import android.view.translation.C0017;
import androidx.appcompat.app.C0028;
import androidx.appcompat.widget.C0030;
import androidx.appcompat.widget.C0032;
import androidx.core.graphics.drawable.C0045;
import androidx.recyclerview.widget.C0068;
import com.google.android.material.carousel.C0108;
import com.google.android.material.sidesheet.C0134;
import com.google.android.material.snackbar.C0135;
import defpackage.ba2;
import defpackage.bk1;
import defpackage.cm;
import defpackage.g12;
import defpackage.g20;
import defpackage.ld0;
import defpackage.ns1;
import defpackage.nt0;
import defpackage.om;
import defpackage.qc;
import defpackage.u42;
import defpackage.xi0;
import defpackage.yc;
import defpackage.yd;
import defpackage.yq;
import defpackage.zj1;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: android.text.ۣ۟۠ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0011 {

    /* JADX INFO: renamed from: ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static int f11 = -497;

    /* JADX INFO: renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static ns1 m138(Object obj) {
        if (C0032.m419() < 0) {
            return ((qc) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۨ, reason: not valid java name and contains not printable characters */
    public static Charset m139() {
        if (C0068.m888() < 0) {
            return StandardCharsets.UTF_8;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨۥ, reason: not valid java name and contains not printable characters */
    public static void m140() {
        if (C0006.m96() > 0) {
            yc.j();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨۦۤ, reason: not valid java name and contains not printable characters */
    public static int m142(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥ, reason: not valid java name and contains not printable characters */
    public static nt0 m143(Object obj) {
        if (C0001.m16() <= 0) {
            return ((yq) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۨ, reason: not valid java name and contains not printable characters */
    public static long m144(Object obj) {
        if (C0134.m1687() < 0) {
            return ((ba2) obj).f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static g12 m145(Object obj, Object obj2, Object obj3, boolean z, Object obj4, double d) {
        if (C0017.m229() <= 0) {
            return ((om) obj).f((u42) obj2, (ld0) obj3, z, (g20) obj4, d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۥ, reason: not valid java name and contains not printable characters */
    public static String m146(String str) {
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

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static String m147(Object obj) {
        if (C0108.m1373() < 0) {
            return ((yd) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۥ, reason: not valid java name and contains not printable characters */
    public static Process m148(Object obj, Object obj2) {
        if (C0028.m368() < 0) {
            return ((Runtime) obj).exec((String[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۦۦ, reason: contains not printable characters */
    public static bk1 m149(Object obj) {
        if (C0135.m1701() > 0) {
            return ((zj1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۢۤ, reason: not valid java name and contains not printable characters */
    public static int m150() {
        return (-906) ^ C0030.f30;
    }

    /* JADX INFO: renamed from: ۨۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static cm m151() {
        if (C0045.m596() < 0) {
            return xi0.X;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۡۥ, reason: not valid java name and contains not printable characters */
    public static String m141(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
