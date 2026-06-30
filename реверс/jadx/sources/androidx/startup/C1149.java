package androidx.startup;

import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.C1147;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.ConfigsActivity;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import p000A.C0010k;
import p011G.C1123;
import p015I0.C1125;
import p016J.C0133e;
import p019K0.AbstractC0165g;
import p019K0.C0164f;
import p022M.C1126;
import p023M0.C0188A;
import p023M0.C0208n;
import p023M0.C0212r;
import p023M0.C0217w;
import p023M0.C1127;
import p024N.AbstractC0229G;
import p024N.C0270l;
import p024N.C1128;
import p025N0.C1129;
import p025N0.C1131;
import p026O.C1132;
import p029P0.C1133;
import p031Q0.C0336j;
import p031Q0.RunnableC0328b;
import p037T0.C1136;
import p041V0.C1138;
import p045X0.C1141;
import p051a1.C1144;
import p058d0.C1158;
import p060e.AbstractActivityC0669k;
import p060e.AbstractC0676r;
import p060e.AbstractC0681w;
import p060e.C0647C;
import p060e.C0654J;
import p060e.C0658N;
import p060e.LayoutInflaterFactory2C0648D;
import p066g0.C0764o;
import p066g0.C1160;
import p068h0.C1162;
import p070i0.C1163;
import p070i0.C1164;
import p071j.AbstractC0786a;
import p072k.MenuC0816m;
import p073k0.C1166;
import p073k0.C1167;
import p074l.C0944k;
import p074l.C0973u;
import p074l.C0977w;
import p075l0.C1168;
import p083p0.C1171;
import p084q.C1172;
import p084q.C1173;
import p089t.C1175;
import p092u0.C1176;

/* JADX INFO: renamed from: androidx.startup.ۢۦ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1149 {

    /* JADX INFO: renamed from: ۦۢ۟۟, reason: contains not printable characters */
    public static int f4875 = -97;

    /* JADX INFO: renamed from: ۟۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m3911(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static C0133e m3912(Object obj) {
        if (C1125.m2937() > 0) {
            return AbstractC0681w.m1909b((Configuration) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static Object m3913(Object obj) {
        if (C1144.m3748() <= 0) {
            return ((C0217w) obj).f746b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۨ۟, reason: not valid java name and contains not printable characters */
    public static LayoutInflaterFactory2C0648D m3914(Object obj) {
        if (C1155.m4177() >= 0) {
            return ((AbstractActivityC0669k) obj).f2702x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static C0212r m3915(Object obj) {
        if (C1162.m4523() < 0) {
            return ((TextInputLayout) obj).f2365c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۨۢ, reason: not valid java name and contains not printable characters */
    public static int m3916(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۡۦۥ, reason: not valid java name and contains not printable characters */
    public static void m3917(Object obj, boolean z2) {
        if (C1136.m3395() <= 0) {
            ((AccessibilityNodeInfo) obj).setShowingHintText(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۨ۟, reason: not valid java name and contains not printable characters */
    public static void m3918(Object obj) {
        if (C1129.m3120() < 0) {
            ((AbstractC0165g) obj).m595t();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static void m3919(Object obj, int i2) {
        if (C1158.m4364() < 0) {
            ((AudioManager) obj).playSoundEffect(i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۧ, reason: not valid java name and contains not printable characters */
    public static void m3920(Object obj, Object obj2, Object obj3) {
        if (C1128.m3066() >= 0) {
            ((Bundle) obj).putStringArrayList((String) obj2, (ArrayList) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static Editable m3921(Object obj) {
        if (C1176.m5115() < 0) {
            return ((C0977w) obj).getText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m3922(Object obj) {
        if (C1138.m3471() >= 0) {
            return ((Set) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m3923() {
        return 606 ^ C1131.f4846;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static float m3924(Object obj) {
        if (C1141.m3607() > 0) {
            return ((C0164f) obj).f505b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static long m3925(Object obj) {
        if (C1126.m2964() <= 0) {
            return ((C0654J) obj).f2593a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3926(Object obj) {
        if (C1160.m4437() <= 0) {
            return ((C0658N) obj).f2611E;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨۤۢ, reason: not valid java name and contains not printable characters */
    public static RecyclerView m3927(Object obj) {
        if (C1167.m4739() <= 0) {
            return ((C0764o) obj).f3082d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۥۧ, reason: not valid java name and contains not printable characters */
    public static void m3928(Object obj, Object obj2) {
        if (C1171.m4901() > 0) {
            AbstractC0681w.m1911d((Configuration) obj, (C0133e) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3929(Object obj) {
        if (C1175.m5073() > 0) {
            return ((TextInputLayout) obj).f2342E;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۨۦ, reason: not valid java name and contains not printable characters */
    public static C0212r m3930(Object obj) {
        if (C1173.m4990() <= 0) {
            return ((C0208n) obj).f677a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۦ۟, reason: not valid java name and contains not printable characters */
    public static void m3931(Object obj, Object obj2) {
        if (C1133.m3246() <= 0) {
            ((ViewManager) obj).removeView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۥۥ۠, reason: not valid java name and contains not printable characters */
    public static void m3932(Object obj, Object obj2) {
        if (C1164.m4618() >= 0) {
            ((Paint) obj).setStrokeCap((Paint.Cap) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3933(Object obj) {
        if (C1163.m4579() > 0) {
            return ((C0188A) obj).f627j;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static Drawable m3934(Object obj, int i2) {
        if (C1147.m1498() < 0) {
            return ((C0270l) obj).m845h(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3935(Object obj, Object obj2, Object obj3) {
        if (C1166.m4699() > 0) {
            return ((C0010k) obj).m90k((AbstractC0786a) obj2, (MenuItem) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۨ۟, reason: not valid java name and contains not printable characters */
    public static void m3936(Object obj, Object obj2) {
        if (C1127.m3025() >= 0) {
            ((View) obj).getLocationInWindow((int[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۨۦۢ, reason: not valid java name and contains not printable characters */
    public static void m3937() {
        if (C1156.m4236() > 0) {
            C0973u.m2425d();
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۤۤ, reason: contains not printable characters */
    public static void m3938(Object obj, Object obj2) {
        if (C1160.m4437() < 0) {
            ((View) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۡ۠ۢ, reason: contains not printable characters */
    public static boolean m3939(Object obj) {
        if (C1157.m4271() >= 0) {
            return ((RunnableC0328b) obj).f939c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۥۧ, reason: contains not printable characters */
    public static void m3940(Object obj, Object obj2) {
        if (C1132.m3217() >= 0) {
            ((Window) obj).setContentView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۤۢ, reason: contains not printable characters */
    public static Object m3941() {
        if (C1172.m4932() < 0) {
            return AbstractC0676r.f2716h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ۟ۨ, reason: contains not printable characters */
    public static String m3942(Object obj) {
        if (C1132.m3217() > 0) {
            return ((MainActivity) obj).m1825s();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۤۨ, reason: contains not printable characters */
    public static C0336j m3943(Object obj, Object obj2) {
        if (C1147.m1498() < 0) {
            return ((ConfigsActivity) obj).m1807u((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۧۤ, reason: contains not printable characters */
    public static MenuC0816m m3944(Object obj) {
        if (C1164.m4618() >= 0) {
            return ((C0647C) obj).f2516h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static float m3945(Object obj) {
        if (C1172.m4932() <= 0) {
            return AbstractC0229G.m711m((View) obj);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۧۢۢ, reason: not valid java name and contains not printable characters */
    public static String m3946() {
        if (C1147.m1498() < 0) {
            return "ۨ۠ۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۥۨ, reason: not valid java name and contains not printable characters */
    public static void m3947(Object obj, int i2) {
        if (C1168.m4797() <= 0) {
            ((View) obj).setVisibility(i2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۦۧ, reason: not valid java name and contains not printable characters */
    public static Collection m3949(Object obj) {
        if (C1123.m2849() > 0) {
            return ((HashMap) obj).values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3950(Object obj) {
        if (C1136.m3395() <= 0) {
            return ((C0944k) obj).m2384l();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m3948(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
