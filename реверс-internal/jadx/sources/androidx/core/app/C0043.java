package androidx.core.app;

import android.media.MediaPlayer;
import androidx.graphics.path.C0054;
import com.google.android.material.behavior.C0093;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.floatingactionbutton.C0114;
import com.google.android.material.sidesheet.C0130;
import defpackage.c41;
import defpackage.ir0;
import defpackage.no1;
import defpackage.qq;
import defpackage.s91;
import defpackage.tv0;
import defpackage.u4;
import defpackage.vm;
import defpackage.xi0;
import defpackage.xl;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.core.app.ۤۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0043 {

    /* JADX INFO: renamed from: ۟ۦۤۡۡ, reason: not valid java name and contains not printable characters */
    public static int f43 = -859;

    /* JADX INFO: renamed from: ۟ۦۦۢۤ, reason: not valid java name and contains not printable characters */
    public static vm m570() {
        if (C0099.m1272() <= 0) {
            return u4.g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m571() {
        if (C0098.m1266() <= 0) {
            return xl.h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static long m572(Object obj, boolean z, boolean z2) {
        if (C0113.m1443() > 0) {
            return ((no1) obj).a(z, z2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۡۡ, reason: not valid java name and contains not printable characters */
    public static int m574(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۢۢۦ, reason: not valid java name and contains not printable characters */
    public static MediaPlayer m575(Object obj) {
        if (C0099.m1272() <= 0) {
            return ((ir0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۢۧ, reason: not valid java name and contains not printable characters */
    public static tv0 m576(Object obj, Object obj2) {
        if (C0054.m711() >= 0) {
            return xi0.B((tv0) obj, (c41) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static String m577(String str) {
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

    /* JADX INFO: renamed from: ۤ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m578() {
        return 313 ^ C0130.f136;
    }

    /* JADX INFO: renamed from: ۦۣۡ۟, reason: contains not printable characters */
    public static int m579(float f, int i, int i2) {
        if (C0114.m1448() >= 0) {
            return s91.a(f, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m580(Object obj) {
        if (C0093.m1203() >= 0) {
            return ((qq) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨ۠, reason: not valid java name and contains not printable characters */
    public static String m573(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
