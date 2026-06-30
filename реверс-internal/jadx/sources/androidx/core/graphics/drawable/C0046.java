package androidx.core.graphics.drawable;

import android.support.v4.app.C0002;
import android.text.C0014;
import android.view.InputDevice;
import android.view.InputEvent;
import androidx.appcompat.widget.C0032;
import androidx.graphics.path.C0056;
import androidx.recyclerview.widget.C0067;
import androidx.versionedparcelable.C0074;
import androidx.versionedparcelable.C0075;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.bottomsheet.C0104;
import com.google.android.material.bottomsheet.C0106;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.search.C0128;
import defpackage.da1;
import defpackage.er0;
import defpackage.h31;
import defpackage.iq;
import defpackage.ks;
import defpackage.od1;
import defpackage.oi1;
import defpackage.rd;
import defpackage.sa0;
import defpackage.sd;
import defpackage.vq;
import defpackage.wd;
import defpackage.yq;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: androidx.core.graphics.drawable.ۣ۟ۤۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0046 {

    /* JADX INFO: renamed from: ۟ۧ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static int f46 = -926;

    /* JADX INFO: renamed from: ۟۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m602(Object obj) {
        if (C0128.m1607() <= 0) {
            return ((h31) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static InputDevice m604(Object obj) {
        if (C0074.m963() >= 0) {
            return ((InputEvent) obj).getDevice();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m605(Object obj) {
        if (C0002.m39() >= 0) {
            return ((er0) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static sd m606(Object obj) {
        if (C0075.m968() >= 0) {
            return ((rd) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m607(int i) {
        if (C0032.m419() < 0) {
            return Integer.hashCode(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m608(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static File m609(Object obj) {
        if (C0113.m1443() > 0) {
            return ((wd) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static X509Certificate[] m610(Object obj) {
        if (C0056.m738() <= 0) {
            return ((X509TrustManager) obj).getAcceptedIssuers();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static ks m611(Object obj, Object obj2, Object obj3) {
        if (C0107.m1359() < 0) {
            return ((da1) obj).o((ks) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ, reason: not valid java name and contains not printable characters */
    public static iq m612(Object obj) {
        if (C0014.m186() <= 0) {
            return ((yq) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۤۡ, reason: not valid java name and contains not printable characters */
    public static int m613(Object obj) {
        if (C0098.m1266() <= 0) {
            return ((oi1) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m614(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static sa0 m615(Object obj) {
        if (C0067.m876() >= 0) {
            return ((od1) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۧۢ, reason: not valid java name and contains not printable characters */
    public static int m616() {
        return (-9) ^ C0106.f112;
    }

    /* JADX INFO: renamed from: ۨۨۢۡ, reason: not valid java name and contains not printable characters */
    public static sa0 m617(Object obj) {
        if (C0104.m1332() > 0) {
            return ((vq) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static String m603(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
