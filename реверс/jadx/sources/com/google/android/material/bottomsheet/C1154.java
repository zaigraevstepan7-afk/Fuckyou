package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Adapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C1156;
import com.google.android.material.internal.CheckableImageButton;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import p001A0.AbstractC0016e;
import p001A0.C1121;
import p004C.AbstractC0027h;
import p011G.C1123;
import p019K0.AbstractC0165g;
import p023M0.C0188A;
import p023M0.C0207m;
import p023M0.C0212r;
import p023M0.C0216v;
import p023M0.C0217w;
import p023M0.ViewOnTouchListenerC0204j;
import p024N.C1128;
import p025N0.C1130;
import p025N0.C1131;
import p026O.C1132;
import p029P0.C1133;
import p031Q0.ViewOnClickListenerC0347u;
import p034S.InterfaceC0363g;
import p037T0.C1135;
import p037T0.C1136;
import p041V0.C1138;
import p050a0.C1142;
import p050a0.C1143;
import p051a1.C1145;
import p052b0.C1151;
import p052b0.C1152;
import p060e.AbstractActivityC0669k;
import p060e.C0647C;
import p060e.C0665g;
import p060e.C0668j;
import p060e.DialogInterfaceC0666h;
import p060e.LayoutInflaterFactory2C0648D;
import p060e.RunnableC0659a;
import p060e.WindowCallbackC0683y;
import p066g0.C0764o;
import p066g0.C1160;
import p068h0.C1162;
import p070i0.C1163;
import p072k.C1165;
import p074l.C0927e0;
import p075l0.C1168;
import p077m0.C1169;
import p081o0.C1170;
import p084q.C1173;
import p086r.C1174;
import p092u0.C1176;
import p096w0.C1177;
import p098x0.C1179;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.ۤۢۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1154 {

    /* JADX INFO: renamed from: ۣ۟ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static int f4880 = -954;

    /* JADX INFO: renamed from: ۟۠۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static void m4102(Object obj) {
        if (C1156.m4236() > 0) {
            ((C0188A) obj).m628d();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4104(Object obj) {
        if (C1133.m3246() <= 0) {
            return ((C0764o) obj).f3079a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m4105(Object obj) {
        if (C1168.m4797() <= 0) {
            return ((ValueAnimator) obj).isRunning();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥۤۦ, reason: not valid java name and contains not printable characters */
    public static void m4106(Object obj, float f) {
        if (C1174.m5008() >= 0) {
            ((View) obj).setTransitionAlpha(f);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۦۢ, reason: not valid java name and contains not printable characters */
    public static void m4107(Object obj, boolean z2) {
        if (C1169.m4842() <= 0) {
            ((ActionBarOverlayLayout) obj).setHasNonEmbeddedTabs(z2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m4108(Object obj) {
        if (C1131.m3177() < 0) {
            return ((Adapter) obj).getCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m4109(Object obj, Object obj2) {
        if (C1160.m4437() < 0) {
            ((WindowCallbackC0683y) obj).m1915a((Window.Callback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۢ۠, reason: not valid java name and contains not printable characters */
    public static C0665g m4110(Object obj) {
        if (C1176.m5115() <= 0) {
            return ((RunnableC0659a) obj).f2634d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۢ۠, reason: not valid java name and contains not printable characters */
    public static Uri m4111(Object obj) {
        if (C1138.m3471() >= 0) {
            return ((InterfaceC0363g) obj).mo841c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static int m4112(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠۠, reason: not valid java name and contains not printable characters */
    public static C0647C[] m4113(Object obj) {
        if (C1149.m3923() < 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2539L;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۣ, reason: not valid java name and contains not printable characters */
    public static int m4114(Object obj) {
        if (C1169.m4842() <= 0) {
            return ((AccessibilityEvent) obj).getEventType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۦ, reason: not valid java name and contains not printable characters */
    public static int m4115(Object obj) {
        if (C1165.m4643() > 0) {
            return ((C0217w) obj).f745a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۠۠, reason: not valid java name and contains not printable characters */
    public static int m4116(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((AbstractC0165g) obj).f566r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۡ, reason: not valid java name and contains not printable characters */
    public static String m4117(Object obj) {
        if (C1177.m5152() > 0) {
            return ((Throwable) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢۧ, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimator m4118(Object obj, long j2) {
        if (C1133.m3246() <= 0) {
            return ((ViewPropertyAnimator) obj).setDuration(j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m4119(Object obj) {
        if (C1132.m3217() > 0) {
            return AbstractC0027h.m238e((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static int m4120(Object obj) {
        if (C1173.m4990() <= 0) {
            return ((Configuration) obj).mnc;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4121(Object obj) {
        if (C1136.m3395() < 0) {
            return ((StaggeredGridLayoutManager) obj).m1651D0();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4122(String str) {
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

    /* JADX INFO: renamed from: ۟ۧ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4123(Object obj, Object obj2) {
        if (C1170.m4847() > 0) {
            return ((AccessibilityManager) obj).removeTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۡۨۤ, reason: not valid java name and contains not printable characters */
    public static void m4124(Object obj, Object obj2) {
        if (C1130.m3165() >= 0) {
            ((DialogInterfaceC0666h) obj).m1890f((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠۟۟, reason: not valid java name and contains not printable characters */
    public static void m4125(Object obj, Object obj2) {
        if (C1135.m3328() >= 0) {
            ((View) obj).getLocationOnScreen((int[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4126(Object obj) {
        if (C1152.m4038() > 0) {
            return ((View) obj).getFitsSystemWindows();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static MainActivity m4127(Object obj) {
        if (C1151.m4000() > 0) {
            return ((ViewOnClickListenerC0347u) obj).f987b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static int m4128() {
        return (-642) ^ C1179.f4922;
    }

    /* JADX INFO: renamed from: ۡۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractActivityC0669k m4129(Object obj) {
        if (C1170.m4847() > 0) {
            return ((C0668j) obj).f2696a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۡۨ, reason: not valid java name and contains not printable characters */
    public static int m4130(Object obj) {
        if (C1165.m4643() >= 0) {
            return ((AbstractC0165g) obj).f574w;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۤۤ, reason: not valid java name and contains not printable characters */
    public static void m4131(Object obj, int i2, boolean z2) {
        if (C1150.m3967() >= 0) {
            ((Resources.Theme) obj).applyStyle(i2, z2);
        }
    }

    /* JADX INFO: renamed from: ۢۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static CharSequence m4132(Object obj) {
        if (C1160.m4437() <= 0) {
            return ((C0216v) obj).f741w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۦۤ, reason: not valid java name and contains not printable characters */
    public static void m4133(Object obj, boolean z2) {
        if (C1131.m3177() < 0) {
            ((View) obj).setWillNotDraw(z2);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Paint m4134(Object obj) {
        if (C1143.m3711() < 0) {
            return ((AbstractC0165g) obj).f544g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۤۨ, reason: contains not printable characters */
    public static void m4135(Object obj, Object obj2) {
        if (C1163.m4579() > 0) {
            AbstractC0016e.m199v0((CheckableImageButton) obj, (View.OnLongClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۥۥۢ, reason: contains not printable characters */
    public static void m4136(Object obj, Object obj2, Object obj3) {
        if (C1128.m3066() > 0) {
            C0665g.m1885b((View) obj, (View) obj2, (View) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۦۥۨ, reason: contains not printable characters */
    public static boolean m4137(Object obj, Object obj2) {
        if (C1135.m3328() >= 0) {
            return ((SwipeDismissBehavior) obj).mo1688r((View) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۨۡ۟, reason: contains not printable characters */
    public static C0207m m4138(Object obj) {
        if (C1133.m3246() <= 0) {
            return ((ViewOnTouchListenerC0204j) obj).f660a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۟۠, reason: not valid java name and contains not printable characters */
    public static void m4139(Object obj, boolean z2) {
        if (C1142.m3681() < 0) {
            ((C0212r) obj).m664f(z2);
        }
    }

    /* JADX INFO: renamed from: ۨۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m4140() {
        if (C1145.m3805() < 0) {
            return "ۣۤ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4141(Object obj, Object obj2) {
        if (C1123.m2849() >= 0) {
            return ((Handler) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۡۥ, reason: not valid java name and contains not printable characters */
    public static String m4142(Object obj) {
        if (C1174.m5008() > 0) {
            return MainActivity.m1811A((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۦۣ, reason: not valid java name and contains not printable characters */
    public static C0927e0 m4143(Object obj) {
        if (C1162.m4523() <= 0) {
            return ((C0216v) obj).f736r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static String m4103(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
