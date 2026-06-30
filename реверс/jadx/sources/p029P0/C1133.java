package p029P0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.startup.C1149;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.internal.C1156;
import com.google.android.material.snackbar.C1157;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.MathContext;
import java.net.URLConnection;
import java.util.List;
import p000A.C0010k;
import p004C.C1122;
import p011G.C1123;
import p014H0.C1124;
import p019K0.AbstractC0165g;
import p019K0.ViewTreeObserverOnScrollChangedListenerC0159a;
import p022M.C1126;
import p023M0.C0194G;
import p023M0.C1127;
import p026O.C0311k;
import p026O.C1132;
import p031Q0.C0336j;
import p032R.C1134;
import p036T.AbstractC0383m;
import p038U.C1137;
import p041V0.C1138;
import p042W.C0404e;
import p042W.C1139;
import p045X0.C1141;
import p050a0.C1142;
import p050a0.C1143;
import p051a1.C1145;
import p058d0.C1158;
import p060e.C0665g;
import p060e.C0684z;
import p060e.ExecutorC0674p;
import p060e.LayoutInflaterFactory2C0648D;
import p065g.C1159;
import p066g0.AbstractC0723K;
import p066g0.C1161;
import p072k.C0812i;
import p073k0.C1167;
import p074l.AbstractC0970s1;
import p074l.InterfaceC0951m0;
import p081o0.C1170;
import p084q.C1172;
import p089t.C1175;
import p092u0.C1176;

/* JADX INFO: renamed from: P0.۟ۨۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1133 {

    /* JADX INFO: renamed from: ۥۢۥۡ, reason: contains not printable characters */
    public static int f4848 = 646;

    /* JADX INFO: renamed from: ۣ۟۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m3242(Object obj, int i2) {
        if (C1154.m4128() > 0) {
            ((AbstractC0165g) obj).setThumbHeight(i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3243(Object obj, Object obj2) {
        if (C1161.m4510() < 0) {
            return ((StringBuilder) obj).append(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static String m3244(Object obj) {
        if (C1159.m4411() >= 0) {
            return ((C0336j) obj).f958b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m3245(Object obj, int i2) {
        if (C1126.m2964() < 0) {
            ((C0311k) obj).m968a(i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m3246() {
        return 534 ^ C1134.f4860;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static int m3247(Object obj) {
        if (C1127.m3025() >= 0) {
            return ((ColorStateList) obj).getDefaultColor();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m3248(Object obj, Object obj2, Object obj3) {
        if (C1159.m4411() > 0) {
            return ((ActionMode.Callback) obj).onCreateActionMode((ActionMode) obj2, (Menu) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3249(Object obj) {
        if (C1167.m4739() <= 0) {
            return ((C0194G) obj).f636d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۡ, reason: not valid java name and contains not printable characters */
    public static Runnable m3250(Object obj) {
        if (C1145.m3805() <= 0) {
            return ((ExecutorC0674p) obj).f2708d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static ExpandedMenuView m3251(Object obj) {
        if (C1142.m3681() < 0) {
            return ((C0812i) obj).f3309d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static void m3252(Object obj, Object obj2) {
        if (C1137.m3457() < 0) {
            ((View) obj).setOnLongClickListener((View.OnLongClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static MathContext m3253() {
        if (C1139.m3541() >= 0) {
            return MathContext.DECIMAL64;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m3254(Object obj) {
        if (C1156.m4236() >= 0) {
            return ((C0010k) obj).f24c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡۡ, reason: not valid java name and contains not printable characters */
    public static void m3255(Object obj, Object obj2) {
        if (C1175.m5073() >= 0) {
            ((AccessibilityNodeInfo) obj).setContentDescription((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۤ۟, reason: not valid java name and contains not printable characters */
    public static AlertController$RecycleListView m3256(Object obj) {
        if (C1172.m4932() < 0) {
            return ((C0665g) obj).f2670f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static Method m3257() {
        if (C1157.m4271() >= 0) {
            return AbstractC0970s1.f3846b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static void m3258(Object obj, Object obj2) {
        if (C1122.m2810() < 0) {
            ((Parcel) obj).writeList((List) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۤۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3260(Object obj, boolean z2) {
        if (C1158.m4364() < 0) {
            ((URLConnection) obj).setDoOutput(z2);
        }
    }

    /* JADX INFO: renamed from: ۢۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m3261(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static ViewTreeObserverOnScrollChangedListenerC0159a m3262(Object obj) {
        if (C1176.m5115() < 0) {
            return ((AbstractC0165g) obj).f571t0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static Field m3263() {
        if (C1124.m2896() >= 0) {
            return AbstractC0383m.f1052k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۨ, reason: contains not printable characters */
    public static void m3264(Object obj, int i2) {
        if (C1138.m3471() > 0) {
            ((C0404e) obj).m1128n(i2);
        }
    }

    /* JADX INFO: renamed from: ۦۣ۠۟, reason: contains not printable characters */
    public static C0684z m3265(Object obj) {
        if (C1154.m4128() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2550W;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۨ, reason: contains not printable characters */
    public static void m3266(Object obj, Object obj2) {
        if (C1170.m4847() >= 0) {
            ((ContentFrameLayout) obj).setAttachListener((InterfaceC0951m0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۥۧۨ, reason: contains not printable characters */
    public static String m3267(String str) {
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

    /* JADX INFO: renamed from: ۧ۟۠۟, reason: not valid java name and contains not printable characters */
    public static void m3268(Object obj, Object obj2) {
        if (C1132.m3217() >= 0) {
            ((Animator) obj).setInterpolator((TimeInterpolator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۟, reason: not valid java name and contains not printable characters */
    public static void m3269(Object obj, int i2) {
        if (C1143.m3711() <= 0) {
            ((BottomSheetBehavior) obj).m1693C(i2);
        }
    }

    /* JADX INFO: renamed from: ۧۦۣۢ, reason: not valid java name and contains not printable characters */
    public static void m3270(Object obj, Object obj2) {
        if (C1123.m2849() >= 0) {
            ((RecyclerView) obj).setLayoutManager((AbstractC0723K) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۡۥۣ, reason: not valid java name and contains not printable characters */
    public static ActionMenuView m3271(Object obj) {
        if (C1141.m3607() >= 0) {
            return ((Toolbar) obj).f1388a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3272(Object obj, Object obj2) {
        if (C1157.m4271() > 0) {
            return ((File) obj).renameTo((File) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۤ, reason: not valid java name and contains not printable characters */
    public static void m3273(Object obj, Object obj2, int i2, int i3) {
        if (C1149.m3923() < 0) {
            ((ViewGroup) obj).addView((View) obj2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۠ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static String m3259(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
