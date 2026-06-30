package androidx.appcompat.app;

import android.view.C0024;
import androidx.versionedparcelable.C0076;
import androidx.versionedparcelable.C0077;
import androidx.window.area.reflectionguard.C0078;
import com.google.android.material.appbar.C0086;
import com.google.android.material.bottomappbar.C0096;
import com.google.android.material.search.C0125;
import com.google.android.material.search.C0127;
import com.google.android.material.sidesheet.C0129;
import com.google.android.material.sidesheet.C0132;
import com.google.android.material.snackbar.C0137;
import com.google.android.material.transformation.C0146;
import defpackage.bm;
import defpackage.cg1;
import defpackage.ia1;
import defpackage.of;
import defpackage.p10;
import defpackage.qq;
import defpackage.rz;
import defpackage.tx;
import defpackage.x2;
import defpackage.xc;
import defpackage.xg0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.appcompat.app.ۨۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0029 {

    /* JADX INFO: renamed from: ۢ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static int f29 = -182;

    /* JADX INFO: renamed from: ۟۟ۥۤۢ, reason: not valid java name and contains not printable characters */
    public static long m375(Object obj) {
        if (C0137.m1727() <= 0) {
            return ((bm) obj).y;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۢۡ۟, reason: not valid java name and contains not printable characters */
    public static int m376(Object obj) {
        if (C0096.m1232() >= 0) {
            return ((ia1) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥ۟, reason: not valid java name and contains not printable characters */
    public static Float m377(Object obj) {
        if (C0132.m1666() <= 0) {
            return ((x2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m378(Object obj) {
        if (C0024.m321() >= 0) {
            xc.G(obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۥ۠, reason: not valid java name and contains not printable characters */
    public static void m379(Object obj) {
        if (C0078.m998() <= 0) {
            ((of) obj).run();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۧۢ, reason: not valid java name and contains not printable characters */
    public static int m381(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۤ۠۟, reason: not valid java name and contains not printable characters */
    public static Runtime m382() {
        if (C0086.m1107() >= 0) {
            return Runtime.getRuntime();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۢۦ, reason: not valid java name and contains not printable characters */
    public static String m383(Object obj) {
        if (C0077.m996() > 0) {
            return ((tx) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۦۦ, reason: not valid java name and contains not printable characters */
    public static int m384() {
        return 173 ^ C0127.f133;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static long m385(Object obj) {
        if (C0076.m975() < 0) {
            return ((rz) obj).p;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۦۤ, reason: not valid java name and contains not printable characters */
    public static String m386(String str) {
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

    /* JADX INFO: renamed from: ۥۦۥۧ, reason: contains not printable characters */
    public static Object m387(Object obj, Object obj2) {
        if (C0146.m1831() >= 0) {
            return ((cg1) obj).q(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۡ۠, reason: contains not printable characters */
    public static void m388(Object obj, long j, float f, long j2, int i) {
        if (C0129.m1627() < 0) {
            p10.c0((p10) obj, j, f, j2, i);
        }
    }

    /* JADX INFO: renamed from: ۦۦۦۦ, reason: contains not printable characters */
    public static xg0 m389(Object obj) {
        if (C0125.m1584() < 0) {
            return ((qq) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۡۢ, reason: not valid java name and contains not printable characters */
    public static String m380(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
