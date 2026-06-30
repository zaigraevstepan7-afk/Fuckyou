package androidx.startup;

import android.support.v4.graphics.drawable.C0006;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0031;
import androidx.graphics.path.C0057;
import androidx.versionedparcelable.C0077;
import com.google.android.material.behavior.C0088;
import com.google.android.material.bottomappbar.C0097;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0144;
import com.google.android.material.transformation.C0145;
import com.reddit.frontpage.C0149;
import com.reddit.frontpage.C0151;
import defpackage.aa2;
import defpackage.bo;
import defpackage.dz1;
import defpackage.f20;
import defpackage.ls;
import defpackage.ob0;
import defpackage.vm;
import defpackage.xg0;
import defpackage.xk;
import defpackage.y41;
import defpackage.ye0;
import defpackage.z2;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* JADX INFO: renamed from: androidx.startup.ۦۣۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0072 {

    /* JADX INFO: renamed from: ۦۡۦۣ, reason: contains not printable characters */
    public static int f72 = -121;

    /* JADX INFO: renamed from: ۟۟ۦۡۥ, reason: not valid java name and contains not printable characters */
    public static float m929(Object obj) {
        if (C0144.m1814() < 0) {
            return ((dz1) obj).b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static void m930(Object obj, Object obj2, Object obj3) {
        if (C0138.m1738() > 0) {
            ((bo) obj).setContentView((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static void m931(Object obj, float f) {
        if (C0088.m1147() <= 0) {
            ((y41) obj).F(f);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static z2 m932(Object obj) {
        if (C0057.m749() >= 0) {
            return ((aa2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m933(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۦۢۤ, reason: not valid java name and contains not printable characters */
    public static void m934(Object obj) {
        if (C0077.m996() >= 0) {
            ((ob0) obj).q();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static f20 m935(Object obj) {
        if (C0031.m407() >= 0) {
            return ((vm) obj).p();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۨۡ, reason: not valid java name and contains not printable characters */
    public static int m936() {
        return 993 ^ C0149.f155;
    }

    /* JADX INFO: renamed from: ۟ۨۥۡ, reason: not valid java name and contains not printable characters */
    public static int m937(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡ۟, reason: not valid java name and contains not printable characters */
    public static ye0 m938() {
        if (C0006.m96() >= 0) {
            return xk.x();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۢۨ, reason: not valid java name and contains not printable characters */
    public static f20 m939(Object obj) {
        if (C0151.m1894() > 0) {
            return ((vm) obj).x();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static Object m940(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0145.m1828() <= 0) {
            return xg0.m((xg0) obj, (File) obj2, (String) obj3, (String) obj4, (ls) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static float m941(Object obj) {
        if (C0097.m1242() < 0) {
            return ((Number) obj).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static String m928(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
