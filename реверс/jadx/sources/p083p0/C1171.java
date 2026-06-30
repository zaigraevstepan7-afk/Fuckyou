package p083p0;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.location.Location;
import android.text.Editable;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.EditText;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.fragment.app.AbstractComponentCallbacksC0548r;
import androidx.fragment.app.C0518H;
import androidx.fragment.app.C0520J;
import androidx.startup.C1149;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.MainActivity;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import p001A0.AbstractC0016e;
import p001A0.C1121;
import p004C.C1122;
import p017J0.C0144e;
import p019K0.AbstractC0165g;
import p024N.C1128;
import p025N0.C1129;
import p025N0.C1130;
import p029P0.C1133;
import p032R.C1134;
import p036T.C0371a;
import p038U.C1137;
import p044X.C1140;
import p045X0.C1141;
import p050a0.C1143;
import p052b0.C1152;
import p058d0.C1158;
import p060e.C0655K;
import p060e.C0665g;
import p060e.DialogInterfaceC0666h;
import p060e.LayoutInflaterFactory2C0648D;
import p060e.WindowCallbackC0683y;
import p066g0.C1160;
import p066g0.C1161;
import p068h0.C1162;
import p070i0.C1163;
import p072k.C0811h;
import p072k.C0812i;
import p074l.C0899S0;
import p081o0.C1170;
import p086r.C1174;
import p089t.C1175;
import p098x0.C1179;

/* JADX INFO: renamed from: p0.ۣۧۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1171 {

    /* JADX INFO: renamed from: ۣ۟ۤۨۥ, reason: not valid java name and contains not printable characters */
    public static int f4914 = 613;

    /* JADX INFO: renamed from: ۟۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static void m4897(Object obj, Object obj2) {
        if (C1137.m3457() < 0) {
            ((C0899S0) obj).m2327l((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m4898(Object obj) {
        if (C1134.m3300() < 0) {
            ((LayoutInflaterFactory2C0648D) obj).m1857t();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۤ۠, reason: not valid java name and contains not printable characters */
    public static void m4899(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C1160.m4437() < 0) {
            AbstractC0016e.m172d((TextInputLayout) obj, (CheckableImageButton) obj2, (ColorStateList) obj3, (PorterDuff.Mode) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۨۡ, reason: not valid java name and contains not printable characters */
    public static int m4900(Object obj) {
        if (C1128.m3066() > 0) {
            return ((C0144e) obj).f454b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢۥ۠, reason: not valid java name and contains not printable characters */
    public static int m4901() {
        return 807 ^ C1129.f4844;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static Editable m4902(Object obj) {
        if (C1143.m3711() < 0) {
            return ((EditText) obj).getText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m4903(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4904(Object obj, Object obj2) {
        if (C1140.m3595() > 0) {
            return ((ArrayList) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4905(Object obj) {
        if (C1133.m3246() < 0) {
            return ((WindowCallbackC0683y) obj).f2725b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4906(Object obj) {
        if (C1163.m4579() >= 0) {
            return ((C0655K) obj).f2596a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static void m4907(Object obj, Object obj2) {
        if (C1160.m4437() < 0) {
            ((IntentFilter) obj).addAction((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4908(Object obj, Object obj2) {
        if (C1140.m3595() >= 0) {
            return ((ArrayList) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static C0811h m4909(Object obj) {
        if (C1152.m4038() >= 0) {
            return ((C0812i) obj).f3311f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m4910(Object obj, int i2, int i3, int i4, int i5) {
        if (C1158.m4364() < 0) {
            return ((WindowInsets) obj).inset(i2, i3, i4, i5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m4911(Object obj, float f) {
        if (C1170.m4847() >= 0) {
            ((AbstractC0165g) obj).setThumbStrokeWidth(f);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۨۢ, reason: not valid java name and contains not printable characters */
    public static void m4912(Object obj) throws IOException {
        if (C1141.m3607() >= 0) {
            ((BufferedOutputStream) obj).flush();
        }
    }

    /* JADX INFO: renamed from: ۠ۥ۟۠, reason: not valid java name and contains not printable characters */
    public static String m4913(long j2) {
        if (C1141.m3607() > 0) {
            return MainActivity.m1818v(j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m4914() {
        if (C1179.m5236() > 0) {
            return "ۤۦ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4915(Object obj) {
        if (C1161.m4510() <= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2544Q;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m4916(Object obj, Object obj2) {
        if (C1149.m3923() < 0) {
            ((DialogInterfaceC0666h) obj).m1891h((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۦۣ, reason: not valid java name and contains not printable characters */
    public static C0518H m4917(Object obj) {
        if (C1130.m3165() >= 0) {
            return ((AbstractComponentCallbacksC0548r) obj).f1796t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۦۢ, reason: contains not printable characters */
    public static String m4918() {
        if (C1175.m5073() > 0) {
            return "۟ۥۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۤ, reason: contains not printable characters */
    public static float m4919(Object obj, long j2) {
        if (C1122.m2810() < 0) {
            return ((C0371a) obj).m1002a(j2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦ۠ۥۦ, reason: contains not printable characters */
    public static void m4920(Object obj, Object obj2) {
        if (C1174.m5008() >= 0) {
            ((C0520J) obj).m1387d((AbstractComponentCallbacksC0548r) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣ۠, reason: contains not printable characters */
    public static int m4921(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((C0665g) obj).f2690z;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۨۤ, reason: not valid java name and contains not printable characters */
    public static float m4923(Object obj) {
        if (C1162.m4523() <= 0) {
            return ((RectF) obj).width();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧۨۤۢ, reason: not valid java name and contains not printable characters */
    public static Window m4924(Object obj) {
        if (C1121.m2777() > 0) {
            return ((Activity) obj).getWindow();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۦۢ, reason: not valid java name and contains not printable characters */
    public static double m4925(Object obj) {
        if (C1146.m3842() <= 0) {
            return ((Location) obj).getLatitude();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static int m4926(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۤۥۥ, reason: not valid java name and contains not printable characters */
    public static String m4922(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
