package androidx.window.reflection;

import android.app.C0001;
import com.google.android.material.bottomappbar.C0095;
import com.google.android.material.focus.C0121;
import com.google.android.material.search.C0124;
import com.google.android.material.snackbar.C0135;
import com.google.android.material.transformation.C0141;
import com.google.android.material.transformation.C0145;
import com.google.android.material.transformation.C0146;
import defpackage.aq0;
import defpackage.bl;
import defpackage.bm;
import defpackage.br;
import defpackage.eb0;
import defpackage.hk;
import defpackage.jo;
import defpackage.lk;
import defpackage.ob0;
import defpackage.rd;
import defpackage.ry1;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.window.reflection.ۦۧۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0083 {

    /* JADX INFO: renamed from: ۣ۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static int f83 = 237;

    /* JADX INFO: renamed from: ۣ۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static rd m1062(Object obj) {
        if (C0121.m1535() > 0) {
            return ((br) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static String m1063(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۡ۠۟, reason: not valid java name and contains not printable characters */
    public static jo m1064(int i, Object obj, Object obj2) {
        if (C0001.m16() < 0) {
            return lk.d0(i, (eb0) obj, (ob0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۦۦ, reason: not valid java name and contains not printable characters */
    public static long m1065(Object obj) {
        if (C0124.m1574() > 0) {
            return ((bm) obj).w;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static aq0 m1066(Object obj) {
        if (C0141.m1778() <= 0) {
            return hk.k((aq0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۢ, reason: not valid java name and contains not printable characters */
    public static long m1067(Object obj) {
        if (C0145.m1828() <= 0) {
            return ((bm) obj).k;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۦۤ, reason: not valid java name and contains not printable characters */
    public static int m1068() {
        return 987 ^ C0146.f152;
    }

    /* JADX INFO: renamed from: ۤۦۢۨ, reason: not valid java name and contains not printable characters */
    public static int m1069(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥ۠ۧ۟, reason: contains not printable characters */
    public static int m1070(float f, float f2) {
        if (C0135.m1701() > 0) {
            return Float.compare(f, f2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m1071(Object obj, Object obj2, int i) {
        if (C0095.m1228() >= 0) {
            bl.g((ry1) obj, (ob0) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۧۨۥ۟, reason: not valid java name and contains not printable characters */
    public static String m1072(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
