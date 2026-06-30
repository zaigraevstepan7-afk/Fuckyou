package android.app;

import android.support.v4.app.C0003;
import android.support.v4.graphics.drawable.C0008;
import android.view.C0026;
import android.view.translation.C0020;
import androidx.core.app.C0042;
import androidx.profileinstaller.C0064;
import com.google.android.material.appbar.C0087;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.focus.C0119;
import com.google.android.material.search.C0127;
import com.google.android.material.transformation.C0145;
import defpackage.ca2;
import defpackage.d02;
import defpackage.f32;
import defpackage.f70;
import defpackage.ga2;
import defpackage.ha0;
import defpackage.ib0;
import defpackage.jo;
import defpackage.ks;
import defpackage.l32;
import defpackage.lt;
import defpackage.ob0;
import defpackage.p20;
import defpackage.pd1;
import defpackage.ph;
import defpackage.q20;
import defpackage.rz;
import defpackage.sa0;
import defpackage.tv0;
import defpackage.wi0;
import defpackage.y41;
import defpackage.zq0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: android.app.ۣۨ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0001 {

    /* JADX INFO: renamed from: ۣ۟۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static int f1 = 110;

    /* JADX INFO: renamed from: ۟ۡۢۢۡ, reason: not valid java name and contains not printable characters */
    public static void m14(Object obj, float f) {
        if (C0127.m1604() >= 0) {
            ((y41) obj).v(f);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static String m15(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static int m16() {
        return (-727) ^ C0112.f118;
    }

    /* JADX INFO: renamed from: ۟ۢۥۦۢ, reason: not valid java name and contains not printable characters */
    public static f70 m17(Object obj, Object obj2, int i, Object obj3, int i2) {
        if (C0064.m840() >= 0) {
            return ib0.i((ib0) obj, (lt) obj2, i, (ph) obj3, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m18(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        if (C0026.m355() >= 0) {
            wi0.k((l32) obj, (sa0) obj2, (sa0) obj3, (sa0) obj4, (sa0) obj5, (ha0) obj6, (ha0) obj7, (tv0) obj8, (ob0) obj9, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦ۟۠, reason: not valid java name and contains not printable characters */
    public static int m19(Object obj) {
        if (C0087.m1123() <= 0) {
            return ((zq0) obj).p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static q20 m21() {
        if (C0119.m1511() > 0) {
            return p20.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m22(Object obj) {
        if (C0145.m1828() <= 0) {
            return ((l32) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static float m23(Object obj) {
        if (C0105.m1343() < 0) {
            return ((ga2) obj).d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۡۧ۠, reason: not valid java name and contains not printable characters */
    public static int m24(Object obj) {
        if (C0020.m271() > 0) {
            return ((ca2) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۡۤ, reason: contains not printable characters */
    public static d02 m25(Object obj) {
        if (C0008.m116() > 0) {
            return ((f32) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣۤ, reason: contains not printable characters */
    public static ks m26(Object obj, Object obj2, Object obj3) {
        if (C0042.m566() <= 0) {
            return ((rz) obj).o((ks) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static void m27(boolean z, Object obj, Object obj2, int i) {
        if (C0003.m50() >= 0) {
            pd1.f(z, (jo) obj, (ob0) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۨۥۢۨ, reason: not valid java name and contains not printable characters */
    public static int m28(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static String m20(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
