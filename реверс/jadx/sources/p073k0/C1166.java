package p073k0;

import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.util.Property;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewOverlay;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.internal.C1156;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.slider.Slider;
import com.google.android.material.snackbar.C1157;
import com.reddit.frontpage.ConfigsActivity;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import p005C0.C0048n;
import p010F0.AbstractC0090e;
import p015I0.C0112h;
import p019K0.AbstractC0165g;
import p023M0.AbstractC0213s;
import p023M0.C0190C;
import p023M0.C0199e;
import p023M0.C1127;
import p023M0.ViewOnFocusChangeListenerC0196b;
import p025N0.C1130;
import p025N0.C1131;
import p029P0.C0325b;
import p036T.ViewOnTouchListenerC0377g;
import p037T0.C1135;
import p041V0.C1138;
import p044X.C1140;
import p045X0.C1141;
import p050a0.C1142;
import p050a0.C1143;
import p051a1.C1144;
import p052b0.C1152;
import p058d0.C0643;
import p058d0.C1158;
import p060e.C0658N;
import p060e.ExecutorC0674p;
import p060e.RunnableC0671m;
import p070i0.C1164;
import p072k.C1165;
import p081o0.C1170;
import p084q.C1031j;
import p084q.C1173;
import p086r.C1174;
import p089t.C1175;
import p092u0.C1176;
import p098x0.C1179;

/* JADX INFO: renamed from: k0.۠ۧۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1166 {

    /* JADX INFO: renamed from: ۨۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int f4909 = 894;

    /* JADX INFO: renamed from: ۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static ContentInfo.Builder m4679(Object obj, int i2) {
        if (C1127.m3025() >= 0) {
            return AbstractC0090e.m391e((ClipData) obj, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static CharSequence m4680(Object obj) {
        if (C1144.m3748() < 0) {
            return ((TextView) obj).getText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۤۡ, reason: not valid java name and contains not printable characters */
    public static int m4681(Object obj) {
        if (C1142.m3681() < 0) {
            return ((ContentInfo) obj).getFlags();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static EditText m4682(Object obj) {
        if (C1140.m3595() >= 0) {
            return ((C0190C) obj).f630b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m4683(Object obj) {
        if (C1157.m4271() >= 0) {
            return ((C0048n) obj).f175c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۤۦ, reason: not valid java name and contains not printable characters */
    public static void m4684(Object obj, float f) {
        if (C1135.m3328() > 0) {
            ((Slider) obj).setValue(f);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static void m4685(Object obj, Object obj2) {
        if (C1179.m5236() >= 0) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۡۨ, reason: not valid java name and contains not printable characters */
    public static ViewOnFocusChangeListenerC0196b m4686(Object obj) {
        if (C1138.m3471() >= 0) {
            return ((C0199e) obj).f651k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static String m4687() {
        if (C1174.m5008() >= 0) {
            return "ۨۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m4688(Object obj, Object obj2, Object obj3) {
        if (C1131.m3177() <= 0) {
            return ((C1031j) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۨ, reason: not valid java name and contains not printable characters */
    public static void m4690(Object obj, boolean z2) {
        if (C1143.m3711() <= 0) {
            ((CheckableImageButton) obj).setCheckable(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۧۥ, reason: not valid java name and contains not printable characters */
    public static Rect m4691(Object obj) {
        if (C1152.m4038() >= 0) {
            return ((C0325b) obj).f920C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۧۢ, reason: not valid java name and contains not printable characters */
    public static void m4692(Object obj, Object obj2) {
        if (C1156.m4236() > 0) {
            ((C0112h) obj).m484p((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢ۟۠, reason: not valid java name and contains not printable characters */
    public static String m4693(Object obj) {
        if (C1164.m4618() > 0) {
            return ConfigsActivity.m1799E((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۥۥ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m4694(Object obj, Object obj2, Object obj3) {
        if (C1165.m4643() > 0) {
            return ObjectAnimator.ofFloat(obj, (Property<Object, Float>) obj2, (float[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static View m4695(Object obj) {
        if (C1170.m4847() >= 0) {
            return ((C0658N) obj).f2626v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m4696(Object obj) {
        if (C1158.m4364() <= 0) {
            ((View) obj).postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ۠ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static String m4697(String str) {
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

    /* JADX INFO: renamed from: ۡۤۨۤ, reason: not valid java name and contains not printable characters */
    public static Context m4698(Object obj) {
        if (C1170.m4847() >= 0) {
            return ((RunnableC0671m) obj).f2704b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m4699() {
        return (-212) ^ C1144.f4870;
    }

    /* JADX INFO: renamed from: ۢۤ۟۟, reason: not valid java name and contains not printable characters */
    public static String m4700(Object obj, Object obj2, Object obj3) {
        if (C1138.m3471() > 0) {
            return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m4701(Object obj, Object obj2) {
        if (C1130.m3165() > 0) {
            ((ExecutorC0674p) obj).execute((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۨۡۦ, reason: not valid java name and contains not printable characters */
    public static int m4702(Object obj) {
        if (C1141.m3607() > 0) {
            return ((SparseArray) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int m4703(Object obj, Object obj2) {
        if (C0643.m4322() <= 0) {
            return ((Configuration) obj).diff((Configuration) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m4704(Object obj) {
        if (C1176.m5115() < 0) {
            return ((ViewOnTouchListenerC0377g) obj).m1020e();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4705(Object obj, int i2) {
        if (C1164.m4618() >= 0) {
            return ((AbstractC0213s) obj).mo648i(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠ۡ۟, reason: contains not printable characters */
    public static String m4706() {
        if (C1176.m5115() <= 0) {
            return "ۣۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣۦ, reason: contains not printable characters */
    public static boolean m4707(Object obj, Object obj2) {
        if (C1150.m3967() >= 0) {
            return ((LocaleList) obj2).equals(obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ۦۨ, reason: contains not printable characters */
    public static int m4708(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۤ۟۟, reason: contains not printable characters */
    public static float m4709(Object obj) {
        if (C1154.m4128() > 0) {
            return ((NestedScrollView) obj).getVerticalScrollFactorCompat();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۧ۟ۢ, reason: contains not printable characters */
    public static void m4710(Object obj, Object obj2) {
        if (C1150.m3967() >= 0) {
            ((ViewOverlay) obj).remove((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۡ۠, reason: not valid java name and contains not printable characters */
    public static Slider m4711(Object obj) {
        if (C1173.m4990() <= 0) {
            return ((MainActivity) obj).f2473H;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m4712(Object obj, int i2) {
        if (C1154.m4128() > 0) {
            ((AbstractC0165g) obj).m589n(i2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m4713() {
        if (C1149.m3923() <= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4714(Object obj, float f, float f2, float f3, float f4, Object obj2) {
        if (C1156.m4236() >= 0) {
            return ((Canvas) obj).clipRect(f, f2, f3, f4, (Region.Op) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۤۦۧ, reason: not valid java name and contains not printable characters */
    public static ViewOverlay m4715(Object obj) {
        if (C1175.m5073() >= 0) {
            return ((View) obj).getOverlay();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۢ۟, reason: not valid java name and contains not printable characters */
    public static String m4689(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
