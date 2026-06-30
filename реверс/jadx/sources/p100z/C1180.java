package p100z;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.AdapterView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractC0537g;
import androidx.fragment.app.C0518H;
import androidx.lifecycle.C1147;
import androidx.lifecycle.EnumC0580l;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.internal.C1156;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import p000A.C0001b;
import p000A.ViewGroupOnHierarchyChangeListenerC0004e;
import p005C0.C0045k;
import p010F0.C0089d;
import p014H0.C1124;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.C0203i;
import p023M0.C0205k;
import p023M0.C0207m;
import p023M0.C0219y;
import p023M0.C1127;
import p024N.C0295x0;
import p024N.C1128;
import p024N.InterfaceC0252c;
import p025N0.C1130;
import p025N0.C1131;
import p029P0.C1133;
import p031Q0.C0339m;
import p037T0.C1136;
import p038U.C1137;
import p042W.C1139;
import p050a0.C1142;
import p051a1.C1144;
import p051a1.C1145;
import p052b0.C1152;
import p058d0.C0643;
import p058d0.C1158;
import p060e.AbstractC0676r;
import p060e.C0658N;
import p060e.C0661c;
import p060e.C0665g;
import p060e.LayoutInflaterFactory2C0648D;
import p068h0.C1162;
import p070i0.C1163;
import p073k0.C1167;
import p074l.AbstractC0909X0;
import p074l.C0884K0;
import p075l0.C1168;
import p077m0.C1169;
import p084q.C1028g;
import p084q.C1172;
import p084q.C1173;
import p086r.C1174;
import p092u0.C1176;
import p096w0.C1177;
import p097x.C1178;

/* JADX INFO: renamed from: z.۟ۤۥۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1180 {

    /* JADX INFO: renamed from: ۟۟ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static int f4923 = -101;

    /* JADX INFO: renamed from: ۟۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static EnumC0580l m5240() {
        if (C1147.m1498() < 0) {
            return EnumC0580l.ON_STOP;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static int m5241() {
        return (-977) ^ C1127.f4842;
    }

    /* JADX INFO: renamed from: ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static View m5242(Object obj) {
        if (C1176.m5115() < 0) {
            return ((ActionBarContextView) obj).f1304k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m5243(Object obj, int i2) {
        if (C1152.m4038() > 0) {
            ((LayoutInflaterFactory2C0648D) obj).m1856s(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۢ, reason: not valid java name and contains not printable characters */
    public static void m5244(Object obj, Object obj2) {
        if (C1174.m5008() > 0) {
            ((View) obj).setBackground((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۦ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m5245(Object obj, Object obj2) {
        if (C1162.m4523() < 0) {
            return ((StringBuilder) obj).append((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۧۢ, reason: not valid java name and contains not printable characters */
    public static void m5246(Object obj, Object obj2) {
        if (C1169.m4842() < 0) {
            ((InterfaceC0252c) obj).mo36a((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m5247(Object obj, int i2, int i3) {
        if (C1130.m3165() > 0) {
            ((Window) obj).setFlags(i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m5248(Object obj, Object obj2) {
        if (C1172.m4932() < 0) {
            return Objects.equals(obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m5249(Object obj) {
        if (C1157.m4271() > 0) {
            return ((Parcel) obj).readString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static float m5250(Object obj) {
        if (C1177.m5152() > 0) {
            return ((C0219y) obj).f754i;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m5251(Object obj, boolean z2) {
        if (C1173.m4990() < 0) {
            ((ViewParent) obj).requestDisallowInterceptTouchEvent(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5252(Object obj) {
        if (C1144.m3748() < 0) {
            return ((C0658N) obj).f2615I;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static void m5253(Object obj, boolean z2) {
        if (C1163.m4579() > 0) {
            ((AbstractC0909X0) obj).setChecked(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static void m5254(Object obj) {
        if (C1152.m4038() > 0) {
            ((AbstractC0537g) obj).m1426c();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5255(Object obj, Object obj2) {
        if (C0643.m4322() < 0) {
            return ((Window.Callback) obj).dispatchTouchEvent((MotionEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۤۧۧ, reason: not valid java name and contains not printable characters */
    public static C1028g m5256() {
        if (C1133.m3246() <= 0) {
            return AbstractC0676r.f2715g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedDispatcher m5257(Object obj) {
        if (C0643.m4322() < 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2559f0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۠, reason: not valid java name and contains not printable characters */
    public static Paint m5258(Object obj) {
        if (C1139.m3541() >= 0) {
            return ((AbstractC0165g) obj).f542f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static LayoutInflater.Factory2 m5259(Object obj) {
        if (C1176.m5115() < 0) {
            return ((LayoutInflater) obj).getFactory2();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m5260(Object obj) {
        if (C1167.m4739() <= 0) {
            return ((TextInputLayout) obj).getCounterMaxLength();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟۠, reason: not valid java name and contains not printable characters */
    public static void m5261(Object obj, Object obj2) {
        if (C1137.m3457() <= 0) {
            ((AbstractC0165g) obj).m576a((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static String m5262() {
        if (C1145.m3805() <= 0) {
            return "ۤۨ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۨۨ, reason: not valid java name and contains not printable characters */
    public static C0665g m5263(Object obj) {
        if (C1154.m4128() >= 0) {
            return ((C0661c) obj).f2637a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۥ, reason: not valid java name and contains not printable characters */
    public static int m5264(Object obj) {
        if (C1172.m4932() <= 0) {
            return ((Configuration) obj).navigation;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static void m5266(Object obj, Object obj2) {
        if (C1169.m4842() <= 0) {
            ((Configuration) obj).setLayoutDirection((Locale) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5267(Object obj) {
        if (C1128.m3066() >= 0) {
            return ((C0339m) obj).f966d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۨ۟, reason: not valid java name and contains not printable characters */
    public static void m5268(Object obj, Object obj2, Object obj3, int i2, long j2) {
        if (C1137.m3457() < 0) {
            ((AdapterView.OnItemClickListener) obj).onItemClick((AdapterView) obj2, (View) obj3, i2, j2);
        }
    }

    /* JADX INFO: renamed from: ۢۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m5269(Object obj) {
        if (C1126.m2964() <= 0) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m5270(Object obj, Object obj2) {
        if (C1126.m2964() <= 0) {
            return ((Enum) obj).compareTo((Enum) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static CoordinatorLayout m5271(Object obj) {
        if (C1136.m3395() <= 0) {
            return ((ViewGroupOnHierarchyChangeListenerC0004e) obj).f2a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5272(Object obj) {
        if (C1158.m4364() <= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2535H;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۢۧۢ, reason: not valid java name and contains not printable characters */
    public static String m5273() {
        if (C1157.m4271() > 0) {
            return "۟ۡۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static int m5274(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5275(Object obj) {
        if (C1144.m3748() < 0) {
            return ((C0518H) obj).m1366i();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static boolean m5276(Object obj, int i2) {
        if (C1163.m4579() >= 0) {
            return ((AbstractC0165g) obj).m588m(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧ, reason: contains not printable characters */
    public static C0884K0 m5277(Object obj) {
        if (C1168.m4797() < 0) {
            return ((C0219y) obj).f750e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۦۤ, reason: contains not printable characters */
    public static Object m5278(Object obj) {
        if (C1156.m4236() > 0) {
            return ((C0203i) obj).f659b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۨ, reason: contains not printable characters */
    public static boolean m5279(Object obj, int i2) {
        if (C1144.m3748() <= 0) {
            return ((Resources) obj).getBoolean(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۢۦ, reason: contains not printable characters */
    public static String m5280(Object obj) {
        if (C1124.m2896() >= 0) {
            return MainActivity.m1817t((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۢ, reason: contains not printable characters */
    public static C0295x0 m5281(Object obj, Object obj2) {
        if (C1178.m5174() < 0) {
            return C0295x0.m920g((View) obj, (WindowInsets) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static C0001b m5282(Object obj) {
        if (C1128.m3066() > 0) {
            return ((C0339m) obj).f968f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static C0207m m5283(Object obj) {
        if (C1172.m4932() < 0) {
            return ((C0205k) obj).f661a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۧۡ, reason: not valid java name and contains not printable characters */
    public static void m5284(Object obj) {
        if (C1157.m4271() > 0) {
            ((AbstractC0165g) obj).m587l();
        }
    }

    /* JADX INFO: renamed from: ۣۨ۠۟, reason: not valid java name and contains not printable characters */
    public static String m5285(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i4 = 0; i4 < length; i4++) {
            byteArray[i4] = (byte) (byteArray[i4] ^ str2.charAt(i4 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۨۡ, reason: not valid java name and contains not printable characters */
    public static void m5286(Object obj, Object obj2, Object obj3) {
        if (C1163.m4579() >= 0) {
            ((C0045k) obj).m271b((C0089d) obj2, (Context) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۨۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5287(Object obj) {
        if (C1124.m2896() >= 0) {
            return ((Matrix) obj).isIdentity();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۤۤۧ, reason: not valid java name and contains not printable characters */
    public static void m5288(Object obj, Object obj2) {
        if (C1142.m3681() < 0) {
            ((View) obj).addOnLayoutChangeListener((View.OnLayoutChangeListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۦۤۥ, reason: not valid java name and contains not printable characters */
    public static long m5289(Object obj) {
        if (C1131.m3177() < 0) {
            return ((Animator) obj).getStartDelay();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static String m5265(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
