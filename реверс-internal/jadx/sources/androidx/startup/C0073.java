package androidx.startup;

import androidx.recyclerview.widget.C0067;
import androidx.window.reflection.C0083;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.sidesheet.C0130;
import com.google.android.material.sidesheet.C0132;
import com.google.android.material.snackbar.C0135;
import com.google.android.material.transformation.C0144;
import defpackage.bm;
import defpackage.l91;
import defpackage.lz;
import defpackage.sq;
import defpackage.v20;
import defpackage.vi1;
import defpackage.y2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: androidx.startup.ۨۤۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0073 {

    /* JADX INFO: renamed from: ۣۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f73 = 947;

    /* JADX INFO: renamed from: ۟ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static String m942(Object obj) {
        if (C0132.m1666() <= 0) {
            return v20.k((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static vi1 m943() {
        if (C0144.m1814() < 0) {
            return vi1.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤ۟, reason: not valid java name and contains not printable characters */
    public static int m944() {
        return 293 ^ C0113.f119;
    }

    /* JADX INFO: renamed from: ۠۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m946(String str) {
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

    /* JADX INFO: renamed from: ۠۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m947(Object obj) {
        if (C0098.m1266() < 0) {
            return l91.v((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m948(Object obj) {
        if (C0135.m1701() > 0) {
            return ((sq) obj).l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static lz m949() {
        if (C0083.m1068() > 0) {
            return lz.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۧ۠, reason: not valid java name and contains not printable characters */
    public static SSLSocketFactory m950(Object obj) {
        if (C0067.m876() > 0) {
            return ((SSLContext) obj).getSocketFactory();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۢ, reason: not valid java name and contains not printable characters */
    public static long m951(Object obj) {
        if (C0113.m1443() >= 0) {
            return ((bm) obj).N;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣۢۤ, reason: contains not printable characters */
    public static int m952(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۧۦۡ, reason: not valid java name and contains not printable characters */
    public static String m953(Object obj) {
        if (C0130.m1641() >= 0) {
            return ((y2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۧ, reason: not valid java name and contains not printable characters */
    public static String m945(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
