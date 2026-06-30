package androidx.compose.ui.input.pointer;

import android.support.v4.graphics.drawable.C0007;
import androidx.appcompat.widget.C0030;
import androidx.core.graphics.drawable.C0046;
import androidx.graphics.path.C0055;
import com.google.android.material.behavior.C0091;
import com.google.android.material.transformation.C0143;
import com.reddit.frontpage.C0150;
import defpackage.dn1;
import defpackage.fu;
import defpackage.iy0;
import defpackage.ju0;
import defpackage.pc;
import defpackage.pn1;
import defpackage.zf1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.ۥۧۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0035 {

    /* JADX INFO: renamed from: ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int f35 = -128;

    /* JADX INFO: renamed from: ۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m460(Object obj, Object obj2) {
        if (C0143.m1796() > 0) {
            ((iy0) obj).b(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m461() {
        return 601 ^ C0034.f34;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۡ, reason: not valid java name and contains not printable characters */
    public static int m462(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۡۢ۟, reason: not valid java name and contains not printable characters */
    public static float m464(Object obj) {
        if (C0030.m397() > 0) {
            return ((fu) obj).b();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۧۥۤ, reason: not valid java name and contains not printable characters */
    public static long m465(Object obj) {
        if (C0055.m723() > 0) {
            return ((dn1) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۡۡ, reason: not valid java name and contains not printable characters */
    public static String m466(Object obj) {
        if (C0046.m616() <= 0) {
            return ((zf1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static Boolean m467(boolean z) {
        if (C0007.m100() > 0) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static pn1 m468(Object obj) {
        if (C0091.m1182() > 0) {
            return ((ju0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۥۧ, reason: not valid java name and contains not printable characters */
    public static int m469(Object obj) {
        if (C0150.m1876() >= 0) {
            return ((pc) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static String m470(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m463(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
