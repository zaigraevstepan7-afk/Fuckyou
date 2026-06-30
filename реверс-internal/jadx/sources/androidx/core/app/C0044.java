package androidx.core.app;

import android.text.C0012;
import android.view.C0021;
import androidx.appcompat.widget.C0031;
import androidx.window.reflection.C0081;
import com.google.android.material.appbar.C0087;
import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.sidesheet.C0132;
import com.google.android.material.transformation.C0141;
import defpackage.g20;
import defpackage.h31;
import defpackage.pl;
import defpackage.rz;
import defpackage.sa0;
import defpackage.wq;
import defpackage.wr;
import defpackage.xc1;
import java.io.ByteArrayOutputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.core.app.ۤۤۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0044 {

    /* JADX INFO: renamed from: ۡۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int f44 = 741;

    /* JADX INFO: renamed from: ۟۠ۦۤۨ, reason: not valid java name and contains not printable characters */
    public static xc1 m581(Object obj) {
        if (C0087.m1123() <= 0) {
            return ((rz) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۨۥ, reason: not valid java name and contains not printable characters */
    public static Locale m582() {
        if (C0031.m407() > 0) {
            return Locale.getDefault();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static wr m583() {
        if (C0012.m162() > 0) {
            return g20.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static int m584(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۥ, reason: not valid java name and contains not printable characters */
    public static String m585(String str) {
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

    /* JADX INFO: renamed from: ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static int m586() {
        return (-238) ^ C0099.f105;
    }

    /* JADX INFO: renamed from: ۣۡۤۢ, reason: not valid java name and contains not printable characters */
    public static String m588() {
        if (C0021.m285() <= 0) {
            return "";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢۤ, reason: not valid java name and contains not printable characters */
    public static String m589(Object obj, Object obj2) {
        if (C0081.m1040() > 0) {
            return ((DateFormat) obj).format((Date) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۤۢ, reason: not valid java name and contains not printable characters */
    public static sa0 m590(Object obj) {
        if (C0132.m1666() <= 0) {
            return ((wq) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۡ۟, reason: contains not printable characters */
    public static String m591(Object obj) {
        if (C0038.m509() > 0) {
            return ((h31) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۠۟, reason: not valid java name and contains not printable characters */
    public static String m592(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        if (C0141.m1778() < 0) {
            return pl.h0((Iterable) obj, (String) obj2, (String) obj3, (String) obj4, (sa0) obj5, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡ۠, reason: not valid java name and contains not printable characters */
    public static String m587(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
