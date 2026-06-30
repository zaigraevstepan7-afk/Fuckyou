package p038U;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.fragment.app.AbstractComponentCallbacksC0548r;
import androidx.lifecycle.C1147;
import androidx.profileinstaller.C1148;
import androidx.recyclerview.widget.RecyclerView;
import androidx.versionedparcelable.C1150;
import com.google.android.material.internal.C1156;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.ConfigsActivity;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import p000A.C0010k;
import p014H0.C1124;
import p015I0.C1125;
import p019K0.AbstractC0165g;
import p023M0.AbstractC0213s;
import p023M0.C0201g;
import p023M0.C0207m;
import p023M0.C0211q;
import p023M0.C0212r;
import p023M0.C0216v;
import p023M0.ViewOnClickListenerC0195a;
import p024N.AbstractC0226D;
import p024N.C1128;
import p025N0.C1130;
import p026O.C0311k;
import p031Q0.C0339m;
import p031Q0.DialogInterfaceOnClickListenerC0342p;
import p037T0.C1135;
import p037T0.C1136;
import p044X.C1140;
import p050a0.C1143;
import p051a1.C1144;
import p052b0.C1151;
import p052b0.C1152;
import p058d0.C1158;
import p060e.C0658N;
import p060e.C0660b;
import p060e.C0684z;
import p060e.LayoutInflaterFactory2C0648D;
import p060e.RunnableC0677s;
import p060e.ViewOnClickListenerC0650F;
import p060e.WindowCallbackC0683y;
import p066g0.C0756j;
import p066g0.C0762m;
import p066g0.C1160;
import p066g0.C1161;
import p068h0.C1162;
import p070i0.C1164;
import p071j.AbstractC0786a;
import p072k.C1165;
import p073k0.C1167;
import p074l.C0899S0;
import p074l.C0973u;
import p077m0.C1169;
import p083p0.C1171;
import p084q.C1173;
import p086r.C1174;
import p092u0.C1176;
import p096w0.C1177;
import p097x.C1178;
import p098x0.C1179;
import p100z.C1180;

/* JADX INFO: renamed from: U.۟ۦ۠ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1137 {

    /* JADX INFO: renamed from: ۦۥۤۢ, reason: contains not printable characters */
    public static int f4863 = -25;

    /* JADX INFO: renamed from: ۟۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static int m3420(Object obj) {
        if (C1124.m2896() >= 0) {
            return ((AbstractC0165g) obj).f519K;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static View m3421(Object obj) {
        if (C1130.m3165() >= 0) {
            return ((ViewOnClickListenerC0650F) obj).f2579a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m3422(Object obj, Object obj2) {
        if (C1158.m4364() <= 0) {
            ((LocaleManager) obj).setApplicationLocales((LocaleList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static ActivityInfo m3423(Object obj, Object obj2, int i2) {
        if (C1128.m3066() >= 0) {
            return ((PackageManager) obj).getActivityInfo((ComponentName) obj2, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۡۡ, reason: not valid java name and contains not printable characters */
    public static void m3424(Object obj, int i2, int i3, int i4, int i5) {
        if (C1164.m4618() > 0) {
            ((Drawable) obj).setBounds(i2, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static int m3425(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static OutputStream m3426(Object obj) {
        if (C1167.m4739() < 0) {
            return ((URLConnection) obj).getOutputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m3427(Object obj, Object obj2) {
        if (C1144.m3748() <= 0) {
            return ((Context) obj).getSystemService((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۣ, reason: not valid java name and contains not printable characters */
    public static void m3428(Object obj, Object obj2, float f, float f2, Object obj3) {
        if (C1158.m4364() < 0) {
            ((Path) obj).addRoundRect((RectF) obj2, f, f2, (Path.Direction) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static LocaleList m3429(Object obj) {
        if (C1151.m4000() > 0) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۡۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3430(Object obj) {
        if (C1164.m4618() > 0) {
            return ((C0658N) obj).f2608B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static TypedArray m3431(Object obj, Object obj2, Object obj3) {
        if (C1177.m5152() >= 0) {
            return ((Context) obj).obtainStyledAttributes((AttributeSet) obj2, (int[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۧ, reason: not valid java name and contains not printable characters */
    public static C0684z m3432(Object obj) {
        if (C1152.m4038() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2551X;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Class m3433(Object obj, boolean z2, Object obj2) {
        if (C1136.m3395() < 0) {
            return Class.forName((String) obj, z2, (ClassLoader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static void m3434(Object obj) {
        if (C1148.m3908() >= 0) {
            ((LayoutInflaterFactory2C0648D) obj).m1840H();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۡ, reason: not valid java name and contains not printable characters */
    public static Insets m3435(Object obj) {
        if (C1176.m5115() <= 0) {
            return ((WindowInsets) obj).getSystemGestureInsets();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Context m3436(Object obj) {
        if (C1169.m4842() <= 0) {
            return ((Dialog) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static C0899S0 m3437(Object obj) {
        if (C1179.m5236() >= 0) {
            return ((C0973u) obj).f3860a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۤ, reason: not valid java name and contains not printable characters */
    public static void m3439(Object obj, Object obj2) {
        if (C1179.m5236() >= 0) {
            ((AbstractC0213s) obj).mo652o((AccessibilityEvent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۤ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m3440(Object obj) {
        if (C1174.m5008() >= 0) {
            return ((C0756j) obj).f3020m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۢ, reason: not valid java name and contains not printable characters */
    public static RecyclerView m3441(Object obj) {
        if (C1173.m4990() < 0) {
            return ((ConfigsActivity) obj).f2455A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦۢ, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimator m3442(Object obj, Object obj2) {
        if (C1151.m4000() >= 0) {
            return ((ViewPropertyAnimator) obj).setUpdateListener((ValueAnimator.AnimatorUpdateListener) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3443(Object obj) {
        if (C1151.m4000() > 0) {
            return ((AbstractC0213s) obj).mo674k();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧ۟, reason: not valid java name and contains not printable characters */
    public static void m3444(Object obj) {
        if (C1150.m3967() >= 0) {
            ((View) obj).jumpDrawablesToCurrentState();
        }
    }

    /* JADX INFO: renamed from: ۠۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static View.OnClickListener m3445(Object obj) {
        if (C1161.m4510() < 0) {
            return ((AbstractC0213s) obj).mo636f();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static AbstractComponentCallbacksC0548r m3446(Object obj, Object obj2) {
        if (C1169.m4842() <= 0) {
            return ((C0010k) obj).m83d((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static RectF m3447(Object obj) {
        if (C1171.m4901() > 0) {
            return ((C0201g) obj).f655r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m3448(Object obj, Object obj2, Object obj3) {
        if (C1180.m5241() <= 0) {
            ((Resources) obj).updateConfiguration((Configuration) obj2, (DisplayMetrics) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static MainActivity m3449(Object obj) {
        if (m3457() <= 0) {
            return ((DialogInterfaceOnClickListenerC0342p) obj).f975b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m3450(Object obj, Object obj2) {
        if (C1125.m2937() >= 0) {
            ((ActionBarContextView) obj).m1201c((AbstractC0786a) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۤۤ۟, reason: not valid java name and contains not printable characters */
    public static int m3451(Object obj) {
        if (C1174.m5008() > 0) {
            return ((RunnableC0677s) obj).f2718a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۥ۟, reason: not valid java name and contains not printable characters */
    public static int m3452(Object obj) {
        if (C1156.m4236() > 0) {
            return ((C0762m) obj).f3047A;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۦۥ, reason: not valid java name and contains not printable characters */
    public static int m3453(Object obj) {
        if (C1169.m4842() <= 0) {
            return ((DialogInterfaceOnClickListenerC0342p) obj).f974a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦۣۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3454(Object obj) {
        if (C1130.m3165() > 0) {
            return ((C0207m) obj).f670l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۥ۠, reason: not valid java name and contains not printable characters */
    public static int m3455(Object obj, int i2) {
        if (C1162.m4523() < 0) {
            return ((AbstractC0226D) obj).m694a(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۥۣ, reason: not valid java name and contains not printable characters */
    public static ViewOnClickListenerC0195a m3456(Object obj) {
        if (C1143.m3711() < 0) {
            return ((C0207m) obj).f667i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۢ, reason: not valid java name and contains not printable characters */
    public static int m3457() {
        return 400 ^ C1165.f4908;
    }

    /* JADX INFO: renamed from: ۤۤۤۦ, reason: not valid java name and contains not printable characters */
    public static void m3458(Object obj, Object obj2) {
        if (C1171.m4901() >= 0) {
            ((TextInputLayout) obj).setErrorIconDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۥۦۣ, reason: not valid java name and contains not printable characters */
    public static TextView m3459(Object obj) {
        if (C1135.m3328() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2529B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۤۤ, reason: contains not printable characters */
    public static C0339m m3460(Object obj) {
        if (C1179.m5236() > 0) {
            return ((ConfigsActivity) obj).f2460F;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۤۦ, reason: contains not printable characters */
    public static View m3461(Object obj) {
        if (C1164.m4618() > 0) {
            return ((C0660b) obj).f2636b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۡۧ, reason: contains not printable characters */
    public static String m3462(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۥۨ۠ۧ, reason: contains not printable characters */
    public static boolean m3463(Object obj, Object obj2) {
        if (C1146.m3842() < 0) {
            return ((Window.Callback) obj).dispatchTrackballEvent((MotionEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۡۤ, reason: contains not printable characters */
    public static void m3464(Object obj, Object obj2) {
        if (C1147.m1498() <= 0) {
            ((C0311k) obj).m975i((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۥ۟ۧ, reason: contains not printable characters */
    public static boolean m3465(Object obj) {
        if (C1162.m4523() <= 0) {
            return ((C0216v) obj).f735q;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۨۧۥ, reason: contains not printable characters */
    public static File[] m3466(Object obj, Object obj2) {
        if (C1180.m5241() <= 0) {
            return ((File) obj).listFiles((FileFilter) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m1097(Object obj, boolean z2) {
        if (C1160.m4437() < 0) {
            ((Paint) obj).setAntiAlias(z2);
        }
    }

    /* JADX INFO: renamed from: ۧۦۣۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3467(Object obj) {
        if (C1140.m3595() >= 0) {
            return ((WindowCallbackC0683y) obj).f2727d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۧ۠۠, reason: not valid java name and contains not printable characters */
    public static String m3468() {
        if (C1151.m4000() >= 0) {
            return "۠ۤۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۧ, reason: not valid java name and contains not printable characters */
    public static C0211q m3469(Object obj) {
        if (C1178.m5174() <= 0) {
            return ((C0212r) obj).f692h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۡ, reason: not valid java name and contains not printable characters */
    public static String m3438(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
