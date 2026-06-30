package p051a1;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Parcel;
import android.text.Editable;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.AbstractActivityC0466k;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.AbstractC0537g;
import androidx.lifecycle.C0588t;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.ConfigsActivity;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.util.ArrayList;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import p000A.C0005f;
import p001A0.C1121;
import p004C.AbstractC0027h;
import p004C.C1122;
import p009F.C0076c;
import p014H0.C1124;
import p018K.C0154j;
import p019K0.AbstractC0165g;
import p023M0.C0207m;
import p023M0.C0212r;
import p023M0.C0216v;
import p023M0.C0220z;
import p023M0.C1127;
import p023M0.ViewOnClickListenerC0195a;
import p023M0.ViewOnFocusChangeListenerC0196b;
import p024N.AbstractC0279p0;
import p025N0.C1130;
import p029P0.C1133;
import p031Q0.DialogInterfaceOnShowListenerC0330d;
import p032R.C1134;
import p037T0.C1136;
import p041V0.C1138;
import p042W.C1139;
import p045X0.C1141;
import p049a.InterfaceC0444b;
import p050a0.C1142;
import p052b0.C1152;
import p058d0.C0643;
import p060e.AbstractActivityC0669k;
import p060e.C0645A;
import p060e.C0665g;
import p065g.C1159;
import p066g0.C1160;
import p066g0.C1161;
import p070i0.C1164;
import p072k.C1165;
import p074l.InterfaceC0957o0;
import p075l0.C1168;
import p077m0.C1169;
import p081o0.C1170;
import p084q.C1172;
import p084q.C1173;
import p086r.C1174;
import p089t.C1175;

/* JADX INFO: renamed from: a1.ۣۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1144 {

    /* JADX INFO: renamed from: ۧۢۨۧ, reason: not valid java name and contains not printable characters */
    public static int f4870 = -486;

    /* JADX INFO: renamed from: ۟۟۠, reason: not valid java name and contains not printable characters */
    public static Object m3721(Object obj) {
        if (C1142.m3681() <= 0) {
            return ((C0154j) obj).f485b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m3722(Object obj, Object obj2) {
        if (C0643.m4322() < 0) {
            ((Parcel) obj).writeIntArray((int[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static void m3723(Object obj, float f) {
        if (C1142.m3681() <= 0) {
            ((Parcel) obj).writeFloat(f);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Method m3724(Object obj, Object obj2, Object obj3) {
        if (C1146.m3842() < 0) {
            return ((Class) obj).getMethod((String) obj2, (Class[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۦۣ, reason: not valid java name and contains not printable characters */
    public static Field m3725(Object obj, Object obj2) {
        if (C1168.m4797() <= 0) {
            return ((Class) obj).getDeclaredField((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static int m3726(Object obj) {
        if (C1130.m3165() >= 0) {
            return ((AlertController$RecycleListView) obj).f1254b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۡۤ, reason: not valid java name and contains not printable characters */
    public static void m3727(Object obj, Object obj2) {
        if (C0643.m4322() < 0) {
            ((Window) obj).setCallback((Window.Callback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m3728(Object obj, float f, float f2, float f3, float f4, Object obj2) {
        if (C1172.m4932() < 0) {
            ((Canvas) obj).drawLine(f, f2, f3, f4, (Paint) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۤۤ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m3729(Object obj) {
        if (C1165.m4643() >= 0) {
            return MessageDigest.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۢ۠, reason: not valid java name and contains not printable characters */
    public static Intent m3730(Object obj) {
        if (C1138.m3471() >= 0) {
            return AbstractC0027h.m234a((AbstractActivityC0669k) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static NestedScrollView m3731(Object obj) {
        if (C1173.m4990() < 0) {
            return ((C0665g) obj).f2682r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static String m3732() {
        if (C1139.m3541() > 0) {
            return Build.FINGERPRINT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3733(Object obj) {
        if (C1157.m4271() >= 0) {
            return ((C0665g) obj).f2672h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3734(Object obj) {
        if (C1169.m4842() <= 0) {
            return ((AbstractC0165g) obj).f556m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ViewOnClickListenerC0195a m3735(Object obj) {
        if (C1136.m3395() <= 0) {
            return ((C0220z) obj).f760g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m3736(Object obj) {
        if (C1156.m4236() > 0) {
            return ((C0216v) obj).f727i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3737(Object obj, int i2, float f) {
        if (C1155.m4177() >= 0) {
            return ((AbstractC0165g) obj).m594s(i2, f);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۨ, reason: not valid java name and contains not printable characters */
    public static int m3738(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m3739(Object obj, Object obj2, Object obj3) {
        if (C1136.m3395() < 0) {
            ((ViewGroup) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static TextView m3740(Object obj) {
        if (C1133.m3246() <= 0) {
            return ((MainActivity) obj).f2467B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static PublicKey m3741(Object obj) {
        if (C1124.m2896() > 0) {
            return ((Certificate) obj).getPublicKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۥۡ, reason: not valid java name and contains not printable characters */
    public static C0588t m3742(Object obj) {
        if (C1155.m4177() > 0) {
            return ((AbstractActivityC0669k) obj).f2698t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m3743(Object obj) {
        if (C1134.m3300() <= 0) {
            ((C0212r) obj).m670l();
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m3744(Object obj, Object obj2) {
        if (C1130.m3165() >= 0) {
            ((AbstractC0279p0) obj).mo870g((C0076c) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۤ, reason: not valid java name and contains not printable characters */
    public static void m3745(Object obj) {
        if (C1164.m4618() > 0) {
            ((ConfigsActivity) obj).m1810y();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۥ, reason: not valid java name and contains not printable characters */
    public static ComponentName m3746(Object obj) {
        if (C1175.m5073() > 0) {
            return ((Intent) obj).getComponent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m3747(Object obj, Object obj2, Object obj3, Object obj4) throws KeyManagementException {
        if (C1139.m3541() > 0) {
            ((SSLContext) obj).init((KeyManager[]) obj2, (TrustManager[]) obj3, (SecureRandom) obj4);
        }
    }

    /* JADX INFO: renamed from: ۠۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static int m3748() {
        return (-901) ^ C1127.f4842;
    }

    /* JADX INFO: renamed from: ۠ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static void m3749(Object obj, Object obj2) {
        if (C1121.m2777() >= 0) {
            ((TextInputLayout) obj).m1775n((Editable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static float m3750(Object obj) {
        if (C1122.m2810() <= 0) {
            return ((AbstractC0165g) obj).f522N;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m3752(Object obj, Object obj2) {
        if (C1139.m3541() > 0) {
            ((Animator) obj).addListener((Animator.AnimatorListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۡۥ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m3753(Object obj) {
        if (C1139.m3541() >= 0) {
            return ((C0212r) obj).f688d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۢ۠, reason: not valid java name and contains not printable characters */
    public static void m3754(Object obj, Object obj2) {
        if (C1174.m5008() >= 0) {
            ((AbstractActivityC0466k) obj).m1166h((InterfaceC0444b) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static ConfigsActivity m3755(Object obj) {
        if (C1164.m4618() >= 0) {
            return ((DialogInterfaceOnShowListenerC0330d) obj).f941a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۧ, reason: not valid java name and contains not printable characters */
    public static View m3756(Object obj) {
        if (m3748() <= 0) {
            return ((View) obj).getRootView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۡۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m3757(Object obj) {
        if (C1175.m5073() > 0) {
            return ((Activity) obj).getTitle();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۦ۠, reason: not valid java name and contains not printable characters */
    public static String m3758(Object obj, int i2) {
        if (C1142.m3681() <= 0) {
            return Base64.encodeToString((byte[]) obj, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۨۧ, reason: not valid java name and contains not printable characters */
    public static String m3759(String str) {
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

    /* JADX INFO: renamed from: ۤۨۦ۟, reason: not valid java name and contains not printable characters */
    public static int m3760(Object obj, int i2, int i3) {
        if (C1149.m3923() < 0) {
            return ((TypedArray) obj).getInteger(i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۡۧ, reason: contains not printable characters */
    public static InterfaceC0957o0 m3761(Object obj) {
        if (C1159.m4411() >= 0) {
            return ((ActionBarOverlayLayout) obj).f1323e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۨۢ, reason: contains not printable characters */
    public static void m3762(Object obj) {
        if (C1150.m3967() > 0) {
            ((C0588t) obj).m1487g();
        }
    }

    /* JADX INFO: renamed from: ۥۧ۟ۦ, reason: contains not printable characters */
    public static String m3763() {
        if (C1161.m4510() < 0) {
            return "ۨۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ */
    public static void m1150(Object obj) throws IOException {
        if (C1160.m4437() < 0) {
            ((OutputStream) obj).flush();
        }
    }

    /* JADX INFO: renamed from: ۦۤۢۧ, reason: contains not printable characters */
    public static int m3764(Object obj, Object obj2) {
        if (C1155.m4177() >= 0) {
            return Log.i((String) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۧۧ, reason: contains not printable characters */
    public static boolean m3765(Object obj) {
        if (C1170.m4847() > 0) {
            return ((C0005f) obj).f15m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۤۡۤ, reason: not valid java name and contains not printable characters */
    public static String m3766() {
        if (C1152.m4038() > 0) {
            return "ۡۥۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static AbstractC0537g m3767(Object obj) {
        if (C1122.m2810() <= 0) {
            return ((C0645A) obj).f2507a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static ViewOnFocusChangeListenerC0196b m3768(Object obj) {
        if (C1141.m3607() >= 0) {
            return ((C0207m) obj).f668j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static String m3751(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
