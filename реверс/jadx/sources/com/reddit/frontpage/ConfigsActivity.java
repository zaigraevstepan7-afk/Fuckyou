package com.reddit.frontpage;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.C0476c;
import androidx.fragment.app.C0514D;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.C1157;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import p004C.C1122;
import p023M0.C0206l;
import p025N0.C1129;
import p025N0.C1130;
import p031Q0.C0336j;
import p031Q0.C0339m;
import p041V0.C1138;
import p060e.AbstractActivityC0669k;
import p070i0.C1163;
import p075l0.C1168;
import p086r.C1174;
import p097x.C1178;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public class ConfigsActivity extends AbstractActivityC0669k {

    /* JADX INFO: renamed from: H */
    public static final int f2454H = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4884short = null;

    /* JADX INFO: renamed from: A */
    public RecyclerView f2455A;

    /* JADX INFO: renamed from: B */
    public View f2456B;

    /* JADX INFO: renamed from: C */
    public TextView f2457C;

    /* JADX INFO: renamed from: D */
    public MaterialButton f2458D;

    /* JADX INFO: renamed from: E */
    public MaterialButton f2459E;

    /* JADX INFO: renamed from: F */
    public C0339m f2460F;

    /* JADX INFO: renamed from: G */
    public final C0476c f2461G;

    /* JADX INFO: renamed from: y */
    public final ArrayList f2462y = new ArrayList();

    /* JADX INFO: renamed from: z */
    public final SimpleDateFormat f2463z = new SimpleDateFormat(C1122.m2840(m4281(), 0, 16, 1731), C1130.m3155());

    static {
        ZLoader.registerNativesForClass(81, ConfigsActivity.class);
        Hidden0.special_clinit_81_00(ConfigsActivity.class);
    }

    public ConfigsActivity() {
        C0514D c0514d = new C0514D(1);
        C0206l c0206l = new C0206l(this);
        StringBuilder sb = new StringBuilder(C1138.m3516(m4281(), 16, 12, 2198));
        C1174.m5003(sb, C1129.m3094(C1157.m4252(this)));
        this.f2461G = C1178.m5181(C1163.m4569(this), C1168.m4783(sb), this, c0514d, c0206l);
    }

    /* JADX INFO: renamed from: B */
    public static native String m1797B(String str);

    /* JADX INFO: renamed from: C */
    public static native String m1798C(String str);

    /* JADX INFO: renamed from: E */
    public static native String m1799E(String str);

    /* JADX INFO: renamed from: r */
    public static native File m1800r(String str);

    /* JADX INFO: renamed from: v */
    public static native String m1801v();

    /* JADX INFO: renamed from: z */
    public static native ArrayList m1802z(File file);

    /* JADX INFO: renamed from: ۟ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static native short[] m4281();

    /* JADX INFO: renamed from: ۣ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static native int m4282(Object obj);

    /* JADX INFO: renamed from: A */
    public final native ArrayList m1803A(String str);

    /* JADX INFO: renamed from: D */
    public final native void m1804D(boolean z2);

    @Override // p060e.AbstractActivityC0669k, androidx.activity.AbstractActivityC0466k, p004C.AbstractActivityC0030k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // p060e.AbstractActivityC0669k, android.app.Activity
    public final native void onResume();

    /* JADX INFO: renamed from: s */
    public final native boolean m1805s(Uri uri, File file);

    /* JADX INFO: renamed from: t */
    public final native boolean m1806t();

    /* JADX INFO: renamed from: u */
    public final native C0336j m1807u(String str);

    /* JADX INFO: renamed from: w */
    public final native void m1808w();

    /* JADX INFO: renamed from: x */
    public final native boolean m1809x(File file, File file2);

    /* JADX INFO: renamed from: y */
    public final native void m1810y();
}
