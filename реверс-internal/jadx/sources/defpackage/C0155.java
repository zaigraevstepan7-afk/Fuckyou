package defpackage;

import android.app.RemoteAction;
import android.view.C0022;
import android.view.C0026;
import androidx.graphics.path.C0054;
import androidx.lifecycle.C0060;
import androidx.profileinstaller.C0063;
import androidx.window.reflection.C0081;
import com.google.android.material.behavior.C0088;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.focus.C0119;
import com.google.android.material.snackbar.C0138;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: ۣۧۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0155 {

    /* JADX INFO: renamed from: ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static int f232 = -866;

    /* JADX INFO: renamed from: ۟۟ۦۥۦ, reason: not valid java name and contains not printable characters */
    public static String m2011(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۤۡۤ, reason: not valid java name and contains not printable characters */
    public static zd0 m2013() {
        if (C0081.m1040() > 0) {
            return pv.w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m2014(Object obj, float f, float f2) {
        if (C0063.m824() > 0) {
            ((y41) obj).w(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static h22 m2015() {
        if (C0054.m711() > 0) {
            return h22.g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۧ, reason: not valid java name and contains not printable characters */
    public static xg0 m2016(Object obj) {
        if (C0119.m1511() >= 0) {
            return ((lr0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static iq m2017(Object obj) {
        if (C0103.m1322() <= 0) {
            return ((er0) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int m2018(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static int m2019() {
        return 584 ^ C0088.f94;
    }

    /* JADX INFO: renamed from: ۤ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static ha0 m2020(Object obj) {
        if (C0026.m355() > 0) {
            return ((hq) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۦ, reason: contains not printable characters */
    public static CharSequence m2021(Object obj) {
        if (C0063.m824() > 0) {
            return ((RemoteAction) obj).getTitle();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2022(Object obj) {
        if (C0022.m288() <= 0) {
            return ((xq0) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static long m2023(Object obj) {
        if (C0060.m781() <= 0) {
            return ((pd0) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۨ۟, reason: not valid java name and contains not printable characters */
    public static long m2024(Object obj) {
        if (C0138.m1738() > 0) {
            return ((bm) obj).e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m2012(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
