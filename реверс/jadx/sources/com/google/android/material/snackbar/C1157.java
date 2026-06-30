package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.AbsSavedState;
import android.view.ContentInfo;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.AbstractActivityC0466k;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.C1147;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.slider.Slider;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p000A.AbstractC0011l;
import p000A.C0001b;
import p001A0.C1121;
import p005C0.AbstractC0047m;
import p014H0.C1124;
import p015I0.C0112h;
import p015I0.C1125;
import p016J.C0133e;
import p019K0.AbstractC0165g;
import p019K0.C0161c;
import p022M.C1126;
import p023M0.C1127;
import p023M0.RunnableC0191D;
import p023M0.ViewOnClickListenerC0195a;
import p024N.C0270l;
import p024N.C1128;
import p025N0.C1129;
import p025N0.C1130;
import p032R.C1134;
import p037T0.C1135;
import p037T0.C1136;
import p038U.C1137;
import p044X.C1140;
import p050a0.C1143;
import p051a1.C1145;
import p052b0.C1152;
import p058d0.C0643;
import p060e.AbstractC0676r;
import p060e.C0647C;
import p060e.C0651G;
import p060e.C0657M;
import p060e.C0658N;
import p060e.C0662d;
import p060e.RunnableC0659a;
import p066g0.C0756j;
import p066g0.C0762m;
import p070i0.C1164;
import p073k0.C1167;
import p074l.C0944k;
import p074l.RunnableC0938i;
import p075l0.C1168;
import p077m0.C1169;
import p081o0.C1170;
import p086r.C1174;
import p089t.C1175;
import p100z.C1180;

/* JADX INFO: renamed from: com.google.android.material.snackbar.ۥۤ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1157 {

    /* JADX INFO: renamed from: ۟ۦۦۧۨ, reason: not valid java name and contains not printable characters */
    public static int f4883 = -745;

    /* JADX INFO: renamed from: ۟۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m4237(Object obj, Object obj2) {
        if (C1167.m4739() < 0) {
            ((ImageView) obj).setScaleType((ImageView.ScaleType) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4238(Object obj, Object obj2, Object obj3) {
        if (C1130.m3165() >= 0) {
            AbstractC0011l.m92a((CoordinatorLayout) obj, (View) obj2, (Matrix) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4239(Object obj) {
        if (C1155.m4177() >= 0) {
            return ((C0658N) obj).f2607A;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m4240() {
        if (C1121.m2777() > 0) {
            return "ۣ۟ۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static int m4241(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۧ, reason: not valid java name and contains not printable characters */
    public static TextView m4242(Object obj) {
        if (C1174.m5008() > 0) {
            return ((MainActivity) obj).f2474I;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m4243(Object obj) {
        if (C1134.m3300() < 0) {
            return ((ContentInfo) obj).getSource();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥ, reason: not valid java name and contains not printable characters */
    public static AbsSavedState m4244() {
        if (C1169.m4842() <= 0) {
            return View.BaseSavedState.EMPTY_STATE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4245(Object obj) {
        if (C1121.m2777() > 0) {
            return ((C0662d) obj).f2656r;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۢۡۨ, reason: not valid java name and contains not printable characters */
    public static ActionBarContainer m4246(Object obj) {
        if (C1125.m2937() > 0) {
            return ((C0658N) obj).f2623s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۤۧ, reason: not valid java name and contains not printable characters */
    public static View m4247(Object obj, int i2) {
        if (C1121.m2777() >= 0) {
            return ((View) obj).findViewById(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۣ, reason: not valid java name and contains not printable characters */
    public static int m4248(Object obj) {
        if (C1125.m2937() > 0) {
            return ((C0647C) obj).f2511c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static void m4249(Object obj, float f, float f2, float f3, Object obj2) {
        if (C1164.m4618() >= 0) {
            ((Canvas) obj).drawCircle(f, f2, f3, (Paint) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static void m4250(Object obj, Object obj2) {
        if (C1147.m1498() < 0) {
            ((CompoundButton) obj).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static float m4251(Object obj) {
        if (C1137.m3457() <= 0) {
            return ((Slider) obj).getValueFrom();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static AtomicInteger m4252(Object obj) {
        if (C1152.m4038() >= 0) {
            return ((AbstractActivityC0466k) obj).f1186j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۤ, reason: not valid java name and contains not printable characters */
    public static View m4253(Object obj) {
        if (C1154.m4128() >= 0) {
            return ((RunnableC0659a) obj).f2632b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m4254(Object obj) {
        if (C1146.m3842() <= 0) {
            return ((C0161c) obj).f500b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Drawable m4255(Object obj) {
        if (C1143.m3711() <= 0) {
            return ((C0762m) obj).f3052d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۤ, reason: not valid java name and contains not printable characters */
    public static RunnableC0938i m4256(Object obj) {
        if (C1170.m4847() > 0) {
            return ((C0944k) obj).f3753u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4257(Object obj, int i2, Object obj2) {
        if (C1147.m1498() <= 0) {
            return ((Window.Callback) obj).onMenuOpened(i2, (Menu) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۤ, reason: not valid java name and contains not printable characters */
    public static View m4258(Object obj, int i2) {
        if (C1127.m3025() > 0) {
            return ((Window) obj).findViewById(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static List m4259(Object obj, int i2) {
        if (C1156.m4236() > 0) {
            return ((AccessibilityManager) obj).getEnabledAccessibilityServiceList(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۥۣ, reason: not valid java name and contains not printable characters */
    public static int m4260(Object obj) {
        if (C1124.m2896() >= 0) {
            return ((C0001b) obj).f0a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m4261(Object obj) {
        if (C1127.m3025() >= 0) {
            return ((View) obj).getLayoutDirection();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static void m4262(Object obj) {
        if (C1129.m3120() <= 0) {
            ((C0657M) obj).mo1870g();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4263(Object obj) {
        if (C0643.m4322() <= 0) {
            return ((C0756j) obj).f3021n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۨۢ, reason: not valid java name and contains not printable characters */
    public static void m4264(Object obj) {
        if (C1136.m3395() <= 0) {
            ((Thread) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static Object m4265(Object obj) {
        if (C1135.m3328() > 0) {
            return ((ViewOnClickListenerC0195a) obj).f638b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۨ, reason: not valid java name and contains not printable characters */
    public static OutputStream m4266(Object obj) {
        if (C1170.m4847() >= 0) {
            return ((Process) obj).getOutputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m4267(Object obj) {
        if (C1180.m5241() <= 0) {
            return ((AbstractC0165g) obj).f521M;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤ۠, reason: not valid java name and contains not printable characters */
    public static ViewGroup m4268(Object obj) {
        if (C1128.m3066() > 0) {
            return AbstractC0047m.m276e((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۦۦ, reason: contains not printable characters */
    public static C0270l m4270() {
        if (C1156.m4236() >= 0) {
            return C0270l.f835d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۟۟, reason: contains not printable characters */
    public static int m4271() {
        return 62 ^ C1175.f4918;
    }

    /* JADX INFO: renamed from: ۥۦۡ۠, reason: contains not printable characters */
    public static void m4272(Object obj, Object obj2) {
        if (C1121.m2777() >= 0) {
            ((AccessibilityNodeInfo) obj).setRangeInfo((AccessibilityNodeInfo.RangeInfo) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۨۥۣ, reason: contains not printable characters */
    public static String m4273(String str) {
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

    /* JADX INFO: renamed from: ۦۣۧۥ, reason: contains not printable characters */
    public static boolean m4274(Object obj) {
        if (C1140.m3595() > 0) {
            return ((C0112h) obj).isStateful();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۤ۠, reason: not valid java name and contains not printable characters */
    public static View m4275(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C1168.m4797() < 0) {
            return ((C0651G) obj).m1861f((Context) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۧۧ, reason: not valid java name and contains not printable characters */
    public static C0133e m4276() {
        if (C1137.m3457() < 0) {
            return AbstractC0676r.f2711c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۤ, reason: not valid java name and contains not printable characters */
    public static Drawable m4277(Object obj, int i2) {
        if (C1152.m4038() >= 0) {
            return ((Resources) obj).getDrawable(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠۟, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4278(Object obj) {
        if (C1126.m2964() < 0) {
            return ((AbstractC0165g) obj).f545g0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۤ۟, reason: not valid java name and contains not printable characters */
    public static int m4279(Object obj) {
        if (C0643.m4322() <= 0) {
            return ((RunnableC0191D) obj).f632a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦۣۢ, reason: not valid java name and contains not printable characters */
    public static int m4280(int i2) {
        if (C1145.m3805() <= 0) {
            return View.MeasureSpec.getMode(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۤ, reason: contains not printable characters */
    public static String m4269(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
