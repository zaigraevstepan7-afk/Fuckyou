package androidx.core.app;

import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0008;
import android.text.C0010;
import android.view.ViewGroup;
import androidx.graphics.path.C0055;
import androidx.recyclerview.widget.C0065;
import androidx.recyclerview.widget.C0066;
import com.google.android.material.appbar.C0087;
import com.google.android.material.behavior.C0089;
import com.google.android.material.search.C0124;
import com.google.android.material.search.C0126;
import com.google.android.material.snackbar.C0135;
import com.google.android.material.transformation.C0143;
import com.reddit.frontpage.C0150;
import defpackage.C0154;
import defpackage.ct1;
import defpackage.dr;
import defpackage.jj;
import defpackage.jq;
import defpackage.ko1;
import defpackage.lr0;
import defpackage.lt0;
import defpackage.ms1;
import defpackage.qs1;
import defpackage.rd;
import defpackage.sa0;
import defpackage.tv0;
import defpackage.w01;
import defpackage.xq;
import defpackage.yq0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.app.۠ۤۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0039 {

    /* JADX INFO: renamed from: ۥ۠ۨۥ, reason: contains not printable characters */
    public static int f39 = 253;

    /* JADX INFO: renamed from: ۟۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static qs1 m512(Object obj) {
        if (C0055.m723() > 0) {
            return ((lr0) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static List m513(Object obj) {
        if (C0065.m853() < 0) {
            return ((jq) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m514(Object obj) {
        if (C0135.m1701() >= 0) {
            return ct1.P((CharSequence) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m515(Object obj) {
        if (C0004.m65() >= 0) {
            return ((ms1) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۥۡ, reason: not valid java name and contains not printable characters */
    public static int m516() {
        return (-895) ^ C0089.f95;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static String m517(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static rd m518(Object obj) {
        if (C0143.m1796() > 0) {
            return ((xq) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۢ۟, reason: not valid java name and contains not printable characters */
    public static int m519(Object obj) {
        if (C0055.m723() >= 0) {
            return ((yq0) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۧۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m521(Object obj, int i) {
        if (C0066.m857() > 0) {
            return ((List) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static sa0 m522(Object obj) {
        if (C0150.m1876() >= 0) {
            return ((lt0) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m523(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۡۤ, reason: not valid java name and contains not printable characters */
    public static int m524(Object obj) {
        if (C0154.m2006() >= 0) {
            return ((ViewGroup) obj).getChildCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static tv0 m525(Object obj, float f) {
        if (C0124.m1574() >= 0) {
            return ko1.b((tv0) obj, f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۢۡ, reason: contains not printable characters */
    public static sa0 m526(Object obj) {
        if (C0087.m1123() <= 0) {
            return ((dr) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۦ, reason: contains not printable characters */
    public static long m527(long j, long j2) {
        if (C0010.m137() <= 0) {
            return w01.e(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣۨۡ, reason: contains not printable characters */
    public static OutputStream m528(Object obj) {
        if (C0126.m1590() > 0) {
            return ((Process) obj).getOutputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۥۤ, reason: not valid java name and contains not printable characters */
    public static int m529(Object obj) {
        if (C0008.m116() > 0) {
            return ((jj) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟, reason: not valid java name and contains not printable characters */
    public static String m520(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
