package androidx.lifecycle;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.activity.AbstractActivityC0466k;
import androidx.activity.C0468m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.fragment.app.C0518H;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.snackbar.C1157;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import p001A0.AbstractC0016e;
import p001A0.C1121;
import p004C.C1122;
import p019K0.AbstractC0165g;
import p019K0.C0160b;
import p023M0.C0211q;
import p023M0.C0212r;
import p023M0.C0216v;
import p025N0.C1130;
import p029P0.C0325b;
import p029P0.C1133;
import p029P0.ViewOnLayoutChangeListenerC0324a;
import p037T0.C1136;
import p041V0.C1138;
import p042W.C1139;
import p044X.C1140;
import p050a0.C1142;
import p050a0.C1143;
import p052b0.C1151;
import p060e.C0657M;
import p060e.C0658N;
import p060e.C0665g;
import p060e.DialogInterfaceC0666h;
import p060e.LayoutInflaterFactory2C0648D;
import p066g0.C1161;
import p070i0.C1163;
import p070i0.C1164;
import p071j.AbstractC0798m;
import p072k.InterfaceC0828y;
import p072k.MenuC0816m;
import p073k0.C1166;
import p074l.InterfaceC0957o0;
import p081o0.C1170;
import p083p0.C1171;
import p089t.C1175;
import p096w0.C1177;

/* JADX INFO: renamed from: androidx.lifecycle.۟۠ۢۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1147 {

    /* JADX INFO: renamed from: ۟ۦۤۧۤ, reason: not valid java name and contains not printable characters */
    public static int f4873 = 614;

    /* JADX INFO: renamed from: ۣ۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m3871(Object obj, Object obj2) {
        if (C1170.m4847() >= 0) {
            ((AbstractC0165g) obj).setHaloTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static String m3872(Object obj) {
        if (C1155.m4177() > 0) {
            return ((URL) obj).getHost();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m3873(Object obj, Object obj2, Object obj3) {
        if (C1166.m4699() > 0) {
            return ((Method) obj).invoke(obj2, (Object[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static C0468m m3874(Object obj) {
        if (C1177.m5152() >= 0) {
            return ((AbstractActivityC0466k) obj).f1181e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۡۥ, reason: not valid java name and contains not printable characters */
    public static String m3875(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static C0212r m3876(Object obj) {
        if (C1122.m2810() < 0) {
            return ((C0211q) obj).f682b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static TypedValue m3877(Object obj) {
        if (C1161.m4510() < 0) {
            return ((ContentFrameLayout) obj).getFixedHeightMinor();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static void m3878(Object obj, boolean z2) {
        if (C1164.m4618() >= 0) {
            ((ActionBarContextView) obj).setTitleOptional(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static void m3879(Object obj, Object obj2, int i2, int i3) throws IOException {
        if (C1140.m3595() > 0) {
            ((BufferedOutputStream) obj).write((byte[]) obj2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC0957o0 m3880(Object obj) {
        if (C1138.m3471() > 0) {
            return ((C0658N) obj).f2624t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static Double m3881(double d2) {
        if (C1151.m4000() > 0) {
            return Double.valueOf(d2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static int m3882(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m3883(Object obj) {
        if (C1150.m3967() > 0) {
            return ((C0216v) obj).f719a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۦۢ, reason: not valid java name and contains not printable characters */
    public static Process m3884(Object obj, Object obj2) {
        if (C1163.m4579() >= 0) {
            return ((Runtime) obj).exec((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3885(Object obj) {
        if (C1157.m4271() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2549V;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m3886(Object obj) {
        if (C1170.m4847() >= 0) {
            return ((C0160b) obj).f497a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۥۣۥ, reason: not valid java name and contains not printable characters */
    public static void m3887(Object obj, Object obj2) {
        if (C1121.m2777() > 0) {
            ((AbstractC0165g) obj).m593r((ArrayList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static ViewOnLayoutChangeListenerC0324a m3888(Object obj) {
        if (m1498() < 0) {
            return ((C0325b) obj).f919B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۢۡ, reason: not valid java name and contains not printable characters */
    public static void m3889(boolean z2, Object obj) {
        if (C1161.m4510() < 0) {
            AbstractC0016e.m177h(z2, (String) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۡ */
    public static int m1498() {
        return 97 ^ C1136.f4862;
    }

    /* JADX INFO: renamed from: ۣۡۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3890(Object obj, Object obj2) {
        if (C1156.m4236() >= 0) {
            return ((DialogInterfaceC0666h) obj).m1892i((KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static float m3891(Object obj) {
        if (C1170.m4847() >= 0) {
            return ((RectF) obj).right;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static int m3892(Object obj) {
        if (C1171.m4901() > 0) {
            return ((KeyEvent) obj).getAction();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m3893(Object obj) {
        if (C1142.m3681() <= 0) {
            return ((C0212r) obj).f693i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3894(int i2) {
        if (C1157.m4271() > 0) {
            return C0518H.m1330F(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨۤ۟, reason: not valid java name and contains not printable characters */
    public static void m3895(Object obj, Object obj2) {
        if (C1133.m3246() < 0) {
            ((Window.Callback) obj).onActionModeFinished((ActionMode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥ۠۠۠, reason: contains not printable characters */
    public static void m3896(Object obj) throws IOException {
        if (C1133.m3246() < 0) {
            ((FileOutputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۥۥۣ۠, reason: contains not printable characters */
    public static Context m3898(Object obj) {
        if (C1143.m3711() <= 0) {
            return ((C0658N) obj).f2620p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۣ۟, reason: contains not printable characters */
    public static C0657M m3899(Object obj) {
        if (C1146.m3842() < 0) {
            return ((C0658N) obj).f2628x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۢۥ, reason: contains not printable characters */
    public static int m3900(Object obj) {
        if (C1149.m3923() <= 0) {
            return ((C0216v) obj).f733o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static void m3901(Object obj, Object obj2) {
        if (C1150.m3967() > 0) {
            ((MenuC0816m) obj).m2193r((InterfaceC0828y) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۢۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3902(Object obj) {
        if (C1138.m3471() >= 0) {
            return ((ViewGroup) obj).shouldDelayChildPressedState();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۨۢ, reason: not valid java name and contains not printable characters */
    public static void m3903(Object obj, boolean z2) {
        if (C1155.m4177() >= 0) {
            AbstractC0798m.m2147a((Window.Callback) obj, z2);
        }
    }

    /* JADX INFO: renamed from: ۧۨۤ۠, reason: not valid java name and contains not printable characters */
    public static ImageView m3904(Object obj) {
        if (C1130.m3165() >= 0) {
            return ((C0665g) obj).f2684t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۤۡ, reason: not valid java name and contains not printable characters */
    public static int m3905(Object obj) {
        if (C1175.m5073() >= 0) {
            return ((Configuration) obj).keyboard;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۡۡ, reason: not valid java name and contains not printable characters */
    public static CharSequence m3906(Object obj, int i2) {
        if (C1139.m3541() > 0) {
            return ((TypedArray) obj).getText(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۡۧ, reason: contains not printable characters */
    public static String m3897(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
