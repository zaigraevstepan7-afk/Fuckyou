package p066g0;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Adapter;
import android.widget.AutoCompleteTextView;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.lifecycle.C1147;
import androidx.profileinstaller.C1148;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.ConfigsActivity;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import p001A0.AbstractC0016e;
import p001A0.C1121;
import p004C.AbstractC0027h;
import p005C0.C0048n;
import p009F.AbstractC0074a;
import p011G.C1123;
import p012G0.AbstractC0102d;
import p015I0.C1125;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.AbstractC0213s;
import p023M0.C0190C;
import p023M0.C0199e;
import p023M0.C0212r;
import p023M0.C0216v;
import p023M0.C0219y;
import p023M0.RunnableC0191D;
import p024N.C0270l;
import p024N.C1128;
import p025N0.C1129;
import p025N0.C1131;
import p026O.C1132;
import p029P0.C1133;
import p031Q0.ViewOnClickListenerC0337k;
import p037T0.C1135;
import p038U.C1137;
import p041V0.C1138;
import p044X.C1140;
import p045X0.C1141;
import p050a0.C1143;
import p051a1.C1144;
import p058d0.C1158;
import p060e.C0657M;
import p060e.LayoutInflaterFactory2C0648D;
import p070i0.C1163;
import p072k.C1165;
import p072k.MenuC0816m;
import p073k0.InterfaceC0847k;
import p074l.AbstractC0970s1;
import p074l.C0927e0;
import p077m0.C1169;
import p081o0.C1170;
import p084q.C1172;
import p092u0.C1176;
import p096w0.C1092c;
import p096w0.C1177;

/* JADX INFO: renamed from: g0.ۢ۠ۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1160 {

    /* JADX INFO: renamed from: ۦۣۨ, reason: contains not printable characters */
    public static int f4903 = -579;

    /* JADX INFO: renamed from: ۟۟۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m4436(Object obj) {
        if (C1143.m3711() < 0) {
            return ((C0199e) obj).f646f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static int m4437() {
        return (-625) ^ C1172.f4915;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4438(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2532E;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static long m4439(Object obj) {
        if (C1154.m4128() >= 0) {
            return ((HttpURLConnection) obj).getContentLengthLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static Object m4440(Object obj) {
        if (C1132.m3217() >= 0) {
            return ((RunnableC0191D) obj).f633b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static CheckableImageButton m4441(Object obj) {
        if (C1137.m3457() < 0) {
            return ((C0212r) obj).f691g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static String m4442(String str) {
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

    /* JADX INFO: renamed from: ۣ۟۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static View m4443(Object obj, int i2, Object obj2) {
        if (C1138.m3471() >= 0) {
            return ((LayoutInflater) obj).inflate(i2, (ViewGroup) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۥ, reason: not valid java name and contains not printable characters */
    public static C0048n m4444(Object obj) {
        if (C1163.m4579() > 0) {
            return ((C0657M) obj).f2602e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m4445(Object obj) {
        if (C1147.m1498() <= 0) {
            ((View) obj).invalidate();
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m4446(Object obj) {
        if (C1176.m5115() < 0) {
            return ((AbstractC0213s) obj).mo634d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤۧ۠, reason: not valid java name and contains not printable characters */
    public static void m4447(Object obj, Object obj2, int i2, int i3) throws IOException {
        if (C1170.m4847() >= 0) {
            ((FileOutputStream) obj).write((byte[]) obj2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static TimeInterpolator m4448(Object obj) {
        if (C1165.m4643() > 0) {
            return ((C0216v) obj).f724f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4449(Object obj, Object obj2, int i2) {
        if (C1144.m3748() <= 0) {
            return AbstractC0016e.m161J((Context) obj, (C0270l) obj2, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m4450(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۡۥۥ, reason: not valid java name and contains not printable characters */
    public static Resources.Theme m4451(Object obj) {
        if (C1147.m1498() <= 0) {
            return ((Context) obj).getTheme();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۨ, reason: not valid java name and contains not printable characters */
    public static void m4452(Object obj, Object obj2) {
        if (C1135.m3328() > 0) {
            AbstractC0027h.m237d((Context) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4453(Object obj, Object obj2, Object obj3) {
        if (C1169.m4842() <= 0) {
            return ((C0216v) obj).m683h((C0927e0) obj2, (CharSequence) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۡ, reason: not valid java name and contains not printable characters */
    public static void m4454(Object obj) {
        if (C1131.m3177() < 0) {
            ((MenuC0816m) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۦۨ, reason: not valid java name and contains not printable characters */
    public static View m4455(Object obj, int i2, Object obj2, Object obj3) {
        if (C1138.m3471() >= 0) {
            return ((Adapter) obj).getView(i2, (View) obj2, (ViewGroup) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m4456(Object obj, int i2, Object obj2, int i3, int i4) {
        if (C1125.m2937() > 0) {
            System.arraycopy(obj, i2, obj2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۠ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static View m4457(Object obj) {
        if (C1141.m3607() >= 0) {
            return ((ViewStub) obj).inflate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4458() {
        if (C1123.m2849() >= 0) {
            return AbstractC0970s1.f3845a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۢ, reason: not valid java name and contains not printable characters */
    public static void m4459(long j2) throws InterruptedException {
        if (C1157.m4271() > 0) {
            Thread.sleep(j2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۧۧ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4460(Object obj) {
        if (C1140.m3595() > 0) {
            return ((C0219y) obj).f757l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static String m4461(Object obj) {
        if (C1148.m3908() >= 0) {
            return ConfigsActivity.m1798C((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ */
    public static int[] m2123() {
        if (C1172.m4932() <= 0) {
            return AbstractC0102d.f301a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۠, reason: not valid java name and contains not printable characters */
    public static int[] m4462(Object obj) {
        if (C1146.m3842() < 0) {
            return ((C1092c) obj).f4510s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۣۥ, reason: not valid java name and contains not printable characters */
    public static void m4463(Object obj) {
        if (C1133.m3246() < 0) {
            ((ThreadPoolExecutor) obj).shutdown();
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static TimeInterpolator m4464(Object obj) {
        if (C1128.m3066() >= 0) {
            return ((C0216v) obj).f722d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۧ, reason: not valid java name and contains not printable characters */
    public static void m4465(Object obj) {
        if (C1158.m4364() <= 0) {
            ((InterfaceC0847k) obj).mo2212c();
        }
    }

    /* JADX INFO: renamed from: ۤۧۤ۟, reason: not valid java name and contains not printable characters */
    public static float m4466(Object obj) {
        if (C1132.m3217() >= 0) {
            return ((AbstractC0165g) obj).f530V;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۧۤۦ, reason: not valid java name and contains not printable characters */
    public static void m4467(Object obj, Object obj2, float f, float f2, Object obj3) {
        if (C1126.m2964() < 0) {
            ((Canvas) obj).drawRoundRect((RectF) obj2, f, f2, (Paint) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۥ۟, reason: contains not printable characters */
    public static Object m4468(Object obj, Object obj2) {
        if (C1123.m2849() > 0) {
            return ((Map) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ */
    public static String m2124() {
        if (C1128.m3066() >= 0) {
            return Build.CPU_ABI;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۦۣ, reason: contains not printable characters */
    public static void m4470(Object obj) {
        if (C1129.m3120() <= 0) {
            ((AutoCompleteTextView) obj).dismissDropDown();
        }
    }

    /* JADX INFO: renamed from: ۨ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m4471(Object obj) {
        if (C1150.m3967() >= 0) {
            return ((ViewOnClickListenerC0337k) obj).f959a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۢ۟۟, reason: not valid java name and contains not printable characters */
    public static int m4472(int i2, int i3) {
        if (C1126.m2964() < 0) {
            return AbstractC0074a.m356e(i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۣ۟, reason: not valid java name and contains not printable characters */
    public static TextInputLayout m4473(Object obj) {
        if (C1177.m5152() >= 0) {
            return ((C0190C) obj).f631c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۟۠, reason: contains not printable characters */
    public static String m4469(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
