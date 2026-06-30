package com.google.android.material.search;

import android.view.C0026;
import androidx.appcompat.widget.C0032;
import androidx.compose.ui.input.pointer.C0036;
import androidx.core.app.C0039;
import androidx.core.widget.C0053;
import androidx.profileinstaller.C0061;
import androidx.startup.C0071;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0094;
import com.google.android.material.floatingactionbutton.C0115;
import com.google.android.material.focus.C0118;
import com.google.android.material.sidesheet.C0132;
import com.google.android.material.snackbar.C0136;
import com.reddit.frontpage.C0149;
import defpackage.cr0;
import defpackage.ct1;
import defpackage.g31;
import defpackage.gk1;
import defpackage.jc1;
import defpackage.l91;
import defpackage.lr0;
import defpackage.oc;
import defpackage.qs1;
import defpackage.sa0;
import defpackage.uf;
import defpackage.v20;
import defpackage.vi;
import defpackage.vl;
import java.io.ByteArrayOutputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.TrustManagerFactory;

/* JADX INFO: renamed from: com.google.android.material.search.ۥۤ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0128 {

    /* JADX INFO: renamed from: ۣۡۧۨ, reason: not valid java name and contains not printable characters */
    public static int f134 = 755;

    /* JADX INFO: renamed from: ۟۟ۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static PublicKey m1605(Object obj) {
        if (C0094.m1215() > 0) {
            return ((Certificate) obj).getPublicKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static uf m1606() {
        if (C0061.m803() <= 0) {
            return v20.j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠, reason: not valid java name and contains not printable characters */
    public static int m1607() {
        return 739 ^ C0136.f142;
    }

    /* JADX INFO: renamed from: ۟ۡۡۦۨ, reason: not valid java name and contains not printable characters */
    public static int m1608(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static qs1 m1609(Object obj) {
        if (C0118.m1484() > 0) {
            return ((lr0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static vi m1610(Object obj) {
        if (C0090.m1175() <= 0) {
            return ((jc1) obj).y();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static long m1611() {
        if (C0053.m695() < 0) {
            return vl.f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢ۠, reason: not valid java name and contains not printable characters */
    public static String m1612() {
        if (C0132.m1666() <= 0) {
            return l91.h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static void m1613(Object obj) {
        if (C0071.m922() < 0) {
            ((Process) obj).destroy();
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static String m1614(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۢۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m1616() {
        if (C0053.m695() <= 0) {
            return TrustManagerFactory.getDefaultAlgorithm();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۧ, reason: not valid java name and contains not printable characters */
    public static String m1617(Object obj) {
        if (C0026.m355() >= 0) {
            return ct1.U((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۧ, reason: contains not printable characters */
    public static long m1618(Object obj) {
        if (C0036.m473() >= 0) {
            return ((gk1) obj).l;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۤۨ۠, reason: contains not printable characters */
    public static Iterator m1619(Object obj) {
        if (C0115.m1456() >= 0) {
            return ((Set) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۠ۢ, reason: contains not printable characters */
    public static sa0 m1620(Object obj) {
        if (C0039.m516() < 0) {
            return ((g31) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۧۢ, reason: not valid java name and contains not printable characters */
    public static oc m1621(Object obj) {
        if (C0149.m1865() <= 0) {
            return ((cr0) obj).s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨ۟, reason: not valid java name and contains not printable characters */
    public static long m1622(Object obj) {
        if (C0032.m419() < 0) {
            return ((gk1) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m1615(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
