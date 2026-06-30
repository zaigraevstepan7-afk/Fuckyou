package p073k0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.widget.AutoCompleteTextView;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.fragment.app.AbstractComponentCallbacksC0548r;
import androidx.fragment.app.C0523M;
import androidx.fragment.app.C0528S;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.ConfigsActivity;
import java.io.ByteArrayOutputStream;
import p001A0.C1121;
import p014H0.C1124;
import p019K0.AbstractC0165g;
import p023M0.C0197c;
import p023M0.C0199e;
import p023M0.C0207m;
import p023M0.C0216v;
import p023M0.C1127;
import p024N.C1128;
import p026O.C1132;
import p031Q0.C0346t;
import p036T.AbstractC0383m;
import p037T0.C1135;
import p037T0.C1136;
import p045X0.C1141;
import p050a0.C1143;
import p051a1.AbstractC0451c;
import p052b0.C1151;
import p058d0.C0643;
import p058d0.C1158;
import p060e.LayoutInflaterFactory2C0648D;
import p065g.C1159;
import p066g0.C1160;
import p070i0.C1163;
import p070i0.C1164;
import p072k.C1165;
import p074l.C0893P;
import p074l.C0900T;
import p075l0.C1168;
import p089t.C1175;
import p092u0.C1059c;
import p096w0.C1092c;
import p098x0.C1179;
import p100z.C1180;

/* JADX INFO: renamed from: k0.ۨ۟۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1167 {

    /* JADX INFO: renamed from: ۟ۢ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int f4910 = 987;

    /* JADX INFO: renamed from: ۟۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static AbstractComponentCallbacksC0548r m4716(Object obj) {
        if (C1165.m4643() > 0) {
            return ((C0523M) obj).f1646c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static int m4717(Object obj) {
        if (C1146.m3842() <= 0) {
            return ((AbstractC0165g) obj).f577z;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m4718(Object obj, int i2) {
        if (C1163.m4579() >= 0) {
            AbstractC0383m.m1044h0((PopupWindow) obj, i2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m4719(Object obj, int i2) {
        if (C1158.m4364() <= 0) {
            return ((String) obj).indexOf(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤۤۦ, reason: not valid java name and contains not printable characters */
    public static void m4720(Object obj) {
        if (C1164.m4618() >= 0) {
            AbstractC0451c.m1143b(obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static void m4721(Object obj, Object obj2) {
        if (C1180.m5241() <= 0) {
            ((View) obj).postOnAnimation((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4722(Object obj) {
        if (C1135.m3328() >= 0) {
            return ((View) obj).performClick();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m4723(Object obj, boolean z2) {
        if (C1175.m5073() >= 0) {
            ((ActionBarOverlayLayout) obj).setShowingForActionMode(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m4724(Object obj) {
        if (C1168.m4797() < 0) {
            ((C0216v) obj).m678c();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨۤۥ, reason: not valid java name and contains not printable characters */
    public static int m4725(Object obj) {
        if (C1157.m4271() >= 0) {
            return ((C0199e) obj).f645e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static void m4726(Object obj, Object obj2) {
        if (C1121.m2777() >= 0) {
            ((LayoutInflaterFactory2C0648D) obj).m1851l((Window) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۤ۠, reason: not valid java name and contains not printable characters */
    public static String m4727(String str) {
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
        for (int i4 = 0; i4 < length; i4++) {
            byteArray[i4] = (byte) (byteArray[i4] ^ str2.charAt(i4 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static int m4728() {
        if (C1127.m3025() >= 0) {
            return ConfigsActivity.f2454H;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static int m4729(Object obj, int i2, int i3) {
        if (C1141.m3607() > 0) {
            return ((TypedArray) obj).getColor(i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧۧۨ, reason: not valid java name and contains not printable characters */
    public static long m4730() {
        if (C1136.m3395() < 0) {
            return AnimationUtils.currentAnimationTimeMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۡۡۧ, reason: not valid java name and contains not printable characters */
    public static int m4731(Object obj) {
        if (C1128.m3066() >= 0) {
            return ((View) obj).getWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۥ, reason: not valid java name and contains not printable characters */
    public static int m4732(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۤۡ۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m4733(Object obj) {
        if (C1132.m3217() > 0) {
            return ((TextInputLayout) obj).getPlaceholderText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۥۢ, reason: not valid java name and contains not printable characters */
    public static int m4734(Object obj) {
        if (C1160.m4437() <= 0) {
            return ((C0346t) obj).f984a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۧۦ, reason: not valid java name and contains not printable characters */
    public static C0900T m4735(Object obj) {
        if (C1151.m4000() >= 0) {
            return ((C0893P) obj).f3594H;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4736(Object obj) {
        if (C1158.m4364() <= 0) {
            return ((View) obj).isAttachedToWindow();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4737(Object obj, int i2) {
        if (C1159.m4411() >= 0) {
            return ((View) obj).canScrollVertically(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨۤ۠, reason: not valid java name and contains not printable characters */
    public static AutoCompleteTextView m4738(Object obj) {
        if (C1136.m3395() < 0) {
            return ((C0207m) obj).f666h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m4739() {
        return (-355) ^ C1166.f4909;
    }

    /* JADX INFO: renamed from: ۢۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static C0199e m4740(Object obj) {
        if (C1179.m5236() > 0) {
            return ((C0197c) obj).f642b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static Toast m4741(Object obj, Object obj2, int i2) {
        if (C1155.m4177() >= 0) {
            return Toast.makeText((Context) obj, (CharSequence) obj2, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m4742(Object obj) {
        if (C1155.m4177() > 0) {
            return ((C0216v) obj).f720b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥۣۨ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4744(Object obj) {
        if (C1146.m3842() < 0) {
            return ((C1092c) obj).f4506o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۨۦ, reason: contains not printable characters */
    public static ClassLoader m4745(Object obj) {
        if (C0643.m4322() < 0) {
            return ((Class) obj).getClassLoader();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۤۦ, reason: contains not printable characters */
    public static void m4746(Object obj) {
        if (C1143.m3711() <= 0) {
            ((C0528S) obj).m1408a();
        }
    }

    /* JADX INFO: renamed from: ۦۣۤۧ, reason: contains not printable characters */
    public static void m4747(Object obj, Object obj2) {
        if (C1159.m4411() >= 0) {
            ((AccessibilityNodeInfo) obj).setError((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۦۢ۠, reason: contains not printable characters */
    public static Drawable m4748(Object obj) {
        if (C1124.m2896() >= 0) {
            return ((C1059c) obj).f4228j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m4749(Object obj) {
        if (C1151.m4000() > 0) {
            return ((View) obj).getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۧۥۤ, reason: not valid java name and contains not printable characters */
    public static String m4743(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
