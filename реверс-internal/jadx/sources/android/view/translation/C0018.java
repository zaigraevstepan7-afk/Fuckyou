package android.view.translation;

import android.text.C0012;
import android.view.C0025;
import androidx.compose.ui.input.pointer.C0035;
import androidx.compose.ui.input.pointer.C0036;
import androidx.core.graphics.drawable.C0049;
import androidx.startup.C0070;
import com.google.android.material.focus.C0119;
import com.reddit.frontpage.C0151;
import defpackage.ft0;
import defpackage.gq;
import defpackage.ns1;
import defpackage.ob0;
import defpackage.q52;
import defpackage.qc;
import defpackage.s22;
import defpackage.y41;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;

/* JADX INFO: renamed from: android.view.translation.ۥۣ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0018 {

    /* JADX INFO: renamed from: ۣۨۢ۠, reason: not valid java name and contains not printable characters */
    public static int f18 = 886;

    /* JADX INFO: renamed from: ۟۠ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static int m235(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۥۡۦ, reason: not valid java name and contains not printable characters */
    public static int m236(Object obj) {
        if (C0119.m1511() > 0) {
            return ((gq) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static q52 m237(Object obj) {
        if (C0070.m915() < 0) {
            return ((ft0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static ns1 m238(Object obj) {
        if (C0025.m340() >= 0) {
            return ((qc) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m239(Object obj) {
        if (C0049.m645() >= 0) {
            ((y41) obj).m();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static String m240(String str) {
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

    /* JADX INFO: renamed from: ۟ۦ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static int m241() {
        return 831 ^ C0012.f12;
    }

    /* JADX INFO: renamed from: ۢۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m242(Object obj, long j) throws InterruptedException {
        if (C0035.m461() > 0) {
            ((Thread) obj).join(j);
        }
    }

    /* JADX INFO: renamed from: ۤۢۢۤ, reason: not valid java name and contains not printable characters */
    public static String m244(Object obj, Object obj2) {
        if (C0036.m473() >= 0) {
            return ((URLConnection) obj).getHeaderField((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m245(Object obj, int i) {
        if (C0151.m1894() > 0) {
            s22.e((ob0) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۢۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m243(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
