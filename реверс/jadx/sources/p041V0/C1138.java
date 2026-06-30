package p041V0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.recyclerview.widget.RecyclerView;
import androidx.startup.C1149;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.ConfigsActivity;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.crypto.Cipher;
import p001A0.C1121;
import p011G.C1123;
import p015I0.C0111g;
import p015I0.C0112h;
import p019K0.AbstractC0165g;
import p019K0.C0161c;
import p023M0.C0192E;
import p023M0.C0200f;
import p023M0.C0208n;
import p023M0.C0212r;
import p023M0.C0220z;
import p024N.AbstractC0240S;
import p024N.C0295x0;
import p025N0.C1130;
import p025N0.C1131;
import p026O.C1132;
import p029P0.C1133;
import p032R.C1134;
import p037T0.C1136;
import p038U.C1137;
import p042W.C1139;
import p044X.C1140;
import p045X0.C1141;
import p050a0.C1143;
import p052b0.C1151;
import p058d0.C1158;
import p060e.AbstractC0680v;
import p060e.C0651G;
import p060e.C0658N;
import p060e.C0662d;
import p060e.HandlerC0663e;
import p066g0.AbstractC0714B;
import p066g0.C0756j;
import p066g0.C1160;
import p066g0.C1161;
import p068h0.C1162;
import p070i0.C1164;
import p071j.C0789d;
import p072k.C0809f;
import p072k.MenuC0816m;
import p074l.AbstractC0961p1;
import p074l.C0946k1;
import p075l0.C1168;
import p077m0.C1169;
import p083p0.C1171;
import p084q.C1172;
import p084q.C1173;
import p086r.C1174;
import p092u0.C1176;
import p096w0.C1177;
import p097x.C1178;
import p098x0.C1179;
import p100z.C1180;

/* JADX INFO: renamed from: V0.ۥۤۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1138 {

    /* JADX INFO: renamed from: ۟ۤۧۢۥ, reason: not valid java name and contains not printable characters */
    public static int f4864 = -513;

    /* JADX INFO: renamed from: ۣ۟۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static long m3470(Object obj) {
        if (C1151.m4000() >= 0) {
            return ((ViewPropertyAnimator) obj).getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۧ, reason: not valid java name and contains not printable characters */
    public static int m3471() {
        return (-704) ^ C1149.f4875;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static float m3472(float f, float f2) {
        if (C1179.m5236() >= 0) {
            return Math.min(f, f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m3473(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((TextView) obj).getLineCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m3474(Object obj) {
        if (C1178.m5174() < 0) {
            return ((View) obj).isLaidOut();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static C0111g m3475(Object obj) {
        if (C1137.m3457() < 0) {
            return ((C0112h) obj).f346a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m3476(Object obj, Object obj2, long j2) {
        if (C1172.m4932() <= 0) {
            return ((View) obj).postDelayed((Runnable) obj2, j2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static WeakReference m3477(Object obj) {
        if (C1133.m3246() < 0) {
            return ((HandlerC0663e) obj).f2658a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m3478(Object obj) {
        if (C1171.m4901() > 0) {
            return ((KeyEvent) obj).getDeviceId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static void m3479(Object obj, Object obj2) {
        if (C1141.m3607() > 0) {
            ((Window.Callback) obj).onActionModeStarted((ActionMode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۢ, reason: not valid java name and contains not printable characters */
    public static C0208n m3480(Object obj) {
        if (C1161.m4510() < 0) {
            return ((C0212r) obj).f706v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۥ, reason: not valid java name and contains not printable characters */
    public static int m3481(Object obj) {
        if (C1160.m4437() <= 0) {
            return ((View) obj).getMinimumHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m3482(Object obj, int i2) {
        if (C1173.m4990() < 0) {
            ((AbstractC0165g) obj).setTrackHeight(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Class[] m3483() {
        if (C1157.m4271() > 0) {
            return C0651G.f2583b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۦ, reason: not valid java name and contains not printable characters */
    public static EditText m3484(Object obj) {
        if (C1134.m3300() < 0) {
            return ((C0220z) obj).f759f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۤ, reason: not valid java name and contains not printable characters */
    public static void m3485(Object obj, int i2, boolean z2) {
        if (C1180.m5241() < 0) {
            ((AbsListView) obj).setItemChecked(i2, z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۣ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3486(Object obj) {
        if (C1149.m3923() <= 0) {
            return AbstractC0680v.m1906a((PowerManager) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۡ, reason: not valid java name and contains not printable characters */
    public static float m3487(Object obj) {
        if (C1123.m2849() > 0) {
            return ((RectF) obj).left;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m3488(Object obj) {
        if (C1123.m2849() >= 0) {
            return ((Rect) obj).width();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m3489(Object obj) {
        if (C1157.m4271() > 0) {
            return ((C0200f) obj).f654e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m3490(Object obj) {
        if (C1164.m4618() >= 0) {
            return ((View) obj).getPaddingStart();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static DialogInterface.OnClickListener m3491(Object obj) {
        if (C1173.m4990() <= 0) {
            return ((C0662d) obj).f2654p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m3492(Object obj) {
        if (C1158.m4364() < 0) {
            return ((String) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠۟۟, reason: not valid java name and contains not printable characters */
    public static Context m3493(Object obj) {
        if (C1134.m3300() < 0) {
            return ((C0658N) obj).f2621q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۟۟, reason: not valid java name and contains not printable characters */
    public static int m3494(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۦۤۡ, reason: not valid java name and contains not printable characters */
    public static int m3495(Object obj) {
        if (C1169.m4842() <= 0) {
            return ((C0161c) obj).f499a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۧ۠, reason: not valid java name and contains not printable characters */
    public static BigDecimal m3496(Object obj, Object obj2, Object obj3) {
        if (C1157.m4271() > 0) {
            return ((BigDecimal) obj).subtract((BigDecimal) obj2, (MathContext) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static void m3497(Object obj, int i2) {
        if (C1162.m4523() <= 0) {
            AbstractC0240S.m779j((View) obj, i2);
        }
    }

    /* JADX INFO: renamed from: ۢۤۤ۠, reason: not valid java name and contains not printable characters */
    public static String m3498(String str) {
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

    /* JADX INFO: renamed from: ۢۤۤۥ, reason: not valid java name and contains not printable characters */
    public static void m3499(Object obj) {
        if (C1173.m4990() <= 0) {
            ((C0789d) obj).mo1870g();
        }
    }

    /* JADX INFO: renamed from: ۣۢۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3500(Object obj) {
        if (C1140.m3595() > 0) {
            return ((C0756j) obj).f3015h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۤۧ, reason: not valid java name and contains not printable characters */
    public static Toolbar m3501(Object obj) {
        if (C1143.m3711() <= 0) {
            return ((C0946k1) obj).f3769a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static MenuC0816m m3502(Object obj) {
        if (C1168.m4797() < 0) {
            return ((C0809f) obj).f3277b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۣۨ, reason: not valid java name and contains not printable characters */
    public static Object m3503(Object obj, int i2, Object obj2) {
        if (C1154.m4128() >= 0) {
            return ((ArrayList) obj).set(i2, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۧۢ, reason: not valid java name and contains not printable characters */
    public static Cipher m3504(Object obj) {
        if (C1131.m3177() < 0) {
            return Cipher.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۟۟, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimator m3505(Object obj) {
        if (C1176.m5115() <= 0) {
            return ((View) obj).animate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۤۤ, reason: not valid java name and contains not printable characters */
    public static void m3506(Object obj, Object obj2) {
        if (C1139.m3541() > 0) {
            ((MenuC0816m) obj).m2195t((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۥۧۥ, reason: contains not printable characters */
    public static void m3507(Object obj, Object obj2) {
        if (C1133.m3246() <= 0) {
            ((AnimatorSet) obj).playTogether((Animator[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣۧ۠, reason: contains not printable characters */
    public static boolean m3508(Object obj) {
        if (C1151.m4000() >= 0) {
            return ((View) obj).requestFocus();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۧۢۢ, reason: contains not printable characters */
    public static String m3509(Object obj, int i2) {
        if (C1136.m3395() <= 0) {
            return ((Resources) obj).getResourceEntryName(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۦۧ, reason: contains not printable characters */
    public static boolean m3510(Object obj) {
        if (C1139.m3541() >= 0) {
            return ((Dialog) obj).isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3511(Object obj) {
        if (C1132.m3217() >= 0) {
            return ((LocaleList) obj).toLanguageTags();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۤ۠, reason: not valid java name and contains not printable characters */
    public static SimpleDateFormat m3512(Object obj) {
        if (C1130.m3165() > 0) {
            return ((ConfigsActivity) obj).f2463z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m3513() {
        if (C1146.m3842() < 0) {
            return AbstractC0961p1.f3830a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۧۢ, reason: not valid java name and contains not printable characters */
    public static String m3514(Object obj) {
        if (C1177.m5152() >= 0) {
            return ConfigsActivity.m1797B((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static void m3515(Object obj, Object obj2) {
        if (C1174.m5008() > 0) {
            ((RecyclerView) obj).setAdapter((AbstractC0714B) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۢۧ, reason: not valid java name and contains not printable characters */
    public static TextInputLayout m3517(Object obj) {
        if (C1161.m4510() < 0) {
            return ((C0192E) obj).f634d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static int m3518(Object obj) {
        if (C1164.m4618() >= 0) {
            return ((C0295x0) obj).m921a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۠۟۟, reason: not valid java name and contains not printable characters */
    public static String m3516(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
