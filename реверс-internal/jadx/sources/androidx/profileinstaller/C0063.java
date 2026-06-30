package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.C0010;
import androidx.core.widget.C0050;
import androidx.graphics.path.C0056;
import androidx.graphics.path.C0057;
import androidx.startup.C0071;
import com.google.android.material.behavior.C0089;
import defpackage.ba2;
import defpackage.gk;
import defpackage.oc;
import defpackage.un0;
import defpackage.y41;
import defpackage.zq0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.profileinstaller.ۦ۠ۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0063 {

    /* JADX INFO: renamed from: ۣ۟ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static int f63 = -92;

    /* JADX INFO: renamed from: ۣ۟۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static PackageManager m822(Object obj) {
        if (C0056.m738() <= 0) {
            return ((Context) obj).getPackageManager();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static String m823(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m824() {
        return 75 ^ C0089.f95;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static gk m825(Object obj) {
        if (C0071.m922() < 0) {
            return ((un0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟۠, reason: not valid java name and contains not printable characters */
    public static oc m826(Object obj) {
        if (C0050.m661() >= 0) {
            return ((zq0) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static int m828(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۧۢ, reason: contains not printable characters */
    public static long m829(Object obj) {
        if (C0010.m137() < 0) {
            return ((ba2) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m830(Object obj, float f, float f2) {
        if (C0057.m749() >= 0) {
            ((y41) obj).y(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۠ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m827(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
