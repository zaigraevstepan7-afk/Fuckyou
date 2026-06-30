package androidx.core.app;

import android.text.C0015;
import androidx.compose.ui.input.pointer.C0036;
import androidx.core.graphics.drawable.C0045;
import androidx.lifecycle.C0060;
import androidx.startup.C0073;
import com.google.android.material.behavior.C0092;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.bottomsheet.C0106;
import com.google.android.material.floatingactionbutton.C0117;
import defpackage.C0154;
import defpackage.a4;
import defpackage.bm;
import defpackage.br;
import defpackage.cm;
import defpackage.dm;
import defpackage.dp;
import defpackage.dr0;
import defpackage.ea2;
import defpackage.h31;
import defpackage.iq;
import defpackage.jw0;
import defpackage.or1;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.app.ۣۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0040 {

    /* JADX INFO: renamed from: ۦۣۡۥ, reason: contains not printable characters */
    public static int f40 = -536;

    /* JADX INFO: renamed from: ۣ۟۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static long m530(Object obj, Object obj2) {
        if (C0117.m1475() > 0) {
            return dm.b((bm) obj, (cm) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static jw0 m531() {
        if (C0073.m944() > 0) {
            return jw0.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m532(Object obj) {
        if (C0106.m1348() > 0) {
            return ((Throwable) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m533(Object obj) {
        if (C0060.m781() <= 0) {
            return ((h31) obj).k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۡ, reason: not valid java name and contains not printable characters */
    public static a4 m534() {
        if (C0092.m1194() >= 0) {
            return dp.h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۣ, reason: not valid java name and contains not printable characters */
    public static List m535(Object obj) {
        if (C0036.m473() >= 0) {
            return ((dr0) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۥ, reason: not valid java name and contains not printable characters */
    public static int m536(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣ۠۠, reason: not valid java name and contains not printable characters */
    public static String m538(Object obj) {
        if (C0105.m1343() <= 0) {
            return ((or1) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۥ, reason: not valid java name and contains not printable characters */
    public static String m539(Object obj) {
        if (C0045.m596() < 0) {
            return ((ea2) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static iq m540(Object obj) {
        if (C0154.m2006() > 0) {
            return ((br) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۧۢ, reason: contains not printable characters */
    public static String m541(String str) {
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

    /* JADX INFO: renamed from: ۣۧۤۡ, reason: not valid java name and contains not printable characters */
    public static int m542() {
        return 722 ^ C0015.f15;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m537(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
