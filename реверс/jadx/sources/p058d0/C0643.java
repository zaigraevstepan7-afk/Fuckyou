package p058d0;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContentInfo;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C0518H;
import androidx.fragment.app.C0525O;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.internal.C1156;
import com.google.android.material.snackbar.C1157;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p000A.C0010k;
import p001A0.C1121;
import p004C.C1122;
import p014H0.C1124;
import p015I0.C1125;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.AbstractC0213s;
import p023M0.C0203i;
import p023M0.C0212r;
import p023M0.C0214t;
import p023M0.C1127;
import p023M0.ViewOnFocusChangeListenerC0196b;
import p024N.C0295x0;
import p025N0.C1131;
import p029P0.C1133;
import p038U.C1137;
import p044X.C1140;
import p052b0.C1152;
import p060e.AbstractActivityC0669k;
import p060e.AbstractC0676r;
import p060e.C0658N;
import p060e.LayoutInflaterFactory2C0648D;
import p060e.RunnableC0659a;
import p068h0.C1162;
import p070i0.C1163;
import p070i0.C1164;
import p071j.AbstractC0786a;
import p071j.AbstractC0797l;
import p071j.C0790e;
import p072k.C0818o;
import p072k.C1165;
import p072k.MenuC0816m;
import p074l.C0884K0;
import p074l.C0931f1;
import p075l0.C1168;
import p081o0.C1170;
import p084q.C1172;
import p084q.C1173;
import p089t.C1175;
import p092u0.C1176;
import p096w0.C1177;
import p097x.C1178;
import p100z.C1180;

/* JADX INFO: renamed from: d0.ۡۨ */
/* JADX INFO: loaded from: classes.dex */
public class C0643 {

    /* JADX INFO: renamed from: ۟۠ۦۦۡ, reason: not valid java name and contains not printable characters */
    public static int f4886 = 664;

    /* JADX INFO: renamed from: ۟۟۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4285(Object obj) {
        if (C1137.m3457() <= 0) {
            return ((View) obj).isActivated();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4286(Object obj, int i2, Object obj2, boolean z2) {
        if (C1127.m3025() > 0) {
            return ((Resources.Theme) obj).resolveAttribute(i2, (TypedValue) obj2, z2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨۦۤ, reason: not valid java name and contains not printable characters */
    public static AdapterView.OnItemClickListener m4287(Object obj) {
        if (C1126.m2964() < 0) {
            return ((AutoCompleteTextView) obj).getOnItemClickListener();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static C0295x0 m4288(Object obj) {
        if (C1154.m4128() >= 0) {
            return ((CoordinatorLayout) obj).f1453n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static int m4289(Object obj) {
        if (C1152.m4038() >= 0) {
            return ((C0658N) obj).f2609C;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۨۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4290(Object obj) {
        if (C1168.m4797() < 0) {
            return ((AbstractC0165g) obj).f527S;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4291(Object obj, Object obj2) {
        if (C1125.m2937() >= 0) {
            return ((Activity) obj).navigateUpTo((Intent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥۨۡ, reason: not valid java name and contains not printable characters */
    public static C0790e m4292(Object obj, Object obj2) {
        if (C1168.m4797() < 0) {
            return ((C0010k) obj).m84e((AbstractC0786a) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۣ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4293(Object obj) {
        if (m4322() <= 0) {
            return ((ColorStateListDrawable) obj).getColorStateList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static View m4294(Object obj) {
        if (C1170.m4847() >= 0) {
            return ((RunnableC0659a) obj).f2633c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4295(Object obj, Object obj2) {
        if (C1164.m4618() >= 0) {
            return ((View) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m4296(Object obj, Object obj2) {
        if (C1172.m4932() < 0) {
            return Log.v((String) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m4297(Object obj) {
        if (C1150.m3967() > 0) {
            return ((C0203i) obj).f658a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨ۟, reason: not valid java name and contains not printable characters */
    public static void m4298(Object obj) {
        if (C1121.m2777() >= 0) {
            AbstractC0676r.m1905e((LayoutInflaterFactory2C0648D) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۡ, reason: not valid java name and contains not printable characters */
    public static void m4299(Object obj, int i2) {
        if (C1162.m4523() <= 0) {
            ((Context) obj).setTheme(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static ContentInfo m4300(Object obj) {
        if (C1133.m3246() <= 0) {
            return ((ContentInfo.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m4301(Object obj, Object obj2) {
        if (C1170.m4847() >= 0) {
            ((Throwable) obj).addSuppressed((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۡۧ, reason: not valid java name and contains not printable characters */
    public static LinkedHashSet m4302(Object obj) {
        if (C1122.m2810() <= 0) {
            return ((C0212r) obj).f694j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m4303(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((C0295x0) obj).m923c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۦۦ, reason: not valid java name and contains not printable characters */
    public static AbstractC0213s m4304(Object obj) {
        if (C1180.m5241() < 0) {
            return ((ViewOnFocusChangeListenerC0196b) obj).f640b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨ۟, reason: not valid java name and contains not printable characters */
    public static int m4305(Object obj, Object obj2) {
        if (C1137.m3457() < 0) {
            return ((InputStream) obj).read((byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟۠, reason: not valid java name and contains not printable characters */
    public static void m4306(Object obj) {
        if (C1124.m2896() >= 0) {
            ((Window.Callback) obj).onAttachedToWindow();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static void m4307(Object obj) {
        if (C1170.m4847() > 0) {
            ((C0525O) obj).m1406f();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m4308(Object obj, Object obj2) {
        if (C1177.m5152() > 0) {
            ((C0884K0) obj).m2293k((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۢۦ, reason: not valid java name and contains not printable characters */
    public static int m4309(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static void m4310(Object obj) {
        if (C1176.m5115() < 0) {
            ((MenuC0816m) obj).m2198w();
        }
    }

    /* JADX INFO: renamed from: ۠ۧۨۢ, reason: not valid java name and contains not printable characters */
    public static TextView m4311(Object obj) {
        if (C1133.m3246() <= 0) {
            return ((C0214t) obj).f714d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۥۤ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m4312(Object obj, float f) {
        if (C1131.m3177() <= 0) {
            return ((StringBuilder) obj).append(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4313(Object obj) {
        if (C1157.m4271() > 0) {
            return ((C0658N) obj).f2616J;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4315(Object obj, boolean z2) {
        if (C1177.m5152() >= 0) {
            return ((C0518H) obj).m1382y(z2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4316() {
        if (C1146.m3842() < 0) {
            return "۠ۢۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠, reason: not valid java name and contains not printable characters */
    public static String m4317(String str) {
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
        for (int i4 = 0; i4 < length; i4++) {
            byteArray[i4] = (byte) (byteArray[i4] ^ str2.charAt(i4 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۨۤۢ, reason: not valid java name and contains not printable characters */
    public static Parcelable[] m4318(Object obj, Object obj2) {
        if (C1168.m4797() <= 0) {
            return ((Parcel) obj).readParcelableArray((ClassLoader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static C0818o m4319(Object obj) {
        if (C1156.m4236() > 0) {
            return ((C0931f1) obj).f3719b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۣۣ, reason: not valid java name and contains not printable characters */
    public static Charset m4320() {
        if (C1165.m4643() > 0) {
            return StandardCharsets.UTF_8;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۡ, reason: contains not printable characters */
    public static boolean m4321(Object obj) {
        if (C1140.m3595() >= 0) {
            return ((AbstractC0213s) obj).mo649j();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢۥ, reason: contains not printable characters */
    public static int m4322() {
        return (-913) ^ C1146.f4872;
    }

    /* JADX INFO: renamed from: ۥۧۨ۟, reason: contains not printable characters */
    public static String m4323(Object obj, Object obj2) {
        if (C1140.m3595() > 0) {
            return String.format((String) obj, (Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۨۧ, reason: contains not printable characters */
    public static Window m4324(Object obj) {
        if (C1178.m5174() <= 0) {
            return ((Dialog) obj).getWindow();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۥۤ, reason: not valid java name and contains not printable characters */
    public static int m4325(Object obj) {
        if (C1152.m4038() >= 0) {
            return ((Configuration) obj).orientation;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۦۣ, reason: not valid java name and contains not printable characters */
    public static void m4326(Object obj, Object obj2, boolean z2) {
        if (C1175.m5073() > 0) {
            ((AutoCompleteTextView) obj).setText((CharSequence) obj2, z2);
        }
    }

    /* JADX INFO: renamed from: ۧۧ */
    public static void m1829(Object obj, Object obj2) {
        if (C1175.m5073() > 0) {
            ((AccessibilityNodeInfo) obj).setLabeledBy((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۨۤ۠, reason: not valid java name and contains not printable characters */
    public static void m4327(Object obj, Object obj2, Object obj3, int i2) {
        if (C1173.m4990() < 0) {
            AbstractC0797l.m2146a((Window.Callback) obj, (List) obj2, (Menu) obj3, i2);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m4328(Object obj) {
        if (C1163.m4579() >= 0) {
            return ((SharedPreferences) obj).edit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4329(Object obj) {
        if (C1125.m2937() >= 0) {
            return ((AbstractActivityC0669k) obj).f2699u;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۢۡ, reason: not valid java name and contains not printable characters */
    public static String m4314(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
