package p050a0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Parcel;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.lifecycle.C1147;
import androidx.versionedparcelable.C1150;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import p001A0.AbstractC0016e;
import p001A0.C1121;
import p004C.AbstractC0027h;
import p005C0.C0048n;
import p010F0.AbstractC0090e;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.C0188A;
import p023M0.C1127;
import p025N0.C1131;
import p029P0.C1133;
import p031Q0.C0339m;
import p032R.C1134;
import p038U.C1137;
import p042W.C1139;
import p051a1.C1144;
import p051a1.C1145;
import p058d0.C0643;
import p060e.C0658N;
import p060e.LayoutInflaterFactory2C0648D;
import p065g.C1159;
import p066g0.AbstractC0741b0;
import p066g0.C0752h;
import p072k.C1165;
import p073k0.C1166;
import p074l.C0884K0;
import p075l0.C1168;
import p077m0.C1169;
import p083p0.C1171;
import p084q.C1172;
import p086r.C1174;
import p096w0.C1177;

/* JADX INFO: renamed from: a0.ۣ۟ۤۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1143 {

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f4869 = 825;

    /* JADX INFO: renamed from: ۟۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static ContentInfo m3687(Object obj) {
        if (C1169.m4842() < 0) {
            return AbstractC0090e.m393g(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static String m3688(Object obj, Object obj2) {
        if (C1142.m3681() <= 0) {
            return AbstractC0027h.m236c((Activity) obj, (ComponentName) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۧۦ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m3689(Object obj, int i2) {
        if (C1177.m5152() >= 0) {
            return AbstractC0016e.m160I((Context) obj, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨ۟, reason: not valid java name and contains not printable characters */
    public static void m3690(Object obj) {
        if (C1172.m4932() <= 0) {
            ((ActionBarContextView) obj).m1203e();
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static byte m3691(Object obj) {
        if (C1169.m4842() < 0) {
            return ((Parcel) obj).readByte();
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۤ, reason: not valid java name and contains not printable characters */
    public static int m3692(Object obj) {
        if (C0643.m4322() < 0) {
            return ((MotionEvent) obj).getActionMasked();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC0741b0 m3693(Object obj) {
        if (C1171.m4901() > 0) {
            return ((C0752h) obj).f2988a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۦۥ, reason: not valid java name and contains not printable characters */
    public static void m3694(Object obj) {
        if (C1147.m1498() <= 0) {
            ((C0188A) obj).m629e();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3695(Object obj) {
        if (C1121.m2777() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2577z;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟۟, reason: not valid java name and contains not printable characters */
    public static void m3696(Object obj) {
        if (C1133.m3246() <= 0) {
            ((C0884K0) obj).mo2150i();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۡ۟, reason: not valid java name and contains not printable characters */
    public static void m3697(Object obj) {
        if (C1134.m3300() <= 0) {
            ((SharedPreferences.Editor) obj).apply();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۦۦ, reason: not valid java name and contains not printable characters */
    public static int m3698(Object obj) {
        if (C1127.m3025() >= 0) {
            return ((ViewGroup.LayoutParams) obj).width;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۧۨۢ, reason: not valid java name and contains not printable characters */
    public static int m3699(Object obj) {
        if (C1139.m3541() >= 0) {
            return ((AbstractC0165g) obj).getThumbRadius();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m3700(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۧۡۡ, reason: not valid java name and contains not printable characters */
    public static int m3701(Object obj) {
        if (C1145.m3805() <= 0) {
            return ((View) obj).getMeasuredWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۡ, reason: not valid java name and contains not printable characters */
    public static int m3702(Object obj) {
        if (C1137.m3457() <= 0) {
            return ((KeyEvent) obj).getKeyCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m3703(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m3704(Object obj) {
        if (C1150.m3967() >= 0) {
            return ((ViewGroup.MarginLayoutParams) obj).height;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3705(Object obj) {
        if (C1126.m2964() < 0) {
            return ((TextInputLayout) obj).f2381k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۦۡ, reason: not valid java name and contains not printable characters */
    public static void m3706(Object obj, boolean z2) {
        if (C1127.m3025() >= 0) {
            ((View) obj).setClickable(z2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static String m3707() {
        if (C1159.m4411() > 0) {
            return "ۨۨ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m3708(Object obj, double d2) {
        if (C1145.m3805() <= 0) {
            return ((AbstractC0165g) obj).m584i(d2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۦۢ, reason: not valid java name and contains not printable characters */
    public static float m3709(Object obj) {
        if (C1166.m4699() >= 0) {
            return ((AbstractC0165g) obj).f526R;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۢۦ۠, reason: not valid java name and contains not printable characters */
    public static int m3711() {
        return (-727) ^ C1168.f4911;
    }

    /* JADX INFO: renamed from: ۤۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m3712(Object obj) {
        if (C1165.m4643() >= 0) {
            ((Path) obj).reset();
        }
    }

    /* JADX INFO: renamed from: ۤۨۤۨ, reason: not valid java name and contains not printable characters */
    public static Rect m3713(Object obj) {
        if (C1146.m3842() < 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2556c0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۨۥ, reason: contains not printable characters */
    public static String m3714(int i2) {
        if (C1131.m3177() <= 0) {
            return Integer.toHexString(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۢۢ, reason: contains not printable characters */
    public static int m3715(Object obj) {
        if (C1131.m3177() <= 0) {
            return ((StringBuilder) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨۧۧ, reason: contains not printable characters */
    public static void m3716(Object obj, Object obj2) {
        if (C1131.m3177() <= 0) {
            ((ActionBarContextView) obj).setCustomView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۨۢ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m3717() {
        if (C1144.m3748() <= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static SimpleDateFormat m3718(Object obj) {
        if (C1137.m3457() <= 0) {
            return ((C0339m) obj).f967e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static Boolean m3719(boolean z2) {
        if (C1126.m2964() <= 0) {
            return Boolean.valueOf(z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۤۨ, reason: not valid java name and contains not printable characters */
    public static C0048n m3720(Object obj) {
        if (C1174.m5008() > 0) {
            return ((C0658N) obj).f2630z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۨ, reason: not valid java name and contains not printable characters */
    public static String m3710(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
