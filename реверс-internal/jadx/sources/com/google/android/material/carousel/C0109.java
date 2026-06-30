package com.google.android.material.carousel;

import android.net.Uri;
import android.support.v4.app.C0003;
import android.text.C0010;
import androidx.compose.ui.input.pointer.C0036;
import androidx.core.app.C0038;
import androidx.core.app.C0039;
import androidx.core.graphics.drawable.C0047;
import androidx.core.graphics.drawable.C0048;
import androidx.graphics.path.C0055;
import androidx.startup.C0072;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.search.C0125;
import com.google.android.material.transformation.C0144;
import defpackage.aa2;
import defpackage.cg1;
import defpackage.da1;
import defpackage.ea2;
import defpackage.ft0;
import defpackage.ha0;
import defpackage.ls;
import defpackage.lt;
import defpackage.q52;
import defpackage.wr1;
import defpackage.xg0;
import defpackage.xn0;
import defpackage.yg1;
import java.io.ByteArrayOutputStream;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.material.carousel.ۣ۟ۢۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0109 {

    /* JADX INFO: renamed from: ۟ۢۦۨۥ, reason: not valid java name and contains not printable characters */
    public static int f115 = -320;

    /* JADX INFO: renamed from: ۣ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m1378(Object obj, Object obj2) {
        if (C0103.m1322() < 0) {
            return ((Enum) obj).compareTo((Enum) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m1380(Object obj, Object obj2) {
        if (C0003.m50() > 0) {
            return xg0.n((xg0) obj, (Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m1381(Object obj, Object obj2) {
        if (C0125.m1584() < 0) {
            return ((da1) obj).q(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static ha0 m1382(Object obj) {
        if (C0036.m473() > 0) {
            return ((aa2) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤۤ, reason: not valid java name and contains not printable characters */
    public static int m1383() {
        return 350 ^ C0010.f10;
    }

    /* JADX INFO: renamed from: ۟ۧۡۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m1384(Object obj) {
        if (C0048.m638() > 0) {
            return ((cg1) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۦۣ, reason: not valid java name and contains not printable characters */
    public static Map m1385(Object obj) {
        if (C0055.m723() >= 0) {
            return ((xn0) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static lt m1386(Object obj) {
        if (C0072.m936() <= 0) {
            return ((yg1) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۢۥ, reason: contains not printable characters */
    public static String m1387(Object obj) {
        if (C0047.m622() < 0) {
            return ((wr1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m1388(Object obj, Object obj2, Object obj3) {
        if (C0038.m509() > 0) {
            return ((xg0) obj).G((String) obj2, (ls) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۦ۟, reason: not valid java name and contains not printable characters */
    public static q52 m1389(Object obj) {
        if (C0039.m516() < 0) {
            return ((ft0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static long m1390(Object obj) {
        if (C0144.m1814() <= 0) {
            return ((ea2) obj).f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۤۤۡ, reason: not valid java name and contains not printable characters */
    public static String m1391(String str) {
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

    /* JADX INFO: renamed from: ۨۦۦ۟, reason: not valid java name and contains not printable characters */
    public static int m1392(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۧۥۢ, reason: not valid java name and contains not printable characters */
    public static String m1379(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
