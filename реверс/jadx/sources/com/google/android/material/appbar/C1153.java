package com.google.android.material.appbar;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.Toast;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0518H;
import androidx.fragment.app.LayoutInflaterFactory2C0553w;
import androidx.lifecycle.C1147;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.internal.C1156;
import com.google.android.material.slider.Slider;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;
import p000A.AbstractC0002c;
import p000A.C0005f;
import p001A0.C1121;
import p004C.C1122;
import p005C0.AbstractC0047m;
import p011G.C1123;
import p014H0.C1124;
import p016J.C0133e;
import p022M.C1126;
import p023M0.AbstractC0213s;
import p023M0.C0201g;
import p023M0.C0202h;
import p023M0.C0212r;
import p023M0.C0214t;
import p023M0.C0219y;
import p023M0.C1127;
import p023M0.ViewOnFocusChangeListenerC0196b;
import p024N.C0249a0;
import p024N.C0258f;
import p024N.C1128;
import p024N.InterfaceC0252c;
import p026O.AbstractC0304d;
import p029P0.C1133;
import p031Q0.C0340n;
import p031Q0.DialogInterfaceOnClickListenerC0331e;
import p031Q0.RunnableC0345s;
import p032R.C1134;
import p034S.InterfaceC0363g;
import p037T0.C1135;
import p037T0.C1136;
import p038U.C1137;
import p041V0.C1138;
import p050a0.C1142;
import p052b0.C1151;
import p058d0.C0643;
import p060e.C0654J;
import p060e.C0658N;
import p060e.LayoutInflaterFactory2C0648D;
import p072k.C0818o;
import p073k0.AbstractC0849m;
import p073k0.C1167;
import p073k0.InterfaceC0847k;
import p075l0.C1168;
import p081o0.C1170;
import p084q.C1172;
import p086r.C1174;
import p089t.C1175;
import p098x0.C1179;
import p100z.C1180;

/* JADX INFO: renamed from: com.google.android.material.appbar.ۤۦۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1153 {

    /* JADX INFO: renamed from: ۣ۟ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static int f4879 = 412;

    /* JADX INFO: renamed from: ۣ۟۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4059(Object obj) {
        if (C1135.m3328() > 0) {
            return ((C0818o) obj).collapseActionView();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static Rect m4060(Object obj) {
        if (C1170.m4847() > 0) {
            return ((C0219y) obj).f752g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static C0201g m4061(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((C0202h) obj).f657x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۥۢ, reason: not valid java name and contains not printable characters */
    public static LayoutInflaterFactory2C0553w m4062(Object obj) {
        if (C0643.m4322() <= 0) {
            return ((C0518H) obj).f1596f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۤۤ, reason: not valid java name and contains not printable characters */
    public static String m4063(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۤۧۧ, reason: not valid java name and contains not printable characters */
    public static void m4064(Object obj) {
        if (C1137.m3457() < 0) {
            ((LayoutInflaterFactory2C0648D) obj).m1833A();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۧ, reason: not valid java name and contains not printable characters */
    public static C0133e m4065(Object obj) {
        if (C1154.m4128() >= 0) {
            return C0133e.m511a((Locale[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static double m4066(Object obj) {
        if (C1136.m3395() < 0) {
            return ((BigDecimal) obj).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m4067(Object obj, float f) {
        if (C1172.m4932() <= 0) {
            ((C0249a0) obj).m809e(f);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static View.OnFocusChangeListener m4068(Object obj) {
        if (C1149.m3923() <= 0) {
            return ((AbstractC0213s) obj).mo637g();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4069(Object obj) {
        if (C1142.m3681() <= 0) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۡ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4070(int i2) {
        if (C1179.m5236() >= 0) {
            return ColorStateList.valueOf(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m4071(Object obj) {
        if (C1170.m4847() > 0) {
            return ((ViewOnFocusChangeListenerC0196b) obj).f639a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m4072(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠۟, reason: not valid java name and contains not printable characters */
    public static int m4073(Object obj) {
        if (C1156.m4236() >= 0) {
            return ((C0214t) obj).f711a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤۢۨ, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedDispatcher m4074(Object obj) {
        if (C1174.m5008() > 0) {
            return AbstractC0304d.m935e(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۤۨ, reason: not valid java name and contains not printable characters */
    public static int m4075(Object obj, Object obj2) {
        if (C1147.m1498() <= 0) {
            return ((PackageManager) obj).getComponentEnabledSetting((ComponentName) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۧ, reason: not valid java name and contains not printable characters */
    public static int m4076(Object obj) {
        if (C1172.m4932() < 0) {
            return ((Configuration) obj).mcc;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۡۧ, reason: not valid java name and contains not printable characters */
    public static String m4077() {
        if (C1147.m1498() <= 0) {
            return "ۨۡۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static ViewTreeObserver m4078(Object obj) {
        if (C1126.m2964() < 0) {
            return ((View) obj).getViewTreeObserver();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static void m4079(Object obj, int i2) {
        if (C1121.m2777() > 0) {
            ((View) obj).setTransitionVisibility(i2);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۥۤ, reason: not valid java name and contains not printable characters */
    public static Toast m4081(Object obj, int i2, int i3) {
        if (C1142.m3681() < 0) {
            return Toast.makeText((Context) obj, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static AbstractC0002c m4082(Object obj) {
        if (C1167.m4739() < 0) {
            return ((C0005f) obj).f3a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢ۠, reason: not valid java name and contains not printable characters */
    public static View.OnFocusChangeListener m4083(Object obj) {
        if (C1137.m3457() <= 0) {
            return ((AbstractC0213s) obj).mo635e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧ۟, reason: not valid java name and contains not printable characters */
    public static ContentResolver m4084(Object obj) {
        if (C1147.m1498() <= 0) {
            return ((Context) obj).getContentResolver();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۨۥ, reason: not valid java name and contains not printable characters */
    public static float m4085(Object obj) {
        if (C1151.m4000() > 0) {
            return ((Parcel) obj).readFloat();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢۥۤۢ, reason: not valid java name and contains not printable characters */
    public static void m4086(Object obj, Object obj2, Object obj3, int i2, int i3, Object obj4) {
        if (C1124.m2896() >= 0) {
            AbstractC0047m.m273b((Context) obj, (AttributeSet) obj2, (int[]) obj3, i2, i3, (int[]) obj4);
        }
    }

    /* JADX INFO: renamed from: ۢۦۡ۟, reason: not valid java name and contains not printable characters */
    public static C0340n m4087(Object obj) {
        if (C1150.m3967() >= 0) {
            return ((DialogInterfaceOnClickListenerC0331e) obj).f946b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۦ, reason: not valid java name and contains not printable characters */
    public static AccelerateInterpolator m4088() {
        if (C1175.m5073() >= 0) {
            return C0658N.f2605N;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۧ, reason: not valid java name and contains not printable characters */
    public static int m4089(Object obj, Object obj2, Object obj3) {
        if (C1149.m3923() <= 0) {
            return Log.i((String) obj, (String) obj2, (Throwable) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۢۥ, reason: not valid java name and contains not printable characters */
    public static double m4090(double d2) {
        if (C1121.m2777() > 0) {
            return Math.floor(d2);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۤ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m4091(Object obj) {
        if (C1122.m2810() < 0) {
            return ((Slider) obj).getActiveThumbIndex();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ, reason: contains not printable characters */
    public static int m4092() {
        return 392 ^ C1168.f4911;
    }

    /* JADX INFO: renamed from: ۥۤ۠, reason: contains not printable characters */
    public static MainActivity m4093(Object obj) {
        if (C1123.m2849() > 0) {
            return ((RunnableC0345s) obj).f979a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۤ۠, reason: contains not printable characters */
    public static Paint.Cap m4094() {
        if (C1180.m5241() <= 0) {
            return Paint.Cap.BUTT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static long m4095(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((C0654J) obj).f2594b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧۡۥ, reason: not valid java name and contains not printable characters */
    public static int m4096(Object obj) {
        if (C1136.m3395() <= 0) {
            return ((C0212r) obj).f697m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m4097(Object obj, Object obj2, Object obj3) {
        if (C1138.m3471() > 0) {
            return ((HashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۢۨ, reason: not valid java name and contains not printable characters */
    public static void m4098(Object obj, Object obj2) {
        if (C1133.m3246() < 0) {
            ((InterfaceC0847k) obj).mo2216g((AbstractC0849m) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static C0258f m4099(Object obj) {
        if (C1127.m3025() > 0) {
            return ((InterfaceC0252c) obj).mo49n();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۥۤ, reason: not valid java name and contains not printable characters */
    public static void m4100(Object obj) {
        if (C1134.m3300() < 0) {
            ((InterfaceC0363g) obj).mo840b();
        }
    }

    /* JADX INFO: renamed from: ۨۤۤۦ, reason: not valid java name and contains not printable characters */
    public static void m4101(Object obj, Object obj2, Object obj3) {
        if (C1128.m3066() >= 0) {
            ((ViewGroup.OnHierarchyChangeListener) obj).onChildViewAdded((View) obj2, (View) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static String m4080(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
