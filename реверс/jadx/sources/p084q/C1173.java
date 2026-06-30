package p084q;

import android.animation.Animator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.profileinstaller.C1148;
import androidx.startup.C1149;
import com.google.android.material.internal.C1156;
import com.reddit.frontpage.ConfigsActivity;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p001A0.AbstractC0016e;
import p011G.AbstractC0092a;
import p014H0.C1124;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.AbstractC0213s;
import p023M0.C0188A;
import p023M0.C0218x;
import p023M0.C1127;
import p024N.C0291v0;
import p024N.C1128;
import p029P0.C1133;
import p032R.C1134;
import p036T.C0371a;
import p037T0.C1135;
import p042W.C1139;
import p044X.C1140;
import p058d0.C0643;
import p058d0.C1158;
import p060e.AbstractC0673o;
import p060e.ExecutorC0675q;
import p066g0.C1160;
import p070i0.C1163;
import p070i0.C1164;
import p072k.C1165;
import p073k0.C1167;
import p073k0.InterfaceC0847k;
import p074l.C0867C;
import p074l.C0884K0;
import p083p0.C1171;
import p092u0.C1176;

/* JADX INFO: renamed from: q.ۤۡۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1173 {

    /* JADX INFO: renamed from: ۟ۧۤۨ۠, reason: not valid java name and contains not printable characters */
    public static int f4916 = 222;

    /* JADX INFO: renamed from: ۟۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m4969(String str) {
        String string = "";
        int i2 = 0;
        String str2 = "";
        while (i2 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i2)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i2).toString();
            i2++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i3 = 0; i3 < str.length(); i3 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i3)) << 4) | string.indexOf(str.charAt(i3 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i4 = 0; i4 < length; i4++) {
            byteArray[i4] = (byte) (byteArray[i4] ^ str2.charAt(i4 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟۠۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4970(Object obj) {
        if (C1139.m3541() > 0) {
            return ((C0218x) obj).f748b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static String m4971(Object obj) {
        if (C1165.m4643() > 0) {
            return ((MainActivity) obj).m1827x();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Resources m4972(Object obj) {
        if (C1167.m4739() < 0) {
            return ((View) obj).getResources();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۤۦ, reason: not valid java name and contains not printable characters */
    public static void m4973(Object obj, int i2) {
        if (C1171.m4901() > 0) {
            ((ContentInfo.Builder) obj).setFlags(i2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static C0867C m4975(Object obj) {
        if (C1158.m4364() < 0) {
            return ((C0884K0) obj).f3577z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4976(Object obj) {
        if (C0643.m4322() < 0) {
            return ((C0291v0) obj).mo907m();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۢ, reason: not valid java name and contains not printable characters */
    public static ImageView.ScaleType m4977(int i2) {
        if (C1160.m4437() <= 0) {
            return AbstractC0016e.m190p(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟۠, reason: not valid java name and contains not printable characters */
    public static void m4978(Object obj) {
        if (C1134.m3300() < 0) {
            ((AbstractC0213s) obj).m675q();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۨ, reason: not valid java name and contains not printable characters */
    public static int m4979(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m4980(Object obj) {
        if (C1163.m4579() > 0) {
            return ((C0188A) obj).f623f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۥۦ, reason: not valid java name and contains not printable characters */
    public static Object m4981(Object obj) {
        if (C1126.m2964() < 0) {
            return ((Iterator) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۨ۠, reason: not valid java name and contains not printable characters */
    public static void m4982(Object obj, int i2, int i3, int i4, int i5) {
        if (C1149.m3923() <= 0) {
            ((View) obj).setPadding(i2, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m4983(Object obj) {
        if (C1148.m3908() >= 0) {
            return ((AbstractC0165g) obj).f516H;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m4984(Object obj) {
        if (C1127.m3025() > 0) {
            return ((CharSequence) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static LocaleList m4985(Object obj) {
        if (C1156.m4236() >= 0) {
            return AbstractC0673o.m1901a(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧۥ, reason: not valid java name and contains not printable characters */
    public static int m4986(Object obj) {
        if (C1148.m3908() > 0) {
            return ((View) obj).getVisibility();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static char m4987(Object obj, int i2) {
        if (C1140.m3595() > 0) {
            return ((String) obj).charAt(i2);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۢۦۤۧ, reason: not valid java name and contains not printable characters */
    public static int m4988(Object obj) {
        if (C1126.m2964() <= 0) {
            return ((CharSequence) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۢ, reason: not valid java name and contains not printable characters */
    public static int m4989(Object obj) {
        if (C1148.m3908() >= 0) {
            return ((Rect) obj).height();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static int m4990() {
        return 324 ^ C1149.f4875;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m4991(Object obj, Object obj2) {
        if (C1164.m4618() >= 0) {
            ((ExecutorC0675q) obj).execute((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m4992(Object obj) {
        if (C1128.m3066() > 0) {
            ((InterfaceC0847k) obj).mo2210a();
        }
    }

    /* JADX INFO: renamed from: ۤۨۧۡ, reason: not valid java name and contains not printable characters */
    public static void m4993(Object obj, int i2) {
        if (C1133.m3246() <= 0) {
            AbstractC0092a.m428g((Drawable) obj, i2);
        }
    }

    /* JADX INFO: renamed from: ۥۣۣۧ, reason: contains not printable characters */
    public static long m4994(Object obj) {
        if (C1176.m5115() <= 0) {
            return ((C0371a) obj).f1019g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۥۥۢ, reason: contains not printable characters */
    public static int m4995(Object obj, int i2) {
        if (C1160.m4437() < 0) {
            return ((Random) obj).nextInt(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۦۣۢ, reason: contains not printable characters */
    public static boolean m4996(Object obj, Object obj2) {
        if (C1176.m5115() <= 0) {
            return ((List) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۧۨۦ, reason: contains not printable characters */
    public static int m4997(Object obj) {
        if (C1163.m4579() >= 0) {
            return ((AbstractC0165g) obj).f539d0;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۤۦ, reason: contains not printable characters */
    public static void m4998(Object obj, boolean z2) {
        if (C1135.m3328() > 0) {
            ((ConfigsActivity) obj).m1804D(z2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۧ, reason: not valid java name and contains not printable characters */
    public static LayoutInflater.Factory m4999(Object obj) {
        if (C1124.m2896() > 0) {
            return ((LayoutInflater) obj).getFactory();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m5000(Object obj) {
        if (C1165.m4643() > 0) {
            return ((List) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۢ, reason: not valid java name and contains not printable characters */
    public static Animator m5001(Object obj, long j2) {
        if (C1163.m4579() >= 0) {
            return ((Animator) obj).setDuration(j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۣ, reason: not valid java name and contains not printable characters */
    public static String m4974(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
