package com.google.android.material.datepicker;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.fragment.app.C0518H;
import androidx.profileinstaller.C1148;
import androidx.startup.C1149;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.internal.C1156;
import com.google.android.material.slider.Slider;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import p001A0.AbstractC0016e;
import p011G.C1123;
import p015I0.C0112h;
import p015I0.C1125;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.C0207m;
import p023M0.C0219y;
import p024N.AbstractC0240S;
import p024N.InterfaceC0251b0;
import p025N0.C1129;
import p025N0.C1130;
import p029P0.C1133;
import p031Q0.C0336j;
import p034S.InterfaceC0363g;
import p037T0.C1135;
import p042W.AbstractC0401b;
import p042W.C1139;
import p051a1.C1144;
import p051a1.C1145;
import p058d0.C0643;
import p058d0.C1158;
import p060e.AbstractC0676r;
import p060e.C0665g;
import p060e.LayoutInflaterFactory2C0648D;
import p066g0.C0756j;
import p066g0.C0764o;
import p066g0.C1161;
import p070i0.C1163;
import p070i0.C1164;
import p072k.C1165;
import p072k.MenuC0816m;
import p073k0.C1166;
import p074l.AbstractC0909X0;
import p074l.C0925d1;
import p075l0.C1168;
import p081o0.C1170;
import p084q.C1172;
import p084q.C1173;
import p086r.C1174;
import p096w0.C1090a;
import p096w0.C1092c;

/* JADX INFO: renamed from: com.google.android.material.datepicker.ۨۨۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1155 {

    /* JADX INFO: renamed from: ۟ۡۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int f4881 = 603;

    /* JADX INFO: renamed from: ۟۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static LinkedHashSet m4144(Object obj) {
        if (C1133.m3246() <= 0) {
            return ((TextInputLayout) obj).f2370e0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static MenuC0816m m4145(Object obj) {
        if (C1125.m2937() >= 0) {
            return ((MenuC0816m) obj).mo2168k();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۥ, reason: not valid java name and contains not printable characters */
    public static int m4146(Object obj, int i2) {
        if (C1168.m4797() < 0) {
            return AbstractC0016e.m159H((Context) obj, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۥۤ, reason: not valid java name and contains not printable characters */
    public static Rect m4147(Object obj) {
        if (C1157.m4271() >= 0) {
            return ((Drawable) obj).getBounds();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static C1092c m4148(Object obj) {
        if (C1146.m3842() < 0) {
            return ((C1090a) obj).f4490b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static int m4149(Object obj) {
        if (C1126.m2964() <= 0) {
            return ((C0219y) obj).f753h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ClipDescription m4150(Object obj) {
        if (C1161.m4510() < 0) {
            return ((InterfaceC0363g) obj).mo839a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m4151(Object obj) {
        if (C1129.m3120() < 0) {
            return ((C0764o) obj).f3080b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m4152(Object obj, Object obj2) {
        if (C1144.m3748() <= 0) {
            ((ActionBarContextView) obj).setTitle((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m4153(Object obj) {
        if (C1135.m3328() > 0) {
            return ((Configuration) obj).keyboardHidden;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m4154(Object obj, int i2) {
        if (C1154.m4128() > 0) {
            return ((List) obj).get(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4155(Object obj, Object obj2, Object obj3, long j2) {
        if (C1166.m4699() > 0) {
            return ((Handler) obj).postAtTime((Runnable) obj2, obj3, j2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۟, reason: not valid java name and contains not printable characters */
    public static void m4156(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (m4177() >= 0) {
            ((C0518H) obj).m1379v((String) obj2, (FileDescriptor) obj3, (PrintWriter) obj4, (String[]) obj5);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۦۢ, reason: not valid java name and contains not printable characters */
    public static void m4157(Object obj) {
        if (m4177() > 0) {
            ((AbstractC0909X0) obj).toggle();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۦ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m4158(Object obj) {
        if (C1148.m3908() >= 0) {
            return ((C0756j) obj).f3018k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣ, reason: not valid java name and contains not printable characters */
    public static String m4159() {
        if (C1170.m4847() >= 0) {
            return "ۣۧۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m4160(Object obj) {
        if (C1158.m4364() <= 0) {
            return ((AdapterView) obj).getSelectedItem();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧۥ, reason: not valid java name and contains not printable characters */
    public static int m4161(Object obj) {
        if (C1170.m4847() >= 0) {
            return ((AbstractC0401b) obj).f1082k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static WeakHashMap m4162() {
        if (C0643.m4322() < 0) {
            return AbstractC0240S.f777a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟۟, reason: not valid java name and contains not printable characters */
    public static int m4163(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۦۣ۟, reason: not valid java name and contains not printable characters */
    public static void m4164(Object obj) {
        if (C1146.m3842() < 0) {
            ((InterfaceC0251b0) obj).mo216c();
        }
    }

    /* JADX INFO: renamed from: ۟ۨۨۡ, reason: not valid java name and contains not printable characters */
    public static void m4165(Object obj) {
        if (C1146.m3842() < 0) {
            ((AutoCompleteTextView) obj).showDropDown();
        }
    }

    /* JADX INFO: renamed from: ۠۟۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m4166(Object obj) {
        if (C1170.m4847() >= 0) {
            return ((C0207m) obj).f672n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static int m4167(Object obj) {
        if (C1130.m3165() > 0) {
            return ((C0336j) obj).f957a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m4168(String str) {
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

    /* JADX INFO: renamed from: ۣ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static void m4169(Object obj, int i2) {
        if (C1139.m3541() > 0) {
            ((C0219y) obj).setSimpleItems(i2);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۦ۠, reason: not valid java name and contains not printable characters */
    public static String m4170() {
        if (C1174.m5008() >= 0) {
            return "۠ۧۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4171(Object obj, int i2) {
        if (C1165.m4643() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).mo1845f(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۢۨ, reason: not valid java name and contains not printable characters */
    public static TextView m4172(Object obj) {
        if (C1164.m4618() > 0) {
            return ((C0665g) obj).f2686v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static int m4173(Object obj) {
        if (C1157.m4271() >= 0) {
            return ((AbstractC0165g) obj).f518J;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m4174(Object obj) {
        if (C1133.m3246() < 0) {
            ((Toast) obj).show();
        }
    }

    /* JADX INFO: renamed from: ۣۣۢۥ, reason: not valid java name and contains not printable characters */
    public static String m4175() {
        if (C1126.m2964() < 0) {
            return "۟ۡۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۢ, reason: not valid java name and contains not printable characters */
    public static void m4176(Object obj, Object obj2) {
        if (C1156.m4236() >= 0) {
            ((ValueAnimator) obj).setInterpolator((TimeInterpolator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static int m4177() {
        return (-454) ^ C1149.f4875;
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static Location m4178(Object obj, Object obj2) {
        if (C1145.m3805() < 0) {
            return ((LocationManager) obj).getLastKnownLocation((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۦ, reason: not valid java name and contains not printable characters */
    public static float m4180(Object obj) {
        if (C1172.m4932() < 0) {
            return ((AbstractC0165g) obj).f525Q;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۨۧۧ, reason: not valid java name and contains not printable characters */
    public static Toolbar m4181(Object obj) {
        if (C1130.m3165() >= 0) {
            return ((C0925d1) obj).f3710a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۢۡ, reason: contains not printable characters */
    public static int m4182() {
        if (C1166.m4699() > 0) {
            return AbstractC0676r.f2710b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۤ, reason: contains not printable characters */
    public static void m4183(Object obj) {
        if (C1173.m4990() <= 0) {
            ((C0112h) obj).m483o();
        }
    }

    /* JADX INFO: renamed from: ۦ۠ۥۤ, reason: contains not printable characters */
    public static void m4184(Object obj, int i2) {
        if (m4177() > 0) {
            ((View) obj).setMinimumWidth(i2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۤۦ, reason: contains not printable characters */
    public static String m4185(Object obj, Object obj2) {
        if (C1173.m4990() <= 0) {
            return ((URLConnection) obj).getHeaderField((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۨ, reason: contains not printable characters */
    public static float m4186(Object obj) {
        if (C1163.m4579() > 0) {
            return ((Slider) obj).getValueTo();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4187(Object obj, int i2) {
        if (C1157.m4271() >= 0) {
            return ((TypedArray) obj).hasValue(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m4188(Object obj) {
        if (C1135.m3328() > 0) {
            return ((AbstractC0165g) obj).f537c0;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4189(Object obj) {
        if (C1123.m2849() > 0) {
            return ((Window.Callback) obj).onSearchRequested();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m4179(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
