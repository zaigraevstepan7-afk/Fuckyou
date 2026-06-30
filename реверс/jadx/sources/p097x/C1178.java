package p097x;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.AbstractActivityC0466k;
import androidx.activity.result.AbstractC0480g;
import androidx.activity.result.C0476c;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.fragment.app.C0514D;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.ConfigsActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p014H0.C1124;
import p015I0.C0116l;
import p015I0.C0117m;
import p019K0.AbstractC0165g;
import p022M.C1126;
import p023M0.AbstractC0213s;
import p023M0.C0206l;
import p023M0.C0207m;
import p023M0.C0212r;
import p024N.C1128;
import p025N0.C1129;
import p025N0.C1130;
import p029P0.C1133;
import p031Q0.C0338l;
import p031Q0.RunnableC0345s;
import p032R.C1134;
import p037T0.C1135;
import p037T0.C1136;
import p041V0.C1138;
import p044X.C1140;
import p050a0.C1142;
import p051a1.C1144;
import p051a1.C1145;
import p052b0.C1151;
import p052b0.C1152;
import p058d0.C1158;
import p060e.AbstractActivityC0669k;
import p060e.AbstractC0676r;
import p060e.C0647C;
import p060e.C0655K;
import p060e.C0658N;
import p060e.LayoutInflaterFactory2C0648D;
import p068h0.C1162;
import p070i0.C1163;
import p070i0.C1164;
import p071j.C0788c;
import p071j.C0795j;
import p072k.MenuC0816m;
import p073k0.C1166;
import p073k0.C1167;
import p074l.InterfaceC0954n0;
import p075l0.C1168;
import p081o0.C1170;
import p083p0.C1171;
import p084q.C1173;
import p089t.C1175;
import p100z.C1180;

/* JADX INFO: renamed from: x.۟۟ۦۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1178 {

    /* JADX INFO: renamed from: ۡۧۦۦ, reason: not valid java name and contains not printable characters */
    public static int f4921 = -179;

    /* JADX INFO: renamed from: ۟۟۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m5162(Object obj, int i2, Object obj2, Object obj3) {
        if (C1142.m3681() <= 0) {
            ((LayoutInflaterFactory2C0648D) obj).m1852n(i2, (C0647C) obj2, (MenuC0816m) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m5163(Object obj, boolean z2) {
        if (C1168.m4797() <= 0) {
            ((PopupWindow) obj).setFocusable(z2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static Drawable m5164(Object obj) {
        if (C1136.m3395() < 0) {
            return ((ImageView) obj).getDrawable();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static Xfermode m5165(Object obj, Object obj2) {
        if (C1173.m4990() <= 0) {
            return ((Paint) obj).setXfermode((Xfermode) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۢ, reason: not valid java name and contains not printable characters */
    public static int m5166(Object obj) {
        if (C1175.m5073() > 0) {
            return ((AbstractC0165g) obj).f511C;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢۦ, reason: not valid java name and contains not printable characters */
    public static ComponentName m5167(Object obj) {
        if (C1126.m2964() <= 0) {
            return ((Activity) obj).getComponentName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦۣ, reason: not valid java name and contains not printable characters */
    public static C0788c m5168(Object obj) {
        if (C1136.m3395() <= 0) {
            return ((C0647C) obj).f2518j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5169(Object obj) {
        if (C1146.m3842() <= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2531D;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ */
    public static InterfaceC0954n0 m2695(Object obj) {
        if (C1175.m5073() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2569r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static Process m5170(Object obj) {
        if (C1166.m4699() > 0) {
            return ((ProcessBuilder) obj).start();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m5171(Object obj) {
        if (C1138.m3471() >= 0) {
            return ((UiModeManager) obj).getNightMode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5172(Object obj) {
        if (C1164.m4618() >= 0) {
            return ((C0647C) obj).f2523o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۥۢ۟, reason: not valid java name and contains not printable characters */
    public static void m5173(Object obj, boolean z2) {
        if (C1129.m3120() <= 0) {
            ((C0207m) obj).m653t(z2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۥۣ, reason: not valid java name and contains not printable characters */
    public static int m5174() {
        return (-335) ^ C1135.f4861;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m5175(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۦۤۤ, reason: not valid java name and contains not printable characters */
    public static void m5176(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2, int i3) {
        if (C1133.m3246() <= 0) {
            ((ViewGroup) obj).saveAttributeDataForStyleable((Context) obj2, (int[]) obj3, (AttributeSet) obj4, (TypedArray) obj5, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5177(Object obj, Object obj2) {
        if (C1134.m3300() <= 0) {
            return ((HashSet) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static void m5178(Object obj) {
        if (C1152.m4038() >= 0) {
            ((AbstractC0676r) obj).mo1843c();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۥۨ, reason: not valid java name and contains not printable characters */
    public static long m5179(Object obj) {
        if (C1128.m3066() > 0) {
            return ((C0655K) obj).f2597b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static C0117m m5180(Object obj) {
        if (C1171.m4901() > 0) {
            return ((C0116l) obj).m489a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۦۧ, reason: not valid java name and contains not printable characters */
    public static C0476c m5181(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C1124.m2896() > 0) {
            return ((AbstractC0480g) obj).m1180c((String) obj2, (ConfigsActivity) obj3, (C0514D) obj4, (C0206l) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m5182(Object obj) {
        if (C1167.m4739() < 0) {
            return ((TextInputLayout) obj).getHint();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۤۢ, reason: not valid java name and contains not printable characters */
    public static int m5183(Object obj) {
        if (C1145.m3805() <= 0) {
            return ((KeyEvent) obj).getFlags();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢۥۧ, reason: not valid java name and contains not printable characters */
    public static void m5184(Object obj, Object obj2) {
        if (C1135.m3328() >= 0) {
            ((LayoutInflater) obj).setFactory2((LayoutInflater.Factory2) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۤۨۡ, reason: not valid java name and contains not printable characters */
    public static String m5185() {
        if (C1162.m4523() <= 0) {
            return "ۤۧ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۥۤ, reason: not valid java name and contains not printable characters */
    public static View m5186(Object obj, int i2) {
        if (C1163.m4579() > 0) {
            return ((AbstractActivityC0669k) obj).findViewById(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۨۤ, reason: not valid java name and contains not printable characters */
    public static int m5187(Object obj, int i2) {
        if (C1140.m3595() > 0) {
            return ((MotionEvent) obj).getToolType(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠۟۠, reason: not valid java name and contains not printable characters */
    public static AccessibilityManager m5188(Object obj) {
        if (C1170.m4847() >= 0) {
            return ((AbstractC0165g) obj).f548i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۢ, reason: not valid java name and contains not printable characters */
    public static int m5189(Object obj) {
        if (C1130.m3165() > 0) {
            return ((TextView) obj).getCompoundPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۡ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m5190(Object obj) {
        if (C1162.m4523() < 0) {
            return ((C0795j) obj).f3224a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۡۡ, reason: contains not printable characters */
    public static boolean m5191(Object obj) {
        if (C1151.m4000() > 0) {
            return ((C0795j) obj).f3228e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢۤ۟, reason: contains not printable characters */
    public static long m5192(Object obj) {
        if (C1180.m5241() < 0) {
            return ((RunnableC0345s) obj).f981c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣۤۧ, reason: contains not printable characters */
    public static CheckableImageButton m5193(Object obj) {
        if (C1167.m4739() <= 0) {
            return ((AbstractC0213s) obj).f710d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۦ۟, reason: contains not printable characters */
    public static void m5194(Object obj) {
        if (m5174() <= 0) {
            Collections.sort((List) obj);
        }
    }

    /* JADX INFO: renamed from: ۥۨۦۥ, reason: contains not printable characters */
    public static boolean m5195(Object obj, Object obj2) {
        if (C1144.m3748() < 0) {
            return ((View) obj).onTouchEvent((MotionEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ۤۤ, reason: contains not printable characters */
    public static void m5196(Object obj, int i2) {
        if (C1154.m4128() > 0) {
            ((ImageView) obj).setVisibility(i2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۨ۠, reason: contains not printable characters */
    public static boolean m5197(Object obj) {
        if (C1158.m4364() <= 0) {
            return ((C0658N) obj).f2627w;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static CopyOnWriteArrayList m5198(Object obj) {
        if (C1136.m3395() <= 0) {
            return ((AbstractActivityC0466k) obj).f1190n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m5199(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۧۧۥ, reason: not valid java name and contains not printable characters */
    public static MaterialButton m5200(Object obj) {
        if (C1173.m4990() < 0) {
            return ((C0338l) obj).f965x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۠۟, reason: not valid java name and contains not printable characters */
    public static C0206l m5201(Object obj) {
        if (C1171.m4901() > 0) {
            return ((C0212r) obj).f705u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢ۠, reason: not valid java name and contains not printable characters */
    public static String m5203() {
        if (C1146.m3842() < 0) {
            return "ۣۢ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥۣ, reason: not valid java name and contains not printable characters */
    public static int m5204(Object obj) {
        if (C1173.m4990() <= 0) {
            return ((AbstractC0165g) obj).f528T;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5205(Object obj, boolean z2, boolean z3) {
        if (C1151.m4000() >= 0) {
            return ((File) obj).setWritable(z2, z3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۨ۟, reason: not valid java name and contains not printable characters */
    public static String m5202(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
