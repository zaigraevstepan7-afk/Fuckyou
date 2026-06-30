package androidx.core.widget;

import android.view.C0026;
import androidx.compose.ui.input.pointer.C0036;
import androidx.core.app.C0038;
import androidx.graphics.path.C0054;
import androidx.graphics.path.C0057;
import androidx.window.reflection.C0080;
import com.google.android.material.behavior.C0091;
import com.google.android.material.behavior.C0092;
import com.google.android.material.bottomappbar.C0095;
import com.google.android.material.transformation.C0145;
import com.reddit.frontpage.C0148;
import com.reddit.frontpage.C0149;
import defpackage.C0152;
import defpackage.cr;
import defpackage.d02;
import defpackage.h31;
import defpackage.ha0;
import defpackage.hq;
import defpackage.jo;
import defpackage.mz1;
import defpackage.ns1;
import defpackage.ob0;
import defpackage.od1;
import defpackage.qc;
import defpackage.v61;
import defpackage.wq;
import defpackage.x61;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Map;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: androidx.core.widget.۠ۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0052 {

    /* JADX INFO: renamed from: ۨ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static int f52 = 117;

    /* JADX INFO: renamed from: ۟۠ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m672(Object obj) {
        if (C0145.m1828() < 0) {
            return ((od1) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static int m673(Object obj) {
        if (C0092.m1194() > 0) {
            return ((wq) obj).h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m675(Object obj, Object obj2) {
        if (C0152.m1979() >= 0) {
            return ((Map) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۧ, reason: not valid java name and contains not printable characters */
    public static String m676(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۡۤۨ, reason: not valid java name and contains not printable characters */
    public static v61 m677() {
        if (C0149.m1865() <= 0) {
            return x61.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۨۡ, reason: not valid java name and contains not printable characters */
    public static int m678(Object obj) {
        if (C0148.m1860() >= 0) {
            return ((od1) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m679(Object obj, Object obj2, Object obj3, int i) {
        if (C0091.m1182() >= 0) {
            mz1.a((d02) obj, (jo) obj2, (ob0) obj3, i);
        }
    }

    /* JADX INFO: renamed from: ۡۤۢۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m680(Object obj, Object obj2) {
        if (C0080.m1033() < 0) {
            return ((String) obj).getBytes((Charset) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۨ۠, reason: not valid java name and contains not printable characters */
    public static int m681() {
        return (-800) ^ C0095.f101;
    }

    /* JADX INFO: renamed from: ۣۡۤۨ, reason: not valid java name and contains not printable characters */
    public static ha0 m682(Object obj) {
        if (C0054.m711() > 0) {
            return ((hq) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۦۡ, reason: not valid java name and contains not printable characters */
    public static int m683(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤ۠۟, reason: not valid java name and contains not printable characters */
    public static ns1 m684(Object obj) {
        if (C0026.m355() > 0) {
            return ((qc) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤ۠, reason: not valid java name and contains not printable characters */
    public static Cipher m685(Object obj) {
        if (C0036.m473() >= 0) {
            return Cipher.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static int m686(Object obj) {
        if (C0038.m509() >= 0) {
            return ((h31) obj).l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m687(Object obj) {
        if (C0057.m749() >= 0) {
            return ((cr) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۥۡ, reason: not valid java name and contains not printable characters */
    public static String m674(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
