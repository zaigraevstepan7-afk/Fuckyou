package android.view;

import android.text.C0013;
import android.view.translation.C0019;
import androidx.profileinstaller.C0062;
import androidx.window.reflection.C0082;
import com.google.android.material.carousel.C0110;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.floatingactionbutton.C0114;
import com.google.android.material.sidesheet.C0132;
import com.google.android.material.snackbar.C0137;
import com.reddit.frontpage.C0148;
import defpackage.az1;
import defpackage.da2;
import defpackage.e20;
import defpackage.f20;
import defpackage.fa1;
import defpackage.gk;
import defpackage.hb;
import defpackage.rd;
import defpackage.ry1;
import defpackage.sc;
import defpackage.vm;
import defpackage.xc1;
import defpackage.xg0;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* JADX INFO: renamed from: android.view.ۢۨ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0026 {

    /* JADX INFO: renamed from: ۟۠ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static int f26 = 237;

    /* JADX INFO: renamed from: ۟۟ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static List m345(Object obj) {
        if (C0019.m251() >= 0) {
            return ((rd) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int m346(Object obj) {
        if (C0114.m1448() > 0) {
            return ((xc1) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static e20 m347(Object obj) {
        if (C0062.m818() < 0) {
            return ((f20) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۥۤ, reason: not valid java name and contains not printable characters */
    public static az1 m348(Object obj, long j) {
        if (C0013.m174() <= 0) {
            return ry1.e((hb) obj, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤۨ, reason: not valid java name and contains not printable characters */
    public static xg0 m349(Object obj) {
        if (C0113.m1443() > 0) {
            return ((fa1) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۥۧ, reason: not valid java name and contains not printable characters */
    public static long m350(Object obj) {
        if (C0137.m1727() < 0) {
            return ((da2) obj).f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۤۧ۟, reason: not valid java name and contains not printable characters */
    public static f20 m351(Object obj) {
        if (C0132.m1666() <= 0) {
            return ((vm) obj).t();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۥۧ, reason: not valid java name and contains not printable characters */
    public static Object m353(Object obj) {
        if (C0110.m1397() >= 0) {
            return ((gk) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣۧ, reason: contains not printable characters */
    public static int m354(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۦۢۨ, reason: contains not printable characters */
    public static int m355() {
        return (-832) ^ C0082.f82;
    }

    /* JADX INFO: renamed from: ۦۦ۠ۡ, reason: contains not printable characters */
    public static int m356(Object obj) {
        if (C0148.m1860() > 0) {
            return ((sc) obj).l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۤۡ۟, reason: not valid java name and contains not printable characters */
    public static String m357(String str) {
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

    /* JADX INFO: renamed from: ۤ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m352(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
