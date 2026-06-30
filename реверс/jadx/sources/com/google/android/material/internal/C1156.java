package com.google.android.material.internal;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.lifecycle.C1147;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.datepicker.C1155;
import com.reddit.frontpage.ConfigsActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.X509TrustManager;
import p001A0.AbstractC0016e;
import p001A0.C1121;
import p004C.C1122;
import p011G.C1123;
import p014H0.C1124;
import p015I0.C1125;
import p016J.C0133e;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.AbstractC0213s;
import p023M0.C0199e;
import p023M0.C0214t;
import p023M0.C0216v;
import p024N.C1128;
import p025N0.C1129;
import p025N0.C1130;
import p026O.C0306f;
import p026O.C1132;
import p029P0.C1133;
import p031Q0.C0339m;
import p031Q0.DialogInterfaceOnClickListenerC0329c;
import p031Q0.ViewOnClickListenerC0337k;
import p032R.C1134;
import p036T.AbstractC0383m;
import p037T0.C1135;
import p037T0.C1136;
import p038U.C1137;
import p041V0.C1138;
import p050a0.C1143;
import p052b0.C1151;
import p052b0.C1152;
import p058d0.C1158;
import p060e.C0646B;
import p060e.C0647C;
import p060e.C0657M;
import p060e.C0658N;
import p060e.C0665g;
import p060e.LayoutInflaterFactory2C0648D;
import p066g0.AbstractC0741b0;
import p066g0.C0754i;
import p066g0.C1160;
import p066g0.C1161;
import p068h0.C1162;
import p070i0.C1163;
import p070i0.C1164;
import p072k.C0812i;
import p072k.C1165;
import p074l.C0884K0;
import p074l.C0899S0;
import p074l.C0932g;
import p074l.C0944k;
import p079n0.AbstractC1013a;
import p083p0.C1171;
import p084q.C1172;
import p086r.C1174;
import p098x0.C1179;

/* JADX INFO: renamed from: com.google.android.material.internal.ۤ۟ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1156 {

    /* JADX INFO: renamed from: ۡۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int f4882 = -247;

    /* JADX INFO: renamed from: ۟۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m4190(Object obj) {
        if (C1134.m3300() < 0) {
            return ((C0665g) obj).f2668d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m4191(Object obj) {
        if (C1129.m3120() <= 0) {
            return ConfigsActivity.m1802z((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤۨ, reason: not valid java name and contains not printable characters */
    public static String m4192(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۡۤ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m4193(Object obj) {
        if (C1138.m3471() > 0) {
            return ((MessageDigest) obj).digest();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static C0932g m4194(Object obj) {
        if (C1174.m5008() >= 0) {
            return ((C0944k) obj).f3752t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static C0306f m4195() {
        if (C1123.m2849() > 0) {
            return C0306f.f903n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static int m4196(Object obj) {
        if (C1161.m4510() < 0) {
            return ((Drawable) obj).getIntrinsicHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static int m4197(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static C0812i m4198(Object obj) {
        if (C1146.m3842() < 0) {
            return ((C0647C) obj).f2517i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m4199(Object obj, Object obj2, Object obj3) throws CertificateException {
        if (C1151.m4000() > 0) {
            ((X509TrustManager) obj).checkClientTrusted((X509Certificate[]) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static Object m4200(Object obj) {
        if (C1132.m3217() >= 0) {
            return ((Reference) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۨۤ, reason: not valid java name and contains not printable characters */
    public static TextView m4201(Object obj) {
        if (C1154.m4128() >= 0) {
            return ((C0214t) obj).f712b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4202(Object obj) {
        if (C1123.m2849() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2543P;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۥۤۢ, reason: not valid java name and contains not printable characters */
    public static float m4203(Object obj) {
        if (C1165.m4643() >= 0) {
            return ((C0216v) obj).f731m;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m4204() {
        if (C1128.m3066() > 0) {
            return "ۤ۠۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۧ, reason: not valid java name and contains not printable characters */
    public static C0339m m4205(Object obj) {
        if (C1163.m4579() >= 0) {
            return ((ViewOnClickListenerC0337k) obj).f960b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۠۠, reason: not valid java name and contains not printable characters */
    public static int m4206(Object obj) {
        if (C1172.m4932() <= 0) {
            return ((DialogInterfaceOnClickListenerC0329c) obj).f940a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m4207(Object obj) {
        if (C1132.m3217() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2555b0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4208(Object obj) {
        if (C1130.m3165() >= 0) {
            return ((Iterator) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC0741b0 m4209(Object obj) {
        if (C1136.m3395() < 0) {
            return ((C0754i) obj).f2998a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Drawable m4210(Object obj, Object obj2, int i2, boolean z2) {
        if (C1162.m4523() < 0) {
            return ((C0899S0) obj).m2324g((Context) obj2, i2, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static void m4211(Object obj) {
        if (C1164.m4618() >= 0) {
            ((ValueAnimator) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۠ۡۦۧ, reason: not valid java name and contains not printable characters */
    public static View m4212(Object obj) {
        if (C1174.m5008() > 0) {
            return ((C0647C) obj).f2514f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4213(Object obj) {
        if (C1165.m4643() > 0) {
            return ((C0199e) obj).m643u();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static void m4214(Object obj) {
        if (C1126.m2964() <= 0) {
            ((HttpURLConnection) obj).disconnect();
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m4215(Object obj, int i2, Object obj2) {
        if (C1155.m4177() >= 0) {
            return AbstractC0383m.m1055u((Context) obj, i2, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int[] m4216() {
        if (C1133.m3246() <= 0) {
            return AbstractC1013a.f4012B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۦۥ, reason: not valid java name and contains not printable characters */
    public static C0133e m4217(Object obj) {
        if (C1154.m4128() >= 0) {
            return LayoutInflaterFactory2C0648D.m1830m((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static InputStream m4218(Object obj) {
        if (C1125.m2937() > 0) {
            return ((HttpURLConnection) obj).getErrorStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static Paint m4219(Object obj) {
        if (C1150.m3967() > 0) {
            return ((AbstractC0165g) obj).f534b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢ۟, reason: not valid java name and contains not printable characters */
    public static int m4220(Object obj) {
        if (C1174.m5008() > 0) {
            return ((C0216v) obj).f728j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۧۦ۠, reason: not valid java name and contains not printable characters */
    public static void m4222(Object obj) {
        if (C1143.m3711() <= 0) {
            ((AbstractC0213s) obj).mo641s();
        }
    }

    /* JADX INFO: renamed from: ۣۢۨۧ, reason: not valid java name and contains not printable characters */
    public static AnimatorSet m4223(Object obj) {
        if (C1152.m4038() >= 0) {
            return ((C0216v) obj).f730l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۧ, reason: not valid java name and contains not printable characters */
    public static Parcelable.Creator m4224() {
        if (C1155.m4177() >= 0) {
            return TextUtils.CHAR_SEQUENCE_CREATOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۦۡ, reason: contains not printable characters */
    public static void m4225(Object obj, boolean z2) {
        if (C1171.m4901() > 0) {
            ((C0658N) obj).m1883v0(z2);
        }
    }

    /* JADX INFO: renamed from: ۥۥ */
    public static boolean m1752(Object obj) {
        if (C1158.m4364() <= 0) {
            return AbstractC0016e.m171b0((EditText) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ۡ۠, reason: contains not printable characters */
    public static C0133e m4226(Object obj) {
        if (C1130.m3165() >= 0) {
            return C0133e.m512b((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۥۥ, reason: contains not printable characters */
    public static void m4227(Object obj, Object obj2, boolean z2) {
        if (C1160.m4437() <= 0) {
            ((LayoutInflaterFactory2C0648D) obj).m1854p((C0647C) obj2, z2);
        }
    }

    /* JADX INFO: renamed from: ۦۥ۠ۤ, reason: contains not printable characters */
    public static void m4228(Object obj) {
        if (C1147.m1498() < 0) {
            super/*android.app.Activity*/.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: ۦۥ۠ۧ, reason: contains not printable characters */
    public static Context m4229(Object obj) {
        if (C1135.m3328() > 0) {
            return ((C0657M) obj).f2600c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۧۧ, reason: not valid java name and contains not printable characters */
    public static void m4230(Object obj) {
        if (C1126.m2964() <= 0) {
            ((AbstractC0165g) obj).m598w();
        }
    }

    /* JADX INFO: renamed from: ۧۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m4231(Object obj) {
        if (C1124.m2896() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2553Z;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static C0646B m4232(Object obj) {
        if (C1122.m2810() < 0) {
            return ((C0647C) obj).f2513e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4233(Object obj, Object obj2) {
        if (C1121.m2777() >= 0) {
            return ((Window.Callback) obj).dispatchKeyEvent((KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧۥ۟, reason: not valid java name and contains not printable characters */
    public static void m4234(Object obj) {
        if (C1147.m1498() < 0) {
            ((C0884K0) obj).dismiss();
        }
    }

    /* JADX INFO: renamed from: ۨ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4235(Object obj, int i2, Object obj2) {
        if (C1137.m3457() <= 0) {
            return ((Window.Callback) obj).onMenuItemSelected(i2, (MenuItem) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۦ۟, reason: not valid java name and contains not printable characters */
    public static int m4236() {
        return (-779) ^ C1179.f4922;
    }

    /* JADX INFO: renamed from: ۣۢۤۨ, reason: not valid java name and contains not printable characters */
    public static String m4221(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
