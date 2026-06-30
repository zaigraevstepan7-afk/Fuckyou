package android.support.v4.app;

import android.support.v4.graphics.drawable.C0008;
import androidx.appcompat.widget.C0031;
import androidx.compose.ui.input.pointer.C0035;
import androidx.core.app.C0044;
import androidx.lifecycle.C0058;
import androidx.window.reflection.C0079;
import com.google.android.material.behavior.C0089;
import com.google.android.material.bottomappbar.C0101;
import com.google.android.material.focus.C0121;
import com.google.android.material.sidesheet.C0130;
import defpackage.cg1;
import defpackage.cr0;
import defpackage.er0;
import defpackage.gk1;
import defpackage.kd1;
import defpackage.ks;
import defpackage.mr1;
import defpackage.vh0;
import defpackage.vl;
import defpackage.ye0;
import defpackage.zc1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: android.support.v4.app.ۣۢۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0004 {

    /* JADX INFO: renamed from: ۦۤۧ۠, reason: contains not printable characters */
    public static int f4 = 240;

    /* JADX INFO: renamed from: ۟۟ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static ye0 m54() {
        if (C0035.m461() > 0) {
            return kd1.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m55(Object obj) {
        if (C0101.m1291() < 0) {
            return ((er0) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static ks m56(Object obj, Object obj2, Object obj3) {
        if (C0079.m1016() < 0) {
            return ((cg1) obj).o((ks) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۡۤ, reason: not valid java name and contains not printable characters */
    public static long m57() {
        if (C0008.m116() > 0) {
            return vl.b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static Process m58(Object obj) {
        if (C0058.m756() <= 0) {
            return ((ProcessBuilder) obj).start();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static long m59(Object obj) {
        if (C0002.m39() >= 0) {
            return ((gk1) obj).j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۢۦ, reason: not valid java name and contains not printable characters */
    public static long m61(Object obj) {
        if (C0130.m1641() > 0) {
            return ((vh0) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧۨ۠, reason: not valid java name and contains not printable characters */
    public static zc1 m62(Object obj) {
        if (C0121.m1535() >= 0) {
            return ((cr0) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۢۦ, reason: not valid java name and contains not printable characters */
    public static int m63(double d) {
        if (C0089.m1150() >= 0) {
            return Double.hashCode(d);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨۥۧ, reason: contains not printable characters */
    public static int m64(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static int m65() {
        return 507 ^ C0044.f44;
    }

    /* JADX INFO: renamed from: ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static String m66(Object obj) {
        if (C0031.m407() > 0) {
            return ((mr1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۢۧ, reason: not valid java name and contains not printable characters */
    public static String m67(String str) {
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

    /* JADX INFO: renamed from: ۣۢۡ۟, reason: not valid java name and contains not printable characters */
    public static String m60(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
