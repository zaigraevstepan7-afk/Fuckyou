package p025N0;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.graphics.Path;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Message;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.fragment.app.AbstractComponentCallbacksC0548r;
import androidx.fragment.app.AnimationAnimationListenerC0535e;
import androidx.fragment.app.C0536f;
import androidx.fragment.app.C0550t;
import androidx.lifecycle.C1147;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.CheckableImageButton;
import com.reddit.frontpage.ConfigsActivity;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Locale;
import javax.net.ssl.TrustManagerFactory;
import p001A0.C1121;
import p005C0.C0048n;
import p015I0.C1125;
import p017J0.C0144e;
import p019K0.AbstractC0165g;
import p023M0.AbstractC0213s;
import p023M0.C0206l;
import p023M0.C0212r;
import p023M0.C1127;
import p026O.C1132;
import p029P0.C1133;
import p031Q0.RunnableC0343q;
import p031Q0.ViewOnClickListenerC0327a;
import p038U.C1137;
import p045X0.C1141;
import p050a0.C1142;
import p050a0.C1143;
import p051a1.C1144;
import p051a1.C1145;
import p052b0.C1151;
import p058d0.C1158;
import p060e.C0660b;
import p060e.C0665g;
import p066g0.C1160;
import p066g0.C1161;
import p068h0.C1162;
import p070i0.C1164;
import p072k.C1165;
import p073k0.AbstractC0849m;
import p073k0.InterfaceC0847k;
import p075l0.C1168;
import p083p0.C1171;
import p084q.C1172;
import p084q.C1173;
import p089t.C1175;
import p096w0.C1177;
import p097x.C1178;

/* JADX INFO: renamed from: N0.۠ۧۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1130 {

    /* JADX INFO: renamed from: ۣ۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static int f4845 = -518;

    /* JADX INFO: renamed from: ۟۟ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static void m3134(Object obj, int i2) {
        if (C1172.m4932() <= 0) {
            ((AdapterView) obj).setSelection(i2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۧۦ, reason: not valid java name and contains not printable characters */
    public static void m3135(Object obj, Object obj2) {
        if (C1151.m4000() >= 0) {
            ((TextView) obj).setTransformationMethod((TransformationMethod) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥۦۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m3136(Object obj) {
        if (C1133.m3246() <= 0) {
            return ((C0665g) obj).f2680p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m3137(Object obj) {
        if (C1144.m3748() < 0) {
            return ((ViewOnClickListenerC0327a) obj).f935a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m3138(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۧۤ۟, reason: not valid java name and contains not printable characters */
    public static LocaleList m3139(Object obj) {
        if (C1142.m3681() <= 0) {
            return LocaleList.forLanguageTags((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static Application m3140(Object obj) {
        if (C1165.m4643() > 0) {
            return ((Activity) obj).getApplication();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static float m3141(Object obj, float f) {
        if (C1172.m4932() <= 0) {
            return ((AbstractC0165g) obj).m575B(f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static int m3142(Object obj) {
        if (C1160.m4437() <= 0) {
            return ((RunnableC0343q) obj).f976a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m3143(Object obj, int i2, int i3) {
        if (C1141.m3607() > 0) {
            ((View) obj).measure(i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m3144(Object obj) {
        if (C1177.m5152() >= 0) {
            ((ActionBarOverlayLayout) obj).m1210k();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static void m3145(Object obj, int i2) {
        if (C1137.m3457() <= 0) {
            ((C0144e) obj).m554a(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static int m3146(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟۠, reason: not valid java name and contains not printable characters */
    public static Path m3147(Object obj) {
        if (C1151.m4000() > 0) {
            return ((AbstractC0165g) obj).f555l0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m3148(Object obj, int i2) {
        if (C1145.m3805() < 0) {
            return ((SparseArray) obj).valueAt(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡۦ, reason: not valid java name and contains not printable characters */
    public static void m3149(Object obj, Object obj2, int i2, int i3) {
        if (C1151.m4000() > 0) {
            ((PackageManager) obj).setComponentEnabledSetting((ComponentName) obj2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۤ, reason: not valid java name and contains not printable characters */
    public static Button m3150(Object obj) {
        if (C1175.m5073() > 0) {
            return ((C0665g) obj).f2679o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۦ, reason: not valid java name and contains not printable characters */
    public static String m3151() {
        if (C1121.m2777() >= 0) {
            return "ۣۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۦۡ, reason: not valid java name and contains not printable characters */
    public static MaterialButton m3152(Object obj) {
        if (C1147.m1498() <= 0) {
            return ((ConfigsActivity) obj).f2458D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3153(Object obj, Object obj2) {
        if (C1125.m2937() > 0) {
            return ((Bundle) obj).getBoolean((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m3154(Object obj) {
        if (C1171.m4901() >= 0) {
            return ((String) obj).getBytes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static Locale m3155() {
        if (C1142.m3681() < 0) {
            return Locale.getDefault();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Message m3156(Object obj, int i2, Object obj2) {
        if (C1178.m5174() <= 0) {
            return ((Handler) obj).obtainMessage(i2, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟۟۟, reason: not valid java name and contains not printable characters */
    public static View m3157(Object obj) {
        if (C1162.m4523() < 0) {
            return ((C0660b) obj).f2635a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۦ, reason: not valid java name and contains not printable characters */
    public static void m3158(Object obj, Object obj2, Object obj3) {
        if (C1147.m1498() < 0) {
            ((C0048n) obj).m310u((String) obj2, (PrintWriter) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۨۤ۟, reason: not valid java name and contains not printable characters */
    public static void m3159(Object obj, Object obj2) throws KeyStoreException {
        if (C1127.m3025() > 0) {
            ((TrustManagerFactory) obj).init((KeyStore) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static C0550t m3160(Object obj) {
        if (C1173.m4990() < 0) {
            return ((AbstractComponentCallbacksC0548r) obj).f1795s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۦۨ, reason: not valid java name and contains not printable characters */
    public static void m3161(Object obj, Object obj2) {
        if (C1160.m4437() < 0) {
            ((ViewTreeObserver) obj).removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۥۧ۠, reason: not valid java name and contains not printable characters */
    public static double m3162(double d2) {
        if (C1168.m4797() <= 0) {
            return Math.cos(d2);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۥ۠ۢۨ, reason: contains not printable characters */
    public static C0536f m3164(Object obj) {
        if (C1155.m4177() > 0) {
            return ((AnimationAnimationListenerC0535e) obj).f1717d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۨۨ, reason: not valid java name and contains not printable characters */
    public static int m3165() {
        return 893 ^ C1143.f4869;
    }

    /* JADX INFO: renamed from: ۧۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static C0206l m3166(Object obj) {
        if (C1158.m4364() < 0) {
            return ((AbstractC0213s) obj).mo647h();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۡۦ, reason: not valid java name and contains not printable characters */
    public static void m3167(Object obj, Object obj2) {
        if (C1164.m4618() >= 0) {
            ((InterfaceC0847k) obj).mo2215f((AbstractC0849m) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۢۤ, reason: not valid java name and contains not printable characters */
    public static int m3168(Object obj) {
        if (C1121.m2777() > 0) {
            return ((View) obj).getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۦۨ, reason: not valid java name and contains not printable characters */
    public static CheckableImageButton m3169(Object obj, Object obj2, Object obj3, int i2) {
        if (C1132.m3217() >= 0) {
            return ((C0212r) obj).m659a((ViewGroup) obj2, (LayoutInflater) obj3, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۨ۠, reason: not valid java name and contains not printable characters */
    public static ValueAnimator m3170(Object obj) {
        if (C1161.m4510() < 0) {
            return ValueAnimator.ofInt((int[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public static String m3163(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
