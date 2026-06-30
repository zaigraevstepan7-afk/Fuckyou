package p051a1;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.ContentInfo;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.widget.CompoundButton;
import androidx.activity.result.C0476c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.C0507u;
import androidx.fragment.app.AbstractC0537g;
import androidx.fragment.app.C0518H;
import androidx.fragment.app.C0532b;
import androidx.profileinstaller.C1148;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.chip.Chip;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import p000A.C0010k;
import p005C0.AbstractC0047m;
import p005C0.C0048n;
import p007E.AbstractC0056b;
import p019K0.AbstractC0165g;
import p023M0.C0206l;
import p023M0.C0207m;
import p023M0.C0212r;
import p023M0.C0218x;
import p023M0.C0219y;
import p023M0.C1127;
import p024N.AbstractC0240S;
import p024N.C0249a0;
import p024N.C1128;
import p025N0.C1131;
import p026O.C1132;
import p029P0.C1133;
import p032R.C1134;
import p037T0.C1136;
import p038U.C1137;
import p041V0.C1138;
import p044X.C1140;
import p045X0.C1141;
import p050a0.C1143;
import p052b0.C0595a;
import p052b0.C1152;
import p058d0.C0643;
import p058d0.C1158;
import p060e.AbstractC0676r;
import p060e.C0658N;
import p060e.C0665g;
import p060e.C0684z;
import p060e.LayoutInflaterFactory2C0648D;
import p065g.AbstractC0711g;
import p068h0.C1162;
import p072k.C1165;
import p073k0.C1166;
import p075l0.C0989e;
import p077m0.C1169;
import p081o0.AbstractC1015a;
import p081o0.C1170;
import p083p0.C1171;
import p084q.C1173;
import p086r.C1174;
import p089t.C1175;
import p097x.C1178;
import p098x0.C1179;

/* JADX INFO: renamed from: a1.۟ۦۡۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1145 {

    /* JADX INFO: renamed from: ۟۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static int f4871 = -149;

    /* JADX INFO: renamed from: ۟۟۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m3769(Object obj) {
        if (C1149.m3923() <= 0) {
            return ((TypedValue) obj).data;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۡۥۨ, reason: not valid java name and contains not printable characters */
    public static void m3770(Object obj, Object obj2) {
        if (C1144.m3748() < 0) {
            ((C0476c) obj).m1177q0(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static CheckableImageButton m3771(Object obj) {
        if (C1178.m5174() < 0) {
            return ((C0212r) obj).f687c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static int m3772(Object obj) {
        if (C1136.m3395() < 0) {
            return ((ViewGroup.MarginLayoutParams) obj).getMarginStart();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static String m3773(Object obj) {
        if (C1138.m3471() > 0) {
            return ((File) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3774(Object obj) {
        if (C1157.m4271() >= 0) {
            return ((C0665g) obj).f2662D;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static Path.Direction m3775() {
        if (C0643.m4322() <= 0) {
            return Path.Direction.CW;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۤۥ, reason: not valid java name and contains not printable characters */
    public static int m3776(Object obj) {
        if (C1133.m3246() < 0) {
            return ((C0684z) obj).f2729c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧۨ, reason: not valid java name and contains not printable characters */
    public static int m3777(Object obj) {
        if (C1155.m4177() > 0) {
            return ((C0507u) obj).f1556c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۧۥ, reason: not valid java name and contains not printable characters */
    public static int m3778(Object obj) {
        if (C1141.m3607() > 0) {
            return ((View) obj).getLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int m3779(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static View m3780(Object obj) {
        if (C1170.m4847() > 0) {
            return ((C0665g) obj).f2671g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m3781(Object obj) {
        if (C1127.m3025() >= 0) {
            return ((C0010k) obj).f25d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3782(Object obj, boolean z2) {
        if (C1157.m4271() >= 0) {
            ((PrintWriter) obj).print(z2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m3783(Object obj) {
        if (C1158.m4364() <= 0) {
            return ((C0665g) obj).f2683s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m3784(Object obj) {
        if (C1175.m5073() >= 0) {
            ((List) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨ۟, reason: not valid java name and contains not printable characters */
    public static String m3785(String str) {
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

    /* JADX INFO: renamed from: ۟ۤ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static long m3786(Object obj) {
        if (C1140.m3595() > 0) {
            return ((Location) obj).getTime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢۧ, reason: not valid java name and contains not printable characters */
    public static Context m3787(Object obj) {
        if (C1152.m4038() > 0) {
            return ((Context) obj).getApplicationContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean[] m3788(Object obj) {
        if (C1169.m4842() < 0) {
            return ((Parcel) obj).createBooleanArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Resources.Theme m3789(Object obj) {
        if (C1134.m3300() < 0) {
            return ((Resources) obj).newTheme();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢ۟, reason: not valid java name and contains not printable characters */
    public static C0206l m3790(Object obj) {
        if (C1165.m4643() >= 0) {
            return ((C0207m) obj).f669k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m3791(Object obj) {
        if (C1170.m4847() > 0) {
            return ((C0048n) obj).f174b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۤۨ, reason: not valid java name and contains not printable characters */
    public static int m3792(Object obj) {
        if (C1179.m5236() >= 0) {
            return ((TextInputLayout) obj).getBoxBackgroundMode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3793(Object obj, int i2, Object obj2) {
        if (C1174.m5008() > 0) {
            return ((Window.Callback) obj).onCreatePanelMenu(i2, (Menu) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m3794(int i2, Object obj) {
        if (C1128.m3066() > 0) {
            return AbstractC0047m.m280i(i2, (PorterDuff.Mode) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۣ, reason: not valid java name and contains not printable characters */
    public static void m3795(Object obj, boolean z2) {
        if (C1131.m3177() <= 0) {
            ((C0658N) obj).m1881t0(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟۟, reason: not valid java name and contains not printable characters */
    public static int m3796(Object obj) {
        if (C1137.m3457() < 0) {
            return ((Configuration) obj).screenHeightDp;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m3797(Object obj) {
        if (C1152.m4038() > 0) {
            AbstractC0056b.m333l((Resources.Theme) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۨ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m3798(Object obj, Object obj2) {
        if (C1134.m3300() < 0) {
            return ((String) obj).matches((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3799(Object obj) {
        if (C1175.m5073() > 0) {
            return AbstractC0676r.m1904b((Context) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static CompoundButton.OnCheckedChangeListener m3800(Object obj) {
        if (C1152.m4038() > 0) {
            return ((Chip) obj).f2170i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static C0219y m3801(Object obj) {
        if (C1171.m4901() >= 0) {
            return ((C0218x) obj).f749c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static Insets m3802(Object obj) {
        if (C1127.m3025() > 0) {
            return ((WindowInsets) obj).getMandatorySystemGestureInsets();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static AbstractC0537g m3803(Object obj, Object obj2) {
        if (C1143.m3711() <= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).m1859x((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟, reason: not valid java name and contains not printable characters */
    public static void m3804(Object obj) {
        if (C1166.m4699() > 0) {
            ((MotionEvent) obj).recycle();
        }
    }

    /* JADX INFO: renamed from: ۢۡۧ۟, reason: not valid java name and contains not printable characters */
    public static int m3805() {
        return (-1009) ^ C1173.f4916;
    }

    /* JADX INFO: renamed from: ۢۢۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3806(Object obj) {
        if (m3805() < 0) {
            return ((C0219y) obj).m688c();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۤ۟, reason: not valid java name and contains not printable characters */
    public static int m3807(int i2) {
        if (C0643.m4322() < 0) {
            return View.MeasureSpec.getSize(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨۥۢ, reason: not valid java name and contains not printable characters */
    public static void m3808(Object obj, int i2) {
        if (m3805() <= 0) {
            ((C0518H) obj).m1377t(i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3809(Object obj, int i2, Object obj2, Object obj3) {
        if (C1132.m3217() >= 0) {
            return ((Window.Callback) obj).onPreparePanel(i2, (View) obj2, (Menu) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static C0595a m3810() {
        if (C1136.m3395() < 0) {
            return AbstractC1015a.f4049d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m3811(Object obj) {
        if (C1148.m3908() > 0) {
            ((C0207m) obj).m654u();
        }
    }

    /* JADX INFO: renamed from: ۤۤۡۨ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3812(Object obj, long j2) {
        if (C1179.m5236() >= 0) {
            return ((StringBuilder) obj).append(j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۧ, reason: not valid java name and contains not printable characters */
    public static C0249a0 m3813(Object obj) {
        if (C1149.m3923() <= 0) {
            return AbstractC0240S.m770a((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۤ, reason: contains not printable characters */
    public static void m3814(Object obj, boolean z2) {
        if (C1150.m3967() >= 0) {
            ((AbstractC0711g) obj).m1962a(z2);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۧۧ, reason: contains not printable characters */
    public static void m3816(Object obj, int i2) {
        if (C1175.m5073() > 0) {
            ((CoordinatorLayout) obj).m1260p(i2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۧۡ, reason: contains not printable characters */
    public static boolean m3817(Object obj) {
        if (C1162.m4523() < 0) {
            return ((TextInputLayout) obj).f2397s;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۦۢ, reason: contains not printable characters */
    public static void m3818(Object obj, Object obj2) {
        if (C1154.m4128() >= 0) {
            ((ContentInfo.Builder) obj).setExtras((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3819(Object obj) {
        if (C1166.m4699() > 0) {
            return ((C0989e) obj).f3914e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m3820(Object obj) {
        if (C1174.m5008() >= 0) {
            return ((ThreadLocal) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧ۟, reason: not valid java name and contains not printable characters */
    public static DecelerateInterpolator m3821() {
        if (C1128.m3066() >= 0) {
            return C0658N.f2606O;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static void m3822(Object obj, int i2) {
        if (C1165.m4643() > 0) {
            ((AbstractC0165g) obj).setTrackStopIndicatorSize(i2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۨ۠, reason: not valid java name and contains not printable characters */
    public static Parcelable.Creator m3823() {
        if (C1169.m4842() <= 0) {
            return C0532b.CREATOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۦۡ, reason: contains not printable characters */
    public static String m3815(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
