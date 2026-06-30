package p024N;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.os.BaseBundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.AbstractActivityC0466k;
import androidx.activity.C0471p;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.core.widget.NestedScrollView;
import androidx.emoji2.text.InterfaceC0495i;
import androidx.lifecycle.C1147;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.snackbar.C1157;
import com.reddit.frontpage.MainActivity;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Locale;
import org.json.JSONObject;
import p000A.C0009j;
import p000A.C0010k;
import p004C.C1122;
import p014H0.C1124;
import p019K0.AbstractC0165g;
import p022M.InterfaceC0184a;
import p023M0.C0219y;
import p025N0.C1129;
import p025N0.C1131;
import p026O.C1132;
import p031Q0.C0348v;
import p032R.C1134;
import p036T.AbstractC0383m;
import p037T0.C1136;
import p041V0.C1138;
import p042W.C1139;
import p044X.C1140;
import p050a0.C1142;
import p052b0.C1151;
import p052b0.C1152;
import p060e.C0651G;
import p060e.LayoutInflaterFactory2C0648D;
import p065g.C1159;
import p066g0.C1160;
import p068h0.C1162;
import p072k.C0826w;
import p072k.C1165;
import p075l0.C1168;
import p084q.C1028g;
import p084q.C1173;
import p086r.C1174;

/* JADX INFO: renamed from: N.ۨۤۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1128 {

    /* JADX INFO: renamed from: ۧۥۦۤ, reason: not valid java name and contains not printable characters */
    public static int f4843 = 346;

    /* JADX INFO: renamed from: ۟۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m3052() {
        if (C1122.m2810() <= 0) {
            return "ۢ۟ۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static double m3053(double d2) {
        if (C1139.m3541() >= 0) {
            return Math.acos(d2);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۟۟ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3054(Object obj, Object obj2) {
        if (C1139.m3541() >= 0) {
            return ((NestedScrollView) obj).m1269i((KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۦ, reason: not valid java name and contains not printable characters */
    public static MotionEvent m3055(Object obj) {
        if (C1136.m3395() <= 0) {
            return MotionEvent.obtain((MotionEvent) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static String m3056(Object obj) {
        if (C1147.m1498() < 0) {
            return MainActivity.m1816r((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m3057(Object obj, Object obj2) {
        if (C1129.m3120() < 0) {
            ((AbstractActivityC0466k) obj).m1165g((InterfaceC0184a) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m3058(Object obj) {
        if (C1138.m3471() >= 0) {
            return ((C0009j) obj).f21a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧۥ, reason: not valid java name and contains not printable characters */
    public static void m3059(Object obj, Object obj2, int i2) {
        if (C1122.m2810() < 0) {
            ((DialogInterface.OnClickListener) obj).onClick((DialogInterface) obj2, i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3060(Object obj, Object obj2) {
        if (C1173.m4990() < 0) {
            return ((Configuration) obj).equals((Configuration) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3061(Object obj) {
        if (C1165.m4643() > 0) {
            return ((File) obj).isFile();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۥ, reason: not valid java name and contains not printable characters */
    public static void m3062(Object obj, Object obj2) {
        if (C1131.m3177() <= 0) {
            ((InterfaceC0495i) obj).mo45j((AbstractC0383m) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m3063(Object obj, int i2) {
        if (C1162.m4523() < 0) {
            ((ActionBarContainer) obj).setVisibility(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3064(Object obj) {
        if (C1122.m2810() <= 0) {
            return ((KeyEvent) obj).isSystem();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۢ, reason: not valid java name and contains not printable characters */
    public static void m3065(Object obj) {
        if (C1174.m5008() > 0) {
            ((MainActivity) obj).m1822F();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static int m3066() {
        return 738 ^ C1122.f4826;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۨ, reason: not valid java name and contains not printable characters */
    public static Object m3067(Object obj, Object obj2) {
        if (C1159.m4411() >= 0) {
            return ((Field) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۦۢ, reason: not valid java name and contains not printable characters */
    public static int m3068(Object obj, int i2, int i3) {
        if (C1142.m3681() < 0) {
            return ((TypedArray) obj).getDimensionPixelSize(i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m3069(Object obj) {
        if (C1122.m2810() <= 0) {
            return ((C0010k) obj).f23b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3071(Object obj, Object obj2) {
        if (C1138.m3471() >= 0) {
            return ((Canvas) obj).clipPath((Path) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡۧۥ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m3072() {
        if (C1152.m4038() > 0) {
            return PorterDuff.Mode.CLEAR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤۤ, reason: not valid java name and contains not printable characters */
    public static Object[] m3073(Object obj) {
        if (C1154.m4128() >= 0) {
            return ((C0651G) obj).f2590a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦ۟, reason: not valid java name and contains not printable characters */
    public static int m3074(Object obj) {
        if (C1154.m4128() > 0) {
            return ((BaseBundle) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m3075(Object obj, boolean z2) {
        if (C1152.m4038() > 0) {
            ((ActionBarContainer) obj).setTransitioning(z2);
        }
    }

    /* JADX INFO: renamed from: ۢۨۥ۟, reason: not valid java name and contains not printable characters */
    public static void m3076(Object obj) throws IOException {
        if (C1142.m3681() <= 0) {
            ((BufferedInputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static void m3077(Object obj, int i2, int i3, int i4, int i5) {
        if (C1165.m4643() > 0) {
            ((View) obj).setLeftTopRightBottom(i2, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static MainActivity m3078(Object obj) {
        if (C1150.m3967() > 0) {
            return ((C0348v) obj).f988a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m3079(Object obj) {
        if (C1122.m2810() <= 0) {
            return ((Locale) obj).toLanguageTag();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3080(int i2) {
        if (C1138.m3471() >= 0) {
            return KeyEvent.metaStateHasNoModifiers(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۦۧ, reason: not valid java name and contains not printable characters */
    public static int m3081(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۥۣ۟, reason: not valid java name and contains not printable characters */
    public static int m3082(Object obj) {
        if (C1140.m3595() > 0) {
            return ((AlertController$RecycleListView) obj).f1253a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۢۢ, reason: not valid java name and contains not printable characters */
    public static JSONObject m3083(Object obj, Object obj2, Object obj3) {
        if (C1132.m3217() >= 0) {
            return ((JSONObject) obj).put((String) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۨ۟, reason: not valid java name and contains not printable characters */
    public static ViewParent m3084(Object obj) {
        if (C1124.m2896() > 0) {
            return ((ViewParent) obj).getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m3085(Object obj, Object obj2) {
        if (C1132.m3217() >= 0) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (C0471p) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3086(Object obj) {
        if (C1168.m4797() < 0) {
            return ((C0826w) obj).m2206b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠۟ۢ, reason: contains not printable characters */
    public static boolean m3087(Object obj, Object obj2) {
        if (C1134.m3300() < 0) {
            return ((C1028g) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠ۢۨ, reason: contains not printable characters */
    public static String m3088(String str) {
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

    /* JADX INFO: renamed from: ۥۢۡۢ, reason: contains not printable characters */
    public static ColorStateList m3089(Object obj) {
        if (C1157.m4271() > 0) {
            return ((C0219y) obj).f755j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۥۨ, reason: contains not printable characters */
    public static void m3090(Object obj, Object obj2) {
        if (C1136.m3395() <= 0) {
            ((Configuration) obj).setLocale((Locale) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۥۧ۟, reason: contains not printable characters */
    public static void m3091(Object obj, Object obj2) {
        if (C1151.m4000() > 0) {
            ((AbstractC0165g) obj).setTickActiveTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣ۠ۥ, reason: contains not printable characters */
    public static boolean m3092(Object obj, boolean z2, boolean z3) {
        if (C1160.m4437() <= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).m1850k(z2, z3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۡۡ, reason: contains not printable characters */
    public static boolean m3093(Object obj, int i2) {
        if (C1150.m3967() >= 0) {
            return ((Window) obj).hasFeature(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static String m3070(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
