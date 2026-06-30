package p089t;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.AbstractComponentCallbacksC0548r;
import androidx.fragment.app.C0511A;
import androidx.fragment.app.C0518H;
import androidx.lifecycle.C1147;
import androidx.startup.C1149;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.C1156;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.util.Set;
import p001A0.C1121;
import p014H0.C1124;
import p015I0.C1125;
import p016J.InterfaceC0135g;
import p019K0.AbstractC0165g;
import p023M0.C0188A;
import p023M0.C0199e;
import p023M0.C0212r;
import p023M0.C0219y;
import p024N.C1128;
import p025N0.C1129;
import p025N0.C1130;
import p026O.C1132;
import p032R.C1134;
import p038U.C1137;
import p042W.C0404e;
import p042W.C1139;
import p044X.C1140;
import p045X0.C1141;
import p050a0.C1142;
import p060e.AbstractActivityC0669k;
import p060e.C0647C;
import p060e.C0657M;
import p060e.C0658N;
import p060e.C0684z;
import p060e.LayoutInflaterFactory2C0648D;
import p066g0.C1161;
import p068h0.C1162;
import p072k.C1165;
import p072k.MenuC0816m;
import p073k0.C1166;
import p074l.C0927e0;
import p075l0.C1168;
import p077m0.C1169;
import p081o0.AbstractC1015a;
import p084q.C1173;
import p092u0.C1176;
import p098x0.C1179;
import p100z.C1180;

/* JADX INFO: renamed from: t.ۦۧۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1175 {

    /* JADX INFO: renamed from: ۥ۟ۥۡ, reason: contains not printable characters */
    public static int f4918 = 392;

    /* JADX INFO: renamed from: ۟۟۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m5044() {
        if (C1137.m3457() <= 0) {
            return "۠ۦۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5045(Object obj) {
        if (C1128.m3066() > 0) {
            return AbstractActivityC0669k.m1893l((C0518H) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static TextInputLayout m5046(Object obj) {
        if (C1180.m5241() < 0) {
            return ((C0219y) obj).m687b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m5047(Object obj) {
        if (C1139.m3541() >= 0) {
            return ((AbstractComponentCallbacksC0548r) obj).f1781e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static int m5048(Object obj) {
        if (C1166.m4699() >= 0) {
            return ((View) obj).getScrollX();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۦۥۦ, reason: not valid java name and contains not printable characters */
    public static C0927e0 m5049(Object obj) {
        if (C1124.m2896() > 0) {
            return ((C0188A) obj).f619b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static String m5050(Object obj, int i2) {
        if (C1176.m5115() < 0) {
            return ((Resources) obj).getString(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m5051(Object obj, Object obj2) {
        if (C1162.m4523() <= 0) {
            ((C0657M) obj).mo1874k((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static View m5052(Object obj) {
        if (C1166.m4699() > 0) {
            return ((C0647C) obj).f2515g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static C0404e m5053(Object obj) {
        if (C1176.m5115() <= 0) {
            return ((BottomSheetBehavior) obj).f2082M;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨ۟, reason: not valid java name and contains not printable characters */
    public static C0518H m5054(Object obj) {
        if (C1132.m3217() >= 0) {
            return ((C0511A) obj).f1564a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static TypedArray m5055(Object obj, Object obj2, Object obj3, int i2, int i3) {
        if (C1130.m3165() > 0) {
            return ((Context) obj).obtainStyledAttributes((AttributeSet) obj2, (int[]) obj3, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m5056(double d2) {
        if (C1169.m4842() < 0) {
            return MainActivity.m1819w(d2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦۤ, reason: not valid java name and contains not printable characters */
    public static RectF m5057(Object obj) {
        if (C1134.m3300() <= 0) {
            return ((AbstractC0165g) obj).f559n0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static Object[] m5058(Object obj, Object obj2) {
        if (C1169.m4842() <= 0) {
            return ((Set) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5059(Object obj, Object obj2) {
        if (C1139.m3541() > 0) {
            return ((AbstractC0165g) obj).m585j((MotionEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢۤ, reason: not valid java name and contains not printable characters */
    public static int m5060(Object obj) {
        if (C1168.m4797() < 0) {
            return ((View) obj).getMeasuredHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static void m5061(Object obj, boolean z2) {
        if (C1134.m3300() <= 0) {
            ((C0199e) obj).m642t(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5062(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((AbstractC0165g) obj).m586k();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۨ, reason: not valid java name and contains not printable characters */
    public static DecelerateInterpolator m5063() {
        if (m5073() > 0) {
            return AbstractC1015a.f4050e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۢ, reason: not valid java name and contains not printable characters */
    public static float m5064(Object obj) {
        if (C1147.m1498() < 0) {
            return ((Configuration) obj).fontScale;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۡۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5065(Object obj, boolean z2, boolean z3) {
        if (C1140.m3595() >= 0) {
            return ((File) obj).setReadable(z2, z3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5066(Object obj) {
        if (C1156.m4236() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2542O;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۦۥ, reason: not valid java name and contains not printable characters */
    public static LayoutInflaterFactory2C0648D m5067(Object obj) {
        if (C1157.m4271() > 0) {
            return ((C0684z) obj).f2730d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m5068(Object obj, Object obj2) {
        if (C1142.m3681() < 0) {
            return ((View) obj).getLocalVisibleRect((Rect) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦ۟, reason: not valid java name and contains not printable characters */
    public static String m5069() {
        if (C1173.m4990() < 0) {
            return "ۤ۠ۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5070(Object obj) {
        if (C1129.m3120() <= 0) {
            return ((C0647C) obj).f2522n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static void m5071(Object obj, int i2) {
        if (C1165.m4643() >= 0) {
            ((View) obj).setImportantForAccessibility(i2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۧۡ, reason: not valid java name and contains not printable characters */
    public static void m5072(Object obj, Object obj2) {
        if (C1125.m2937() > 0) {
            ((AccessibilityNodeInfo) obj2).setTraversalAfter((View) obj);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m5073() {
        return (-546) ^ C1179.f4922;
    }

    /* JADX INFO: renamed from: ۣۢۨۥ, reason: not valid java name and contains not printable characters */
    public static TypedArray m5074(Object obj, Object obj2) {
        if (C1169.m4842() < 0) {
            return ((Context) obj).obtainStyledAttributes((int[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۦ, reason: not valid java name and contains not printable characters */
    public static void m5075(Object obj, Object obj2) {
        if (C1161.m4510() <= 0) {
            ((MenuC0816m) obj).m2194s((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static void m5076(Object obj, Object obj2, int i2) {
        if (C1165.m4643() > 0) {
            TextUtils.writeToParcel((CharSequence) obj, (Parcel) obj2, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۥۥۧ, reason: not valid java name and contains not printable characters */
    public static String m5077(String str) {
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

    /* JADX INFO: renamed from: ۤۡۧۡ, reason: not valid java name and contains not printable characters */
    public static int m5078(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۣۧ۟, reason: contains not printable characters */
    public static CharSequence m5079(Object obj) {
        if (C1129.m3120() <= 0) {
            return ((C0212r) obj).f700p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۢ, reason: contains not printable characters */
    public static String m5080() {
        if (C1156.m4236() > 0) {
            return "ۨۧ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۤ, reason: contains not printable characters */
    public static boolean m5081(Object obj) {
        if (C1141.m3607() > 0) {
            return ((InterfaceC0135g) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۧ۟, reason: contains not printable characters */
    public static void m5082(Object obj, Object obj2) {
        if (C1137.m3457() <= 0) {
            ((PrintWriter) obj).print((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۧۢۥ, reason: contains not printable characters */
    public static boolean m5083(Object obj) {
        if (C1180.m5241() <= 0) {
            return ((C0658N) obj).f2612F;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥۢ۟, reason: not valid java name and contains not printable characters */
    public static TimeInterpolator m5084(Object obj) {
        if (C1180.m5241() <= 0) {
            return ((C0199e) obj).f647g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨۤ, reason: not valid java name and contains not printable characters */
    public static String m5085() {
        if (C1149.m3923() < 0) {
            return "ۥۣ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5086(Object obj) {
        if (C1137.m3457() < 0) {
            return ((PowerManager) obj).isPowerSaveMode();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۤۦۡ, reason: not valid java name and contains not printable characters */
    public static int m5088(Object obj, Object obj2, Object obj3) {
        if (m5073() >= 0) {
            return Log.w((String) obj, (String) obj2, (Throwable) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨۡۦ, reason: not valid java name and contains not printable characters */
    public static int m5089(Object obj) {
        if (C1140.m3595() >= 0) {
            return ((AbstractC0165g) obj).f568s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۤۡ, reason: not valid java name and contains not printable characters */
    public static String m5087(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
