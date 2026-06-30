package androidx.core.app;

import android.app.C0000;
import android.support.v4.graphics.drawable.C0008;
import android.text.C0015;
import androidx.appcompat.widget.C0033;
import androidx.core.widget.C0050;
import androidx.graphics.path.C0054;
import androidx.versionedparcelable.C0074;
import com.google.android.material.behavior.C0088;
import defpackage.ac0;
import defpackage.az1;
import defpackage.bc0;
import defpackage.cd0;
import defpackage.dy;
import defpackage.ha0;
import defpackage.jo;
import defpackage.nl1;
import defpackage.ob0;
import defpackage.ql0;
import defpackage.ry1;
import defpackage.t2;
import defpackage.tv0;
import defpackage.u42;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: androidx.core.app.۟ۦۥۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0038 {

    /* JADX INFO: renamed from: ۥۥۥۢ, reason: contains not printable characters */
    public static int f38 = 428;

    /* JADX INFO: renamed from: ۣ۟۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m501(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        if (C0033.m436() > 0) {
            t2.a((ha0) obj, (tv0) obj2, (dy) obj3, (jo) obj4, (ob0) obj5, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static nl1 m502(Object obj) {
        if (C0054.m711() >= 0) {
            return ((ql0) obj).w();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static void m503(Object obj) throws IOException {
        if (C0088.m1147() <= 0) {
            ((Closeable) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۧ, reason: not valid java name and contains not printable characters */
    public static u42 m504() {
        if (C0000.m0() < 0) {
            return u42.g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static ac0 m505(Object obj) {
        if (C0074.m963() > 0) {
            return ((bc0) obj).s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۨۡ, reason: not valid java name and contains not printable characters */
    public static cd0 m506() {
        if (C0050.m661() >= 0) {
            return cd0.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠۟, reason: not valid java name and contains not printable characters */
    public static int m507(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۤۧۨ, reason: not valid java name and contains not printable characters */
    public static String m508(String str) {
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

    /* JADX INFO: renamed from: ۨ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m509() {
        return (-881) ^ C0015.f15;
    }

    /* JADX INFO: renamed from: ۨۥۢ۠, reason: not valid java name and contains not printable characters */
    public static az1 m511(Object obj) {
        if (C0008.m116() > 0) {
            return ((ry1) obj).n();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۧۦ, reason: not valid java name and contains not printable characters */
    public static String m510(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
