package androidx.profileinstaller;

import android.support.v4.app.C0002;
import androidx.versionedparcelable.C0074;
import androidx.window.reflection.C0082;
import com.google.android.material.behavior.C0091;
import com.google.android.material.bottomappbar.C0099;
import com.reddit.frontpage.C0150;
import defpackage.ob0;
import defpackage.qq;
import defpackage.xi0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.profileinstaller.ۡۡۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0062 {

    /* JADX INFO: renamed from: ۣ۟ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static int f62 = 885;

    /* JADX INFO: renamed from: ۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static float m813() {
        if (C0099.m1272() <= 0) {
            return xi0.H;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m814(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۟ۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m815(Object obj, boolean z) {
        if (C0082.m1058() < 0) {
            ((ob0) obj).p(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۨ, reason: not valid java name and contains not printable characters */
    public static int m816(Object obj) {
        if (C0150.m1876() >= 0) {
            return ((qq) obj).l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦۥ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m817(Object obj, Object obj2) {
        if (C0002.m39() > 0) {
            return ((StringBuilder) obj).append((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۧ, reason: not valid java name and contains not printable characters */
    public static int m818() {
        return 257 ^ C0091.f97;
    }

    /* JADX INFO: renamed from: ۢۥۢۢ, reason: not valid java name and contains not printable characters */
    public static float m819() {
        if (C0074.m963() > 0) {
            return xi0.B;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m821(String str) {
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

    /* JADX INFO: renamed from: ۥۨۦۣ, reason: contains not printable characters */
    public static String m820(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
