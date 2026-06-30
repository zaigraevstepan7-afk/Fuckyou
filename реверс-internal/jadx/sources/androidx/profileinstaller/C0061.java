package androidx.profileinstaller;

import android.support.v4.app.C0002;
import android.support.v4.app.C0005;
import android.text.C0010;
import android.view.textclassifier.TextClassification;
import androidx.appcompat.widget.C0033;
import androidx.core.app.C0038;
import androidx.lifecycle.C0059;
import com.google.android.material.behavior.C0089;
import com.google.android.material.behavior.C0093;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.carousel.C0111;
import com.google.android.material.sidesheet.C0133;
import defpackage.ag1;
import defpackage.aq0;
import defpackage.l32;
import defpackage.mv1;
import defpackage.ob0;
import defpackage.oq;
import defpackage.oz;
import defpackage.ph;
import defpackage.qq1;
import defpackage.sv0;
import defpackage.xg0;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.profileinstaller.ۣۡ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0061 {

    /* JADX INFO: renamed from: ۥۥۤۢ, reason: contains not printable characters */
    public static int f61 = 67;

    /* JADX INFO: renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m797(Object obj) {
        if (C0033.m436() >= 0) {
            return ((TextClassification) obj).getLabel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static long m798(Object obj) {
        if (C0038.m509() >= 0) {
            return ((oz) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m799(Object obj) {
        if (C0002.m39() > 0) {
            return ((oq) obj).p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨۡ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m801(Object obj) {
        if (C0089.m1150() >= 0) {
            return ((qq1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۨۡ, reason: not valid java name and contains not printable characters */
    public static int m802() {
        if (C0111.m1412() <= 0) {
            return mv1.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static int m803() {
        return (-308) ^ C0107.f113;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static long m804(Object obj) {
        if (C0010.m137() < 0) {
            return ((ob0) obj).T;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۤۦۥ, reason: not valid java name and contains not printable characters */
    public static String m805(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۦ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m806(Object obj, Object obj2) {
        if (C0059.m769() >= 0) {
            return ((aq0) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۤۧۧ, reason: not valid java name and contains not printable characters */
    public static int m807(Object obj) {
        if (C0038.m509() >= 0) {
            return ((ag1) obj).m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static ph m808() {
        if (C0133.m1681() > 0) {
            return ph.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۦ۠, reason: not valid java name and contains not printable characters */
    public static float m809(Object obj) {
        if (m803() <= 0) {
            return ((l32) obj).e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۨ, reason: not valid java name and contains not printable characters */
    public static int m810(Object obj) {
        if (C0093.m1203() > 0) {
            return ((sv0) obj).h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static xg0 m811(Object obj) {
        if (C0005.m75() >= 0) {
            return ((oq) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۢۡ, reason: not valid java name and contains not printable characters */
    public static int m812(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۡ, reason: not valid java name and contains not printable characters */
    public static String m800(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
