package android.view.translation;

import android.content.Context;
import androidx.core.app.C0037;
import androidx.core.app.C0039;
import androidx.core.graphics.drawable.C0049;
import androidx.startup.C0070;
import androidx.window.reflection.C0079;
import androidx.window.reflection.C0082;
import com.google.android.material.behavior.C0088;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.focus.C0120;
import com.google.android.material.sidesheet.C0130;
import defpackage.C0153;
import defpackage.C0155;
import defpackage.a90;
import defpackage.cd0;
import defpackage.dp;
import defpackage.f20;
import defpackage.g31;
import defpackage.r9;
import defpackage.rz;
import defpackage.sa0;
import defpackage.tq;
import defpackage.vm;
import defpackage.wr;
import defpackage.zw;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: renamed from: android.view.translation.ۧۤۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0020 {

    /* JADX INFO: renamed from: ۟ۦۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f20 = -507;

    /* JADX INFO: renamed from: ۟۟, reason: not valid java name and contains not printable characters */
    public static f20 m256(Object obj) {
        if (C0130.m1641() > 0) {
            return ((vm) obj).v();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m257(Object obj, int i, int i2, Object obj2) {
        if (C0155.m2019() >= 0) {
            Arrays.fill((Object[]) obj, i, i2, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static cd0 m258() {
        if (C0153.m1994() > 0) {
            return cd0.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static r9 m259() {
        if (C0039.m516() <= 0) {
            return dp.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣ۟, reason: not valid java name and contains not printable characters */
    public static sa0 m260(Object obj) {
        if (C0120.m1522() >= 0) {
            return ((tq) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m261(Object obj) {
        if (C0082.m1058() <= 0) {
            return ((g31) obj).g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۥۤ, reason: not valid java name and contains not printable characters */
    public static f20 m262(Object obj) {
        if (C0082.m1058() < 0) {
            return ((vm) obj).r();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static wr m263() {
        if (C0049.m645() >= 0) {
            return a90.s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۨۥ, reason: not valid java name and contains not printable characters */
    public static File m264(Object obj) {
        if (C0088.m1147() <= 0) {
            return ((rz) obj).x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۧ, reason: not valid java name and contains not printable characters */
    public static void m266(Object obj) {
        if (C0070.m915() < 0) {
            ((zw) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۤۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m267(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۦۨۤ, reason: contains not printable characters */
    public static File m268(Object obj) {
        if (C0079.m1016() < 0) {
            return ((Context) obj).getFilesDir();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۠ۤ, reason: contains not printable characters */
    public static String m269(String str) {
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

    /* JADX INFO: renamed from: ۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m270(Object obj, Object obj2) {
        if (C0037.m496() < 0) {
            return ((String) obj).equalsIgnoreCase((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۤۤ, reason: not valid java name and contains not printable characters */
    public static int m271() {
        return 974 ^ C0098.f104;
    }

    /* JADX INFO: renamed from: ۣۦۨ۟, reason: not valid java name and contains not printable characters */
    public static String m265(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
