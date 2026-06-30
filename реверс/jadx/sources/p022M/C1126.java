package p022M;

import android.content.pm.ApplicationInfo;
import android.graphics.Matrix;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import androidx.activity.result.C0476c;
import androidx.lifecycle.C1147;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.snackbar.C1157;
import com.reddit.frontpage.ConfigsActivity;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.Key;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import p001A0.AbstractC0016e;
import p001A0.C1121;
import p004C.C1122;
import p014H0.C1124;
import p015I0.C1125;
import p019K0.AbstractC0165g;
import p019K0.C0164f;
import p023M0.AbstractC0213s;
import p023M0.ViewOnClickListenerC0195a;
import p024N.AbstractC0279p0;
import p024N.C0295x0;
import p024N.C1128;
import p024N.InterfaceC0251b0;
import p025N0.C1131;
import p026O.C0311k;
import p026O.C1132;
import p029P0.C1133;
import p037T0.C1135;
import p044X.C1140;
import p051a1.C1145;
import p060e.AbstractC0676r;
import p060e.C0647C;
import p060e.DialogInterfaceC0666h;
import p060e.LayoutInflaterFactory2C0648D;
import p065g.C1159;
import p071j.AbstractC0786a;
import p072k.C1165;
import p072k.InterfaceC0801C;
import p072k.InterfaceC0827x;
import p072k.MenuC0816m;
import p074l.C0927e0;
import p081o0.C1170;
import p083p0.C1171;
import p084q.C1172;
import p084q.C1173;
import p089t.C1175;
import p092u0.C1176;

/* JADX INFO: renamed from: M.۟ۤۡۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1126 {

    /* JADX INFO: renamed from: ۟۟ۦۣۥ, reason: not valid java name and contains not printable characters */
    public static int f4833 = 991;

    /* JADX INFO: renamed from: ۟۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m2962(Object obj, Object obj2) {
        if (C1121.m2777() >= 0) {
            return ((String) obj).getBytes((Charset) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m2963(Object obj) {
        if (C1159.m4411() >= 0) {
            return ((ApplicationInfo) obj).targetSdkVersion;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۥ, reason: not valid java name and contains not printable characters */
    public static int m2964() {
        return (-739) ^ C1172.f4915;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۠۠, reason: not valid java name and contains not printable characters */
    public static C0647C m2965(Object obj, int i2) {
        if (C1132.m3217() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).m1860z(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static void m2966(Object obj, Object obj2) {
        if (C1135.m3328() >= 0) {
            ((HttpsURLConnection) obj).setHostnameVerifier((HostnameVerifier) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۨ۠, reason: not valid java name and contains not printable characters */
    public static int m2967(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۥۨۨ, reason: not valid java name and contains not printable characters */
    public static SSLSocketFactory m2969(Object obj) {
        if (C1131.m3177() <= 0) {
            return ((SSLContext) obj).getSocketFactory();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦۢ, reason: not valid java name and contains not printable characters */
    public static AbstractC0676r m2970(Object obj) {
        if (C1121.m2777() > 0) {
            return ((DialogInterfaceC0666h) obj).m1889e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m2971(Object obj) {
        if (m2964() < 0) {
            return ((Key) obj).getEncoded();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static String[] m2972(Object obj, Object obj2) {
        if (C1149.m3923() <= 0) {
            return ((String) obj).split((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m2973(Object obj, Object obj2, boolean z2) {
        if (C1140.m3595() >= 0) {
            ((InterfaceC0827x) obj).mo37b((MenuC0816m) obj2, z2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2974(Object obj, Object obj2) {
        if (C1170.m4847() >= 0) {
            return AbstractC0016e.m155C((View) obj, (KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۤۡۦ, reason: not valid java name and contains not printable characters */
    public static void m2975(Object obj, Object obj2) {
        if (C1147.m1498() <= 0) {
            ((ViewTreeObserver) obj).addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۤۧ, reason: not valid java name and contains not printable characters */
    public static void m2976(Object obj) {
        if (C1175.m5073() >= 0) {
            ((InterfaceC0801C) obj).dismiss();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۢ, reason: not valid java name and contains not printable characters */
    public static C0295x0 m2977(Object obj) {
        if (C1157.m4271() > 0) {
            return ((AbstractC0279p0) obj).mo868b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠۠, reason: not valid java name and contains not printable characters */
    public static String m2978(String str) {
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

    /* JADX INFO: renamed from: ۠ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static int m2979(Object obj) {
        if (C1131.m3177() <= 0) {
            return ((BottomSheetBehavior) obj).f2081L;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۢۢ, reason: not valid java name and contains not printable characters */
    public static String m2980(Object obj) {
        if (C1155.m4177() >= 0) {
            return ((String) obj).trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m2981(Object obj) {
        if (C1149.m3923() < 0) {
            return ((C0927e0) obj).getText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۡۥ, reason: not valid java name and contains not printable characters */
    public static String m2982(float f) {
        if (C1128.m3066() >= 0) {
            return Float.toString(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧ۠۟, reason: not valid java name and contains not printable characters */
    public static void m2983(Object obj, Object obj2) throws IOException {
        if (C1149.m3923() <= 0) {
            ((OutputStream) obj).write((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m2984(Object obj) {
        if (C1125.m2937() >= 0) {
            return ((ViewOnClickListenerC0195a) obj).f637a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static void m2985(Object obj, float f) {
        if (C1122.m2810() < 0) {
            ((View) obj).setScaleX(f);
        }
    }

    /* JADX INFO: renamed from: ۥۡ۠ۤ, reason: contains not printable characters */
    public static DialogInterfaceC0666h m2986(Object obj) {
        if (C1145.m3805() < 0) {
            return ((MainActivity) obj).f2477y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ۠ۦ, reason: contains not printable characters */
    public static View m2987(Object obj) {
        if (C1165.m4643() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2530C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۨ, reason: contains not printable characters */
    public static void m2988(Object obj, Object obj2) {
        if (C1122.m2810() < 0) {
            ((AbstractC0213s) obj).mo651n((C0311k) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۡۢۥ, reason: contains not printable characters */
    public static AbstractC0786a m2989(Object obj) {
        if (C1165.m4643() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2572u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۡۥ, reason: contains not printable characters */
    public static void m2990(Object obj, Object obj2) {
        if (C1133.m3246() <= 0) {
            ((ViewGroup) obj).endViewTransition((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۥۢ, reason: contains not printable characters */
    public static C0476c m2991(Object obj) {
        if (C1173.m4990() < 0) {
            return ((ConfigsActivity) obj).f2461G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۧ۟, reason: contains not printable characters */
    public static void m2992(Object obj) {
        if (C1122.m2810() <= 0) {
            ((InterfaceC0251b0) obj).mo816a();
        }
    }

    /* JADX INFO: renamed from: ۣۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m2993(Object obj, Object obj2, Object obj3) {
        if (C1157.m4271() >= 0) {
            return ((String) obj).replaceAll((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۠۠, reason: not valid java name and contains not printable characters */
    public static void m2994(Object obj, int i2) {
        if (C1125.m2937() >= 0) {
            ((AbstractC0165g) obj).setActiveThumbIndex(i2);
        }
    }

    /* JADX INFO: renamed from: ۧۦۣۡ, reason: not valid java name and contains not printable characters */
    public static float m2995(Object obj) {
        if (C1171.m4901() > 0) {
            return ((C0164f) obj).f507d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2996(Object obj) {
        if (C1150.m3967() > 0) {
            return ((AccessibilityManager) obj).isTouchExplorationEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧۤۦ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m2997(Object obj) {
        if (m2964() < 0) {
            return ((C0295x0) obj).m925f();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m2998(Object obj, Object obj2) {
        if (C1124.m2896() >= 0) {
            ((View) obj).setAnimationMatrix((Matrix) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۥۢۢ, reason: not valid java name and contains not printable characters */
    public static int m2999(Object obj) {
        if (C1176.m5115() < 0) {
            return ((View) obj).getId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m2968(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
