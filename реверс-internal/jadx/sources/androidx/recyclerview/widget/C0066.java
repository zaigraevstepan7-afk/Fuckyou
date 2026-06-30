package androidx.recyclerview.widget;

import androidx.appcompat.app.C0028;
import androidx.core.app.C0040;
import androidx.core.app.C0041;
import androidx.profileinstaller.C0064;
import androidx.startup.C0069;
import androidx.versionedparcelable.C0076;
import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.carousel.C0109;
import com.google.android.material.sidesheet.C0129;
import defpackage.cm;
import defpackage.hx;
import defpackage.im1;
import defpackage.ks;
import defpackage.ob0;
import defpackage.oz;
import defpackage.rz;
import defpackage.sd;
import defpackage.xi0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥۨۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0066 {

    /* JADX INFO: renamed from: ۢۨ۠۠, reason: not valid java name and contains not printable characters */
    public static int f66 = -948;

    /* JADX INFO: renamed from: ۟۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static int m857() {
        return (-936) ^ C0129.f135;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m858(Object obj) {
        if (C0069.m906() <= 0) {
            return ((rz) obj).s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m859(Object obj, Object obj2, Object obj3) {
        if (C0041.m550() >= 0) {
            return ((im1) obj).c((ks) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static int m860(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static long m861(Object obj) {
        if (C0028.m368() < 0) {
            return ((oz) obj).e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥ, reason: not valid java name and contains not printable characters */
    public static String m862(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۦ۠۠, reason: not valid java name and contains not printable characters */
    public static sd m864() {
        if (C0076.m975() <= 0) {
            return sd.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧۢ, reason: not valid java name and contains not printable characters */
    public static float m865(Object obj, float f) {
        if (C0064.m840() >= 0) {
            return ((hx) obj).y(f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۦۢۡ, reason: not valid java name and contains not printable characters */
    public static cm m866() {
        if (C0099.m1272() <= 0) {
            return xi0.a0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۤ۠, reason: contains not printable characters */
    public static Integer m867(int i) {
        if (C0109.m1383() >= 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۧۡ, reason: not valid java name and contains not printable characters */
    public static void m868(Object obj) {
        if (C0040.m542() <= 0) {
            ((ob0) obj).Q();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۧ۟, reason: not valid java name and contains not printable characters */
    public static String m863(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
