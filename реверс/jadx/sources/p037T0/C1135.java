package p037T0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogInterfaceOnDismissListenerC0541k;
import androidx.lifecycle.C1147;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.internal.C1156;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Locale;
import p001A0.AbstractC0016e;
import p014H0.C1124;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.C0212r;
import p024N.C1128;
import p024N.InterfaceC0251b0;
import p025N0.C1129;
import p025N0.C1130;
import p026O.C1132;
import p031Q0.DialogInterfaceOnShowListenerC0330d;
import p032R.C1134;
import p036T.C0371a;
import p038U.C1137;
import p058d0.C1158;
import p060e.AbstractC0672n;
import p060e.AbstractC0680v;
import p060e.C0658N;
import p060e.C0665g;
import p060e.DialogInterfaceC0666h;
import p060e.ExecutorC0674p;
import p060e.ExecutorC0675q;
import p060e.WindowCallbackC0683y;
import p065g.C1159;
import p066g0.C1160;
import p070i0.C1164;
import p072k.C1165;
import p074l.C0980x0;
import p074l.InterfaceC0954n0;
import p077m0.C1169;
import p083p0.C1171;
import p084q.C1023b;
import p084q.C1173;
import p089t.C1175;
import p092u0.C1176;
import p097x.C1178;
import p098x0.C1179;
import p100z.C1180;

/* JADX INFO: renamed from: T0.ۣۣ۟ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1135 {

    /* JADX INFO: renamed from: ۢ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static int f4861 = 153;

    /* JADX INFO: renamed from: ۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m3328() {
        return (-46) ^ C1179.f4922;
    }

    /* JADX INFO: renamed from: ۟۠ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m3329(Object obj, Object obj2) {
        if (C1126.m2964() <= 0) {
            return ((WindowInsets.Builder) obj).setSystemGestureInsets((Insets) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static int m3330(Object obj, Object obj2) {
        if (C1150.m3967() > 0) {
            return AbstractC0016e.m182k((Context) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static TypedValue m3331(Object obj) {
        if (C1124.m2896() >= 0) {
            return ((ContentFrameLayout) obj).getMinWidthMinor();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static int m3332(Object obj) {
        if (C1165.m4643() >= 0) {
            return ((AbstractC0165g) obj).f576y;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static String m3333() {
        if (C1160.m4437() < 0) {
            return "ۦۧ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static void m3334(Object obj, Object obj2) {
        if (C1149.m3923() <= 0) {
            ((DialogInterfaceOnDismissListenerC0541k) obj).onDismiss((DialogInterface) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Window.Callback m3335(Object obj) {
        if (C1156.m4236() >= 0) {
            return ((WindowCallbackC0683y) obj).f2724a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3336(Object obj) {
        if (C1175.m5073() > 0) {
            return ((File) obj).delete();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static Object[] m3337(Object obj, Object obj2) {
        if (C1171.m4901() > 0) {
            return ((ArrayList) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۨ, reason: not valid java name and contains not printable characters */
    public static String m3338() {
        if (C1137.m3457() <= 0) {
            return "ۦۦۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۢ, reason: not valid java name and contains not printable characters */
    public static String m3339(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3340(Object obj) {
        if (C1130.m3165() > 0) {
            return ((C1023b) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m3341(Object obj, Object obj2) {
        if (C1159.m4411() > 0) {
            return URLEncoder.encode((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static long m3342(Object obj) {
        if (C1173.m4990() <= 0) {
            return ((C0371a) obj).f1018f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static int m3343(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۢۤۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m3344(Object obj, Object obj2) {
        if (C1179.m5236() > 0) {
            return ((Parcel) obj).createTypedArray((Parcelable.Creator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static Drawable m3345(Object obj) {
        if (C1180.m5241() < 0) {
            return ((Drawable) obj).mutate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static ArrayDeque m3346(Object obj) {
        if (C1173.m4990() < 0) {
            return ((ExecutorC0674p) obj).f2706b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static LocaleList m3347(Object obj) {
        if (C1136.m3395() <= 0) {
            return AbstractC0672n.m1900a((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static ExecutorC0675q m3348(Object obj) {
        if (C1173.m4990() <= 0) {
            return ((ExecutorC0674p) obj).f2707c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m3349(Object obj) {
        if (C1129.m3120() <= 0) {
            ((C0980x0) obj).drawableStateChanged();
        }
    }

    /* JADX INFO: renamed from: ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static int m3350(Object obj) {
        if (C1128.m3066() >= 0) {
            return ((AbstractC0165g) obj).f517I;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۡ۠, reason: not valid java name and contains not printable characters */
    public static String m3351(Object obj) {
        if (C1171.m4901() >= 0) {
            return AbstractC0680v.m1907b((Locale) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m3352(Object obj) {
        if (C1169.m4842() <= 0) {
            ((InterfaceC0251b0) obj).mo215b();
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3353(Object obj) {
        if (C1178.m5174() < 0) {
            return ((C0212r) obj).m663e();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m3354() {
        if (C1126.m2964() <= 0) {
            return "ۣۨ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡ۟, reason: not valid java name and contains not printable characters */
    public static void m3355(Object obj, Object obj2) {
        if (C1132.m3217() >= 0) {
            ((InterfaceC0954n0) obj).setWindowTitle((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static TextView m3357(Object obj) {
        if (C1158.m4364() < 0) {
            return ((MainActivity) obj).f2469D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۡۡ, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC0666h m3358(Object obj) {
        if (C1176.m5115() <= 0) {
            return ((DialogInterfaceOnShowListenerC0330d) obj).f942b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۦ, reason: contains not printable characters */
    public static void m3359(Object obj, Object obj2) {
        if (C1146.m3842() < 0) {
            ((Activity) obj).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۦۣۤ, reason: contains not printable characters */
    public static int m3360(Object obj) {
        if (C1134.m3300() <= 0) {
            return ((Configuration) obj).densityDpi;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۧۨۨ, reason: contains not printable characters */
    public static ColorStateList m3361(Object obj) {
        if (C1180.m5241() <= 0) {
            return ((AbstractC0165g) obj).f549i0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۟, reason: contains not printable characters */
    public static String m3362() {
        if (C1154.m4128() >= 0) {
            return CoordinatorLayout.f1435t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static Context m3363(Object obj) {
        if (C1164.m4618() > 0) {
            return ((ContextWrapper) obj).getBaseContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static ActionBarContextView m3364(Object obj) {
        if (C1164.m4618() > 0) {
            return ((C0658N) obj).f2625u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۢ, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC0666h m3365(Object obj) {
        if (C1147.m1498() <= 0) {
            return ((C0665g) obj).f2666b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static Region.Op m3366() {
        if (C1180.m5241() <= 0) {
            return Region.Op.UNION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۢ, reason: not valid java name and contains not printable characters */
    public static int m3367(Object obj) {
        if (C1179.m5236() > 0) {
            return ((AbstractC0165g) obj).f569s0;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۡۢ, reason: not valid java name and contains not printable characters */
    public static void m3368(Object obj, Object obj2) {
        if (C1171.m4901() >= 0) {
            ((Paint) obj).setStyle((Paint.Style) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۤۥ, reason: not valid java name and contains not printable characters */
    public static String m3356(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
