package p092u0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0543m;
import androidx.fragment.app.DialogInterfaceOnDismissListenerC0541k;
import androidx.lifecycle.C1147;
import com.google.android.material.button.MaterialButton;
import com.reddit.frontpage.ConfigsActivity;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;
import org.json.JSONObject;
import p014H0.C1124;
import p015I0.C0112h;
import p015I0.C0117m;
import p019K0.AbstractC0165g;
import p023M0.AbstractC0213s;
import p023M0.C0212r;
import p024N.C0295x0;
import p025N0.C1130;
import p026O.C1132;
import p029P0.C1133;
import p031Q0.RunnableC0335i;
import p045X0.C1141;
import p050a0.C1143;
import p051a1.C1144;
import p060e.AbstractActivityC0669k;
import p060e.C0656L;
import p060e.C0658N;
import p060e.C0665g;
import p060e.C0679u;
import p060e.DialogInterfaceC0666h;
import p060e.LayoutInflaterFactory2C0648D;
import p066g0.C1160;
import p066g0.C1161;
import p068h0.C1162;
import p071j.C0788c;
import p071j.C0795j;
import p072k.C1165;
import p072k.ViewOnKeyListenerC0802D;
import p074l.C0944k;
import p075l0.C1168;
import p081o0.C1170;
import p086r.C1174;
import p089t.C1175;
import p096w0.C1177;
import p100z.C1180;

/* JADX INFO: renamed from: u0.۟ۤ۠ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1176 {

    /* JADX INFO: renamed from: ۦۥ۟ۢ, reason: contains not printable characters */
    public static int f4919 = -528;

    /* JADX INFO: renamed from: ۟ۡۡۦۣ, reason: not valid java name and contains not printable characters */
    public static String m5090(Object obj, Object obj2, Object obj3) {
        if (C1130.m3165() >= 0) {
            return ((JSONObject) obj).optString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static void m5091(Object obj, Object obj2, Object obj3) {
        if (C1162.m4523() < 0) {
            ((ViewGroup.OnHierarchyChangeListener) obj).onChildViewRemoved((View) obj2, (View) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۥ, reason: not valid java name and contains not printable characters */
    public static int m5092(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static void m5093(Object obj, Object obj2) {
        if (C1143.m3711() <= 0) {
            ((C0112h) obj).setShapeAppearanceModel((C0117m) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m5094(Object obj) {
        if (C1144.m3748() <= 0) {
            ((AbstractActivityC0669k) obj).m1897o();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m5095(Object obj) {
        if (C1132.m3217() >= 0) {
            return ((C0295x0) obj).m924d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۢ, reason: not valid java name and contains not printable characters */
    public static void m5096(Object obj, Object obj2) {
        if (C1174.m5008() >= 0) {
            ((AbstractC0165g) obj).setValues((Float[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۢ۠, reason: not valid java name and contains not printable characters */
    public static ViewTreeObserver m5097(Object obj) {
        if (C1174.m5008() > 0) {
            return ((ViewOnKeyListenerC0802D) obj).f3244o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5098(Object obj) {
        if (C1130.m3165() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2536I;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static void m5099(Object obj, Object obj2, Object obj3) {
        if (C1168.m4797() <= 0) {
            ((URLConnection) obj).setRequestProperty((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۦ, reason: not valid java name and contains not printable characters */
    public static void m5100(Object obj) {
        if (C1133.m3246() < 0) {
            ((AbstractC0213s) obj).mo673b();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۨ, reason: not valid java name and contains not printable characters */
    public static void m5101(Object obj, int i2) {
        if (C1177.m5152() >= 0) {
            ((DialogInterfaceC0666h) obj).setContentView(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m5102(Object obj) {
        if (C1175.m5073() > 0) {
            return ((C0679u) obj).f2723l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۨۡ, reason: not valid java name and contains not printable characters */
    public static FrameLayout m5103(Object obj) {
        if (C1147.m1498() <= 0) {
            return ((C0212r) obj).f686b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static MaterialButton m5104(Object obj) {
        if (C1141.m3607() >= 0) {
            return ((MainActivity) obj).f2475J;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static C0656L m5105(Object obj) {
        if (C1180.m5241() <= 0) {
            return ((C0658N) obj).f2617K;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۦۦ, reason: not valid java name and contains not printable characters */
    public static void m5106(Object obj) {
        if (C1160.m4437() <= 0) {
            ((C0795j) obj).m2142a();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۤ۟, reason: not valid java name and contains not printable characters */
    public static void m5107(Object obj, int i2, int i3, int i4, int i5) {
        if (C1175.m5073() > 0) {
            ((View) obj).setPaddingRelative(i2, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceOnDismissListenerC0541k m5108(Object obj) {
        if (C1168.m4797() <= 0) {
            return ((DialogInterfaceOnCancelListenerC0543m) obj).f1733U;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static CharSequence m5109(Object obj) {
        if (C1165.m4643() > 0) {
            return ((C0665g) obj).f2677m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۤ۠, reason: not valid java name and contains not printable characters */
    public static C0944k m5110(Object obj) {
        if (C1168.m4797() < 0) {
            return ((ActionMenuView) obj).f1349t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m5111() {
        if (C1170.m4847() > 0) {
            return "ۧۨ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۡۢ, reason: not valid java name and contains not printable characters */
    public static int m5112(Object obj) {
        if (C1168.m4797() < 0) {
            return ((C0788c) obj).f3167a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m5113() {
        if (C1132.m3217() >= 0) {
            return "ۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5114(Object obj) {
        if (C1130.m3165() > 0) {
            return ((AutoCompleteTextView) obj).isPopupShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۢۡۧ, reason: not valid java name and contains not printable characters */
    public static int m5115() {
        return 9 ^ C1144.f4870;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static ConfigsActivity m5116(Object obj) {
        if (C1144.m3748() < 0) {
            return ((RunnableC0335i) obj).f956b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m5117(Object obj, Object obj2) {
        if (C1170.m4847() > 0) {
            ((TextView) obj).setHint((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۦ۠, reason: contains not printable characters */
    public static void m5118(Object obj, int i2) {
        if (C1161.m4510() <= 0) {
            ((NestedScrollView) obj).m1270j(i2);
        }
    }

    /* JADX INFO: renamed from: ۥۧۧۦ, reason: contains not printable characters */
    public static String m5119(String str) {
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

    /* JADX INFO: renamed from: ۦۤۥۧ, reason: contains not printable characters */
    public static ActionBarContextView m5120(Object obj) {
        if (C1124.m2896() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2573v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m5121(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
