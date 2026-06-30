package androidx.compose.ui.input.pointer;

import android.text.C0010;
import android.text.C0015;
import androidx.appcompat.widget.C0031;
import androidx.core.app.C0040;
import androidx.profileinstaller.C0062;
import androidx.recyclerview.widget.C0065;
import com.google.android.material.bottomappbar.C0100;
import com.google.android.material.floatingactionbutton.C0117;
import com.google.android.material.focus.C0119;
import com.google.android.material.search.C0127;
import com.google.android.material.transformation.C0140;
import defpackage.C0152;
import defpackage.C0156;
import defpackage.bc1;
import defpackage.cr0;
import defpackage.ei1;
import defpackage.f20;
import defpackage.ha0;
import defpackage.hj;
import defpackage.kd1;
import defpackage.ll;
import defpackage.lr0;
import defpackage.n81;
import defpackage.oc;
import defpackage.pl1;
import defpackage.rz;
import defpackage.sa0;
import defpackage.vm;
import defpackage.xm0;
import defpackage.y2;
import defpackage.yq0;
import defpackage.zc1;
import defpackage.zq;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.ۨۢ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0036 {

    /* JADX INFO: renamed from: ۧۥ۠۟, reason: not valid java name and contains not printable characters */
    public static int f36 = 188;

    /* JADX INFO: renamed from: ۟۠ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m471(Object obj) {
        if (C0034.m451() < 0) {
            return ((ll) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static void m472(Object obj) {
        if (C0015.m195() > 0) {
            kd1.t((pl1) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۢۦ, reason: not valid java name and contains not printable characters */
    public static int m473() {
        return (-952) ^ C0040.f40;
    }

    /* JADX INFO: renamed from: ۟ۢۤۧۧ, reason: not valid java name and contains not printable characters */
    public static oc m474(Object obj) {
        if (C0140.m1768() > 0) {
            return ((yq0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static int m475(Object obj) {
        if (C0100.m1278() >= 0) {
            return ((zq) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m476(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۥۨۨ, reason: not valid java name and contains not printable characters */
    public static n81 m477() {
        if (C0065.m853() <= 0) {
            return ei1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static ha0 m478(Object obj) {
        if (C0156.m2031() > 0) {
            return ((y2) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static zc1 m479(Object obj) {
        if (C0152.m1979() > 0) {
            return ((rz) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۥۤ, reason: not valid java name and contains not printable characters */
    public static void m480(Object obj) {
        if (C0031.m407() > 0) {
            ((xm0) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static bc1 m481(Object obj) {
        if (C0062.m818() <= 0) {
            return ((lr0) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۦ۟, reason: contains not printable characters */
    public static File m482(Object obj) {
        if (C0117.m1475() > 0) {
            return ((cr0) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۧۦ, reason: contains not printable characters */
    public static int m483(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۣ۠ۡ, reason: contains not printable characters */
    public static f20 m484(Object obj) {
        if (C0119.m1511() >= 0) {
            return ((vm) obj).A();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠۠, reason: not valid java name and contains not printable characters */
    public static sa0 m486(Object obj) {
        if (C0127.m1604() > 0) {
            return ((hj) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۧ, reason: not valid java name and contains not printable characters */
    public static f20 m487(Object obj) {
        if (C0010.m137() <= 0) {
            return ((vm) obj).u();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m485(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
