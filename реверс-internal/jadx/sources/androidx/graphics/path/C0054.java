package androidx.graphics.path;

import android.media.MediaPlayer;
import android.view.C0023;
import androidx.core.graphics.drawable.C0046;
import androidx.recyclerview.widget.C0066;
import androidx.window.reflection.C0081;
import com.google.android.material.bottomappbar.C0097;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.carousel.C0110;
import com.google.android.material.search.C0128;
import com.google.android.material.transformation.C0142;
import defpackage.av;
import defpackage.ba1;
import defpackage.bk1;
import defpackage.f20;
import defpackage.fj1;
import defpackage.ja1;
import defpackage.jt;
import defpackage.ks;
import defpackage.kt;
import defpackage.ot;
import defpackage.vm;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.graphics.path.۟۟ۥۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0054 {

    /* JADX INFO: renamed from: ۣۤۢۤ, reason: not valid java name and contains not printable characters */
    public static int f54 = -94;

    /* JADX INFO: renamed from: ۟۟ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static f20 m701(Object obj) {
        if (C0103.m1322() <= 0) {
            return ((vm) obj).w();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Object m702(Object obj, Object obj2, Object obj3) {
        if (C0066.m857() > 0) {
            return ((av) obj).l(obj2, (ks) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۢۥ, reason: not valid java name and contains not printable characters */
    public static int m704(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۤۥۢ, reason: not valid java name and contains not printable characters */
    public static String m705(String str) {
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

    /* JADX INFO: renamed from: ۣ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static int m706(Object obj) {
        if (C0023.m313() >= 0) {
            return ((ja1) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static jt m707(Object obj, Object obj2) {
        if (C0046.m616() <= 0) {
            return ((ot) obj).l((kt) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static double m708(double d) {
        if (C0097.m1242() <= 0) {
            return Math.sqrt(d);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۣۥ۠۠, reason: not valid java name and contains not printable characters */
    public static fj1 m709(Object obj) {
        if (C0081.m1040() >= 0) {
            return ((bk1) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m710(Object obj) {
        if (C0128.m1607() <= 0) {
            return ((ba1) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۢۡ, reason: contains not printable characters */
    public static int m711() {
        return 65 ^ C0110.f116;
    }

    /* JADX INFO: renamed from: ۨۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m712(Object obj) {
        if (C0142.m1788() > 0) {
            ((MediaPlayer) obj).stop();
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m703(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
