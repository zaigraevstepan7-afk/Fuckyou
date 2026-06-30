package androidx.recyclerview.widget;

import android.graphics.Path;
import android.support.v4.app.C0003;
import android.text.C0016;
import androidx.appcompat.widget.C0033;
import androidx.core.app.C0038;
import androidx.core.graphics.drawable.C0049;
import androidx.window.reflection.C0082;
import com.google.android.material.carousel.C0108;
import com.google.android.material.focus.C0122;
import com.google.android.material.search.C0124;
import com.google.android.material.snackbar.C0137;
import com.reddit.frontpage.C0149;
import defpackage.bc1;
import defpackage.ct1;
import defpackage.dr0;
import defpackage.ea2;
import defpackage.gr0;
import defpackage.jr1;
import defpackage.lr0;
import defpackage.lt;
import defpackage.nu0;
import defpackage.oc;
import defpackage.rd;
import defpackage.vt;
import defpackage.w6;
import defpackage.wa0;
import defpackage.wq;
import defpackage.yt;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۧۥۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0067 {

    /* JADX INFO: renamed from: ۣ۟۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static int f67 = 872;

    /* JADX INFO: renamed from: ۣ۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m869(Object obj) {
        if (m876() >= 0) {
            return ((oc) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static String m870(Object obj) {
        if (C0149.m1865() < 0) {
            return ((wq) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static int m871(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۧۨ۟, reason: not valid java name and contains not printable characters */
    public static String m872(Object obj) {
        if (C0124.m1574() >= 0) {
            return ((dr0) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static CharSequence m874(Object obj) {
        if (C0049.m645() > 0) {
            return ct1.X((CharSequence) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠۟, reason: not valid java name and contains not printable characters */
    public static String m875(Object obj) {
        if (C0082.m1058() <= 0) {
            return ((ea2) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡ۠, reason: not valid java name and contains not printable characters */
    public static int m876() {
        return 328 ^ C0038.f38;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static List m877(Object obj) {
        if (C0003.m50() > 0) {
            return ((rd) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static String m878(String str) {
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

    /* JADX INFO: renamed from: ۢۥۧۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m879(Object obj, int i) {
        if (C0033.m436() > 0) {
            return Arrays.copyOf((byte[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۠, reason: not valid java name and contains not printable characters */
    public static bc1 m880(Object obj) {
        if (C0122.m1542() < 0) {
            return ((lr0) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static URLConnection m881(Object obj) {
        if (C0124.m1574() > 0) {
            return ((URL) obj).openConnection();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢ۠, reason: not valid java name and contains not printable characters */
    public static Path m882(Object obj) {
        if (C0108.m1373() < 0) {
            return ((w6) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static jr1 m883(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        if (C0137.m1727() < 0) {
            return nu0.A((vt) obj, (lt) obj2, (yt) obj3, (wa0) obj4, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۤ۠, reason: contains not printable characters */
    public static boolean m884(Object obj) {
        if (C0016.m218() < 0) {
            return ((gr0) obj).l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m873(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
