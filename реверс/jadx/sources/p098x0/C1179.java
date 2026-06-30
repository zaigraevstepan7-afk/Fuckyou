package p098x0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ListAdapter;
import android.window.OnBackInvokedDispatcher;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.profileinstaller.C1148;
import androidx.startup.C1149;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.util.List;
import p005C0.C0045k;
import p009F.AbstractC0074a;
import p015I0.C1125;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.AbstractC0213s;
import p023M0.ViewOnAttachStateChangeListenerC0210p;
import p024N.C0291v0;
import p024N.C0295x0;
import p025N0.C1129;
import p025N0.C1130;
import p026O.C0311k;
import p029P0.C0325b;
import p031Q0.C0340n;
import p031Q0.ViewOnClickListenerC0337k;
import p032R.C1134;
import p037T0.C1136;
import p041V0.C1138;
import p050a0.C1143;
import p051a1.C1145;
import p052b0.C1152;
import p057d.AbstractC0641a;
import p060e.AbstractC0682x;
import p060e.C0658N;
import p060e.WindowCallbackC0683y;
import p066g0.C1160;
import p070i0.C1163;
import p072k.AbstractC0824u;
import p072k.C0826w;
import p072k.C1165;
import p072k.MenuC0816m;
import p073k0.C1166;
import p074l.C0946k1;
import p075l0.C1168;
import p077m0.C1169;
import p083p0.C1171;
import p089t.C1175;
import p097x.C1178;
import p100z.C1180;

/* JADX INFO: renamed from: x0.ۣ۟ۥ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1179 {

    /* JADX INFO: renamed from: ۟۟ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static int f4922 = -849;

    /* JADX INFO: renamed from: ۟۠ۥ۠۟, reason: not valid java name and contains not printable characters */
    public static String m5206() {
        if (C1134.m3300() <= 0) {
            return "ۤۨۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static C0340n m5207(Object obj) {
        if (C1178.m5174() < 0) {
            return ((ViewOnClickListenerC0337k) obj).f961c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static C0291v0 m5208(Object obj) {
        if (C1130.m3165() > 0) {
            return ((C0295x0) obj).f882a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m5209(Object obj, Object obj2, Object obj3, int i2) {
        if (C1149.m3923() <= 0) {
            ((WindowCallbackC0683y) obj).m1918d((List) obj2, (Menu) obj3, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨۤۢ, reason: not valid java name and contains not printable characters */
    public static void m5210(Object obj, int i2) {
        if (C1180.m5241() <= 0) {
            ((AbstractC0165g) obj).setLabelBehavior(i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static void m5211(Object obj, boolean z2) {
        if (C1129.m3120() < 0) {
            ((AbstractC0213s) obj).mo639p(z2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m5212(Object obj, boolean z2) {
        if (C1152.m4038() > 0) {
            ((MenuC0816m) obj).m2186c(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۡۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC0824u m5213(Object obj) {
        if (C1152.m4038() >= 0) {
            return ((C0826w) obj).f3395i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦ۠, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedDispatcher m5214(Object obj) {
        if (C1163.m4579() >= 0) {
            return AbstractC0682x.m1912a((Activity) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡ۠, reason: not valid java name and contains not printable characters */
    public static void m5215(Object obj, int i2) {
        if (C1157.m4271() >= 0) {
            ((Paint) obj).setColor(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۡۥ, reason: not valid java name and contains not printable characters */
    public static int m5216(Object obj) {
        if (C1136.m3395() < 0) {
            return ((C0946k1) obj).f3770b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۟۠, reason: not valid java name and contains not printable characters */
    public static String m5217() {
        if (C1129.m3120() <= 0) {
            return "ۧۡۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۠, reason: not valid java name and contains not printable characters */
    public static void m5218(Object obj, boolean z2) {
        if (C1138.m3471() > 0) {
            ((AbstractC0165g) obj).setEnabled(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۢۡ, reason: not valid java name and contains not printable characters */
    public static int m5219(Object obj) {
        if (C1175.m5073() >= 0) {
            return System.identityHashCode(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۥۦۨ, reason: not valid java name and contains not printable characters */
    public static C0045k m5220(Object obj) {
        if (C1145.m3805() < 0) {
            return ((C0325b) obj).f918A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۡۤ, reason: not valid java name and contains not printable characters */
    public static void m5221(Object obj, Object obj2) {
        if (C1143.m3711() <= 0) {
            ((Context) obj).startActivity((Intent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۧۤۤ, reason: not valid java name and contains not printable characters */
    public static Drawable m5222(Object obj) {
        if (C1180.m5241() < 0) {
            return ((AbstractC0165g) obj).f563p0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static ServiceInfo m5223(Object obj, Object obj2, int i2) {
        if (C1166.m4699() > 0) {
            return ((PackageManager) obj).getServiceInfo((ComponentName) obj2, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۥۥ, reason: not valid java name and contains not printable characters */
    public static void m5224(Object obj, boolean z2, boolean z3) {
        if (C1154.m4128() > 0) {
            ((TextInputLayout) obj).m1782u(z2, z3);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m5225(int i2, int i3) {
        if (C1171.m4901() > 0) {
            return AbstractC0074a.m354c(i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۥۦ۠, reason: not valid java name and contains not printable characters */
    public static void m5226(Object obj, Object obj2) {
        if (C1165.m4643() >= 0) {
            ((View) obj).setOnTouchListener((View.OnTouchListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5227(Object obj) {
        if (C1130.m3165() > 0) {
            return ((C0658N) obj).f2610D;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m5229(Object obj, int i2, int i3, int i4, int i5) {
        if (C1126.m2964() <= 0) {
            ((Rect) obj).set(i2, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: ۣۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m5230() {
        if (C1160.m4437() < 0) {
            MainActivity.m1820z();
        }
    }

    /* JADX INFO: renamed from: ۤۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int m5231(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤۤۤ, reason: not valid java name and contains not printable characters */
    public static ListAdapter m5232(Object obj) {
        if (C1146.m3842() < 0) {
            return ((AutoCompleteTextView) obj).getAdapter();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨ۟۠, reason: not valid java name and contains not printable characters */
    public static int m5233(Object obj) {
        if (C1169.m4842() <= 0) {
            return ((ViewOnAttachStateChangeListenerC0210p) obj).f679a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨۧۧ, reason: not valid java name and contains not printable characters */
    public static ClassLoader m5234(Object obj) {
        if (C1163.m4579() > 0) {
            return ((Context) obj).getClassLoader();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۥ۠, reason: contains not printable characters */
    public static int[] m5235() {
        if (C1168.m4797() <= 0) {
            return AbstractC0641a.f2484e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۠ۥ, reason: contains not printable characters */
    public static int m5236() {
        return (-1002) ^ f4922;
    }

    /* JADX INFO: renamed from: ۦۣۨۤ, reason: contains not printable characters */
    public static Object m5237(Object obj, Object obj2) {
        if (C1148.m3908() >= 0) {
            return ((Constructor) obj).newInstance((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۡ۠, reason: not valid java name and contains not printable characters */
    public static void m5238(Object obj, Object obj2) {
        if (C1125.m2937() >= 0) {
            ((C0311k) obj).m978l((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۨۨ۟, reason: not valid java name and contains not printable characters */
    public static String m5239(String str) {
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

    /* JADX INFO: renamed from: ۣۧۡۦ, reason: not valid java name and contains not printable characters */
    public static String m5228(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
