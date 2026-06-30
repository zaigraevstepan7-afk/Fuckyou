package androidx.graphics.path;

import android.app.C0001;
import android.support.v4.app.C0004;
import android.text.C0011;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.C0028;
import androidx.core.app.C0043;
import androidx.recyclerview.widget.C0065;
import androidx.startup.C0072;
import androidx.versionedparcelable.C0077;
import com.google.android.material.focus.C0118;
import com.reddit.frontpage.C0150;
import defpackage.a52;
import defpackage.da1;
import defpackage.oi1;
import defpackage.pd1;
import defpackage.uo1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URLConnection;

/* JADX INFO: renamed from: androidx.graphics.path.ۥ۟ۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0055 {

    /* JADX INFO: renamed from: ۣ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static int f55 = -507;

    /* JADX INFO: renamed from: ۟۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m713(int i, Object obj) {
        if (C0072.m936() < 0) {
            return pd1.g(i, (KeyEvent) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨۧ۠, reason: not valid java name and contains not printable characters */
    public static float m714() {
        if (C0028.m368() <= 0) {
            return uo1.b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m715(Object obj) {
        if (C0150.m1876() >= 0) {
            return ((File) obj).isFile();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۡۥۣ, reason: not valid java name and contains not printable characters */
    public static void m716(Object obj, int i, Object obj2) {
        if (C0065.m853() < 0) {
            ((View) obj).setTag(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨۧۤ, reason: not valid java name and contains not printable characters */
    public static float m717(Object obj) {
        if (C0011.m150() <= 0) {
            return ((oi1) obj).e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object m718(Object obj) {
        if (C0043.m578() > 0) {
            return ((da1) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m720(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۧ, reason: not valid java name and contains not printable characters */
    public static String m721(String str) {
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

    /* JADX INFO: renamed from: ۡ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static int m722(Object obj) {
        if (C0043.m578() >= 0) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m723() {
        return 460 ^ C0001.f1;
    }

    /* JADX INFO: renamed from: ۣۨۥ۟, reason: not valid java name and contains not printable characters */
    public static int m724() {
        if (C0077.m996() > 0) {
            return a52.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۥۣ, reason: contains not printable characters */
    public static long m725(Object obj) {
        if (C0004.m65() > 0) {
            return ((URLConnection) obj).getContentLengthLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۨۡۥ, reason: not valid java name and contains not printable characters */
    public static long m726(Object obj) {
        if (C0118.m1484() >= 0) {
            return ((Long) obj).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m719(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
