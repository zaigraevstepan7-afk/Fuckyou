package androidx.core.widget;

import android.graphics.Path;
import android.support.v4.app.C0003;
import androidx.appcompat.app.C0028;
import androidx.profileinstaller.C0061;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0092;
import com.google.android.material.transformation.C0143;
import com.google.android.material.transformation.C0145;
import defpackage.C0155;
import defpackage.bk;
import defpackage.cr0;
import defpackage.f20;
import defpackage.ob0;
import defpackage.qq1;
import defpackage.ri0;
import defpackage.sa0;
import defpackage.tv0;
import defpackage.vm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: androidx.core.widget.ۣ۟ۦۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0050 {

    /* JADX INFO: renamed from: ۠ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static int f50 = -502;

    /* JADX INFO: renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m655(Object obj) throws IOException {
        if (C0090.m1175() < 0) {
            ((OutputStream) obj).flush();
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static tv0 m656(Object obj, Object obj2) {
        if (C0143.m1796() >= 0) {
            return bk.P((ob0) obj, (tv0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static ri0 m657() {
        if (C0092.m1194() >= 0) {
            return ri0.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m658(String str) {
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

    /* JADX INFO: renamed from: ۥۣۡ۠, reason: contains not printable characters */
    public static f20 m660(Object obj) {
        if (C0028.m368() <= 0) {
            return ((vm) obj).H();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۧۨ, reason: contains not printable characters */
    public static int m661() {
        return 89 ^ C0003.f3;
    }

    /* JADX INFO: renamed from: ۦۥۥ۟, reason: contains not printable characters */
    public static int m662(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۦ۟ۡ, reason: contains not printable characters */
    public static String m663(Object obj) {
        if (C0155.m2019() > 0) {
            return ((cr0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static sa0 m664(Object obj) {
        if (C0061.m803() < 0) {
            return ((qq1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۦۦ, reason: not valid java name and contains not printable characters */
    public static void m665(Object obj) {
        if (C0145.m1828() <= 0) {
            ((Path) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۡۢۡۢ, reason: not valid java name and contains not printable characters */
    public static String m659(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
