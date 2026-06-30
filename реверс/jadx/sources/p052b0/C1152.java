package p052b0;

import android.animation.Animator;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.method.KeyListener;
import android.view.LayoutInflater;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.fragment.app.AbstractC0537g;
import androidx.profileinstaller.C1148;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.ConfigsActivity;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.X509TrustManager;
import p019K0.AbstractC0165g;
import p025N0.C1129;
import p025N0.C1130;
import p026O.C0311k;
import p026O.C1132;
import p029P0.C0325b;
import p031Q0.C0336j;
import p032R.C1134;
import p037T0.C1135;
import p050a0.C1142;
import p050a0.C1143;
import p051a1.C1145;
import p060e.C0647C;
import p060e.C0656L;
import p060e.C0665g;
import p060e.LayoutInflaterFactory2C0648D;
import p065g.C1159;
import p066g0.C1161;
import p070i0.C1164;
import p071j.AbstractC0796k;
import p072k.C1165;
import p073k0.C1166;
import p074l.C0956o;
import p084q.C1172;
import p089t.C1175;
import p092u0.C1176;
import p096w0.C1177;
import p097x.C1178;

/* JADX INFO: renamed from: b0.ۣۣ۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1152 {

    /* JADX INFO: renamed from: ۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int f4878 = 683;

    /* JADX INFO: renamed from: ۟۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static C0336j m4024(Object obj, Object obj2, Object obj3) {
        if (C1164.m4618() > 0) {
            return ((MainActivity) obj).m1826u((String) obj2, (File) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۧۡ, reason: not valid java name and contains not printable characters */
    public static List m4025() {
        if (C1176.m5115() < 0) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m4026(Object obj) {
        if (C1165.m4643() >= 0) {
            return ((AbstractC0165g) obj).f515G;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static void m4027(Object obj, Object obj2) {
        if (C1156.m4236() > 0) {
            ((C0956o) obj).setKeyListener((KeyListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4028(String str) {
        String string = "";
        int i2 = 0;
        String str2 = "";
        while (i2 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i2)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i2).toString();
            i2++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static void m4029(Object obj, int i2) {
        if (C1161.m4510() < 0) {
            ((PopupWindow) obj).setInputMethodMode(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4030(Object obj, Object obj2) {
        if (C1175.m5073() >= 0) {
            return ((CopyOnWriteArrayList) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4031(Object obj) {
        if (C1155.m4177() > 0) {
            return ((View) obj).isFocused();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦۡ, reason: not valid java name and contains not printable characters */
    public static void m4032(Object obj, Object obj2) {
        if (C1155.m4177() > 0) {
            ((Drawable) obj).setBounds((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m4033(Object obj, int i2) {
        if (C1148.m3908() >= 0) {
            ((View) obj).setMinimumHeight(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢۦۥ, reason: not valid java name and contains not printable characters */
    public static List m4034(Object obj) {
        if (C1159.m4411() >= 0) {
            return ((AbstractC0165g) obj).getValues();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static void m4035(Object obj, long j2) {
        if (C1178.m5174() <= 0) {
            ((Animator) obj).setStartDelay(j2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m4036(Object obj) {
        if (C1130.m3165() >= 0) {
            ((Activity) obj).finish();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢ۟۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m4037(Object obj) {
        if (C1145.m3805() <= 0) {
            return ((C0665g) obj).f2674j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۦۤ, reason: not valid java name and contains not printable characters */
    public static int m4038() {
        return 8 ^ C1177.f4920;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m4039(Object obj, Object obj2, int i2) {
        if (C1143.m3711() <= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).m1835C((Context) obj2, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static X509Certificate[] m4040(Object obj) {
        if (C1142.m3681() < 0) {
            return ((X509TrustManager) obj).getAcceptedIssuers();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static int m4041(Object obj) {
        if (C1172.m4932() < 0) {
            return ((C0656L) obj).f2598k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡ۠۠, reason: not valid java name and contains not printable characters */
    public static InputStream m4042(Object obj, Object obj2) {
        if (C1151.m4000() > 0) {
            return ((ContentResolver) obj).openInputStream((Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۧۢ, reason: not valid java name and contains not printable characters */
    public static URLConnection m4044(Object obj) {
        if (C1130.m3165() >= 0) {
            return ((URL) obj).openConnection();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static LayoutInflater m4045(Object obj) {
        if (C1176.m5115() <= 0) {
            return LayoutInflater.from((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۥۣ, reason: not valid java name and contains not printable characters */
    public static void m4046(Object obj, int i2) {
        if (C1129.m3120() <= 0) {
            ((AbstractC0165g) obj).setHaloRadius(i2);
        }
    }

    /* JADX INFO: renamed from: ۢۦۡ, reason: not valid java name and contains not printable characters */
    public static int m4047(Object obj) {
        if (C1134.m3300() <= 0) {
            return ((C0325b) obj).getIntrinsicWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۡۢ۠, reason: not valid java name and contains not printable characters */
    public static int m4048(Object obj) {
        if (C1161.m4510() < 0) {
            return ((C0647C) obj).f2512d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۤۦ۟, reason: not valid java name and contains not printable characters */
    public static int m4049(Object obj) {
        if (C1154.m4128() > 0) {
            return ((AbstractC0537g) obj).mo1429f();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۢ۟, reason: not valid java name and contains not printable characters */
    public static EditText m4050(Object obj) {
        if (C1164.m4618() > 0) {
            return ((TextInputLayout) obj).getEditText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۨ, reason: contains not printable characters */
    public static ArrayList m4051(Object obj, Object obj2) {
        if (C1132.m3217() > 0) {
            return ((ConfigsActivity) obj).m1803A((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۤ۠, reason: contains not printable characters */
    public static boolean m4052(Object obj, Object obj2) {
        if (C1161.m4510() < 0) {
            return AbstractC0796k.m2144a((Window.Callback) obj, (SearchEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ۤۤ, reason: contains not printable characters */
    public static boolean m4053(Object obj, Object obj2) {
        if (C1135.m3328() >= 0) {
            return ((ArrayList) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ۧۧ, reason: contains not printable characters */
    public static int m4054(Object obj) {
        if (C1176.m5115() < 0) {
            return ((AbstractC0165g) obj).f573v;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۣۦ, reason: not valid java name and contains not printable characters */
    public static int m4055(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۡۤۥ, reason: not valid java name and contains not printable characters */
    public static void m4056(Object obj, Object obj2) {
        if (C1129.m3120() <= 0) {
            ((C0311k) obj).m977k((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۥۣۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4057(Object obj) {
        if (C1176.m5115() <= 0) {
            return ((ViewTreeObserver) obj).isAlive();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۤ۟, reason: not valid java name and contains not printable characters */
    public static List m4058(Object obj) {
        if (C1166.m4699() > 0) {
            return ((AbstractC0165g) obj).f565q0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۤۢ, reason: not valid java name and contains not printable characters */
    public static String m4043(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
