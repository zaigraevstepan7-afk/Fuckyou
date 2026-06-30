package p084q;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.LocaleList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.C0468m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C1147;
import androidx.lifecycle.EnumC0581m;
import androidx.profileinstaller.C1148;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p000A.C0007h;
import p001A0.C1121;
import p004C.C1122;
import p016J.InterfaceC0135g;
import p019K0.AbstractC0165g;
import p023M0.C0188A;
import p023M0.C0212r;
import p023M0.C1127;
import p024N.C1128;
import p025N0.C1129;
import p025N0.C1131;
import p031Q0.C0340n;
import p036T.InterfaceC0380j;
import p037T0.C1135;
import p037T0.C1136;
import p038U.C1137;
import p042W.C1139;
import p044X.C1140;
import p045X0.C1141;
import p051a1.C1144;
import p052b0.C1151;
import p060e.AbstractC0673o;
import p060e.C0665g;
import p060e.LayoutInflaterFactory2C0648D;
import p066g0.C0764o;
import p070i0.C1163;
import p071j.C0788c;
import p071j.C0793h;
import p072k.C1165;
import p073k0.C1167;
import p074l.C0889N;
import p074l.InterfaceC0954n0;
import p075l0.C1168;
import p077m0.C1169;
import p089t.C1049f;
import p092u0.C1176;
import p097x.C1178;
import p100z.C1180;

/* JADX INFO: renamed from: q.۟ۢۥۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1172 {

    /* JADX INFO: renamed from: ۟۟ۥۨۢ, reason: not valid java name and contains not printable characters */
    public static int f4915 = 69;

    /* JADX INFO: renamed from: ۣ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static void m4927(Object obj, Object obj2, int i2, int i3, int i4) {
        if (C1128.m3066() >= 0) {
            ((PopupWindow) obj).showAtLocation((View) obj2, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m4928() {
        if (C1167.m4739() < 0) {
            return "ۣۡ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static int m4929(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۦ, reason: not valid java name and contains not printable characters */
    public static long m4930(Object obj, int i2) {
        if (C1178.m5174() <= 0) {
            return ((C0889N) obj).getItemId(i2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۡ, reason: not valid java name and contains not printable characters */
    public static Resources.Theme m4931(Object obj) {
        if (C1167.m4739() < 0) {
            return ((C0788c) obj).getTheme();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static int m4932() {
        return (-901) ^ C1163.f4906;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static long m4933(long j2, long j3) {
        if (C1147.m1498() <= 0) {
            return Math.max(j2, j3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static void m4934(Object obj, Object obj2) {
        if (C1137.m3457() < 0) {
            ((AbsListView) obj).setAdapter((ListAdapter) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۧۥ, reason: not valid java name and contains not printable characters */
    public static String m4935(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۥ۟۠, reason: not valid java name and contains not printable characters */
    public static int m4936(Object obj) {
        if (C1150.m3967() >= 0) {
            return ((C1049f) obj).f4175b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m4937() {
        if (C1121.m2777() > 0) {
            return "ۢۡۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4938(Object obj, Object obj2, int i2, long j2) {
        if (C1165.m4643() > 0) {
            return ((AdapterView) obj).performItemClick((View) obj2, i2, j2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m4939(Object obj, int i2) {
        if (C1139.m3541() > 0) {
            return ((Adapter) obj).getItem(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۦ, reason: not valid java name and contains not printable characters */
    public static String m4940() {
        if (C1168.m4797() <= 0) {
            return "ۡۡۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۥ, reason: not valid java name and contains not printable characters */
    public static Object m4941(Object obj) {
        if (C1176.m5115() < 0) {
            return ((C0468m) obj).f1200c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4942(Object obj, Object obj2) {
        if (C1135.m3328() > 0) {
            ((ViewStubCompat) obj).setLayoutInflater((LayoutInflater) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۢ۠, reason: not valid java name and contains not printable characters */
    public static void m4943(Object obj, Object obj2) {
        if (C1155.m4177() >= 0) {
            ((AbsListView) obj).setOnScrollListener((AbsListView.OnScrollListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧۨۧ, reason: not valid java name and contains not printable characters */
    public static long m4944(double d2) {
        if (C1169.m4842() <= 0) {
            return Math.round(d2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m4945(Object obj) {
        if (C1139.m3541() > 0) {
            return ((C0340n) obj).f970b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static TimeUnit m4946() {
        if (C1163.m4579() >= 0) {
            return TimeUnit.SECONDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static ListAdapter m4947(Object obj) {
        if (C1131.m3177() <= 0) {
            return ((C0665g) obj).f2688x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static void m4948(Object obj, Object obj2) {
        if (C1176.m5115() < 0) {
            ((InterfaceC0954n0) obj).setWindowCallback((Window.Callback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static void m4949(Object obj) {
        if (C1136.m3395() < 0) {
            ((Activity) obj).finishAffinity();
        }
    }

    /* JADX INFO: renamed from: ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static void m4950(Object obj, Object obj2) {
        if (m4932() < 0) {
            ((TextView) obj).setError((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۡۦۡ, reason: not valid java name and contains not printable characters */
    public static void m4951(Object obj, float f, float f2) {
        if (C1140.m3595() > 0) {
            ((Canvas) obj).translate(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۡۢۥۧ, reason: not valid java name and contains not printable characters */
    public static int m4952(Object obj) {
        if (C1147.m1498() <= 0) {
            return ((C0764o) obj).f3081c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۥۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4953(Object obj, Object obj2) {
        if (C1129.m3120() <= 0) {
            return ((Window.Callback) obj).dispatchPopulateAccessibilityEvent((AccessibilityEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static void m4954(Object obj, Object obj2) {
        if (C1148.m3908() > 0) {
            ((NestedScrollView) obj).setOnScrollChangeListener((InterfaceC0380j) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۤۡ۠, reason: not valid java name and contains not printable characters */
    public static Locale m4955(Object obj, int i2) {
        if (C1137.m3457() <= 0) {
            return ((InterfaceC0135g) obj).get(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m4956(Object obj) {
        if (C1180.m5241() <= 0) {
            return ((C0212r) obj).f689e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static EnumC0581m m4957() {
        if (C1122.m2810() < 0) {
            return EnumC0581m.f1869d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m4958(Object obj, Object obj2) {
        if (C1141.m3607() >= 0) {
            AbstractC0673o.m1902b(obj, (LocaleList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4959() {
        if (C1144.m3748() <= 0) {
            return "ۣۨ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ */
    public static String m2498() {
        if (C1136.m3395() < 0) {
            return "ۦۣ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4960(Object obj) {
        if (C1121.m2777() > 0) {
            return ((CheckableImageButton) obj).f2277d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m4961(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((AbstractC0165g) obj).f520L;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۢۡۢ, reason: not valid java name and contains not printable characters */
    public static void m4962(Object obj, int i2) {
        if (C1127.m3025() >= 0) {
            ((ActionBarContextView) obj).setContentHeight(i2);
        }
    }

    /* JADX INFO: renamed from: ۦۥۧ۠, reason: contains not printable characters */
    public static Window m4964(Object obj) {
        if (C1151.m4000() >= 0) {
            return ((C0665g) obj).f2667c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static CheckableImageButton m4965(Object obj) {
        if (C1131.m3177() < 0) {
            return ((C0188A) obj).f621d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static int m4966(Object obj) {
        if (C1135.m3328() > 0) {
            return ((C0007h) obj).f19a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static C0793h m4967(Object obj) {
        if (C1169.m4842() < 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2567p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4968(Object obj) {
        if (C1154.m4128() >= 0) {
            return ((TextInputLayout) obj).m1774m();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ۢ۠, reason: contains not printable characters */
    public static String m4963(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
