package p068h0;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.fragment.app.C0518H;
import androidx.profileinstaller.C1148;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.internal.CheckableImageButton;
import com.reddit.frontpage.MainActivity;
import java.io.ByteArrayOutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.ThreadPoolExecutor;
import p001A0.AbstractC0016e;
import p009F.C0076c;
import p015I0.C0109e;
import p015I0.C1125;
import p022M.C1126;
import p023M0.C0199e;
import p023M0.C0207m;
import p024N.C1128;
import p025N0.C1129;
import p026O.C0311k;
import p026O.C1132;
import p029P0.C1133;
import p031Q0.C0344r;
import p037T0.C1136;
import p052b0.C1151;
import p052b0.C1152;
import p058d0.C0643;
import p060e.C0651G;
import p060e.C0658N;
import p060e.C0665g;
import p060e.C0667i;
import p060e.LayoutInflaterFactory2C0648D;
import p061e0.AbstractC0690f;
import p065g.C1159;
import p066g0.C1161;
import p070i0.C1164;
import p071j.AbstractC0796k;
import p071j.C0788c;
import p073k0.C1167;
import p075l0.C1168;
import p083p0.C1171;
import p086r.C1174;
import p092u0.C1176;
import p096w0.C1177;
import p097x.C1178;

/* JADX INFO: renamed from: h0.۟۠ۤۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1162 {

    /* JADX INFO: renamed from: ۥۣۢۦ, reason: contains not printable characters */
    public static int f4905 = -338;

    /* JADX INFO: renamed from: ۟۟۟۟۠, reason: not valid java name and contains not printable characters */
    public static void m4515(Object obj, int i2, Object obj2) {
        if (C1128.m3066() > 0) {
            ((View) obj).setLayerType(i2, (Paint) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static CharSequence m4516(Object obj, int i2) {
        if (C1176.m5115() <= 0) {
            return ((Context) obj).getText(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m4517(Object obj, Object obj2, int i2) {
        if (C1151.m4000() > 0) {
            ((Parcel) obj).writeParcelableArray((Parcelable[]) obj2, i2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۤ۠, reason: not valid java name and contains not printable characters */
    public static String[] m4518() {
        if (C1125.m2937() > 0) {
            return Build.SUPPORTED_ABIS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static int m4519(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static C0076c m4520(int i2, int i3, int i4, int i5) {
        if (C1146.m3842() < 0) {
            return C0076c.m359b(i2, i3, i4, i5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m4521() {
        if (C1178.m5174() < 0) {
            return "ۣۡۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static AccessibilityManager m4522(Object obj) {
        if (C1156.m4236() > 0) {
            return ((C0207m) obj).f674p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۨۢ, reason: not valid java name and contains not printable characters */
    public static int m4523() {
        return 1008 ^ C1156.f4882;
    }

    /* JADX INFO: renamed from: ۟ۢۡۤۡ, reason: not valid java name and contains not printable characters */
    public static float m4524(Object obj) {
        if (C1167.m4739() <= 0) {
            return ((Float) obj).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۢۤۥ, reason: not valid java name and contains not printable characters */
    public static String m4525(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static ActionMode m4526(Object obj, Object obj2, int i2) {
        if (C1177.m5152() > 0) {
            return AbstractC0796k.m2145b((Window.Callback) obj, (ActionMode.Callback) obj2, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟۠, reason: not valid java name and contains not printable characters */
    public static C0109e m4527() {
        if (C1176.m5115() <= 0) {
            return AbstractC0690f.f2752a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4528(Object obj, Object obj2) {
        if (C1174.m5008() > 0) {
            return ((Window.Callback) obj).dispatchKeyShortcutEvent((KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static Button m4529(Object obj) {
        if (C1178.m5174() <= 0) {
            return ((C0665g) obj).f2673i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥۧ, reason: not valid java name and contains not printable characters */
    public static void m4530(Object obj, Object obj2, Object obj3) {
        if (C1167.m4739() <= 0) {
            ((C0781d) obj).m2132e((String) obj2, (InterfaceC0780c) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۧ۠, reason: not valid java name and contains not printable characters */
    public static AnimatorSet m4531(Object obj) {
        if (C1132.m3217() >= 0) {
            return ((C0199e) obj).f652l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m4532(Object obj, int i2) {
        if (C1136.m3395() <= 0) {
            ((AutoCompleteTextView) obj).setThreshold(i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m4533(Object obj) {
        if (C1159.m4411() >= 0) {
            return ((Rect) obj).left;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m4534(Object obj, int i2) {
        if (C1126.m2964() <= 0) {
            return Arrays.copyOf((byte[]) obj, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۡۨ, reason: not valid java name and contains not printable characters */
    public static CharSequence m4535(Object obj) {
        if (C1155.m4177() >= 0) {
            return ((LayoutInflaterFactory2C0648D) obj).f2568q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۥ, reason: not valid java name and contains not printable characters */
    public static Object m4536(Object obj) {
        if (C1171.m4901() > 0) {
            return ((ArrayDeque) obj).poll();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static int[] m4537() {
        if (C1149.m3923() < 0) {
            return C0651G.f2584c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static void m4538(Object obj, Object obj2) {
        if (C1168.m4797() < 0) {
            ((C0788c) obj).m2136a((Configuration) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۥۧ, reason: not valid java name and contains not printable characters */
    public static TypedValue m4539(Object obj) {
        if (C0643.m4322() < 0) {
            return ((ContentFrameLayout) obj).getMinWidthMajor();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static void m4540(Object obj, int i2, boolean z2) {
        if (C1161.m4510() < 0) {
            ((C0311k) obj).m974h(i2, z2);
        }
    }

    /* JADX INFO: renamed from: ۡۤۦۤ, reason: not valid java name and contains not printable characters */
    public static void m4541(Object obj, float f, float f2, float f3, float f4) {
        if (C1167.m4739() < 0) {
            ((RectF) obj).set(f, f2, f3, f4);
        }
    }

    /* JADX INFO: renamed from: ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static void m4542(Object obj, float f) {
        if (C1126.m2964() <= 0) {
            ((View) obj).setTranslationY(f);
        }
    }

    /* JADX INFO: renamed from: ۡۦۢۨ, reason: not valid java name and contains not printable characters */
    public static void m4543(Object obj, Object obj2) {
        if (C1168.m4797() < 0) {
            ((Configuration) obj).setLocales((LocaleList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۦۥۤ, reason: not valid java name and contains not printable characters */
    public static View m4544(Object obj, int i2) {
        if (C1151.m4000() >= 0) {
            return ((Window.Callback) obj).onCreatePanelView(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢ, reason: not valid java name and contains not printable characters */
    public static void m4545(Object obj, boolean z2) {
        if (C1178.m5174() <= 0) {
            ((C0658N) obj).m1878q0(z2);
        }
    }

    /* JADX INFO: renamed from: ۢۤۢ۠, reason: not valid java name and contains not printable characters */
    public static void m4546(Object obj, boolean z2) {
        if (C1164.m4618() > 0) {
            ((ThreadPoolExecutor) obj).allowCoreThreadTimeOut(z2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۧ, reason: not valid java name and contains not printable characters */
    public static void m4547(Object obj, boolean z2) {
        if (C1132.m3217() > 0) {
            ((CheckableImageButton) obj).setChecked(z2);
        }
    }

    /* JADX INFO: renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static C0344r m4548() {
        if (C1129.m3120() < 0) {
            return MainActivity.f2465M;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۡۥ, reason: contains not printable characters */
    public static KeyCharacterMap m4549(int i2) {
        if (C1125.m2937() >= 0) {
            return KeyCharacterMap.load(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۢ, reason: contains not printable characters */
    public static Context m4550(Object obj) {
        if (C1148.m3908() > 0) {
            return ((C0658N) obj).m1879r0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m4551(Object obj) {
        if (C1152.m4038() > 0) {
            ((C0518H) obj).m1342L();
        }
    }

    /* JADX INFO: renamed from: ۧۢۦۨ, reason: not valid java name and contains not printable characters */
    public static Object m4552(Object obj, Object obj2) {
        if (C1136.m3395() <= 0) {
            return ((Parcelable.Creator) obj).createFromParcel((Parcel) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m4553(Object obj, int i2, int i3) {
        if (C1150.m3967() > 0) {
            return AbstractC0016e.m193q0((Context) obj, i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4554(Object obj) {
        if (C1133.m3246() < 0) {
            return ((AccessibilityManager) obj).isEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static int m4555(Object obj) {
        if (C1149.m3923() <= 0) {
            return ((C0667i) obj).f2694a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۧۡ, reason: not valid java name and contains not printable characters */
    public static String m4556(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
