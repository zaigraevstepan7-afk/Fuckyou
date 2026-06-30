package p037T0;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import androidx.activity.DialogC0467l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractC0537g;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.C1147;
import androidx.lifecycle.EnumC0580l;
import androidx.startup.C1149;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.datepicker.ViewOnClickListenerC0615j;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.snackbar.C1157;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import p000A.ViewTreeObserverOnPreDrawListenerC0006g;
import p001A0.C1121;
import p011G.C1123;
import p012G0.AbstractC0101c;
import p015I0.C1125;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.C1127;
import p025N0.C1131;
import p026O.AbstractC0304d;
import p026O.C1132;
import p029P0.C1133;
import p031Q0.C0338l;
import p031Q0.C0340n;
import p031Q0.RunnableC0343q;
import p032R.C1134;
import p038U.C1137;
import p041V0.C1138;
import p042W.C1139;
import p045X0.C1141;
import p052b0.C1152;
import p058d0.C0643;
import p060e.C0647C;
import p060e.C0657M;
import p060e.C0665g;
import p060e.LayoutInflaterFactory2C0648D;
import p065g.C1159;
import p066g0.C0756j;
import p066g0.C1160;
import p066g0.C1161;
import p070i0.C1164;
import p072k.C1165;
import p072k.MenuC0816m;
import p072k.ViewOnKeyListenerC0802D;
import p072k.ViewTreeObserverOnGlobalLayoutListenerC0807d;
import p074l.InterfaceC0953n;
import p075l0.C1168;
import p077m0.C1169;
import p081o0.C1170;
import p083p0.C1171;
import p084q.C1172;
import p092u0.C1176;
import p096w0.C1177;
import p097x.C1178;

/* JADX INFO: renamed from: T0.۟ۥ۟ۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1136 {

    /* JADX INFO: renamed from: ۣ۟ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static int f4862 = -394;

    /* JADX INFO: renamed from: ۣ۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m3369(Object obj, Object obj2) {
        if (C1159.m4411() >= 0) {
            ((C0657M) obj).mo1876m((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m3370(Object obj) {
        if (C1139.m3541() > 0) {
            ((AbstractC0537g) obj).m1432i();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۨ۠, reason: not valid java name and contains not printable characters */
    public static long m3371(Object obj) {
        if (m3395() <= 0) {
            return ((C0340n) obj).f971c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static void m3372(Object obj) {
        if (C1132.m3217() > 0) {
            ((DialogC0467l) obj).m1170c();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۡۢۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3373(Object obj) {
        if (C1126.m2964() <= 0) {
            return ((C0756j) obj).f3024q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static void m3374(Object obj, boolean z2) {
        if (C1172.m4932() < 0) {
            ((CheckableImageButton) obj).setPressable(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m3375(Object obj, float f) {
        if (C1171.m4901() > 0) {
            ((AbstractC0165g) obj).setThumbElevation(f);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۨۢ, reason: not valid java name and contains not printable characters */
    public static long m3376() {
        if (C0643.m4322() < 0) {
            return SystemClock.elapsedRealtime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۤۦ۠, reason: not valid java name and contains not printable characters */
    public static ValueAnimator m3377(Object obj) {
        if (C1134.m3300() < 0) {
            return ((AbstractC0165g) obj).f564q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨ۟, reason: not valid java name and contains not printable characters */
    public static int m3378(Object obj) {
        if (C1170.m4847() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2546S;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static int m3379(Object obj, Object obj2) {
        if (C1178.m5174() <= 0) {
            return ((FileInputStream) obj).read((byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static void m3380(Object obj, int i2, int i3, int i4, int i5) {
        if (C1172.m4932() <= 0) {
            ((TextView) obj).setPadding(i2, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۢ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m3381(Object obj) {
        if (C1127.m3025() > 0) {
            return ((AbstractC0165g) obj).f547h0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static void m3382(Object obj, Object obj2) {
        if (C1168.m4797() < 0) {
            ((View) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢۡۤ, reason: not valid java name and contains not printable characters */
    public static int m3383(Object obj) {
        if (C1155.m4177() >= 0) {
            return ((AbstractC0165g) obj).m577b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡۥ, reason: not valid java name and contains not printable characters */
    public static void m3384(Object obj) {
        if (C1169.m4842() < 0) {
            ((Map) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۣ, reason: not valid java name and contains not printable characters */
    public static Window m3385(Object obj) {
        if (C1155.m4177() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2563l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m3386(Object obj, Object obj2) {
        if (C1155.m4177() >= 0) {
            ((C0588t) obj).m1484d((EnumC0580l) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3387(Object obj) {
        if (C1147.m1498() <= 0) {
            return ((View) obj).hasOnClickListeners();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3388(Object obj, int i2, Object obj2, int i3) {
        if (C1152.m4038() > 0) {
            return ((MenuC0816m) obj).performShortcut(i2, (KeyEvent) obj2, i3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3389(Object obj, char c2) {
        if (C1147.m1498() <= 0) {
            return ((StringBuilder) obj).append(c2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۥۡ, reason: not valid java name and contains not printable characters */
    public static Locale m3390() {
        if (C1165.m4643() >= 0) {
            return Locale.US;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠۠, reason: not valid java name and contains not printable characters */
    public static int m3391(Object obj) {
        if (C1147.m1498() < 0) {
            return ((View) obj).getPaddingEnd();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۡۡۡ, reason: not valid java name and contains not printable characters */
    public static Window.Callback m3392(Object obj) {
        if (C1164.m4618() > 0) {
            return ((Window) obj).getCallback();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3393(Object obj, Object obj2) {
        if (C1160.m4437() < 0) {
            return ((StringBuilder) obj).append((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedCallback m3394(Object obj) {
        if (C1152.m4038() > 0) {
            return AbstractC0304d.m932b(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m3395() {
        return (-429) ^ C1169.f4912;
    }

    /* JADX INFO: renamed from: ۡۢۦۢ, reason: not valid java name and contains not printable characters */
    public static int m3396(Object obj, Object obj2, Object obj3) {
        if (C1133.m3246() < 0) {
            return Log.e((String) obj, (String) obj2, (Throwable) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۡ۠, reason: not valid java name and contains not printable characters */
    public static TextView m3397(Object obj) {
        if (C1137.m3457() < 0) {
            return ((C0338l) obj).f963v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static WeakReference m3398(Object obj) {
        if (C1132.m3217() > 0) {
            return ((C0657M) obj).f2603f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3399(Object obj, Object obj2, int i2, Object obj3) {
        if (C1161.m4510() <= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).m1838F((C0647C) obj2, i2, (KeyEvent) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۢۦۣ, reason: not valid java name and contains not printable characters */
    public static void m3400(Object obj) {
        if (C1121.m2777() > 0) {
            ((AbstractC0165g) obj).m597v();
        }
    }

    /* JADX INFO: renamed from: ۣۢۨۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0953n m3401(Object obj) {
        if (C1176.m5115() <= 0) {
            return ((ActionMenuView) obj).f1355z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3402(Object obj) {
        if (C1131.m3177() < 0) {
            return ((AccessibleObject) obj).isAccessible();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۦۣ, reason: not valid java name and contains not printable characters */
    public static ValueAnimator m3403(Object obj) {
        if (C1177.m5152() >= 0) {
            return ValueAnimator.ofFloat((float[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m3405(String str) {
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

    /* JADX INFO: renamed from: ۤۧۧۥ, reason: not valid java name and contains not printable characters */
    public static void m3406(Object obj, Object obj2, int i2) {
        if (C1123.m2849() >= 0) {
            ((ContentResolver) obj).takePersistableUriPermission((Uri) obj2, i2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۦۨ, reason: contains not printable characters */
    public static void m3407(Object obj, Object obj2, Object obj3) {
        if (C1131.m3177() <= 0) {
            ((Context) obj).startActivities((Intent[]) obj2, (Bundle) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۨۨ, reason: contains not printable characters */
    public static boolean m3408(Object obj) {
        if (C1141.m3607() >= 0) {
            return ((AbstractC0165g) obj).f543f0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۧۨ, reason: contains not printable characters */
    public static Drawable m3409(Object obj, int i2) {
        if (C1121.m2777() > 0) {
            return AbstractC0101c.m447b((Context) obj, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۧ, reason: contains not printable characters */
    public static ThreadLocal m3410() {
        if (C1138.m3471() >= 0) {
            return CoordinatorLayout.f1437v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۡۥ, reason: contains not printable characters */
    public static CoordinatorLayout m3411(Object obj) {
        if (C1149.m3923() <= 0) {
            return ((ViewTreeObserverOnPreDrawListenerC0006g) obj).f18a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۡۧ, reason: contains not printable characters */
    public static int m3412(Object obj) {
        if (C1157.m4271() > 0) {
            return ((AbstractC0165g) obj).f513E;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۨ۠, reason: contains not printable characters */
    public static MainActivity m3413(Object obj) {
        if (C1164.m4618() >= 0) {
            return ((RunnableC0343q) obj).f977b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۟ۡ, reason: contains not printable characters */
    public static ViewTreeObserverOnGlobalLayoutListenerC0807d m3414(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((ViewOnKeyListenerC0802D) obj).f3238i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۟ۤ, reason: contains not printable characters */
    public static String m3415() {
        if (C1127.m3025() > 0) {
            return "ۨۧۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۢۦ, reason: contains not printable characters */
    public static void m3416(Object obj, int i2) {
        if (C1126.m2964() < 0) {
            ((URLConnection) obj).setConnectTimeout(i2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static String m3417(Object obj, Object obj2, Object obj3) {
        if (C1127.m3025() > 0) {
            return ((AttributeSet) obj).getAttributeValue((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static ViewOnClickListenerC0615j m3418(Object obj) {
        if (C1125.m2937() > 0) {
            return ((C0665g) obj).f2664F;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int m3419(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۧۤ, reason: not valid java name and contains not printable characters */
    public static String m3404(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
