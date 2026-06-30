package p086r;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.fragment.app.AbstractC0529T;
import androidx.fragment.app.AnimationAnimationListenerC0535e;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import org.json.JSONObject;
import p001A0.C1121;
import p004C.C1122;
import p014H0.C1124;
import p015I0.C1125;
import p023M0.AbstractC0213s;
import p023M0.C0212r;
import p023M0.C0216v;
import p023M0.C0219y;
import p023M0.C1127;
import p024N.AbstractC0240S;
import p024N.C0258f;
import p024N.C0270l;
import p025N0.C1131;
import p031Q0.RunnableC0345s;
import p037T0.C1135;
import p041V0.C1138;
import p042W.AbstractC0401b;
import p050a0.C1142;
import p051a1.C1144;
import p052b0.C1151;
import p052b0.C1152;
import p058d0.C1158;
import p060e.AbstractActivityC0669k;
import p060e.AbstractC0676r;
import p060e.C0654J;
import p060e.C0657M;
import p060e.C0658N;
import p060e.C0665g;
import p060e.DialogInterfaceC0666h;
import p060e.LayoutInflaterFactory2C0648D;
import p060e.ViewOnClickListenerC0650F;
import p065g.C1159;
import p066g0.AbstractC0741b0;
import p066g0.C1160;
import p070i0.C1164;
import p072k.MenuC0816m;
import p072k.SubMenuC0803E;
import p074l.C0927e0;
import p077m0.C1169;
import p083p0.C1171;
import p084q.C1172;
import p089t.C1175;
import p092u0.C1176;
import p100z.C1180;

/* JADX INFO: renamed from: r.۠ۨۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1174 {

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int f4917 = 694;

    /* JADX INFO: renamed from: ۟۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m5002(Object obj) {
        if (C1152.m4038() > 0) {
            return ((C0654J) obj).f2595c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠۠, reason: not valid java name and contains not printable characters */
    public static StringBuilder m5003(Object obj, int i2) {
        if (C1159.m4411() > 0) {
            return ((StringBuilder) obj).append(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m5004(Object obj, int i2) {
        if (C1124.m2896() > 0) {
            return AbstractC0529T.m1416e((String) obj, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m5005(Object obj) {
        if (C1158.m4364() < 0) {
            return ((JSONObject) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5006(Object obj, int i2, int i3) {
        if (C1131.m3177() <= 0) {
            return ((Rect) obj).contains(i2, i3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۢۨۢ, reason: not valid java name and contains not printable characters */
    public static void m5007(Object obj, int i2) {
        if (C1180.m5241() < 0) {
            ((AbstractC0401b) obj).m1108p(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m5008() {
        return (-717) ^ C1138.f4864;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static C0665g m5009(Object obj) {
        if (C1144.m3748() < 0) {
            return ((DialogInterfaceC0666h) obj).f2693f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static MenuC0816m m5010(Object obj) {
        if (C1164.m4618() >= 0) {
            return ((SubMenuC0803E) obj).f3251z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m5011(Object obj) {
        if (C1151.m4000() >= 0) {
            return ((C0219y) obj).f756k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static Method m5012(Object obj) {
        if (C1138.m3471() > 0) {
            return ((ViewOnClickListenerC0650F) obj).f2581c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m5013(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static void m5014(Object obj) {
        if (C1135.m3328() > 0) {
            ((PopupWindow) obj).dismiss();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m5015(Object obj) {
        if (C1122.m2810() <= 0) {
            return ((View) obj).getScrollY();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦ۠, reason: not valid java name and contains not printable characters */
    public static Object m5016(Object obj) {
        if (C1155.m4177() > 0) {
            return ((ValueAnimator) obj).getAnimatedValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۥ, reason: not valid java name and contains not printable characters */
    public static LocaleList m5017(Object obj) {
        if (C1159.m4411() >= 0) {
            return LocaleList.forLanguageTags((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣ۟, reason: not valid java name and contains not printable characters */
    public static void m5018(Object obj, Object obj2, boolean z2, Object obj3, int i2, int i3, int i4) {
        if (m5008() > 0) {
            ((C0216v) obj).m679d((ArrayList) obj2, z2, (C0927e0) obj3, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m5019(Object obj) {
        if (C1121.m2777() > 0) {
            ((Animator) obj).cancel();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m5020(Object obj, int i2, Object obj2) {
        if (C1125.m2937() >= 0) {
            return ((AbstractActivityC0669k) obj).m1896n(i2, (MenuItem) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static String m5021(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static TrustManagerFactory m5022(Object obj) {
        if (C1142.m3681() <= 0) {
            return TrustManagerFactory.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۨ, reason: not valid java name and contains not printable characters */
    public static View m5023(Object obj) {
        if (C1156.m4236() >= 0) {
            return ((AbstractC0741b0) obj).f2931a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static void m5024(Object obj, Object obj2) {
        if (C1156.m4236() >= 0) {
            ((C0212r) obj).m668j((AbstractC0213s) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۨۦ, reason: not valid java name and contains not printable characters */
    public static long m5025(Object obj) {
        if (C1169.m4842() < 0) {
            return ((RunnableC0345s) obj).f983e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۨۦۥ, reason: not valid java name and contains not printable characters */
    public static void m5026(Object obj, Object obj2) {
        if (C1138.m3471() >= 0) {
            ((ImageView) obj).setImageDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۡۧ۠, reason: not valid java name and contains not printable characters */
    public static TrustManager[] m5027(Object obj) {
        if (C1138.m3471() >= 0) {
            return ((TrustManagerFactory) obj).getTrustManagers();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m5028(Object obj, Object obj2) {
        if (C1172.m4932() <= 0) {
            ((AbstractC0213s) obj).mo638m((EditText) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۥۤۧ, reason: not valid java name and contains not printable characters */
    public static C0258f m5029(Object obj, Object obj2) {
        if (C1175.m5073() > 0) {
            return AbstractC0240S.m781l((View) obj, (C0258f) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static Context m5030(Object obj) {
        if (C1127.m3025() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2562k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۨۡ, reason: not valid java name and contains not printable characters */
    public static View m5031(Object obj) {
        if (C1180.m5241() < 0) {
            return ((AnimationAnimationListenerC0535e) obj).f1716c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m5032(Object obj, int i2, int i3) {
        if (m5008() >= 0) {
            return ((TypedArray) obj).getResourceId(i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5033(Object obj) {
        if (C1146.m3842() < 0) {
            return ((File) obj).exists();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m5034() {
        if (C1171.m4901() >= 0) {
            return AbstractC0676r.f2714f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡۥۦ, reason: not valid java name and contains not printable characters */
    public static CharSequence m5035(Object obj) {
        if (C1154.m4128() >= 0) {
            return ((ActionBarContextView) obj).getSubtitle();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۥۤ, reason: contains not printable characters */
    public static void m5036(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C1160.m4437() <= 0) {
            ((Path) obj).addRoundRect((RectF) obj2, (float[]) obj3, (Path.Direction) obj4);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static Object m5037(Object obj) {
        if (C1156.m4236() > 0) {
            return ((C0270l) obj).f838c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static LayoutInflaterFactory2C0648D m5038(Object obj) {
        if (C1146.m3842() <= 0) {
            return ((DialogInterfaceC0666h) obj).f2691d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۥۢ, reason: not valid java name and contains not printable characters */
    public static void m5040(Object obj, Object obj2) {
        if (C1176.m5115() <= 0) {
            ((Animator) obj).removeListener((Animator.AnimatorListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m5041() {
        if (C1124.m2896() > 0) {
            return "ۣۥۤ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۧ۟, reason: not valid java name and contains not printable characters */
    public static String m5042(Object obj, int i2) {
        if (C1152.m4038() > 0) {
            return ((TypedArray) obj).getString(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۦۥ, reason: not valid java name and contains not printable characters */
    public static C0658N m5043(Object obj) {
        if (C1152.m4038() >= 0) {
            return ((C0657M) obj).f2604g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۡ۠, reason: not valid java name and contains not printable characters */
    public static String m5039(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
