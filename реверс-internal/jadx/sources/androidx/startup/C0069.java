package androidx.startup;

import android.support.v4.app.C0003;
import androidx.versionedparcelable.C0074;
import androidx.versionedparcelable.C0076;
import com.google.android.material.bottomappbar.C0095;
import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.snackbar.C0135;
import defpackage.az1;
import defpackage.dp;
import defpackage.dr;
import defpackage.ep;
import defpackage.hb;
import defpackage.mq;
import defpackage.sa0;
import defpackage.xi;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.startup.ۣ۟۟۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0069 {

    /* JADX INFO: renamed from: ۟ۢ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static int f69 = 882;

    /* JADX INFO: renamed from: ۟۟ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static void m901(Object obj, Object obj2) {
        if (C0095.m1228() >= 0) {
            ((xi) obj).g(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static String m902(Object obj) {
        if (C0003.m50() > 0) {
            return ((mq) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥۧ, reason: not valid java name and contains not printable characters */
    public static dp m903() {
        if (C0074.m963() >= 0) {
            return ep.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۨۤ, reason: not valid java name and contains not printable characters */
    public static int m905(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۣۥۨ, reason: not valid java name and contains not printable characters */
    public static int m906() {
        return (-807) ^ C0099.f105;
    }

    /* JADX INFO: renamed from: ۢ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static hb m907(Object obj) {
        if (C0076.m975() <= 0) {
            return ((az1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m908(String str) {
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

    /* JADX INFO: renamed from: ۤۥۣ۠, reason: not valid java name and contains not printable characters */
    public static sa0 m909(Object obj) {
        if (C0135.m1701() > 0) {
            return ((dr) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m904(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
