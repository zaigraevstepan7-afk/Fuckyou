package p081o0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.lifecycle.C1147;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.slider.Slider;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputEditText;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Map;
import p000A.C0001b;
import p001A0.C1121;
import p004C.C1122;
import p005C0.AbstractC0047m;
import p011G.C1123;
import p014H0.C1124;
import p015I0.C0112h;
import p015I0.C1125;
import p018K.RunnableC0145a;
import p019K0.AbstractC0165g;
import p023M0.C0188A;
import p023M0.C0199e;
import p025N0.C1130;
import p025N0.C1131;
import p026O.C1132;
import p029P0.C0325b;
import p031Q0.DialogInterfaceOnShowListenerC0330d;
import p036T.AbstractC0383m;
import p037T0.C1136;
import p038U.C1137;
import p041V0.C1138;
import p050a0.C1142;
import p050a0.C1143;
import p051a1.C1145;
import p052b0.C1151;
import p052b0.C1152;
import p060e.C0647C;
import p060e.C0657M;
import p060e.C0658N;
import p060e.LayoutInflaterFactory2C0648D;
import p070i0.C1163;
import p070i0.C1164;
import p072k.MenuC0816m;
import p073k0.AbstractC0849m;
import p075l0.C1168;
import p077m0.C1169;
import p083p0.C1171;
import p089t.C1175;
import p092u0.C1176;
import p096w0.C1177;
import p098x0.C1179;
import p100z.C1180;

/* JADX INFO: renamed from: o0.۟ۤ۠۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1170 {

    /* JADX INFO: renamed from: ۟ۥۥۤۦ, reason: not valid java name and contains not printable characters */
    public static int f4913 = 272;

    /* JADX INFO: renamed from: ۟۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static int m4843(Object obj) {
        if (C1146.m3842() < 0) {
            return ((Rect) obj).right;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m4844(int i2, int i3) {
        if (C1150.m3967() > 0) {
            return Math.max(i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static float m4845(Object obj) {
        if (C1155.m4177() > 0) {
            return ((Slider) obj).getValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Bundle m4846(Object obj) {
        if (C1154.m4128() > 0) {
            return ((C0647C) obj).f2524p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static int m4847() {
        return (-345) ^ C1121.f4825;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static RectF m4848(Object obj) {
        if (C1130.m3165() >= 0) {
            return ((AbstractC0165g) obj).f557m0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static C0001b m4849(Object obj) {
        if (C1152.m4038() > 0) {
            return ((C0658N) obj).f2619M;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4850(Object obj) {
        if (C1163.m4579() > 0) {
            return ((C0647C) obj).f2520l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m4851(Object obj) {
        if (C1125.m2937() >= 0) {
            ((AbstractC0849m) obj).m2254m();
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m4852(Object obj, Object obj2, long j2) {
        if (C1177.m5152() > 0) {
            return ((SharedPreferences.Editor) obj).putLong((String) obj2, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4853(Object obj) {
        if (C1157.m4271() > 0) {
            return ((PopupWindow) obj).isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۣ, reason: not valid java name and contains not printable characters */
    public static Paint m4854(Object obj) {
        if (C1149.m3923() <= 0) {
            return ((AbstractC0165g) obj).f532a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static Drawable m4855(Object obj) {
        if (C1154.m4128() >= 0) {
            return ((AutoCompleteTextView) obj).getDropDownBackground();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m4856(Object obj, Object obj2) {
        if (C1171.m4901() > 0) {
            ((Parcel) obj).writeBooleanArray((boolean[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m4857(Object obj) {
        if (C1147.m1498() < 0) {
            ((ValueAnimator) obj).cancel();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object m4858(Object obj, Object obj2, Object obj3) {
        if (C1154.m4128() >= 0) {
            return ((Map) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۢ۟, reason: not valid java name and contains not printable characters */
    public static void m4859(Object obj) {
        if (C1131.m3177() <= 0) {
            ((ArrayList) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۥ, reason: not valid java name and contains not printable characters */
    public static void m4860(Object obj, float f) {
        if (C1180.m5241() <= 0) {
            ((C0112h) obj).m481m(f);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧۨۥ, reason: not valid java name and contains not printable characters */
    public static Context m4861(Object obj) {
        if (C1143.m3711() < 0) {
            return ((MenuC0816m) obj).f3319a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m4862() {
        if (C1151.m4000() >= 0) {
            return "ۣۢۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۨ, reason: not valid java name and contains not printable characters */
    public static int m4863(Object obj) {
        if (C1137.m3457() < 0) {
            return ((View) obj).getTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static ClipData m4864(Object obj) {
        if (C1176.m5115() <= 0) {
            return ((ContentInfo) obj).getClip();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۥ, reason: not valid java name and contains not printable characters */
    public static TextInputEditText m4865(Object obj) {
        if (C1179.m5236() >= 0) {
            return ((DialogInterfaceOnShowListenerC0330d) obj).f943c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m4866(Object obj, int i2) {
        if (C1143.m3711() < 0) {
            return ((SparseArray) obj).get(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static Drawable m4867(Object obj, int i2) {
        if (C1123.m2849() >= 0) {
            return AbstractC0383m.m1057w((Context) obj, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static C0657M m4868(Object obj) {
        if (C1136.m3395() < 0) {
            return ((C0658N) obj).f2629y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۨ۟, reason: not valid java name and contains not printable characters */
    public static ViewGroup m4869(Object obj) {
        if (m4847() > 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2528A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۤۡ, reason: not valid java name and contains not printable characters */
    public static String m4870(Object obj) {
        if (C1124.m2896() >= 0) {
            return ((AccessibilityServiceInfo) obj).getSettingsActivityName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4871(Object obj, int i2) {
        if (C1156.m4236() >= 0) {
            ((EditText) obj).setSelection(i2);
        }
    }

    /* JADX INFO: renamed from: ۢۡۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4872(Object obj) {
        if (C1168.m4797() < 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2533F;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۦۧ, reason: not valid java name and contains not printable characters */
    public static int m4873(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡۡ۟, reason: not valid java name and contains not printable characters */
    public static void m4875(Object obj, Object obj2) {
        if (C1177.m5152() > 0) {
            ((View) obj).getHitRect((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۢۡ, reason: not valid java name and contains not printable characters */
    public static TypedArray m4876(Object obj, Object obj2, Object obj3, int i2, int i3, Object obj4) {
        if (C1149.m3923() <= 0) {
            return AbstractC0047m.m279h((Context) obj, (AttributeSet) obj2, (int[]) obj3, i2, i3, (int[]) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4877(Object obj, Object obj2) {
        if (C1164.m4618() >= 0) {
            return ((BaseBundle) obj).containsKey((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦۣ۠, reason: not valid java name and contains not printable characters */
    public static RunnableC0145a m4878(Object obj) {
        if (C1152.m4038() >= 0) {
            return ((AbstractC0165g) obj).f550j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4879(Object obj) {
        if (C1138.m3471() > 0) {
            return ((View) obj).onCheckIsTextEditor();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۧ, reason: not valid java name and contains not printable characters */
    public static void m4880(Object obj, int i2) {
        if (C1122.m2810() <= 0) {
            ((LayoutInflaterFactory2C0648D) obj).m1834B(i2);
        }
    }

    /* JADX INFO: renamed from: ۤۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m4881(Object obj) {
        if (C1179.m5236() > 0) {
            return ((TextView) obj).getSelectionEnd();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۡ۠, reason: contains not printable characters */
    public static ViewPropertyAnimator m4882(Object obj, long j2) {
        if (C1145.m3805() <= 0) {
            return ((ViewPropertyAnimator) obj).setStartDelay(j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۟ۤ, reason: contains not printable characters */
    public static boolean m4883(Object obj, Object obj2, int i2) {
        if (C1124.m2896() >= 0) {
            return ((InputMethodManager) obj).showSoftInput((View) obj2, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۢۢ, reason: contains not printable characters */
    public static void m4884(Object obj, Object obj2) {
        if (C1169.m4842() <= 0) {
            ((AutoCompleteTextView) obj).setOnDismissListener((AutoCompleteTextView.OnDismissListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣۨۥ, reason: contains not printable characters */
    public static CharSequence m4885(Object obj) {
        if (C1130.m3165() > 0) {
            return ((C0325b) obj).f932x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۨ, reason: contains not printable characters */
    public static String m4886(String str) {
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

    /* JADX INFO: renamed from: ۦ۠ۤ۠, reason: contains not printable characters */
    public static boolean m4887(Object obj, float f, float f2) {
        if (C1132.m3217() > 0) {
            return ((Matrix) obj).preTranslate(f, f2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۥۦ, reason: contains not printable characters */
    public static ViewGroup.LayoutParams m4888(Object obj) {
        if (C1136.m3395() < 0) {
            return ((View) obj).getLayoutParams();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ۟۟, reason: contains not printable characters */
    public static boolean m4889(Object obj) {
        if (C1122.m2810() < 0) {
            return ((C0658N) obj).f2613G;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۨۡۧ, reason: contains not printable characters */
    public static ValueAnimator m4890(Object obj) {
        if (C1122.m2810() < 0) {
            return ((C0199e) obj).f653m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۡ۠, reason: not valid java name and contains not printable characters */
    public static void m4891(Object obj, boolean z2) {
        if (C1132.m3217() >= 0) {
            ((View) obj).setPressed(z2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۦ۠, reason: not valid java name and contains not printable characters */
    public static Property m4892() {
        if (C1175.m5073() > 0) {
            return View.TRANSLATION_Y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static long m4893(Object obj, Object obj2, long j2) {
        if (C1177.m5152() > 0) {
            return ((SharedPreferences) obj).getLong((String) obj2, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m4894(Object obj, int i2) {
        if (C1143.m3711() < 0) {
            ((Parcel) obj).writeInt(i2);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static Drawable m4895(Object obj) {
        if (C1168.m4797() <= 0) {
            return ((PopupWindow) obj).getBackground();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۦۡ, reason: not valid java name and contains not printable characters */
    public static void m4896(Object obj, Object obj2) {
        if (C1142.m3681() < 0) {
            ((C0188A) obj).m626b((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m4874(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
