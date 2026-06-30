package androidx.startup;

import android.support.v4.graphics.drawable.C0006;
import android.text.C0010;
import androidx.appcompat.widget.C0032;
import androidx.profileinstaller.C0062;
import androidx.versionedparcelable.C0074;
import androidx.window.reflection.C0083;
import com.google.android.material.floatingactionbutton.C0116;
import defpackage.d02;
import defpackage.fs1;
import defpackage.g32;
import defpackage.h32;
import defpackage.ob0;
import defpackage.ou;
import defpackage.q52;
import defpackage.sv0;
import defpackage.ux;
import defpackage.w6;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.startup.۟ۤۡ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0070 {

    /* JADX INFO: renamed from: ۟ۤۢۦۨ, reason: not valid java name and contains not printable characters */
    public static int f70 = -398;

    /* JADX INFO: renamed from: ۟۠ۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static ou[] m910(Object obj) {
        if (C0074.m963() > 0) {
            return ((q52) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۦ, reason: not valid java name and contains not printable characters */
    public static fs1 m911() {
        if (C0083.m1068() > 0) {
            return fs1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۦ, reason: not valid java name and contains not printable characters */
    public static String m912(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۢۤۢ, reason: not valid java name and contains not printable characters */
    public static sv0 m913(Object obj) {
        if (C0006.m96() > 0) {
            return ((sv0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۧۦ, reason: not valid java name and contains not printable characters */
    public static String m914(Object obj) {
        if (C0010.m137() < 0) {
            return ((ux) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۥۢ, reason: contains not printable characters */
    public static int m915() {
        return (-100) ^ C0062.f62;
    }

    /* JADX INFO: renamed from: ۣۨۨۧ, reason: not valid java name and contains not printable characters */
    public static int m916(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۤۦۤ, reason: not valid java name and contains not printable characters */
    public static void m917(Object obj) {
        if (C0116.m1470() < 0) {
            ((w6) obj).h();
        }
    }

    /* JADX INFO: renamed from: ۨۤۧ, reason: not valid java name and contains not printable characters */
    public static d02 m918(Object obj, Object obj2) {
        if (C0032.m419() < 0) {
            return h32.a((g32) obj, (ob0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static String m919(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
