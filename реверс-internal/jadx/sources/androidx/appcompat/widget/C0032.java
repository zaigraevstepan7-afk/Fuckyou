package androidx.appcompat.widget;

import android.view.C0027;
import android.view.translation.C0017;
import androidx.appcompat.app.C0028;
import androidx.compose.ui.input.pointer.C0034;
import androidx.core.app.C0042;
import androidx.graphics.path.C0057;
import com.google.android.material.focus.C0119;
import com.google.android.material.search.C0126;
import defpackage.C0157;
import defpackage.ay0;
import defpackage.bg1;
import defpackage.g31;
import defpackage.ga2;
import defpackage.jo;
import defpackage.jx0;
import defpackage.ks;
import defpackage.ob0;
import defpackage.pz;
import defpackage.r70;
import defpackage.rh;
import defpackage.ry1;
import defpackage.tv0;
import defpackage.vu1;
import defpackage.ya1;
import defpackage.yk;
import defpackage.ym1;
import defpackage.z80;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۣۢ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0032 {

    /* JADX INFO: renamed from: ۥۥ۟ۦ, reason: contains not printable characters */
    public static int f32 = 589;

    /* JADX INFO: renamed from: ۣ۟۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m419() {
        return (-748) ^ C0034.f34;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static long[] m420(Object obj) {
        if (C0028.m368() <= 0) {
            return ((ay0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۤ, reason: not valid java name and contains not printable characters */
    public static String m421(String str) {
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

    /* JADX INFO: renamed from: ۠ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ks m423(Object obj, Object obj2, Object obj3) {
        if (C0119.m1511() >= 0) {
            return ((bg1) obj).o((ks) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m424(Object obj, Object obj2, long j, long j2, Object obj3, Object obj4, int i, int i2) {
        if (C0057.m749() >= 0) {
            vu1.a((tv0) obj, (ym1) obj2, j, j2, (jo) obj3, (ob0) obj4, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۢۤۤۤ, reason: not valid java name and contains not printable characters */
    public static rh m425(Object obj) {
        if (C0017.m229() <= 0) {
            return ((ya1) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static void m426(Object obj) throws IOException {
        if (C0042.m566() < 0) {
            ((OutputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣۨۥۤ, reason: not valid java name and contains not printable characters */
    public static yk m427(Object obj) {
        if (C0126.m1590() >= 0) {
            return ((ry1) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m428(Object obj) {
        if (m419() < 0) {
            return ((ga2) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m429(Object obj, Object obj2, Object obj3) {
        if (C0126.m1590() > 0) {
            return ((r70) obj).a((pz) obj2, (ks) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static int m430(Object obj) {
        if (C0157.m2038() > 0) {
            return ((g31) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۢۨۤ, reason: not valid java name and contains not printable characters */
    public static jx0 m431(Object obj) {
        if (C0027.m365() < 0) {
            return ((z80) obj).u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۥ۠, reason: not valid java name and contains not printable characters */
    public static int m432(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static String m422(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
