package androidx.core.app;

import android.support.v4.app.C0002;
import android.support.v4.graphics.drawable.C0007;
import android.view.View;
import androidx.graphics.path.C0056;
import androidx.window.reflection.C0079;
import androidx.window.reflection.C0081;
import com.google.android.material.behavior.C0089;
import com.google.android.material.behavior.C0093;
import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.floatingactionbutton.C0117;
import com.google.android.material.sidesheet.C0132;
import com.google.android.material.transformation.C0139;
import defpackage.aq0;
import defpackage.dp;
import defpackage.i91;
import defpackage.lr0;
import defpackage.q42;
import defpackage.r9;
import defpackage.rq;
import defpackage.rz;
import defpackage.sv0;
import defpackage.t61;
import defpackage.xg0;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.core.app.ۣ۟ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0041 {

    /* JADX INFO: renamed from: ۡۦ۠۟, reason: not valid java name and contains not printable characters */
    public static int f41 = -913;

    /* JADX INFO: renamed from: ۟۟ۦۥۢ, reason: not valid java name and contains not printable characters */
    public static int m543(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static sv0 m544(Object obj) {
        if (C0139.m1754() < 0) {
            return ((sv0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static r9 m545() {
        if (C0002.m39() > 0) {
            return dp.g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m546(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m547(Object obj) {
        if (C0117.m1475() > 0) {
            return ((rz) obj).v;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m548(int i, int i2) {
        if (C0117.m1475() > 0) {
            return Math.max(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static aq0 m549(Object obj) {
        if (C0093.m1203() > 0) {
            return ((lr0) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static int m550() {
        return (-241) ^ C0079.f79;
    }

    /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static int m551(int i, int i2) {
        if (C0089.m1150() > 0) {
            return Math.min(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m552(Object obj) {
        if (C0042.m566() <= 0) {
            return ((View) obj).getTag();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۨ, reason: not valid java name and contains not printable characters */
    public static xg0 m553(Object obj) {
        if (C0007.m100() > 0) {
            return ((rq) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۧۢ, reason: contains not printable characters */
    public static String m555(int i) {
        if (C0002.m39() >= 0) {
            return String.valueOf(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۡۡ, reason: contains not printable characters */
    public static float m556(float f, float f2, float f3) {
        if (C0056.m738() < 0) {
            return q42.b(f, f2, f3);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۨۥۢ, reason: contains not printable characters */
    public static t61 m557() {
        if (C0081.m1040() > 0) {
            return xg0.h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static i91 m558() {
        if (C0132.m1666() <= 0) {
            return xg0.n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m559(Object obj, int i) {
        if (C0099.m1272() <= 0) {
            ((BufferedInputStream) obj).mark(i);
        }
    }

    /* JADX INFO: renamed from: ۣۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m554(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
