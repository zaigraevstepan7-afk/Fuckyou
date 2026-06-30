package androidx.graphics.path;

import android.view.C0026;
import androidx.core.widget.C0051;
import androidx.startup.C0073;
import com.google.android.material.behavior.C0093;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.floatingactionbutton.C0117;
import com.google.android.material.sidesheet.C0133;
import com.google.android.material.transformation.C0143;
import defpackage.C0156;
import defpackage.aq0;
import defpackage.cr0;
import defpackage.dr0;
import defpackage.i22;
import defpackage.pd1;
import defpackage.s91;
import defpackage.sv0;
import defpackage.wa0;
import defpackage.wq;
import defpackage.xl;
import defpackage.xq0;
import java.io.ByteArrayOutputStream;
import java.util.Collection;

/* JADX INFO: renamed from: androidx.graphics.path.ۣۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0057 {

    /* JADX INFO: renamed from: ۣ۟ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static int f57 = 339;

    /* JADX INFO: renamed from: ۟۟۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static long m744() {
        if (C0143.m1796() > 0) {
            return xl.l;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m745(Object obj) {
        if (C0117.m1475() >= 0) {
            return ((dr0) obj).k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۥ, reason: not valid java name and contains not printable characters */
    public static i22 m746(Object obj, Object obj2) {
        if (C0026.m355() > 0) {
            return pd1.m((sv0) obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static int m747(Object obj) {
        if (C0073.m944() > 0) {
            return ((aq0) obj).a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m749() {
        return 424 ^ C0098.f104;
    }

    /* JADX INFO: renamed from: ۢ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m750(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static xq0 m751(Object obj) {
        if (C0156.m2031() >= 0) {
            return ((cr0) obj).t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۦۦ, reason: contains not printable characters */
    public static String m752(String str) {
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

    /* JADX INFO: renamed from: ۦۥ۠ۦ, reason: contains not printable characters */
    public static boolean m753(Object obj) {
        if (C0133.m1681() > 0) {
            return ((Collection) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m754(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0051.m670() >= 0) {
            return s91.o((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۥۢ, reason: not valid java name and contains not printable characters */
    public static wa0 m755(Object obj) {
        if (C0093.m1203() >= 0) {
            return ((wq) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m748(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
