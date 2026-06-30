package p070i0;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.ColorStateList;
import android.graphics.Insets;
import android.graphics.RectF;
import android.location.Location;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.WindowInsets;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.emoji2.text.C0503q;
import androidx.fragment.app.C0518H;
import androidx.fragment.app.C0550t;
import androidx.lifecycle.C1147;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.internal.C1156;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.ConfigsActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import p004C.C1122;
import p005C0.C0048n;
import p015I0.C1125;
import p016J.InterfaceC0135g;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.C1127;
import p023M0.ViewOnAttachStateChangeListenerC0210p;
import p024N.C1128;
import p025N0.C1130;
import p026O.C1132;
import p032R.C1134;
import p036T.AbstractC0383m;
import p036T.ViewOnTouchListenerC0377g;
import p038U.C1137;
import p041V0.C1138;
import p042W.C0404e;
import p042W.C1139;
import p044X.C1140;
import p050a0.C1143;
import p051a1.C1144;
import p051a1.C1145;
import p057d.AbstractC0641a;
import p058d0.C0643;
import p060e.AbstractActivityC0669k;
import p060e.C0646B;
import p060e.C0651G;
import p060e.LayoutInflaterFactory2C0648D;
import p066g0.AbstractC0719G;
import p071j.AbstractC0786a;
import p073k0.C1166;
import p074l.C0873F;
import p075l0.C1168;
import p081o0.AbstractC1015a;
import p089t.C1175;
import p096w0.C1177;
import p098x0.C1179;

/* JADX INFO: renamed from: i0.ۨۤ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1164 {

    /* JADX INFO: renamed from: ۟ۤۥۨۧ, reason: not valid java name and contains not printable characters */
    public static int f4907 = 830;

    /* JADX INFO: renamed from: ۟۠۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static InputStream m4602(Object obj) {
        if (C1138.m3471() >= 0) {
            return ((Process) obj).getInputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4603(Object obj, Object obj2) {
        if (C1145.m3805() <= 0) {
            return ((HashSet) obj).remove(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۢۦۣ, reason: not valid java name and contains not printable characters */
    public static int m4604(Object obj, Object obj2, int i2) {
        if (C1154.m4128() >= 0) {
            return ((ColorStateList) obj).getColorForState((int[]) obj2, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static C0503q m4605(Object obj) {
        if (C1175.m5073() > 0) {
            return AbstractC0383m.m1052q((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m4606(Object obj, Object obj2) {
        if (m4618() >= 0) {
            ((C0048n) obj).m286D((AbstractC0786a) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4607(Object obj) {
        if (C0643.m4322() <= 0) {
            return ((C0404e) obj).m1120f();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m4608(Object obj) {
        if (m4618() >= 0) {
            ((AbstractC0165g) obj).m581f();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4609(Object obj, boolean z2, boolean z3) {
        if (C1127.m3025() >= 0) {
            return ((File) obj).setExecutable(z2, z3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static float m4610(float f, float f2, float f3, float f4, float f5) {
        if (C1125.m2937() >= 0) {
            return AbstractC1015a.m2462b(f, f2, f3, f4, f5);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4611(Object obj, Object obj2) {
        if (C1122.m2810() < 0) {
            return ((String) obj).concat((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m4613(Object obj, boolean z2) {
        if (C1144.m3748() <= 0) {
            ((Toolbar) obj).setCollapsible(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۥۨ, reason: not valid java name and contains not printable characters */
    public static void m4614(Object obj, int i2) {
        if (C1126.m2964() <= 0) {
            ((ActionBarOverlayLayout) obj).m1209j(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۦ۠, reason: not valid java name and contains not printable characters */
    public static int m4615(Object obj) {
        if (C1143.m3711() <= 0) {
            return ((ActivityInfo) obj).configChanges;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦۥ, reason: not valid java name and contains not printable characters */
    public static void m4616(Object obj, int i2) {
        if (C1156.m4236() > 0) {
            ((C0646B) obj).setBackgroundResource(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۥ, reason: not valid java name and contains not printable characters */
    public static C0873F m4617(Object obj, Object obj2, Object obj3) {
        if (C1128.m3066() >= 0) {
            return ((C0651G) obj).mo1789d((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static int m4618() {
        return 697 ^ C1177.f4920;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧۡ, reason: not valid java name and contains not printable characters */
    public static C0518H m4619(Object obj) {
        if (C1147.m1498() < 0) {
            return ((C0550t) obj).f1808s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static long m4620(Object obj) {
        if (C1140.m3595() > 0) {
            return ((AbstractC0719G) obj).f2852d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4621(Object obj) {
        if (C1132.m3217() > 0) {
            return ((ViewOnTouchListenerC0377g) obj).f1036n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۤۧۢ, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m4622(Object obj, Object obj2) {
        if (C1126.m2964() < 0) {
            return ((WindowInsets.Builder) obj).setTappableElementInsets((Insets) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m4623(Object obj) {
        if (C1140.m3595() >= 0) {
            return Objects.requireNonNull(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۟۟, reason: not valid java name and contains not printable characters */
    public static float m4624(Object obj) {
        if (C1134.m3300() < 0) {
            return ((MotionEvent) obj).getY();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢۢۦۨ, reason: not valid java name and contains not printable characters */
    public static void m4625(Object obj, Object obj2, Object obj3) {
        if (m4618() > 0) {
            ((ViewManager) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Object m4626(Object obj) {
        if (C1139.m3541() >= 0) {
            return ((ViewOnAttachStateChangeListenerC0210p) obj).f680b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۢۦ, reason: not valid java name and contains not printable characters */
    public static double m4627(Object obj) {
        if (C1150.m3967() >= 0) {
            return ((Location) obj).getLongitude();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۢۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int[] m4628() {
        if (C1138.m3471() >= 0) {
            return AbstractC0641a.f2504y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static float m4629(Object obj) {
        if (C1179.m5236() >= 0) {
            return ((RectF) obj).centerX();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static String m4630(Object obj) {
        if (C1163.m4579() >= 0) {
            return ((InterfaceC0135g) obj).mo514b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۤۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4631(Object obj) {
        if (C1168.m4797() <= 0) {
            return ((ConfigsActivity) obj).f2462y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۟ۢ, reason: contains not printable characters */
    public static int m4632(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۢۤ۠, reason: contains not printable characters */
    public static boolean m4633(Object obj, Object obj2) {
        if (C1139.m3541() >= 0) {
            return ((HashSet) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۢۨۦ, reason: contains not printable characters */
    public static int m4634(Object obj) {
        if (C1150.m3967() > 0) {
            return ((AbstractC0165g) obj).f509A;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۦۥ, reason: contains not printable characters */
    public static LayoutInflaterFactory2C0648D m4635(Object obj) {
        if (C1144.m3748() < 0) {
            return ((C0646B) obj).f2508i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۦۥ, reason: contains not printable characters */
    public static boolean m4636(Object obj) {
        if (C1149.m3923() < 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2552Y;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m4637(Object obj) {
        if (C1130.m3165() > 0) {
            return ((TextInputLayout) obj).getCounterOverflowDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧ۟, reason: not valid java name and contains not printable characters */
    public static void m4638(Object obj) {
        if (C1166.m4699() >= 0) {
            ((View) obj).requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۧۧۡۧ, reason: not valid java name and contains not printable characters */
    public static float m4639(Object obj) {
        if (C1137.m3457() <= 0) {
            return ((RectF) obj).bottom;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m4640(Object obj, int i2) {
        if (C1179.m5236() > 0) {
            ((AbstractActivityC0669k) obj).setContentView(i2);
        }
    }

    /* JADX INFO: renamed from: ۨۧۨۧ, reason: not valid java name and contains not printable characters */
    public static String m4641(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۤۡۢ, reason: not valid java name and contains not printable characters */
    public static String m4612(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
