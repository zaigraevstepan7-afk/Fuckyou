package androidx.lifecycle;

import android.content.Context;
import android.support.v4.app.C0002;
import android.view.C0025;
import androidx.core.graphics.drawable.C0049;
import androidx.window.reflection.C0081;
import com.google.android.material.appbar.C0085;
import com.google.android.material.search.C0128;
import com.google.android.material.transformation.C0140;
import defpackage.ay0;
import defpackage.f20;
import defpackage.fu;
import defpackage.ko1;
import defpackage.tv0;
import defpackage.vm;
import defpackage.z91;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.lifecycle.۟ۦۦۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0058 {

    /* JADX INFO: renamed from: ۧۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int f58 = -451;

    /* JADX INFO: renamed from: ۟۠ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static int m756() {
        return 868 ^ C0085.f91;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static tv0 m757(Object obj, float f, float f2, float f3, float f4) {
        if (C0128.m1607() < 0) {
            return ko1.g((tv0) obj, f, f2, f3, f4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static Context m758(Object obj) {
        if (C0059.m769() >= 0) {
            return ((Context) obj).getApplicationContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m759(Object obj, Object obj2) {
        if (C0002.m39() >= 0) {
            ((ay0) obj).k(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m760(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static f20 m761(Object obj) {
        if (C0049.m645() >= 0) {
            return ((vm) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static String m762(String str) {
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

    /* JADX INFO: renamed from: ۣۦۣۤ, reason: not valid java name and contains not printable characters */
    public static String m763(Object obj, Object obj2) {
        if (C0140.m1768() >= 0) {
            return ((String) obj).concat((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static float[] m764(Object obj) {
        if (C0081.m1040() > 0) {
            return ((fu) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥۤ, reason: not valid java name and contains not printable characters */
    public static Throwable m765(Object obj) {
        if (C0025.m340() > 0) {
            return ((z91) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۥۣ, reason: not valid java name and contains not printable characters */
    public static String m766(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
