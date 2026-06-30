package android.support.v4.app;

import android.text.C0012;
import android.view.translation.C0017;
import androidx.compose.ui.input.pointer.C0036;
import androidx.core.graphics.drawable.C0049;
import androidx.core.widget.C0052;
import androidx.graphics.path.C0056;
import androidx.profileinstaller.C0064;
import androidx.versionedparcelable.C0075;
import com.google.android.material.behavior.C0094;
import com.google.android.material.bottomsheet.C0102;
import com.google.android.material.snackbar.C0136;
import com.google.android.material.snackbar.C0137;
import com.google.android.material.transformation.C0144;
import com.reddit.frontpage.C0147;
import defpackage.al;
import defpackage.ax0;
import defpackage.bm;
import defpackage.br0;
import defpackage.c80;
import defpackage.dz1;
import defpackage.ga1;
import defpackage.kp;
import defpackage.ks;
import defpackage.l91;
import defpackage.lr0;
import defpackage.mt;
import defpackage.nd;
import defpackage.qs1;
import defpackage.r70;
import defpackage.z80;
import defpackage.zd;
import defpackage.zx0;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: android.support.v4.app.۟۠۟ۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0002 {

    /* JADX INFO: renamed from: ۤۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int f2 = -588;

    /* JADX INFO: renamed from: ۟۟ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m29(int i) {
        if (C0012.m162() > 0) {
            return al.V(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m30(Object obj, Object obj2) {
        if (C0147.m1843() >= 0) {
            return ((AtomicReference) obj).getAndSet(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static float m31(Object obj) {
        if (C0036.m473() > 0) {
            return ((dz1) obj).a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡۡۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m32(Object obj, Object obj2, Object obj3) {
        if (C0064.m840() >= 0) {
            return ((AtomicReference) obj).compareAndSet(obj2, obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static Object m33(Object obj) {
        if (C0144.m1814() <= 0) {
            return ((zd) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static c80 m35(Object obj) {
        if (C0052.m681() > 0) {
            return ((z80) obj).w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static l91 m36() {
        if (C0017.m229() < 0) {
            return kp.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۧ۟, reason: not valid java name and contains not printable characters */
    public static String m37(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static r70 m38(Object obj) {
        if (C0049.m645() > 0) {
            return ((br0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static int m39() {
        return 898 ^ C0137.f143;
    }

    /* JADX INFO: renamed from: ۟ۧۧۤۦ, reason: not valid java name and contains not printable characters */
    public static int m40(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡۡۥ, reason: not valid java name and contains not printable characters */
    public static long m41(Object obj) {
        if (C0102.m1309() > 0) {
            return ((bm) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۧۤۦ, reason: not valid java name and contains not printable characters */
    public static ks m42(Object obj, Object obj2, Object obj3) {
        if (C0136.m1712() < 0) {
            return ((ga1) obj).o((ks) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۡۨ, reason: not valid java name and contains not printable characters */
    public static qs1 m43(Object obj) {
        if (C0075.m968() >= 0) {
            return ((lr0) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۧۡ, reason: contains not printable characters */
    public static zx0 m44(Object obj) {
        if (C0094.m1215() > 0) {
            return ((ax0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۨ۟, reason: contains not printable characters */
    public static String m45(Object obj, Object obj2, int i) {
        if (C0056.m738() < 0) {
            return nd.X((Object[]) obj, (mt) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۤۢ, reason: not valid java name and contains not printable characters */
    public static String m34(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
