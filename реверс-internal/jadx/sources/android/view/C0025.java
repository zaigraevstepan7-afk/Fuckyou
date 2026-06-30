package android.view;

import android.text.C0010;
import android.view.translation.C0018;
import androidx.recyclerview.widget.C0068;
import androidx.versionedparcelable.C0077;
import com.google.android.material.appbar.C0086;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.carousel.C0110;
import com.google.android.material.floatingactionbutton.C0112;
import defpackage.b61;
import defpackage.bg1;
import defpackage.bl;
import defpackage.bm;
import defpackage.e20;
import defpackage.ea1;
import defpackage.f20;
import defpackage.h20;
import defpackage.ob0;
import defpackage.ol1;
import defpackage.s91;
import defpackage.sa0;
import defpackage.tv0;
import defpackage.x2;
import defpackage.ye0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: android.view.ۣۡۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0025 {

    /* JADX INFO: renamed from: ۡ۠۟۠, reason: not valid java name and contains not printable characters */
    public static int f25 = 457;

    /* JADX INFO: renamed from: ۟۠۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static int m333(Object obj) {
        if (C0103.m1322() <= 0) {
            return ((ea1) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static long m335(Object obj) {
        if (C0068.m888() <= 0) {
            return ((bm) obj).H;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static String m336(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static ye0 m337() {
        if (C0112.m1424() <= 0) {
            return bl.z();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۤۥ, reason: not valid java name and contains not printable characters */
    public static int m338(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static String m339(Object obj) {
        if (C0010.m137() <= 0) {
            return ((x2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static int m340() {
        return 461 ^ C0110.f116;
    }

    /* JADX INFO: renamed from: ۣۤۡ۟, reason: not valid java name and contains not printable characters */
    public static b61 m341(Object obj) {
        if (C0077.m996() >= 0) {
            return ((ob0) obj).l();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۡۧ, reason: contains not printable characters */
    public static Object m342(Object obj, Object obj2) {
        if (C0018.m241() < 0) {
            return ((bg1) obj).q(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣ۠, reason: contains not printable characters */
    public static tv0 m343(Object obj, boolean z, Object obj2) {
        if (C0086.m1107() >= 0) {
            return ol1.a((tv0) obj, z, (sa0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۧۦ, reason: not valid java name and contains not printable characters */
    public static long m344(Object obj, Object obj2, Object obj3) {
        if (C0077.m996() > 0) {
            return s91.f((e20) obj, (f20) obj2, (h20) obj3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m334(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
