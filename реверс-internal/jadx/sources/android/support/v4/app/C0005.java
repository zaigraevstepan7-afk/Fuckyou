package android.support.v4.app;

import android.os.SystemClock;
import android.view.C0021;
import android.view.translation.C0018;
import androidx.compose.ui.input.pointer.C0034;
import androidx.core.widget.C0052;
import androidx.window.area.reflectionguard.C0078;
import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.search.C0123;
import com.google.android.material.search.C0128;
import com.google.android.material.sidesheet.C0129;
import com.reddit.frontpage.C0147;
import defpackage.C0152;
import defpackage.dp;
import defpackage.dr0;
import defpackage.el;
import defpackage.fu;
import defpackage.ga2;
import defpackage.gk1;
import defpackage.jo;
import defpackage.jr0;
import defpackage.l32;
import defpackage.lr0;
import defpackage.v20;
import defpackage.xi0;
import defpackage.zp;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: android.support.v4.app.ۥۣ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0005 {

    /* JADX INFO: renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static int f5 = -926;

    /* JADX INFO: renamed from: ۟۟ۦۤۤ, reason: not valid java name and contains not printable characters */
    public static long m68(Object obj) {
        if (C0021.m285() <= 0) {
            return ((gk1) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static dr0 m69(Object obj) {
        if (C0034.m451() < 0) {
            return ((l32) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۤ, reason: not valid java name and contains not printable characters */
    public static Boolean m70() {
        if (C0078.m998() < 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۨ, reason: not valid java name and contains not printable characters */
    public static jo m71() {
        if (C0129.m1627() <= 0) {
            return xi0.n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static v20 m72() {
        if (C0123.m1562() <= 0) {
            return v20.O;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۡ, reason: not valid java name and contains not printable characters */
    public static int m73(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static zp m74() {
        if (C0147.m1843() > 0) {
            return dp.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۨ۟, reason: not valid java name and contains not printable characters */
    public static int m75() {
        return 697 ^ C0018.f18;
    }

    /* JADX INFO: renamed from: ۤۤۢۡ, reason: not valid java name and contains not printable characters */
    public static long m76() {
        if (C0052.m681() >= 0) {
            return SystemClock.elapsedRealtime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣۧ۠, reason: contains not printable characters */
    public static lr0 m77(Object obj) {
        if (C0128.m1607() < 0) {
            return ((jr0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۢۦ, reason: not valid java name and contains not printable characters */
    public static String m78(String str) {
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

    /* JADX INFO: renamed from: ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static String m79(Object obj) {
        if (C0152.m1979() >= 0) {
            return ((ga2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۤۧ, reason: not valid java name and contains not printable characters */
    public static fu m80(float f, float f2, float f3, float f4, float f6, float f7, float f8, float f9) {
        if (C0099.m1272() <= 0) {
            return el.a(f, f2, f3, f4, f6, f7, f8, f9);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧۧ, reason: not valid java name and contains not printable characters */
    public static String m81(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
