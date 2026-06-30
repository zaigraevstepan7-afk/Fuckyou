package androidx.core.app;

import android.os.Build;
import android.support.v4.graphics.drawable.C0006;
import androidx.appcompat.widget.C0033;
import androidx.core.graphics.drawable.C0047;
import androidx.core.graphics.drawable.C0048;
import androidx.startup.C0070;
import androidx.window.reflection.C0080;
import com.google.android.material.bottomsheet.C0104;
import com.google.android.material.carousel.C0108;
import com.google.android.material.transformation.C0140;
import defpackage.az1;
import defpackage.bl;
import defpackage.bm;
import defpackage.iq;
import defpackage.j41;
import defpackage.jw0;
import defpackage.ob0;
import defpackage.p60;
import defpackage.pc1;
import defpackage.vl1;
import defpackage.xi0;
import defpackage.zl1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.core.app.ۣ۟ۦۣۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0037 {

    /* JADX INFO: renamed from: ۢۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int f37 = 658;

    /* JADX INFO: renamed from: ۟۠ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static p60 m489(Object obj, Object obj2) {
        if (C0108.m1373() <= 0) {
            return bl.W((jw0) obj, (ob0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m490(Object obj) {
        if (C0047.m622() <= 0) {
            return ((iq) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static zl1 m491() {
        if (C0033.m436() >= 0) {
            return vl1.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m492(Object obj) {
        if (C0080.m1033() < 0) {
            return ((j41) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۦ, reason: not valid java name and contains not printable characters */
    public static long m493(Object obj) {
        if (C0104.m1332() > 0) {
            return ((pc1) obj).b();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۥ, reason: not valid java name and contains not printable characters */
    public static long m494(Object obj) {
        if (C0140.m1768() > 0) {
            return ((az1) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static long m495(Object obj) {
        if (C0070.m915() < 0) {
            return ((bm) obj).u;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۢۢۤ, reason: not valid java name and contains not printable characters */
    public static int m496() {
        return (-1011) ^ f37;
    }

    /* JADX INFO: renamed from: ۥۣۦۥ, reason: contains not printable characters */
    public static int m497() {
        if (C0048.m638() >= 0) {
            return Build.VERSION.SDK_INT;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨۥۨ, reason: contains not printable characters */
    public static String m498(String str) {
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

    /* JADX INFO: renamed from: ۣۧۤ, reason: not valid java name and contains not printable characters */
    public static float m499() {
        if (C0006.m96() >= 0) {
            return xi0.F;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۧۤۥ, reason: not valid java name and contains not printable characters */
    public static int m500(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m488(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
