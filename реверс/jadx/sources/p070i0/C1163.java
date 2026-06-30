package p070i0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.activity.AbstractActivityC0466k;
import androidx.activity.C0462g;
import androidx.appcompat.widget.ActionMenuView;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.fragment.app.C0533c;
import androidx.lifecycle.EnumC0580l;
import androidx.profileinstaller.C1148;
import androidx.startup.C1149;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.internal.C1156;
import com.google.android.material.snackbar.C1157;
import com.reddit.frontpage.MainActivity;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import p001A0.C1121;
import p004C.C1122;
import p011G.C1123;
import p014H0.C1124;
import p016J.C0133e;
import p019K0.AbstractC0165g;
import p023M0.AbstractC0213s;
import p023M0.C0188A;
import p023M0.C0207m;
import p023M0.C0212r;
import p023M0.C0219y;
import p023M0.C1127;
import p025N0.C1129;
import p026O.C1132;
import p029P0.C1133;
import p031Q0.RunnableC0345s;
import p031Q0.ViewOnClickListenerC0333g;
import p032R.C1134;
import p037T0.C1136;
import p042W.C1139;
import p044X.C1140;
import p045X0.C1141;
import p050a0.C1142;
import p051a1.C1144;
import p052b0.C1151;
import p058d0.C1158;
import p060e.AbstractC0676r;
import p060e.C0658N;
import p060e.C0678t;
import p060e.DialogInterfaceC0666h;
import p066g0.C0762m;
import p072k.InterfaceC0828y;
import p072k.MenuC0816m;
import p074l.C0925d1;
import p074l.C0973u;
import p077m0.C1169;
import p081o0.C1170;
import p086r.C1174;
import p096w0.C1177;
import p098x0.C1179;
import p100z.C1180;

/* JADX INFO: renamed from: i0.۟۟ۤۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1163 {

    /* JADX INFO: renamed from: ۟ۥۣۧۧ, reason: not valid java name and contains not printable characters */
    public static int f4906 = 411;

    /* JADX INFO: renamed from: ۟۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m4557(Object obj) {
        if (C1142.m3681() < 0) {
            return ((MotionEvent) obj).getAction();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static double m4558(Object obj) {
        if (C1170.m4847() > 0) {
            return ((RunnableC0345s) obj).f982d;
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۟۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static View.OnLongClickListener m4559(Object obj) {
        if (C1129.m3120() < 0) {
            return ((C0188A) obj).f626i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m4560(Object obj, Object obj2, Object obj3) {
        if (C1170.m4847() >= 0) {
            ((Canvas) obj).drawPath((Path) obj2, (Paint) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۥ۟, reason: not valid java name and contains not printable characters */
    public static String m4561() {
        if (C1123.m2849() > 0) {
            return "ۧۥۣ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Parcelable m4562(Object obj, Object obj2) {
        if (C1151.m4000() >= 0) {
            return ((Parcel) obj).readParcelable((ClassLoader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static StateListDrawable m4563(Object obj) {
        if (C1139.m3541() >= 0) {
            return ((C0762m) obj).f3051c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m4564(Object obj) {
        if (m4579() >= 0) {
            return ((KeyEvent) obj).getRepeatCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m4565(Object obj) {
        if (C1124.m2896() > 0) {
            return ((AdapterView) obj).getSelectedItemId();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m4566(Object obj) {
        if (C1149.m3923() < 0) {
            return ((BufferedReader) obj).readLine();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m4567() {
        if (m4579() > 0) {
            return "۟ۧۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static void m4568(Object obj, Object obj2) {
        if (C1164.m4618() > 0) {
            ((C0658N) obj).m1880s0((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static C0462g m4569(Object obj) {
        if (C1174.m5008() >= 0) {
            return ((AbstractActivityC0466k) obj).f1187k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۧۦ, reason: not valid java name and contains not printable characters */
    public static C0212r m4570(Object obj) {
        if (C1180.m5241() <= 0) {
            return ((AbstractC0213s) obj).f708b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۦ, reason: not valid java name and contains not printable characters */
    public static int m4571(Object obj) {
        if (C1148.m3908() > 0) {
            return ((Configuration) obj).touchscreen;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۢ, reason: not valid java name and contains not printable characters */
    public static C0133e m4572() {
        if (C1136.m3395() < 0) {
            return C0133e.f438b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static C0973u m4573() {
        if (C1156.m4236() >= 0) {
            return C0973u.m2423a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۤۨ, reason: not valid java name and contains not printable characters */
    public static long m4575(Object obj) {
        if (C1151.m4000() >= 0) {
            return ((Parcel) obj).readLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۦۤ, reason: not valid java name and contains not printable characters */
    public static int m4576(Object obj) {
        if (C1129.m3120() < 0) {
            return ((C0678t) obj).f2720a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۨۦ, reason: not valid java name and contains not printable characters */
    public static EnumC0580l m4577() {
        if (C1132.m3217() > 0) {
            return EnumC0580l.ON_DESTROY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ۟, reason: not valid java name and contains not printable characters */
    public static String m4578(Object obj, Object obj2, Object obj3) {
        if (C1142.m3681() < 0) {
            return String.format((Locale) obj, (String) obj2, (Object[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static int m4579() {
        return 602 ^ C1177.f4920;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Boolean m4580() {
        if (C1141.m3607() >= 0) {
            return AbstractC0676r.f2713e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m4581(String str) {
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

    /* JADX INFO: renamed from: ۠ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static void m4582(Object obj, Object obj2, Object obj3) {
        if (C1133.m3246() <= 0) {
            ((MenuC0816m) obj).m2185b((InterfaceC0828y) obj2, (Context) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m4583(Object obj) {
        if (C1174.m5008() >= 0) {
            ((C0212r) obj).m672n();
        }
    }

    /* JADX INFO: renamed from: ۡۤۧۤ, reason: not valid java name and contains not printable characters */
    public static int m4584(Object obj) {
        if (C1123.m2849() >= 0) {
            return ((KeyEvent) obj).getMetaState();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m4585(Object obj) {
        if (C1146.m3842() <= 0) {
            ((C0212r) obj).m669k();
        }
    }

    /* JADX INFO: renamed from: ۢۤۧ۠, reason: not valid java name and contains not printable characters */
    public static C0925d1 m4586(Object obj) {
        if (C1169.m4842() <= 0) {
            return ((ActionMenuView) obj).f1350u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۢ, reason: not valid java name and contains not printable characters */
    public static TextView m4587(Object obj) {
        if (C1146.m3842() < 0) {
            return ((MainActivity) obj).f2468C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۧۧ, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC0666h m4588(Object obj) {
        if (C1144.m3748() < 0) {
            return ((ViewOnClickListenerC0333g) obj).f950d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Class m4589(Object obj, Object obj2) {
        if (C1154.m4128() > 0) {
            return ((ClassLoader) obj).loadClass((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۢۤ, reason: not valid java name and contains not printable characters */
    public static int m4590(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤۤۧ, reason: not valid java name and contains not printable characters */
    public static ValueAnimator m4591(Object obj) {
        if (C1174.m5008() > 0) {
            return ((C0207m) obj).f675q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۨۥ, reason: not valid java name and contains not printable characters */
    public static Paint m4592(Object obj) {
        if (C1121.m2777() > 0) {
            return ((AbstractC0165g) obj).f536c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m4593(Object obj, Object obj2, Object obj3) {
        if (C1127.m3025() > 0) {
            return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۦۦ, reason: contains not printable characters */
    public static View m4594(Object obj) {
        if (C1123.m2849() >= 0) {
            return ((AdapterView) obj).getSelectedView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۧۤ, reason: contains not printable characters */
    public static void m4595(Object obj, Object obj2) {
        if (C1157.m4271() > 0) {
            ((ViewGroup) obj).addView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۤۧ, reason: contains not printable characters */
    public static MotionEvent m4596(Object obj) {
        if (C1122.m2810() <= 0) {
            return ((AbstractC0165g) obj).f523O;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m4597(Object obj, Object obj2) {
        if (C1122.m2810() <= 0) {
            ((C0219y) obj).setAdapter((ListAdapter) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m4598(Object obj) {
        if (C1140.m3595() >= 0) {
            return MainActivity.m1813C((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۨ, reason: not valid java name and contains not printable characters */
    public static void m4599(Object obj, boolean z2) {
        if (C1134.m3300() < 0) {
            ((View) obj).setEnabled(z2);
        }
    }

    /* JADX INFO: renamed from: ۨۤۡۢ, reason: not valid java name and contains not printable characters */
    public static double m4600(double d2) {
        if (C1179.m5236() > 0) {
            return Math.ceil(d2);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۨۧۢۤ, reason: not valid java name and contains not printable characters */
    public static Parcelable.Creator m4601() {
        if (C1158.m4364() < 0) {
            return C0533c.CREATOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۤۧ, reason: not valid java name and contains not printable characters */
    public static String m4574(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
