package androidx.profileinstaller;

import android.app.C0000;
import android.media.MediaPlayer;
import android.support.v4.app.C0005;
import android.text.C0012;
import androidx.compose.ui.input.pointer.C0036;
import androidx.recyclerview.widget.C0067;
import androidx.startup.C0072;
import androidx.versionedparcelable.C0076;
import androidx.versionedparcelable.C0077;
import com.google.android.material.floatingactionbutton.C0117;
import defpackage.cd1;
import defpackage.cm;
import defpackage.dr0;
import defpackage.ha0;
import defpackage.lr0;
import defpackage.rd;
import defpackage.uq;
import defpackage.v80;
import defpackage.xi0;
import defpackage.xq0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.profileinstaller.ۣۣۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0064 {

    /* JADX INFO: renamed from: ۣۡۧ۠, reason: not valid java name and contains not printable characters */
    public static int f64 = -160;

    /* JADX INFO: renamed from: ۟۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m831(Object obj, Object obj2) {
        if (C0067.m876() > 0) {
            ((MediaPlayer) obj).setOnErrorListener((MediaPlayer.OnErrorListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static float m832(Object obj) {
        if (C0072.m936() <= 0) {
            return ((xq0) obj).b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡۤۤ۟, reason: not valid java name and contains not printable characters */
    public static String m834(String str) {
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

    /* JADX INFO: renamed from: ۣ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static cd1 m835(Object obj) {
        if (C0005.m75() > 0) {
            return ((dr0) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۡ, reason: not valid java name and contains not printable characters */
    public static int m836(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۦۤ, reason: not valid java name and contains not printable characters */
    public static MediaPlayer m837(Object obj) {
        if (C0077.m996() > 0) {
            return ((lr0) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۢ۟, reason: not valid java name and contains not printable characters */
    public static cm m838() {
        if (C0076.m975() < 0) {
            return xi0.L;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m839(Object obj) {
        if (C0000.m0() < 0) {
            return ((v80) obj).a();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۨۥ۠, reason: contains not printable characters */
    public static int m840() {
        return 406 ^ C0117.f123;
    }

    /* JADX INFO: renamed from: ۦۧ۟, reason: contains not printable characters */
    public static rd m841(Object obj) {
        if (C0012.m162() > 0) {
            return lr0.g((lr0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤۦ, reason: not valid java name and contains not printable characters */
    public static ha0 m842(Object obj) {
        if (C0036.m473() > 0) {
            return ((uq) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m833(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
