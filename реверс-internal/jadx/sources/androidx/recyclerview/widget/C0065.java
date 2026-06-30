package androidx.recyclerview.widget;

import android.app.C0001;
import android.text.C0012;
import android.view.C0026;
import androidx.core.graphics.drawable.C0045;
import androidx.lifecycle.C0059;
import androidx.versionedparcelable.C0074;
import com.google.android.material.behavior.C0089;
import com.google.android.material.bottomappbar.C0096;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.sidesheet.C0130;
import com.google.android.material.snackbar.C0136;
import defpackage.al0;
import defpackage.bm;
import defpackage.cm;
import defpackage.fw;
import defpackage.h31;
import defpackage.nb1;
import defpackage.ob0;
import defpackage.qq;
import defpackage.qz;
import defpackage.rz;
import defpackage.s91;
import defpackage.sf;
import defpackage.xi0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.recyclerview.widget.۟ۡ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0065 {

    /* JADX INFO: renamed from: ۟۠ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static int f65 = 454;

    /* JADX INFO: renamed from: ۟۟ۦۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m843(Object obj, Object obj2) {
        if (C0112.m1424() <= 0) {
            return ((qq) obj).q(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static Object m844(Object obj, Object obj2) {
        if (C0045.m596() < 0) {
            return ((ob0) obj).j((nb1) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m845(Object obj) {
        if (C0089.m1150() > 0) {
            return ((h31) obj).g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢۥ۠, reason: not valid java name and contains not printable characters */
    public static fw m846() {
        if (C0026.m355() >= 0) {
            return fw.g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۢ, reason: not valid java name and contains not printable characters */
    public static int m847(Object obj, int i, int i2, Object obj2) {
        if (C0136.m1712() <= 0) {
            return ((sf) obj).a(i, i2, (al0) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m848(int i, Object obj, Object obj2) {
        if (C0059.m769() > 0) {
            return s91.h(i, (String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m849(Object obj, Object obj2) {
        if (C0012.m162() >= 0) {
            return ((qz) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static cm m850() {
        if (C0001.m16() < 0) {
            return xi0.Z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۥۡ, reason: not valid java name and contains not printable characters */
    public static int m852(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤۧۤ, reason: not valid java name and contains not printable characters */
    public static int m853() {
        return (-895) ^ C0130.f136;
    }

    /* JADX INFO: renamed from: ۤۨۢۢ, reason: not valid java name and contains not printable characters */
    public static long m854(Object obj) {
        if (C0074.m963() > 0) {
            return ((bm) obj).m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۨۡۧ, reason: not valid java name and contains not printable characters */
    public static int m855(Object obj) {
        if (C0096.m1232() >= 0) {
            return ((rz) obj).r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static String m856(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۢۤۨۥ, reason: not valid java name and contains not printable characters */
    public static String m851(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
