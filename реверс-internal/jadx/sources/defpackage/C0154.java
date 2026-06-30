package defpackage;

import android.support.v4.graphics.drawable.C0006;
import android.view.C0023;
import androidx.appcompat.widget.C0030;
import androidx.core.app.C0039;
import androidx.profileinstaller.C0063;
import androidx.recyclerview.widget.C0067;
import com.google.android.material.focus.C0121;
import com.google.android.material.transformation.C0146;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: ۡۤۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0154 {

    /* JADX INFO: renamed from: ۦۤۡ۟, reason: contains not printable characters */
    public static int f231 = -582;

    /* JADX INFO: renamed from: ۟۟۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static String m1999(Object obj) {
        if (C0039.m516() <= 0) {
            return ((cr0) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۤۢ, reason: not valid java name and contains not printable characters */
    public static f20 m2000(Object obj) {
        if (C0067.m876() > 0) {
            return ((vm) obj).o();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static int m2001(Object obj) {
        if (C0121.m1535() >= 0) {
            return ((da1) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m2002(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static ad m2003() {
        if (C0023.m313() > 0) {
            return pv.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m2005(Object obj) {
        if (C0063.m824() >= 0) {
            return ((Process) obj).waitFor();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۦۣ, reason: not valid java name and contains not printable characters */
    public static int m2006() {
        return 460 ^ C0030.f30;
    }

    /* JADX INFO: renamed from: ۣۥ, reason: not valid java name and contains not printable characters */
    public static i91 m2007() {
        if (C0146.m1831() > 0) {
            return xg0.o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ۟ۡ, reason: contains not printable characters */
    public static boolean m2008(Object obj, char c) {
        if (C0006.m96() >= 0) {
            return ct1.L((CharSequence) obj, c);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۢ, reason: contains not printable characters */
    public static void m2009(Object obj, float f) {
        if (C0146.m1831() >= 0) {
            ((y41) obj).E(f);
        }
    }

    /* JADX INFO: renamed from: ۨۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m2010(String str) {
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

    /* JADX INFO: renamed from: ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static String m2004(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
