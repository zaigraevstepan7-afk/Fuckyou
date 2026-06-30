package p001A0;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.emoji2.text.C0502p;
import androidx.fragment.app.AbstractC0537g;
import androidx.lifecycle.C1147;
import androidx.lifecycle.EnumC0580l;
import androidx.profileinstaller.C1148;
import androidx.versionedparcelable.C1150;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import p004C.AbstractC0027h;
import p015I0.C0112h;
import p015I0.C0113i;
import p015I0.C0116l;
import p015I0.C0117m;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.C0211q;
import p023M0.C0218x;
import p024N.C1128;
import p025N0.C1129;
import p025N0.C1131;
import p029P0.C0325b;
import p029P0.C1133;
import p032R.C1134;
import p036T.C0371a;
import p036T.ViewOnTouchListenerC0377g;
import p038U.C1137;
import p042W.C1139;
import p044X.C1140;
import p050a0.C1142;
import p050a0.C1143;
import p052b0.C1151;
import p060e.AbstractActivityC0669k;
import p060e.AbstractC0682x;
import p060e.C0656L;
import p060e.C0662d;
import p060e.LayoutInflaterFactory2C0648D;
import p060e.RunnableC0677s;
import p060e.WindowCallbackC0683y;
import p066g0.C0762m;
import p070i0.C1163;
import p070i0.C1164;
import p073k0.C1166;
import p073k0.C1167;
import p074l.InterfaceC0923d;
import p075l0.C1168;
import p083p0.C1171;
import p084q.C1172;
import p084q.C1173;
import p092u0.C1176;
import p100z.C1180;

/* JADX INFO: renamed from: A0.۟ۧ۟ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1121 {

    /* JADX INFO: renamed from: ۟ۥ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static int f4825 = -237;

    /* JADX INFO: renamed from: ۣ۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static float m2763(Object obj) {
        if (C1171.m4901() >= 0) {
            return ((AbstractC0165g) obj).f567r0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static Iterator m2764(Object obj) {
        if (C1151.m4000() > 0) {
            return ((Collection) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static String m2765() {
        if (C1147.m1498() <= 0) {
            return "۠ۦۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۠, reason: not valid java name and contains not printable characters */
    public static C0113i m2766(Object obj) {
        if (C1126.m2964() <= 0) {
            return ((C0325b) obj).m984u();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m2767(Object obj) {
        if (C1140.m3595() > 0) {
            ((C0656L) obj).mo816a();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static C0112h m2768(Object obj) {
        if (C1167.m4739() < 0) {
            return ((AbstractC0165g) obj).f561o0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static float m2769(float f, float f2) {
        if (C1150.m3967() > 0) {
            return Math.max(f, f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m2770(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static void m2772(Object obj, Object obj2, Object obj3) {
        if (C1148.m3908() >= 0) {
            ((MainActivity) obj).m1824H((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m2773() {
        if (C1133.m3246() <= 0) {
            return "ۦ۠ۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static String m2774(Object obj, int i2, int i3) {
        if (C1129.m3120() < 0) {
            return ((String) obj).substring(i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۥ, reason: not valid java name and contains not printable characters */
    public static void m2775(Object obj) {
        if (C1173.m4990() <= 0) {
            ((Canvas) obj).restore();
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m2776(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static int m2777() {
        return 834 ^ C1163.f4906;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static C0371a m2778(Object obj) {
        if (C1131.m3177() < 0) {
            return ((ViewOnTouchListenerC0377g) obj).f1023a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2779(Object obj) {
        if (C1168.m4797() <= 0) {
            return ((AbstractActivityC0669k) obj).f2701w;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣ۟, reason: not valid java name and contains not printable characters */
    public static Iterator m2780(Object obj) {
        if (C1148.m3908() >= 0) {
            return ((ArrayList) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static RunnableC0677s m2781(Object obj) {
        if (C1167.m4739() < 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2554a0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m2782(Object obj, int i2) {
        if (C1139.m3541() >= 0) {
            ((AbsListView) obj).scrollListBy(i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static EnumC0580l m2783() {
        if (C1139.m3541() > 0) {
            return EnumC0580l.ON_RESUME;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static void m2784(Object obj, Object obj2) {
        if (C1180.m5241() <= 0) {
            AbstractC0682x.m1914c(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static Intent m2785(Object obj, Object obj2) {
        if (m2777() > 0) {
            return AbstractC0027h.m235b((AbstractActivityC0669k) obj, (ComponentName) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m2786(Object obj) {
        if (C1173.m4990() <= 0) {
            return ((C0502p) obj).f1541d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۤ, reason: not valid java name and contains not printable characters */
    public static void m2787(Object obj) throws IOException {
        if (C1151.m4000() > 0) {
            ((InputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m2788(Object obj) {
        if (C1143.m3711() < 0) {
            return ((C0211q) obj).f684d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2789(Object obj) {
        if (C1126.m2964() < 0) {
            return ((Activity) obj).isChangingConfigurations();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static Charset m2790() {
        if (C1172.m4932() <= 0) {
            return StandardCharsets.US_ASCII;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2791(Object obj) {
        if (C1128.m3066() > 0) {
            return ((MainActivity) obj).f2476K;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m2792(Object obj, int i2, int i3) {
        if (C1142.m3681() < 0) {
            return ((CharSequence) obj).subSequence(i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۟۟, reason: not valid java name and contains not printable characters */
    public static void m2793(Object obj) {
        if (C1131.m3177() <= 0) {
            ((C0218x) obj).m685a();
        }
    }

    /* JADX INFO: renamed from: ۢۢۨۨ, reason: not valid java name and contains not printable characters */
    public static C0116l m2794(Object obj) {
        if (C1146.m3842() < 0) {
            return ((C0117m) obj).m495e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۢ, reason: not valid java name and contains not printable characters */
    public static String m2795() {
        if (C1143.m3711() <= 0) {
            return Build.MANUFACTURER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2796() {
        if (C1126.m2964() <= 0) {
            return "۟ۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static Calendar m2797() {
        if (C1176.m5115() <= 0) {
            return Calendar.getInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m2798(Object obj, int i2, Object obj2) {
        if (C1164.m4618() >= 0) {
            return ((WindowCallbackC0683y) obj).m1916b(i2, (Menu) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m2799(Object obj) {
        if (C1148.m3908() > 0) {
            ((AbstractC0537g) obj).m1427d();
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m2800(Object obj) {
        if (C1126.m2964() <= 0) {
            return ((C0211q) obj).f683c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۨۨ, reason: not valid java name and contains not printable characters */
    public static void m2801(Object obj, boolean z2) {
        if (C1166.m4699() > 0) {
            ((View) obj).setFocusable(z2);
        }
    }

    /* JADX INFO: renamed from: ۦۡۨۢ, reason: contains not printable characters */
    public static ContextThemeWrapper m2802(Object obj) {
        if (C1173.m4990() < 0) {
            return ((C0662d) obj).f2639a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۦ, reason: contains not printable characters */
    public static void m2803(Object obj, Object obj2) {
        if (C1137.m3457() < 0) {
            ((ActionBarOverlayLayout) obj).setActionBarVisibilityCallback((InterfaceC0923d) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2804(Object obj) {
        if (C1134.m3300() < 0) {
            return ((View) obj).hasFocus();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۥۢۥ, reason: not valid java name and contains not printable characters */
    public static int m2805(Object obj, int i2) {
        if (C1166.m4699() >= 0) {
            return ((Resources) obj).getDimensionPixelSize(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨۢۦ, reason: not valid java name and contains not printable characters */
    public static ValueAnimator m2806(Object obj) {
        if (C1167.m4739() <= 0) {
            return ((C0762m) obj).f3074z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static String m2771(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
