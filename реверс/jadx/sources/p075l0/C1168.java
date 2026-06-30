package p075l0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.fragment.app.C0515E;
import androidx.startup.C1149;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import javax.net.ssl.TrustManagerFactory;
import p000A.C0010k;
import p001A0.AbstractC0016e;
import p001A0.C1121;
import p005C0.AbstractC0038d;
import p019K0.AbstractC0165g;
import p020L.C0176j;
import p022M.C1126;
import p023M0.AbstractC0213s;
import p023M0.C0188A;
import p023M0.C0194G;
import p023M0.C0212r;
import p024N.C0295x0;
import p024N.C1128;
import p024N.InterfaceC0268k;
import p025N0.C1129;
import p025N0.C1131;
import p026O.C1132;
import p027O0.AbstractC0322a;
import p029P0.C0325b;
import p031Q0.C0340n;
import p031Q0.C0350x;
import p031Q0.RunnableC0335i;
import p031Q0.RunnableC0341o;
import p031Q0.ViewOnClickListenerC0333g;
import p034S.InterfaceC0363g;
import p036T.AbstractC0383m;
import p037T0.C1135;
import p041V0.C1138;
import p044X.C1140;
import p045X0.C1141;
import p050a0.C1142;
import p051a1.C1144;
import p058d0.C1158;
import p060e.AbstractC0676r;
import p060e.C0665g;
import p060e.WindowCallbackC0683y;
import p065g.C1159;
import p070i0.C1164;
import p073k0.C1167;
import p074l.C0931f1;
import p077m0.C1169;
import p083p0.C1171;
import p084q.C1172;
import p089t.C1175;
import p092u0.C1176;
import p098x0.C1179;

/* JADX INFO: renamed from: l0.ۤ۟ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1168 {

    /* JADX INFO: renamed from: ۟ۦۦۥۥ, reason: not valid java name and contains not printable characters */
    public static int f4911 = 406;

    /* JADX INFO: renamed from: ۟۟۟۠۟, reason: not valid java name and contains not printable characters */
    public static void m4750(Object obj, int i2) {
        if (C1126.m2964() < 0) {
            ((URLConnection) obj).setReadTimeout(i2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m4751(int i2, int i3) {
        if (C1121.m2777() > 0) {
            return Math.min(i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4752(Object obj) {
        if (C1129.m3120() <= 0) {
            return ((AbstractC0165g) obj).f558n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m4753(Object obj) {
        if (C1175.m5073() >= 0) {
            return ((View) obj).getBackground();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m4754(Object obj) {
        if (C1142.m3681() < 0) {
            return ((RunnableC0335i) obj).f955a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static void m4755(Object obj) {
        if (C1132.m3217() >= 0) {
            ((MainActivity) obj).m1828y();
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m4756(Object obj) {
        if (C1144.m3748() <= 0) {
            return ((Message) obj).obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static void m4757(Object obj, boolean z2) {
        if (C1176.m5115() < 0) {
            ((C0188A) obj).m627c(z2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static C0931f1 m4758(Object obj) {
        if (C1126.m2964() < 0) {
            return ((Toolbar) obj).f1382L;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۢ۟, reason: not valid java name and contains not printable characters */
    public static void m4759(Object obj, int i2) {
        if (C1169.m4842() <= 0) {
            AbstractC0383m.m1041f0((TextView) obj, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۨۢ, reason: not valid java name and contains not printable characters */
    public static String m4760() {
        if (C1164.m4618() >= 0) {
            return "ۣۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۥ, reason: not valid java name and contains not printable characters */
    public static CharSequence m4761(Object obj) {
        if (C1155.m4177() >= 0) {
            return ((C0194G) obj).f635c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠۠, reason: not valid java name and contains not printable characters */
    public static int m4762(Object obj) {
        if (C1140.m3595() > 0) {
            return ((C0295x0) obj).m922b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m4763(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m4764(Object obj) {
        if (m4797() <= 0) {
            return ((InterfaceC0363g) obj).mo842d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Context m4765(Object obj) {
        if (C1164.m4618() >= 0) {
            return ((AbstractC0213s) obj).f709c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static void m4766(Object obj, Object obj2, Object obj3) {
        if (C1121.m2777() > 0) {
            AbstractC0016e.m187n0((TextInputLayout) obj, (CheckableImageButton) obj2, (ColorStateList) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۤۡ, reason: not valid java name and contains not printable characters */
    public static void m4767(Object obj, int i2) {
        if (C1159.m4411() > 0) {
            ((C0212r) obj).m665g(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4768(Object obj) {
        if (C1156.m4236() >= 0) {
            return ((WindowCallbackC0683y) obj).f2726c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Context m4769(Object obj, Object obj2, int i2, int i3) {
        if (C1156.m4236() >= 0) {
            return AbstractC0322a.m979a((Context) obj, (AttributeSet) obj2, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۧ۠, reason: not valid java name and contains not printable characters */
    public static Button m4770(Object obj) {
        if (C1142.m3681() <= 0) {
            return ((C0665g) obj).f2676l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m4771(Object obj) {
        if (C1159.m4411() > 0) {
            return ((C0010k) obj).f22a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m4772(int i2, Object obj, int i3) {
        if (C1155.m4177() > 0) {
            return Character.toChars(i2, (char[]) obj, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static TextView m4773(Object obj) {
        if (C1135.m3328() >= 0) {
            return ((C0665g) obj).f2685u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4774(Object obj, int i2, boolean z2) {
        if (C1157.m4271() > 0) {
            return ((TypedArray) obj).getBoolean(i2, z2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨۤ, reason: not valid java name and contains not printable characters */
    public static Parcelable.Creator m4775() {
        if (C1146.m3842() <= 0) {
            return C0515E.CREATOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧ۟, reason: not valid java name and contains not printable characters */
    public static void m4776(Object obj, Object obj2, Object obj3) {
        if (C1141.m3607() > 0) {
            AbstractC0038d.m266b((ViewGroup) obj, (View) obj2, (Rect) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۨۦۦ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4777(Object obj) {
        if (C1175.m5073() >= 0) {
            return ((AbstractC0165g) obj).f551j0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static String m4778(int i2) {
        if (C1171.m4901() > 0) {
            return String.valueOf(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m4779(Object obj, Object obj2) {
        if (C1142.m3681() <= 0) {
            ((View) obj).getWindowVisibleDisplayFrame((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static void m4780(Object obj, Object obj2) {
        if (C1135.m3328() >= 0) {
            ((ValueAnimator) obj).setFloatValues((float[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m4781(Object obj) {
        if (C1179.m5236() >= 0) {
            return ((C0350x) obj).f990a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡۨ, reason: not valid java name and contains not printable characters */
    public static void m4782(Object obj) {
        if (C1131.m3177() < 0) {
            ((AbstractC0165g) obj).m580e();
        }
    }

    /* JADX INFO: renamed from: ۡۧۥۢ, reason: not valid java name and contains not printable characters */
    public static String m4783(Object obj) {
        if (C1138.m3471() > 0) {
            return ((StringBuilder) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m4784(Object obj) {
        if (C1159.m4411() >= 0) {
            return ((C0176j) obj).f595b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static MainActivity m4785(Object obj) {
        if (C1158.m4364() <= 0) {
            return ((RunnableC0341o) obj).f973b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦ۠, reason: not valid java name and contains not printable characters */
    public static int m4786(Object obj) {
        if (C1121.m2777() >= 0) {
            return ((Parcel) obj).readInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۥۨ, reason: not valid java name and contains not printable characters */
    public static C0340n m4787(Object obj) {
        if (C1142.m3681() <= 0) {
            return ((ViewOnClickListenerC0333g) obj).f949c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static void m4788(Object obj, boolean z2) {
        if (C1172.m4932() < 0) {
            ((Window.Callback) obj).onWindowFocusChanged(z2);
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static void m4789(Object obj, Object obj2) {
        if (C1149.m3923() < 0) {
            ((TextInputLayout) obj).m1783v((Editable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4790(Object obj) {
        if (C1129.m3120() <= 0) {
            return ((ActionMenuView) obj).f1348s;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۦۤۤ, reason: not valid java name and contains not printable characters */
    public static String m4791() {
        if (C1135.m3328() > 0) {
            return TrustManagerFactory.getDefaultAlgorithm();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4792(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C1156.m4236() >= 0) {
            return AbstractC0016e.m156D((InterfaceC0268k) obj, (View) obj2, (Window.Callback) obj3, (KeyEvent) obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۨ, reason: contains not printable characters */
    public static Context m4793(Object obj) {
        if (C1155.m4177() >= 0) {
            return ((C0325b) obj).f933y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۨۨ, reason: contains not printable characters */
    public static boolean m4794(Object obj, int i2) {
        if (C1167.m4739() <= 0) {
            return ((AbstractC0676r) obj).mo1845f(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۢۨ, reason: contains not printable characters */
    public static ValueAnimator m4795(Object obj, boolean z2) {
        if (C1126.m2964() < 0) {
            return ((AbstractC0165g) obj).m578c(z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۥ, reason: not valid java name and contains not printable characters */
    public static int m4796(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۢۧ۟, reason: not valid java name and contains not printable characters */
    public static int m4797() {
        return 515 ^ C1154.f4880;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4798(Object obj) {
        if (C1128.m3066() > 0) {
            return ((C0188A) obj).f622e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m4799(Object obj, Object obj2) {
        if (C1171.m4901() >= 0) {
            return ((AbstractC0165g) obj).m583h((ColorStateList) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۧۥ, reason: not valid java name and contains not printable characters */
    public static String m4800(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
