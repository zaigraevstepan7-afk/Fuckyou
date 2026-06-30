package android.support.v4.app;

import android.media.MediaPlayer;
import androidx.graphics.path.C0054;
import androidx.startup.C0069;
import androidx.window.reflection.C0083;
import com.google.android.material.bottomappbar.C0096;
import com.reddit.frontpage.C0147;
import defpackage.al;
import defpackage.cm;
import defpackage.er0;
import defpackage.je0;
import defpackage.ks;
import defpackage.xi0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: android.support.v4.app.۟ۥۢۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0003 {

    /* JADX INFO: renamed from: ۟ۢ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static int f3 = 262;

    /* JADX INFO: renamed from: ۟۠ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static String m46(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static ks m47(Object obj, Object obj2, Object obj3) {
        if (C0069.m906() < 0) {
            return ((er0) obj).o((ks) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m48(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۢ, reason: not valid java name and contains not printable characters */
    public static je0 m49(Object obj) {
        if (C0083.m1068() > 0) {
            return al.K((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۥ۠, reason: not valid java name and contains not printable characters */
    public static int m50() {
        return 812 ^ C0096.f102;
    }

    /* JADX INFO: renamed from: ۣۤۡۧ, reason: not valid java name and contains not printable characters */
    public static cm m51() {
        if (C0054.m711() >= 0) {
            return xi0.G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m53(Object obj) {
        if (C0147.m1843() > 0) {
            ((MediaPlayer) obj).release();
        }
    }

    /* JADX INFO: renamed from: ۥۦۢۥ, reason: contains not printable characters */
    public static String m52(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
