package com.google.android.material.bottomsheet;

import android.app.Activity;
import android.app.C0001;
import android.util.Base64;
import android.view.Window;
import androidx.appcompat.app.C0029;
import androidx.profileinstaller.C0064;
import androidx.recyclerview.widget.C0067;
import com.google.android.material.appbar.C0085;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.focus.C0122;
import com.google.android.material.sidesheet.C0129;
import com.google.android.material.snackbar.C0137;
import defpackage.C0153;
import defpackage.aq1;
import defpackage.c01;
import defpackage.c2;
import defpackage.g12;
import defpackage.g20;
import defpackage.jo;
import defpackage.ld0;
import defpackage.lk;
import defpackage.ob0;
import defpackage.om;
import defpackage.tv0;
import defpackage.u42;
import defpackage.z80;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.ۣ۠ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0105 {

    /* JADX INFO: renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int f111 = 165;

    /* JADX INFO: renamed from: ۣ۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m1335(Object obj, boolean z, Object obj2, int i) {
        if (C0029.m384() >= 0) {
            c2.a((tv0) obj, z, (ob0) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m1336(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m1337(String str) {
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

    /* JADX INFO: renamed from: ۣۣۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static long m1339(long j) {
        if (C0001.m16() <= 0) {
            return lk.g(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static c01 m1340(Object obj) {
        if (C0067.m876() >= 0) {
            return ((z80) obj).y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠۠, reason: not valid java name and contains not printable characters */
    public static Object m1341(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0137.m1727() <= 0) {
            return ((jo) obj).f(obj2, obj3, obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۥ, reason: not valid java name and contains not printable characters */
    public static Window m1342(Object obj) {
        if (C0085.m1094() > 0) {
            return ((Activity) obj).getWindow();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۢ, reason: not valid java name and contains not printable characters */
    public static int m1343() {
        return (-333) ^ C0098.f104;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m1344(Object obj, int i) {
        if (C0122.m1542() < 0) {
            return Base64.decode((String) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۢ, reason: not valid java name and contains not printable characters */
    public static g12 m1345(Object obj, Object obj2, Object obj3, boolean z, Object obj4, double d) {
        if (C0153.m1994() > 0) {
            return ((om) obj).g((u42) obj2, (ld0) obj3, z, (g20) obj4, d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1346(Object obj, Object obj2) {
        if (C0129.m1627() <= 0) {
            return ((ob0) obj).f(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m1347() {
        if (C0064.m840() >= 0) {
            return aq1.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۤۧ, reason: not valid java name and contains not printable characters */
    public static String m1338(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
