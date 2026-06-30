package androidx.compose.ui.input.pointer;

import android.text.C0012;
import android.view.C0024;
import androidx.core.graphics.drawable.C0048;
import androidx.graphics.path.C0057;
import com.google.android.material.bottomappbar.C0097;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.focus.C0120;
import com.google.android.material.focus.C0121;
import defpackage.aq0;
import defpackage.ba2;
import defpackage.bq;
import defpackage.h31;
import defpackage.ha0;
import defpackage.hk;
import defpackage.t2;
import defpackage.tf;
import defpackage.tv0;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.ۣ۟ۨۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0034 {

    /* JADX INFO: renamed from: ۣۡۢۡ, reason: not valid java name and contains not printable characters */
    public static int f34 = 532;

    /* JADX INFO: renamed from: ۟۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static long m447() {
        if (C0024.m321() >= 0) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static int m448(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۟ۤ۠۟, reason: not valid java name and contains not printable characters */
    public static bq m449() {
        if (C0121.m1535() >= 0) {
            return t2.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۦۡ, reason: not valid java name and contains not printable characters */
    public static Object m450(Object obj, Object obj2, Object obj3) {
        if (C0057.m749() >= 0) {
            return ((Map) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m451() {
        return (-357) ^ C0113.f119;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m452(Object obj) {
        if (C0012.m162() >= 0) {
            return ((ArrayList) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m453(Object obj) {
        if (C0097.m1242() < 0) {
            return ((BufferedInputStream) obj).read();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧۡ, reason: not valid java name and contains not printable characters */
    public static tv0 m454(Object obj) {
        if (C0120.m1522() > 0) {
            return ((h31) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦۢ, reason: not valid java name and contains not printable characters */
    public static ha0 m455(Object obj) {
        if (m451() < 0) {
            return ((ba2) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۤ, reason: contains not printable characters */
    public static int m456(Object obj, int i, int i2) {
        if (C0107.m1359() <= 0) {
            return ((tf) obj).a(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۦ, reason: contains not printable characters */
    public static aq0 m457() {
        if (C0048.m638() >= 0) {
            return hk.n();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m458(String str) {
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

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m459(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
