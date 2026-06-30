package p032R;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p001A0.C1121;
import p011G.C1123;
import p019K0.AbstractC0165g;
import p023M0.AbstractC0213s;
import p023M0.C0214t;
import p023M0.C1127;
import p024N.C0250b;
import p025N0.C1129;
import p025N0.C1131;
import p029P0.C0325b;
import p029P0.C1133;
import p031Q0.C0351y;
import p036T.ViewOnTouchListenerC0377g;
import p037T0.C1136;
import p042W.C1139;
import p050a0.C1142;
import p050a0.C1143;
import p051a1.C1144;
import p052b0.C1151;
import p052b0.C1152;
import p058d0.C0643;
import p058d0.C1158;
import p060e.DialogInterfaceC0666h;
import p060e.LayoutInflaterFactory2C0648D;
import p070i0.C1163;
import p070i0.C1164;
import p072k.C1165;
import p073k0.C1167;
import p077m0.C1169;
import p084q.C1172;
import p086r.C1174;
import p089t.C1175;

/* JADX INFO: renamed from: R.ۣ۟ۤ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1134 {

    /* JADX INFO: renamed from: ۡۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int f4860 = -71;

    /* JADX INFO: renamed from: ۟۠ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static String m3290(Object obj) {
        if (C1146.m3842() <= 0) {
            return ((Class) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static int m3291(Object obj, Object obj2) {
        if (C1165.m4643() >= 0) {
            return ((MainActivity) obj).m1823G((String[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤۤۡ, reason: not valid java name and contains not printable characters */
    public static String m3292() {
        if (C1121.m2777() >= 0) {
            return "۠۠ۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢ۟, reason: not valid java name and contains not printable characters */
    public static String m3293() {
        if (C1123.m2849() >= 0) {
            return "ۣ۠ۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static void m3294(Object obj, int i2) {
        if (C1172.m4932() <= 0) {
            ((TextView) obj).setText(i2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m3295(Object obj) {
        if (C1158.m4364() < 0) {
            return ((Configuration) obj).navigationHidden;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤۤۡ, reason: not valid java name and contains not printable characters */
    public static Constructor m3296(Object obj, Object obj2) {
        if (C1139.m3541() >= 0) {
            return ((Class) obj).getConstructor((Class[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨۧ, reason: not valid java name and contains not printable characters */
    public static int m3297(Object obj) {
        if (C0643.m4322() <= 0) {
            return ((View) obj).getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static File m3298(Object obj) {
        if (C1167.m4739() < 0) {
            return ((Context) obj).getFilesDir();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static int m3300() {
        return (-965) ^ C1175.f4918;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static int m3301(Object obj) {
        if (C1156.m4236() >= 0) {
            return ((C0214t) obj).f713c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۨۢ, reason: not valid java name and contains not printable characters */
    public static String m3302(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۦۡ۠, reason: not valid java name and contains not printable characters */
    public static void m3303(Object obj) {
        if (C1172.m4932() < 0) {
            ((TextInputLayout) obj).m1785x();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۥ۟, reason: not valid java name and contains not printable characters */
    public static void m3304(Object obj, int i2) {
        if (C1127.m3025() >= 0) {
            ((PopupWindow) obj).setWidth(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۤ, reason: not valid java name and contains not printable characters */
    public static String m3305() {
        if (C1144.m3748() <= 0) {
            return "ۣۡۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۢ, reason: not valid java name and contains not printable characters */
    public static int m3306(Object obj, Object obj2) {
        if (C1169.m4842() <= 0) {
            return Log.e((String) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۧ, reason: not valid java name and contains not printable characters */
    public static Locale m3307() {
        if (C1149.m3923() < 0) {
            return Locale.ENGLISH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3308(Object obj) {
        if (C1131.m3177() <= 0) {
            return ((ViewOnTouchListenerC0377g) obj).f1035m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static int m3309(Object obj) {
        if (C1155.m4177() >= 0) {
            return ((C0325b) obj).getIntrinsicHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3310(Object obj, Object obj2) {
        if (C1174.m5008() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).m1855r((KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡۨۤ, reason: not valid java name and contains not printable characters */
    public static SSLSocketFactory m3311() {
        if (C1158.m4364() < 0) {
            return MainActivity.f2464L;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۡۡ, reason: not valid java name and contains not printable characters */
    public static X509TrustManager m3312(Object obj) {
        if (C1172.m4932() <= 0) {
            return ((C0351y) obj).f991a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۨۢ, reason: not valid java name and contains not printable characters */
    public static float m3313(Object obj) {
        if (C1136.m3395() < 0) {
            return ((AbstractC0165g) obj).getMinSeparation();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static PackageManager m3314(Object obj) {
        if (C1142.m3681() <= 0) {
            return ((Context) obj).getPackageManager();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3315(Object obj, Object obj2) {
        if (C1152.m4038() > 0) {
            return ((Set) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۧ, reason: not valid java name and contains not printable characters */
    public static String m3316() {
        if (C1163.m4579() > 0) {
            return "ۡۨۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m3317(Object obj) {
        if (C1155.m4177() >= 0) {
            return ((AbstractC0213s) obj).mo633c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۣۣ, reason: not valid java name and contains not printable characters */
    public static int[] m3318(Object obj) {
        if (C0643.m4322() < 0) {
            return ((View) obj).getDrawableState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۤ, reason: not valid java name and contains not printable characters */
    public static int m3319(Object obj, int i2) {
        if (C1175.m5073() > 0) {
            return DialogInterfaceC0666h.m1888g((Context) obj, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3320(Object obj) {
        if (C1151.m4000() >= 0) {
            return ((KeyEvent) obj).isLongPress();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۥۡ, reason: contains not printable characters */
    public static View.AccessibilityDelegate m3321(Object obj) {
        if (C1150.m3967() >= 0) {
            return ((C0250b) obj).f794a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ۠ۥ, reason: contains not printable characters */
    public static int m3322(Object obj) {
        if (C1142.m3681() < 0) {
            return ((AbstractC0165g) obj).f572u;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۥ, reason: contains not printable characters */
    public static int m3323(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۥۢۦ, reason: contains not printable characters */
    public static AdapterView.OnItemClickListener m3324(Object obj) {
        if (C1129.m3120() <= 0) {
            return ((AdapterView) obj).getOnItemClickListener();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۠ۨ, reason: contains not printable characters */
    public static void m3325(Object obj, Object obj2) {
        if (C1133.m3246() < 0) {
            ((AbstractC0165g) obj).setTrackInactiveTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۧۦۤ, reason: contains not printable characters */
    public static ObjectAnimator m3326(Object obj, long j2) {
        if (C1164.m4618() > 0) {
            return ((ObjectAnimator) obj).setDuration(j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۤ, reason: not valid java name and contains not printable characters */
    public static void m3327(Object obj, Object obj2) {
        if (C1143.m3711() < 0) {
            ((AccessibilityNodeInfo) obj).setBoundsInParent((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static String m3299(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
