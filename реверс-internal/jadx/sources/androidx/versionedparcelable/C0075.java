package androidx.versionedparcelable;

import android.view.View;
import androidx.graphics.path.C0054;
import androidx.startup.C0069;
import com.google.android.material.bottomappbar.C0101;
import com.google.android.material.carousel.C0111;
import com.google.android.material.transformation.C0145;
import com.reddit.frontpage.C0149;
import defpackage.aq0;
import defpackage.ef1;
import defpackage.i91;
import defpackage.lk1;
import defpackage.ob0;
import defpackage.uq1;
import defpackage.xe0;
import defpackage.xg0;
import defpackage.xo0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.versionedparcelable.ۣ۟ۤۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0075 {

    /* JADX INFO: renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int f75 = 405;

    /* JADX INFO: renamed from: ۣ۟۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static xo0 m965(Object obj) {
        if (C0111.m1412() < 0) {
            return ef1.i((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m966(Object obj, Object obj2, Object obj3) {
        if (C0145.m1828() < 0) {
            xe0.a((xe0) obj, (ArrayList) obj2, (uq1) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m967(Object obj, int i) {
        if (C0054.m711() > 0) {
            return ((aq0) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m968() {
        return 648 ^ C0069.f69;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧ۟, reason: not valid java name and contains not printable characters */
    public static int m969(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static i91 m970() {
        if (C0149.m1865() <= 0) {
            return xg0.m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۢۢ, reason: contains not printable characters */
    public static void m971(Object obj, Object obj2, int i) {
        if (C0101.m1291() < 0) {
            ((lk1) obj).a((ob0) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۨۢۥۥ, reason: not valid java name and contains not printable characters */
    public static String m973(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۧۥ۠۟, reason: not valid java name and contains not printable characters */
    public static String m972(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
