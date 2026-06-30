package androidx.startup;

import android.support.v4.graphics.drawable.C0008;
import android.view.translation.C0020;
import androidx.appcompat.app.C0029;
import com.google.android.material.floatingactionbutton.C0114;
import com.google.android.material.floatingactionbutton.C0117;
import defpackage.ca2;
import defpackage.cr0;
import defpackage.ha0;
import defpackage.ij;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: androidx.startup.ۣۤ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0071 {

    /* JADX INFO: renamed from: ۦۡ۠ۢ, reason: contains not printable characters */
    public static int f71 = -895;

    /* JADX INFO: renamed from: ۟۠ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static int m920(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۡۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m921(Object obj) {
        if (C0114.m1448() > 0) {
            return ((ij) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static int m922() {
        return (-688) ^ C0117.f123;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static String m923(String str) {
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

    /* JADX INFO: renamed from: ۟ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m924(Object obj) {
        if (C0020.m271() > 0) {
            return ((cr0) obj).p;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۤۥ, reason: not valid java name and contains not printable characters */
    public static void m926(Object obj) throws IOException {
        if (C0008.m116() > 0) {
            ((FileOutputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۧۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ha0 m927(Object obj) {
        if (C0029.m384() >= 0) {
            return ((ca2) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠۠۠, reason: not valid java name and contains not printable characters */
    public static String m925(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
