package androidx.versionedparcelable;

import android.view.C0021;
import androidx.core.app.C0044;
import androidx.graphics.path.C0055;
import androidx.lifecycle.C0060;
import com.google.android.material.behavior.C0088;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.floatingactionbutton.C0117;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0142;
import defpackage.cm;
import defpackage.dr;
import defpackage.f6;
import defpackage.g6;
import defpackage.hk;
import defpackage.i31;
import defpackage.jn0;
import defpackage.ob0;
import defpackage.op;
import defpackage.r;
import defpackage.s91;
import defpackage.tv0;
import defpackage.wr;
import defpackage.xi0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: androidx.versionedparcelable.ۣۣ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0076 {

    /* JADX INFO: renamed from: ۟ۦۣۦۨ, reason: not valid java name and contains not printable characters */
    public static int f76 = -366;

    /* JADX INFO: renamed from: ۟۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m974(Object obj) {
        if (C0117.m1475() > 0) {
            return ((i31) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۡۦۡ, reason: not valid java name and contains not printable characters */
    public static int m975() {
        return (-13) ^ C0098.f104;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static g6 m976(Object obj) {
        if (C0142.m1788() >= 0) {
            return ((jn0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۧۤ, reason: not valid java name and contains not printable characters */
    public static cm m977() {
        if (C0044.m586() < 0) {
            return xi0.E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static void m978(Object obj, Object obj2) {
        if (C0138.m1738() > 0) {
            ((r) obj).setParentCompositionContext((op) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۦۢ۠, reason: not valid java name and contains not printable characters */
    public static void m979(Object obj) throws IOException {
        if (C0055.m723() > 0) {
            ((InputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۢۧۨ۟, reason: not valid java name and contains not printable characters */
    public static void m980(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0060.m781() < 0) {
            hk.c((f6) obj, (tv0) obj2, (wr) obj3, (ob0) obj4);
        }
    }

    /* JADX INFO: renamed from: ۣۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m981(int i, int i2, int i3) {
        if (C0021.m285() <= 0) {
            return s91.b(i, i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۡۥ۠, reason: not valid java name and contains not printable characters */
    public static int m982(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public static String m983(String str) {
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

    /* JADX INFO: renamed from: ۦۡۥ۠, reason: contains not printable characters */
    public static List m984(Object obj) {
        if (C0088.m1147() <= 0) {
            return ((dr) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m985(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
