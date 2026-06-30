package com.google.android.material.appbar;

import android.media.MediaPlayer;
import androidx.core.app.C0039;
import androidx.lifecycle.C0059;
import androidx.window.reflection.C0079;
import com.google.android.material.behavior.C0088;
import com.google.android.material.behavior.C0090;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.focus.C0118;
import com.google.android.material.search.C0128;
import com.google.android.material.sidesheet.C0134;
import defpackage.jo0;
import defpackage.ob0;
import defpackage.oz;
import defpackage.pe1;
import defpackage.re0;
import defpackage.rq1;
import defpackage.v20;
import defpackage.xi0;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* JADX INFO: renamed from: com.google.android.material.appbar.۟ۧۤۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0084 {

    /* JADX INFO: renamed from: ۣۡۦۤ, reason: not valid java name and contains not printable characters */
    public static int f90 = 494;

    /* JADX INFO: renamed from: ۟۠۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1079(Object obj, Object obj2) {
        if (C0039.m516() <= 0) {
            return xi0.o(obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static Throwable m1080(Object obj) {
        if (C0088.m1147() < 0) {
            return pe1.a(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m1081(Object obj, Object obj2) {
        if (C0113.m1443() >= 0) {
            ((MediaPlayer) obj).setOnCompletionListener((MediaPlayer.OnCompletionListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠۟۠, reason: not valid java name and contains not printable characters */
    public static rq1 m1082(Object obj) {
        if (C0118.m1484() >= 0) {
            return ((jo0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m1083() {
        return 819 ^ C0079.f79;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static re0 m1084(Object obj) {
        if (C0134.m1687() < 0) {
            return v20.l((ob0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1085(Object obj) {
        if (C0059.m769() > 0) {
            return ((File) obj).exists();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static int m1086(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static boolean m1087(Object obj, Object obj2) {
        if (C0128.m1607() <= 0) {
            return ((File) obj).renameTo((File) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۦۨ, reason: contains not printable characters */
    public static long m1088(Object obj) {
        if (C0090.m1175() <= 0) {
            return ((oz) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦ۟ۡۤ, reason: contains not printable characters */
    public static String m1089(String str) {
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

    /* JADX INFO: renamed from: ۦۨۨۧ, reason: contains not printable characters */
    public static String m1090(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
