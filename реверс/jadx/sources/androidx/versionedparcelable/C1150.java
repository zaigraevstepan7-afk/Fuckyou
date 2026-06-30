package androidx.versionedparcelable;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Parcel;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.fragment.app.AbstractComponentCallbacksC0548r;
import androidx.fragment.app.C0518H;
import androidx.fragment.app.C0520J;
import androidx.startup.C1149;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p001A0.C1121;
import p004C.C1122;
import p011G.C1123;
import p015I0.C0112h;
import p015I0.C1125;
import p019K0.AbstractC0165g;
import p019K0.C0163e;
import p022M.C1126;
import p023M0.C0219y;
import p024N.AbstractC0230H;
import p024N.C1128;
import p025N0.C1129;
import p025N0.C1130;
import p032R.C1134;
import p037T0.C1136;
import p045X0.C1141;
import p051a1.C1145;
import p058d0.C0643;
import p060e.AbstractC0676r;
import p060e.C0654J;
import p060e.C0658N;
import p060e.ViewOnClickListenerC0650F;
import p065g.C1159;
import p066g0.AbstractC0719G;
import p066g0.C1160;
import p070i0.C1164;
import p073k0.C1166;
import p077m0.C1169;
import p084q.C1172;
import p084q.C1173;
import p086r.C1174;
import p096w0.C1177;
import p098x0.C1179;
import p100z.AbstractC1118a;

/* JADX INFO: renamed from: androidx.versionedparcelable.۟۟ۥۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1150 {

    /* JADX INFO: renamed from: ۨ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int f4876 = -773;

    /* JADX INFO: renamed from: ۟۟ۥۦۣ, reason: not valid java name and contains not printable characters */
    public static Class m3951(Object obj) {
        if (C1126.m2964() <= 0) {
            return obj.getClass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۤۢ, reason: not valid java name and contains not printable characters */
    public static String m3952(Object obj) {
        if (C1169.m4842() <= 0) {
            return ((ViewOnClickListenerC0650F) obj).f2580b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static void m3953(Object obj, Object obj2) {
        if (C1149.m3923() < 0) {
            ((C0112h) obj).m480l((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۡۥۧ, reason: not valid java name and contains not printable characters */
    public static long m3954(Object obj) {
        if (C1154.m4128() > 0) {
            return ((AbstractC0719G) obj).f2853e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۢۥۦ, reason: not valid java name and contains not printable characters */
    public static Thread m3955() {
        if (C1128.m3066() > 0) {
            return Thread.currentThread();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۢۦ, reason: not valid java name and contains not printable characters */
    public static int m3957(Object obj) {
        if (C1159.m4411() > 0) {
            return ((C0163e) obj).f503a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static int[] m3958() {
        if (C1125.m2937() > 0) {
            return AbstractC1118a.f4814b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۨ۟, reason: not valid java name and contains not printable characters */
    public static void m3959(Object obj, Object obj2) {
        if (C1134.m3300() < 0) {
            ((AbstractC0676r) obj).mo1849j((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3960(Object obj, Object obj2) {
        if (C1173.m4990() < 0) {
            return Collections.addAll((Collection) obj, (Object[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static int m3961(Object obj) {
        if (C1160.m4437() <= 0) {
            return ((AbstractC0165g) obj).f552k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧۢ۠, reason: not valid java name and contains not printable characters */
    public static C0520J m3962(Object obj) {
        if (C1149.m3923() < 0) {
            return ((C0518H) obj).f1589L;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static String m3963() {
        if (C1136.m3395() <= 0) {
            return "ۡ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۢۥ, reason: not valid java name and contains not printable characters */
    public static int m3964(Object obj) {
        if (C1156.m4236() >= 0) {
            return ((SwipeDismissBehavior) obj).f2066d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m3965(Object obj, Object obj2) {
        if (C1174.m5008() > 0) {
            ((AbstractC0165g) obj).setThumbStrokeColor((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int m3966(Object obj) {
        if (C1126.m2964() < 0) {
            return ((Configuration) obj).colorMode;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۧۦ, reason: not valid java name and contains not printable characters */
    public static int m3967() {
        return 252 ^ C1123.f4827;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۧ, reason: not valid java name and contains not printable characters */
    public static LayoutInflater m3968(Object obj) {
        if (C1141.m3607() > 0) {
            return ((Activity) obj).getLayoutInflater();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۦۤ, reason: not valid java name and contains not printable characters */
    public static void m3969(Object obj, long j2, double d2, double d3) {
        if (C1155.m4177() >= 0) {
            ((C0654J) obj).m1863a(j2, d2, d3);
        }
    }

    /* JADX INFO: renamed from: ۠۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m3970(Object obj) {
        if (C1166.m4699() > 0) {
            return ((MenuItem) obj).getItemId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static C0518H m3971(Object obj) {
        if (C1145.m3805() < 0) {
            return ((AbstractComponentCallbacksC0548r) obj).m1458g();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۠۟, reason: not valid java name and contains not printable characters */
    public static void m3972(Object obj, boolean z2) {
        if (C1159.m4411() > 0) {
            ((C0658N) obj).m1882u0(z2);
        }
    }

    /* JADX INFO: renamed from: ۡۢۢۡ, reason: not valid java name and contains not printable characters */
    public static void m3973(Object obj, Object obj2, Object obj3) {
        if (C1177.m5152() > 0) {
            ((AbstractC0676r) obj).mo1848i((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۡۧۨ, reason: not valid java name and contains not printable characters */
    public static int m3974(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m3975(Object obj, Object obj2) {
        if (C1121.m2777() >= 0) {
            return ((Parcel) obj).readValue((ClassLoader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣۥ, reason: not valid java name and contains not printable characters */
    public static String m3976() {
        if (C1156.m4236() > 0) {
            return "۠ۡۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3977(Object obj, Object obj2) {
        if (C1169.m4842() < 0) {
            return ((String) obj).contains((CharSequence) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m3978(Object obj, int i2, int i3) {
        if (C1130.m3165() > 0) {
            AbstractC0230H.m728d((View) obj, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۣۤۥۤ, reason: not valid java name and contains not printable characters */
    public static Boolean m3979() {
        if (C1172.m4932() < 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡ, reason: not valid java name and contains not printable characters */
    public static String m3980(String str) {
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

    /* JADX INFO: renamed from: ۥ۟ۦۣ, reason: contains not printable characters */
    public static int m3981(Object obj) {
        if (C1164.m4618() > 0) {
            return ((List) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۡ۠ۡ, reason: contains not printable characters */
    public static double m3982(double d2) {
        if (C1129.m3120() < 0) {
            return Math.asin(d2);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۥۡۨۥ, reason: contains not printable characters */
    public static AccessibilityManager m3983(Object obj) {
        if (C1179.m5236() >= 0) {
            return ((C0219y) obj).f751f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۦ۟, reason: contains not printable characters */
    public static MaterialSwitch m3984(Object obj) {
        if (C1126.m2964() <= 0) {
            return ((MainActivity) obj).f2471F;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۥۡ, reason: contains not printable characters */
    public static boolean m3985(Object obj) {
        if (C1130.m3165() > 0) {
            return ((ArrayList) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۨۤ, reason: contains not printable characters */
    public static String m3986() {
        if (C1173.m4990() <= 0) {
            return "ۨۢۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۡ۟, reason: not valid java name and contains not printable characters */
    public static void m3987(Object obj, Object obj2) {
        if (C1172.m4932() <= 0) {
            ((ContextThemeWrapper) obj).applyOverrideConfiguration((Configuration) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۢ۟, reason: not valid java name and contains not printable characters */
    public static String m3988() {
        if (C1122.m2810() <= 0) {
            return "ۢۨ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۡ, reason: not valid java name and contains not printable characters */
    public static int m3989(Object obj) {
        if (C1173.m4990() <= 0) {
            return ((TextView) obj).getCompoundPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3990(Object obj, Object obj2) {
        if (C0643.m4322() <= 0) {
            return ((ArrayDeque) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m3956(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
