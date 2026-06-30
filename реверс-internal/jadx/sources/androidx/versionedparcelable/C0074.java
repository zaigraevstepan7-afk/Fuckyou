package androidx.versionedparcelable;

import android.app.C0000;
import androidx.appcompat.app.C0028;
import androidx.core.app.C0042;
import androidx.graphics.path.C0056;
import androidx.lifecycle.C0059;
import com.google.android.material.behavior.C0089;
import com.google.android.material.bottomappbar.C0101;
import com.reddit.frontpage.C0147;
import defpackage.c2;
import defpackage.dr;
import defpackage.fy0;
import defpackage.ha0;
import defpackage.kt;
import defpackage.l32;
import defpackage.lt;
import defpackage.lt0;
import defpackage.ob0;
import defpackage.t32;
import defpackage.xl;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: androidx.versionedparcelable.۟ۤ۟ۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0074 {

    /* JADX INFO: renamed from: ۟ۥۦ۟, reason: not valid java name and contains not printable characters */
    public static int f74 = -9;

    /* JADX INFO: renamed from: ۟ۡ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m954(Object obj, Object obj2) {
        if (C0147.m1843() >= 0) {
            return ((MessageDigest) obj).digest((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۡۢ, reason: not valid java name and contains not printable characters */
    public static t32 m956() {
        if (C0042.m566() < 0) {
            return t32.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨۨ, reason: not valid java name and contains not printable characters */
    public static l32 m957(Object obj) {
        if (C0059.m769() > 0) {
            return ((lt0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۡ, reason: not valid java name and contains not printable characters */
    public static lt m958(Object obj, Object obj2) {
        if (C0028.m368() < 0) {
            return ((lt) obj).u((kt) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۢۧ, reason: not valid java name and contains not printable characters */
    public static int m959(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۡۦۨ, reason: not valid java name and contains not printable characters */
    public static fy0 m960(Object obj) {
        if (C0101.m1291() <= 0) {
            return ((dr) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static long m961() {
        if (C0056.m738() <= 0) {
            return xl.d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۥۦۢ, reason: not valid java name and contains not printable characters */
    public static String m962(String str) {
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

    /* JADX INFO: renamed from: ۦۤۦۤ, reason: contains not printable characters */
    public static int m963() {
        return 354 ^ C0089.f95;
    }

    /* JADX INFO: renamed from: ۧۦۡ۟, reason: not valid java name and contains not printable characters */
    public static void m964(boolean z, Object obj, Object obj2, int i) {
        if (C0000.m0() < 0) {
            c2.b(z, (ha0) obj, (ob0) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m955(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
