package defpackage;

import android.support.v4.app.C0005;
import android.support.v4.graphics.drawable.C0009;
import androidx.compose.ui.input.pointer.C0036;
import androidx.core.graphics.drawable.C0049;
import androidx.window.reflection.C0083;
import com.google.android.material.floatingactionbutton.C0115;
import com.reddit.frontpage.C0148;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۟ۢۤۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0152 {

    /* JADX INFO: renamed from: ۟ۢ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int f229 = 627;

    /* JADX INFO: renamed from: ۟۟۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static long m1977(Object obj) {
        if (C0049.m645() >= 0) {
            return ((w01) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static long m1978() {
        if (C0115.m1456() >= 0) {
            return xl.j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static int m1979() {
        return 617 ^ C0083.f83;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static iq m1981(Object obj) {
        if (C0005.m75() > 0) {
            return ((xq) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۢۨ, reason: not valid java name and contains not printable characters */
    public static String m1982(Object obj) {
        if (C0148.m1860() >= 0) {
            return ((JSONObject) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static String m1983(Object obj) {
        if (C0009.m122() >= 0) {
            return v20.i((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۢ, reason: not valid java name and contains not printable characters */
    public static String m1984(String str) {
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

    /* JADX INFO: renamed from: ۣۣۢۨ, reason: not valid java name and contains not printable characters */
    public static int m1985(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Charset m1986() {
        if (C0036.m473() > 0) {
            return StandardCharsets.US_ASCII;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۥۥ, reason: not valid java name and contains not printable characters */
    public static String m1980(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
