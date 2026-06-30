package android.view;

import android.text.C0012;
import androidx.core.app.C0039;
import androidx.graphics.path.C0056;
import androidx.startup.C0072;
import androidx.versionedparcelable.C0075;
import com.google.android.material.behavior.C0088;
import com.google.android.material.behavior.C0092;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.bottomsheet.C0106;
import com.google.android.material.focus.C0120;
import com.google.android.material.search.C0128;
import com.reddit.frontpage.C0148;
import defpackage.bc1;
import defpackage.bk;
import defpackage.bk1;
import defpackage.cm;
import defpackage.fj1;
import defpackage.ha0;
import defpackage.l81;
import defpackage.lr0;
import defpackage.ls;
import defpackage.oz;
import defpackage.pq;
import defpackage.rd;
import defpackage.sv0;
import defpackage.wi0;
import defpackage.xg0;
import defpackage.xq0;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: android.view.۟ۥۥۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0022 {

    /* JADX INFO: renamed from: ۟ۦۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f22 = 934;

    /* JADX INFO: renamed from: ۣۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static int m288() {
        return (-948) ^ C0056.f56;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۦ, reason: not valid java name and contains not printable characters */
    public static cm m289() {
        if (C0039.m516() < 0) {
            return wi0.s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static String m290(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static int m291(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m292(Object obj) {
        if (C0092.m1194() > 0) {
            return ((rd) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static long m293(Object obj) {
        if (C0106.m1348() >= 0) {
            return ((l81) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۤ, reason: not valid java name and contains not printable characters */
    public static void m294(Object obj, Object obj2) {
        if (C0012.m162() > 0) {
            bk.R((sv0) obj, (ha0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۤ, reason: not valid java name and contains not printable characters */
    public static int m295(Object obj) {
        if (C0088.m1147() < 0) {
            return ((pq) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static String m296(Object obj) {
        if (C0039.m516() <= 0) {
            return ((xq0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static int m298(Object obj) {
        if (C0128.m1607() < 0) {
            return ((oz) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static List m299(Object obj) {
        if (C0098.m1266() < 0) {
            return ((rd) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤ۠, reason: contains not printable characters */
    public static void m300(Object obj) throws IOException {
        if (C0075.m968() >= 0) {
            ((BufferedOutputStream) obj).flush();
        }
    }

    /* JADX INFO: renamed from: ۦۧ۠ۨ, reason: contains not printable characters */
    public static Object m301(Object obj, float f, Object obj2) {
        if (C0120.m1522() >= 0) {
            return ((xg0) obj).F(f, (ls) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۡۥ, reason: not valid java name and contains not printable characters */
    public static long m302(Object obj, Object obj2, long j, int i) {
        if (C0148.m1860() > 0) {
            return ((bk1) obj).d((fj1) obj2, j, i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static bc1 m303(Object obj) {
        if (C0072.m936() <= 0) {
            return ((lr0) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۤ, reason: not valid java name and contains not printable characters */
    public static String m297(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
