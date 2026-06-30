package androidx.core.widget;

import android.support.v4.app.C0003;
import android.support.v4.app.C0004;
import android.text.C0013;
import androidx.appcompat.widget.C0030;
import androidx.appcompat.widget.C0032;
import androidx.lifecycle.C0060;
import androidx.window.reflection.C0083;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.bottomsheet.C0106;
import com.google.android.material.transformation.C0142;
import defpackage.bm;
import defpackage.c41;
import defpackage.co1;
import defpackage.ex1;
import defpackage.gk1;
import defpackage.ha0;
import defpackage.hd1;
import defpackage.is1;
import defpackage.iy0;
import defpackage.jo;
import defpackage.kg;
import defpackage.ob0;
import defpackage.pd1;
import defpackage.tv0;
import defpackage.ut0;
import defpackage.wa0;
import defpackage.xm0;
import defpackage.ym1;
import defpackage.z80;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* JADX INFO: renamed from: androidx.core.widget.ۣۣۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0053 {

    /* JADX INFO: renamed from: ۣ۟ۥۨۦ, reason: not valid java name and contains not printable characters */
    public static int f53 = -633;

    /* JADX INFO: renamed from: ۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m688(Object obj, long j) {
        if (C0003.m50() >= 0) {
            ((ex1) obj).e(j);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static long m690(Object obj) {
        if (C0032.m419() < 0) {
            return ((bm) obj).r;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static String m691(Object obj) {
        if (C0142.m1788() >= 0) {
            return ((File) obj).getAbsolutePath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m692(Object obj, boolean z, Object obj2, Object obj3, Object obj4, boolean z2, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i) {
        if (C0004.m65() > 0) {
            pd1.b((co1) obj, z, (ha0) obj2, (ym1) obj3, (tv0) obj4, z2, (gk1) obj5, (kg) obj6, (c41) obj7, (wa0) obj8, (jo) obj9, (ob0) obj10, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static iy0 m693(Object obj) {
        if (C0083.m1068() >= 0) {
            return ((hd1) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static int m694(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۥۤ۟, reason: not valid java name and contains not printable characters */
    public static int m695() {
        return (-738) ^ C0106.f112;
    }

    /* JADX INFO: renamed from: ۟ۧۥۧ۠, reason: not valid java name and contains not printable characters */
    public static void m696(Object obj) {
        if (C0103.m1322() <= 0) {
            ((ut0) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۡۥۨۥ, reason: not valid java name and contains not printable characters */
    public static int m697(Object obj) {
        if (C0060.m781() <= 0) {
            return ((is1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m698(String str) {
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

    /* JADX INFO: renamed from: ۣۨۦۣ, reason: not valid java name and contains not printable characters */
    public static String m699(Object obj) {
        if (C0030.m397() >= 0) {
            return ((StringBuilder) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۨۦ, reason: contains not printable characters */
    public static xm0 m700(Object obj) {
        if (C0013.m174() <= 0) {
            return ((z80) obj).x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m689(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
