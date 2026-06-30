package com.google.android.material.bottomsheet;

import android.support.v4.graphics.drawable.C0006;
import android.text.C0014;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0031;
import androidx.core.app.C0040;
import androidx.core.app.C0042;
import androidx.core.widget.C0052;
import androidx.lifecycle.C0059;
import androidx.lifecycle.C0060;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0092;
import com.google.android.material.carousel.C0110;
import com.reddit.frontpage.C0147;
import defpackage.C0154;
import defpackage.ay0;
import defpackage.bm;
import defpackage.dp;
import defpackage.dr0;
import defpackage.hj;
import defpackage.hk;
import defpackage.ho1;
import defpackage.lr0;
import defpackage.ls;
import defpackage.pv;
import defpackage.r9;
import defpackage.u2;
import defpackage.v20;
import defpackage.zc;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.۟ۥۢۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0102 {

    /* JADX INFO: renamed from: ۤۢۨۥ, reason: not valid java name and contains not printable characters */
    public static int f108 = -879;

    /* JADX INFO: renamed from: ۣ۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static View m1300(Object obj, int i) {
        if (C0154.m2006() >= 0) {
            return ((ViewGroup) obj).getChildAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m1301(Object obj, Object obj2, Object obj3) {
        if (C0110.m1397() >= 0) {
            return ((v20) obj).j((dr0) obj2, (ls) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1302(Object obj) {
        if (C0031.m407() > 0) {
            return ((hj) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۤۢ, reason: not valid java name and contains not printable characters */
    public static r9 m1303() {
        if (C0060.m781() < 0) {
            return dp.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m1304(String str) {
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
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static ay0 m1305(Object obj) {
        if (C0014.m186() <= 0) {
            return ((ho1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static OutputStream m1306(Object obj) {
        if (C0059.m769() > 0) {
            return ((URLConnection) obj).getOutputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1307(Object obj) {
        if (C0092.m1194() > 0) {
            return hk.j((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۧ۠, reason: not valid java name and contains not printable characters */
    public static String m1308(Object obj) {
        if (C0006.m96() >= 0) {
            return ((u2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۧۢ, reason: not valid java name and contains not printable characters */
    public static int m1309() {
        return (-979) ^ C0042.f42;
    }

    /* JADX INFO: renamed from: ۤۧۧ, reason: not valid java name and contains not printable characters */
    public static long m1310(Object obj) {
        if (C0090.m1175() <= 0) {
            return ((bm) obj).T;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۧۨۨ, reason: contains not printable characters */
    public static String m1311(Object obj) {
        if (C0147.m1843() > 0) {
            return ((File) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۤ۠, reason: contains not printable characters */
    public static int m1312(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۨۤۡ, reason: not valid java name and contains not printable characters */
    public static Object m1314(Object obj, Object obj2) {
        if (C0052.m681() > 0) {
            return lr0.f((lr0) obj, (ls) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥۢ, reason: not valid java name and contains not printable characters */
    public static zc m1315() {
        if (C0040.m542() < 0) {
            return pv.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۨۥ, reason: not valid java name and contains not printable characters */
    public static String m1313(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
