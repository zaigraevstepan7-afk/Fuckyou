package p052b0;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.profileinstaller.C1148;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.internal.C1156;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p000A.C0001b;
import p000A.C0010k;
import p001A0.C1121;
import p004C.C1122;
import p015I0.C1125;
import p019K0.AbstractC0165g;
import p023M0.C0212r;
import p023M0.C1127;
import p024N.AbstractC0229G;
import p024N.InterfaceC0252c;
import p024N.InterfaceC0282r;
import p025N0.C1131;
import p029P0.C1133;
import p031Q0.C0338l;
import p036T.AbstractC0383m;
import p045X0.C1141;
import p050a0.C1143;
import p051a1.C1144;
import p051a1.C1145;
import p058d0.C0643;
import p060e.AbstractC0682x;
import p060e.C0647C;
import p060e.LayoutInflaterFactory2C0648D;
import p066g0.C1160;
import p066g0.C1161;
import p070i0.C1164;
import p072k.C1165;
import p072k.InterfaceC0827x;
import p072k.MenuC0816m;
import p073k0.C1167;
import p075l0.C1168;
import p083p0.C1171;
import p089t.AbstractC1048e;
import p092u0.C1176;
import p096w0.C1177;
import p100z.C1180;

/* JADX INFO: renamed from: b0.۟ۡۦۣۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1151 {

    /* JADX INFO: renamed from: ۣۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int f4877 = 640;

    /* JADX INFO: renamed from: ۟۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m3991(int i2) {
        if (C1164.m4618() >= 0) {
            return AbstractC1048e.m2545a(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static int m3992(Object obj) {
        if (C1125.m2937() > 0) {
            return ((C0647C) obj).f2510b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m3993(Object obj, int i2) {
        if (C1141.m3607() > 0) {
            ((ActionBarContextView) obj).setVisibility(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۦۥ, reason: not valid java name and contains not printable characters */
    public static void m3994(Object obj, Object obj2) {
        if (C1165.m4643() > 0) {
            ((InterfaceC0252c) obj).mo40e((Uri) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۦ, reason: not valid java name and contains not printable characters */
    public static void m3995(Object obj, int i2, Object obj2) {
        if (C1161.m4510() <= 0) {
            ((AbstractC0165g) obj).m596u(i2, (Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۢ۠, reason: not valid java name and contains not printable characters */
    public static String m3996() {
        if (C1143.m3711() < 0) {
            return "ۣۤۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static String m3997() {
        if (C1133.m3246() <= 0) {
            return "ۢۤ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static List m3998(Object obj) {
        if (C1144.m3748() < 0) {
            return ((C0010k) obj).m87h();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static void m3999(Object obj, Object obj2) {
        if (C1156.m4236() > 0) {
            Collections.sort((List) obj, (Comparator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۨۨ, reason: not valid java name and contains not printable characters */
    public static int m4000() {
        return 39 ^ C1177.f4920;
    }

    /* JADX INFO: renamed from: ۟ۤۤۤۥ, reason: not valid java name and contains not printable characters */
    public static String m4001(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m4002(Object obj, boolean z2) {
        if (C1180.m5241() < 0) {
            return ((StringBuilder) obj).append(z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m4003(Object obj) {
        if (C1145.m3805() <= 0) {
            ((C0001b) obj).m34E();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۧ, reason: not valid java name and contains not printable characters */
    public static void m4004(Object obj, Object obj2) {
        if (C1131.m3177() < 0) {
            ((Handler) obj).removeCallbacksAndMessages(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟, reason: not valid java name and contains not printable characters */
    public static int m4005(int i2, int i3) {
        if (C0643.m4322() < 0) {
            return View.MeasureSpec.makeMeasureSpec(i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m4006(Object obj) {
        if (C1167.m4739() < 0) {
            ((TypedArray) obj).recycle();
        }
    }

    /* JADX INFO: renamed from: ۡۡۦۤ, reason: not valid java name and contains not printable characters */
    public static float m4007(Object obj, Object obj2, float f) {
        if (C1125.m2937() >= 0) {
            return ((SharedPreferences) obj).getFloat((String) obj2, f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۥۣۡ, reason: not valid java name and contains not printable characters */
    public static void m4008(Object obj, Object obj2) {
        if (C1127.m3025() > 0) {
            ((HttpsURLConnection) obj).setSSLSocketFactory((SSLSocketFactory) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۧۤۧ, reason: not valid java name and contains not printable characters */
    public static TextView m4009(Object obj) {
        if (C1168.m4797() < 0) {
            return ((C0338l) obj).f962u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4010(Object obj) {
        if (C1171.m4901() >= 0) {
            return ((ActionBarOverlayLayout) obj).f1325g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static File m4011(Object obj) {
        if (C1176.m5115() < 0) {
            return ((File) obj).getParentFile();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static void m4012(Object obj) {
        if (C1161.m4510() <= 0) {
            ((Drawable) obj).invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۥۤ۟ۨ, reason: contains not printable characters */
    public static String m4013() {
        if (C1121.m2777() >= 0) {
            return "ۨۤ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ۟ۡ, reason: contains not printable characters */
    public static void m4014(Object obj, boolean z2) {
        if (C1150.m3967() >= 0) {
            ((C0212r) obj).m666h(z2);
        }
    }

    /* JADX INFO: renamed from: ۦۤۧۧ, reason: contains not printable characters */
    public static void m4015(Object obj, Object obj2) {
        if (C1148.m3908() >= 0) {
            AbstractC0229G.m719u((View) obj, (InterfaceC0282r) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۧ۟۟, reason: contains not printable characters */
    public static double m4016(double d2) {
        if (C1168.m4797() < 0) {
            return Math.sin(d2);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۦۨۥ۟, reason: contains not printable characters */
    public static int m4017(Object obj) {
        if (C1127.m3025() > 0) {
            return ((AbstractC0165g) obj).f535b0;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m4018(Object obj, Object obj2) throws ProtocolException {
        if (C1154.m4128() > 0) {
            ((HttpURLConnection) obj).setRequestMethod((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m4019(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۥۣۦ, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedCallback m4020(Object obj, Object obj2) {
        if (C1160.m4437() <= 0) {
            return AbstractC0682x.m1913b(obj, (LayoutInflaterFactory2C0648D) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۨ۟, reason: not valid java name and contains not printable characters */
    public static Field m4021() {
        if (C1127.m3025() > 0) {
            return AbstractC0383m.f1046e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4023(Object obj, Object obj2) {
        if (C1122.m2810() < 0) {
            return ((InterfaceC0827x) obj).mo43h((MenuC0816m) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m4022(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
