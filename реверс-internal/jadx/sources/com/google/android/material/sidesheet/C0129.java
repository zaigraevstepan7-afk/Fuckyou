package com.google.android.material.sidesheet;

import android.app.C0000;
import android.support.v4.app.C0003;
import android.view.View;
import androidx.core.widget.C0053;
import androidx.startup.C0071;
import com.google.android.material.behavior.C0089;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.focus.C0121;
import com.google.android.material.transformation.C0146;
import com.reddit.frontpage.C0148;
import defpackage.bm;
import defpackage.cm;
import defpackage.cr0;
import defpackage.dr0;
import defpackage.fa2;
import defpackage.lr0;
import defpackage.ls;
import defpackage.nq;
import defpackage.x2;
import defpackage.xg0;
import defpackage.xg1;
import defpackage.xi0;
import java.io.ByteArrayOutputStream;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.material.sidesheet.۟۠ۥۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0129 {

    /* JADX INFO: renamed from: ۟۟ۦۤۥ, reason: not valid java name and contains not printable characters */
    public static int f135 = -388;

    /* JADX INFO: renamed from: ۟ۡۥۤۦ, reason: not valid java name and contains not printable characters */
    public static int m1623(Object obj) {
        if (C0089.m1150() >= 0) {
            return ((cr0) obj).q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧۡۤ, reason: not valid java name and contains not printable characters */
    public static int m1624(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟۟, reason: not valid java name and contains not printable characters */
    public static cm m1625() {
        if (C0134.m1687() <= 0) {
            return xi0.C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦۤ, reason: not valid java name and contains not printable characters */
    public static void m1626(Object obj, Object obj2) {
        if (C0000.m0() < 0) {
            ((View) obj).setTag(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۤ, reason: not valid java name and contains not printable characters */
    public static int m1627() {
        return (-585) ^ C0146.f152;
    }

    /* JADX INFO: renamed from: ۟ۥۧۢۡ, reason: not valid java name and contains not printable characters */
    public static void m1628(Object obj, Object obj2) {
        if (C0105.m1343() <= 0) {
            lr0.e((lr0) obj, (nq) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۦ, reason: not valid java name and contains not printable characters */
    public static xg1 m1630(Object obj) {
        if (C0148.m1860() >= 0) {
            return ((dr0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static x2 m1631(Object obj) {
        if (C0146.m1831() > 0) {
            return ((fa2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m1632(Object obj, Object obj2, Object obj3) {
        if (C0003.m50() > 0) {
            return ((xg0) obj).H((String) obj2, (ls) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۤۤ, reason: not valid java name and contains not printable characters */
    public static String m1633(String str) {
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

    /* JADX INFO: renamed from: ۣۤۢۧ, reason: not valid java name and contains not printable characters */
    public static long m1634(Object obj) {
        if (C0121.m1535() > 0) {
            return ((bm) obj).U;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۨ۟۟, reason: contains not printable characters */
    public static boolean m1635(Object obj, Object obj2) {
        if (C0071.m922() <= 0) {
            return ((Set) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۧۦۤ, reason: not valid java name and contains not printable characters */
    public static Object m1636(Object obj, boolean z, Object obj2) {
        if (C0053.m695() < 0) {
            return ((xg0) obj).D(z, (ls) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۧ, reason: not valid java name and contains not printable characters */
    public static String m1629(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
