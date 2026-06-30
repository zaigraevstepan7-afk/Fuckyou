package android.view;

import android.text.C0010;
import android.text.C0012;
import androidx.core.app.C0039;
import androidx.graphics.path.C0055;
import com.google.android.material.sidesheet.C0130;
import com.google.android.material.sidesheet.C0134;
import com.google.android.material.snackbar.C0137;
import defpackage.C0153;
import defpackage.bm;
import defpackage.je0;
import defpackage.jo;
import defpackage.jt;
import defpackage.kt;
import defpackage.ls;
import defpackage.rd;
import defpackage.sf;
import defpackage.v20;
import defpackage.xg0;
import defpackage.xi0;
import defpackage.z91;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: android.view.ۡۥۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0024 {

    /* JADX INFO: renamed from: ۣ۟۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static int f24 = 742;

    /* JADX INFO: renamed from: ۟۠۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m321() {
        return 450 ^ C0130.f136;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static long m322(Object obj) {
        if (C0055.m723() >= 0) {
            return ((bm) obj).v;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static int m323(double d, double d2) {
        if (C0010.m137() < 0) {
            return Double.compare(d, d2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static kt m324(Object obj) {
        if (C0153.m1994() >= 0) {
            return ((jt) obj).getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣ۟, reason: not valid java name and contains not printable characters */
    public static sf m325() {
        if (C0137.m1727() <= 0) {
            return v20.q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m326(Object obj, Object obj2, Object obj3) {
        if (C0039.m516() <= 0) {
            return xg0.k((xg0) obj, (rd) obj2, (ls) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m327(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۢ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static jo m328() {
        if (m321() >= 0) {
            return xi0.m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۨۥ, reason: not valid java name and contains not printable characters */
    public static int m329(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۦۥۧ, reason: contains not printable characters */
    public static Object m331(Object obj, Object obj2) {
        if (C0012.m162() > 0) {
            return ((z91) obj).q(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۧ۟, reason: not valid java name and contains not printable characters */
    public static String m332(Object obj) {
        if (C0134.m1687() < 0) {
            return ((je0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۣ۠, reason: not valid java name and contains not printable characters */
    public static String m330(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
