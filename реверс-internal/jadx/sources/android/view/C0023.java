package android.view;

import android.text.C0016;
import android.view.ViewGroup;
import androidx.compose.ui.input.pointer.C0036;
import androidx.startup.C0070;
import androidx.versionedparcelable.C0077;
import com.google.android.material.appbar.C0085;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.bottomsheet.C0104;
import com.google.android.material.sidesheet.C0129;
import com.google.android.material.snackbar.C0137;
import com.reddit.frontpage.C0149;
import defpackage.C0154;
import defpackage.C0155;
import defpackage.bq;
import defpackage.co;
import defpackage.dr0;
import defpackage.el;
import defpackage.fy0;
import defpackage.g6;
import defpackage.j60;
import defpackage.ko1;
import defpackage.lr0;
import defpackage.ob0;
import defpackage.pc;
import defpackage.qc;
import defpackage.rq;
import defpackage.rr0;
import defpackage.sa0;
import defpackage.tv0;
import defpackage.xl;
import defpackage.xq;
import java.io.ByteArrayOutputStream;
import java.security.Key;

/* JADX INFO: renamed from: android.view.ۣ۠ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0023 {

    /* JADX INFO: renamed from: ۣ۟۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static int f23 = 62;

    /* JADX INFO: renamed from: ۟۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static bq m304() {
        if (C0085.m1094() >= 0) {
            return rr0.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static fy0 m305(Object obj) {
        if (C0016.m218() < 0) {
            return ((xq) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۡ۟, reason: not valid java name and contains not printable characters */
    public static int m306(Object obj) {
        if (C0103.m1322() <= 0) {
            return ((rq) obj).l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static lr0 m307(Object obj) {
        if (C0129.m1627() <= 0) {
            return ((qc) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static dr0 m308() {
        if (C0155.m2019() > 0) {
            return dr0.q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m309(Object obj, Object obj2, Object obj3) {
        if (C0137.m1727() < 0) {
            return ((pc) obj).h(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m310(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static int m311(Object obj) {
        if (C0036.m473() > 0) {
            return ((g6) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m313() {
        return (-689) ^ C0077.f77;
    }

    /* JADX INFO: renamed from: ۡۧۧۨ, reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m314() {
        if (C0104.m1332() > 0) {
            return co.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static long m315() {
        if (C0149.m1865() <= 0) {
            return xl.g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۦۢ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m316(Object obj) {
        if (C0098.m1266() <= 0) {
            return ((Key) obj).getEncoded();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣۨ, reason: contains not printable characters */
    public static ClassLoader m317(Object obj) {
        if (C0024.m321() >= 0) {
            return ((Class) obj).getClassLoader();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m318(Object obj, Object obj2, boolean z, Object obj3, int i, Object obj4, boolean z2, Object obj5, int i2) {
        if (C0070.m915() <= 0) {
            el.e((String) obj, (String) obj2, z, (sa0) obj3, i, (tv0) obj4, z2, (ob0) obj5, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۢ۠, reason: not valid java name and contains not printable characters */
    public static int m319(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۧۦۦ, reason: not valid java name and contains not printable characters */
    public static j60 m320() {
        if (C0154.m2006() >= 0) {
            return ko1.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m312(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
