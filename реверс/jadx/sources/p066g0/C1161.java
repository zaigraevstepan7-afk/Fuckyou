package p066g0;

import android.animation.Animator;
import android.app.Dialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0543m;
import androidx.lifecycle.C1147;
import androidx.profileinstaller.C1148;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.internal.C1156;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import p001A0.C1121;
import p004C.C1122;
import p005C0.C0048n;
import p016J.InterfaceC0135g;
import p019K0.AbstractC0165g;
import p023M0.C0188A;
import p023M0.C0212r;
import p023M0.C0215u;
import p023M0.C0216v;
import p023M0.C1127;
import p024N.C0249a0;
import p025N0.C1130;
import p031Q0.RunnableC0334h;
import p032R.C1134;
import p036T.ViewOnTouchListenerC0377g;
import p037T0.C1136;
import p038U.C1137;
import p041V0.C1138;
import p044X.C1140;
import p045X0.C1141;
import p051a1.C1144;
import p051a1.C1145;
import p052b0.C1152;
import p058d0.C1158;
import p060e.AbstractC0681w;
import p060e.C0657M;
import p060e.LayoutInflaterFactory2C0648D;
import p065g.C1159;
import p068h0.C1162;
import p071j.AbstractC0786a;
import p072k.MenuC0816m;
import p073k0.C1167;
import p077m0.C1169;
import p081o0.C1170;
import p084q.C1172;
import p084q.C1173;
import p092u0.C1176;
import p096w0.C1177;
import p098x0.C1179;

/* JADX INFO: renamed from: g0.ۧۥۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1161 {

    /* JADX INFO: renamed from: ۟۠ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int f4904 = -464;

    /* JADX INFO: renamed from: ۟۟۟۠۠, reason: not valid java name and contains not printable characters */
    public static CharSequence m4474(Object obj) {
        if (C1169.m4842() <= 0) {
            return ((ActionBarContextView) obj).getTitle();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static int m4475(float f) {
        if (C1140.m3595() >= 0) {
            return Math.round(f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m4476(Object obj) {
        if (C1152.m4038() > 0) {
            ((C0657M) obj).mo1864a();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static TextView m4477(Object obj, int i2) {
        if (C1145.m3805() <= 0) {
            return ((C0216v) obj).m680e(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۢۤ, reason: not valid java name and contains not printable characters */
    public static int m4479(Object obj) {
        if (C1156.m4236() > 0) {
            return ((ViewGroup.MarginLayoutParams) obj).rightMargin;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static String m4480() {
        if (C1127.m3025() > 0) {
            return "۠۠ۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static String m4481(String str) {
        String string = "";
        int i2 = 0;
        String str2 = "";
        while (i2 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i2)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i2).toString();
            i2++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟۠ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static float m4482(Object obj, Object obj2) {
        if (C1172.m4932() < 0) {
            return ((Bundle) obj).getFloat((String) obj2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦۣ, reason: not valid java name and contains not printable characters */
    public static Dialog m4483(Object obj) {
        if (C1160.m4437() < 0) {
            return ((DialogInterfaceOnCancelListenerC0543m) obj).f1741c0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static ListView m4484(Object obj) {
        if (C1144.m3748() < 0) {
            return ((ViewOnTouchListenerC0377g) obj).f1025c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m4485(Object obj) {
        if (C1154.m4128() >= 0) {
            ((TextInputLayout) obj).m1780s();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static void m4486(Object obj, Object obj2, Object obj3) {
        if (C1173.m4990() <= 0) {
            AbstractC0681w.m1908a((Configuration) obj, (Configuration) obj2, (Configuration) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4487(Object obj) {
        if (C1147.m1498() < 0) {
            return ((ViewOnTouchListenerC0377g) obj).f1037o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۤۥۧ, reason: not valid java name and contains not printable characters */
    public static void m4488(Object obj, Object obj2) {
        if (C1152.m4038() > 0) {
            ((TextView) obj).addTextChangedListener((TextWatcher) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m4489(Object obj, int i2) {
        if (C1167.m4739() < 0) {
            return Base64.decode((String) obj, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static int m4490(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۥ, reason: not valid java name and contains not printable characters */
    public static String m4491(Object obj) {
        if (m4510() < 0) {
            return obj.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static long m4492(Object obj) {
        if (C1162.m4523() < 0) {
            return ((Animator) obj).getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static int m4493(Object obj) {
        if (C1134.m3300() < 0) {
            return ((InterfaceC0135g) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4494(Object obj, int i2) {
        if (C1170.m4847() >= 0) {
            ((AbstractC0165g) obj).setTickActiveRadius(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۡ, reason: not valid java name and contains not printable characters */
    public static C0249a0 m4495(Object obj) {
        if (C1148.m3908() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2576y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static void m4496(Object obj, int i2, int i3, boolean z2) {
        if (C1141.m3607() > 0) {
            ((C0216v) obj).m684i(i2, i3, z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۦۧ, reason: not valid java name and contains not printable characters */
    public static void m4497(Object obj) throws IOException {
        if (C1172.m4932() <= 0) {
            ((FileInputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۠۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static void m4498(Object obj, int i2) {
        if (C1158.m4364() < 0) {
            ((Drawable) obj).setAlpha(i2);
        }
    }

    /* JADX INFO: renamed from: ۠۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static void m4499(Object obj) {
        if (C1177.m5152() >= 0) {
            ((View) obj).clearAnimation();
        }
    }

    /* JADX INFO: renamed from: ۣۡۡ۠, reason: not valid java name and contains not printable characters */
    public static TypedValue m4500(Object obj) {
        if (C1137.m3457() < 0) {
            return ((ContentFrameLayout) obj).getFixedHeightMajor();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static C0216v m4501(Object obj) {
        if (C1176.m5115() <= 0) {
            return ((C0215u) obj).f716a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4502(Object obj) {
        if (C1156.m4236() > 0) {
            return ((C0212r) obj).m662d();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m4503(Object obj) {
        if (C1179.m5236() >= 0) {
            return ((C0188A) obj).f624g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۨۨ, reason: not valid java name and contains not printable characters */
    public static CharSequence m4504(Object obj, int i2) {
        if (C1136.m3395() <= 0) {
            return ((Resources) obj).getText(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m4505(Object obj, Object obj2, Object obj3) {
        if (C1130.m3165() >= 0) {
            return ((C0048n) obj).m287E((AbstractC0786a) obj2, (MenuC0816m) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۢ۠, reason: not valid java name and contains not printable characters */
    public static Configuration m4506(Object obj) {
        if (C1159.m4411() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2545R;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۤ, reason: not valid java name and contains not printable characters */
    public static int m4507(Object obj) {
        if (C1152.m4038() >= 0) {
            return ((Canvas) obj).save();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥۢۧ, reason: not valid java name and contains not printable characters */
    public static void m4508(Object obj, long j2) {
        if (C1160.m4437() < 0) {
            ((C0249a0) obj).m807c(j2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۤۨ, reason: not valid java name and contains not printable characters */
    public static float m4509(Object obj, float f) {
        if (C1169.m4842() <= 0) {
            return ((AbstractC0165g) obj).m590o(f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۢۥۣ, reason: not valid java name and contains not printable characters */
    public static int m4510() {
        return 869 ^ C1121.f4825;
    }

    /* JADX INFO: renamed from: ۥۢۤۢ, reason: contains not printable characters */
    public static Region.Op m4511() {
        if (C1122.m2810() <= 0) {
            return Region.Op.DIFFERENCE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m4512(Object obj) {
        if (C1127.m3025() > 0) {
            return ((RunnableC0334h) obj).f953c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥۨ, reason: not valid java name and contains not printable characters */
    public static float[] m4513(Object obj) {
        if (C1157.m4271() >= 0) {
            return ((AbstractC0165g) obj).m582g();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۨ, reason: not valid java name and contains not printable characters */
    public static OverScroller m4514(Object obj) {
        if (C1138.m3471() > 0) {
            return ((NestedScrollView) obj).f1484d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m4478(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
