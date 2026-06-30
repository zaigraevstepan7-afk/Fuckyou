package androidx.lifecycle;

import android.media.MediaPlayer;
import android.view.C0027;
import androidx.core.app.C0041;
import androidx.core.graphics.drawable.C0048;
import androidx.core.widget.C0053;
import androidx.profileinstaller.C0064;
import androidx.recyclerview.widget.C0066;
import androidx.window.reflection.C0080;
import com.google.android.material.appbar.C0086;
import com.google.android.material.behavior.C0089;
import com.google.android.material.sidesheet.C0133;
import defpackage.bc1;
import defpackage.bg1;
import defpackage.gv1;
import defpackage.iv1;
import defpackage.jh1;
import defpackage.jj;
import defpackage.lr0;
import defpackage.ob0;
import defpackage.rz;
import defpackage.sa0;
import defpackage.tc;
import defpackage.tv0;
import defpackage.vl;
import defpackage.wa0;
import java.io.ByteArrayOutputStream;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.ۡۥۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0059 {

    /* JADX INFO: renamed from: ۟ۧ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static int f59 = -863;

    /* JADX INFO: renamed from: ۣ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static int m767(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۡۧۡ, reason: not valid java name and contains not printable characters */
    public static void m768(Object obj, Object obj2) {
        if (C0048.m638() > 0) {
            ((MediaPlayer) obj).setDataSource((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠۟, reason: not valid java name and contains not printable characters */
    public static int m769() {
        return 546 ^ C0089.f95;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static long m770(float f, long j) {
        if (C0064.m840() > 0) {
            return vl.b(f, j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static void m771(boolean z, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        if (C0133.m1681() >= 0) {
            iv1.a(z, (sa0) obj, (tv0) obj2, (wa0) obj3, (gv1) obj4, (ob0) obj5, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static int m772(Object obj) {
        if (C0041.m550() >= 0) {
            return ((jj) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static bc1 m773(Object obj) {
        if (C0053.m695() < 0) {
            return ((lr0) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m774(Object obj) {
        if (C0066.m857() > 0) {
            return ((bg1) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m775(Object obj, Object obj2) {
        if (C0027.m365() <= 0) {
            return ((rz) obj).q(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۤ, reason: not valid java name and contains not printable characters */
    public static Map m776(Object obj) {
        if (C0086.m1107() > 0) {
            return ((jh1) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۡ۠, reason: not valid java name and contains not printable characters */
    public static String m777(String str) {
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

    /* JADX INFO: renamed from: ۥۣۦۥ, reason: contains not printable characters */
    public static int m779(Object obj) {
        if (C0080.m1033() <= 0) {
            return ((tc) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨۨ۟, reason: not valid java name and contains not printable characters */
    public static String m778(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
