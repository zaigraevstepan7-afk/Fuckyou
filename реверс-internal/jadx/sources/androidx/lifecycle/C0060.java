package androidx.lifecycle;

import android.graphics.RectF;
import android.support.v4.app.C0004;
import android.support.v4.app.C0005;
import android.text.C0010;
import android.text.C0011;
import android.view.C0026;
import androidx.core.graphics.drawable.C0049;
import androidx.recyclerview.widget.C0067;
import androidx.window.area.reflectionguard.C0078;
import com.google.android.material.appbar.C0085;
import com.google.android.material.behavior.C0091;
import com.google.android.material.sidesheet.C0130;
import com.google.android.material.transformation.C0143;
import com.google.android.material.transformation.C0146;
import com.reddit.frontpage.C0149;
import defpackage.af1;
import defpackage.ba1;
import defpackage.bc1;
import defpackage.bg1;
import defpackage.el;
import defpackage.g12;
import defpackage.g20;
import defpackage.ga1;
import defpackage.h31;
import defpackage.ks;
import defpackage.ld0;
import defpackage.lr0;
import defpackage.nt0;
import defpackage.om;
import defpackage.pc1;
import defpackage.sa0;
import defpackage.u42;
import defpackage.vq;
import defpackage.xl;
import defpackage.ye0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.lifecycle.ۨۢۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0060 {

    /* JADX INFO: renamed from: ۧۡۦ۠, reason: not valid java name and contains not printable characters */
    public static int f60 = -710;

    /* JADX INFO: renamed from: ۟۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m780(long j) {
        if (C0011.m150() < 0) {
            return Long.hashCode(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۦ, reason: not valid java name and contains not printable characters */
    public static int m781() {
        return (-689) ^ C0146.f152;
    }

    /* JADX INFO: renamed from: ۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static nt0 m782(Object obj) {
        if (C0049.m645() >= 0) {
            return ((vq) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۡۧ, reason: not valid java name and contains not printable characters */
    public static long m784() {
        if (C0143.m1796() >= 0) {
            return xl.k;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static ks m785(Object obj, Object obj2, Object obj3) {
        if (C0149.m1865() <= 0) {
            return ((ba1) obj).o((ks) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static Process m786(Object obj, Object obj2) {
        if (C0091.m1182() >= 0) {
            return ((Runtime) obj).exec((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m787(int i) {
        if (C0026.m355() >= 0) {
            return Character.isWhitespace(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۧۨ۠, reason: not valid java name and contains not printable characters */
    public static String m788(String str) {
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

    /* JADX INFO: renamed from: ۡۨۡۨ, reason: not valid java name and contains not printable characters */
    public static pc1 m789(Object obj) {
        if (C0085.m1094() >= 0) {
            return el.S((RectF) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۣۥ, reason: not valid java name and contains not printable characters */
    public static g12 m790(Object obj, Object obj2, Object obj3, boolean z, Object obj4, double d) {
        if (C0130.m1641() > 0) {
            return ((om) obj).h((u42) obj2, (ld0) obj3, z, (g20) obj4, d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m791(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static sa0 m792(Object obj) {
        if (C0005.m75() >= 0) {
            return ((h31) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۢۡ, reason: not valid java name and contains not printable characters */
    public static int m793(Object obj) {
        if (C0067.m876() >= 0) {
            return ((bg1) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۦ۠ۢ, reason: contains not printable characters */
    public static ye0 m794() {
        if (C0078.m998() < 0) {
            return af1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ۟ۧ, reason: contains not printable characters */
    public static bc1 m795(Object obj) {
        if (C0004.m65() >= 0) {
            return ((lr0) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۨۢ, reason: contains not printable characters */
    public static float m796(Object obj) {
        if (C0010.m137() < 0) {
            return ((ga1) obj).j;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m783(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
