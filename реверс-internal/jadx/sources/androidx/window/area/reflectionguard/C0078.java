package androidx.window.area.reflectionguard;

import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import android.view.C0022;
import androidx.core.app.C0039;
import androidx.core.widget.C0053;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.floatingactionbutton.C0116;
import com.google.android.material.sidesheet.C0133;
import com.reddit.frontpage.C0151;
import defpackage.C0152;
import defpackage.bc1;
import defpackage.br;
import defpackage.c2;
import defpackage.c41;
import defpackage.ci;
import defpackage.f20;
import defpackage.gi;
import defpackage.ha0;
import defpackage.jo;
import defpackage.lr0;
import defpackage.ob0;
import defpackage.oc;
import defpackage.ql0;
import defpackage.tk0;
import defpackage.tv0;
import defpackage.vm;
import defpackage.wa0;
import defpackage.wt;
import defpackage.xh;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* JADX INFO: renamed from: androidx.window.area.reflectionguard.ۧ۠۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0078 {

    /* JADX INFO: renamed from: ۟ۥ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static int f78 = 399;

    /* JADX INFO: renamed from: ۟۟۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static int m998() {
        return (-730) ^ C0039.f39;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static String m999(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static f20 m1000(Object obj) {
        if (C0116.m1470() < 0) {
            return ((vm) obj).z();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۨۢ, reason: not valid java name and contains not printable characters */
    public static wa0 m1001(Object obj) {
        if (C0105.m1343() <= 0) {
            return ((br) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۤۨ, reason: not valid java name and contains not printable characters */
    public static void m1002(Object obj, Object obj2, Object obj3, boolean z, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, int i2) {
        if (C0151.m1894() > 0) {
            c2.c((ha0) obj, (gi) obj2, (tv0) obj3, z, (xh) obj4, (ci) obj5, (c41) obj6, (jo) obj7, (ob0) obj8, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۧۢ, reason: not valid java name and contains not printable characters */
    public static Object m1003(Object obj) {
        if (C0022.m288() < 0) {
            return ((tk0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۥۨ, reason: not valid java name and contains not printable characters */
    public static wt m1005() {
        if (C0004.m65() >= 0) {
            return wt.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1006(Object obj, boolean z, boolean z2) {
        if (C0133.m1681() >= 0) {
            return ((File) obj).setExecutable(z, z2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۧۡ, reason: not valid java name and contains not printable characters */
    public static bc1 m1007(Object obj) {
        if (C0152.m1979() >= 0) {
            return ((lr0) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static ql0 m1008(Object obj) {
        if (C0053.m695() < 0) {
            return ((ql0) obj).u();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m1009(Object obj) {
        if (C0004.m65() >= 0) {
            return ((oc) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤۧ, reason: not valid java name and contains not printable characters */
    public static int m1010(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۡۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1011(Object obj, boolean z) {
        if (C0009.m122() > 0) {
            return ((ob0) obj).g(z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠۟, reason: not valid java name and contains not printable characters */
    public static String m1004(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
