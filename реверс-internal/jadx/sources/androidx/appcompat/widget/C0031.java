package androidx.appcompat.widget;

import android.content.res.Resources;
import android.support.v4.graphics.drawable.C0008;
import androidx.core.app.C0037;
import androidx.core.app.C0044;
import androidx.core.widget.C0052;
import androidx.profileinstaller.C0061;
import androidx.window.reflection.C0083;
import com.google.android.material.behavior.C0092;
import com.google.android.material.behavior.C0093;
import com.google.android.material.bottomappbar.C0096;
import com.google.android.material.focus.C0122;
import com.google.android.material.sidesheet.C0134;
import com.google.android.material.snackbar.C0138;
import defpackage.af1;
import defpackage.bm;
import defpackage.gr0;
import defpackage.ha0;
import defpackage.kd1;
import defpackage.ko1;
import defpackage.lr0;
import defpackage.ob0;
import defpackage.rc;
import defpackage.sa0;
import defpackage.tv0;
import defpackage.ue0;
import defpackage.xi0;
import defpackage.ye0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۣ۟ۡ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0031 {

    /* JADX INFO: renamed from: ۟ۤ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static int f31 = -721;

    /* JADX INFO: renamed from: ۟۟۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m404(Object obj) {
        if (C0008.m116() > 0) {
            return ((gr0) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static Object m405(Object obj) {
        if (C0052.m681() > 0) {
            return ((ha0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static long m406(Object obj) {
        if (C0138.m1738() > 0) {
            return ((bm) obj).x;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static int m407() {
        return (-1009) ^ C0092.f98;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m408(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        if (C0037.m496() < 0) {
            xi0.c((ArrayList) obj, i, (sa0) obj2, (tv0) obj3, (ob0) obj4, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۡۤ, reason: not valid java name and contains not printable characters */
    public static int m410(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۨ, reason: not valid java name and contains not printable characters */
    public static long m411(long j, long j2) {
        if (C0083.m1068() >= 0) {
            return Math.max(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۨۦۦ, reason: not valid java name and contains not printable characters */
    public static long m412(int i, int i2) {
        if (C0096.m1232() > 0) {
            return af1.g(i, i2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧۢ, reason: not valid java name and contains not printable characters */
    public static tv0 m413(Object obj, float f) {
        if (C0093.m1203() > 0) {
            return ko1.e((tv0) obj, f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static ye0 m414() {
        if (C0134.m1687() <= 0) {
            return kd1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۦۦ, reason: not valid java name and contains not printable characters */
    public static void m415(Object obj, Object obj2, Object obj3, long j, Object obj4, int i, int i2) {
        if (C0061.m803() <= 0) {
            ue0.a((ye0) obj, (String) obj2, (tv0) obj3, j, (ob0) obj4, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static lr0 m416(Object obj) {
        if (C0122.m1542() <= 0) {
            return ((rc) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۢ, reason: not valid java name and contains not printable characters */
    public static String m417(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۡۥ۠, reason: not valid java name and contains not printable characters */
    public static String m418(Object obj, int i) {
        if (C0044.m586() <= 0) {
            return ((Resources) obj).getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۡ, reason: not valid java name and contains not printable characters */
    public static String m409(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
