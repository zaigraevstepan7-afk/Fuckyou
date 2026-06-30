package p025N0;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.OverScroller;
import androidx.activity.AbstractActivityC0466k;
import androidx.profileinstaller.C1148;
import com.google.android.material.internal.C1156;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputEditText;
import com.reddit.frontpage.ConfigsActivity;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import p000A.C0010k;
import p001A0.C1121;
import p011G.AbstractC0092a;
import p015I0.C1125;
import p019K0.AbstractC0165g;
import p019K0.C0162d;
import p022M.C1126;
import p023M0.C0207m;
import p023M0.C0212r;
import p023M0.C0216v;
import p024N.AbstractC0227E;
import p024N.AbstractC0240S;
import p024N.C0249a0;
import p024N.InterfaceC0251b0;
import p026O.C1132;
import p029P0.C1133;
import p031Q0.C0340n;
import p031Q0.ViewOnClickListenerC0333g;
import p032R.C1134;
import p036T.C0371a;
import p036T.ViewOnTouchListenerC0377g;
import p038U.C1137;
import p041V0.C1138;
import p044X.C1140;
import p050a0.C1142;
import p050a0.C1143;
import p051a1.C1144;
import p051a1.C1145;
import p052b0.C1151;
import p058d0.C0643;
import p058d0.C1158;
import p060e.C0651G;
import p060e.C0665g;
import p060e.LayoutInflaterFactory2C0648D;
import p070i0.C1163;
import p072k.C1165;
import p074l.C0944k;
import p074l.C0980x0;
import p075l0.C1168;
import p081o0.C1170;
import p083p0.C1171;
import p086r.C1174;
import p092u0.C1176;

/* JADX INFO: renamed from: N0.۟ۥ۟ۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1129 {

    /* JADX INFO: renamed from: ۣۣ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static int f4844 = 706;

    /* JADX INFO: renamed from: ۣ۟۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m3094(Object obj) {
        if (C1165.m4643() >= 0) {
            return ((AtomicInteger) obj).getAndIncrement();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static float m3095(Object obj) {
        if (C1138.m3471() >= 0) {
            return ((C0371a) obj).f1016d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۟۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static ConfigsActivity m3096(Object obj) {
        if (C1142.m3681() < 0) {
            return ((ViewOnClickListenerC0333g) obj).f947a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3097(Object obj, Object obj2) {
        if (C1133.m3246() < 0) {
            return ((AccessibilityManager) obj).addTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m3098(Object obj, Object obj2) {
        if (C1174.m5008() >= 0) {
            return AbstractC0227E.m697b((View) obj, (WindowInsets) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟۠, reason: not valid java name and contains not printable characters */
    public static String m3099(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static Integer m3100(int i2) {
        if (C1134.m3300() <= 0) {
            return Integer.valueOf(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static int m3101(Object obj, int i2) {
        if (m3120() <= 0) {
            return ((Resources) obj).getDimensionPixelOffset(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3102(Object obj) {
        if (C1156.m4236() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2537J;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m3103(Object obj, Object obj2, Object obj3) {
        if (C1132.m3217() > 0) {
            return Log.d((String) obj, (String) obj2, (Throwable) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static Property m3104() {
        if (C1157.m4271() >= 0) {
            return View.ALPHA;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3105() {
        if (C1158.m4364() < 0) {
            return "ۦۧۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3106(Object obj, Object obj2) {
        if (C1140.m3595() > 0) {
            return ((View) obj).removeCallbacks((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3107(Object obj) {
        if (C1174.m5008() >= 0) {
            return ((AbstractC0165g) obj).f541e0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۢۡۨ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m3108(Object obj, Object obj2, boolean z2) {
        if (C1148.m3908() >= 0) {
            return ((SharedPreferences.Editor) obj).putBoolean((String) obj2, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۧ, reason: not valid java name and contains not printable characters */
    public static C0162d m3109(Object obj) {
        if (C1138.m3471() >= 0) {
            return ((AbstractC0165g) obj).f546h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static C0980x0 m3110(Object obj) {
        if (C1171.m4901() >= 0) {
            return ((ViewOnTouchListenerC0377g) obj).f1039q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۢۥ, reason: not valid java name and contains not printable characters */
    public static void m3111(Object obj) {
        if (C1121.m2777() > 0) {
            ((OverScroller) obj).abortAnimation();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3112(Object obj) {
        if (C1151.m4000() >= 0) {
            return ((C0944k) obj).m2383i();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static long m3113(Object obj) {
        if (C1137.m3457() < 0) {
            return ((C0207m) obj).f673o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m3115(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C1133.m3246() <= 0) {
            ((C0010k) obj).m81b(obj2, (ArrayList) obj3, (HashSet) obj4);
        }
    }

    /* JADX INFO: renamed from: ۠ۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m3116(Object obj, int i2) {
        if (C1130.m3165() > 0) {
            return ((ArrayList) obj).get(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static EditText m3117(Object obj) {
        if (C1156.m4236() >= 0) {
            return ((C0212r) obj).f703s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3118(Object obj) {
        if (C1142.m3681() < 0) {
            return C0665g.m1884a((View) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static void m3119(Object obj, Object obj2) {
        if (C1125.m2937() >= 0) {
            ((C0249a0) obj).m808d((InterfaceC0251b0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static int m3120() {
        return 729 ^ C1176.f4919;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m3121(Object obj) {
        if (C1145.m3805() <= 0) {
            return ((C0340n) obj).f969a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۡ, reason: not valid java name and contains not printable characters */
    public static void m3122(Object obj, Object obj2) {
        if (C0643.m4322() <= 0) {
            AbstractC0240S.m786q((View) obj, (CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static void m3123(Object obj, Object obj2) {
        if (C1144.m3748() <= 0) {
            ((Configuration) obj).setTo((Configuration) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m3124(Object obj) {
        if (C1163.m4579() > 0) {
            ((ViewGroup) obj).removeAllViews();
        }
    }

    /* JADX INFO: renamed from: ۥۢۦ, reason: contains not printable characters */
    public static boolean m3125(Object obj) {
        if (C1168.m4797() <= 0) {
            return ((AbstractC0165g) obj).f560o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢۧۦ, reason: contains not printable characters */
    public static int m3126(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۧۡۧ, reason: contains not printable characters */
    public static TextInputEditText m3127(Object obj) {
        if (C1170.m4847() > 0) {
            return ((ViewOnClickListenerC0333g) obj).f948b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۤ۠, reason: contains not printable characters */
    public static void m3128(Object obj) {
        if (C1131.m3177() <= 0) {
            ((AbstractC0165g) obj).m591p();
        }
    }

    /* JADX INFO: renamed from: ۣۧۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3129(Object obj) {
        if (C1176.m5115() < 0) {
            return ((KeyEvent) obj).isCtrlPressed();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۤۡ, reason: not valid java name and contains not printable characters */
    public static int[] m3130() {
        if (C1143.m3711() < 0) {
            return C0651G.f2586e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۢۤ, reason: not valid java name and contains not printable characters */
    public static void m3131(Object obj) {
        if (C1125.m2937() >= 0) {
            ((AbstractActivityC0466k) obj).m1168j();
        }
    }

    /* JADX INFO: renamed from: ۣۧۧۧ, reason: not valid java name and contains not printable characters */
    public static void m3132(Object obj, int i2, int i3, int i4, int i5) {
        if (C1130.m3165() > 0) {
            AbstractC0092a.m427f((Drawable) obj, i2, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: ۨۢۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3133(Object obj) {
        if (C1126.m2964() < 0) {
            return ((C0216v) obj).f742x;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨۨۡ, reason: not valid java name and contains not printable characters */
    public static String m3114(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
