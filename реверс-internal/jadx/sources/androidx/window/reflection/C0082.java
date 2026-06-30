package androidx.window.reflection;

import android.text.C0011;
import android.view.C0024;
import android.view.translation.C0020;
import androidx.core.app.C0041;
import com.google.android.material.appbar.C0085;
import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.bottomsheet.C0106;
import com.google.android.material.floatingactionbutton.C0117;
import com.google.android.material.transformation.C0145;
import defpackage.ak;
import defpackage.cd1;
import defpackage.fl;
import defpackage.jo;
import defpackage.jx0;
import defpackage.l81;
import defpackage.ob0;
import defpackage.sa0;
import defpackage.sd;
import defpackage.tv0;
import defpackage.u4;
import defpackage.xi0;
import defpackage.yh0;
import defpackage.z80;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: androidx.window.reflection.ۤۥ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0082 {

    /* JADX INFO: renamed from: ۣ۟ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static int f82 = -552;

    /* JADX INFO: renamed from: ۟ۡۥۣۦ, reason: not valid java name and contains not printable characters */
    public static sd m1049() {
        if (C0085.m1094() >= 0) {
            return sd.g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m1050(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۡ۠۟, reason: not valid java name and contains not printable characters */
    public static jo m1051() {
        if (C0145.m1828() < 0) {
            return xi0.l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۣ, reason: not valid java name and contains not printable characters */
    public static Pattern m1052(Object obj) {
        if (C0117.m1475() >= 0) {
            return ((cd1) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static Charset m1053() {
        if (C0106.m1348() >= 0) {
            return ak.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m1054(Object obj) {
        if (C0041.m550() > 0) {
            return ((String) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۣ, reason: not valid java name and contains not printable characters */
    public static void m1055(Object obj, Object obj2, Object obj3) {
        if (C0099.m1272() < 0) {
            ((z80) obj).O0((jx0) obj2, (yh0) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m1056(Object obj) {
        if (C0020.m271() > 0) {
            return ((Matcher) obj).matches();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static List m1057(Object obj) {
        if (C0011.m150() <= 0) {
            return ((l81) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۥۣ, reason: not valid java name and contains not printable characters */
    public static int m1058() {
        return (-897) ^ C0083.f83;
    }

    /* JADX INFO: renamed from: ۣۣۤ, reason: not valid java name and contains not printable characters */
    public static int m1059(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static void m1060(float f, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        if (C0024.m321() >= 0) {
            u4.b(f, (sa0) obj, (tv0) obj2, (fl) obj3, (ob0) obj4, i);
        }
    }

    /* JADX INFO: renamed from: ۧۥۣ۠, reason: not valid java name and contains not printable characters */
    public static String m1061(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
