package p065g;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ServiceInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.fragment.app.AbstractComponentCallbacksC0548r;
import androidx.fragment.app.LayoutInflaterFactory2C0553w;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.ConfigsActivity;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import p001A0.C1121;
import p005C0.C0037c;
import p015I0.C0111g;
import p015I0.C0112h;
import p015I0.C0117m;
import p015I0.C1125;
import p019K0.C0160b;
import p022M.C1126;
import p023M0.AbstractC0213s;
import p023M0.C0212r;
import p023M0.C0216v;
import p023M0.C1127;
import p024N.C0249a0;
import p024N.C0270l;
import p025N0.C1129;
import p029P0.C1133;
import p031Q0.C0340n;
import p031Q0.DialogInterfaceOnShowListenerC0330d;
import p032R.C1134;
import p038U.C1137;
import p041V0.C1138;
import p044X.C1140;
import p045X0.C1141;
import p051a1.C1144;
import p052b0.C1151;
import p052b0.C1152;
import p058d0.C0643;
import p058d0.C1158;
import p060e.AbstractC0676r;
import p060e.LayoutInflaterFactory2C0648D;
import p060e.RunnableC0677s;
import p060e.ViewOnClickListenerC0650F;
import p066g0.C0756j;
import p070i0.C1163;
import p072k.C1165;
import p073k0.C1166;
import p073k0.C1167;
import p074l.C0884K0;
import p074l.C0981y;
import p075l0.C1168;
import p081o0.C1170;
import p086r.C1174;
import p089t.C1175;
import p092u0.C1176;
import p096w0.C1177;
import p097x.C1178;

/* JADX INFO: renamed from: g.۠۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1159 {

    /* JADX INFO: renamed from: ۟ۥ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static int f4902 = 390;

    /* JADX INFO: renamed from: ۟۟ۡۦۧ, reason: not valid java name and contains not printable characters */
    public static C0112h m4387(Object obj) {
        if (C1176.m5115() <= 0) {
            return ((BottomSheetBehavior) obj).f2108i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۨ۠, reason: not valid java name and contains not printable characters */
    public static void m4388(Object obj, Object obj2) {
        if (C1151.m4000() > 0) {
            ((C0981y) obj).setImageDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۨۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4389(Object obj, Object obj2) {
        if (C1176.m5115() < 0) {
            return ((String) obj).equalsIgnoreCase((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static Context m4390(Object obj) {
        if (C1154.m4128() > 0) {
            return ((C0216v) obj).f725g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4391(Object obj, Object obj2) {
        if (C1152.m4038() > 0) {
            return ((AbstractCollection) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4392(Object obj) {
        if (C1174.m5008() > 0) {
            return ((ConfigsActivity) obj).m1806t();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m4393(Object obj) {
        if (C1168.m4797() < 0) {
            return ((C0270l) obj).f836a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۡۨ, reason: not valid java name and contains not printable characters */
    public static View m4394(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C1163.m4579() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).onCreateView((View) obj2, (String) obj3, (Context) obj4, (AttributeSet) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static C0117m m4395(Object obj) {
        if (C1144.m3748() < 0) {
            return ((C0111g) obj).f328a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static void m4396(Object obj, int i2) {
        if (C1129.m3120() < 0) {
            ((ViewGroup.MarginLayoutParams) obj).setMarginStart(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int m4397(Object obj) {
        if (C1134.m3300() < 0) {
            return ((Message) obj).what;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static Paint.Style m4398() {
        if (C1141.m3607() >= 0) {
            return Paint.Style.FILL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4400(Object obj) {
        if (C1166.m4699() > 0) {
            return ((AbstractComponentCallbacksC0548r) obj).f1759A;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m4401(Object obj, Object obj2) {
        if (C1137.m3457() <= 0) {
            return ((DateFormat) obj).format((Date) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۨۦ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m4402(Object obj) {
        if (C1158.m4364() <= 0) {
            return ((C0212r) obj).f696l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4403(Object obj, int i2) {
        if (C1163.m4579() >= 0) {
            return ((C0270l) obj).m844g(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static C0037c m4404(Object obj) {
        if (C1138.m3471() > 0) {
            return ((TextInputLayout) obj).f2404v0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠۠, reason: not valid java name and contains not printable characters */
    public static void m4405(Object obj, Object obj2, int i2, int i3) {
        if (C1140.m3595() >= 0) {
            ((MessageDigest) obj).update((byte[]) obj2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠۟, reason: not valid java name and contains not printable characters */
    public static RunnableC0677s m4406(Object obj) {
        if (C1163.m4579() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2575x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m4407(Object obj, Object obj2) {
        if (C0643.m4322() < 0) {
            return ((String) obj).toLowerCase((Locale) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡ۠, reason: not valid java name and contains not printable characters */
    public static LayoutInflaterFactory2C0648D m4408(Object obj) {
        if (C1178.m5174() <= 0) {
            return ((RunnableC0677s) obj).f2719b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۡ, reason: not valid java name and contains not printable characters */
    public static void m4409(Object obj) {
        if (C1175.m5073() > 0) {
            ((DialogInterface) obj).dismiss();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static void m4410(Object obj, Object obj2) {
        if (C1125.m2937() >= 0) {
            ((View) obj).setBackgroundDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۦۦ, reason: not valid java name and contains not printable characters */
    public static int m4411() {
        return 712 ^ C1175.f4918;
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m4412(Object obj, Object obj2) {
        if (C1168.m4797() < 0) {
            ((C0884K0) obj).mo2296n((ListAdapter) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static void m4413(Object obj) {
        if (C1127.m3025() >= 0) {
            ((AbstractC0676r) obj).mo1844d();
        }
    }

    /* JADX INFO: renamed from: ۠ۥۥۢ, reason: not valid java name and contains not printable characters */
    public static TextInputLayout m4414(Object obj) {
        if (C1140.m3595() >= 0) {
            return ((AbstractC0213s) obj).f707a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۦۢ, reason: not valid java name and contains not printable characters */
    public static void m4415(Object obj) {
        if (C1149.m3923() < 0) {
            ((AnimatorSet) obj).cancel();
        }
    }

    /* JADX INFO: renamed from: ۣۡۨ۟, reason: not valid java name and contains not printable characters */
    public static Drawable.ConstantState m4416(Object obj) {
        if (C1165.m4643() >= 0) {
            return ((Drawable) obj).getConstantState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m4417(Object obj) {
        if (C1155.m4177() >= 0) {
            return ((C0160b) obj).f498b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۢۤ, reason: not valid java name and contains not printable characters */
    public static C0340n m4418(Object obj) {
        if (C1155.m4177() >= 0) {
            return ((DialogInterfaceOnShowListenerC0330d) obj).f944d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m4419(Object obj, Object obj2) {
        if (C1158.m4364() < 0) {
            ((TextView) obj).setTextColor((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m4420(Object obj) {
        if (C1144.m3748() <= 0) {
            return ((C0216v) obj).f721c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Bundle m4421(Object obj) {
        if (C1140.m3595() > 0) {
            return ((ServiceInfo) obj).metaData;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥ۟, reason: not valid java name and contains not printable characters */
    public static String m4422() {
        if (C1141.m3607() > 0) {
            return "ۥۡۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4423(Object obj) {
        if (C1150.m3967() >= 0) {
            return ((C0756j) obj).f3017j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۢۦ, reason: not valid java name and contains not printable characters */
    public static String m4424() {
        if (C1126.m2964() <= 0) {
            return "ۥۢۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۥۦ, reason: contains not printable characters */
    public static String m4425(Object obj) {
        if (C1155.m4177() >= 0) {
            return MainActivity.m1814E((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۡ, reason: contains not printable characters */
    public static boolean m4426(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((View) obj).isEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۧ۠, reason: contains not printable characters */
    public static void m4427(Object obj) {
        if (C1133.m3246() <= 0) {
            ((RunnableC0677s) obj).run();
        }
    }

    /* JADX INFO: renamed from: ۦۧۧۥ, reason: contains not printable characters */
    public static String m4428(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i4 = 0; i4 < length; i4++) {
            byteArray[i4] = (byte) (byteArray[i4] ^ str2.charAt(i4 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۧۡۦۦ, reason: not valid java name and contains not printable characters */
    public static String m4429(Object obj) {
        if (C1170.m4847() >= 0) {
            return ((Class) obj).getCanonicalName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢ */
    public static String m1965(Object obj, int i2, Object obj2) {
        if (C1177.m5152() > 0) {
            return ((Context) obj).getString(i2, (Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Context m4430(Object obj) {
        if (C1167.m4739() < 0) {
            return ((ViewOnClickListenerC0650F) obj).f2582d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۨ۠, reason: not valid java name and contains not printable characters */
    public static void m4431(Object obj, Object obj2, boolean z2) {
        if (C1168.m4797() <= 0) {
            ((CompoundButton.OnCheckedChangeListener) obj).onCheckedChanged((CompoundButton) obj2, z2);
        }
    }

    /* JADX INFO: renamed from: ۧۧۦۨ, reason: not valid java name and contains not printable characters */
    public static C0249a0 m4432(Object obj, int i2, long j2) {
        if (C1129.m3120() < 0) {
            return ((ActionBarContextView) obj).m1205i(i2, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۤ, reason: not valid java name and contains not printable characters */
    public static int m4433(Object obj) {
        if (C1152.m4038() >= 0) {
            return ((AdapterView) obj).getSelectedItemPosition();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۤۧ, reason: not valid java name and contains not printable characters */
    public static int m4434(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static View m4435(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C1156.m4236() >= 0) {
            return ((LayoutInflaterFactory2C0553w) obj).onCreateView((View) obj2, (String) obj3, (Context) obj4, (AttributeSet) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m4399(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
