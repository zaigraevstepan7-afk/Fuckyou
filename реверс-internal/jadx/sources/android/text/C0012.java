package android.text;

import androidx.core.app.C0040;
import androidx.graphics.path.C0057;
import androidx.recyclerview.widget.C0065;
import androidx.startup.C0069;
import androidx.window.reflection.C0082;
import com.google.android.material.bottomappbar.C0096;
import com.google.android.material.floatingactionbutton.C0116;
import com.google.android.material.snackbar.C0138;
import defpackage.C0152;
import defpackage.ba1;
import defpackage.cm;
import defpackage.fy0;
import defpackage.ha1;
import defpackage.l32;
import defpackage.p20;
import defpackage.vq;
import defpackage.wi0;
import defpackage.xg0;
import defpackage.zf1;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: android.text.۟ۤۢ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0012 {

    /* JADX INFO: renamed from: ۟ۦ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static int f12 = -144;

    /* JADX INFO: renamed from: ۣ۟۠۟۠, reason: not valid java name and contains not printable characters */
    public static String m152(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static xg0 m153() {
        if (C0040.m542() <= 0) {
            return xg0.i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m154(Object obj) {
        if (C0082.m1058() <= 0) {
            return ((l32) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۤ, reason: not valid java name and contains not printable characters */
    public static cm m155() {
        if (C0116.m1470() <= 0) {
            return wi0.r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static Object m156(Object obj) {
        if (C0065.m853() < 0) {
            return ((ba1) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static xg0 m157(Object obj) {
        if (C0069.m906() <= 0) {
            return ((ha1) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static fy0 m159(Object obj) {
        if (C0138.m1738() > 0) {
            return ((vq) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۠۠, reason: contains not printable characters */
    public static int m160() {
        if (C0016.m218() <= 0) {
            return p20.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۦۦۦ, reason: contains not printable characters */
    public static String m161(Object obj) {
        if (C0096.m1232() > 0) {
            return ((zf1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۡۢ, reason: contains not printable characters */
    public static int m162() {
        return 861 ^ C0152.f229;
    }

    /* JADX INFO: renamed from: ۧۤۧۦ, reason: not valid java name and contains not printable characters */
    public static int m163(Object obj, Object obj2) {
        if (C0057.m749() > 0) {
            return ((InputStream) obj).read((byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m164(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m158(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
