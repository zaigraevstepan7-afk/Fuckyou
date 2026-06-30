package android.view;

import android.text.C0016;
import androidx.appcompat.app.C0029;
import androidx.core.app.C0038;
import androidx.core.graphics.drawable.C0045;
import androidx.core.graphics.drawable.C0048;
import androidx.lifecycle.C0060;
import androidx.window.area.reflectionguard.C0078;
import com.google.android.material.bottomappbar.C0096;
import com.google.android.material.bottomappbar.C0100;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.sidesheet.C0129;
import com.reddit.frontpage.C0150;
import defpackage.C0152;
import defpackage.aa1;
import defpackage.cm;
import defpackage.dc1;
import defpackage.f32;
import defpackage.i31;
import defpackage.j02;
import defpackage.rz;
import defpackage.sv0;
import defpackage.t22;
import defpackage.ud;
import defpackage.ut0;
import defpackage.xi0;
import defpackage.xz0;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: android.view.۟ۢۦۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0021 {

    /* JADX INFO: renamed from: ۣ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int f21 = -405;

    /* JADX INFO: renamed from: ۟ۢ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m272(Object obj) {
        if (C0129.m1627() < 0) {
            return ((i31) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۤ۠, reason: not valid java name and contains not printable characters */
    public static int m273(Object obj) {
        if (C0113.m1443() >= 0) {
            return ((aa1) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤۡ, reason: not valid java name and contains not printable characters */
    public static int m274(Object obj) {
        if (C0152.m1979() >= 0) {
            return ((ut0) obj).m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡۡۤ, reason: not valid java name and contains not printable characters */
    public static HttpURLConnection m275(Object obj) {
        if (C0045.m596() < 0) {
            return ((rz) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m276(Object obj) {
        if (C0060.m781() < 0) {
            return ((ud) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۥ, reason: not valid java name and contains not printable characters */
    public static String m277(String str) {
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

    /* JADX INFO: renamed from: ۠۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m278(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static sv0 m279(Object obj) {
        if (C0078.m998() <= 0) {
            return ((xz0) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۤۦ, reason: not valid java name and contains not printable characters */
    public static f32 m281() {
        if (C0100.m1278() >= 0) {
            return t22.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۡۢ, reason: not valid java name and contains not printable characters */
    public static cm m282() {
        if (C0016.m218() <= 0) {
            return xi0.O;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۦۤ, reason: not valid java name and contains not printable characters */
    public static String m283(Object obj) {
        if (C0038.m509() > 0) {
            return String.valueOf(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static void m284(Object obj) {
        if (C0150.m1876() > 0) {
            ((dc1) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۥۢ, reason: contains not printable characters */
    public static int m285() {
        return 566 ^ C0029.f29;
    }

    /* JADX INFO: renamed from: ۦۤۧۤ, reason: contains not printable characters */
    public static boolean m286(Object obj) {
        if (C0096.m1232() > 0) {
            return ((sv0) obj).r;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۧۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m287(Object obj) {
        if (C0048.m638() > 0) {
            return ((j02) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m280(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
