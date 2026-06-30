package p050a0;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractComponentCallbacksC0548r;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.C1147;
import androidx.lifecycle.InterfaceC0586r;
import androidx.profileinstaller.C1148;
import androidx.recyclerview.widget.RecyclerView;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.datepicker.C1155;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p015I0.C1125;
import p019K0.AbstractC0165g;
import p019K0.C0162d;
import p019K0.C0164f;
import p023M0.AbstractC0213s;
import p023M0.C0198d;
import p023M0.C0199e;
import p023M0.C0207m;
import p023M0.C0209o;
import p023M0.C0212r;
import p023M0.C0214t;
import p023M0.C0216v;
import p024N.AbstractC0227E;
import p024N.C0270l;
import p025N0.C1129;
import p025N0.C1131;
import p037T0.C1135;
import p037T0.C1136;
import p042W.AbstractC0401b;
import p044X.C1140;
import p045X0.C1141;
import p051a1.C1144;
import p052b0.C1151;
import p060e.AbstractActivityC0669k;
import p060e.C0647C;
import p060e.C0656L;
import p060e.C0658N;
import p066g0.C0762m;
import p068h0.C1162;
import p070i0.C1163;
import p070i0.C1164;
import p072k.C0812i;
import p074l.C0944k;
import p074l.C0946k1;
import p077m0.C1169;
import p084q.C1031j;
import p084q.C1172;
import p084q.C1173;
import p086r.C1174;
import p092u0.C1176;

/* JADX INFO: renamed from: a0.ۣۣ۟ۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1142 {

    /* JADX INFO: renamed from: ۟ۤۦۣۣ, reason: not valid java name and contains not printable characters */
    public static int f4868 = 536;

    /* JADX INFO: renamed from: ۟۟ۢۦۦ, reason: not valid java name and contains not printable characters */
    public static void m3642(Object obj) {
        if (m3681() < 0) {
            AbstractC0227E.m698c((View) obj);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static Rect m3643(Object obj) {
        if (C1140.m3595() > 0) {
            return ((C0162d) obj).f502r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static InputStream m3644(Object obj) {
        if (C1150.m3967() > 0) {
            return ((URLConnection) obj).getInputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m3645(Object obj, Object obj2) {
        if (C1148.m3908() >= 0) {
            return ((C1031j) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static String m3646(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۥۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3647(Object obj) {
        if (C1129.m3120() <= 0) {
            return ((C0946k1) obj).f3775g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ۟, reason: not valid java name and contains not printable characters */
    public static C0216v m3648(Object obj) {
        if (C1169.m4842() < 0) {
            return ((C0214t) obj).f715e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۧۤ, reason: not valid java name and contains not printable characters */
    public static double m3649(double d2) {
        if (C1151.m4000() > 0) {
            return Math.abs(d2);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static C0588t m3650(Object obj) {
        if (C1148.m3908() > 0) {
            return ((AbstractComponentCallbacksC0548r) obj).f1771M;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m3651(Object obj) {
        if (C1169.m4842() <= 0) {
            return ((View) obj).getContentDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3652(Object obj, int i2) {
        if (C1163.m4579() >= 0) {
            return ((AbstractC0401b) obj).m1113w(i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Iterator m3653(Object obj) {
        if (C1149.m3923() <= 0) {
            return ((AbstractCollection) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3654(Object obj, Object obj2) {
        if (C1174.m5008() >= 0) {
            return ((View) obj).dispatchKeyShortcutEvent((KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3655(Object obj) {
        if (C1151.m4000() > 0) {
            return ((AbstractActivityC0669k) obj).f2700v;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3656(Object obj) {
        if (C1147.m1498() <= 0) {
            return ((C0944k) obj).m2382e();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3657(Object obj, Object obj2) {
        if (C1163.m4579() >= 0) {
            return ((Parcel) obj).createTypedArrayList((Parcelable.Creator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static InputStream m3658(Object obj) {
        if (C1136.m3395() < 0) {
            return ((Process) obj).getErrorStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m3659(Object obj) {
        if (C1148.m3908() > 0) {
            return ((C0647C) obj).f2509a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۨ, reason: not valid java name and contains not printable characters */
    public static float m3660(Object obj) {
        if (C1141.m3607() >= 0) {
            return ((C0164f) obj).f504a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۦۦۧ۠, reason: not valid java name and contains not printable characters */
    public static JSONObject m3661(Object obj, Object obj2, long j2) {
        if (C1131.m3177() <= 0) {
            return ((JSONObject) obj).put((String) obj2, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3662(Object obj) {
        if (C1144.m3748() <= 0) {
            return ((File) obj).isDirectory();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC0213s m3663(Object obj) {
        if (C1136.m3395() <= 0) {
            return ((C0212r) obj).m660b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡ۠, reason: not valid java name and contains not printable characters */
    public static void m3664(Object obj, int i2) {
        if (C1125.m2937() > 0) {
            ((ListView) obj).setSelection(i2);
        }
    }

    /* JADX INFO: renamed from: ۠ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static Paint.Cap m3665() {
        if (C1135.m3328() > 0) {
            return Paint.Cap.ROUND;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۧۢ, reason: not valid java name and contains not printable characters */
    public static void m3666(Object obj, Object obj2, long j2) {
        if (C1131.m3177() < 0) {
            ((View) obj).postOnAnimationDelayed((Runnable) obj2, j2);
        }
    }

    /* JADX INFO: renamed from: ۡۨ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m3667(Object obj) {
        if (C1151.m4000() >= 0) {
            return ((C0164f) obj).f508e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3668(Object obj) {
        if (C1155.m4177() > 0) {
            return ((C0207m) obj).f671m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۢۡ۠, reason: not valid java name and contains not printable characters */
    public static C0658N m3669(Object obj) {
        if (C1173.m4990() < 0) {
            return ((C0656L) obj).f2599l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۢۤ, reason: not valid java name and contains not printable characters */
    public static RecyclerView m3670(Object obj) {
        if (C1164.m4618() > 0) {
            return ((C0762m) obj).f3067s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static LayoutInflater m3671(Object obj) {
        if (C1155.m4177() > 0) {
            return ((C0812i) obj).f3307b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3672(Object obj, Object obj2) {
        if (C1162.m4523() < 0) {
            return ((Drawable) obj).getPadding((Rect) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m3673(Object obj) {
        if (C1140.m3595() > 0) {
            return ((AbstractC0165g) obj).f529U;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static C0212r m3674(Object obj) {
        if (C1147.m1498() <= 0) {
            return ((C0209o) obj).f678a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۥ, reason: not valid java name and contains not printable characters */
    public static int m3675(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۤۨۦ, reason: not valid java name and contains not printable characters */
    public static C0588t m3676(Object obj) {
        if (C1169.m4842() < 0) {
            return ((InterfaceC0586r) obj).mo1164d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۡۥ, reason: not valid java name and contains not printable characters */
    public static C0199e m3677(Object obj) {
        if (C1141.m3607() >= 0) {
            return ((C0198d) obj).f644b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۤۤ, reason: not valid java name and contains not printable characters */
    public static int m3678(Object obj) {
        if (C1176.m5115() < 0) {
            return ((TypedValue) obj).resourceId;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۟ۤۥ, reason: contains not printable characters */
    public static C0270l m3679(Object obj) {
        if (C1148.m3908() >= 0) {
            return ((Toolbar) obj).f1377G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۧۤ, reason: contains not printable characters */
    public static void m3680(Object obj, Object obj2) {
        if (C1135.m3328() > 0) {
            ((AdapterView) obj).setOnItemClickListener((AdapterView.OnItemClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۤۢۧ, reason: contains not printable characters */
    public static int m3681() {
        return 785 ^ C1144.f4870;
    }

    /* JADX INFO: renamed from: ۣۧۡۢ, reason: not valid java name and contains not printable characters */
    public static void m3682(Object obj, Object obj2) {
        if (C1154.m4128() > 0) {
            ((Window) obj).setBackgroundDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۥۤ۟, reason: not valid java name and contains not printable characters */
    public static Rect m3683(Object obj) {
        if (C1135.m3328() >= 0) {
            return ((ContentFrameLayout) obj).f1366g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۦۣ, reason: not valid java name and contains not printable characters */
    public static void m3685(Object obj) throws IOException {
        if (C1169.m4842() < 0) {
            ((BufferedReader) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣۣۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3686(Object obj) {
        if (C1172.m4932() <= 0) {
            return ((KeyEvent) obj).isShiftPressed();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧ۟۟, reason: not valid java name and contains not printable characters */
    public static String m3684(short[] sArr, int i2, int i3, int i4) {
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = (char) (sArr[i2 + i5] ^ i4);
        }
        return new String(cArr);
    }
}
