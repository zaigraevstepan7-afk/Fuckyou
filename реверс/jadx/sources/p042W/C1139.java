package p042W;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.EnumC0581m;
import androidx.profileinstaller.C1148;
import androidx.versionedparcelable.C1150;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;
import java.util.concurrent.Executor;
import p001A0.C1121;
import p014H0.C1124;
import p016J.C0133e;
import p019K0.AbstractC0165g;
import p023M0.C0197c;
import p023M0.C0218x;
import p026O.C0311k;
import p026O.C1132;
import p029P0.C0325b;
import p029P0.C1133;
import p031Q0.C0346t;
import p032R.C1134;
import p037T0.C1136;
import p038U.C1137;
import p044X.C1140;
import p050a0.C1143;
import p051a1.C1145;
import p052b0.C1152;
import p060e.AbstractC0676r;
import p060e.C0651G;
import p060e.DialogInterfaceC0666h;
import p060e.LayoutInflaterFactory2C0648D;
import p060e.RunnableC0659a;
import p061e0.AbstractC0690f;
import p061e0.InterfaceC0689e;
import p066g0.AbstractC0719G;
import p066g0.C1160;
import p070i0.C1163;
import p072k.C0818o;
import p072k.C1165;
import p072k.SubMenuC0803E;
import p074l.C0927e0;
import p077m0.C1169;
import p081o0.C1170;
import p084q.C1172;
import p086r.C1174;
import p089t.C1175;
import p092u0.C1176;
import p101z0.C1120b;

/* JADX INFO: renamed from: W.۟ۡۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1139 {

    /* JADX INFO: renamed from: ۟۟ۨۤۤ, reason: not valid java name and contains not printable characters */
    public static int f4865 = 795;

    /* JADX INFO: renamed from: ۣ۟۟۟۠, reason: not valid java name and contains not printable characters */
    public static MotionEvent m3519(long j2, long j3, int i2, float f, float f2, int i3) {
        if (C1137.m3457() <= 0) {
            return MotionEvent.obtain(j2, j3, i2, f, f2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static View m3520(Object obj) {
        if (C1134.m3300() <= 0) {
            return ((Window) obj).getDecorView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static void m3521(Object obj, boolean z2) {
        if (m3541() >= 0) {
            ((URLConnection) obj).setDoInput(z2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۦۢ, reason: not valid java name and contains not printable characters */
    public static Configuration m3522(Object obj, int i2, Object obj2, Object obj3, boolean z2) {
        if (C1134.m3300() < 0) {
            return LayoutInflaterFactory2C0648D.m1831q((Context) obj, i2, (C0133e) obj2, (Configuration) obj3, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static void m3523(Object obj, Object obj2, Object obj3, boolean z2) {
        if (C1160.m4437() <= 0) {
            AbstractC0690f.m1941t((Context) obj, (Executor) obj2, (InterfaceC0689e) obj3, z2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static ValueAnimator m3524(Object obj) {
        if (C1169.m4842() <= 0) {
            return ((AbstractC0165g) obj).f562p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m3525() {
        if (C1124.m2896() > 0) {
            return "ۦ۠ۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥۦ, reason: not valid java name and contains not printable characters */
    public static void m3527(Object obj, Object obj2) {
        if (C1160.m4437() <= 0) {
            ((Canvas) obj).clipOutRect((RectF) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3528(Object obj, int i2) {
        if (C1170.m4847() >= 0) {
            return ((C0311k) obj).m971e(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static Paint m3529(Object obj) {
        if (C1163.m4579() >= 0) {
            return ((AbstractC0165g) obj).f538d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m3530(Object obj) {
        if (C1134.m3300() <= 0) {
            return ((C0218x) obj).f747a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۤۧ, reason: not valid java name and contains not printable characters */
    public static C0927e0 m3531(Object obj, Object obj2, Object obj3) {
        if (C1132.m3217() >= 0) {
            return ((C0651G) obj).mo1790e((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۥ, reason: not valid java name and contains not printable characters */
    public static void m3532(Object obj, Object obj2, float f) {
        if (C1140.m3595() >= 0) {
            ((AbstractC0165g) obj).m592q((C0325b) obj2, f);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۤۤ, reason: not valid java name and contains not printable characters */
    public static int m3533(Object obj) {
        if (C1157.m4271() >= 0) {
            return ((RunnableC0659a) obj).f2631a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥۤ, reason: not valid java name and contains not printable characters */
    public static Rect m3534(Object obj) {
        if (C1133.m3246() <= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2557d0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3535(Object obj) {
        if (C1137.m3457() < 0) {
            return ((TextInputLayout) obj).f2337A0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۤۧۦ, reason: not valid java name and contains not printable characters */
    public static int m3536(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۣۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3537(Object obj) {
        if (C1165.m4643() > 0) {
            return ((AccessibilityNodeInfo) obj).isShowingHintText();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨۡ۠, reason: not valid java name and contains not printable characters */
    public static long m3538(Object obj) {
        if (C1143.m3711() < 0) {
            return ((AbstractC0719G) obj).f2854f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۨۦۤ, reason: not valid java name and contains not printable characters */
    public static String m3539() {
        if (C1174.m5008() > 0) {
            return "";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۡۤ, reason: not valid java name and contains not printable characters */
    public static Looper m3540(Object obj) {
        if (C1132.m3217() > 0) {
            return ((Context) obj).getMainLooper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m3541() {
        return 857 ^ C1175.f4918;
    }

    /* JADX INFO: renamed from: ۠۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static String m3542(String str) {
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

    /* JADX INFO: renamed from: ۠ۦۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3543(Object obj) {
        if (C1174.m5008() > 0) {
            return ((AbstractC0165g) obj).f524P;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۤ۟۠, reason: not valid java name and contains not printable characters */
    public static void m3544(Object obj, Object obj2) {
        if (C1172.m4932() < 0) {
            ((AbstractC0676r) obj).mo1847h((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۧۦۤ, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC0666h m3545(Object obj) {
        if (C1155.m4177() >= 0) {
            return ((C1120b) obj).mo569a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۦۧ, reason: not valid java name and contains not printable characters */
    public static Object m3546(Object obj) {
        if (C1165.m4643() > 0) {
            return ((C0346t) obj).f985b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m3547() {
        if (C1132.m3217() > 0) {
            return "ۥۥ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static C0818o m3548(Object obj) {
        if (C1148.m3908() > 0) {
            return ((SubMenuC0803E) obj).f3250A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۤ۠, reason: not valid java name and contains not printable characters */
    public static int m3549(Object obj) {
        if (C1165.m4643() >= 0) {
            return ((ViewGroup) obj).getChildCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨۧۨ, reason: not valid java name and contains not printable characters */
    public static int m3550(Object obj) {
        if (C1175.m5073() >= 0) {
            return ((Configuration) obj).screenWidthDp;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static void m3551(Object obj, Object obj2) {
        if (C1150.m3967() > 0) {
            ((View) obj).setOnFocusChangeListener((View.OnFocusChangeListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3552(Object obj) {
        if (C1174.m5008() >= 0) {
            return ((TextInputLayout) obj).m1778q();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m3553(Object obj) {
        if (C1145.m3805() < 0) {
            return ((AnimatorSet) obj).isRunning();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m3554(Object obj, int i2) {
        if (C1174.m5008() > 0) {
            ((AbstractC0165g) obj).setThumbWidth(i2);
        }
    }

    /* JADX INFO: renamed from: ۤۦۦۣ, reason: not valid java name and contains not printable characters */
    public static void m3555(Object obj, int i2) {
        if (C1169.m4842() < 0) {
            ((View) obj).setAccessibilityLiveRegion(i2);
        }
    }

    /* JADX INFO: renamed from: ۥۣۡۥ, reason: contains not printable characters */
    public static void m3556(Object obj, Object obj2) {
        if (C1156.m4236() > 0) {
            ((ValueAnimator) obj).addUpdateListener((ValueAnimator.AnimatorUpdateListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣۦ۟, reason: contains not printable characters */
    public static EnumC0581m m3557(Object obj) {
        if (C1136.m3395() <= 0) {
            return ((C0588t) obj).f1877c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۡۧ, reason: contains not printable characters */
    public static int m3558(Object obj) {
        if (C1176.m5115() < 0) {
            return ((C0197c) obj).f641a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۢ۠, reason: contains not printable characters */
    public static boolean m3559(Object obj) {
        if (C1152.m4038() > 0) {
            return ((ViewConfiguration) obj).hasPermanentMenuKey();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۡ۠, reason: not valid java name and contains not printable characters */
    public static void m3560(Object obj) {
        if (C1165.m4643() > 0) {
            ((Window.Callback) obj).onDetachedFromWindow();
        }
    }

    /* JADX INFO: renamed from: ۨۦۣۣ, reason: not valid java name and contains not printable characters */
    public static void m3561(Object obj) {
        if (C1121.m2777() > 0) {
            ((ViewPropertyAnimator) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m3526(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
