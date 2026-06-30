package p011G;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.lifecycle.C1147;
import androidx.lifecycle.InterfaceC0586r;
import androidx.profileinstaller.C1148;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.ConfigsActivity;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p005C0.C0048n;
import p014H0.C1124;
import p015I0.C1125;
import p019K0.AbstractC0165g;
import p023M0.C0212r;
import p023M0.C1127;
import p024N.AbstractC0229G;
import p024N.AbstractC0240S;
import p024N.C0270l;
import p024N.C0295x0;
import p026O.C0306f;
import p026O.C0311k;
import p029P0.C1133;
import p031Q0.RunnableC0334h;
import p032R.C1134;
import p034S.InterfaceC0363g;
import p036T.AbstractC0383m;
import p037T0.C1135;
import p038U.C1137;
import p044X.C1140;
import p051a1.C1144;
import p051a1.C1145;
import p052b0.C1152;
import p058d0.C0643;
import p060e.C0665g;
import p060e.HandlerC0663e;
import p060e.RunnableC0671m;
import p065g.C1159;
import p066g0.C1160;
import p066g0.C1161;
import p068h0.C1162;
import p070i0.C1164;
import p073k0.C1167;
import p074l.AbstractC0905V0;
import p074l.C0927e0;
import p081o0.C1170;
import p084q.C1173;

/* JADX INFO: renamed from: G.ۧۡ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1123 {

    /* JADX INFO: renamed from: ۣ۟۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static int f4827 = 19;

    /* JADX INFO: renamed from: ۟۟ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static void m2842(Object obj) {
        if (C1173.m4990() < 0) {
            ((Editable) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static void m2843(Object obj) {
        if (C1127.m3025() > 0) {
            ((Window.Callback) obj).onContentChanged();
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static HandlerC0663e m2844(Object obj) {
        if (C1161.m4510() < 0) {
            return ((C0665g) obj).f2663E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۧۨ, reason: not valid java name and contains not printable characters */
    public static C0048n m2845(Object obj) {
        if (C1162.m4523() < 0) {
            return C0048n.m281x((InterfaceC0586r) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۨۧ, reason: not valid java name and contains not printable characters */
    public static Object m2846(Object obj) {
        if (C1159.m4411() >= 0) {
            return ((C0270l) obj).f837b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۢۨ, reason: not valid java name and contains not printable characters */
    public static void m2847(Object obj, Object obj2) {
        if (C1124.m2896() >= 0) {
            ((C0311k) obj).m969b((C0306f) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static C0927e0 m2848(Object obj) {
        if (C1140.m3595() >= 0) {
            return ((C0212r) obj).f701q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static int m2849() {
        return (-998) ^ C1145.f4871;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Parcelable m2850(Object obj) {
        if (C0643.m4322() <= 0) {
            return ((AbsSavedState) obj).getSuperState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m2851(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m2852(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m2853(Object obj, int i2, int i3) {
        if (C1148.m3908() >= 0) {
            return ((TypedArray) obj).getInt(i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static int m2854(int i2, Object obj) {
        if (C1133.m3246() < 0) {
            return TypedValue.complexToDimensionPixelSize(i2, (DisplayMetrics) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢ۟, reason: not valid java name and contains not printable characters */
    public static int m2855(Object obj) {
        if (C1147.m1498() <= 0) {
            return ((TextInputLayout) obj).f2400t0;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static float m2856(Object obj) {
        if (C1152.m4038() >= 0) {
            return ((View) obj).getTransitionAlpha();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦۨ, reason: not valid java name and contains not printable characters */
    public static void m2857(Object obj, Object obj2, Object obj3) {
        if (C1137.m3457() <= 0) {
            ((Parcel) obj).readList((List) obj2, (ClassLoader) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m2858(Object obj, Object obj2) {
        if (C1155.m4177() >= 0) {
            return ((Window.Callback) obj).dispatchGenericMotionEvent((MotionEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۢۡۨ, reason: not valid java name and contains not printable characters */
    public static String m2859(Object obj) {
        if (C1125.m2937() >= 0) {
            return ((File) obj).getAbsolutePath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m2861() {
        if (C1147.m1498() <= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠۠, reason: not valid java name and contains not printable characters */
    public static String m2862() {
        if (C1144.m3748() < 0) {
            return ConfigsActivity.m1801v();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۤ۟, reason: not valid java name and contains not printable characters */
    public static MaterialSwitch m2863(Object obj) {
        if (C1164.m4618() >= 0) {
            return ((MainActivity) obj).f2472G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۤۥ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m2864(Object obj, Object obj2, int i2) {
        if (C1133.m3246() <= 0) {
            return ((Context) obj).getSharedPreferences((String) obj2, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۤۤ, reason: not valid java name and contains not printable characters */
    public static int m2865(Object obj) {
        if (C1167.m4739() <= 0) {
            return ((Configuration) obj).uiMode;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m2866(Object obj) {
        if (C1145.m3805() < 0) {
            return ((RunnableC0334h) obj).f954d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m2867(Object obj) {
        if (C1160.m4437() <= 0) {
            return ((C0212r) obj).f695k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m2868(Object obj, boolean z2) {
        if (C1152.m4038() > 0) {
            ((TextInputLayout) obj).setEndIconVisible(z2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static C0295x0 m2869(Object obj) {
        if (C1134.m3300() < 0) {
            return AbstractC0240S.m777h((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static Uri m2870(Object obj) {
        if (C1133.m3246() <= 0) {
            return ((InterfaceC0363g) obj).mo843e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢ, reason: not valid java name and contains not printable characters */
    public static void m2871(Object obj, Object obj2) {
        if (C1156.m4236() > 0) {
            ((ActionBarContainer) obj).setTabContainer((AbstractC0905V0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۢۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m2872(Object obj) {
        if (C1159.m4411() >= 0) {
            return ((RectF) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨ۠۠, reason: not valid java name and contains not printable characters */
    public static TimeUnit m2873() {
        if (C1135.m3328() > 0) {
            return TimeUnit.MILLISECONDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۧۥ, reason: contains not printable characters */
    public static Context m2874(Object obj, Object obj2) {
        if (C1159.m4411() >= 0) {
            return ((Context) obj).createConfigurationContext((Configuration) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۥۧ, reason: contains not printable characters */
    public static float[] m2875(Object obj) {
        if (C1137.m3457() <= 0) {
            return ((AbstractC0165g) obj).f531W;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۨۦ, reason: contains not printable characters */
    public static void m2876(Object obj, Object obj2) {
        if (C1125.m2937() >= 0) {
            ((AbstractC0383m) obj).mo1062M((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۤۦ, reason: contains not printable characters */
    public static void m2877(Object obj, float f) {
        if (m2849() >= 0) {
            AbstractC0229G.m717s((View) obj, f);
        }
    }

    /* JADX INFO: renamed from: ۦۤۨۤ, reason: contains not printable characters */
    public static String m2878() {
        if (C1160.m4437() < 0) {
            return "ۦۣۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۧ, reason: contains not printable characters */
    public static boolean m2879() {
        if (C1160.m4437() < 0) {
            return AbstractC0383m.f1047f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥۧۧ, reason: not valid java name and contains not printable characters */
    public static int m2880(Object obj) {
        if (C1135.m3328() >= 0) {
            return ((ViewGroup.MarginLayoutParams) obj).leftMargin;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۤۡ, reason: not valid java name and contains not printable characters */
    public static int m2881(Object obj) {
        if (C1170.m4847() >= 0) {
            return ((RunnableC0671m) obj).f2703a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۧۥ, reason: not valid java name and contains not printable characters */
    public static String m2860(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
