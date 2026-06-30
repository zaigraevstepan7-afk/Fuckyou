package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.snackbar.C1157;
import java.util.ArrayList;
import p000A.C0001b;
import p005C0.C0048n;
import p036T.AbstractC0383m;
import p042W.C1139;
import p058d0.C0643;
import p070i0.C1163;
import p071j.C0795j;
import p074l.InterfaceC0923d;
import p074l.InterfaceC0957o0;
import p083p0.C1171;

/* JADX INFO: renamed from: e.N */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0658N extends AbstractC0383m implements InterfaceC0923d {

    /* JADX INFO: renamed from: N */
    public static final AccelerateInterpolator f2605N = null;

    /* JADX INFO: renamed from: O */
    public static final DecelerateInterpolator f2606O = null;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4891short = null;

    /* JADX INFO: renamed from: A */
    public boolean f2607A;

    /* JADX INFO: renamed from: B */
    public final ArrayList f2608B;

    /* JADX INFO: renamed from: C */
    public int f2609C;

    /* JADX INFO: renamed from: D */
    public boolean f2610D;

    /* JADX INFO: renamed from: E */
    public boolean f2611E;

    /* JADX INFO: renamed from: F */
    public boolean f2612F;

    /* JADX INFO: renamed from: G */
    public boolean f2613G;

    /* JADX INFO: renamed from: H */
    public C0795j f2614H;

    /* JADX INFO: renamed from: I */
    public boolean f2615I;

    /* JADX INFO: renamed from: J */
    public boolean f2616J;

    /* JADX INFO: renamed from: K */
    public final C0656L f2617K;

    /* JADX INFO: renamed from: L */
    public final C0656L f2618L;

    /* JADX INFO: renamed from: M */
    public final C0001b f2619M;

    /* JADX INFO: renamed from: p */
    public Context f2620p;

    /* JADX INFO: renamed from: q */
    public Context f2621q;

    /* JADX INFO: renamed from: r */
    public ActionBarOverlayLayout f2622r;

    /* JADX INFO: renamed from: s */
    public ActionBarContainer f2623s;

    /* JADX INFO: renamed from: t */
    public InterfaceC0957o0 f2624t;

    /* JADX INFO: renamed from: u */
    public ActionBarContextView f2625u;

    /* JADX INFO: renamed from: v */
    public final View f2626v;

    /* JADX INFO: renamed from: w */
    public boolean f2627w;

    /* JADX INFO: renamed from: x */
    public C0657M f2628x;

    /* JADX INFO: renamed from: y */
    public C0657M f2629y;

    /* JADX INFO: renamed from: z */
    public C0048n f2630z;

    static {
        ZLoader.registerNativesForClass(97, C0658N.class);
        Hidden0.special_clinit_97_00(C0658N.class);
    }

    public C0658N(Activity activity, boolean z2) {
        new ArrayList();
        this.f2608B = new ArrayList();
        this.f2609C = 0;
        this.f2610D = true;
        this.f2613G = true;
        this.f2617K = new C0656L(this, 0);
        this.f2618L = new C0656L(this, 1);
        this.f2619M = new C0001b(20, this);
        View viewM3520 = C1139.m3520(C1171.m4924(activity));
        C1163.m4568(this, viewM3520);
        if (z2) {
            return;
        }
        this.f2626v = C1157.m4247(viewM3520, R.id.content);
    }

    public C0658N(Dialog dialog) {
        new ArrayList();
        this.f2608B = new ArrayList();
        this.f2609C = 0;
        this.f2610D = true;
        this.f2613G = true;
        this.f2617K = new C0656L(this, 0);
        this.f2618L = new C0656L(this, 1);
        this.f2619M = new C0001b(20, this);
        C1163.m4568(this, C1139.m3520(C0643.m4324(dialog)));
    }

    /* JADX INFO: renamed from: ۟ۦۡۨۡ, reason: not valid java name and contains not printable characters */
    public static native short[] m4373();

    /* JADX INFO: renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static native int m4374(Object obj);

    /* JADX INFO: renamed from: q0 */
    public final native void m1878q0(boolean z2);

    /* JADX INFO: renamed from: r0 */
    public final native Context m1879r0();

    /* JADX INFO: renamed from: s0 */
    public final native void m1880s0(View view);

    /* JADX INFO: renamed from: t0 */
    public final native void m1881t0(boolean z2);

    /* JADX INFO: renamed from: u0 */
    public final native void m1882u0(boolean z2);

    /* JADX INFO: renamed from: v0 */
    public final native void m1883v0(boolean z2);
}
