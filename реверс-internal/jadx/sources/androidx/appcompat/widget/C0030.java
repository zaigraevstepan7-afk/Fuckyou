package androidx.appcompat.widget;

import android.text.C0010;
import android.view.C0027;
import androidx.appcompat.app.C0029;
import androidx.core.app.C0038;
import androidx.core.widget.C0051;
import androidx.profileinstaller.C0062;
import com.google.android.material.appbar.C0087;
import com.google.android.material.focus.C0122;
import com.google.android.material.transformation.C0142;
import defpackage.C0154;
import defpackage.C0157;
import defpackage.bm;
import defpackage.bn;
import defpackage.dd;
import defpackage.f20;
import defpackage.gk1;
import defpackage.l32;
import defpackage.ob0;
import defpackage.sf;
import defpackage.v20;
import defpackage.vm;
import defpackage.xl;
import defpackage.zm;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;
import java.util.Collection;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۣ۟ۢۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0030 {

    /* JADX INFO: renamed from: ۟ۥۡۤۧ, reason: not valid java name and contains not printable characters */
    public static int f30 = 398;

    /* JADX INFO: renamed from: ۟۠۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m390(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۨۧۢ, reason: not valid java name and contains not printable characters */
    public static long m391(Object obj) {
        if (C0142.m1788() > 0) {
            return ((bm) obj).o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static long m392(Object obj) {
        if (C0087.m1123() <= 0) {
            return ((bm) obj).s;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static v20 m393() {
        if (C0154.m2006() > 0) {
            return v20.z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static long m394() {
        if (C0010.m137() < 0) {
            return xl.i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۨ, reason: not valid java name and contains not printable characters */
    public static long m395(Object obj) {
        if (C0051.m670() > 0) {
            return ((gk1) obj).f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟, reason: not valid java name and contains not printable characters */
    public static f20 m396(Object obj) {
        if (C0029.m384() > 0) {
            return ((vm) obj).m();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۣ, reason: not valid java name and contains not printable characters */
    public static int m397() {
        return 865 ^ C0122.f128;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m398(Object obj) {
        if (C0062.m818() < 0) {
            return ((Collection) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۠۠, reason: not valid java name and contains not printable characters */
    public static void m399(Object obj, Object obj2, Object obj3) {
        if (C0038.m509() > 0) {
            ((URLConnection) obj).setRequestProperty((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۦۧۥ, reason: contains not printable characters */
    public static String m401(Object obj) {
        if (C0157.m2038() > 0) {
            return ((l32) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۤ۟, reason: not valid java name and contains not printable characters */
    public static int m402(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static bn m403(Object obj, Object obj2, Object obj3, int i) {
        if (C0027.m365() < 0) {
            return zm.a((dd) obj, (sf) obj2, (ob0) obj3, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m400(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
