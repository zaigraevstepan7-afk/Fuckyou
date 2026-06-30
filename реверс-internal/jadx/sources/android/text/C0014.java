package android.text;

import androidx.appcompat.app.C0029;
import androidx.core.graphics.drawable.C0045;
import androidx.core.graphics.drawable.C0046;
import androidx.profileinstaller.C0063;
import androidx.recyclerview.widget.C0066;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.search.C0126;
import defpackage.C0152;
import defpackage.cm;
import defpackage.cr0;
import defpackage.iu;
import defpackage.ls;
import defpackage.ql0;
import defpackage.tx;
import defpackage.w2;
import defpackage.xg0;
import defpackage.xi0;
import defpackage.xz0;
import defpackage.y41;
import defpackage.ye0;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: android.text.ۢۦۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0014 {

    /* JADX INFO: renamed from: ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static int f14 = -620;

    /* JADX INFO: renamed from: ۟۠۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static void m182(Object obj, float f, float f2, float f3, float f4, float f5, float f6) {
        if (C0063.m824() > 0) {
            ((y41) obj).q(f, f2, f3, f4, f5, f6);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static cm m183() {
        if (C0126.m1590() >= 0) {
            return xi0.W;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡ۠, reason: not valid java name and contains not printable characters */
    public static w2 m184() {
        if (C0046.m616() <= 0) {
            return w2.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static String m185(String str) {
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

    /* JADX INFO: renamed from: ۠ۦۥ۠, reason: not valid java name and contains not printable characters */
    public static int m186() {
        return (-263) ^ C0152.f229;
    }

    /* JADX INFO: renamed from: ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static ye0 m187() {
        if (C0029.m384() >= 0) {
            return xi0.f0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡ۠, reason: not valid java name and contains not printable characters */
    public static xz0 m188(Object obj) {
        if (C0016.m218() <= 0) {
            return ((ql0) obj).I;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static tx m189(Object obj) {
        if (C0045.m596() <= 0) {
            return ((cr0) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۤ۠, reason: not valid java name and contains not printable characters */
    public static AtomicReference m190(Object obj) {
        if (C0066.m857() > 0) {
            return ((iu) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۧ, reason: contains not printable characters */
    public static Object m191(Object obj, Object obj2, Object obj3) {
        if (C0105.m1343() <= 0) {
            return ((xg0) obj).C((String) obj2, (ls) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ۠ۧ, reason: contains not printable characters */
    public static int m192(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static String m181(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
