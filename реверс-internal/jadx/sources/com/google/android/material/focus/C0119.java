package com.google.android.material.focus;

import android.support.v4.graphics.drawable.C0007;
import android.text.C0010;
import android.text.C0012;
import android.view.View;
import android.view.Window;
import androidx.core.app.C0037;
import androidx.core.app.C0041;
import androidx.versionedparcelable.C0076;
import androidx.window.reflection.C0082;
import com.google.android.material.behavior.C0091;
import com.google.android.material.search.C0126;
import com.google.android.material.transformation.C0144;
import com.google.android.material.transformation.C0145;
import defpackage.bm;
import defpackage.dr;
import defpackage.gr0;
import defpackage.hq;
import defpackage.jo;
import defpackage.l81;
import defpackage.nt0;
import defpackage.ud;
import defpackage.xl;
import defpackage.zf1;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.material.focus.ۣ۟ۡۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0119 {

    /* JADX INFO: renamed from: ۟۟ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int f125 = 102;

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Locale m1496() {
        if (C0091.m1182() >= 0) {
            return Locale.US;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۡ, reason: not valid java name and contains not printable characters */
    public static long m1497() {
        if (C0007.m100() >= 0) {
            return xl.a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m1498(Object obj) {
        if (C0010.m137() <= 0) {
            ((l81) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۧۨ, reason: not valid java name and contains not printable characters */
    public static Matcher m1499(Object obj, Object obj2) {
        if (C0144.m1814() < 0) {
            return ((Pattern) obj).matcher((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۡ, reason: not valid java name and contains not printable characters */
    public static Object m1500(Object obj) {
        if (C0037.m496() <= 0) {
            return ((ud) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۢۡ, reason: not valid java name and contains not printable characters */
    public static String m1501(Object obj) {
        if (C0041.m550() > 0) {
            return ((dr) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static long m1502(Object obj) {
        if (C0145.m1828() <= 0) {
            return ((bm) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۡۧۢ, reason: not valid java name and contains not printable characters */
    public static nt0 m1503(Object obj) {
        if (C0012.m162() > 0) {
            return ((dr) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m1504(Object obj, Object obj2) {
        if (C0076.m975() <= 0) {
            return ((gr0) obj).q(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1505(Object obj) {
        if (C0012.m162() > 0) {
            return ((zf1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۦۢ, reason: contains not printable characters */
    public static int m1506(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦ۠ۧۡ, reason: contains not printable characters */
    public static jo m1507(Object obj) {
        if (C0082.m1058() <= 0) {
            return ((hq) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۟۟, reason: not valid java name and contains not printable characters */
    public static String m1509(String str) {
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

    /* JADX INFO: renamed from: ۧۤۨۤ, reason: not valid java name and contains not printable characters */
    public static View m1510(Object obj) {
        if (C0122.m1542() <= 0) {
            return ((Window) obj).getDecorView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m1511() {
        return 476 ^ C0126.f132;
    }

    /* JADX INFO: renamed from: ۧۡۡۦ, reason: not valid java name and contains not printable characters */
    public static String m1508(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
