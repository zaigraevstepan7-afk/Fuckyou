package androidx.window.reflection;

import android.support.v4.app.C0002;
import android.text.C0011;
import android.view.translation.C0017;
import androidx.core.graphics.drawable.C0049;
import androidx.graphics.path.C0054;
import com.google.android.material.behavior.C0091;
import com.google.android.material.bottomappbar.C0096;
import com.google.android.material.carousel.C0110;
import com.google.android.material.focus.C0122;
import com.google.android.material.search.C0128;
import com.google.android.material.snackbar.C0137;
import com.google.android.material.transformation.C0141;
import defpackage.ha0;
import defpackage.ij;
import defpackage.j60;
import defpackage.kd1;
import defpackage.ko1;
import defpackage.ob0;
import defpackage.v2;
import defpackage.wa0;
import defpackage.wi0;
import defpackage.yh;
import defpackage.zd;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.window.reflection.۟ۢۦۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0079 {

    /* JADX INFO: renamed from: ۟۟ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static int f79 = -837;

    /* JADX INFO: renamed from: ۣ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m1012(Object obj, Object obj2) {
        if (C0141.m1778() < 0) {
            ((ob0) obj).f0(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static int m1013(Object obj) {
        if (C0054.m711() >= 0) {
            return ((Number) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m1014(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۥۦۤ, reason: not valid java name and contains not printable characters */
    public static String m1015(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static int m1016() {
        return (-742) ^ C0096.f102;
    }

    /* JADX INFO: renamed from: ۡۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m1017(Object obj, Object obj2) {
        if (C0110.m1397() > 0) {
            return String.format((String) obj, (Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۧۢ, reason: not valid java name and contains not printable characters */
    public static Object m1018(Object obj, Object obj2) {
        if (C0122.m1542() < 0) {
            return ((zd) obj).q(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int m1019(Object obj) {
        if (C0002.m39() >= 0) {
            return ((ij) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢۥۣ, reason: contains not printable characters */
    public static void m1021(Object obj, Object obj2, Object obj3) {
        if (C0091.m1182() > 0) {
            wi0.i((wa0) obj, (ob0) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۦۥۤ۟, reason: contains not printable characters */
    public static Object m1022(Object obj, Object obj2, Object obj3) {
        if (C0128.m1607() < 0) {
            return kd1.w((Object[]) obj, (ha0) obj2, (ob0) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨ۠, reason: contains not printable characters */
    public static float m1023() {
        if (C0137.m1727() < 0) {
            return yh.a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static j60 m1024() {
        if (C0017.m229() <= 0) {
            return ko1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static float m1025() {
        if (C0011.m150() <= 0) {
            return wi0.m;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۢۤ۠, reason: not valid java name and contains not printable characters */
    public static String m1026(Object obj) {
        if (C0049.m645() >= 0) {
            return ((v2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m1020(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
