package androidx.core.graphics.drawable;

import android.app.C0001;
import android.text.C0014;
import android.text.C0016;
import androidx.versionedparcelable.C0075;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.floatingactionbutton.C0114;
import defpackage.jt1;
import defpackage.lz;
import defpackage.ob0;
import defpackage.qz;
import defpackage.rz;
import defpackage.wa0;
import defpackage.xc;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* JADX INFO: renamed from: androidx.core.graphics.drawable.ۣ۟۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0045 {

    /* JADX INFO: renamed from: ۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static int f45 = -947;

    /* JADX INFO: renamed from: ۟۠۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static lz m594(Object obj) {
        if (C0103.m1322() < 0) {
            return ((qz) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m595(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static int m596() {
        return 667 ^ C0014.f14;
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۢ, reason: not valid java name and contains not printable characters */
    public static String m597(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m598(Object obj, boolean z, boolean z2) {
        if (C0001.m16() <= 0) {
            return ((File) obj).setReadable(z, z2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m599(Object obj) {
        if (C0114.m1448() >= 0) {
            return ((rz) obj).w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m600(Object obj, Object obj2, boolean z) {
        if (C0075.m968() > 0) {
            return jt1.H((String) obj, (String) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۨۡ, reason: not valid java name and contains not printable characters */
    public static void m601(Object obj, Object obj2, Object obj3) {
        if (C0016.m218() < 0) {
            xc.E((wa0) obj, (ob0) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m593(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
