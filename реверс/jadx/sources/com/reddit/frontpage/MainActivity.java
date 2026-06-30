package com.reddit.frontpage;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;
import com.google.android.material.textfield.TextInputEditText;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.SSLSocketFactory;
import p031Q0.C0336j;
import p031Q0.C0344r;
import p060e.AbstractActivityC0669k;
import p060e.DialogInterfaceC0666h;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public class MainActivity extends AbstractActivityC0669k {

    /* JADX INFO: renamed from: L */
    public static SSLSocketFactory f2464L;

    /* JADX INFO: renamed from: M */
    public static C0344r f2465M;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4885short = null;

    /* JADX INFO: renamed from: A */
    public TextView f2466A;

    /* JADX INFO: renamed from: B */
    public TextView f2467B;

    /* JADX INFO: renamed from: C */
    public TextView f2468C;

    /* JADX INFO: renamed from: D */
    public TextView f2469D;

    /* JADX INFO: renamed from: E */
    public TextInputEditText f2470E;

    /* JADX INFO: renamed from: F */
    public MaterialSwitch f2471F;

    /* JADX INFO: renamed from: G */
    public MaterialSwitch f2472G;

    /* JADX INFO: renamed from: H */
    public Slider f2473H;

    /* JADX INFO: renamed from: I */
    public TextView f2474I;

    /* JADX INFO: renamed from: J */
    public MaterialButton f2475J;

    /* JADX INFO: renamed from: K */
    public volatile boolean f2476K = false;

    /* JADX INFO: renamed from: y */
    public DialogInterfaceC0666h f2477y;

    /* JADX INFO: renamed from: z */
    public ProgressBar f2478z;

    static {
        ZLoader.registerNativesForClass(82, MainActivity.class);
        Hidden0.special_clinit_82_00(MainActivity.class);
    }

    /* JADX INFO: renamed from: A */
    public static native String m1811A(String str);

    /* JADX INFO: renamed from: B */
    public static native HttpURLConnection m1812B(URL url);

    /* JADX INFO: renamed from: C */
    public static native String m1813C(String str);

    /* JADX INFO: renamed from: E */
    public static native String m1814E(InputStream inputStream);

    /* JADX INFO: renamed from: I */
    public static native boolean m1815I(String str);

    /* JADX INFO: renamed from: r */
    public static native String m1816r(String str);

    /* JADX INFO: renamed from: t */
    public static native String m1817t(File file);

    /* JADX INFO: renamed from: v */
    public static native String m1818v(long j2);

    /* JADX INFO: renamed from: w */
    public static native String m1819w(double d2);

    /* JADX INFO: renamed from: z */
    public static native void m1820z();

    /* JADX INFO: renamed from: ۟۠ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static native short[] m4283();

    /* JADX INFO: renamed from: ۠ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static native int m4284(Object obj);

    /* JADX INFO: renamed from: D */
    public final native String m1821D(String str);

    /* JADX INFO: renamed from: F */
    public final native void m1822F();

    /* JADX INFO: renamed from: G */
    public final native int m1823G(String... strArr);

    /* JADX INFO: renamed from: H */
    public final native void m1824H(String str, String str2);

    @Override // p060e.AbstractActivityC0669k, androidx.activity.AbstractActivityC0466k, p004C.AbstractActivityC0030k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    /* JADX INFO: renamed from: s */
    public final native String m1825s();

    /* JADX INFO: renamed from: u */
    public final native C0336j m1826u(String str, File file);

    /* JADX INFO: renamed from: x */
    public final native String m1827x();

    /* JADX INFO: renamed from: y */
    public final native void m1828y();
}
