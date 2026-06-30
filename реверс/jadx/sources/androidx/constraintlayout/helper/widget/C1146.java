package androidx.constraintlayout.helper.widget;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.C0550t;
import androidx.lifecycle.C1147;
import androidx.profileinstaller.C1148;
import androidx.startup.C1149;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import p000A.C0001b;
import p000A.C0008i;
import p001A0.C1121;
import p004C.C1122;
import p011G.C1123;
import p015I0.C1125;
import p019K0.AbstractC0165g;
import p023M0.C0216v;
import p024N.C0249a0;
import p024N.C1128;
import p025N0.C1131;
import p026O.C1132;
import p031Q0.ViewOnClickListenerC0347u;
import p032R.C1134;
import p036T.AbstractC0383m;
import p037T0.C1135;
import p038U.C1137;
import p042W.AbstractC0401b;
import p044X.C1140;
import p052b0.C1151;
import p058d0.C0643;
import p060e.AbstractActivityC0669k;
import p060e.C0647C;
import p060e.C0649E;
import p060e.C0678t;
import p060e.DialogInterfaceC0666h;
import p060e.ExecutorC0674p;
import p060e.LayoutInflaterFactory2C0648D;
import p060e.WindowCallbackC0683y;
import p066g0.C1160;
import p066g0.RunnableC0744d;
import p068h0.C1162;
import p070i0.C1163;
import p071j.C0790e;
import p072k.C1165;
import p073k0.C1167;
import p075l0.C1168;
import p077m0.C1169;
import p081o0.C1170;
import p084q.C1023b;
import p084q.C1172;
import p084q.C1173;
import p092u0.C1176;
import p097x.C1178;
import p100z.C1180;

/* JADX INFO: renamed from: androidx.constraintlayout.helper.widget.ۡ۟ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1146 {

    /* JADX INFO: renamed from: ۟۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static int f4872 = 186;

    /* JADX INFO: renamed from: ۟۟ۤۦۢ, reason: not valid java name and contains not printable characters */
    public static Object m3824(Object obj, Object obj2) {
        if (C1149.m3923() <= 0) {
            return ((HashMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static void m3825(Object obj) {
        if (C1165.m4643() > 0) {
            ((ExecutorC0674p) obj).m1903a();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۡۤ, reason: not valid java name and contains not printable characters */
    public static void m3826(Object obj, Object obj2) {
        if (C0643.m4322() < 0) {
            ((Window.Callback) obj).onWindowAttributesChanged((WindowManager.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static int m3827(Object obj) {
        if (C1123.m2849() >= 0) {
            return ((C0216v) obj).f732n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۢۡۤ, reason: not valid java name and contains not printable characters */
    public static float m3829(Object obj, int i2, float f) {
        if (C1180.m5241() <= 0) {
            return ((TypedArray) obj).getDimension(i2, f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static ValueAnimator m3830(Object obj, long j2) {
        if (C1121.m2777() >= 0) {
            return ((ValueAnimator) obj).setDuration(j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3831(Object obj, Object obj2) {
        if (C1176.m5115() < 0) {
            return ((String) obj).contentEquals((CharSequence) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static C0649E m3832(Object obj) {
        if (C1156.m4236() > 0) {
            return ((DialogInterfaceC0666h) obj).f2692e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m3833(Object obj) {
        if (C1176.m5115() <= 0) {
            return ((KeyCharacterMap) obj).getKeyboardType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۡۢ۠, reason: not valid java name and contains not printable characters */
    public static void m3834(Object obj) {
        if (C1132.m3217() > 0) {
            ((AbstractC0165g) obj).m601z();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static Constructor m3835(Object obj, Object obj2) {
        if (C0643.m4322() < 0) {
            return ((Class) obj).getDeclaredConstructor((Class[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3836(Object obj, int i2) {
        if (C1151.m4000() >= 0) {
            return ((Window) obj).requestFeature(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.RangeInfo m3837(int i2, float f, float f2, float f3) {
        if (C1160.m4437() < 0) {
            return AccessibilityNodeInfo.RangeInfo.obtain(i2, f, f2, f3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۦ, reason: not valid java name and contains not printable characters */
    public static SparseArray m3838(Object obj) {
        if (C1121.m2777() > 0) {
            return ((C0008i) obj).f20c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3839(Object obj, Object obj2, Object obj3) {
        if (C1168.m4797() < 0) {
            return ((ActionMode.Callback) obj).onActionItemClicked((ActionMode) obj2, (MenuItem) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۡۢۧ, reason: not valid java name and contains not printable characters */
    public static String m3840(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۦۦ۟, reason: not valid java name and contains not printable characters */
    public static Object m3841(Object obj) {
        if (C1134.m3300() <= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2561j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۨۨ, reason: not valid java name and contains not printable characters */
    public static int m3842() {
        return (-263) ^ C1155.f4881;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m3843(Object obj, int i2) {
        if (C1140.m3595() > 0) {
            return ((AbstractC0401b) obj).m1104j(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۡ, reason: not valid java name and contains not printable characters */
    public static void m3844(Object obj) {
        if (C1148.m3908() >= 0) {
            ((AbstractActivityC0669k) obj).m1895m();
        }
    }

    /* JADX INFO: renamed from: ۠ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static void m3845(Object obj, Object obj2) {
        if (C1155.m4177() > 0) {
            ((Dialog) obj).setOnShowListener((DialogInterface.OnShowListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3846(Object obj, Object obj2, Object obj3) {
        if (m3842() <= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).m1839G((C0647C) obj2, (KeyEvent) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m3847(Object obj, Object obj2, Object obj3) {
        if (C1147.m1498() < 0) {
            ((LayoutInflaterFactory2C0648D) obj).m1837E((C0647C) obj2, (KeyEvent) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static C0678t m3848(Object obj) {
        if (C1151.m4000() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2571t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۡۨ, reason: not valid java name and contains not printable characters */
    public static int m3849(Object obj) {
        if (C1122.m2810() < 0) {
            return ((ViewOnClickListenerC0347u) obj).f986a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۥۦ, reason: not valid java name and contains not printable characters */
    public static void m3850(Object obj) {
        if (C1178.m5174() <= 0) {
            AbstractC0383m.m1053s(obj);
        }
    }

    /* JADX INFO: renamed from: ۣۡۤ۟, reason: not valid java name and contains not printable characters */
    public static void m3851(Object obj, int i2) {
        if (C1132.m3217() >= 0) {
            ((ViewGroup) obj).removeViewAt(i2);
        }
    }

    /* JADX INFO: renamed from: ۡۨۡۤ, reason: not valid java name and contains not printable characters */
    public static C0790e m3852(Object obj, Object obj2) {
        if (C1125.m2937() >= 0) {
            return ((WindowCallbackC0683y) obj).m1919e((ActionMode.Callback) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۥۣ, reason: not valid java name and contains not printable characters */
    public static void m3853(Object obj, Object obj2) {
        if (C1135.m3328() > 0) {
            ((Activity) obj).runOnUiThread((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m3854(Object obj) {
        if (C1170.m4847() > 0) {
            ((C1023b) obj).remove();
        }
    }

    /* JADX INFO: renamed from: ۢۦۨۡ, reason: not valid java name and contains not printable characters */
    public static Context m3855(Object obj) {
        if (C1172.m4932() < 0) {
            return ((View) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۥ, reason: not valid java name and contains not printable characters */
    public static ApplicationInfo m3856(Object obj) {
        if (C1140.m3595() >= 0) {
            return ((Context) obj).getApplicationInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static TextInputEditText m3857(Object obj) {
        if (C1178.m5174() < 0) {
            return ((MainActivity) obj).f2470E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static C0001b m3858(Object obj) {
        if (C1162.m4523() < 0) {
            return ((AbstractActivityC0669k) obj).f2697s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۟ۢ, reason: contains not printable characters */
    public static int m3859(Object obj) {
        if (C1128.m3066() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2548U;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥۦۤ, reason: contains not printable characters */
    public static void m3860(Object obj, float f, float f2, Object obj2) {
        if (C1168.m4797() < 0) {
            ((Canvas) obj).drawPoint(f, f2, (Paint) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۧۡۡ, reason: contains not printable characters */
    public static void m3861(Object obj, float f) {
        if (C1163.m4579() > 0) {
            ((View) obj).setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: ۦۧۦ۟, reason: contains not printable characters */
    public static Paint.Style m3862() {
        if (C1131.m3177() <= 0) {
            return Paint.Style.STROKE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۡ۟, reason: contains not printable characters */
    public static WeakReference m3863(Object obj) {
        if (m3842() < 0) {
            return ((C0249a0) obj).f792a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۥ, reason: contains not printable characters */
    public static int m3864(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m3865(Object obj, Object obj2) {
        if (C1173.m4990() < 0) {
            ((View) obj).removeOnLayoutChangeListener((View.OnLayoutChangeListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static CheckableImageButton m3866(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((TextInputLayout) obj).getEndIconView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۦ۠, reason: not valid java name and contains not printable characters */
    public static AbstractActivityC0669k m3867(Object obj) {
        if (C1169.m4842() < 0) {
            return ((C0550t) obj).f1809t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۡ۟, reason: not valid java name and contains not printable characters */
    public static void m3868(Object obj) {
        if (C1167.m4739() <= 0) {
            ((RunnableC0744d) obj).run();
        }
    }

    /* JADX INFO: renamed from: ۨۦۤۧ, reason: not valid java name and contains not printable characters */
    public static void m3869(Object obj, int i2) {
        if (C1149.m3923() < 0) {
            ((View) obj).setLayoutDirection(i2);
        }
    }

    /* JADX INFO: renamed from: ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static View.OnFocusChangeListener m3870(Object obj) {
        if (C1137.m3457() < 0) {
            return ((View) obj).getOnFocusChangeListener();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۥۧ, reason: not valid java name and contains not printable characters */
    public static String m3828(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
