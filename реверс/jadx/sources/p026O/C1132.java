package p026O;

import android.animation.Animator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.fragment.app.AnimationAnimationListenerC0535e;
import androidx.lifecycle.C1147;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.net.ssl.X509TrustManager;
import p001A0.C1121;
import p004C.C1122;
import p014H0.C1124;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.C0198d;
import p023M0.C0209o;
import p023M0.C0220z;
import p023M0.C1127;
import p024N.AbstractC0226D;
import p024N.C0249a0;
import p024N.C1128;
import p025N0.C1129;
import p025N0.C1131;
import p038U.C1137;
import p041V0.C1138;
import p044X.C1140;
import p051a1.C1145;
import p060e.C0649E;
import p060e.C0678t;
import p060e.DialogInterfaceC0666h;
import p060e.LayoutInflaterFactory2C0648D;
import p068h0.C1162;
import p070i0.C1164;
import p072k.MenuC0816m;
import p073k0.C1166;
import p075l0.C1168;
import p081o0.C1170;
import p084q.C1023b;
import p084q.C1172;
import p086r.C1174;
import p096w0.C1177;
import p097x.C1178;
import p098x0.C1179;

/* JADX INFO: renamed from: O.ۦۢ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1132 {

    /* JADX INFO: renamed from: ۣۦۡۤ, reason: not valid java name and contains not printable characters */
    public static int f4847 = -90;

    /* JADX INFO: renamed from: ۟۟ۦۧۢ, reason: not valid java name and contains not printable characters */
    public static void m3203(Object obj, Object obj2) {
        if (C1150.m3967() >= 0) {
            ((ActionBarContextView) obj).setSubtitle((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3204(Object obj, float f) {
        if (C1127.m3025() > 0) {
            return ((AbstractC0165g) obj).m574A(f);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static int m3205(Object obj) {
        if (C1126.m2964() < 0) {
            return ((AbstractC0165g) obj).f570t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥۦۦ, reason: not valid java name and contains not printable characters */
    public static void m3206(Object obj, float f) {
        if (C1124.m2896() >= 0) {
            ((C0249a0) obj).m805a(f);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3207(Object obj, Object obj2) {
        if (C1155.m4177() > 0) {
            return ((String) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۦۥ۠, reason: not valid java name and contains not printable characters */
    public static String m3208() {
        if (C1147.m1498() < 0) {
            return "ۧ۟ۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۨۥ, reason: not valid java name and contains not printable characters */
    public static void m3209(Object obj, Object obj2, Object obj3) {
        if (C1170.m4847() >= 0) {
            ((Bundle) obj).putParcelable((String) obj2, (Parcelable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m3210() {
        if (C1150.m3967() >= 0) {
            return "ۣ۠ۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static void m3211(Object obj) {
        if (C1164.m4618() > 0) {
            ((C0249a0) obj).m806b();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۦ, reason: not valid java name and contains not printable characters */
    public static DisplayMetrics m3212(Object obj) {
        if (C1172.m4932() < 0) {
            return ((Resources) obj).getDisplayMetrics();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3213(Object obj) {
        if (C1122.m2810() < 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2541N;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m3214(Object obj) {
        if (C1168.m4797() < 0) {
            return ((C1023b) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۟۠, reason: not valid java name and contains not printable characters */
    public static TransformationMethod m3215(Object obj) {
        if (C1129.m3120() <= 0) {
            return ((TextView) obj).getTransformationMethod();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m3216() {
        if (C1147.m1498() < 0) {
            return "ۡۨۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۨ, reason: not valid java name and contains not printable characters */
    public static int m3217() {
        return 922 ^ C1129.f4844;
    }

    /* JADX INFO: renamed from: ۟ۦۦۤۡ, reason: not valid java name and contains not printable characters */
    public static void m3218(Object obj) {
        if (C1168.m4797() <= 0) {
            ((DialogInterfaceC0666h) obj).dismiss();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۨۨ, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC0666h m3219(Object obj) {
        if (C1174.m5008() >= 0) {
            return ((C0649E) obj).f2578a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۨ, reason: not valid java name and contains not printable characters */
    public static void m3220(Object obj, Object obj2) {
        if (C1149.m3923() <= 0) {
            ((C0209o) obj).m655a((TextInputLayout) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۦۢ, reason: not valid java name and contains not printable characters */
    public static ViewGroup m3221(Object obj) {
        if (C1157.m4271() >= 0) {
            return ((AnimationAnimationListenerC0535e) obj).f1715b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static void m3222(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        if (C1127.m3025() >= 0) {
            ((AbstractC0165g) obj).m599x((Canvas) obj2, (Paint) obj3, (RectF) obj4, i2);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static int m3223(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m3224(Object obj, int i2, Object obj2, Object obj3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (C1145.m3805() < 0) {
            ((Cipher) obj).init(i2, (Key) obj2, (AlgorithmParameterSpec) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۦ۟۟, reason: not valid java name and contains not printable characters */
    public static void m3225(Object obj, Object obj2, Object obj3) throws CertificateException {
        if (C1131.m3177() <= 0) {
            ((X509TrustManager) obj).checkServerTrusted((X509Certificate[]) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۦۣۤ, reason: not valid java name and contains not printable characters */
    public static void m3226(Object obj, Object obj2, Object obj3) {
        if (C1121.m2777() >= 0) {
            ((AbstractC0226D) obj).m695d((View) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۢۤ, reason: not valid java name and contains not printable characters */
    public static int m3227(Object obj) {
        if (C1128.m3066() >= 0) {
            return ((C0220z) obj).f758e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static Byte m3228(byte b) {
        if (C1179.m5236() > 0) {
            return Byte.valueOf(b);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦۢ, reason: not valid java name and contains not printable characters */
    public static C0678t m3229(Object obj) {
        if (C1137.m3457() <= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2570s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۢ, reason: not valid java name and contains not printable characters */
    public static String m3230(String str) {
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

    /* JADX INFO: renamed from: ۥ۟ۤۡ, reason: contains not printable characters */
    public static void m3231(Object obj, int i2) {
        if (C1178.m5174() < 0) {
            ((AbstractC0165g) obj).setTickInactiveRadius(i2);
        }
    }

    /* JADX INFO: renamed from: ۥۡ۟ۥ, reason: contains not printable characters */
    public static ViewPropertyAnimator m3232(Object obj, Object obj2) {
        if (C1122.m2810() <= 0) {
            return ((ViewPropertyAnimator) obj).setListener((Animator.AnimatorListener) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۨۢ, reason: contains not printable characters */
    public static String m3233() {
        if (C1138.m3471() >= 0) {
            return "ۨۥۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۦۢ, reason: contains not printable characters */
    public static boolean m3235(Object obj) {
        if (C1166.m4699() > 0) {
            return TextUtils.isEmpty((CharSequence) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static void m3236(Object obj, Object obj2) {
        if (C1155.m4177() > 0) {
            ((LayoutInflaterFactory2C0648D) obj).m1853o((MenuC0816m) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۤۢۡ, reason: not valid java name and contains not printable characters */
    public static int m3237() {
        if (C1138.m3471() > 0) {
            return Build.VERSION.SDK_INT;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۦ, reason: not valid java name and contains not printable characters */
    public static long m3238(Object obj) {
        if (C1147.m1498() < 0) {
            return ((File) obj).lastModified();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۦۧۥ, reason: not valid java name and contains not printable characters */
    public static int m3239(Object obj) {
        if (C1177.m5152() > 0) {
            return ((C0198d) obj).f643a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡۤۢ, reason: not valid java name and contains not printable characters */
    public static void m3240(Object obj, Object obj2, int i2, int i3, Object obj3) {
        if (C1162.m4523() < 0) {
            ((Canvas) obj).drawPoints((float[]) obj2, i2, i3, (Paint) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m3241(Object obj) {
        if (C1140.m3595() >= 0) {
            return ((Configuration) obj).screenLayout;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨۡۧ, reason: contains not printable characters */
    public static String m3234(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
