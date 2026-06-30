package p015I0;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.window.OnBackInvokedCallback;
import androidx.profileinstaller.C1148;
import androidx.startup.C1149;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.slider.Slider;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import p004C.C1122;
import p005C0.AbstractC0047m;
import p011G.C1123;
import p016J.C0133e;
import p016J.InterfaceC0135g;
import p019K0.AbstractC0165g;
import p019K0.C0162d;
import p023M0.C0188A;
import p023M0.C0216v;
import p023M0.C1127;
import p024N.AbstractC0226D;
import p024N.AbstractC0240S;
import p024N.C0250b;
import p026O.C1132;
import p029P0.C1133;
import p032R.C1134;
import p038U.C1137;
import p050a0.C1143;
import p058d0.C0643;
import p060e.AbstractC0676r;
import p060e.C0647C;
import p060e.C0665g;
import p060e.LayoutInflaterFactory2C0648D;
import p065g.C1159;
import p068h0.C1162;
import p072k.C1165;
import p072k.MenuC0816m;
import p074l.C0927e0;
import p075l0.C1168;
import p079n0.AbstractC1013a;
import p089t.C1175;
import p096w0.C1177;
import p097x.C1178;

/* JADX INFO: renamed from: I0.۟ۡۤۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1125 {

    /* JADX INFO: renamed from: ۦۦۦ۟, reason: contains not printable characters */
    public static int f4829 = -892;

    /* JADX INFO: renamed from: ۟۟ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static float m2923(Object obj, int i2) {
        if (C1122.m2810() < 0) {
            return AbstractC0047m.m275d((Context) obj, i2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۠۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m2924() {
        if (C1175.m5073() > 0) {
            return "ۧۥ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۦۤ, reason: not valid java name and contains not printable characters */
    public static void m2925(Object obj) {
        if (C1123.m2849() > 0) {
            ((ValueAnimator) obj).end();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۨۦ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0135g m2926(Object obj) {
        if (m2937() > 0) {
            return ((C0133e) obj).f439a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static int m2927(Object obj) {
        if (C1137.m3457() <= 0) {
            return ((AbstractC0226D) obj).f765a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m2928() {
        if (C1159.m4411() >= 0) {
            return "ۥ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2930(Object obj, Object obj2) {
        if (C1148.m3908() > 0) {
            return ((Drawable) obj).setState((int[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2931(Object obj) {
        if (C1165.m4643() >= 0) {
            return ((AbstractC0165g) obj).f554l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static Slider m2932(Object obj) {
        if (C1178.m5174() <= 0) {
            return ((C0162d) obj).f501q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static ComponentName m2933(Object obj, Object obj2) {
        if (C1165.m4643() >= 0) {
            return ((Intent) obj).resolveActivity((PackageManager) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2934(Object obj, Object obj2) {
        if (C1154.m4128() >= 0) {
            return ((Activity) obj).shouldUpRecreateTask((Intent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦۦۥ, reason: not valid java name and contains not printable characters */
    public static C0927e0 m2935(Object obj) {
        if (C1162.m4523() <= 0) {
            return ((C0216v) obj).f743y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۥۦ, reason: not valid java name and contains not printable characters */
    public static String m2936() {
        if (C1154.m4128() > 0) {
            return "ۣۨۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟, reason: not valid java name and contains not printable characters */
    public static int m2937() {
        return 643 ^ C1127.f4842;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣ۟, reason: not valid java name and contains not printable characters */
    public static int m2938(Object obj) {
        if (C1122.m2810() < 0) {
            return ((String) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۢ, reason: not valid java name and contains not printable characters */
    public static String m2939(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۢۦ۠, reason: not valid java name and contains not printable characters */
    public static C0188A m2940(Object obj) {
        if (C1149.m3923() < 0) {
            return ((TextInputLayout) obj).f2363b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static String m2941() {
        if (C1177.m5152() >= 0) {
            return "ۧۡ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m2942() {
        if (C1148.m3908() > 0) {
            return "ۨۢۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static PopupWindow m2943(Object obj) {
        if (C1177.m5152() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2574w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m2944(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m2945(Object obj, int i2) {
        if (C1168.m4797() < 0) {
            ((AbstractC0676r) obj).mo1846g(i2);
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static ProgressBar m2946(Object obj) {
        if (C0643.m4322() < 0) {
            return ((MainActivity) obj).f2478z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2947(Object obj) {
        if (C0643.m4322() <= 0) {
            return ((C0647C) obj).f2519k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۢۨ۠, reason: not valid java name and contains not printable characters */
    public static int[] m2948() {
        if (C1123.m2849() > 0) {
            return AbstractC1013a.f4029k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m2949(Object obj) {
        if (C1137.m3457() <= 0) {
            ((MenuC0816m) obj).m2197v();
        }
    }

    /* JADX INFO: renamed from: ۥۤ۠ۦ, reason: contains not printable characters */
    public static String m2950() {
        if (C1178.m5174() <= 0) {
            return "ۥۤۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۨ, reason: contains not printable characters */
    public static void m2951(Object obj, Object obj2) {
        if (C1133.m3246() <= 0) {
            AbstractC0240S.m785p((View) obj, (C0250b) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۨۦۤ, reason: contains not printable characters */
    public static View m2952(Object obj) {
        if (C1134.m3300() < 0) {
            return ((C0665g) obj).f2687w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۥ, reason: contains not printable characters */
    public static void m2953(Object obj, Object obj2) {
        if (C1123.m2849() >= 0) {
            ((View) obj).transformMatrixToGlobal((Matrix) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۢۥۧ, reason: contains not printable characters */
    public static C0133e m2954(Object obj) {
        if (C1143.m3711() < 0) {
            return LayoutInflaterFactory2C0648D.m1832y((Configuration) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2955(Object obj) {
        if (C1157.m4271() > 0) {
            return ((C0647C) obj).f2521m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۨۢۥ, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedCallback m2956(Object obj) {
        if (C1132.m3217() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2560g0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢ۟, reason: not valid java name and contains not printable characters */
    public static String m2929(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
