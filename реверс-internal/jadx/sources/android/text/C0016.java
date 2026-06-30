package android.text;

import android.view.C0025;
import androidx.core.app.C0040;
import androidx.core.graphics.drawable.C0048;
import androidx.startup.C0070;
import androidx.window.reflection.C0079;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.focus.C0119;
import com.google.android.material.snackbar.C0136;
import defpackage.as1;
import defpackage.bg1;
import defpackage.bm;
import defpackage.dn1;
import defpackage.ea2;
import defpackage.lk1;
import defpackage.nv1;
import defpackage.ob0;
import defpackage.wa0;
import defpackage.xz0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: android.text.ۣۧ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0016 {

    /* JADX INFO: renamed from: ۥ۠ۨ۟, reason: contains not printable characters */
    public static int f16 = -293;

    /* JADX INFO: renamed from: ۟۠۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m210(Object obj) {
        if (C0079.m1016() < 0) {
            return ((dn1) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m211(Object obj) {
        if (C0136.m1712() <= 0) {
            return ((ea2) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static long m212(Object obj) {
        if (C0048.m638() >= 0) {
            return ((bm) obj).C;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m213(Object obj) {
        if (C0112.m1424() <= 0) {
            return ((as1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m214(String str) {
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

    /* JADX INFO: renamed from: ۟ۧ۠۟۠, reason: not valid java name and contains not printable characters */
    public static void m215(Object obj, boolean z, Object obj2, Object obj3, int i) {
        if (C0040.m542() < 0) {
            ((lk1) obj).b(z, (wa0) obj2, (ob0) obj3, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۢۥ, reason: not valid java name and contains not printable characters */
    public static int m216(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static int m218() {
        return 235 ^ C0070.f70;
    }

    /* JADX INFO: renamed from: ۣۥۣ۠, reason: not valid java name and contains not printable characters */
    public static nv1 m219(Object obj) {
        if (C0119.m1511() > 0) {
            return ((xz0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۨ, reason: contains not printable characters */
    public static int m220(Object obj) {
        if (C0025.m340() > 0) {
            return ((bg1) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۢ, reason: not valid java name and contains not printable characters */
    public static String m217(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
