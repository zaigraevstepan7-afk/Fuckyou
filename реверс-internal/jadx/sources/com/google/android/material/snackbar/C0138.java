package com.google.android.material.snackbar;

import android.support.v4.app.C0005;
import android.view.C0026;
import android.view.View;
import androidx.appcompat.widget.C0031;
import androidx.profileinstaller.C0062;
import androidx.recyclerview.widget.C0068;
import androidx.versionedparcelable.C0075;
import androidx.versionedparcelable.C0077;
import androidx.window.reflection.C0081;
import com.google.android.material.bottomappbar.C0095;
import com.google.android.material.carousel.C0111;
import com.google.android.material.floatingactionbutton.C0116;
import com.google.android.material.sidesheet.C0129;
import com.google.android.material.sidesheet.C0134;
import com.google.android.material.transformation.C0141;
import defpackage.aq1;
import defpackage.bq;
import defpackage.ia1;
import defpackage.jt1;
import defpackage.ks;
import defpackage.ls;
import defpackage.lt0;
import defpackage.ob0;
import defpackage.qg0;
import defpackage.sa0;
import defpackage.vj0;
import defpackage.vu1;
import defpackage.wd;
import defpackage.xe0;
import defpackage.xg0;
import defpackage.ye0;
import defpackage.zv0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.material.snackbar.ۦۡۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0138 {

    /* JADX INFO: renamed from: ۟۟۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static int f144 = -466;

    /* JADX INFO: renamed from: ۟۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static ks m1731(Object obj, Object obj2, Object obj3) {
        if (C0134.m1687() < 0) {
            return ((wd) obj).o((ks) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1732(Object obj, Object obj2) {
        if (C0136.m1712() < 0) {
            return ((vj0) obj).V(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m1733(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0077.m996() > 0) {
            return xg0.l((xg0) obj, (String) obj2, (List) obj3, (ls) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static bq m1734() {
        if (C0111.m1412() <= 0) {
            return vu1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static void m1735(Object obj, int i) {
        if (C0116.m1470() < 0) {
            ((View) obj).setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1736(Object obj) {
        if (C0062.m818() <= 0) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۡۧۤ, reason: not valid java name and contains not printable characters */
    public static sa0 m1737(Object obj) {
        if (C0141.m1778() <= 0) {
            return ((lt0) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int m1738() {
        return (-51) ^ C0068.f68;
    }

    /* JADX INFO: renamed from: ۠۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static ye0 m1739(Object obj) {
        if (C0026.m355() > 0) {
            return ((xe0) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۡۡ, reason: not valid java name and contains not printable characters */
    public static String m1740(Object obj, Object obj2, Object obj3) {
        if (C0031.m407() >= 0) {
            return jt1.J((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m1741(Object obj) {
        if (C0129.m1627() < 0) {
            qg0.a((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۡۤۦۨ, reason: not valid java name and contains not printable characters */
    public static String m1742(String str) {
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

    /* JADX INFO: renamed from: ۢۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m1744(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m1745(Object obj) {
        if (C0005.m75() > 0) {
            return ((ob0) obj).C();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ۠ۤ, reason: contains not printable characters */
    public static long m1746() {
        if (C0081.m1040() >= 0) {
            return aq1.e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۨۢۦ, reason: contains not printable characters */
    public static ArrayList m1747(Object obj) {
        if (C0095.m1228() > 0) {
            return ((zv0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۦۦ, reason: contains not printable characters */
    public static xg0 m1748(Object obj) {
        if (C0062.m818() <= 0) {
            return ((ia1) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۧ۟, reason: contains not printable characters */
    public static boolean m1749(Object obj, Object obj2) {
        if (C0075.m968() >= 0) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m1743(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
