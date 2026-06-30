package p014H0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowInsets;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.AbstractC0537g;
import androidx.profileinstaller.C1148;
import androidx.startup.C1149;
import com.google.android.material.internal.C1156;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p000A.C0001b;
import p011G.C1123;
import p016J.C0133e;
import p019K0.AbstractC0165g;
import p019K0.C0164f;
import p023M0.C0188A;
import p023M0.C0216v;
import p025N0.C1129;
import p032R.C1134;
import p037T0.C1135;
import p044X.C1140;
import p050a0.C1142;
import p050a0.C1143;
import p051a1.C1145;
import p052b0.C1151;
import p052b0.C1152;
import p058d0.C0643;
import p060e.AbstractC0676r;
import p060e.AbstractServiceC0653I;
import p060e.C0651G;
import p060e.LayoutInflaterFactory2C0648D;
import p065g.C1159;
import p066g0.C0756j;
import p068h0.C1162;
import p070i0.C1163;
import p072k.ViewOnKeyListenerC0810g;
import p072k.ViewTreeObserverOnGlobalLayoutListenerC0807d;
import p073k0.C1166;
import p074l.C0956o;
import p075l0.C1168;
import p077m0.C1169;
import p083p0.C1171;
import p084q.C1031j;
import p084q.C1172;
import p086r.C1174;
import p089t.C1175;
import p092u0.C1176;
import p100z.C1180;

/* JADX INFO: renamed from: H0.ۦۥۣۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1124 {

    /* JADX INFO: renamed from: ۣۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static int f4828 = 314;

    /* JADX INFO: renamed from: ۟۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static Object m2882(Object obj, Object obj2) {
        if (C1149.m3923() < 0) {
            return ((C1031j) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m2883(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۦۤۢ, reason: not valid java name and contains not printable characters */
    public static float m2884(Object obj, int i2, float f) {
        if (C1152.m4038() >= 0) {
            return ((TypedArray) obj).getFloat(i2, f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡۦۦۡ, reason: not valid java name and contains not printable characters */
    public static String m2885() {
        if (C1129.m3120() < 0) {
            return "۟۠ۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۢۦ, reason: not valid java name and contains not printable characters */
    public static Locale m2886(Object obj) {
        if (C1174.m5008() >= 0) {
            return ((Configuration) obj).locale;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۢۨ, reason: not valid java name and contains not printable characters */
    public static void m2887(Object obj, Object obj2) {
        if (C1142.m3681() < 0) {
            ((View) obj).addOnAttachStateChangeListener((View.OnAttachStateChangeListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۦ, reason: not valid java name and contains not printable characters */
    public static void m2888(Object obj, boolean z2) {
        if (C1140.m3595() > 0) {
            ((NestedScrollView) obj).setNestedScrollingEnabled(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۥ۟, reason: not valid java name and contains not printable characters */
    public static void m2889(Object obj) {
        if (C1146.m3842() < 0) {
            ((LayoutInflaterFactory2C0648D) obj).m1858u();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static C1031j m2890() {
        if (C1134.m3300() <= 0) {
            return C0651G.f2589h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static C0133e m2891() {
        if (C1169.m4842() <= 0) {
            return AbstractC0676r.f2712d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤۡ, reason: not valid java name and contains not printable characters */
    public static int m2892(Object obj) {
        if (C1159.m4411() > 0) {
            return ((ViewConfiguration) obj).getScaledTouchSlop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۧ, reason: not valid java name and contains not printable characters */
    public static TextInputLayout m2893(Object obj) {
        if (m2896() > 0) {
            return ((C0188A) obj).f618a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦ۠, reason: not valid java name and contains not printable characters */
    public static Boolean m2894() {
        if (C1129.m3120() < 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2895(Object obj) {
        if (C1176.m5115() <= 0) {
            return ((C0756j) obj).f3019l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۤ, reason: not valid java name and contains not printable characters */
    public static int m2896() {
        return (-973) ^ C1180.f4923;
    }

    /* JADX INFO: renamed from: ۟ۦۣۥۡ, reason: not valid java name and contains not printable characters */
    public static Long m2897(long j2) {
        if (C1175.m5073() >= 0) {
            return Long.valueOf(j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣ۟, reason: not valid java name and contains not printable characters */
    public static List m2898(Object obj, int i2, int i3) {
        if (C1148.m3908() >= 0) {
            return ((ArrayList) obj).subList(i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static ViewTreeObserverOnGlobalLayoutListenerC0807d m2899(Object obj) {
        if (C1162.m4523() <= 0) {
            return ((ViewOnKeyListenerC0810g) obj).f3286i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m2900(Object obj, int i2) {
        if (C1169.m4842() <= 0) {
            ((Paint) obj).setAlpha(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Object m2901(Object obj) {
        if (C1171.m4901() >= 0) {
            return ((C0001b) obj).f1b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2902(Object obj, int i2) {
        if (C1159.m4411() >= 0) {
            ((Configuration) obj).colorMode = i2;
        }
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2903(Object obj) {
        if (C1146.m3842() <= 0) {
            return ((TextInputLayout) obj).f2402u0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m2904(Object obj, Object obj2) {
        if (C1166.m4699() > 0) {
            return ((WindowInsets.Builder) obj).setSystemWindowInsets((Insets) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۥۣ, reason: not valid java name and contains not printable characters */
    public static int m2905(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m2906(Object obj) {
        if (C1143.m3711() < 0) {
            return ((AbstractC0165g) obj).f510B;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static C0956o m2907(Object obj, Object obj2, Object obj3) {
        if (C1157.m4271() > 0) {
            return ((C0651G) obj).mo1786a((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡ۟, reason: not valid java name and contains not printable characters */
    public static String m2908(Object obj, Object obj2) {
        if (C1151.m4000() >= 0) {
            return ((MainActivity) obj).m1821D((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۠۟, reason: not valid java name and contains not printable characters */
    public static Intent m2910(Object obj, int i2) {
        if (C1146.m3842() <= 0) {
            return ((Intent) obj).addFlags(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2911(Object obj, Object obj2, boolean z2) {
        if (C1163.m4579() > 0) {
            return ((SharedPreferences) obj).getBoolean((String) obj2, z2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2912(Object obj, Object obj2, Object obj3) {
        if (C1148.m3908() > 0) {
            return ((Canvas) obj).clipRect((RectF) obj2, (Region.Op) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m2913(Object obj, Object obj2) {
        if (C1168.m4797() < 0) {
            return ((WindowInsets.Builder) obj).setMandatorySystemGestureInsets((Insets) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m2914(Object obj) {
        if (C1123.m2849() >= 0) {
            return ((C0164f) obj).f506c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۥ, reason: not valid java name and contains not printable characters */
    public static String m2915() {
        if (C1172.m4932() < 0) {
            return "ۣۢۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m2916(Object obj) {
        if (C1146.m3842() < 0) {
            return ((Configuration) obj).smallestScreenWidthDp;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۦۤۡ, reason: not valid java name and contains not printable characters */
    public static void m2917(Object obj) {
        if (C1156.m4236() > 0) {
            ((AbstractC0537g) obj).mo1431h();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static int m2918() {
        if (C0643.m4322() < 0) {
            return AbstractServiceC0653I.f2591a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۡ۟ۢ, reason: contains not printable characters */
    public static String m2919(Object obj) {
        if (C1145.m3805() < 0) {
            return ((Class) obj).getSimpleName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۥۥ, reason: contains not printable characters */
    public static String m2920() {
        if (C1135.m3328() > 0) {
            return "ۣۤ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢ۟, reason: not valid java name and contains not printable characters */
    public static void m2921(Object obj) {
        if (C1152.m4038() > 0) {
            ((C0216v) obj).m677b();
        }
    }

    /* JADX INFO: renamed from: ۧۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m2922(Object obj) {
        if (C1162.m4523() <= 0) {
            return ((Context) obj).getPackageName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m2909(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
