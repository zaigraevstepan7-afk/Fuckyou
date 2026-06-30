package com.google.android.material.appbar;

import android.media.MediaPlayer;
import android.support.v4.app.C0003;
import androidx.appcompat.app.C0028;
import com.google.android.material.behavior.C0090;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.floatingactionbutton.C0114;
import com.google.android.material.focus.C0120;
import com.google.android.material.focus.C0122;
import com.google.android.material.search.C0124;
import com.google.android.material.search.C0126;
import defpackage.ea2;
import defpackage.eu;
import defpackage.ha0;
import defpackage.hk;
import defpackage.ir0;
import defpackage.jr0;
import defpackage.l81;
import defpackage.lk;
import defpackage.lr0;
import defpackage.xi0;
import defpackage.y41;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.material.appbar.ۣ۠۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0085 {

    /* JADX INFO: renamed from: ۣ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static int f91 = -11;

    /* JADX INFO: renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m1091(Object obj) {
        if (C0107.m1359() <= 0) {
            return eu.a((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟۠, reason: not valid java name and contains not printable characters */
    public static long m1092(Object obj, Object obj2) {
        if (C0028.m368() < 0) {
            return xi0.w((InputStream) obj, (OutputStream) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static String m1093(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۥۥۨ, reason: not valid java name and contains not printable characters */
    public static int m1094() {
        return 84 ^ C0122.f128;
    }

    /* JADX INFO: renamed from: ۠ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static int m1095(long j) {
        if (C0120.m1522() >= 0) {
            return lk.l0(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۥۧ, reason: not valid java name and contains not printable characters */
    public static Object m1096(Object obj) {
        if (C0126.m1590() >= 0) {
            return ((y41) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۟۟, reason: contains not printable characters */
    public static MediaPlayer m1097(Object obj) {
        if (C0003.m50() >= 0) {
            return ((jr0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۠ۦ, reason: contains not printable characters */
    public static lr0 m1098(Object obj) {
        if (C0090.m1175() < 0) {
            return ((ir0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۡۢ, reason: contains not printable characters */
    public static int m1099(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۤ۟۠, reason: contains not printable characters */
    public static ha0 m1100(Object obj) {
        if (C0105.m1343() < 0) {
            return ((ea2) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static List m1102(Object obj) {
        if (C0124.m1574() > 0) {
            return hk.G(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1103(Object obj) {
        if (C0114.m1448() >= 0) {
            return lk.r((l81) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۥۤۥ, reason: contains not printable characters */
    public static String m1101(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
