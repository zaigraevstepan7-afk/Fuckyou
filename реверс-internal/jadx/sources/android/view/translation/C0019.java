package android.view.translation;

import android.view.C0024;
import androidx.core.widget.C0052;
import com.google.android.material.behavior.C0088;
import com.google.android.material.focus.C0120;
import com.google.android.material.focus.C0122;
import com.google.android.material.search.C0128;
import com.reddit.frontpage.C0149;
import defpackage.fx1;
import defpackage.l91;
import defpackage.ls;
import defpackage.ob0;
import defpackage.or1;
import defpackage.xg0;
import defpackage.yp1;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: android.view.translation.ۦۧۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0019 {

    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f19 = -243;

    /* JADX INFO: renamed from: ۟۟ۥۤۤ, reason: not valid java name and contains not printable characters */
    public static JSONObject m246(Object obj, Object obj2, Object obj3) {
        if (C0128.m1607() <= 0) {
            return ((JSONObject) obj).put((String) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m247(Object obj) {
        if (C0024.m321() >= 0) {
            return ((or1) obj).getTitle();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static String m248(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۨۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m250(Object obj) {
        if (C0120.m1522() >= 0) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int m251() {
        return 48 ^ C0088.f94;
    }

    /* JADX INFO: renamed from: ۥۥۡۦ, reason: contains not printable characters */
    public static yp1 m252(Object obj, long j) {
        if (C0122.m1542() < 0) {
            return ((yp1) obj).f(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥ, reason: not valid java name and contains not printable characters */
    public static fx1 m253(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Object obj, int i) {
        if (C0149.m1865() < 0) {
            return l91.l(j, j2, j3, j4, j5, j6, j7, j8, (ob0) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۨۧ, reason: not valid java name and contains not printable characters */
    public static int m254(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۤۦۦ, reason: not valid java name and contains not printable characters */
    public static Object m255(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0052.m681() > 0) {
            return xg0.j((xg0) obj, (String) obj2, (String) obj3, (ls) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۡۦ, reason: not valid java name and contains not printable characters */
    public static String m249(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
