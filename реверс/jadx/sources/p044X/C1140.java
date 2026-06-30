package p044X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.fragment.app.C0518H;
import androidx.fragment.app.C0525O;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.EnumC0581m;
import androidx.profileinstaller.C1148;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.AccessibleObject;
import p000A.C0010k;
import p001A0.AbstractC0016e;
import p001A0.C1121;
import p004C.C1122;
import p014H0.C1124;
import p019K0.AbstractC0165g;
import p023M0.C0199e;
import p023M0.C0211q;
import p023M0.C0219y;
import p023M0.C1127;
import p025N0.C1131;
import p026O.C1132;
import p036T.C0371a;
import p037T0.C1135;
import p040V.AbstractC0397b;
import p040V.C0396a;
import p041V0.C1138;
import p050a0.C1142;
import p050a0.C1143;
import p051a1.C1145;
import p052b0.C1151;
import p052b0.C1152;
import p058d0.C0643;
import p058d0.C1158;
import p060e.AbstractC0652H;
import p060e.C0651G;
import p060e.C0665g;
import p060e.LayoutInflaterFactory2C0648D;
import p060e.WindowCallbackC0683y;
import p066g0.AbstractC0719G;
import p066g0.C1161;
import p072k.C1165;
import p072k.InterfaceC0827x;
import p072k.MenuC0816m;
import p072k.ViewOnKeyListenerC0810g;
import p073k0.C1167;
import p074l.C0944k;
import p075l0.C1168;
import p081o0.C1170;
import p083p0.C1171;
import p084q.C1172;
import p092u0.C1176;
import p097x.C1178;
import p100z.C1180;

/* JADX INFO: renamed from: X.۟ۥۤۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1140 {

    /* JADX INFO: renamed from: ۣ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static int f4866 = -860;

    /* JADX INFO: renamed from: ۟۟ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static int m3562() {
        if (C1131.m3177() <= 0) {
            return AbstractC0652H.m1862a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static void m3563(Object obj, Object obj2) {
        if (C1157.m4271() >= 0) {
            ((C0219y) obj).setDropDownBackgroundTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۥ۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m3564(Object obj) {
        if (C1176.m5115() < 0) {
            return ((TextInputLayout) obj).getError();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۧۢ, reason: not valid java name and contains not printable characters */
    public static MenuC0816m m3565(Object obj) {
        if (C1143.m3711() < 0) {
            return ((C0944k) obj).f3735c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۨۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC0719G m3566(Object obj) {
        if (C1146.m3842() < 0) {
            return ((RecyclerView) obj).f1944J;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3567(Object obj) {
        if (C0643.m4322() <= 0) {
            return AbstractC0016e.m173d0((Context) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static C0588t m3568(Object obj) {
        if (C1178.m5174() <= 0) {
            return ((C0525O) obj).f1660c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m3569(Object obj, int i2) {
        if (C1172.m4932() < 0) {
            ((AbstractC0165g) obj).setTrackInsideCornerSize(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static LayoutInflaterFactory2C0648D m3571(Object obj) {
        if (C1135.m3328() >= 0) {
            return ((WindowCallbackC0683y) obj).f2728e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3572(Object obj) {
        if (C1121.m2777() > 0) {
            return ((Context) obj).isRestricted();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static String[] m3573() {
        if (C1138.m3471() > 0) {
            return C0651G.f2588g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟۠, reason: not valid java name and contains not printable characters */
    public static int m3574(Object obj, int i2) {
        if (C1158.m4364() < 0) {
            return ((Adapter) obj).getItemViewType(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static void m3575(Object obj, Object obj2, Object obj3) {
        if (C1170.m4847() > 0) {
            ((ActionBarOverlayLayout) obj).m1211l((MenuC0816m) obj2, (InterfaceC0827x) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m3576(Object obj) {
        if (C1135.m3328() > 0) {
            return ((C0665g) obj).f2689y;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m3577() {
        if (C1145.m3805() <= 0) {
            return "ۧۨۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۥ۠, reason: not valid java name and contains not printable characters */
    public static int m3578(Object obj, Object obj2) {
        if (C1138.m3471() >= 0) {
            return Log.d((String) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3579(Object obj) {
        if (C1142.m3681() < 0) {
            return ((View) obj).isShown();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static EnumC0581m m3580() {
        if (C1155.m4177() > 0) {
            return EnumC0581m.f1868c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static int m3581(Object obj) {
        if (C1124.m2896() > 0) {
            return ((C0371a) obj).f1021i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3582(Object obj) {
        if (C1143.m3711() < 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2534G;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static View m3583(Object obj, int i2, Object obj2, boolean z2) {
        if (C1167.m4739() < 0) {
            return ((LayoutInflater) obj).inflate(i2, (ViewGroup) obj2, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static void m3584(Object obj, boolean z2) {
        if (C1127.m3025() >= 0) {
            ((AccessibleObject) obj).setAccessible(z2);
        }
    }

    /* JADX INFO: renamed from: ۡۦۥۣ, reason: not valid java name and contains not printable characters */
    public static void m3585(Object obj, boolean z2) {
        if (C1152.m4038() > 0) {
            ((ActionBarOverlayLayout) obj).setHideOnContentScrollEnabled(z2);
        }
    }

    /* JADX INFO: renamed from: ۡۦۦۨ, reason: not valid java name and contains not printable characters */
    public static String m3586(String str) {
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

    /* JADX INFO: renamed from: ۡۨۤۡ, reason: not valid java name and contains not printable characters */
    public static C0010k m3587(Object obj) {
        if (C1148.m3908() > 0) {
            return ((C0518H) obj).f1593c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m3588(Object obj, Object obj2) {
        if (C1122.m2810() < 0) {
            ((FrameLayout) obj).setForeground((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۦۧ, reason: not valid java name and contains not printable characters */
    public static void m3589(Object obj) {
        if (C1172.m4932() < 0) {
            ((View) obj).postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ۣۤۢ, reason: not valid java name and contains not printable characters */
    public static String[] m3590(Object obj, int i2) {
        if (C1148.m3908() >= 0) {
            return ((Resources) obj).getStringArray(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۥ, reason: not valid java name and contains not printable characters */
    public static int[] m3591() {
        if (C1138.m3471() > 0) {
            return C0651G.f2585d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧ, reason: not valid java name and contains not printable characters */
    public static SparseArray m3592(Object obj) {
        if (C1161.m4510() < 0) {
            return ((C0211q) obj).f681a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۧۧ, reason: not valid java name and contains not printable characters */
    public static Handler m3593(Object obj) {
        if (C1132.m3217() > 0) {
            return ((ViewOnKeyListenerC0810g) obj).f3283f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۡ, reason: not valid java name and contains not printable characters */
    public static C0396a m3594() {
        if (C1168.m4797() <= 0) {
            return AbstractC0397b.f1068b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۤ, reason: not valid java name and contains not printable characters */
    public static int m3595() {
        return (-5) ^ C1165.f4908;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۦ, reason: contains not printable characters */
    public static int m3596(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۢۦ, reason: contains not printable characters */
    public static Drawable m3597(Object obj) {
        if (C1135.m3328() > 0) {
            return ((EditText) obj).getTextCursorDrawable();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۤۦ, reason: contains not printable characters */
    public static Matrix m3598(Object obj) {
        if (C1171.m4901() > 0) {
            return ((View) obj).getMatrix();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m3599(Object obj, boolean z2) {
        if (C1151.m4000() > 0) {
            ((ViewGroup) obj).setClipToPadding(z2);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static float m3600(Object obj) {
        if (C1135.m3328() >= 0) {
            return ((MotionEvent) obj).getX();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۢۡۡ, reason: not valid java name and contains not printable characters */
    public static EditText m3601(Object obj) {
        if (C1180.m5241() <= 0) {
            return ((C0199e) obj).f649i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static String m3570(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
