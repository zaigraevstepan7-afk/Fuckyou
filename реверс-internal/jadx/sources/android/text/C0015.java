package android.text;

import android.view.translation.C0018;
import androidx.appcompat.app.C0029;
import androidx.compose.ui.input.pointer.C0034;
import androidx.core.app.C0037;
import androidx.core.graphics.drawable.C0047;
import androidx.core.graphics.drawable.C0048;
import com.google.android.material.behavior.C0090;
import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.carousel.C0110;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.floatingactionbutton.C0117;
import com.google.android.material.sidesheet.C0133;
import defpackage.C0156;
import defpackage.ba1;
import defpackage.cr0;
import defpackage.eb0;
import defpackage.f20;
import defpackage.fy0;
import defpackage.gk1;
import defpackage.ho1;
import defpackage.hr0;
import defpackage.i91;
import defpackage.ij;
import defpackage.j41;
import defpackage.qc;
import defpackage.u2;
import defpackage.vl1;
import defpackage.vm;
import defpackage.xg0;
import defpackage.xg1;
import defpackage.zl1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: android.text.ۦۡۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0015 {

    /* JADX INFO: renamed from: ۦ۟ۡۥ, reason: contains not printable characters */
    public static int f15 = -959;

    /* JADX INFO: renamed from: ۟۟ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static int m193(Object obj) {
        if (C0112.m1424() <= 0) {
            return ((ba1) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m194(Object obj) {
        if (C0034.m451() < 0) {
            return ((u2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static int m195() {
        return 724 ^ C0037.f37;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static f20 m196(Object obj) {
        if (C0099.m1272() <= 0) {
            return ((vm) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣ۟, reason: not valid java name and contains not printable characters */
    public static Object m197(Object obj) {
        if (C0110.m1397() > 0) {
            return ((j41) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦ۠, reason: not valid java name and contains not printable characters */
    public static String m198(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static fy0 m199(Object obj) {
        if (C0048.m638() > 0) {
            return ((qc) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۡ, reason: not valid java name and contains not printable characters */
    public static zl1 m200() {
        if (C0090.m1175() < 0) {
            return vl1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m201(Object obj) {
        if (C0117.m1475() >= 0) {
            return ((ho1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۤ۠, reason: not valid java name and contains not printable characters */
    public static int m202(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۨۨۧ, reason: not valid java name and contains not printable characters */
    public static String m203(Object obj) {
        if (C0018.m241() <= 0) {
            return ((cr0) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۨۢ, reason: contains not printable characters */
    public static eb0 m205(Object obj) {
        if (C0029.m384() > 0) {
            return ((hr0) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۣۡ, reason: contains not printable characters */
    public static long m206(Object obj) {
        if (C0012.m162() >= 0) {
            return ((gk1) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧۤ۠, reason: not valid java name and contains not printable characters */
    public static i91 m207() {
        if (C0133.m1681() > 0) {
            return xg0.l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۦۥ, reason: not valid java name and contains not printable characters */
    public static xg1 m208() {
        if (C0156.m2031() > 0) {
            return xg1.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m209(Object obj) {
        if (C0047.m622() < 0) {
            return ((ij) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۤۧ, reason: contains not printable characters */
    public static String m204(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
