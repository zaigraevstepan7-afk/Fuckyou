package android.support.v4.graphics.drawable;

import android.app.C0000;
import android.view.C0025;
import androidx.core.widget.C0051;
import androidx.lifecycle.C0060;
import androidx.profileinstaller.C0064;
import com.google.android.material.behavior.C0093;
import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.search.C0123;
import com.reddit.frontpage.C0148;
import defpackage.bl;
import defpackage.iy0;
import defpackage.lk1;
import defpackage.ob0;
import defpackage.sa0;
import defpackage.sv0;
import defpackage.vq;
import defpackage.xc;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: android.support.v4.graphics.drawable.۟ۦۡۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0008 {

    /* JADX INFO: renamed from: ۣۥۤۢ, reason: not valid java name and contains not printable characters */
    public static int f8 = -353;

    /* JADX INFO: renamed from: ۟ۡۤۤۡ, reason: not valid java name and contains not printable characters */
    public static void m107(Object obj, Object obj2) {
        if (C0060.m781() < 0) {
            xc.C((ob0) obj, (sa0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m108(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Object m110(Object obj) {
        if (C0099.m1272() < 0) {
            return ((Iterator) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۢ, reason: not valid java name and contains not printable characters */
    public static void m111(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0025.m340() > 0) {
            System.arraycopy(obj, i, obj2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠۠, reason: not valid java name and contains not printable characters */
    public static sa0 m112(Object obj) {
        if (C0123.m1562() < 0) {
            return ((vq) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۢ۠, reason: not valid java name and contains not printable characters */
    public static lk1 m113() {
        if (C0148.m1860() >= 0) {
            return lk1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۨ, reason: not valid java name and contains not printable characters */
    public static sv0 m114(Object obj) {
        if (C0051.m670() >= 0) {
            return bl.k((iy0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static int m115(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static int m116() {
        return (-265) ^ C0000.f0;
    }

    /* JADX INFO: renamed from: ۨۤ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m117(Object obj, int i, boolean z) {
        if (C0093.m1203() > 0) {
            return ((ob0) obj).N(i, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۨۢ۟, reason: not valid java name and contains not printable characters */
    public static float m118() {
        if (C0064.m840() >= 0) {
            return lk1.b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static String m109(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
