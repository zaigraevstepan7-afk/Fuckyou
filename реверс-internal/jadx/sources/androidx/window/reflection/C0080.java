package androidx.window.reflection;

import android.text.C0010;
import android.text.C0013;
import androidx.appcompat.widget.C0030;
import androidx.core.app.C0037;
import androidx.core.widget.C0052;
import com.google.android.material.bottomsheet.C0105;
import com.reddit.frontpage.C0149;
import defpackage.dr;
import defpackage.fy0;
import defpackage.ga2;
import defpackage.lr0;
import defpackage.xg0;
import defpackage.y41;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.window.reflection.ۣ۟ۡۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0080 {

    /* JADX INFO: renamed from: ۥۣۢۥ, reason: contains not printable characters */
    public static int f80 = -452;

    /* JADX INFO: renamed from: ۟۟ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static int m1027(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static xg0 m1028(Object obj) {
        if (C0105.m1343() <= 0) {
            return ((lr0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static String m1029(Object obj) {
        if (C0149.m1865() < 0) {
            return ((ga2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static JSONObject m1030(Object obj, Object obj2, long j) {
        if (C0052.m681() >= 0) {
            return ((JSONObject) obj).put((String) obj2, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦ, reason: not valid java name and contains not printable characters */
    public static String m1031(String str) {
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

    /* JADX INFO: renamed from: ۟ۦ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m1032(Object obj, Object obj2) {
        if (C0052.m681() >= 0) {
            return URLEncoder.encode((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1033() {
        return (-64) ^ C0030.f30;
    }

    /* JADX INFO: renamed from: ۠۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static fy0 m1034(Object obj) {
        if (C0037.m496() <= 0) {
            return ((dr) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static void m1035(Object obj, float f, float f2) {
        if (C0010.m137() <= 0) {
            ((y41) obj).x(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۣۨ۟, reason: not valid java name and contains not printable characters */
    public static String m1037(Object obj) {
        if (C0013.m174() <= 0) {
            return obj.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۤ, reason: not valid java name and contains not printable characters */
    public static String m1036(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
