package p025N0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C1147;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.internal.C1156;
import com.reddit.frontpage.ConfigsActivity;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import p000A.AbstractC0002c;
import p000A.C0005f;
import p004C.C1122;
import p015I0.C0112h;
import p019K0.AbstractC0165g;
import p023M0.C0206l;
import p023M0.C0212r;
import p023M0.C0219y;
import p023M0.C1127;
import p024N.C1128;
import p031Q0.DialogInterfaceOnClickListenerC0331e;
import p031Q0.RunnableC0341o;
import p031Q0.RunnableC0343q;
import p037T0.C1135;
import p042W.C1139;
import p050a0.C1142;
import p051a1.C1145;
import p058d0.C1158;
import p060e.C0651G;
import p060e.C0658N;
import p060e.C0661c;
import p060e.C0662d;
import p060e.LayoutInflaterFactory2C0648D;
import p066g0.C1160;
import p068h0.C1162;
import p072k.C1165;
import p072k.MenuC0816m;
import p074l.C0925d1;
import p077m0.C1169;
import p081o0.C1170;
import p083p0.C1171;
import p084q.C1172;
import p096w0.C1177;
import p098x0.C1179;
import p100z.C1180;

/* JADX INFO: renamed from: N0.ۣۡۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1131 {

    /* JADX INFO: renamed from: ۟ۦۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int f4846 = -481;

    /* JADX INFO: renamed from: ۣ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m3171() {
        if (C1145.m3805() <= 0) {
            return LayoutInflaterFactory2C0648D.f2527j0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m3172(Object obj, Object obj2) {
        if (C1180.m5241() <= 0) {
            return ((ViewGroup) obj).indexOfChild((View) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m3173(Object obj, Object obj2) {
        if (C1147.m1498() < 0) {
            ((AbstractC0165g) obj).setTrackActiveTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨۡ۟, reason: not valid java name and contains not printable characters */
    public static ConfigsActivity m3174(Object obj) {
        if (C1128.m3066() > 0) {
            return ((DialogInterfaceOnClickListenerC0331e) obj).f945a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static int m3175(Object obj) {
        if (C1160.m4437() <= 0) {
            return ((RunnableC0341o) obj).f972a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢۧۡ, reason: not valid java name and contains not printable characters */
    public static C0651G m3176(Object obj) {
        if (C1165.m4643() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2558e0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m3177() {
        return 103 ^ C1154.f4880;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟۠, reason: not valid java name and contains not printable characters */
    public static void m3178(Object obj, float f) {
        if (C1162.m4523() < 0) {
            ((View) obj).setScaleY(f);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۨ۟, reason: not valid java name and contains not printable characters */
    public static Iterator m3180(Object obj) {
        if (C1142.m3681() <= 0) {
            return ((CopyOnWriteArrayList) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m3181(Object obj, int i2) {
        if (C1135.m3328() > 0) {
            ((BroadcastReceiver) obj).setResultCode(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۡۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m3182(Object obj) {
        if (C1172.m4932() <= 0) {
            return ((C0206l) obj).f662a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۡۨ, reason: not valid java name and contains not printable characters */
    public static ViewParent m3183(Object obj) {
        if (C1154.m4128() > 0) {
            return ((View) obj).getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۤۧ, reason: not valid java name and contains not printable characters */
    public static void m3184(Object obj, Object obj2) {
        if (C1179.m5236() > 0) {
            ((AbstractC0002c) obj).mo64c((C0005f) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m3185(Object obj) {
        if (C1160.m4437() < 0) {
            return ((Rect) obj).top;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨۨۢ, reason: not valid java name and contains not printable characters */
    public static void m3186(Object obj, Object obj2) {
        if (C1179.m5236() > 0) {
            C0219y.m686a((C0219y) obj, obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m3187(Object obj) {
        if (C1165.m4643() >= 0) {
            return ((AbstractC0165g) obj).f514F;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۥۤ, reason: not valid java name and contains not printable characters */
    public static C0662d m3188(Object obj) {
        if (C1156.m4236() > 0) {
            return ((C0661c) obj).f2638b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m3189(Object obj, Object obj2) {
        if (C1171.m4901() >= 0) {
            ((Toolbar) obj).setTitle((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۦۢۦ, reason: not valid java name and contains not printable characters */
    public static Method m3190(Object obj, Object obj2, Object obj3) {
        if (C1127.m3025() > 0) {
            return ((Class) obj).getDeclaredMethod((String) obj2, (Class[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static void m3191(Object obj, Object obj2) {
        if (C1122.m2810() <= 0) {
            ((C0925d1) obj).mo57v((MenuC0816m) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۨ, reason: not valid java name and contains not printable characters */
    public static void m3192(Object obj, Object obj2) {
        if (C1170.m4847() >= 0) {
            ((AbstractC0165g) obj).setTickInactiveTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۤۦۨ, reason: not valid java name and contains not printable characters */
    public static int m3193(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۦۤۦ, reason: not valid java name and contains not printable characters */
    public static AccessibilityManager m3194(Object obj) {
        if (C1139.m3541() >= 0) {
            return ((C0212r) obj).f704t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۡۥ, reason: contains not printable characters */
    public static String m3195(String str) {
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

    /* JADX INFO: renamed from: ۦ۟ۢۧ, reason: contains not printable characters */
    public static void m3196(Object obj) {
        if (C1170.m4847() > 0) {
            ((C0112h) obj).invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۦۥۤۡ, reason: contains not printable characters */
    public static ActionBarOverlayLayout m3197(Object obj) {
        if (C1177.m5152() >= 0) {
            return ((C0658N) obj).f2622r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m3198(Object obj) {
        if (C1158.m4364() <= 0) {
            return ((RunnableC0343q) obj).f978c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m3199(Object obj, boolean z2) {
        if (C1177.m5152() >= 0) {
            ((MenuC0816m) obj).setQwertyMode(z2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m3200(Object obj) {
        if (C1169.m4842() < 0) {
            return ((SearchView$SearchAutoComplete) obj).f1369f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m3201(Object obj, Object obj2) {
        if (C1128.m3066() >= 0) {
            ((ThreadPoolExecutor) obj).execute((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static String m3202(Object obj, int i2) {
        if (C1128.m3066() >= 0) {
            return ((Context) obj).getString(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static String m3179(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
