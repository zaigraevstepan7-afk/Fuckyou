package com.reddit.frontpage;

import android.support.v4.app.C0003;
import android.support.v4.graphics.drawable.C0008;
import android.view.KeyEvent;
import androidx.core.app.C0039;
import androidx.graphics.path.C0054;
import androidx.lifecycle.C0059;
import androidx.recyclerview.widget.C0067;
import com.google.android.material.appbar.C0085;
import com.google.android.material.behavior.C0089;
import com.google.android.material.snackbar.C0136;
import defpackage.C0154;
import defpackage.bl;
import defpackage.bm;
import defpackage.cm;
import defpackage.dc1;
import defpackage.e41;
import defpackage.fy0;
import defpackage.lk1;
import defpackage.nr1;
import defpackage.ob0;
import defpackage.od1;
import defpackage.vq;
import defpackage.wi0;
import defpackage.xi0;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* JADX INFO: renamed from: com.reddit.frontpage.ۣ۟ۧۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0149 {

    /* JADX INFO: renamed from: ۦۨۥۣ, reason: contains not printable characters */
    public static int f155 = -381;

    /* JADX INFO: renamed from: ۣ۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static long m1863(Object obj) {
        if (C0154.m2006() > 0) {
            return ((bm) obj).l;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static int m1864(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۤۦۡ, reason: not valid java name and contains not printable characters */
    public static int m1865() {
        return (-412) ^ C0003.f3;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟, reason: not valid java name and contains not printable characters */
    public static cm m1866() {
        if (C0039.m516() <= 0) {
            return wi0.p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۤۤ, reason: not valid java name and contains not printable characters */
    public static fy0 m1867(Object obj) {
        if (C0067.m876() >= 0) {
            return ((od1) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤۦ, reason: not valid java name and contains not printable characters */
    public static cm m1868() {
        if (C0054.m711() > 0) {
            return xi0.K;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m1869(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m1870(Object obj) {
        if (C0089.m1150() >= 0) {
            return ((nr1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۨ۠, reason: not valid java name and contains not printable characters */
    public static List m1871(Object obj) {
        if (C0008.m116() >= 0) {
            return ((vq) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static e41 m1872() {
        if (C0059.m769() > 0) {
            return lk1.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static int m1874(Object obj) {
        if (C0085.m1094() >= 0) {
            return bl.D((KeyEvent) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static dc1 m1875(Object obj) {
        if (C0136.m1712() <= 0) {
            return ((ob0) obj).r();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥ۟, reason: not valid java name and contains not printable characters */
    public static String m1873(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
