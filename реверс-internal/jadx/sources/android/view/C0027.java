package android.view;

import android.os.Build;
import android.text.C0014;
import androidx.core.graphics.drawable.C0047;
import androidx.core.widget.C0051;
import androidx.graphics.path.C0057;
import com.google.android.material.bottomsheet.C0104;
import com.google.android.material.carousel.C0111;
import com.google.android.material.floatingactionbutton.C0112;
import defpackage.bm;
import defpackage.dn1;
import defpackage.f32;
import defpackage.iw0;
import defpackage.jj;
import defpackage.jo;
import defpackage.mu0;
import defpackage.ob0;
import defpackage.sv0;
import defpackage.vt;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: android.view.ۤۡۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0027 {

    /* JADX INFO: renamed from: ۣۤۡۡ, reason: not valid java name and contains not printable characters */
    public static int f27 = -876;

    /* JADX INFO: renamed from: ۟۟ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static int m358(Object obj) {
        if (C0057.m749() >= 0) {
            return ((dn1) obj).l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۡۧۡ, reason: not valid java name and contains not printable characters */
    public static void m359(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        if (C0111.m1412() <= 0) {
            mu0.a((bm) obj, (iw0) obj2, (f32) obj3, (jo) obj4, (ob0) obj5, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m360(Object obj) {
        if (C0014.m186() <= 0) {
            return ((jj) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۦ, reason: not valid java name and contains not printable characters */
    public static int m361(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m362(Object obj, int i) {
        if (C0051.m670() > 0) {
            return Arrays.copyOf((Object[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m364(String str) {
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

    /* JADX INFO: renamed from: ۠ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m365() {
        return (-151) ^ C0112.f118;
    }

    /* JADX INFO: renamed from: ۦ۠ۢۨ, reason: contains not printable characters */
    public static vt m366(Object obj) {
        if (C0047.m622() <= 0) {
            return ((sv0) obj).z0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۣۢ, reason: contains not printable characters */
    public static String[] m367() {
        if (C0104.m1332() >= 0) {
            return Build.SUPPORTED_ABIS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠۠۟, reason: not valid java name and contains not printable characters */
    public static String m363(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
