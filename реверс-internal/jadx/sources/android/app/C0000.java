package android.app;

import androidx.compose.ui.input.pointer.C0035;
import androidx.core.app.C0040;
import androidx.lifecycle.C0060;
import com.google.android.material.appbar.C0087;
import com.google.android.material.behavior.C0092;
import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.focus.C0120;
import com.google.android.material.search.C0126;
import defpackage.ba2;
import defpackage.c2;
import defpackage.cr0;
import defpackage.gr0;
import defpackage.h60;
import defpackage.ij;
import defpackage.iq;
import defpackage.or1;
import defpackage.pc1;
import defpackage.sd;
import defpackage.ya1;
import defpackage.ye0;
import defpackage.zq;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: android.app.ۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0000 {

    /* JADX INFO: renamed from: ۟ۦۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int f0 = -194;

    /* JADX INFO: renamed from: ۣ۟۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static int m0() {
        return 901 ^ C0060.f60;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static void m1(Object obj, Object obj2) {
        if (C0120.m1522() > 0) {
            h60.Y((File) obj, (File) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m2(Object obj, Object obj2, Object obj3) {
        if (C0103.m1322() < 0) {
            return cr0.s((ya1) obj, (or1) obj2, (cr0) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static ye0 m3() {
        if (C0035.m461() >= 0) {
            return c2.l();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m4(Object obj) {
        if (C0087.m1123() < 0) {
            return ((gr0) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۢ, reason: not valid java name and contains not printable characters */
    public static int m5(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static void m6(Object obj) throws IOException {
        if (C0126.m1590() > 0) {
            ((BufferedInputStream) obj).reset();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8(Object obj, Object obj2) {
        if (C0103.m1322() < 0) {
            return ((pc1) obj).g((pc1) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static String m9(Object obj) {
        if (C0099.m1272() < 0) {
            return ((ba2) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۧۥ, reason: not valid java name and contains not printable characters */
    public static Object m10(Object obj) {
        if (C0112.m1424() < 0) {
            return ((ij) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۦ۠, reason: not valid java name and contains not printable characters */
    public static String m11(String str) {
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

    /* JADX INFO: renamed from: ۣۡۨۡ, reason: not valid java name and contains not printable characters */
    public static sd m12() {
        if (C0092.m1194() > 0) {
            return sd.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۥۦ, reason: not valid java name and contains not printable characters */
    public static iq m13(Object obj) {
        if (C0040.m542() < 0) {
            return ((zq) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static String m7(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
