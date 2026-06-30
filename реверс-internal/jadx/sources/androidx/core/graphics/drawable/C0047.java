package androidx.core.graphics.drawable;

import android.support.v4.graphics.drawable.C0009;
import android.text.C0015;
import android.view.C0024;
import android.view.C0026;
import androidx.graphics.path.C0057;
import androidx.profileinstaller.C0062;
import com.google.android.material.appbar.C0085;
import com.google.android.material.bottomsheet.C0106;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.floatingactionbutton.C0113;
import defpackage.ay0;
import defpackage.cr0;
import defpackage.gk1;
import defpackage.ko1;
import defpackage.kr0;
import defpackage.lr0;
import defpackage.ob0;
import defpackage.qi1;
import defpackage.tv0;
import defpackage.vl1;
import defpackage.y41;
import defpackage.zl1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.core.graphics.drawable.ۥ۠ۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0047 {

    /* JADX INFO: renamed from: ۟ۦ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f47 = 798;

    /* JADX INFO: renamed from: ۟۠ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m618(Object obj) {
        if (C0009.m122() >= 0) {
            return ((ob0) obj).S;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static int m619(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static ay0 m620() {
        if (C0024.m321() >= 0) {
            return qi1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۥ, reason: not valid java name and contains not printable characters */
    public static tv0 m621(Object obj, float f, float f2) {
        if (C0026.m355() > 0) {
            return ko1.c((tv0) obj, f, f2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m622() {
        return (-666) ^ C0112.f118;
    }

    /* JADX INFO: renamed from: ۟ۦۦۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m623(Object obj) {
        if (C0015.m195() >= 0) {
            return ((ob0) obj).x();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m624(Object obj) {
        if (C0106.m1348() >= 0) {
            ((ob0) obj).i0();
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static void m625(Object obj, float f, float f2, float f3, float f4) {
        if (C0113.m1443() > 0) {
            ((y41) obj).A(f, f2, f3, f4);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static long m626(Object obj) {
        if (C0062.m818() <= 0) {
            return ((gk1) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۥ۟۟, reason: not valid java name and contains not printable characters */
    public static zl1 m627() {
        if (C0057.m749() >= 0) {
            return vl1.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۦ۟, reason: contains not printable characters */
    public static String m628(String str) {
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

    /* JADX INFO: renamed from: ۥۨۤۨ, reason: contains not printable characters */
    public static String m629(Object obj) {
        if (C0107.m1359() <= 0) {
            return ((cr0) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۥۥ, reason: not valid java name and contains not printable characters */
    public static lr0 m631(Object obj) {
        if (C0085.m1094() >= 0) {
            return ((kr0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۥۣ, reason: contains not printable characters */
    public static String m630(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
