package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.fragment.app.AbstractC0537g;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import p014H0.C1124;
import p016J.C0133e;
import p024N.C0249a0;
import p032R.C1134;
import p037T0.C1135;
import p037T0.C1136;
import p050a0.C1142;
import p071j.AbstractC0786a;
import p071j.C0793h;
import p072k.InterfaceC0814k;
import p072k.MenuC0816m;
import p073k0.C1167;
import p074l.InterfaceC0954n0;
import p077m0.C1169;
import p084q.C1031j;
import p100z.C1180;

/* JADX INFO: renamed from: e.D */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class LayoutInflaterFactory2C0648D extends AbstractC0676r implements InterfaceC0814k, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: h0 */
    public static final C1031j f2525h0 = null;

    /* JADX INFO: renamed from: i0 */
    public static final int[] f2526i0 = null;

    /* JADX INFO: renamed from: j0 */
    public static final boolean f2527j0 = false;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4888short = null;

    /* JADX INFO: renamed from: A */
    public ViewGroup f2528A;

    /* JADX INFO: renamed from: B */
    public TextView f2529B;

    /* JADX INFO: renamed from: C */
    public View f2530C;

    /* JADX INFO: renamed from: D */
    public boolean f2531D;

    /* JADX INFO: renamed from: E */
    public boolean f2532E;

    /* JADX INFO: renamed from: F */
    public boolean f2533F;

    /* JADX INFO: renamed from: G */
    public boolean f2534G;

    /* JADX INFO: renamed from: H */
    public boolean f2535H;

    /* JADX INFO: renamed from: I */
    public boolean f2536I;

    /* JADX INFO: renamed from: J */
    public boolean f2537J;

    /* JADX INFO: renamed from: K */
    public boolean f2538K;

    /* JADX INFO: renamed from: L */
    public C0647C[] f2539L;

    /* JADX INFO: renamed from: M */
    public C0647C f2540M;

    /* JADX INFO: renamed from: N */
    public boolean f2541N;

    /* JADX INFO: renamed from: O */
    public boolean f2542O;

    /* JADX INFO: renamed from: P */
    public boolean f2543P;

    /* JADX INFO: renamed from: Q */
    public boolean f2544Q;

    /* JADX INFO: renamed from: R */
    public Configuration f2545R;

    /* JADX INFO: renamed from: S */
    public final int f2546S;

    /* JADX INFO: renamed from: T */
    public int f2547T;

    /* JADX INFO: renamed from: U */
    public int f2548U;

    /* JADX INFO: renamed from: V */
    public boolean f2549V;

    /* JADX INFO: renamed from: W */
    public C0684z f2550W;

    /* JADX INFO: renamed from: X */
    public C0684z f2551X;

    /* JADX INFO: renamed from: Y */
    public boolean f2552Y;

    /* JADX INFO: renamed from: Z */
    public int f2553Z;

    /* JADX INFO: renamed from: b0 */
    public boolean f2555b0;

    /* JADX INFO: renamed from: c0 */
    public Rect f2556c0;

    /* JADX INFO: renamed from: d0 */
    public Rect f2557d0;

    /* JADX INFO: renamed from: e0 */
    public C0651G f2558e0;

    /* JADX INFO: renamed from: f0 */
    public OnBackInvokedDispatcher f2559f0;

    /* JADX INFO: renamed from: g0 */
    public OnBackInvokedCallback f2560g0;

    /* JADX INFO: renamed from: j */
    public final Object f2561j;

    /* JADX INFO: renamed from: k */
    public final Context f2562k;

    /* JADX INFO: renamed from: l */
    public Window f2563l;

    /* JADX INFO: renamed from: m */
    public WindowCallbackC0683y f2564m;

    /* JADX INFO: renamed from: n */
    public final Object f2565n;

    /* JADX INFO: renamed from: o */
    public C0658N f2566o;

    /* JADX INFO: renamed from: p */
    public C0793h f2567p;

    /* JADX INFO: renamed from: q */
    public CharSequence f2568q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0954n0 f2569r;

    /* JADX INFO: renamed from: s */
    public C0678t f2570s;

    /* JADX INFO: renamed from: t */
    public C0678t f2571t;

    /* JADX INFO: renamed from: u */
    public AbstractC0786a f2572u;

    /* JADX INFO: renamed from: v */
    public ActionBarContextView f2573v;

    /* JADX INFO: renamed from: w */
    public PopupWindow f2574w;

    /* JADX INFO: renamed from: x */
    public RunnableC0677s f2575x;

    /* JADX INFO: renamed from: z */
    public boolean f2577z;

    /* JADX INFO: renamed from: y */
    public C0249a0 f2576y = null;

    /* JADX INFO: renamed from: a0 */
    public final RunnableC0677s f2554a0 = new RunnableC0677s(this, 0);

    static {
        ZLoader.registerNativesForClass(87, LayoutInflaterFactory2C0648D.class);
        Hidden0.special_clinit_87_00(LayoutInflaterFactory2C0648D.class);
    }

    public LayoutInflaterFactory2C0648D(Context context, Window window, InterfaceC0670l interfaceC0670l, Object obj) {
        AbstractActivityC0669k abstractActivityC0669k = null;
        this.f2546S = -100;
        this.f2562k = context;
        this.f2565n = interfaceC0670l;
        this.f2561j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC0669k)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = C1135.m3363((ContextWrapper) context);
                        }
                    } else {
                        abstractActivityC0669k = (AbstractActivityC0669k) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC0669k != null) {
                this.f2546S = C1136.m3378((LayoutInflaterFactory2C0648D) C1169.m4812(abstractActivityC0669k));
            }
        }
        if (C1136.m3378(this) == -100) {
            C1031j c1031jM4826 = C1169.m4826();
            Integer num = (Integer) C1142.m3645(c1031jM4826, C1134.m3290(C1150.m3951(C1146.m3841(this))));
            if (num != null) {
                this.f2546S = C1180.m5269(num);
                C1124.m2882(c1031jM4826, C1134.m3290(C1150.m3951(C1146.m3841(this))));
            }
        }
        if (window != null) {
            C1167.m4726(this, window);
        }
        C1149.m3937();
    }

    /* JADX INFO: renamed from: m */
    public static native C0133e m1830m(Context context);

    /* JADX INFO: renamed from: q */
    public static native Configuration m1831q(Context context, int i2, C0133e c0133e, Configuration configuration, boolean z2);

    /* JADX INFO: renamed from: y */
    public static native C0133e m1832y(Configuration configuration);

    /* JADX INFO: renamed from: ۟ۡۥۢۡ, reason: not valid java name and contains not printable characters */
    public static native int m4369(Object obj);

    /* JADX INFO: renamed from: ۟ۤ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static native short[] m4370();

    /* JADX INFO: renamed from: A */
    public final native void m1833A();

    /* JADX INFO: renamed from: B */
    public final native void m1834B(int i2);

    /* JADX INFO: renamed from: C */
    public final native int m1835C(Context context, int i2);

    /* JADX INFO: renamed from: D */
    public final native boolean m1836D();

    /* JADX INFO: renamed from: E */
    public final native void m1837E(C0647C c0647c, KeyEvent keyEvent);

    /* JADX INFO: renamed from: F */
    public final native boolean m1838F(C0647C c0647c, int i2, KeyEvent keyEvent);

    /* JADX INFO: renamed from: G */
    public final native boolean m1839G(C0647C c0647c, KeyEvent keyEvent);

    /* JADX INFO: renamed from: H */
    public final native void m1840H();

    /* JADX INFO: renamed from: I */
    public final native void m1841I();

    @Override // p060e.AbstractC0676r
    /* JADX INFO: renamed from: a */
    public final native void mo1842a();

    @Override // p060e.AbstractC0676r
    /* JADX INFO: renamed from: c */
    public final native void mo1843c();

    @Override // p060e.AbstractC0676r
    /* JADX INFO: renamed from: d */
    public final native void mo1844d();

    @Override // p060e.AbstractC0676r
    /* JADX INFO: renamed from: f */
    public final native boolean mo1845f(int i2);

    @Override // p060e.AbstractC0676r
    /* JADX INFO: renamed from: g */
    public final native void mo1846g(int i2);

    @Override // p060e.AbstractC0676r
    /* JADX INFO: renamed from: h */
    public final native void mo1847h(View view);

    @Override // p060e.AbstractC0676r
    /* JADX INFO: renamed from: i */
    public final native void mo1848i(View view, ViewGroup.LayoutParams layoutParams);

    @Override // p060e.AbstractC0676r
    /* JADX INFO: renamed from: j */
    public final native void mo1849j(CharSequence charSequence);

    /* JADX INFO: renamed from: k */
    public final native boolean m1850k(boolean z2, boolean z3);

    /* JADX INFO: renamed from: l */
    public final native void m1851l(Window window);

    /* JADX INFO: renamed from: n */
    public final native void m1852n(int i2, C0647C c0647c, MenuC0816m menuC0816m);

    /* JADX INFO: renamed from: o */
    public final native void m1853o(MenuC0816m menuC0816m);

    @Override // android.view.LayoutInflater.Factory2
    public final native View onCreateView(View view, String str, Context context, AttributeSet attributeSet);

    @Override // android.view.LayoutInflater.Factory
    public final native View onCreateView(String str, Context context, AttributeSet attributeSet);

    /* JADX INFO: renamed from: p */
    public final native void m1854p(C0647C c0647c, boolean z2);

    /* JADX INFO: renamed from: r */
    public final native boolean m1855r(KeyEvent keyEvent);

    /* JADX INFO: renamed from: s */
    public final native void m1856s(int i2);

    /* JADX INFO: renamed from: t */
    public final native void m1857t();

    /* JADX INFO: renamed from: u */
    public final native void m1858u();

    @Override // p072k.InterfaceC0814k
    /* JADX INFO: renamed from: v */
    public final native void mo57v(MenuC0816m menuC0816m);

    @Override // p072k.InterfaceC0814k
    /* JADX INFO: renamed from: w */
    public final native boolean mo58w(MenuC0816m menuC0816m, MenuItem menuItem);

    /* JADX INFO: renamed from: x */
    public final native AbstractC0537g m1859x(Context context);

    /* JADX INFO: renamed from: z */
    public final native C0647C m1860z(int i2);
}
