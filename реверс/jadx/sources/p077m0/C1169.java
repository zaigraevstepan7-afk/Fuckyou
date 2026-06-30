package p077m0;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ProgressBar;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.lifecycle.EnumC0580l;
import androidx.profileinstaller.C1148;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.snackbar.C1157;
import com.reddit.frontpage.ConfigsActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.net.ssl.SSLContext;
import p001A0.C1121;
import p004C.C1122;
import p014H0.C1124;
import p015I0.C1125;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.AbstractC0213s;
import p023M0.C0199e;
import p023M0.C0212r;
import p023M0.C0219y;
import p029P0.C1133;
import p031Q0.RunnableC0334h;
import p031Q0.ViewOnClickListenerC0327a;
import p032R.C1134;
import p037T0.C1136;
import p038U.C1137;
import p041V0.C1138;
import p045X0.C1141;
import p050a0.C1142;
import p050a0.C1143;
import p051a1.AbstractC0451c;
import p051a1.C1144;
import p058d0.C1158;
import p060e.AbstractActivityC0669k;
import p060e.AbstractC0676r;
import p060e.C0647C;
import p060e.C0651G;
import p060e.C0658N;
import p060e.C0665g;
import p060e.LayoutInflaterFactory2C0648D;
import p065g.C1159;
import p066g0.C1160;
import p071j.AbstractC0786a;
import p071j.C0790e;
import p071j.C0795j;
import p072k.C1165;
import p073k0.C1167;
import p074l.C0944k;
import p074l.C0965r;
import p079n0.AbstractC1013a;
import p083p0.C1171;
import p084q.C1031j;
import p084q.C1172;
import p092u0.C1176;
import p097x.C1178;
import p098x0.C1179;
import p100z.C1180;

/* JADX INFO: renamed from: m0.ۣ۟ۧۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1169 {

    /* JADX INFO: renamed from: ۢۥۧۤ, reason: not valid java name and contains not printable characters */
    public static int f4912 = 118;

    /* JADX INFO: renamed from: ۟۟ۤۢۦ, reason: not valid java name and contains not printable characters */
    public static void m4802(Object obj, Object obj2) {
        if (C1165.m4643() >= 0) {
            AbstractC0451c.m1146e(obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۡ۠, reason: not valid java name and contains not printable characters */
    public static C0944k m4803(Object obj) {
        if (C1156.m4236() > 0) {
            return ((ActionBarContextView) obj).f1297d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static EnumC0580l m4804() {
        if (C1176.m5115() <= 0) {
            return EnumC0580l.ON_CREATE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static void m4805(Object obj, Object obj2) {
        if (C1167.m4739() <= 0) {
            ((C0219y) obj).setSimpleItems((String[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m4806(Object obj, Object obj2) {
        if (C1141.m3607() >= 0) {
            ((View) obj).transformMatrixToLocal((Matrix) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m4807(Object obj, Object obj2) {
        if (C1171.m4901() >= 0) {
            return ((Cipher) obj).doFinal((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۧ, reason: not valid java name and contains not printable characters */
    public static void m4808(Object obj) {
        if (C1143.m3711() <= 0) {
            Locale.setDefault((Locale) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨۥۢ, reason: not valid java name and contains not printable characters */
    public static AdapterView.OnItemSelectedListener m4809(Object obj) {
        if (C1124.m2896() >= 0) {
            return ((AutoCompleteTextView) obj).getOnItemSelectedListener();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۧۧ, reason: not valid java name and contains not printable characters */
    public static void m4810(Object obj, int i2) {
        if (C1167.m4739() < 0) {
            ((AbstractC0165g) obj).setThumbTrackGapSize(i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static ConfigsActivity m4811(Object obj) {
        if (C1157.m4271() > 0) {
            return ((ViewOnClickListenerC0327a) obj).f936b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static AbstractC0676r m4812(Object obj) {
        if (C1159.m4411() >= 0) {
            return ((AbstractActivityC0669k) obj).m1894k();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static Object m4813(Object obj) {
        if (C1133.m3246() <= 0) {
            return ((RunnableC0334h) obj).f952b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static void m4814(Object obj) {
        if (C1121.m2777() > 0) {
            ((C0212r) obj).m671m();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m4815(Object obj) {
        if (C1125.m2937() > 0) {
            return ((AbstractC0213s) obj).mo650l();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨۢۡ, reason: not valid java name and contains not printable characters */
    public static int m4816(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۨۤۥ, reason: not valid java name and contains not printable characters */
    public static void m4817(Object obj, Object obj2, int i2, Object obj3) {
        if (C1142.m3681() <= 0) {
            ((ViewGroup) obj).addView((View) obj2, i2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4818(Object obj, Object obj2) {
        if (C1125.m2937() >= 0) {
            return ((String) obj).startsWith((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۧ, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedDispatcher m4819(Object obj) {
        if (C1180.m5241() <= 0) {
            return ((Activity) obj).getOnBackInvokedDispatcher();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۧ, reason: not valid java name and contains not printable characters */
    public static void m4820(Object obj, int i2) {
        if (C1138.m3471() > 0) {
            ((ProgressBar) obj).setProgress(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۡ, reason: not valid java name and contains not printable characters */
    public static void m4821(Object obj, Object obj2, Object obj3) {
        if (C1154.m4128() > 0) {
            ((View.AccessibilityDelegate) obj).onInitializeAccessibilityNodeInfo((View) obj2, (AccessibilityNodeInfo) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۥ, reason: not valid java name and contains not printable characters */
    public static void m4822(Object obj) throws IOException {
        if (C1143.m3711() <= 0) {
            ((OutputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static SSLContext m4823(Object obj) {
        if (C1150.m3967() >= 0) {
            return SSLContext.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static C0795j m4824(Object obj) {
        if (C1155.m4177() > 0) {
            return ((C0658N) obj).f2614H;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۤۤ, reason: not valid java name and contains not printable characters */
    public static void m4825(Object obj, Object obj2) {
        if (C1122.m2810() < 0) {
            ((View) obj).setContentDescription((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۠۠۟, reason: not valid java name and contains not printable characters */
    public static C1031j m4826() {
        if (C1136.m3395() <= 0) {
            return LayoutInflaterFactory2C0648D.f2525h0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m4827(Object obj) {
        if (C1137.m3457() <= 0) {
            return ((KeyEvent) obj).hasNoModifiers();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m4828(String str) {
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

    /* JADX INFO: renamed from: ۣۢۦۣ, reason: not valid java name and contains not printable characters */
    public static void m4829(Object obj) {
        if (C1124.m2896() >= 0) {
            LocaleList.setDefault((LocaleList) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۣۣ۠, reason: not valid java name and contains not printable characters */
    public static void m4830(Object obj) {
        if (C1141.m3607() > 0) {
            ((AbstractC0786a) obj).mo1864a();
        }
    }

    /* JADX INFO: renamed from: ۣۤۤۥ, reason: not valid java name and contains not printable characters */
    public static void m4831(Object obj, Object obj2, int i2, int i3, float f, Object obj3) {
        if (C1134.m3300() < 0) {
            ((AbstractC0165g) obj).m579d((Canvas) obj2, i2, i3, f, (Drawable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۦۤۡ, reason: not valid java name and contains not printable characters */
    public static int[] m4832() {
        if (C1158.m4364() < 0) {
            return AbstractC1013a.f4018H;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۨ۠, reason: not valid java name and contains not printable characters */
    public static ViewGroup m4833(Object obj, Object obj2) {
        if (C1178.m5174() <= 0) {
            return C0665g.m1886c((View) obj, (View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۤ۠, reason: contains not printable characters */
    public static int m4834(Object obj) {
        if (C1148.m3908() >= 0) {
            return ((AbstractC0165g) obj).f512D;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۢۧۦ, reason: contains not printable characters */
    public static C0647C m4835(Object obj) {
        if (C1142.m3681() < 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2540M;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۦۨ, reason: contains not printable characters */
    public static void m4836(Object obj, Object obj2) {
        if (C1160.m4437() < 0) {
            ((Activity) obj).onConfigurationChanged((Configuration) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۤ۟, reason: contains not printable characters */
    public static TimeInterpolator m4837(Object obj) {
        if (C1141.m3607() >= 0) {
            return ((C0199e) obj).f648h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۨ, reason: contains not printable characters */
    public static Insets m4838(Object obj) {
        if (C1172.m4932() <= 0) {
            return ((WindowInsets) obj).getTappableElementInsets();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۡ۟, reason: not valid java name and contains not printable characters */
    public static C0965r m4839(Object obj, Object obj2, Object obj3) {
        if (C1126.m2964() < 0) {
            return ((C0651G) obj).mo1788c((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static float m4840(float f) {
        if (C1171.m4901() >= 0) {
            return Math.abs(f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۦۢۢ, reason: not valid java name and contains not printable characters */
    public static AbstractC0786a m4841(Object obj) {
        if (C1144.m3748() < 0) {
            return ((C0790e) obj).f3179b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧۤ, reason: not valid java name and contains not printable characters */
    public static int m4842() {
        return 111 ^ C1179.f4922;
    }

    /* JADX INFO: renamed from: ۟۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static String m4801(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
