package p072k;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Paint;
import android.net.Uri;
import android.util.TypedValue;
import android.view.ContentInfo;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.emoji2.text.C0504r;
import androidx.emoji2.text.C0507u;
import androidx.profileinstaller.C1148;
import androidx.startup.C1149;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.slider.Slider;
import com.google.android.material.snackbar.C1157;
import com.reddit.frontpage.ConfigsActivity;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import p000A.C0010k;
import p001A0.C1121;
import p014H0.C1124;
import p019K0.AbstractC0165g;
import p019K0.ViewTreeObserverOnScrollChangedListenerC0159a;
import p023M0.C0207m;
import p025N0.C1129;
import p025N0.C1131;
import p029P0.C1133;
import p031Q0.C0349w;
import p031Q0.RunnableC0328b;
import p031Q0.RunnableC0334h;
import p037T0.C1135;
import p042W.AbstractC0401b;
import p042W.C1139;
import p044X.C1140;
import p045X0.C1141;
import p051a1.C1145;
import p052b0.C1151;
import p052b0.C1152;
import p058d0.C0643;
import p060e.AbstractActivityC0669k;
import p060e.AbstractC0676r;
import p060e.C0654J;
import p060e.C0657M;
import p060e.C0658N;
import p060e.C0679u;
import p060e.LayoutInflaterFactory2C0648D;
import p066g0.C1161;
import p068h0.C1162;
import p071j.AbstractC0786a;
import p071j.C0795j;
import p073k0.C1167;
import p074l.C0944k;
import p075l0.C1168;
import p086r.C1174;
import p096w0.C1177;
import p097x.C1178;
import p100z.C1180;

/* JADX INFO: renamed from: k.۟ۢۡۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1165 {

    /* JADX INFO: renamed from: ۟ۢۥ۟۟, reason: not valid java name and contains not printable characters */
    public static int f4908 = -248;

    /* JADX INFO: renamed from: ۟۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m4642(Object obj) {
        if (C1180.m5241() < 0) {
            ((AbstractActivityC0669k) obj).m1899q();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static int m4643() {
        return (-429) ^ C1149.f4875;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4644(Object obj) {
        if (C1177.m5152() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2538K;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static TextView m4645(Object obj) {
        if (C1180.m5241() < 0) {
            return ((MainActivity) obj).f2466A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۠۟, reason: not valid java name and contains not printable characters */
    public static C0654J m4646() {
        if (C1174.m5008() > 0) {
            return C0654J.f2592d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m4647(Object obj) {
        if (C1139.m3541() >= 0) {
            ((AbstractActivityC0669k) obj).m1898p();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static void m4648(Object obj, boolean z2) {
        if (C1167.m4739() <= 0) {
            ((View) obj).setActivated(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static Slider m4649(Object obj) {
        if (C1161.m4510() < 0) {
            return ((ViewTreeObserverOnScrollChangedListenerC0159a) obj).f496a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static C0658N m4650(Object obj) {
        if (C1141.m3607() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2566o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m4651(Object obj, Object obj2) {
        if (C1178.m5174() < 0) {
            ((PopupWindow) obj).setContentView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4652(Object obj, Object obj2, Object obj3) {
        if (C1133.m3246() <= 0) {
            return ((C0010k) obj).m91l((AbstractC0786a) obj2, (MenuC0816m) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static void m4653(Object obj) {
        if (C1161.m4510() <= 0) {
            ((AnimatorSet) obj).end();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۡ۟, reason: not valid java name and contains not printable characters */
    public static void m4654(Object obj, Object obj2) {
        if (C1151.m4000() > 0) {
            ((ContentInfo.Builder) obj).setLinkUri((Uri) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4655(Object obj, Object obj2) {
        if (C1129.m3120() < 0) {
            return ((AbstractC0401b) obj).m1107m((MotionEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۢۨۥ, reason: not valid java name and contains not printable characters */
    public static void m4656(Object obj) {
        if (C1131.m3177() < 0) {
            ((C0795j) obj).m2143b();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟۠, reason: not valid java name and contains not printable characters */
    public static void m4657(Object obj) {
        if (C1151.m4000() >= 0) {
            ((AbstractC0676r) obj).mo1842a();
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m4659(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((C0679u) obj).f2722k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static int m4660(Object obj) {
        if (C1161.m4510() < 0) {
            return ((RunnableC0328b) obj).f937a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m4661(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۢۡۡۦ, reason: not valid java name and contains not printable characters */
    public static MaterialButton m4662(Object obj) {
        if (C1152.m4038() >= 0) {
            return ((ConfigsActivity) obj).f2459E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۥ, reason: not valid java name and contains not printable characters */
    public static int m4663(Object obj) {
        if (C1140.m3595() >= 0) {
            return ((RunnableC0334h) obj).f951a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0827x m4664(Object obj) {
        if (C1124.m2896() >= 0) {
            return ((C0944k) obj).f3737e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۥۢ, reason: not valid java name and contains not printable characters */
    public static void m4665(Object obj, int i2, Object obj2) {
        if (C1151.m4000() > 0) {
            ((ArrayList) obj).add(i2, obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m4666(Object obj) {
        if (C1145.m3805() < 0) {
            ((LayoutInflaterFactory2C0648D) obj).m1841I();
        }
    }

    /* JADX INFO: renamed from: ۤۢۦ۠, reason: not valid java name and contains not printable characters */
    public static void m4667(Object obj, int i2) {
        if (C1135.m3328() > 0) {
            ((ViewGroup.MarginLayoutParams) obj).setMarginEnd(i2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۧۨ, reason: not valid java name and contains not printable characters */
    public static void m4668(Object obj, Object obj2) {
        if (C1129.m3120() <= 0) {
            ((ViewTreeObserver) obj).removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۥ۠, reason: contains not printable characters */
    public static ValueAnimator m4669(Object obj) {
        if (C1157.m4271() > 0) {
            return ((C0207m) obj).f676r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۦۨ, reason: contains not printable characters */
    public static void m4670(Object obj, Object obj2, int i2, int i3) {
        if (C0643.m4322() < 0) {
            ((C0504r) obj).m1315a((C0507u) obj2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۥۥۥۤ, reason: contains not printable characters */
    public static MenuC0816m m4671(Object obj) {
        if (C1157.m4271() >= 0) {
            return ((C0657M) obj).f2601d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨ۟, reason: contains not printable characters */
    public static int m4672(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۢۢۡ, reason: contains not printable characters */
    public static boolean m4673(Object obj) {
        if (C1140.m3595() >= 0) {
            return ((ActionBarContextView) obj).f1312s;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۥۣ, reason: contains not printable characters */
    public static String m4674() {
        if (C1140.m3595() > 0) {
            return "ۥۢۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4675(Object obj, int i2, Object obj2) {
        if (C1152.m4038() > 0) {
            return ((TypedArray) obj).getValue(i2, (TypedValue) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Paint m4676(Object obj) {
        if (C1168.m4797() <= 0) {
            return ((AbstractC0165g) obj).f540e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۧ۟, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m4677(Object obj, Object obj2) {
        if (C1148.m3908() > 0) {
            return ((WindowInsets.Builder) obj).setStableInsets((Insets) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m4678(Object obj) {
        if (C1162.m4523() < 0) {
            return ((C0349w) obj).f989a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m4658(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
