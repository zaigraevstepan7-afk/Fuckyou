package p004C;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.fragment.app.AbstractComponentCallbacksC0548r;
import androidx.fragment.app.C0525O;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.json.JSONObject;
import p001A0.AbstractC0016e;
import p001A0.C1121;
import p005C0.AbstractC0047m;
import p014H0.C1124;
import p015I0.C1125;
import p016J.C0133e;
import p023M0.C1127;
import p024N.C1128;
import p025N0.C1129;
import p026O.C1132;
import p029P0.C1133;
import p032R.C1134;
import p036T.AbstractC0383m;
import p041V0.C1138;
import p042W.C1139;
import p045X0.C1141;
import p050a0.C1142;
import p052b0.C1151;
import p052b0.C1152;
import p057d.AbstractC0641a;
import p058d0.C0643;
import p060e.AbstractC0681w;
import p060e.C0651G;
import p060e.C0665g;
import p065g.C1159;
import p066g0.C0756j;
import p073k0.C1166;
import p073k0.C1167;
import p074l.C0884K0;
import p074l.C0962q;
import p074l.C0980x0;
import p075l0.C1168;
import p077m0.C1169;
import p081o0.AbstractC1015a;
import p081o0.C1170;
import p084q.C1172;
import p084q.C1173;

/* JADX INFO: renamed from: C.ۣ۟ۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1122 {

    /* JADX INFO: renamed from: ۣۧۡۨ, reason: not valid java name and contains not printable characters */
    public static int f4826 = 516;

    /* JADX INFO: renamed from: ۟۟ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2807(Object obj, Object obj2) {
        if (C1168.m4797() <= 0) {
            return ((WindowInsets) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static String m2808() {
        if (C1127.m3025() > 0) {
            return "ۨۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m2809(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static int m2810() {
        return 512 ^ C1149.f4875;
    }

    /* JADX INFO: renamed from: ۟ۡۢۧۨ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m2811() {
        if (C1132.m3217() > 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m2812(Object obj, Object obj2, float f) {
        if (C1124.m2896() >= 0) {
            return ((SharedPreferences.Editor) obj).putFloat((String) obj2, f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۨ۠, reason: not valid java name and contains not printable characters */
    public static C0962q m2813(Object obj, Object obj2, Object obj3) {
        if (C1159.m4411() > 0) {
            return ((C0651G) obj).mo1787b((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static Context m2814(Object obj) {
        if (C1124.m2896() >= 0) {
            return ((C0665g) obj).f2665a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2815(Object obj, Object obj2) {
        if (C1121.m2777() > 0) {
            return TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static LinearInterpolator m2816() {
        if (C1129.m3120() <= 0) {
            return AbstractC1015a.f4046a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static int[] m2817() {
        if (C1132.m3217() > 0) {
            return AbstractC0641a.f2489j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m2818(Object obj) {
        if (C1172.m4932() <= 0) {
            return ((C0756j) obj).f3016i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۥ, reason: not valid java name and contains not printable characters */
    public static C0980x0 m2819(Object obj) {
        if (C1142.m3681() <= 0) {
            return ((C0884K0) obj).f3554c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤ۟, reason: not valid java name and contains not printable characters */
    public static int m2820(Object obj) {
        if (C1170.m4847() >= 0) {
            return ((ArrayList) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۢ, reason: not valid java name and contains not printable characters */
    public static void m2821(Object obj, Object obj2) {
        if (C1170.m4847() > 0) {
            ((PrintWriter) obj).println((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۡۤۧ, reason: not valid java name and contains not printable characters */
    public static void m2822(Object obj, int i2, Object obj2) {
        if (C1155.m4177() >= 0) {
            ((SparseArray) obj).append(i2, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟۠, reason: not valid java name and contains not printable characters */
    public static void m2823(Object obj, Object obj2) {
        if (C1128.m3066() > 0) {
            ((ThreadLocal) obj).set(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static PasswordTransformationMethod m2824() {
        if (C1133.m3246() <= 0) {
            return PasswordTransformationMethod.getInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static C0525O m2825(Object obj) {
        if (C1166.m4699() >= 0) {
            return ((AbstractComponentCallbacksC0548r) obj).f1772N;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2826(int i2) {
        if (C1169.m4842() < 0) {
            return KeyEvent.isModifierKey(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static void m2827(Object obj, Object obj2, int i2, int i3) {
        if (C1146.m3842() <= 0) {
            AbstractC0047m.m272a((Context) obj, (AttributeSet) obj2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۢۦۢۥ, reason: not valid java name and contains not printable characters */
    public static int m2828(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۢۦۣ, reason: not valid java name and contains not printable characters */
    public static int m2829(Object obj, int i2, int i3) {
        if (C1138.m3471() > 0) {
            return ((TypedArray) obj).getDimensionPixelOffset(i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۡۤ, reason: not valid java name and contains not printable characters */
    public static void m2830(Object obj) {
        if (C1134.m3300() <= 0) {
            ((TextInputLayout) obj).m1779r();
        }
    }

    /* JADX INFO: renamed from: ۣۥۡۥ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m2831(Object obj, Object obj2, int i2) {
        if (C1150.m3967() > 0) {
            return AbstractC0016e.m162K((Context) obj, (TypedArray) obj2, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ */
    public static Drawable m249(Object obj) {
        if (C1151.m4000() > 0) {
            return ((Drawable.ConstantState) obj).newDrawable();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۢ۟, reason: not valid java name and contains not printable characters */
    public static void m2832(Object obj) {
        if (C1167.m4739() < 0) {
            AbstractC0681w.m1910c((C0133e) obj);
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۦ۠, reason: contains not printable characters */
    public static boolean m2833(Object obj, Object obj2, boolean z2) {
        if (C0643.m4322() < 0) {
            return ((JSONObject) obj).optBoolean((String) obj2, z2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۡ, reason: contains not printable characters */
    public static Class m2834(Object obj, Object obj2) {
        if (C1152.m4038() > 0) {
            return ((Class) obj).asSubclass((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۡۤ, reason: contains not printable characters */
    public static long m2835() {
        if (C1125.m2937() > 0) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۤ۠ۦ, reason: contains not printable characters */
    public static EditText m2836(Object obj) {
        if (C1139.m3541() > 0) {
            return ((TextInputLayout) obj).f2367d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۨ, reason: contains not printable characters */
    public static LocaleList m2837(Object obj) {
        if (C1127.m3025() > 0) {
            return ((Configuration) obj).getLocales();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۤۥ, reason: contains not printable characters */
    public static String m2838() {
        if (C1138.m3471() > 0) {
            return "ۤ۟ۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m2839(Object obj, int i2) {
        if (C1173.m4990() < 0) {
            return ((ByteBuffer) obj).getInt(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2841() {
        if (C1141.m3607() >= 0) {
            return AbstractC0383m.f1053l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۡۥ, reason: not valid java name and contains not printable characters */
    public static String m2840(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
