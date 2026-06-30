package p096w0;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Parcel;
import android.view.Menu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.emoji2.text.AbstractC0493g;
import androidx.emoji2.text.C0507u;
import androidx.fragment.app.C0518H;
import androidx.lifecycle.EnumC0580l;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.math.BigDecimal;
import java.math.MathContext;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import p004C.C1122;
import p011G.AbstractC0092a;
import p015I0.C1125;
import p016J.C0133e;
import p023M0.C0207m;
import p023M0.C0212r;
import p025N0.C1130;
import p025N0.C1131;
import p037T0.C1135;
import p041V0.C1138;
import p044X.C0406a;
import p044X.C1140;
import p045X0.C1141;
import p050a0.C1142;
import p051a1.C1145;
import p052b0.C1152;
import p057d.AbstractC0641a;
import p058d0.C0643;
import p060e.C0665g;
import p060e.C0667i;
import p060e.WindowCallbackC0683y;
import p068h0.C1162;
import p070i0.C1164;
import p072k.C0811h;
import p072k.ViewOnKeyListenerC0810g;
import p074l.InterfaceC0957o0;
import p081o0.C1170;
import p083p0.C1171;
import p084q.C1173;
import p086r.C1174;
import p089t.C1175;
import p092u0.C1176;
import p098x0.C1179;
import p100z.C1180;

/* JADX INFO: renamed from: w0.ۨ۟ۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1177 {

    /* JADX INFO: renamed from: ۟۟ۢۨۥ, reason: not valid java name and contains not printable characters */
    public static int f4920 = 651;

    /* JADX INFO: renamed from: ۟۟ */
    public static String m2694(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static TimeInterpolator m5122(Object obj) {
        if (C1171.m4901() >= 0) {
            return ((C0207m) obj).f665g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m5123() {
        if (C1140.m3595() >= 0) {
            return "ۤۤۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static C0406a m5124(Object obj) {
        if (C1164.m4618() > 0) {
            return ((C0507u) obj).m1322b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m5125(Object obj) {
        if (C1180.m5241() < 0) {
            return ((C0665g) obj).f2669e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۦۨ, reason: not valid java name and contains not printable characters */
    public static View.OnLongClickListener m5126(Object obj) {
        if (C1131.m3177() < 0) {
            return ((C0212r) obj).f699o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5127(Object obj) {
        if (C1141.m3607() >= 0) {
            return ((Thread) obj).isInterrupted();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m5128(Object obj) {
        if (C1179.m5236() > 0) {
            return ((View) obj).getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۥۣ, reason: not valid java name and contains not printable characters */
    public static String m5129() {
        if (C1152.m4038() >= 0) {
            return "ۤۡ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int[] m5130() {
        if (C1122.m2810() <= 0) {
            return AbstractC0641a.f2480a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5132(Object obj) {
        if (C1142.m3681() < 0) {
            return ((File) obj).mkdirs();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠۠, reason: not valid java name and contains not printable characters */
    public static void m5133(Object obj) {
        if (C1146.m3842() <= 0) {
            ((C0518H) obj).m1368k();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static HttpURLConnection m5134(Object obj) {
        if (C1138.m3471() > 0) {
            return MainActivity.m1812B((URL) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۨۢ, reason: not valid java name and contains not printable characters */
    public static ViewConfiguration m5135(Object obj) {
        if (C1176.m5115() <= 0) {
            return ViewConfiguration.get((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5136(Object obj, Object obj2) {
        if (C1145.m3805() < 0) {
            return ((String) obj).endsWith((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m5137(Object obj, int i2) {
        if (C1154.m4128() > 0) {
            ((AccessibilityNodeInfo) obj).setMaxTextLength(i2);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۣۢ, reason: not valid java name and contains not printable characters */
    public static int m5138(Object obj) {
        if (C1125.m2937() >= 0) {
            return ((View) obj).getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static int m5139(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static EnumC0580l m5140() {
        if (C1156.m4236() > 0) {
            return EnumC0580l.ON_START;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5141(Object obj, Object obj2) {
        if (C1155.m4177() > 0) {
            return ((C0133e) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int m5142(Object obj) {
        if (C1130.m3165() > 0) {
            return ((C0207m) obj).f663e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m5143(Object obj) {
        if (C1179.m5236() > 0) {
            return ((AbstractC0493g) obj).f1517b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m5144() {
        if (C1175.m5073() > 0) {
            return "۠ۥۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m5145(Object obj) {
        if (C1142.m3681() <= 0) {
            return ((C0811h) obj).getCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m5146(Object obj) {
        if (C1162.m4523() < 0) {
            return ((ViewOnKeyListenerC0810g) obj).f3285h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۥۤ, reason: not valid java name and contains not printable characters */
    public static Object m5147(Object obj) {
        if (C1180.m5241() < 0) {
            return ((C0667i) obj).f2695b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۧۤ, reason: contains not printable characters */
    public static void m5148(Object obj, Object obj2) {
        if (C1170.m4847() >= 0) {
            AbstractC0092a.m429h((Drawable) obj, (ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۤۦۢ, reason: contains not printable characters */
    public static ArrayList m5149(Object obj, Object obj2) {
        if (C0643.m4322() <= 0) {
            return ((Parcel) obj).readArrayList((ClassLoader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۢ, reason: contains not printable characters */
    public static InterfaceC0957o0 m5150(Object obj) {
        if (C1125.m2937() > 0) {
            return ((Toolbar) obj).getWrapper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۧۡ, reason: contains not printable characters */
    public static boolean m5151(Object obj, Object obj2) {
        if (C1130.m3165() > 0) {
            return ((Matrix) obj).preConcat((Matrix) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۤ۟ۥ, reason: contains not printable characters */
    public static int m5152() {
        return (-811) ^ C1179.f4922;
    }

    /* JADX INFO: renamed from: ۦۤۨ, reason: contains not printable characters */
    public static BigDecimal m5153(Object obj, Object obj2, Object obj3) {
        if (C1180.m5241() <= 0) {
            return ((BigDecimal) obj).divide((BigDecimal) obj2, (MathContext) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۤ, reason: contains not printable characters */
    public static void m5154(Object obj, boolean z2) {
        if (C1173.m4990() <= 0) {
            ((ProgressBar) obj).setIndeterminate(z2);
        }
    }

    /* JADX INFO: renamed from: ۧۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static View m5155(Object obj) {
        if (C1171.m4901() > 0) {
            return ((ViewStubCompat) obj).m1240a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5156(Object obj, Object obj2) {
        if (C1130.m3165() > 0) {
            return ((LocationManager) obj).isProviderEnabled((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static String m5157(double d2) {
        if (C1141.m3607() > 0) {
            return Double.toString(d2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m5158(Object obj, int i2, Object obj2) {
        if (C1150.m3967() > 0) {
            ((WindowCallbackC0683y) obj).m1917c(i2, (Menu) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۢۢ, reason: not valid java name and contains not printable characters */
    public static void m5159(Object obj, Object obj2) {
        if (C1174.m5008() > 0) {
            ((View) obj).removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۨۥۥ, reason: not valid java name and contains not printable characters */
    public static void m5160(Object obj) {
        if (C1135.m3328() > 0) {
            ((Activity) obj).recreate();
        }
    }

    /* JADX INFO: renamed from: ۨۨۨۡ, reason: not valid java name and contains not printable characters */
    public static String m5161() {
        if (C1154.m4128() >= 0) {
            return "۟۠ۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m5131(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
