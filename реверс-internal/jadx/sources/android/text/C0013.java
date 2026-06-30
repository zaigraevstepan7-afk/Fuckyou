package android.text;

import android.os.BaseBundle;
import androidx.core.app.C0042;
import androidx.core.app.C0044;
import androidx.core.widget.C0052;
import androidx.profileinstaller.C0062;
import androidx.profileinstaller.C0063;
import androidx.profileinstaller.C0064;
import androidx.startup.C0069;
import androidx.startup.C0072;
import androidx.versionedparcelable.C0077;
import com.google.android.material.bottomappbar.C0100;
import com.google.android.material.floatingactionbutton.C0116;
import com.google.android.material.snackbar.C0135;
import defpackage.aa1;
import defpackage.dn1;
import defpackage.ef1;
import defpackage.fy0;
import defpackage.gw0;
import defpackage.hd1;
import defpackage.sb0;
import defpackage.sr1;
import defpackage.ut0;
import defpackage.vd;
import defpackage.xg0;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: android.text.۟ۥۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0013 {

    /* JADX INFO: renamed from: ۢۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int f13 = 675;

    /* JADX INFO: renamed from: ۟۟ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m165(Object obj) {
        if (C0116.m1470() < 0) {
            return ef1.p((BufferedReader) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m166(Object obj, Object obj2) {
        if (C0069.m906() < 0) {
            ((hd1) obj).e((sb0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۡۥۢ, reason: not valid java name and contains not printable characters */
    public static xg0 m168(Object obj) {
        if (C0044.m586() < 0) {
            return ((aa1) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m169(Object obj) {
        if (C0135.m1701() >= 0) {
            return ((BaseBundle) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static void m170(Object obj) {
        if (C0077.m996() > 0) {
            ((Thread) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static gw0 m171() {
        if (C0052.m681() >= 0) {
            return gw0.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۨ, reason: not valid java name and contains not printable characters */
    public static String m172(Object obj) {
        if (C0042.m566() <= 0) {
            return ((sr1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۟, reason: not valid java name and contains not printable characters */
    public static String m173(String str) {
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

    /* JADX INFO: renamed from: ۣ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m174() {
        return (-589) ^ C0062.f62;
    }

    /* JADX INFO: renamed from: ۣۥۤ, reason: not valid java name and contains not printable characters */
    public static long m175(Object obj) {
        if (C0072.m936() <= 0) {
            return ((dn1) obj).h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣۣۧ, reason: contains not printable characters */
    public static InputStream m176(Object obj) {
        if (C0100.m1278() >= 0) {
            return ((Process) obj).getErrorStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤ۟, reason: contains not printable characters */
    public static StringBuilder m177(Object obj, float f) {
        if (C0062.m818() < 0) {
            return ((StringBuilder) obj).append(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۡۨ, reason: not valid java name and contains not printable characters */
    public static int m178(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m179(Object obj, Object obj2, Object obj3) {
        if (C0064.m840() > 0) {
            return ((ut0) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static fy0 m180(Object obj) {
        if (C0063.m824() >= 0) {
            return ((vd) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۡۡ, reason: not valid java name and contains not printable characters */
    public static String m167(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
