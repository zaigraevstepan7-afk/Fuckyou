package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.C1146;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import p001A0.C1121;
import p004C.C1122;
import p045X0.C1141;
import p051a1.C1145;
import p068h0.C1162;
import p074l.C0927e0;

/* JADX INFO: renamed from: M0.v */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0216v {

    /* JADX INFO: renamed from: A */
    public ColorStateList f717A;

    /* JADX INFO: renamed from: B */
    public Typeface f718B;

    /* JADX INFO: renamed from: a */
    public final int f719a;

    /* JADX INFO: renamed from: b */
    public final int f720b;

    /* JADX INFO: renamed from: c */
    public final int f721c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f722d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f723e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f724f;

    /* JADX INFO: renamed from: g */
    public final Context f725g;

    /* JADX INFO: renamed from: h */
    public final TextInputLayout f726h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f727i;

    /* JADX INFO: renamed from: j */
    public int f728j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f729k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f730l;

    /* JADX INFO: renamed from: m */
    public final float f731m;

    /* JADX INFO: renamed from: n */
    public int f732n;

    /* JADX INFO: renamed from: o */
    public int f733o;

    /* JADX INFO: renamed from: p */
    public CharSequence f734p;

    /* JADX INFO: renamed from: q */
    public boolean f735q;

    /* JADX INFO: renamed from: r */
    public C0927e0 f736r;

    /* JADX INFO: renamed from: s */
    public CharSequence f737s;

    /* JADX INFO: renamed from: t */
    public int f738t;

    /* JADX INFO: renamed from: u */
    public int f739u;

    /* JADX INFO: renamed from: v */
    public ColorStateList f740v;

    /* JADX INFO: renamed from: w */
    public CharSequence f741w;

    /* JADX INFO: renamed from: x */
    public boolean f742x;

    /* JADX INFO: renamed from: y */
    public C0927e0 f743y;

    /* JADX INFO: renamed from: z */
    public int f744z;

    static {
        ZLoader.registerNativesForClass(48, C0216v.class);
        Hidden0.special_clinit_48_00(C0216v.class);
    }

    public C0216v(TextInputLayout textInputLayout) {
        Context contextM3855 = C1146.m3855(textInputLayout);
        this.f725g = contextM3855;
        this.f726h = textInputLayout;
        this.f731m = C1121.m2805(C1127.m3012(contextM3855), R.dimen.resc);
        this.f719a = C1162.m4553(contextM3855, R.attr.resc, 217);
        this.f720b = C1162.m4553(contextM3855, R.attr.resc, 167);
        this.f721c = C1162.m4553(contextM3855, R.attr.resc, 167);
        this.f722d = C1141.m3626(contextM3855, R.attr.resc, C1145.m3810());
        LinearInterpolator linearInterpolatorM2816 = C1122.m2816();
        this.f723e = C1141.m3626(contextM3855, R.attr.resc, linearInterpolatorM2816);
        this.f724f = C1141.m3626(contextM3855, R.attr.resc, linearInterpolatorM2816);
    }

    /* JADX INFO: renamed from: a */
    public final native void m676a(C0927e0 c0927e0, int i2);

    /* JADX INFO: renamed from: b */
    public final native void m677b();

    /* JADX INFO: renamed from: c */
    public final native void m678c();

    /* JADX INFO: renamed from: d */
    public final native void m679d(ArrayList arrayList, boolean z2, C0927e0 c0927e0, int i2, int i3, int i4);

    /* JADX INFO: renamed from: e */
    public final native TextView m680e(int i2);

    /* JADX INFO: renamed from: f */
    public final native void m681f();

    /* JADX INFO: renamed from: g */
    public final native void m682g(C0927e0 c0927e0, int i2);

    /* JADX INFO: renamed from: h */
    public final native boolean m683h(C0927e0 c0927e0, CharSequence charSequence);

    /* JADX INFO: renamed from: i */
    public final native void m684i(int i2, int i3, boolean z2);
}
