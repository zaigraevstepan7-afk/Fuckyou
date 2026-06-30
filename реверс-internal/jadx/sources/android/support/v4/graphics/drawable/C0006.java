package android.support.v4.graphics.drawable;

import android.os.Bundle;
import androidx.core.app.C0044;
import androidx.core.graphics.drawable.C0045;
import androidx.core.graphics.drawable.C0046;
import androidx.profileinstaller.C0061;
import androidx.window.reflection.C0081;
import com.google.android.material.bottomappbar.C0096;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.search.C0128;
import com.google.android.material.sidesheet.C0129;
import com.google.android.material.sidesheet.C0132;
import com.google.android.material.snackbar.C0136;
import com.google.android.material.snackbar.C0137;
import defpackage.C0156;
import defpackage.dg1;
import defpackage.dr;
import defpackage.g12;
import defpackage.g20;
import defpackage.gk;
import defpackage.kd1;
import defpackage.l91;
import defpackage.ld0;
import defpackage.ls;
import defpackage.ob0;
import defpackage.om;
import defpackage.pl;
import defpackage.tv0;
import defpackage.u42;
import defpackage.vq;
import defpackage.wa0;
import defpackage.ye0;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.graphics.drawable.۟۠ۦۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0006 {

    /* JADX INFO: renamed from: ۟ۢۦۣۧ, reason: not valid java name and contains not printable characters */
    public static int f6 = -659;

    /* JADX INFO: renamed from: ۣ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static Object m82(Object obj, Object obj2) {
        if (C0129.m1627() <= 0) {
            return ((l91) obj).t((ls) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۤ۟, reason: not valid java name and contains not printable characters */
    public static wa0 m83(Object obj) {
        if (C0061.m803() <= 0) {
            return ((vq) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۥ, reason: not valid java name and contains not printable characters */
    public static l91 m84(Object obj) {
        if (C0044.m586() < 0) {
            return ((dg1) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۧ, reason: not valid java name and contains not printable characters */
    public static g12 m86(Object obj, Object obj2, Object obj3, boolean z, Object obj4, double d) {
        if (C0096.m1232() >= 0) {
            return ((om) obj).d((u42) obj2, (ld0) obj3, z, (g20) obj4, d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۥۥ, reason: not valid java name and contains not printable characters */
    public static void m87(Object obj, Object obj2) {
        if (C0112.m1424() <= 0) {
            ((Bundle) obj).setClassLoader((ClassLoader) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤۦۨ, reason: not valid java name and contains not printable characters */
    public static ob0 m88(Object obj, int i) {
        if (C0132.m1666() < 0) {
            return ((ob0) obj).X(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m89(Object obj) {
        if (C0137.m1727() < 0) {
            return pl.c0((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۢ, reason: not valid java name and contains not printable characters */
    public static String m90(String str) {
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

    /* JADX INFO: renamed from: ۣۢۧ۟, reason: not valid java name and contains not printable characters */
    public static void m91(Object obj, Object obj2, long j, long j2, float f, float f2, Object obj3, int i, int i2) {
        if (C0081.m1040() >= 0) {
            kd1.a((ye0) obj, (tv0) obj2, j, j2, f, f2, (ob0) obj3, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۤ۠۟, reason: not valid java name and contains not printable characters */
    public static int m92(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static int m93(Object obj) {
        if (C0045.m596() <= 0) {
            return ((List) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥۣ۟, reason: contains not printable characters */
    public static Object m94(Object obj) {
        if (C0156.m2031() > 0) {
            return ((gk) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۦۧ, reason: contains not printable characters */
    public static void m95(Object obj) {
        if (C0128.m1607() < 0) {
            ((ob0) obj).Z();
        }
    }

    /* JADX INFO: renamed from: ۦۦۣۤ, reason: contains not printable characters */
    public static int m96() {
        return (-606) ^ C0046.f46;
    }

    /* JADX INFO: renamed from: ۨۢۨۧ, reason: not valid java name and contains not printable characters */
    public static wa0 m97(Object obj) {
        if (C0136.m1712() <= 0) {
            return ((dr) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m85(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
