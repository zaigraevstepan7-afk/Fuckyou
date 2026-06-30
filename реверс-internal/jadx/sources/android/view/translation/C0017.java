package android.view.translation;

import android.support.v4.app.C0004;
import android.view.KeyEvent;
import androidx.appcompat.widget.C0033;
import androidx.recyclerview.widget.C0067;
import androidx.startup.C0070;
import androidx.startup.C0071;
import com.google.android.material.behavior.C0088;
import com.google.android.material.behavior.C0090;
import com.google.android.material.sidesheet.C0131;
import com.google.android.material.sidesheet.C0133;
import defpackage.C0156;
import defpackage.af1;
import defpackage.ar0;
import defpackage.bm;
import defpackage.cm;
import defpackage.dr;
import defpackage.jo;
import defpackage.k72;
import defpackage.lr0;
import defpackage.ob0;
import defpackage.oc;
import defpackage.pd0;
import defpackage.qs1;
import defpackage.tv0;
import defpackage.u2;
import defpackage.wa0;
import defpackage.wi0;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: android.view.translation.ۣۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0017 {

    /* JADX INFO: renamed from: ۡ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static int f17 = -913;

    /* JADX INFO: renamed from: ۟۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static oc m221(Object obj) {
        if (C0090.m1175() < 0) {
            return ((ar0) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۧ۠, reason: not valid java name and contains not printable characters */
    public static void m222(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, long j, long j2, Object obj6, Object obj7, Object obj8, int i2) {
        if (C0070.m915() < 0) {
            af1.b((tv0) obj, (wa0) obj2, (wa0) obj3, (wa0) obj4, (wa0) obj5, i, j, j2, (k72) obj6, (jo) obj7, (ob0) obj8, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۦ, reason: not valid java name and contains not printable characters */
    public static Object m223(Object obj) {
        if (C0033.m436() >= 0) {
            return ((AtomicReference) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۢ, reason: not valid java name and contains not printable characters */
    public static int m224(Object obj) {
        if (C0156.m2031() > 0) {
            return ((KeyEvent) obj).getSource();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۤۦ۟, reason: not valid java name and contains not printable characters */
    public static String m226(Object obj) {
        if (C0088.m1147() < 0) {
            return ((u2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۨ۟, reason: not valid java name and contains not printable characters */
    public static List m227(Object obj) {
        if (C0004.m65() > 0) {
            return ((dr) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static cm m228() {
        if (C0067.m876() >= 0) {
            return wi0.u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static int m229() {
        return 89 ^ C0131.f137;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static long m230(Object obj) {
        if (C0071.m922() <= 0) {
            return ((bm) obj).Q;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۦۦ۟, reason: contains not printable characters */
    public static int m231(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static qs1 m232(Object obj) {
        if (C0133.m1681() > 0) {
            return ((lr0) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۤۡ, reason: not valid java name and contains not printable characters */
    public static long m233(Object obj) {
        if (C0033.m436() > 0) {
            return ((pd0) obj).e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۢۨ۠, reason: not valid java name and contains not printable characters */
    public static String m234(String str) {
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

    /* JADX INFO: renamed from: ۟ۥ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m225(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
