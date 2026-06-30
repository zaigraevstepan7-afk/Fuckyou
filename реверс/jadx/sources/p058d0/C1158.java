package p058d0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.lifecycle.EnumC0580l;
import androidx.profileinstaller.C1148;
import androidx.versionedparcelable.C1150;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C0620o;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.snackbar.C1157;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import p001A0.C1121;
import p004C.C1122;
import p014H0.C1124;
import p019K0.AbstractC0165g;
import p020L.C0176j;
import p022M.C1126;
import p023M0.AbstractC0213s;
import p023M0.C0188A;
import p023M0.C0189B;
import p023M0.C0216v;
import p024N.C1128;
import p025N0.C1130;
import p031Q0.C0338l;
import p038U.C1137;
import p041V0.C1138;
import p042W.C1139;
import p044X.C1140;
import p045X0.C1141;
import p050a0.C1142;
import p051a1.C1145;
import p052b0.C0595a;
import p052b0.C1151;
import p052b0.C1152;
import p060e.AbstractC0676r;
import p060e.C0651G;
import p060e.ExecutorC0674p;
import p060e.LayoutInflaterFactory2C0648D;
import p066g0.C1160;
import p066g0.C1161;
import p070i0.C1164;
import p072k.ViewOnKeyListenerC0810g;
import p073k0.C1167;
import p074l.C0889N;
import p074l.C0893P;
import p074l.C0946k1;
import p081o0.AbstractC1015a;
import p081o0.C1170;
import p083p0.C1171;
import p084q.C1172;
import p092u0.C1176;
import p098x0.C1179;

/* JADX INFO: renamed from: d0.ۥۦۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1158 {

    /* JADX INFO: renamed from: ۦۣۣ۠, reason: contains not printable characters */
    public static int f4887 = -634;

    /* JADX INFO: renamed from: ۟۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static int m4330(Object obj) {
        if (C1137.m3457() <= 0) {
            return ((C0189B) obj).f628f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static C0889N m4331(Object obj) {
        if (C1138.m3471() >= 0) {
            return ((C0893P) obj).f3591E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static void m4332(Object obj, Object obj2) {
        if (C1139.m3541() > 0) {
            ((ListView) obj).setAdapter((ListAdapter) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static C0595a m4333() {
        if (C1157.m4271() > 0) {
            return AbstractC1015a.f4048c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static C0620o m4334(int i2, int i3) {
        if (C1160.m4437() < 0) {
            return C0620o.m1740a(i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m4335(Object obj, int i2) {
        if (C1164.m4618() >= 0) {
            return ((SparseArray) obj).keyAt(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۥۧ۟, reason: not valid java name and contains not printable characters */
    public static Configuration m4336(Object obj) {
        if (C1141.m3607() >= 0) {
            return ((Resources) obj).getConfiguration();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۠, reason: not valid java name and contains not printable characters */
    public static int m4337(Object obj) {
        if (C1145.m3805() < 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2547T;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m4338(Object obj, Object obj2) {
        if (C1124.m2896() >= 0) {
            ((AbstractC0165g) obj).setCustomThumbDrawablesForValues((Drawable[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static TimeInterpolator m4339(Object obj) {
        if (C1121.m2777() > 0) {
            return ((C0216v) obj).f723e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m4340() {
        if (m4364() < 0) {
            return Trace.isEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۨ, reason: not valid java name and contains not printable characters */
    public static CharSequence m4341(Object obj) {
        if (C1148.m3908() >= 0) {
            return ((C0188A) obj).f620c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۡ۟, reason: not valid java name and contains not printable characters */
    public static ViewTreeObserver m4342(Object obj) {
        if (C1176.m5115() <= 0) {
            return ((ViewOnKeyListenerC0810g) obj).f3301x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۤۧ, reason: not valid java name and contains not printable characters */
    public static void m4343(Object obj) {
        if (C1171.m4901() >= 0) {
            ((Process) obj).destroy();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4344(Object obj) {
        if (C1150.m3967() > 0) {
            return ((C0176j) obj).f594a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۡ, reason: not valid java name and contains not printable characters */
    public static void m4345(Object obj) {
        if (C1124.m2896() >= 0) {
            ((AnimatorSet) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4346(Object obj, Object obj2) {
        if (C1121.m2777() >= 0) {
            return ((ArrayList) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m4347(Object obj, Object obj2) {
        if (C1142.m3681() <= 0) {
            ((ViewOverlay) obj).add((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m4348(Object obj) {
        if (C1161.m4510() < 0) {
            ((AbstractC0213s) obj).mo632a();
        }
    }

    /* JADX INFO: renamed from: ۠۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static Runtime m4349() {
        if (C1140.m3595() >= 0) {
            return Runtime.getRuntime();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m4350(Object obj) {
        if (C1122.m2810() < 0) {
            return ((ViewGroup.MarginLayoutParams) obj).getMarginEnd();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static int[] m4352() {
        if (C1140.m3595() > 0) {
            return C0651G.f2587f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m4353(String str) {
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

    /* JADX INFO: renamed from: ۡۤۤۡ, reason: not valid java name and contains not printable characters */
    public static void m4354(Object obj) {
        if (C1152.m4038() > 0) {
            ((Dialog) obj).show();
        }
    }

    /* JADX INFO: renamed from: ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static int m4355(Object obj) {
        if (C1179.m5236() >= 0) {
            return ((AbstractC0165g) obj).f575x;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۠۟, reason: not valid java name and contains not printable characters */
    public static String m4356() {
        if (C1151.m4000() >= 0) {
            return "ۥۥۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۢۥ, reason: not valid java name and contains not printable characters */
    public static void m4357(Object obj, Object obj2) {
        if (C1172.m4932() <= 0) {
            ((Drawable) obj).draw((Canvas) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۦ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m4358(Object obj, Object obj2) {
        if (C1155.m4177() >= 0) {
            return ((MessageDigest) obj).digest((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۨ, reason: not valid java name and contains not printable characters */
    public static MaterialButton m4359(Object obj) {
        if (C1128.m3066() > 0) {
            return ((C0338l) obj).f964w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۧ, reason: not valid java name and contains not printable characters */
    public static EnumC0580l m4360() {
        if (C1179.m5236() >= 0) {
            return EnumC0580l.ON_PAUSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۥۣ, reason: not valid java name and contains not printable characters */
    public static ExecutorC0674p m4361() {
        if (C1130.m3165() > 0) {
            return AbstractC0676r.f2709a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m4362(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۢۧۢ, reason: contains not printable characters */
    public static void m4363(Object obj, int i2) {
        if (C1167.m4739() < 0) {
            ((LinearLayout) obj).setOrientation(i2);
        }
    }

    /* JADX INFO: renamed from: ۥۨۥۧ, reason: contains not printable characters */
    public static int m4364() {
        return 327 ^ C1179.f4922;
    }

    /* JADX INFO: renamed from: ۦ۠۟ۨ, reason: contains not printable characters */
    public static void m4365(Object obj, int i2) {
        if (C1148.m3908() > 0) {
            ((C0946k1) obj).m2396a(i2);
        }
    }

    /* JADX INFO: renamed from: ۦ۠ۧ۠, reason: contains not printable characters */
    public static boolean m4366(Object obj) {
        if (C1161.m4510() <= 0) {
            return ((AbstractC0165g) obj).f533a0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۡۥ, reason: not valid java name and contains not printable characters */
    public static void m4367(Object obj) {
        if (C1170.m4847() > 0) {
            ((AbstractC0213s) obj).mo640r();
        }
    }

    /* JADX INFO: renamed from: ۣۧۤۨ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m4368(Object obj, Object obj2, Object obj3) {
        if (C1126.m2964() <= 0) {
            return ((SharedPreferences.Editor) obj).putString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static String m4351(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
