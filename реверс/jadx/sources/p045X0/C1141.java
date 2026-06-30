package p045X0;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextWatcher;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C0518H;
import androidx.lifecycle.C1147;
import androidx.startup.C1149;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import p000A.C0001b;
import p000A.C0005f;
import p001A0.AbstractC0016e;
import p001A0.C1121;
import p011G.C1123;
import p022M.C1126;
import p023M0.C0190C;
import p023M0.C0212r;
import p023M0.C0216v;
import p023M0.C1127;
import p024N.AbstractC0226D;
import p025N0.C1129;
import p025N0.C1130;
import p026O.C1132;
import p029P0.C1133;
import p031Q0.RunnableC0345s;
import p037T0.C1136;
import p038U.C1137;
import p044X.C1140;
import p050a0.C1142;
import p051a1.C1145;
import p052b0.C1152;
import p058d0.C0643;
import p060e.AbstractC0676r;
import p060e.ExecutorC0674p;
import p060e.LayoutInflaterFactory2C0648D;
import p060e.WindowCallbackC0683y;
import p072k.C1165;
import p073k0.AbstractC0849m;
import p073k0.InterfaceC0847k;
import p074l.AbstractC0967r1;
import p075l0.C1168;
import p077m0.C1169;
import p081o0.C1170;
import p084q.C1173;
import p089t.C1175;
import p098x0.C1179;

/* JADX INFO: renamed from: X0.ۤۤ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1141 {

    /* JADX INFO: renamed from: ۣۦۢۦ, reason: not valid java name and contains not printable characters */
    public static int f4867 = 281;

    /* JADX INFO: renamed from: ۟۟۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m3602(Object obj) {
        if (C1146.m3842() <= 0) {
            return ((Drawable) obj).getIntrinsicWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static TypedValue m3603(Object obj) {
        if (C1175.m5073() >= 0) {
            return ((ContentFrameLayout) obj).getFixedWidthMinor();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m3604(Object obj) {
        if (C1129.m3120() < 0) {
            return ((AbstractC0226D) obj).f768d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static WindowInsets m3605(Object obj) {
        if (C1127.m3025() >= 0) {
            return ((WindowInsets.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m3606() {
        if (C1175.m5073() >= 0) {
            return "ۤۦۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m3607() {
        return 232 ^ C1127.f4842;
    }

    /* JADX INFO: renamed from: ۟ۢۥۨ, reason: not valid java name and contains not printable characters */
    public static void m3608(Object obj, int i2, Object obj2) {
        if (C1147.m1498() <= 0) {
            ((Window.Callback) obj).onPanelClosed(i2, (Menu) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m3609(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m3610(Object obj, Object obj2) {
        if (C1168.m4797() < 0) {
            ((C0212r) obj).m667i((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3611(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((C0518H) obj).m1372o();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static int m3612(Object obj, Object obj2) {
        if (C1165.m4643() >= 0) {
            return Log.w((String) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m3613(Object obj) {
        if (C1129.m3120() < 0) {
            return ((ExecutorC0674p) obj).f2705a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۨ, reason: not valid java name and contains not printable characters */
    public static void m3614(Object obj, Object obj2, Object obj3) {
        if (C1170.m4847() > 0) {
            AbstractC0967r1.m2416a((View) obj, (Rect) obj2, (Rect) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3615(Object obj) {
        if (C1173.m4990() < 0) {
            return ((LayoutInflaterFactory2C0648D) obj).m1836D();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static long m3616() {
        if (C1129.m3120() < 0) {
            return SystemClock.uptimeMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static TextInputLayout m3617(Object obj) {
        if (C1149.m3923() < 0) {
            return ((C0216v) obj).f726h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m3618(Object obj, int i2) {
        if (C1137.m3457() <= 0) {
            return ((Calendar) obj).get(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۢ, reason: not valid java name and contains not printable characters */
    public static void m3619(Object obj) {
        if (C1121.m2777() > 0) {
            ((C0001b) obj).mo59x();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۧۦ, reason: not valid java name and contains not printable characters */
    public static void m3620(Object obj, Object obj2) {
        if (C1142.m3681() <= 0) {
            ((TextView) obj).removeTextChangedListener((TextWatcher) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡۥ۠, reason: not valid java name and contains not printable characters */
    public static C0216v m3621(Object obj) {
        if (C1126.m2964() <= 0) {
            return ((TextInputLayout) obj).f2379j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m3622(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۠ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static Object m3623() {
        if (C1152.m4038() >= 0) {
            return AbstractC0676r.f2717i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۥۨ, reason: not valid java name and contains not printable characters */
    public static void m3624(Object obj, Object obj2) {
        if (C1129.m3120() <= 0) {
            ((ViewGroup) obj).removeView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۤۨ, reason: not valid java name and contains not printable characters */
    public static WindowCallbackC0683y m3625(Object obj) {
        if (C1123.m2849() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2564m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۤۡ, reason: not valid java name and contains not printable characters */
    public static TimeInterpolator m3626(Object obj, int i2, Object obj2) {
        if (C1133.m3246() < 0) {
            return AbstractC0016e.m195r0((Context) obj, i2, (Interpolator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟, reason: not valid java name and contains not printable characters */
    public static void m3627(Object obj, int i2) {
        if (C0643.m4322() <= 0) {
            ((View) obj).setBackgroundColor(i2);
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static long m3628(Object obj) {
        if (C1169.m4842() < 0) {
            return ((RunnableC0345s) obj).f980b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static ViewGroup.OnHierarchyChangeListener m3629(Object obj) {
        if (m3607() > 0) {
            return ((CoordinatorLayout) obj).f1456q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۧ۠, reason: not valid java name and contains not printable characters */
    public static float m3630(Object obj) {
        if (C1130.m3165() >= 0) {
            return ((RectF) obj).top;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۢۤ, reason: not valid java name and contains not printable characters */
    public static int m3631(Object obj) {
        if (C1145.m3805() <= 0) {
            return ((C0190C) obj).f629a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static String m3632() {
        if (C1136.m3395() < 0) {
            return "ۣۦۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۤ۟, reason: not valid java name and contains not printable characters */
    public static Float m3633(float f) {
        if (C1154.m4128() >= 0) {
            return Float.valueOf(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۢۥ, reason: not valid java name and contains not printable characters */
    public static String m3634() {
        if (C1132.m3217() >= 0) {
            return "ۣۤۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3635(Object obj) {
        if (C1136.m3395() <= 0) {
            return ((C0005f) obj).f16n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۤۧ, reason: contains not printable characters */
    public static String m3637() {
        if (C1145.m3805() <= 0) {
            return "ۧۥۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3638(Object obj) {
        if (C1140.m3595() >= 0) {
            return ((Parcel) obj).createStringArrayList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡ۠, reason: not valid java name and contains not printable characters */
    public static void m3639(Object obj, int i2) {
        if (C1179.m5236() >= 0) {
            ((PopupWindow) obj).setHeight(i2);
        }
    }

    /* JADX INFO: renamed from: ۧۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m3640(Object obj, Object obj2) {
        if (m3607() >= 0) {
            ((Resources.Theme) obj).setTo((Resources.Theme) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۡۨ۟, reason: not valid java name and contains not printable characters */
    public static void m3641(Object obj, Object obj2) {
        if (C1152.m4038() > 0) {
            ((InterfaceC0847k) obj).mo2214e((AbstractC0849m) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢۢ۟, reason: contains not printable characters */
    public static String m3636(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
