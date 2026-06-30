package androidx.graphics.path;

import android.media.MediaPlayer;
import android.support.v4.graphics.drawable.C0008;
import android.view.View;
import androidx.core.graphics.drawable.C0045;
import androidx.startup.C0073;
import androidx.window.area.reflectionguard.C0078;
import com.google.android.material.appbar.C0085;
import com.google.android.material.behavior.C0088;
import com.google.android.material.behavior.C0092;
import com.google.android.material.bottomsheet.C0102;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.search.C0125;
import com.google.android.material.transformation.C0141;
import defpackage.C0154;
import defpackage.d02;
import defpackage.f32;
import defpackage.ha0;
import defpackage.ho1;
import defpackage.im1;
import defpackage.je0;
import defpackage.ks;
import defpackage.lt0;
import defpackage.ns1;
import defpackage.qc1;
import defpackage.qq;
import defpackage.rc;
import defpackage.uo1;
import defpackage.vh1;
import defpackage.xk;
import defpackage.ye0;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: androidx.graphics.path.ۧ۠ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0056 {

    /* JADX INFO: renamed from: ۟۠ۨۨ۟, reason: not valid java name and contains not printable characters */
    public static int f56 = 408;

    /* JADX INFO: renamed from: ۟۠ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static long m727(double d) {
        if (C0102.m1309() >= 0) {
            return Math.round(d);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m728(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۨ, reason: not valid java name and contains not printable characters */
    public static uo1 m729() {
        if (C0125.m1584() < 0) {
            return uo1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡۥ, reason: not valid java name and contains not printable characters */
    public static ha0 m730(Object obj) {
        if (C0055.m723() > 0) {
            return ((lt0) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۥ, reason: not valid java name and contains not printable characters */
    public static String m731(Object obj) {
        if (C0008.m116() >= 0) {
            return ((je0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۣ, reason: not valid java name and contains not printable characters */
    public static im1 m732(Object obj) {
        if (C0107.m1359() <= 0) {
            return ((ho1) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m733(Object obj) {
        if (C0141.m1778() <= 0) {
            ((MediaPlayer) obj).prepareAsync();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۦۢ, reason: not valid java name and contains not printable characters */
    public static int m734(Object obj) {
        if (C0154.m2006() >= 0) {
            return ((HttpURLConnection) obj).getResponseCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۨ, reason: not valid java name and contains not printable characters */
    public static d02 m735(Object obj) {
        if (C0045.m596() <= 0) {
            return ((f32) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۥ۟, reason: not valid java name and contains not printable characters */
    public static ns1 m736(Object obj) {
        if (C0078.m998() < 0) {
            return ((rc) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static ks m737(Object obj, Object obj2, Object obj3) {
        if (C0112.m1424() < 0) {
            return ((qq) obj).o((ks) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۢۡ, reason: not valid java name and contains not printable characters */
    public static int m738() {
        return (-490) ^ C0088.f94;
    }

    /* JADX INFO: renamed from: ۤۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static vh1 m739(Object obj) {
        if (C0085.m1094() >= 0) {
            return qc1.n((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m740(Object obj, Object obj2) {
        if (C0092.m1194() > 0) {
            ((MediaPlayer) obj).setOnPreparedListener((MediaPlayer.OnPreparedListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۤۢۨ, reason: not valid java name and contains not printable characters */
    public static String m742(String str) {
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

    /* JADX INFO: renamed from: ۨ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static ye0 m743() {
        if (C0073.m944() > 0) {
            return xk.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۤۥ, reason: not valid java name and contains not printable characters */
    public static String m741(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
