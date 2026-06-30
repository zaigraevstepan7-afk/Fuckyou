package androidx.core.app;

import android.view.translation.C0017;
import androidx.core.widget.C0050;
import androidx.startup.C0069;
import androidx.window.area.reflectionguard.C0078;
import androidx.window.reflection.C0082;
import com.reddit.frontpage.C0150;
import defpackage.cr0;
import defpackage.fu;
import defpackage.kg1;
import defpackage.ks;
import defpackage.lt;
import defpackage.nu0;
import defpackage.pn1;
import defpackage.vm;
import defpackage.wa0;
import defpackage.xi0;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: androidx.core.app.ۣۥۣۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0042 {

    /* JADX INFO: renamed from: ۥۡ۠ۢ, reason: contains not printable characters */
    public static int f42 = -412;

    /* JADX INFO: renamed from: ۟۠۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m560(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۥۣۤ, reason: not valid java name and contains not printable characters */
    public static float m561(Object obj) {
        if (C0017.m229() <= 0) {
            return ((fu) obj).a();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static int m562(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۢۨۡ, reason: not valid java name and contains not printable characters */
    public static kg1 m563(Object obj) {
        if (C0150.m1876() > 0) {
            return ((pn1) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static Object m565(Object obj, Object obj2, Object obj3) {
        if (C0082.m1058() < 0) {
            return nu0.P((lt) obj, (wa0) obj2, (ks) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static int m566() {
        return 36 ^ C0050.f50;
    }

    /* JADX INFO: renamed from: ۡۢۤ۠, reason: not valid java name and contains not printable characters */
    public static vm m567() {
        if (C0078.m998() < 0) {
            return xi0.v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢ۟, reason: not valid java name and contains not printable characters */
    public static ks m568(Object obj, Object obj2, Object obj3) {
        if (C0041.m550() >= 0) {
            return ((cr0) obj).o((ks) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۟ۢ, reason: contains not printable characters */
    public static MessageDigest m569(Object obj) {
        if (C0069.m906() <= 0) {
            return MessageDigest.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۦۦ, reason: not valid java name and contains not printable characters */
    public static String m564(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
