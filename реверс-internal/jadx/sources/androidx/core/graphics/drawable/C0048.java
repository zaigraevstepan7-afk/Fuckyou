package androidx.core.graphics.drawable;

import android.support.v4.graphics.drawable.C0007;
import androidx.startup.C0072;
import androidx.versionedparcelable.C0076;
import com.google.android.material.behavior.C0088;
import com.google.android.material.bottomappbar.C0095;
import com.google.android.material.floatingactionbutton.C0117;
import com.google.android.material.focus.C0121;
import com.google.android.material.sidesheet.C0131;
import com.google.android.material.transformation.C0139;
import defpackage.a4;
import defpackage.dn1;
import defpackage.gk1;
import defpackage.ob0;
import defpackage.oi;
import defpackage.pd1;
import defpackage.r9;
import defpackage.s91;
import defpackage.wq;
import defpackage.ws1;
import defpackage.ye0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.graphics.drawable.ۨۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0048 {

    /* JADX INFO: renamed from: ۟ۥۡۤۡ, reason: not valid java name and contains not printable characters */
    public static int f48 = -864;

    /* JADX INFO: renamed from: ۟۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static int m632(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static String m633(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۡۤۥ, reason: not valid java name and contains not printable characters */
    public static ye0 m634(Object obj) {
        if (C0076.m975() < 0) {
            return ((dn1) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۦۣ, reason: not valid java name and contains not printable characters */
    public static Object m635(Object obj) {
        if (C0095.m1228() >= 0) {
            return ((oi) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m636(Object obj, int i) {
        if (C0072.m936() < 0) {
            return ((ws1) obj).e(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦۦ۟, reason: not valid java name and contains not printable characters */
    public static List m637(Object obj) {
        if (C0088.m1147() < 0) {
            return ((wq) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static int m638() {
        return 862 ^ C0117.f123;
    }

    /* JADX INFO: renamed from: ۤۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static long m640(Object obj, long j, long j2, long j3) {
        if (C0139.m1754() <= 0) {
            return pd1.q((String) obj, j, j2, j3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۨۧ۠, reason: contains not printable characters */
    public static long m641(Object obj) {
        if (C0131.m1649() < 0) {
            return ((gk1) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static InputStream m642(Object obj) {
        if (C0121.m1535() > 0) {
            return ((URLConnection) obj).getInputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۡۧ, reason: not valid java name and contains not printable characters */
    public static void m643(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0007.m100() > 0) {
            s91.q(i, (ob0) obj, (r9) obj2, (ob0) obj3, (a4) obj4);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m639(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
