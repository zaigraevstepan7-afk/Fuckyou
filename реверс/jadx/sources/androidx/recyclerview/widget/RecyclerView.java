package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.emoji2.text.AbstractC0493g;
import androidx.fragment.app.AbstractC0529T;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000A.C0001b;
import p001A0.AbstractC0016e;
import p005C0.C0048n;
import p018K.C0149e;
import p022M.C0186c;
import p023M0.RunnableC0191D;
import p024N.AbstractC0229G;
import p024N.AbstractC0231I;
import p024N.AbstractC0240S;
import p024N.AbstractC0241T;
import p024N.AbstractC0244W;
import p024N.C0260g;
import p024N.C0274n;
import p024N.C0280q;
import p036T.AbstractC0383m;
import p038U.C0393a;
import p042W.InterpolatorC0403d;
import p063f0.AbstractC0697a;
import p066g0.AbstractC0714B;
import p066g0.AbstractC0718F;
import p066g0.AbstractC0719G;
import p066g0.AbstractC0720H;
import p066g0.AbstractC0723K;
import p066g0.AbstractC0725M;
import p066g0.AbstractC0726N;
import p066g0.AbstractC0737Z;
import p066g0.AbstractC0741b0;
import p066g0.C0713A;
import p066g0.C0724L;
import p066g0.C0727O;
import p066g0.C0728P;
import p066g0.C0729Q;
import p066g0.C0731T;
import p066g0.C0732U;
import p066g0.C0735X;
import p066g0.C0736Y;
import p066g0.C0738a;
import p066g0.C0742c;
import p066g0.C0745d0;
import p066g0.C0756j;
import p066g0.C0761l0;
import p066g0.C0762m;
import p066g0.C0763n;
import p066g0.C0772w;
import p066g0.C0774y;
import p066g0.C0775z;
import p066g0.InterfaceC0717E;
import p066g0.InterfaceC0730S;
import p066g0.InterfaceC0734W;
import p066g0.RunnableC0739a0;
import p066g0.RunnableC0765p;
import p084q.C1029h;
import p084q.C1031j;
import p089t.AbstractC1048e;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: A0 */
    public static boolean f1926A0;

    /* JADX INFO: renamed from: B0 */
    public static final int[] f1927B0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: C0 */
    public static final float f1928C0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: D0 */
    public static final boolean f1929D0;

    /* JADX INFO: renamed from: E0 */
    public static final boolean f1930E0;

    /* JADX INFO: renamed from: F0 */
    public static final Class[] f1931F0;

    /* JADX INFO: renamed from: G0 */
    public static final InterpolatorC0403d f1932G0;

    /* JADX INFO: renamed from: H0 */
    public static final C0736Y f1933H0;

    /* JADX INFO: renamed from: z0 */
    public static boolean f1934z0;

    /* JADX INFO: renamed from: A */
    public boolean f1935A;

    /* JADX INFO: renamed from: B */
    public boolean f1936B;

    /* JADX INFO: renamed from: C */
    public int f1937C;

    /* JADX INFO: renamed from: D */
    public int f1938D;

    /* JADX INFO: renamed from: E */
    public AbstractC0718F f1939E;

    /* JADX INFO: renamed from: F */
    public EdgeEffect f1940F;

    /* JADX INFO: renamed from: G */
    public EdgeEffect f1941G;

    /* JADX INFO: renamed from: H */
    public EdgeEffect f1942H;

    /* JADX INFO: renamed from: I */
    public EdgeEffect f1943I;

    /* JADX INFO: renamed from: J */
    public AbstractC0719G f1944J;

    /* JADX INFO: renamed from: K */
    public int f1945K;

    /* JADX INFO: renamed from: L */
    public int f1946L;

    /* JADX INFO: renamed from: M */
    public VelocityTracker f1947M;

    /* JADX INFO: renamed from: N */
    public int f1948N;

    /* JADX INFO: renamed from: O */
    public int f1949O;

    /* JADX INFO: renamed from: P */
    public int f1950P;

    /* JADX INFO: renamed from: Q */
    public int f1951Q;

    /* JADX INFO: renamed from: R */
    public int f1952R;

    /* JADX INFO: renamed from: S */
    public AbstractC0725M f1953S;

    /* JADX INFO: renamed from: T */
    public final int f1954T;

    /* JADX INFO: renamed from: U */
    public final int f1955U;

    /* JADX INFO: renamed from: V */
    public final float f1956V;

    /* JADX INFO: renamed from: W */
    public final float f1957W;

    /* JADX INFO: renamed from: a */
    public final float f1958a;

    /* JADX INFO: renamed from: a0 */
    public boolean f1959a0;

    /* JADX INFO: renamed from: b */
    public final C0731T f1960b;

    /* JADX INFO: renamed from: b0 */
    public final RunnableC0739a0 f1961b0;

    /* JADX INFO: renamed from: c */
    public final C0729Q f1962c;

    /* JADX INFO: renamed from: c0 */
    public RunnableC0765p f1963c0;

    /* JADX INFO: renamed from: d */
    public C0732U f1964d;

    /* JADX INFO: renamed from: d0 */
    public final C0763n f1965d0;

    /* JADX INFO: renamed from: e */
    public final C0149e f1966e;

    /* JADX INFO: renamed from: e0 */
    public final C0735X f1967e0;

    /* JADX INFO: renamed from: f */
    public final C0742c f1968f;

    /* JADX INFO: renamed from: f0 */
    public AbstractC0726N f1969f0;

    /* JADX INFO: renamed from: g */
    public final C0048n f1970g;

    /* JADX INFO: renamed from: g0 */
    public ArrayList f1971g0;

    /* JADX INFO: renamed from: h */
    public boolean f1972h;

    /* JADX INFO: renamed from: h0 */
    public boolean f1973h0;

    /* JADX INFO: renamed from: i */
    public final Rect f1974i;

    /* JADX INFO: renamed from: i0 */
    public boolean f1975i0;

    /* JADX INFO: renamed from: j */
    public final Rect f1976j;

    /* JADX INFO: renamed from: j0 */
    public final C0713A f1977j0;

    /* JADX INFO: renamed from: k */
    public final RectF f1978k;

    /* JADX INFO: renamed from: k0 */
    public boolean f1979k0;

    /* JADX INFO: renamed from: l */
    public AbstractC0714B f1980l;

    /* JADX INFO: renamed from: l0 */
    public C0745d0 f1981l0;

    /* JADX INFO: renamed from: m */
    public AbstractC0723K f1982m;

    /* JADX INFO: renamed from: m0 */
    public final int[] f1983m0;

    /* JADX INFO: renamed from: n */
    public final ArrayList f1984n;

    /* JADX INFO: renamed from: n0 */
    public C0274n f1985n0;

    /* JADX INFO: renamed from: o */
    public final ArrayList f1986o;

    /* JADX INFO: renamed from: o0 */
    public final int[] f1987o0;

    /* JADX INFO: renamed from: p */
    public final ArrayList f1988p;

    /* JADX INFO: renamed from: p0 */
    public final int[] f1989p0;

    /* JADX INFO: renamed from: q */
    public C0762m f1990q;

    /* JADX INFO: renamed from: q0 */
    public final int[] f1991q0;

    /* JADX INFO: renamed from: r */
    public boolean f1992r;

    /* JADX INFO: renamed from: r0 */
    public final ArrayList f1993r0;

    /* JADX INFO: renamed from: s */
    public boolean f1994s;

    /* JADX INFO: renamed from: s0 */
    public final RunnableC0191D f1995s0;

    /* JADX INFO: renamed from: t */
    public boolean f1996t;

    /* JADX INFO: renamed from: t0 */
    public boolean f1997t0;

    /* JADX INFO: renamed from: u */
    public int f1998u;

    /* JADX INFO: renamed from: u0 */
    public int f1999u0;

    /* JADX INFO: renamed from: v */
    public boolean f2000v;

    /* JADX INFO: renamed from: v0 */
    public int f2001v0;

    /* JADX INFO: renamed from: w */
    public boolean f2002w;

    /* JADX INFO: renamed from: w0 */
    public final boolean f2003w0;

    /* JADX INFO: renamed from: x */
    public boolean f2004x;

    /* JADX INFO: renamed from: x0 */
    public final C0713A f2005x0;

    /* JADX INFO: renamed from: y */
    public int f2006y;

    /* JADX INFO: renamed from: y0 */
    public final C0260g f2007y0;

    /* JADX INFO: renamed from: z */
    public final AccessibilityManager f2008z;

    static {
        f1929D0 = Build.VERSION.SDK_INT >= 23;
        f1930E0 = true;
        Class cls = Integer.TYPE;
        f1931F0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1932G0 = new InterpolatorC0403d(1);
        f1933H0 = new C0736Y();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.reddit.frontpage.R.attr.resc);
    }

    /* JADX INFO: renamed from: G */
    public static RecyclerView m1585G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewM1585G = m1585G(viewGroup.getChildAt(i2));
            if (recyclerViewM1585G != null) {
                return recyclerViewM1585G;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public static AbstractC0741b0 m1586M(View view) {
        if (view == null) {
            return null;
        }
        return ((C0724L) view.getLayoutParams()).f2876a;
    }

    private C0274n getScrollingChildHelper() {
        if (this.f1985n0 == null) {
            this.f1985n0 = new C0274n(this);
        }
        return this.f1985n0;
    }

    /* JADX INFO: renamed from: l */
    public static void m1593l(AbstractC0741b0 abstractC0741b0) {
        WeakReference weakReference = abstractC0741b0.f2932b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC0741b0.f2931a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC0741b0.f2932b = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static int m1594o(int i2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i2 > 0 && edgeEffect != null && AbstractC0016e.m164N(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC0016e.m185m0(edgeEffect, ((-i2) * 4.0f) / i3, 0.5f) * ((-i3) / 4.0f));
            if (iRound != i2) {
                edgeEffect.finish();
            }
            return i2 - iRound;
        }
        if (i2 >= 0 || edgeEffect2 == null || AbstractC0016e.m164N(edgeEffect2) == 0.0f) {
            return i2;
        }
        float f = i3;
        int iRound2 = Math.round(AbstractC0016e.m185m0(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i2) {
            edgeEffect2.finish();
        }
        return i2 - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        f1934z0 = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        f1926A0 = z2;
    }

    /* JADX INFO: renamed from: A */
    public final void m1595A() {
        if (this.f1941G != null) {
            return;
        }
        ((C0736Y) this.f1939E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1941G = edgeEffect;
        if (this.f1972h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: B */
    public final String m1596B() {
        return " " + super.toString() + ", adapter:" + this.f1980l + ", layout:" + this.f1982m + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: C */
    public final void m1597C(C0735X c0735x) {
        if (getScrollState() != 2) {
            c0735x.getClass();
            return;
        }
        OverScroller overScroller = this.f1961b0.f2923c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0735x.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX INFO: renamed from: D */
    public final View m1598D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1599E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f1988p;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0762m c0762m = (C0762m) arrayList.get(i2);
            int i3 = c0762m.f3070v;
            if (i3 == 1) {
                boolean zM2095d = c0762m.m2095d(motionEvent.getX(), motionEvent.getY());
                boolean zM2094c = c0762m.m2094c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zM2095d || zM2094c)) {
                    if (zM2094c) {
                        c0762m.f3071w = 1;
                        c0762m.f3064p = (int) motionEvent.getX();
                    } else if (zM2095d) {
                        c0762m.f3071w = 2;
                        c0762m.f3061m = (int) motionEvent.getY();
                    }
                    c0762m.m2096f(2);
                    if (action == 3) {
                        this.f1990q = c0762m;
                        return true;
                    }
                }
            } else if (i3 != 2) {
                continue;
            } else if (action == 3) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final void m1600F(int[] iArr) {
        int iM2067e = this.f1968f.m2067e();
        if (iM2067e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iM2067e; i4++) {
            AbstractC0741b0 abstractC0741b0M1586M = m1586M(this.f1968f.m2066d(i4));
            if (!abstractC0741b0M1586M.m2061o()) {
                int iM2048b = abstractC0741b0M1586M.m2048b();
                if (iM2048b < i2) {
                    i2 = iM2048b;
                }
                if (iM2048b > i3) {
                    i3 = iM2048b;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    /* JADX INFO: renamed from: H */
    public final AbstractC0741b0 m1601H(int i2) {
        AbstractC0741b0 abstractC0741b0 = null;
        if (this.f1935A) {
            return null;
        }
        int iM2070h = this.f1968f.m2070h();
        for (int i3 = 0; i3 < iM2070h; i3++) {
            AbstractC0741b0 abstractC0741b0M1586M = m1586M(this.f1968f.m2069g(i3));
            if (abstractC0741b0M1586M != null && !abstractC0741b0M1586M.m2054h() && m1603J(abstractC0741b0M1586M) == i2) {
                if (!this.f1968f.f2952c.contains(abstractC0741b0M1586M.f2931a)) {
                    return abstractC0741b0M1586M;
                }
                abstractC0741b0 = abstractC0741b0M1586M;
            }
        }
        return abstractC0741b0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fa  */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1602I(int i2, int i3, int i4, int i5) {
        int iMax;
        int i6;
        RunnableC0739a0 runnableC0739a0;
        float f;
        float f2;
        boolean z2;
        boolean z3;
        int minFlingVelocity;
        boolean z4;
        boolean z5;
        int iM1989G;
        PointF pointFMo1566a;
        int i7;
        int i8;
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.f2002w) {
            boolean zMo1571d = abstractC0723K.mo1571d();
            boolean zMo1572e = this.f1982m.mo1572e();
            int i9 = (!zMo1571d || Math.abs(i2) < i4) ? 0 : i2;
            int iMax2 = (!zMo1572e || Math.abs(i3) < i4) ? 0 : i3;
            if (i9 != 0 || iMax2 != 0) {
                if (i9 == 0) {
                    iMax = 0;
                    if (iMax2 == 0) {
                        i6 = iMax2;
                        iMax2 = 0;
                        runnableC0739a0 = this.f1961b0;
                        if (iMax == 0 || iMax2 != 0) {
                            int i10 = -i5;
                            iMax = Math.max(i10, Math.min(iMax, i5));
                            iMax2 = Math.max(i10, Math.min(iMax2, i5));
                            m1633k0(1);
                            runnableC0739a0.m2036a(iMax, iMax2);
                        }
                        if (i9 == 0 || i6 != 0) {
                            f = i9;
                            f2 = i6;
                            if (!dispatchNestedPreFling(f, f2)) {
                                boolean z6 = zMo1571d || zMo1572e;
                                dispatchNestedFling(f, f2, z6);
                                AbstractC0725M abstractC0725M = this.f1953S;
                                if (abstractC0725M != null) {
                                    C0775z c0775z = (C0775z) abstractC0725M;
                                    AbstractC0723K layoutManager = c0775z.f3144a.getLayoutManager();
                                    if (layoutManager != 0 && c0775z.f3144a.getAdapter() != null && ((Math.abs(i6) > (minFlingVelocity = c0775z.f3144a.getMinFlingVelocity()) || Math.abs(i9) > minFlingVelocity) && ((z4 = layoutManager instanceof InterfaceC0734W)))) {
                                        View view = null;
                                        C0774y c0774y = !z4 ? null : new C0774y(c0775z, c0775z.f3144a.getContext(), 0);
                                        if (c0774y == null) {
                                            z2 = z6;
                                            z3 = false;
                                        } else {
                                            int iM1996B = layoutManager.m1996B();
                                            if (iM1996B != 0) {
                                                AbstractC0493g abstractC0493gM2121e = layoutManager.mo1572e() ? c0775z.m2121e(layoutManager) : layoutManager.mo1571d() ? c0775z.m2120d(layoutManager) : null;
                                                if (abstractC0493gM2121e == null) {
                                                    z2 = z6;
                                                    z5 = true;
                                                    iM1989G = -1;
                                                    i7 = -1;
                                                    z3 = false;
                                                } else {
                                                    z3 = false;
                                                    int iM2014v = layoutManager.m2014v();
                                                    View view2 = null;
                                                    z5 = true;
                                                    int i11 = Integer.MIN_VALUE;
                                                    int i12 = Integer.MAX_VALUE;
                                                    int i13 = 0;
                                                    while (i13 < iM2014v) {
                                                        boolean z7 = z6;
                                                        View viewM2013u = layoutManager.m2013u(i13);
                                                        if (viewM2013u == null) {
                                                            i8 = iM2014v;
                                                        } else {
                                                            i8 = iM2014v;
                                                            int iM2117b = C0775z.m2117b(viewM2013u, abstractC0493gM2121e);
                                                            if (iM2117b <= 0 && iM2117b > i11) {
                                                                view2 = viewM2013u;
                                                                i11 = iM2117b;
                                                            }
                                                            if (iM2117b >= 0 && iM2117b < i12) {
                                                                view = viewM2013u;
                                                                i12 = iM2117b;
                                                            }
                                                        }
                                                        i13++;
                                                        z6 = z7;
                                                        iM2014v = i8;
                                                    }
                                                    z2 = z6;
                                                    boolean z8 = !layoutManager.mo1571d() ? i6 <= 0 : i9 <= 0;
                                                    if (z8 && view != null) {
                                                        iM1989G = AbstractC0723K.m1989G(view);
                                                    } else if (z8 || view2 == null) {
                                                        if (z8) {
                                                            view = view2;
                                                        }
                                                        if (view == null) {
                                                            iM1989G = -1;
                                                        } else {
                                                            iM1989G = ((z4 && (pointFMo1566a = ((InterfaceC0734W) layoutManager).mo1566a(layoutManager.m1996B() + (-1))) != null && ((pointFMo1566a.x > 0.0f ? 1 : (pointFMo1566a.x == 0.0f ? 0 : -1)) < 0 || (pointFMo1566a.y > 0.0f ? 1 : (pointFMo1566a.y == 0.0f ? 0 : -1)) < 0)) == z8 ? -1 : 1) + AbstractC0723K.m1989G(view);
                                                            if (iM1989G < 0 || iM1989G >= iM1996B) {
                                                            }
                                                        }
                                                    } else {
                                                        iM1989G = AbstractC0723K.m1989G(view2);
                                                    }
                                                    i7 = -1;
                                                }
                                                if (iM1989G != i7) {
                                                    c0774y.f3125a = iM1989G;
                                                    layoutManager.m1997B0(c0774y);
                                                    return z5;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!z2) {
                                    return z3;
                                }
                                m1633k0(1);
                                int i14 = -i5;
                                runnableC0739a0.m2036a(Math.max(i14, Math.min(i9, i5)), Math.max(i14, Math.min(i6, i5)));
                                return true;
                            }
                        } else if (iMax != 0 || iMax2 != 0) {
                            return true;
                        }
                    } else {
                        EdgeEffect edgeEffect = this.f1941G;
                        if (edgeEffect == null || AbstractC0016e.m164N(edgeEffect) == 0.0f) {
                            EdgeEffect edgeEffect2 = this.f1943I;
                            if (edgeEffect2 != null && AbstractC0016e.m164N(edgeEffect2) != 0.0f) {
                                if (m1625g0(this.f1943I, iMax2, getHeight())) {
                                    this.f1943I.onAbsorb(iMax2);
                                    iMax2 = 0;
                                }
                                i6 = 0;
                                runnableC0739a0 = this.f1961b0;
                                if (iMax == 0) {
                                    int i102 = -i5;
                                    iMax = Math.max(i102, Math.min(iMax, i5));
                                    iMax2 = Math.max(i102, Math.min(iMax2, i5));
                                    m1633k0(1);
                                    runnableC0739a0.m2036a(iMax, iMax2);
                                    if (i9 == 0) {
                                        f = i9;
                                        f2 = i6;
                                        if (!dispatchNestedPreFling(f, f2)) {
                                        }
                                    }
                                }
                            }
                            i6 = iMax2;
                            iMax2 = 0;
                            runnableC0739a0 = this.f1961b0;
                            if (iMax == 0) {
                            }
                        } else {
                            int i15 = -iMax2;
                            if (m1625g0(this.f1941G, i15, getHeight())) {
                                this.f1941G.onAbsorb(i15);
                                iMax2 = 0;
                            }
                            i6 = 0;
                            runnableC0739a0 = this.f1961b0;
                            if (iMax == 0) {
                            }
                        }
                    }
                } else {
                    EdgeEffect edgeEffect3 = this.f1940F;
                    if (edgeEffect3 == null || AbstractC0016e.m164N(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.f1942H;
                        if (edgeEffect4 != null && AbstractC0016e.m164N(edgeEffect4) != 0.0f) {
                            if (m1625g0(this.f1942H, i9, getWidth())) {
                                this.f1942H.onAbsorb(i9);
                                i9 = 0;
                            }
                            iMax = i9;
                            i9 = 0;
                            if (iMax2 == 0) {
                            }
                        }
                        iMax = 0;
                        if (iMax2 == 0) {
                        }
                    } else {
                        int i16 = -i9;
                        if (m1625g0(this.f1940F, i16, getWidth())) {
                            this.f1940F.onAbsorb(i16);
                            i9 = 0;
                        }
                        iMax = i9;
                        i9 = 0;
                        if (iMax2 == 0) {
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public final int m1603J(AbstractC0741b0 abstractC0741b0) {
        if (((abstractC0741b0.f2940j & 524) != 0) || !abstractC0741b0.m2051e()) {
            return -1;
        }
        C0149e c0149e = this.f1966e;
        int i2 = abstractC0741b0.f2933c;
        ArrayList arrayList = (ArrayList) c0149e.f467c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0738a c0738a = (C0738a) arrayList.get(i3);
            int i4 = c0738a.f2918a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = c0738a.f2919b;
                    if (i5 <= i2) {
                        int i6 = c0738a.f2920c;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = c0738a.f2919b;
                    if (i7 == i2) {
                        i2 = c0738a.f2920c;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (c0738a.f2920c <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (c0738a.f2919b <= i2) {
                i2 += c0738a.f2920c;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: K */
    public final long m1604K(AbstractC0741b0 abstractC0741b0) {
        return this.f1980l.f2847b ? abstractC0741b0.f2935e : abstractC0741b0.f2933c;
    }

    /* JADX INFO: renamed from: L */
    public final AbstractC0741b0 m1605L(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m1586M(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX INFO: renamed from: N */
    public final Rect m1606N(View view) {
        C0724L c0724l = (C0724L) view.getLayoutParams();
        boolean z2 = c0724l.f2878c;
        Rect rect = c0724l.f2877b;
        if (!z2 || (this.f1967e0.f2910g && (c0724l.f2876a.m2057k() || c0724l.f2876a.m2052f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1986o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Rect rect2 = this.f1974i;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0720H) arrayList.get(i2)).getClass();
            ((C0724L) view.getLayoutParams()).f2876a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0724l.f2878c = false;
        return rect;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m1607O() {
        return !this.f1996t || this.f1935A || this.f1966e.m562f();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m1608P() {
        return this.f1937C > 0;
    }

    /* JADX INFO: renamed from: Q */
    public final void m1609Q(int i2) {
        if (this.f1982m == null) {
            return;
        }
        setScrollState(2);
        this.f1982m.mo1583q0(i2);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: R */
    public final void m1610R() {
        int iM2070h = this.f1968f.m2070h();
        for (int i2 = 0; i2 < iM2070h; i2++) {
            ((C0724L) this.f1968f.m2069g(i2).getLayoutParams()).f2878c = true;
        }
        ArrayList arrayList = this.f1962c.f2889c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0724L c0724l = (C0724L) ((AbstractC0741b0) arrayList.get(i3)).f2931a.getLayoutParams();
            if (c0724l != null) {
                c0724l.f2878c = true;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m1611S(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int iM2070h = this.f1968f.m2070h();
        for (int i5 = 0; i5 < iM2070h; i5++) {
            AbstractC0741b0 abstractC0741b0M1586M = m1586M(this.f1968f.m2069g(i5));
            if (abstractC0741b0M1586M != null && !abstractC0741b0M1586M.m2061o()) {
                int i6 = abstractC0741b0M1586M.f2933c;
                C0735X c0735x = this.f1967e0;
                if (i6 >= i4) {
                    if (f1926A0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i5 + " holder " + abstractC0741b0M1586M + " now at position " + (abstractC0741b0M1586M.f2933c - i3));
                    }
                    abstractC0741b0M1586M.m2058l(-i3, z2);
                    c0735x.f2909f = true;
                } else if (i6 >= i2) {
                    if (f1926A0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i5 + " holder " + abstractC0741b0M1586M + " now REMOVED");
                    }
                    abstractC0741b0M1586M.m2047a(8);
                    abstractC0741b0M1586M.m2058l(-i3, z2);
                    abstractC0741b0M1586M.f2933c = i2 - 1;
                    c0735x.f2909f = true;
                }
            }
        }
        C0729Q c0729q = this.f1962c;
        ArrayList arrayList = c0729q.f2889c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0741b0 abstractC0741b0 = (AbstractC0741b0) arrayList.get(size);
            if (abstractC0741b0 != null) {
                int i7 = abstractC0741b0.f2933c;
                if (i7 >= i4) {
                    if (f1926A0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + abstractC0741b0 + " now at position " + (abstractC0741b0.f2933c - i3));
                    }
                    abstractC0741b0.m2058l(-i3, z2);
                } else if (i7 >= i2) {
                    abstractC0741b0.m2047a(8);
                    c0729q.m2026g(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: T */
    public final void m1612T() {
        this.f1937C++;
    }

    /* JADX INFO: renamed from: U */
    public final void m1613U(boolean z2) {
        int i2;
        AccessibilityManager accessibilityManager;
        int i3 = this.f1937C - 1;
        this.f1937C = i3;
        if (i3 < 1) {
            if (f1934z0 && i3 < 0) {
                throw new IllegalStateException(AbstractC0529T.m1415d(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f1937C = 0;
            if (z2) {
                int i4 = this.f2006y;
                this.f2006y = 0;
                if (i4 != 0 && (accessibilityManager = this.f2008z) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i4);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f1993r0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC0741b0 abstractC0741b0 = (AbstractC0741b0) arrayList.get(size);
                    if (abstractC0741b0.f2931a.getParent() == this && !abstractC0741b0.m2061o() && (i2 = abstractC0741b0.f2947q) != -1) {
                        abstractC0741b0.f2931a.setImportantForAccessibility(i2);
                        abstractC0741b0.f2947q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m1614V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1946L) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1946L = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f1950P = x2;
            this.f1948N = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f1951Q = y2;
            this.f1949O = y2;
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m1615W() {
        if (this.f1979k0 || !this.f1992r) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        postOnAnimation(this.f1995s0);
        this.f1979k0 = true;
    }

    /* JADX INFO: renamed from: X */
    public final void m1616X(boolean z2) {
        this.f1936B = z2 | this.f1936B;
        this.f1935A = true;
        int iM2070h = this.f1968f.m2070h();
        for (int i2 = 0; i2 < iM2070h; i2++) {
            AbstractC0741b0 abstractC0741b0M1586M = m1586M(this.f1968f.m2069g(i2));
            if (abstractC0741b0M1586M != null && !abstractC0741b0M1586M.m2061o()) {
                abstractC0741b0M1586M.m2047a(6);
            }
        }
        m1610R();
        C0729Q c0729q = this.f1962c;
        ArrayList arrayList = c0729q.f2889c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0741b0 abstractC0741b0 = (AbstractC0741b0) arrayList.get(i3);
            if (abstractC0741b0 != null) {
                abstractC0741b0.m2047a(6);
                abstractC0741b0.m2047a(1024);
            }
        }
        AbstractC0714B abstractC0714B = c0729q.f2894h.f1980l;
        if (abstractC0714B == null || !abstractC0714B.f2847b) {
            c0729q.m2025f();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m1617Y(AbstractC0741b0 abstractC0741b0, C0280q c0280q) {
        abstractC0741b0.f2940j &= -8193;
        boolean z2 = this.f1967e0.f2911h;
        C0048n c0048n = this.f1970g;
        if (z2 && abstractC0741b0.m2057k() && !abstractC0741b0.m2054h() && !abstractC0741b0.m2061o()) {
            ((C1029h) c0048n.f175c).m2481g(m1604K(abstractC0741b0), abstractC0741b0);
        }
        C1031j c1031j = (C1031j) c0048n.f174b;
        C0761l0 c0761l0M2092a = (C0761l0) c1031j.get(abstractC0741b0);
        if (c0761l0M2092a == null) {
            c0761l0M2092a = C0761l0.m2092a();
            c1031j.put(abstractC0741b0, c0761l0M2092a);
        }
        c0761l0M2092a.f3043b = c0280q;
        c0761l0M2092a.f3042a |= 4;
    }

    /* JADX INFO: renamed from: Z */
    public final void m1618Z() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f1940F;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f1940F.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f1941G;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f1941G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1942H;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f1942H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1943I;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f1943I.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final int m1619a0(int i2, float f) {
        float height = f / getHeight();
        float width = i2 / getWidth();
        EdgeEffect edgeEffect = this.f1940F;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC0016e.m164N(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f1942H;
            if (edgeEffect2 != null && AbstractC0016e.m164N(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f1942H.onRelease();
                } else {
                    float fM185m0 = AbstractC0016e.m185m0(this.f1942H, width, height);
                    if (AbstractC0016e.m164N(this.f1942H) == 0.0f) {
                        this.f1942H.onRelease();
                    }
                    f2 = fM185m0;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f1940F.onRelease();
            } else {
                float f3 = -AbstractC0016e.m185m0(this.f1940F, -width, 1.0f - height);
                if (AbstractC0016e.m164N(this.f1940F) == 0.0f) {
                    this.f1940F.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K != null) {
            abstractC0723K.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    /* JADX INFO: renamed from: b0 */
    public final int m1620b0(int i2, float f) {
        float width = f / getWidth();
        float height = i2 / getHeight();
        EdgeEffect edgeEffect = this.f1941G;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC0016e.m164N(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f1943I;
            if (edgeEffect2 != null && AbstractC0016e.m164N(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f1943I.onRelease();
                } else {
                    float fM185m0 = AbstractC0016e.m185m0(this.f1943I, height, 1.0f - width);
                    if (AbstractC0016e.m164N(this.f1943I) == 0.0f) {
                        this.f1943I.onRelease();
                    }
                    f2 = fM185m0;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f1941G.onRelease();
            } else {
                float f3 = -AbstractC0016e.m185m0(this.f1941G, -height, width);
                if (AbstractC0016e.m164N(this.f1941G) == 0.0f) {
                    this.f1941G.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    /* JADX INFO: renamed from: c0 */
    public final void m1621c0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1974i;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0724L) {
            C0724L c0724l = (C0724L) layoutParams;
            if (!c0724l.f2878c) {
                int i2 = rect.left;
                Rect rect2 = c0724l.f2877b;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1982m.mo1721n0(this, view, this.f1974i, !this.f1996t, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0724L) && this.f1982m.mo1516f((C0724L) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K != null && abstractC0723K.mo1571d()) {
            return this.f1982m.mo1580j(this.f1967e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K != null && abstractC0723K.mo1571d()) {
            return this.f1982m.mo1521k(this.f1967e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K != null && abstractC0723K.mo1571d()) {
            return this.f1982m.mo1523l(this.f1967e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K != null && abstractC0723K.mo1572e()) {
            return this.f1982m.mo1581m(this.f1967e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K != null && abstractC0723K.mo1572e()) {
            return this.f1982m.mo1526n(this.f1967e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K != null && abstractC0723K.mo1572e()) {
            return this.f1982m.mo1528o(this.f1967e0);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105  */
    /* JADX INFO: renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1622d0(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        boolean z4;
        m1639p();
        AbstractC0714B abstractC0714B = this.f1980l;
        int[] iArr = this.f1991q0;
        if (abstractC0714B != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            m1623e0(i2, i3, iArr);
            i5 = iArr[0];
            i6 = iArr[1];
            i7 = i2 - i5;
            i8 = i3 - i6;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.f1986o.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        m1645v(i5, i6, i7, i8, this.f1987o0, i4, iArr);
        int i9 = iArr[0];
        int i10 = i7 - i9;
        int i11 = iArr[1];
        int i12 = i8 - i11;
        boolean z5 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.f1950P;
        int[] iArr2 = this.f1987o0;
        int i14 = iArr2[0];
        this.f1950P = i13 - i14;
        int i15 = this.f1951Q;
        int i16 = iArr2[1];
        this.f1951Q = i15 - i16;
        int[] iArr3 = this.f1989p0;
        iArr3[0] = iArr3[0] + i14;
        iArr3[1] = iArr3[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || AbstractC0016e.m174e0(motionEvent, 8194)) {
                z2 = true;
                z3 = false;
            } else {
                float x2 = motionEvent.getX();
                float f = i10;
                float y2 = motionEvent.getY();
                float f2 = i12;
                if (f < 0.0f) {
                    m1648y();
                    z2 = true;
                    z3 = false;
                    AbstractC0016e.m185m0(this.f1940F, (-f) / getWidth(), 1.0f - (y2 / getHeight()));
                } else {
                    z2 = true;
                    z3 = false;
                    if (f > 0.0f) {
                        m1649z();
                        AbstractC0016e.m185m0(this.f1942H, f / getWidth(), y2 / getHeight());
                    } else {
                        z4 = false;
                        if (f2 >= 0.0f) {
                            m1595A();
                            AbstractC0016e.m185m0(this.f1941G, (-f2) / getHeight(), x2 / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                m1647x();
                                AbstractC0016e.m185m0(this.f1943I, f2 / getHeight(), 1.0f - (x2 / getWidth()));
                            }
                            if (z4 || f != 0.0f || f2 != 0.0f) {
                                postInvalidateOnAnimation();
                            }
                            if (Build.VERSION.SDK_INT >= 31 && AbstractC0016e.m174e0(motionEvent, 4194304)) {
                                m1618Z();
                            }
                        }
                        z4 = true;
                        if (z4) {
                            postInvalidateOnAnimation();
                            if (Build.VERSION.SDK_INT >= 31) {
                                m1618Z();
                            }
                        }
                    }
                }
                z4 = true;
                if (f2 >= 0.0f) {
                }
                z4 = true;
                if (z4) {
                }
            }
            m1637n(i2, i3);
        } else {
            z2 = true;
            z3 = false;
        }
        if (i5 != 0 || i6 != 0) {
            m1646w(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z5 && i5 == 0 && i6 == 0) ? z3 : z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        AbstractC0723K layoutManager = getLayoutManager();
        int iMo985a = 0;
        if (layoutManager != null) {
            if (layoutManager.mo1572e()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        m1627h0(0, measuredHeight, false);
                        return true;
                    }
                    m1627h0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zMo1551L = layoutManager.mo1551L();
                    if (keyCode == 122) {
                        if (zMo1551L) {
                            iMo985a = getAdapter().mo985a();
                        }
                    } else if (!zMo1551L) {
                        iMo985a = getAdapter().mo985a();
                    }
                    m1629i0(iMo985a);
                    return true;
                }
            } else if (layoutManager.mo1571d()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        m1627h0(measuredWidth, 0, false);
                        return true;
                    }
                    m1627h0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zMo1551L2 = layoutManager.mo1551L();
                    if (keyCode2 == 122) {
                        if (zMo1551L2) {
                            iMo985a = getAdapter().mo985a();
                        }
                    } else if (!zMo1551L2) {
                        iMo985a = getAdapter().mo985a();
                    }
                    m1629i0(iMo985a);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return getScrollingChildHelper().m871a(f, f2, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m872b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m873c(i2, i3, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().m874d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.f1986o;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0720H) arrayList.get(i2)).mo1983b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1940F;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f1972h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1940F;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f1941G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f1972h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1941G;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f1942H;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1972h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1942H;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f1943I;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1972h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1943I;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.f1944J == null || arrayList.size() <= 0 || !this.f1944J.mo1982f()) ? z2 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m1623e0(int i2, int i3, int[] iArr) {
        AbstractC0741b0 abstractC0741b0;
        m1631j0();
        m1612T();
        Trace.beginSection("RV Scroll");
        C0735X c0735x = this.f1967e0;
        m1597C(c0735x);
        C0729Q c0729q = this.f1962c;
        int iMo1530p0 = i2 != 0 ? this.f1982m.mo1530p0(i2, c0729q, c0735x) : 0;
        int iMo1534r0 = i3 != 0 ? this.f1982m.mo1534r0(i3, c0729q, c0735x) : 0;
        Trace.endSection();
        int iM2067e = this.f1968f.m2067e();
        for (int i4 = 0; i4 < iM2067e; i4++) {
            View viewM2066d = this.f1968f.m2066d(i4);
            AbstractC0741b0 abstractC0741b0M1605L = m1605L(viewM2066d);
            if (abstractC0741b0M1605L != null && (abstractC0741b0 = abstractC0741b0M1605L.f2939i) != null) {
                int left = viewM2066d.getLeft();
                int top = viewM2066d.getTop();
                View view = abstractC0741b0.f2931a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m1613U(true);
        m1634l0(false);
        if (iArr != null) {
            iArr[0] = iMo1530p0;
            iArr[1] = iMo1534r0;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m1624f0(int i2) {
        if (this.f2002w) {
            return;
        }
        m1638n0();
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0723K.mo1583q0(i2);
            awakenScrollBars();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00db  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i2) {
        View viewMo1503T;
        int i3;
        byte b;
        boolean z2;
        this.f1982m.getClass();
        boolean z3 = true;
        boolean z4 = (this.f1980l == null || this.f1982m == null || m1608P() || this.f2002w) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C0735X c0735x = this.f1967e0;
        C0729Q c0729q = this.f1962c;
        if (!z4 || (i2 != 2 && i2 != 1)) {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (viewFindNextFocus == null && z4) {
                m1639p();
                if (m1598D(view) != null) {
                    m1631j0();
                    viewMo1503T = this.f1982m.mo1503T(view, i2, c0729q, c0735x);
                    m1634l0(false);
                }
                return null;
            }
            viewMo1503T = viewFindNextFocus;
            if (viewMo1503T == null && !viewMo1503T.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i2);
                }
                m1621c0(viewMo1503T, null);
                return view;
            }
            if (viewMo1503T == null || viewMo1503T == this || viewMo1503T == view || m1598D(viewMo1503T) == null) {
                z3 = false;
            } else if (view != null && m1598D(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f1974i;
                rect.set(0, 0, width, height);
                int width2 = viewMo1503T.getWidth();
                int height2 = viewMo1503T.getHeight();
                Rect rect2 = this.f1976j;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(viewMo1503T, rect2);
                int i4 = this.f1982m.f2862b.getLayoutDirection() == 1 ? -1 : 1;
                int i5 = rect.left;
                int i6 = rect2.left;
                if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
                    i3 = 1;
                } else {
                    int i7 = rect.right;
                    int i8 = rect2.right;
                    i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                    b = 1;
                } else {
                    int i11 = rect.bottom;
                    int i12 = rect2.bottom;
                    b = ((i11 > i12 || i9 >= i12) && i9 > i10) ? (byte) -1 : (byte) 0;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 17) {
                            if (i2 != 33) {
                                if (i2 != 66) {
                                    if (i2 != 130) {
                                        StringBuilder sb = new StringBuilder("Invalid direction: ");
                                        sb.append(i2);
                                        throw new IllegalArgumentException(AbstractC0529T.m1415d(this, sb));
                                    }
                                    if (b <= 0) {
                                    }
                                } else if (i3 <= 0) {
                                }
                            } else if (b >= 0) {
                            }
                        } else if (i3 >= 0) {
                        }
                    } else if (b <= 0 && (b != 0 || i3 * i4 <= 0)) {
                    }
                } else if (b >= 0 && (b != 0 || i3 * i4 >= 0)) {
                }
            }
            return z3 ? viewMo1503T : super.focusSearch(view, i2);
        }
        if (this.f1982m.mo1572e()) {
            z2 = focusFinder.findNextFocus(this, view, i2 == 2 ? 130 : 33) == null;
            if (!z2 && this.f1982m.mo1571d()) {
                z2 = focusFinder.findNextFocus(this, view, !((this.f1982m.f2862b.getLayoutDirection() != 1) ^ (i2 != 2)) ? 66 : 17) != null;
            }
            if (z2) {
                m1639p();
                if (m1598D(view) != null) {
                    m1631j0();
                    this.f1982m.mo1503T(view, i2, c0729q, c0735x);
                    m1634l0(false);
                }
                return null;
            }
            viewMo1503T = focusFinder.findNextFocus(this, view, i2);
            if (viewMo1503T == null) {
            }
            if (viewMo1503T == null) {
                z3 = false;
            }
            if (z3) {
            }
        }
        if (!z2) {
            if (focusFinder.findNextFocus(this, view, !((this.f1982m.f2862b.getLayoutDirection() != 1) ^ (i2 != 2)) ? 66 : 17) != null) {
            }
        }
        if (z2) {
        }
        viewMo1503T = focusFinder.findNextFocus(this, view, i2);
        if (viewMo1503T == null) {
        }
        if (viewMo1503T == null) {
        }
        if (z3) {
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m1625g0(EdgeEffect edgeEffect, int i2, int i3) {
        if (i2 > 0) {
            return true;
        }
        float fM164N = AbstractC0016e.m164N(edgeEffect) * i3;
        float fAbs = Math.abs(-i2) * 0.35f;
        float f = this.f1958a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d2 = f1928C0;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f))) < fM164N;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K != null) {
            return abstractC0723K.mo1533r();
        }
        throw new IllegalStateException(AbstractC0529T.m1415d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K != null) {
            return abstractC0723K.mo1536s(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC0529T.m1415d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0714B getAdapter() {
        return this.f1980l;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K == null) {
            return super.getBaseline();
        }
        abstractC0723K.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1972h;
    }

    public C0745d0 getCompatAccessibilityDelegate() {
        return this.f1981l0;
    }

    public AbstractC0718F getEdgeEffectFactory() {
        return this.f1939E;
    }

    public AbstractC0719G getItemAnimator() {
        return this.f1944J;
    }

    public int getItemDecorationCount() {
        return this.f1986o.size();
    }

    public AbstractC0723K getLayoutManager() {
        return this.f1982m;
    }

    public int getMaxFlingVelocity() {
        return this.f1955U;
    }

    public int getMinFlingVelocity() {
        return this.f1954T;
    }

    public long getNanoTime() {
        if (f1930E0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0725M getOnFlingListener() {
        return this.f1953S;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1959a0;
    }

    public C0728P getRecycledViewPool() {
        return this.f1962c.m2022c();
    }

    public int getScrollState() {
        return this.f1945K;
    }

    /* JADX INFO: renamed from: h */
    public final void m1626h(AbstractC0741b0 abstractC0741b0) {
        View view = abstractC0741b0.f2931a;
        boolean z2 = view.getParent() == this;
        this.f1962c.m2031l(m1605L(view));
        if (abstractC0741b0.m2056j()) {
            this.f1968f.m2064b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f1968f.m2063a(view, -1, true);
            return;
        }
        C0742c c0742c = this.f1968f;
        int iIndexOfChild = c0742c.f2950a.f2845a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c0742c.f2951b.m2046h(iIndexOfChild);
            c0742c.m2071i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m1627h0(int i2, int i3, boolean z2) {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2002w) {
            return;
        }
        if (!abstractC0723K.mo1571d()) {
            i2 = 0;
        }
        if (!this.f1982m.mo1572e()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (z2) {
            int i4 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().m877g(i4, 1);
        }
        this.f1961b0.m2038c(i2, i3, Integer.MIN_VALUE, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m876f(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m1628i(AbstractC0720H abstractC0720H) {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K != null) {
            abstractC0723K.mo1569c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1986o;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0720H);
        m1610R();
        requestLayout();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m1629i0(int i2) {
        if (this.f2002w) {
            return;
        }
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0723K.mo1542A0(this, i2);
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1992r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2002w;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f852d;
    }

    /* JADX INFO: renamed from: j */
    public final void m1630j(AbstractC0726N abstractC0726N) {
        if (this.f1971g0 == null) {
            this.f1971g0 = new ArrayList();
        }
        this.f1971g0.add(abstractC0726N);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m1631j0() {
        int i2 = this.f1998u + 1;
        this.f1998u = i2;
        if (i2 != 1 || this.f2002w) {
            return;
        }
        this.f2000v = false;
    }

    /* JADX INFO: renamed from: k */
    public final void m1632k(String str) {
        if (m1608P()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(AbstractC0529T.m1415d(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f1938D > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AbstractC0529T.m1415d(this, new StringBuilder(""))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final void m1633k0(int i2) {
        boolean zMo1571d = this.f1982m.mo1571d();
        int i3 = zMo1571d;
        if (this.f1982m.mo1572e()) {
            i3 = (zMo1571d ? 1 : 0) | 2;
        }
        getScrollingChildHelper().m877g(i3, i2);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m1634l0(boolean z2) {
        if (this.f1998u < 1) {
            if (f1934z0) {
                throw new IllegalStateException(AbstractC0529T.m1415d(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f1998u = 1;
        }
        if (!z2 && !this.f2002w) {
            this.f2000v = false;
        }
        if (this.f1998u == 1) {
            if (z2 && this.f2000v && !this.f2002w && this.f1982m != null && this.f1980l != null) {
                m1641r();
            }
            if (!this.f2002w) {
                this.f2000v = false;
            }
        }
        this.f1998u--;
    }

    /* JADX INFO: renamed from: m */
    public final void m1635m() {
        int iM2070h = this.f1968f.m2070h();
        for (int i2 = 0; i2 < iM2070h; i2++) {
            AbstractC0741b0 abstractC0741b0M1586M = m1586M(this.f1968f.m2069g(i2));
            if (!abstractC0741b0M1586M.m2061o()) {
                abstractC0741b0M1586M.f2934d = -1;
                abstractC0741b0M1586M.f2937g = -1;
            }
        }
        C0729Q c0729q = this.f1962c;
        ArrayList arrayList = c0729q.f2889c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0741b0 abstractC0741b0 = (AbstractC0741b0) arrayList.get(i3);
            abstractC0741b0.f2934d = -1;
            abstractC0741b0.f2937g = -1;
        }
        ArrayList arrayList2 = c0729q.f2887a;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AbstractC0741b0 abstractC0741b02 = (AbstractC0741b0) arrayList2.get(i4);
            abstractC0741b02.f2934d = -1;
            abstractC0741b02.f2937g = -1;
        }
        ArrayList arrayList3 = c0729q.f2888b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                AbstractC0741b0 abstractC0741b03 = (AbstractC0741b0) c0729q.f2888b.get(i5);
                abstractC0741b03.f2934d = -1;
                abstractC0741b03.f2937g = -1;
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m1636m0(int i2) {
        getScrollingChildHelper().m878h(i2);
    }

    /* JADX INFO: renamed from: n */
    public final void m1637n(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f1940F;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.f1940F.onRelease();
            zIsFinished = this.f1940F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1942H;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f1942H.onRelease();
            zIsFinished |= this.f1942H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1941G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f1941G.onRelease();
            zIsFinished |= this.f1941G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1943I;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.f1943I.onRelease();
            zIsFinished |= this.f1943I.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m1638n0() {
        C0772w c0772w;
        setScrollState(0);
        RunnableC0739a0 runnableC0739a0 = this.f1961b0;
        runnableC0739a0.f2927g.removeCallbacks(runnableC0739a0);
        runnableC0739a0.f2923c.abortAnimation();
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K == null || (c0772w = abstractC0723K.f2865e) == null) {
            return;
        }
        c0772w.m2116i();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f1937C = 0;
        this.f1992r = true;
        this.f1996t = this.f1996t && !isLayoutRequested();
        this.f1962c.m2023d();
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K != null) {
            abstractC0723K.f2867g = true;
            abstractC0723K.mo1720R(this);
        }
        this.f1979k0 = false;
        if (f1930E0) {
            ThreadLocal threadLocal = RunnableC0765p.f3084e;
            RunnableC0765p runnableC0765p = (RunnableC0765p) threadLocal.get();
            this.f1963c0 = runnableC0765p;
            if (runnableC0765p == null) {
                this.f1963c0 = new RunnableC0765p();
                WeakHashMap weakHashMap = AbstractC0240S.f777a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                    RunnableC0765p runnableC0765p2 = this.f1963c0;
                    runnableC0765p2.f3088c = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC0765p2);
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    RunnableC0765p runnableC0765p22 = this.f1963c0;
                    runnableC0765p22.f3088c = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC0765p22);
                }
            }
            RunnableC0765p runnableC0765p3 = this.f1963c0;
            runnableC0765p3.getClass();
            boolean z2 = f1934z0;
            ArrayList arrayList = runnableC0765p3.f3086a;
            if (z2 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0729Q c0729q;
        RunnableC0765p runnableC0765p;
        super.onDetachedFromWindow();
        AbstractC0719G abstractC0719G = this.f1944J;
        if (abstractC0719G != null) {
            abstractC0719G.mo1981e();
        }
        m1638n0();
        int i2 = 0;
        this.f1992r = false;
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K != null) {
            abstractC0723K.f2867g = false;
            abstractC0723K.mo1558S(this);
        }
        this.f1993r0.clear();
        removeCallbacks(this.f1995s0);
        this.f1970g.getClass();
        while (C0761l0.f3041d.mo622a() != null) {
        }
        int i3 = 0;
        while (true) {
            c0729q = this.f1962c;
            ArrayList arrayList = c0729q.f2889c;
            if (i3 >= arrayList.size()) {
                break;
            }
            AbstractC0383m.m1042g(((AbstractC0741b0) arrayList.get(i3)).f2931a);
            i3++;
        }
        c0729q.m2024e(c0729q.f2894h.f1980l, false);
        while (i2 < getChildCount()) {
            int i4 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            C0393a c0393a = (C0393a) childAt.getTag(com.reddit.frontpage.R.id.resc);
            if (c0393a == null) {
                c0393a = new C0393a();
                childAt.setTag(com.reddit.frontpage.R.id.resc, c0393a);
            }
            ArrayList arrayList2 = c0393a.f1065a;
            int iM166R = AbstractC0016e.m166R(arrayList2);
            if (-1 < iM166R) {
                arrayList2.get(iM166R).getClass();
                throw new ClassCastException();
            }
            i2 = i4;
        }
        if (!f1930E0 || (runnableC0765p = this.f1963c0) == null) {
            return;
        }
        boolean zRemove = runnableC0765p.f3086a.remove(this);
        if (f1934z0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f1963c0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1986o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0720H) arrayList.get(i2)).mo1732a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b A[ADDED_TO_REGION] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        boolean z2;
        int i2;
        if (this.f1982m != null && !this.f2002w && motionEvent.getAction() == 8) {
            float f = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f2 = this.f1982m.mo1572e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1982m.mo1571d()) {
                    axisValue = motionEvent.getAxisValue(10);
                    i2 = 0;
                    z2 = false;
                    f = f2;
                    int i3 = (int) (f * this.f1957W);
                    int i4 = (int) (axisValue * this.f1956V);
                    if (z2) {
                        OverScroller overScroller = this.f1961b0.f2923c;
                        m1627h0((overScroller.getFinalX() - overScroller.getCurrX()) + i4, (overScroller.getFinalY() - overScroller.getCurrY()) + i3, true);
                    } else {
                        AbstractC0723K abstractC0723K = this.f1982m;
                        if (abstractC0723K == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f2002w) {
                            int[] iArr = this.f1991q0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean zMo1571d = abstractC0723K.mo1571d();
                            boolean zMo1572e = this.f1982m.mo1572e();
                            int i5 = zMo1572e ? (zMo1571d ? 1 : 0) | 2 : zMo1571d ? 1 : 0;
                            float y2 = motionEvent.getY();
                            float x2 = motionEvent.getX();
                            int iM1619a0 = i4 - m1619a0(i4, y2);
                            int iM1620b0 = i3 - m1620b0(i3, x2);
                            getScrollingChildHelper().m877g(i5, 1);
                            if (m1644u(zMo1571d ? iM1619a0 : 0, zMo1572e ? iM1620b0 : 0, 1, this.f1991q0, this.f1987o0)) {
                                iM1619a0 -= iArr[0];
                                iM1620b0 -= iArr[1];
                            }
                            m1622d0(zMo1571d ? iM1619a0 : 0, zMo1572e ? iM1620b0 : 0, motionEvent, 1);
                            RunnableC0765p runnableC0765p = this.f1963c0;
                            if (runnableC0765p != null && (iM1619a0 != 0 || iM1620b0 != 0)) {
                                runnableC0765p.m2101a(this, iM1619a0, iM1620b0);
                            }
                            m1636m0(1);
                        }
                    }
                    if (i2 != 0 && !z2) {
                        this.f2007y0.m819a(motionEvent, i2);
                    }
                } else {
                    f = f2;
                    axisValue = 0.0f;
                    i2 = 0;
                    z2 = false;
                    int i32 = (int) (f * this.f1957W);
                    int i42 = (int) (axisValue * this.f1956V);
                    if (z2) {
                    }
                    if (i2 != 0) {
                        this.f2007y0.m819a(motionEvent, i2);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    axisValue = motionEvent.getAxisValue(26);
                    if (this.f1982m.mo1572e()) {
                        f = -axisValue;
                    } else {
                        if (!this.f1982m.mo1571d()) {
                        }
                        z2 = this.f2003w0;
                        i2 = 26;
                    }
                    axisValue = 0.0f;
                    z2 = this.f2003w0;
                    i2 = 26;
                } else {
                    axisValue = 0.0f;
                    i2 = 0;
                    z2 = false;
                }
                int i322 = (int) (f * this.f1957W);
                int i422 = (int) (axisValue * this.f1956V);
                if (z2) {
                }
                if (i2 != 0) {
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (!this.f2002w) {
            this.f1990q = null;
            if (m1599E(motionEvent)) {
                VelocityTracker velocityTracker = this.f1947M;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                m1636m0(0);
                m1618Z();
                setScrollState(0);
                return true;
            }
            AbstractC0723K abstractC0723K = this.f1982m;
            if (abstractC0723K != null) {
                boolean zMo1571d = abstractC0723K.mo1571d();
                boolean zMo1572e = this.f1982m.mo1572e();
                if (this.f1947M == null) {
                    this.f1947M = VelocityTracker.obtain();
                }
                this.f1947M.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f2004x) {
                        this.f2004x = false;
                    }
                    this.f1946L = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.f1950P = x2;
                    this.f1948N = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.f1951Q = y2;
                    this.f1949O = y2;
                    EdgeEffect edgeEffect = this.f1940F;
                    if (edgeEffect == null || AbstractC0016e.m164N(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z2 = false;
                    } else {
                        AbstractC0016e.m185m0(this.f1940F, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z2 = true;
                    }
                    EdgeEffect edgeEffect2 = this.f1942H;
                    if (edgeEffect2 != null && AbstractC0016e.m164N(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        AbstractC0016e.m185m0(this.f1942H, 0.0f, motionEvent.getY() / getHeight());
                        z2 = true;
                    }
                    EdgeEffect edgeEffect3 = this.f1941G;
                    if (edgeEffect3 != null && AbstractC0016e.m164N(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        AbstractC0016e.m185m0(this.f1941G, 0.0f, motionEvent.getX() / getWidth());
                        z2 = true;
                    }
                    EdgeEffect edgeEffect4 = this.f1943I;
                    if (edgeEffect4 != null && AbstractC0016e.m164N(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        AbstractC0016e.m185m0(this.f1943I, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z2 = true;
                    }
                    if (z2 || this.f1945K == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m1636m0(1);
                    }
                    int[] iArr = this.f1989p0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    m1633k0(0);
                } else if (actionMasked == 1) {
                    this.f1947M.clear();
                    m1636m0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1946L);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1946L + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f1945K != 1) {
                        int i2 = x3 - this.f1948N;
                        int i3 = y3 - this.f1949O;
                        if (!zMo1571d || Math.abs(i2) <= this.f1952R) {
                            z3 = false;
                        } else {
                            this.f1950P = x3;
                            z3 = true;
                        }
                        if (zMo1572e && Math.abs(i3) > this.f1952R) {
                            this.f1951Q = y3;
                            z3 = true;
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.f1947M;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    m1636m0(0);
                    m1618Z();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f1946L = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f1950P = x4;
                    this.f1948N = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f1951Q = y4;
                    this.f1949O = y4;
                } else if (actionMasked == 6) {
                    m1614V(motionEvent);
                }
                if (this.f1945K == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        Trace.beginSection("RV OnLayout");
        m1641r();
        Trace.endSection();
        this.f1996t = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K == null) {
            m1640q(i2, i3);
            return;
        }
        boolean zMo1549K = abstractC0723K.mo1549K();
        boolean z2 = false;
        C0735X c0735x = this.f1967e0;
        if (!zMo1549K) {
            if (this.f1994s) {
                this.f1982m.f2862b.m1640q(i2, i3);
                return;
            }
            if (c0735x.f2914k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0714B abstractC0714B = this.f1980l;
            if (abstractC0714B != null) {
                c0735x.f2908e = abstractC0714B.mo985a();
            } else {
                c0735x.f2908e = 0;
            }
            m1631j0();
            this.f1982m.f2862b.m1640q(i2, i3);
            m1634l0(false);
            c0735x.f2910g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        this.f1982m.f2862b.m1640q(i2, i3);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z2 = true;
        }
        this.f1997t0 = z2;
        if (z2 || this.f1980l == null) {
            return;
        }
        if (c0735x.f2907d == 1) {
            m1642s();
        }
        this.f1982m.m2012t0(i2, i3);
        c0735x.f2912i = true;
        m1643t();
        this.f1982m.m2015v0(i2, i3);
        if (this.f1982m.mo1584y0()) {
            this.f1982m.m2012t0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            c0735x.f2912i = true;
            m1643t();
            this.f1982m.m2015v0(i2, i3);
        }
        this.f1999u0 = getMeasuredWidth();
        this.f2001v0 = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (m1608P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0732U)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0732U c0732u = (C0732U) parcelable;
        this.f1964d = c0732u;
        super.onRestoreInstanceState(c0732u.f1069a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0732U c0732u = new C0732U(super.onSaveInstanceState());
        C0732U c0732u2 = this.f1964d;
        if (c0732u2 != null) {
            c0732u.f2896c = c0732u2.f2896c;
            return c0732u;
        }
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K != null) {
            c0732u.f2896c = abstractC0723K.mo1576g0();
            return c0732u;
        }
        c0732u.f2896c = null;
        return c0732u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.f1943I = null;
        this.f1941G = null;
        this.f1942H = null;
        this.f1940F = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020b A[PHI: r1
      0x020b: PHI (r1v50 int) = (r1v34 int), (r1v54 int) binds: [B:95:0x01f4, B:99:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0224  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM1599E;
        boolean z2;
        if (!this.f2002w && !this.f2004x) {
            C0762m c0762m = this.f1990q;
            if (c0762m == null) {
                zM1599E = motionEvent.getAction() == 0 ? false : m1599E(motionEvent);
            } else {
                if (c0762m.f3070v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean zM2095d = c0762m.m2095d(motionEvent.getX(), motionEvent.getY());
                        boolean zM2094c = c0762m.m2094c(motionEvent.getX(), motionEvent.getY());
                        if (zM2095d || zM2094c) {
                            if (zM2094c) {
                                c0762m.f3071w = 1;
                                c0762m.f3064p = (int) motionEvent.getX();
                            } else if (zM2095d) {
                                c0762m.f3071w = 2;
                                c0762m.f3061m = (int) motionEvent.getY();
                            }
                            c0762m.m2096f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c0762m.f3070v == 2) {
                        c0762m.f3061m = 0.0f;
                        c0762m.f3064p = 0.0f;
                        c0762m.m2096f(1);
                        c0762m.f3071w = 0;
                    } else if (motionEvent.getAction() == 2 && c0762m.f3070v == 2) {
                        c0762m.m2097g();
                        int i2 = c0762m.f3071w;
                        int i3 = c0762m.f3050b;
                        if (i2 == 1) {
                            float x2 = motionEvent.getX();
                            int[] iArr = c0762m.f3073y;
                            iArr[0] = i3;
                            int i4 = c0762m.f3065q - i3;
                            iArr[1] = i4;
                            float fMax = Math.max(i3, Math.min(i4, x2));
                            if (Math.abs(c0762m.f3063o - fMax) >= 2.0f) {
                                int iM2093e = C0762m.m2093e(c0762m.f3064p, fMax, iArr, c0762m.f3067s.computeHorizontalScrollRange(), c0762m.f3067s.computeHorizontalScrollOffset(), c0762m.f3065q);
                                if (iM2093e != 0) {
                                    c0762m.f3067s.scrollBy(iM2093e, 0);
                                }
                                c0762m.f3064p = fMax;
                            }
                        }
                        if (c0762m.f3071w == 2) {
                            float y2 = motionEvent.getY();
                            int[] iArr2 = c0762m.f3072x;
                            iArr2[0] = i3;
                            int i5 = c0762m.f3066r - i3;
                            iArr2[1] = i5;
                            float fMax2 = Math.max(i3, Math.min(i5, y2));
                            if (Math.abs(c0762m.f3060l - fMax2) >= 2.0f) {
                                int iM2093e2 = C0762m.m2093e(c0762m.f3061m, fMax2, iArr2, c0762m.f3067s.computeVerticalScrollRange(), c0762m.f3067s.computeVerticalScrollOffset(), c0762m.f3066r);
                                if (iM2093e2 != 0) {
                                    c0762m.f3067s.scrollBy(0, iM2093e2);
                                }
                                c0762m.f3061m = fMax2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f1990q = null;
                }
                zM1599E = true;
            }
            if (zM1599E) {
                VelocityTracker velocityTracker = this.f1947M;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                m1636m0(0);
                m1618Z();
                setScrollState(0);
                return true;
            }
            AbstractC0723K abstractC0723K = this.f1982m;
            if (abstractC0723K != null) {
                boolean zMo1571d = abstractC0723K.mo1571d();
                boolean zMo1572e = this.f1982m.mo1572e();
                if (this.f1947M == null) {
                    this.f1947M = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f1989p0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.f1946L = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.f1950P = x3;
                    this.f1948N = x3;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.f1951Q = y3;
                    this.f1949O = y3;
                    m1633k0(0);
                } else {
                    if (actionMasked == 1) {
                        this.f1947M.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.f1947M;
                        int i6 = this.f1955U;
                        velocityTracker2.computeCurrentVelocity(1000, i6);
                        float f = zMo1571d ? -this.f1947M.getXVelocity(this.f1946L) : 0.0f;
                        float f2 = zMo1572e ? -this.f1947M.getYVelocity(this.f1946L) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !m1602I((int) f, (int) f2, this.f1954T, i6)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.f1947M;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        m1636m0(0);
                        m1618Z();
                        motionEventObtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f1946L);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1946L + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x4 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y4 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.f1950P - x4;
                        int iMax2 = this.f1951Q - y4;
                        if (this.f1945K != 1) {
                            if (zMo1571d) {
                                iMax = iMax > 0 ? Math.max(0, iMax - this.f1952R) : Math.min(0, iMax + this.f1952R);
                                if (iMax != 0) {
                                    z2 = true;
                                }
                                if (zMo1572e) {
                                }
                                if (z2) {
                                }
                            } else {
                                z2 = false;
                                if (zMo1572e) {
                                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f1952R) : Math.min(0, iMax2 + this.f1952R);
                                    if (iMax2 != 0) {
                                        z2 = true;
                                    }
                                }
                                if (z2) {
                                    setScrollState(1);
                                }
                            }
                            motionEventObtain.recycle();
                            return true;
                        }
                        if (this.f1945K == 1) {
                            int[] iArr4 = this.f1991q0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            int iM1619a0 = iMax - m1619a0(iMax, motionEvent.getY());
                            int iM1620b0 = iMax2 - m1620b0(iMax2, motionEvent.getX());
                            boolean zM1644u = m1644u(zMo1571d ? iM1619a0 : 0, zMo1572e ? iM1620b0 : 0, 0, this.f1991q0, this.f1987o0);
                            int[] iArr5 = this.f1987o0;
                            if (zM1644u) {
                                iM1619a0 -= iArr4[0];
                                iM1620b0 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i7 = iM1619a0;
                            int i8 = iM1620b0;
                            this.f1950P = x4 - iArr5[0];
                            this.f1951Q = y4 - iArr5[1];
                            if (m1622d0(zMo1571d ? i7 : 0, zMo1572e ? i8 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            RunnableC0765p runnableC0765p = this.f1963c0;
                            if (runnableC0765p != null && (i7 != 0 || i8 != 0)) {
                                runnableC0765p.m2101a(this, i7, i8);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.f1947M;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        m1636m0(0);
                        m1618Z();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f1946L = motionEvent.getPointerId(actionIndex);
                        int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f1950P = x5;
                        this.f1948N = x5;
                        int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f1951Q = y5;
                        this.f1949O = y5;
                    } else if (actionMasked == 6) {
                        m1614V(motionEvent);
                    }
                }
                this.f1947M.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m1639p() {
        if (!this.f1996t || this.f1935A) {
            Trace.beginSection("RV FullInvalidate");
            m1641r();
            Trace.endSection();
        } else if (this.f1966e.m562f()) {
            this.f1966e.getClass();
            if (this.f1966e.m562f()) {
                Trace.beginSection("RV FullInvalidate");
                m1641r();
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1640q(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        setMeasuredDimension(AbstractC0723K.m1993g(i2, paddingRight, getMinimumWidth()), AbstractC0723K.m1993g(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a2  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1641r() {
        AbstractC0741b0 abstractC0741b0;
        View viewFindViewById;
        boolean z2;
        C0280q c0280q;
        ?? r3;
        RecyclerView recyclerView;
        boolean zM2075g;
        if (this.f1980l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f1982m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C0735X c0735x = this.f1967e0;
        boolean z3 = false;
        c0735x.f2912i = false;
        boolean z4 = this.f1997t0 && !(this.f1999u0 == getWidth() && this.f2001v0 == getHeight());
        this.f1999u0 = 0;
        this.f2001v0 = 0;
        this.f1997t0 = false;
        if (c0735x.f2907d == 1) {
            m1642s();
            this.f1982m.m2011s0(this);
            m1643t();
        } else {
            C0149e c0149e = this.f1966e;
            if ((((ArrayList) c0149e.f468d).isEmpty() || ((ArrayList) c0149e.f467c).isEmpty()) && !z4 && this.f1982m.f2874n == getWidth() && this.f1982m.f2875o == getHeight()) {
                this.f1982m.m2011s0(this);
            } else {
                this.f1982m.m2011s0(this);
                m1643t();
            }
        }
        c0735x.m2034a(4);
        m1631j0();
        m1612T();
        c0735x.f2907d = 1;
        boolean z5 = c0735x.f2913j;
        C0729Q c0729q = this.f1962c;
        C0048n c0048n = this.f1970g;
        if (z5) {
            for (int iM2067e = this.f1968f.m2067e() - 1; iM2067e >= 0; iM2067e--) {
                AbstractC0741b0 abstractC0741b0M1586M = m1586M(this.f1968f.m2066d(iM2067e));
                if (!abstractC0741b0M1586M.m2061o()) {
                    long jM1604K = m1604K(abstractC0741b0M1586M);
                    this.f1944J.getClass();
                    C0280q c0280q2 = new C0280q();
                    c0280q2.m890a(abstractC0741b0M1586M);
                    AbstractC0741b0 abstractC0741b02 = (AbstractC0741b0) ((C1029h) c0048n.f175c).m2478d(jM1604K);
                    if (abstractC0741b02 == null || abstractC0741b02.m2061o()) {
                        c0048n.m294a(abstractC0741b0M1586M, c0280q2);
                    } else {
                        C1031j c1031j = (C1031j) c0048n.f174b;
                        C0761l0 c0761l0 = (C0761l0) c1031j.get(abstractC0741b02);
                        boolean z6 = (c0761l0 == null || (c0761l0.f3042a & 1) == 0) ? false : true;
                        C0761l0 c0761l02 = (C0761l0) c1031j.get(abstractC0741b0M1586M);
                        boolean z7 = (c0761l02 == null || (c0761l02.f3042a & 1) == 0) ? false : true;
                        if (z6 && abstractC0741b02 == abstractC0741b0M1586M) {
                            c0048n.m294a(abstractC0741b0M1586M, c0280q2);
                        } else {
                            C0280q c0280qM290H = c0048n.m290H(abstractC0741b02, 4);
                            c0048n.m294a(abstractC0741b0M1586M, c0280q2);
                            C0280q c0280qM290H2 = c0048n.m290H(abstractC0741b0M1586M, 8);
                            if (c0280qM290H == null) {
                                int iM2067e2 = this.f1968f.m2067e();
                                for (int i2 = 0; i2 < iM2067e2; i2++) {
                                    AbstractC0741b0 abstractC0741b0M1586M2 = m1586M(this.f1968f.m2066d(i2));
                                    if (abstractC0741b0M1586M2 != abstractC0741b0M1586M && m1604K(abstractC0741b0M1586M2) == jM1604K) {
                                        AbstractC0714B abstractC0714B = this.f1980l;
                                        if (abstractC0714B == null || !abstractC0714B.f2847b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(abstractC0741b0M1586M2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(abstractC0741b0M1586M);
                                            throw new IllegalStateException(AbstractC0529T.m1415d(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(abstractC0741b0M1586M2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(abstractC0741b0M1586M);
                                        throw new IllegalStateException(AbstractC0529T.m1415d(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0741b02 + " cannot be found but it is necessary for " + abstractC0741b0M1586M + m1596B());
                            } else {
                                abstractC0741b02.m2060n(false);
                                if (z6) {
                                    m1626h(abstractC0741b02);
                                }
                                if (abstractC0741b02 != abstractC0741b0M1586M) {
                                    if (z7) {
                                        m1626h(abstractC0741b0M1586M);
                                    }
                                    abstractC0741b02.f2938h = abstractC0741b0M1586M;
                                    m1626h(abstractC0741b02);
                                    c0729q.m2031l(abstractC0741b02);
                                    abstractC0741b0M1586M.m2060n(false);
                                    abstractC0741b0M1586M.f2939i = abstractC0741b02;
                                }
                                if (this.f1944J.mo1978a(abstractC0741b02, abstractC0741b0M1586M, c0280qM290H, c0280qM290H2)) {
                                    m1615W();
                                }
                            }
                        }
                    }
                }
            }
            C1031j c1031j2 = (C1031j) c0048n.f174b;
            int i3 = c1031j2.f4104c - 1;
            while (i3 >= 0) {
                AbstractC0741b0 abstractC0741b03 = (AbstractC0741b0) c1031j2.m2490f(i3);
                C0761l0 c0761l03 = (C0761l0) c1031j2.m2491g(i3);
                int i4 = c0761l03.f3042a;
                int i5 = i4 & 3;
                C0713A c0713a = this.f2005x0;
                if (i5 == 3) {
                    RecyclerView recyclerView2 = c0713a.f2845a;
                    recyclerView2.f1982m.m2007l0(abstractC0741b03.f2931a, recyclerView2.f1962c);
                    r3 = z3;
                } else if ((i4 & 1) != 0) {
                    C0280q c0280q3 = c0761l03.f3043b;
                    if (c0280q3 == null) {
                        RecyclerView recyclerView3 = c0713a.f2845a;
                        recyclerView3.f1982m.m2007l0(abstractC0741b03.f2931a, recyclerView3.f1962c);
                        r3 = z3;
                    } else {
                        c0713a.m1972g(abstractC0741b03, c0280q3, c0761l03.f3044c);
                        r3 = z3;
                    }
                } else if ((i4 & 14) == 14) {
                    c0713a.m1971f(abstractC0741b03, c0761l03.f3043b, c0761l03.f3044c);
                    r3 = z3;
                } else if ((i4 & 12) == 12) {
                    C0280q c0280q4 = c0761l03.f3043b;
                    C0280q c0280q5 = c0761l03.f3044c;
                    c0713a.getClass();
                    abstractC0741b03.m2060n(z3);
                    RecyclerView recyclerView4 = c0713a.f2845a;
                    if (!recyclerView4.f1935A) {
                        C0756j c0756j = (C0756j) recyclerView4.f1944J;
                        c0756j.getClass();
                        int i6 = c0280q4.f857a;
                        int i7 = c0280q5.f857a;
                        if (i6 == i7 && c0280q4.f858b == c0280q5.f858b) {
                            c0756j.m1979c(abstractC0741b03);
                            recyclerView = recyclerView4;
                            zM2075g = false;
                        } else {
                            recyclerView = recyclerView4;
                            zM2075g = c0756j.m2075g(abstractC0741b03, i6, c0280q4.f858b, i7, c0280q5.f858b);
                        }
                        if (zM2075g) {
                            recyclerView.m1615W();
                        }
                    } else if (recyclerView4.f1944J.mo1978a(abstractC0741b03, abstractC0741b03, c0280q4, c0280q5)) {
                        recyclerView4.m1615W();
                    }
                    r3 = 0;
                } else {
                    if ((i4 & 4) != 0) {
                        c0280q = null;
                        c0713a.m1972g(abstractC0741b03, c0761l03.f3043b, null);
                    } else {
                        c0280q = null;
                        if ((i4 & 8) != 0) {
                            c0713a.m1971f(abstractC0741b03, c0761l03.f3043b, c0761l03.f3044c);
                        }
                    }
                    r3 = 0;
                    c0761l03.f3042a = r3;
                    c0761l03.f3043b = c0280q;
                    c0761l03.f3044c = c0280q;
                    C0761l0.f3041d.mo624c(c0761l03);
                    i3--;
                    z3 = false;
                }
                c0280q = null;
                c0761l03.f3042a = r3;
                c0761l03.f3043b = c0280q;
                c0761l03.f3044c = c0280q;
                C0761l0.f3041d.mo624c(c0761l03);
                i3--;
                z3 = false;
            }
        }
        View view = null;
        this.f1982m.m2006k0(c0729q);
        c0735x.f2905b = c0735x.f2908e;
        this.f1935A = false;
        this.f1936B = false;
        c0735x.f2913j = false;
        c0735x.f2914k = false;
        this.f1982m.f2866f = false;
        ArrayList arrayList = c0729q.f2888b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K.f2871k) {
            abstractC0723K.f2870j = 0;
            abstractC0723K.f2871k = false;
            c0729q.m2032m();
        }
        this.f1982m.mo1515e0(c0735x);
        m1613U(true);
        m1634l0(false);
        ((C1031j) c0048n.f174b).clear();
        ((C1029h) c0048n.f175c).m2476b();
        int[] iArr = this.f1983m0;
        int i8 = iArr[0];
        int i9 = iArr[1];
        m1600F(iArr);
        if ((iArr[0] == i8 && iArr[1] == i9) ? false : true) {
            m1646w(0, 0);
        }
        if (this.f1959a0 && this.f1980l != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                if (this.f1968f.f2952c.contains(getFocusedChild())) {
                    long j2 = c0735x.f2916m;
                    if (j2 != -1 && (z2 = this.f1980l.f2847b) && z2) {
                        int iM2070h = this.f1968f.m2070h();
                        abstractC0741b0 = null;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= iM2070h) {
                                break;
                            }
                            AbstractC0741b0 abstractC0741b0M1586M3 = m1586M(this.f1968f.m2069g(i10));
                            if (abstractC0741b0M1586M3 != null && !abstractC0741b0M1586M3.m2054h() && abstractC0741b0M1586M3.f2935e == j2) {
                                if (!this.f1968f.f2952c.contains(abstractC0741b0M1586M3.f2931a)) {
                                    abstractC0741b0 = abstractC0741b0M1586M3;
                                    break;
                                }
                                abstractC0741b0 = abstractC0741b0M1586M3;
                            }
                            i10++;
                        }
                    } else {
                        abstractC0741b0 = null;
                    }
                    if (abstractC0741b0 != null) {
                        ArrayList arrayList2 = this.f1968f.f2952c;
                        View view2 = abstractC0741b0.f2931a;
                        if (!arrayList2.contains(view2) && view2.hasFocusable()) {
                            view = view2;
                        } else if (this.f1968f.m2067e() > 0) {
                            int i11 = c0735x.f2915l;
                            int i12 = i11 != -1 ? i11 : 0;
                            int iM2035b = c0735x.m2035b();
                            for (int i13 = i12; i13 < iM2035b; i13++) {
                                AbstractC0741b0 abstractC0741b0M1601H = m1601H(i13);
                                if (abstractC0741b0M1601H == null) {
                                    break;
                                }
                                View view3 = abstractC0741b0M1601H.f2931a;
                                if (view3.hasFocusable()) {
                                    view = view3;
                                    break;
                                }
                            }
                            int iMin = Math.min(iM2035b, i12) - 1;
                            while (true) {
                                if (iMin < 0) {
                                    break;
                                }
                                AbstractC0741b0 abstractC0741b0M1601H2 = m1601H(iMin);
                                if (abstractC0741b0M1601H2 == null) {
                                    break;
                                }
                                View view4 = abstractC0741b0M1601H2.f2931a;
                                if (view4.hasFocusable()) {
                                    view = view4;
                                    break;
                                }
                                iMin--;
                            }
                        }
                        if (view != null) {
                            int i14 = c0735x.f2917n;
                            if (i14 != -1 && (viewFindViewById = view.findViewById(i14)) != null && viewFindViewById.isFocusable()) {
                                view = viewFindViewById;
                            }
                            view.requestFocus();
                        }
                    }
                }
            }
        }
        c0735x.f2916m = -1L;
        c0735x.f2915l = -1;
        c0735x.f2917n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        AbstractC0741b0 abstractC0741b0M1586M = m1586M(view);
        if (abstractC0741b0M1586M != null) {
            if (abstractC0741b0M1586M.m2056j()) {
                abstractC0741b0M1586M.f2940j &= -257;
            } else if (!abstractC0741b0M1586M.m2061o()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(abstractC0741b0M1586M);
                throw new IllegalArgumentException(AbstractC0529T.m1415d(this, sb));
            }
        } else if (f1934z0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(AbstractC0529T.m1415d(this, sb2));
        }
        view.clearAnimation();
        m1586M(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0772w c0772w = this.f1982m.f2865e;
        if ((c0772w == null || !c0772w.f3129e) && !m1608P() && view2 != null) {
            m1621c0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1982m.mo1721n0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1988p;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0762m) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1998u != 0 || this.f2002w) {
            this.f2000v = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:253:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1642s() {
        int iM1603J;
        C0761l0 c0761l0;
        View viewM1598D;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        byte b;
        int i4;
        boolean z5;
        boolean z6;
        C0738a c0738aM563g;
        int i5;
        int i6;
        C0738a c0738a;
        C0735X c0735x = this.f1967e0;
        c0735x.m2034a(1);
        m1597C(c0735x);
        c0735x.f2912i = false;
        m1631j0();
        C0048n c0048n = this.f1970g;
        ((C1031j) c0048n.f174b).clear();
        C1029h c1029h = (C1029h) c0048n.f175c;
        c1029h.m2476b();
        m1612T();
        if (this.f1935A) {
            C0149e c0149e = this.f1966e;
            c0149e.m565i((ArrayList) c0149e.f467c);
            c0149e.m565i((ArrayList) c0149e.f468d);
            if (this.f1936B) {
                this.f1982m.mo1509Z();
            }
        }
        if (this.f1944J == null || !this.f1982m.mo1499C0()) {
            this.f1966e.m558b();
        } else {
            C0149e c0149e2 = this.f1966e;
            ArrayList arrayList = (ArrayList) c0149e2.f467c;
            C0001b c0001b = (C0001b) c0149e2.f470f;
            c0001b.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z7 = false;
                while (true) {
                    i2 = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((C0738a) arrayList.get(size)).f2918a == 8) {
                        if (z7) {
                            break;
                        }
                    } else {
                        z7 = true;
                    }
                    size--;
                }
                if (size == -1) {
                    break;
                }
                int i7 = size + 1;
                C0738a c0738a2 = (C0738a) arrayList.get(size);
                C0738a c0738a3 = (C0738a) arrayList.get(i7);
                int i8 = c0738a3.f2918a;
                if (i8 != 1) {
                    C0738a c0738aM563g2 = null;
                    C0149e c0149e3 = (C0149e) c0001b.f1b;
                    if (i8 == 2) {
                        int i9 = c0738a2.f2919b;
                        int i10 = c0738a2.f2920c;
                        if (i9 < i10) {
                            if (c0738a3.f2919b == i9 && c0738a3.f2920c == i10 - i9) {
                                z5 = false;
                                z6 = true;
                            } else {
                                z5 = false;
                                z6 = false;
                            }
                        } else if (c0738a3.f2919b == i10 + 1 && c0738a3.f2920c == i9 - i10) {
                            z5 = true;
                            z6 = true;
                        } else {
                            z5 = true;
                            z6 = false;
                        }
                        int i11 = c0738a3.f2919b;
                        if (i10 < i11) {
                            c0738a3.f2919b = i11 - 1;
                        } else {
                            int i12 = c0738a3.f2920c;
                            if (i10 < i11 + i12) {
                                c0738a3.f2920c = i12 - 1;
                                c0738a2.f2918a = 2;
                                c0738a2.f2920c = 1;
                                if (c0738a3.f2920c == 0) {
                                    arrayList.remove(i7);
                                    c0149e3.getClass();
                                    ((C0186c) c0149e3.f466b).mo624c(c0738a3);
                                }
                            }
                        }
                        int i13 = c0738a2.f2919b;
                        int i14 = c0738a3.f2919b;
                        if (i13 <= i14) {
                            c0738a3.f2919b = i14 + 1;
                        } else {
                            int i15 = i14 + c0738a3.f2920c;
                            if (i13 < i15) {
                                c0738aM563g2 = c0149e3.m563g(2, i13 + 1, i15 - i13);
                                c0738a3.f2920c = c0738a2.f2919b - c0738a3.f2919b;
                            }
                        }
                        C0738a c0738a4 = c0738aM563g2;
                        if (z6) {
                            arrayList.set(size, c0738a3);
                            arrayList.remove(i7);
                            c0149e3.getClass();
                            ((C0186c) c0149e3.f466b).mo624c(c0738a2);
                        } else {
                            if (z5) {
                                if (c0738a4 != null) {
                                    int i16 = c0738a2.f2919b;
                                    if (i16 > c0738a4.f2919b) {
                                        c0738a2.f2919b = i16 - c0738a4.f2920c;
                                    }
                                    int i17 = c0738a2.f2920c;
                                    if (i17 > c0738a4.f2919b) {
                                        c0738a2.f2920c = i17 - c0738a4.f2920c;
                                    }
                                }
                                int i18 = c0738a2.f2919b;
                                if (i18 > c0738a3.f2919b) {
                                    c0738a2.f2919b = i18 - c0738a3.f2920c;
                                }
                                int i19 = c0738a2.f2920c;
                                if (i19 > c0738a3.f2919b) {
                                    c0738a2.f2920c = i19 - c0738a3.f2920c;
                                }
                            } else {
                                if (c0738a4 != null) {
                                    int i20 = c0738a2.f2919b;
                                    if (i20 >= c0738a4.f2919b) {
                                        c0738a2.f2919b = i20 - c0738a4.f2920c;
                                    }
                                    int i21 = c0738a2.f2920c;
                                    if (i21 >= c0738a4.f2919b) {
                                        c0738a2.f2920c = i21 - c0738a4.f2920c;
                                    }
                                }
                                int i22 = c0738a2.f2919b;
                                if (i22 >= c0738a3.f2919b) {
                                    c0738a2.f2919b = i22 - c0738a3.f2920c;
                                }
                                int i23 = c0738a2.f2920c;
                                if (i23 >= c0738a3.f2919b) {
                                    c0738a2.f2920c = i23 - c0738a3.f2920c;
                                }
                            }
                            arrayList.set(size, c0738a3);
                            if (c0738a2.f2919b != c0738a2.f2920c) {
                                arrayList.set(i7, c0738a2);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (c0738a4 != null) {
                                arrayList.add(size, c0738a4);
                            }
                        }
                    } else if (i8 == 4) {
                        int i24 = c0738a2.f2920c;
                        int i25 = c0738a3.f2919b;
                        if (i24 < i25) {
                            c0738a3.f2919b = i25 - 1;
                        } else {
                            int i26 = c0738a3.f2920c;
                            if (i24 < i25 + i26) {
                                c0738a3.f2920c = i26 - 1;
                                c0738aM563g = c0149e3.m563g(4, c0738a2.f2919b, 1);
                            }
                            i5 = c0738a2.f2919b;
                            i6 = c0738a3.f2919b;
                            if (i5 > i6) {
                                c0738a3.f2919b = i6 + 1;
                            } else {
                                int i27 = i6 + c0738a3.f2920c;
                                if (i5 < i27) {
                                    int i28 = i27 - i5;
                                    c0738aM563g2 = c0149e3.m563g(4, i5 + 1, i28);
                                    c0738a3.f2920c -= i28;
                                }
                            }
                            c0738a = c0738aM563g2;
                            arrayList.set(i7, c0738a2);
                            if (c0738a3.f2920c <= 0) {
                                arrayList.set(size, c0738a3);
                            } else {
                                arrayList.remove(size);
                                c0149e3.getClass();
                                ((C0186c) c0149e3.f466b).mo624c(c0738a3);
                            }
                            if (c0738aM563g != null) {
                                arrayList.add(size, c0738aM563g);
                            }
                            if (c0738a == null) {
                                arrayList.add(size, c0738a);
                            }
                        }
                        c0738aM563g = null;
                        i5 = c0738a2.f2919b;
                        i6 = c0738a3.f2919b;
                        if (i5 > i6) {
                        }
                        c0738a = c0738aM563g2;
                        arrayList.set(i7, c0738a2);
                        if (c0738a3.f2920c <= 0) {
                        }
                        if (c0738aM563g != null) {
                        }
                        if (c0738a == null) {
                        }
                    }
                } else {
                    int i29 = c0738a2.f2920c;
                    int i30 = c0738a3.f2919b;
                    int i31 = i29 < i30 ? -1 : 0;
                    int i32 = c0738a2.f2919b;
                    if (i32 < i30) {
                        i31++;
                    }
                    if (i30 <= i32) {
                        c0738a2.f2919b = i32 + c0738a3.f2920c;
                    }
                    int i33 = c0738a3.f2919b;
                    if (i33 <= i29) {
                        c0738a2.f2920c = i29 + c0738a3.f2920c;
                    }
                    c0738a3.f2919b = i33 + i31;
                    arrayList.set(size, c0738a3);
                    arrayList.set(i7, c0738a2);
                }
            }
            int size2 = arrayList.size();
            int i34 = 0;
            while (i34 < size2) {
                C0738a c0738aM563g3 = (C0738a) arrayList.get(i34);
                int i35 = c0738aM563g3.f2918a;
                if (i35 != 1) {
                    C0186c c0186c = (C0186c) c0149e2.f466b;
                    C0713A c0713a = (C0713A) c0149e2.f469e;
                    if (i35 == 2) {
                        i3 = size2;
                        int i36 = c0738aM563g3.f2919b;
                        int i37 = c0738aM563g3.f2920c + i36;
                        int i38 = i36;
                        int i39 = 0;
                        byte b2 = -1;
                        while (i38 < i37) {
                            if (c0713a.m1967b(i38) != null || c0149e2.m557a(i38)) {
                                if (b2 == 0) {
                                    c0149e2.m559c(c0149e2.m563g(2, i36, i39));
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z4 = z3;
                                b = 1;
                            } else {
                                if (b2 == 1) {
                                    c0149e2.m564h(c0149e2.m563g(2, i36, i39));
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                b = 0;
                            }
                            if (z4) {
                                i38 -= i39;
                                i37 -= i39;
                                i39 = 1;
                            } else {
                                i39++;
                            }
                            i38++;
                            b2 = b;
                        }
                        if (i39 != c0738aM563g3.f2920c) {
                            c0186c.mo624c(c0738aM563g3);
                            c0738aM563g3 = c0149e2.m563g(2, i36, i39);
                        }
                        if (b2 == 0) {
                            c0149e2.m559c(c0738aM563g3);
                        } else {
                            c0149e2.m564h(c0738aM563g3);
                        }
                    } else if (i35 != 4) {
                        if (i35 == i2) {
                            c0149e2.m564h(c0738aM563g3);
                        }
                        i3 = size2;
                    } else {
                        int i40 = c0738aM563g3.f2919b;
                        int i41 = c0738aM563g3.f2920c + i40;
                        int i42 = i40;
                        byte b3 = -1;
                        int i43 = 0;
                        while (i40 < i41) {
                            if (c0713a.m1967b(i40) != null || c0149e2.m557a(i40)) {
                                i4 = size2;
                                if (b3 == 0) {
                                    c0149e2.m559c(c0149e2.m563g(4, i42, i43));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                b3 = 1;
                            } else {
                                i4 = size2;
                                if (b3 == 1) {
                                    c0149e2.m564h(c0149e2.m563g(4, i42, i43));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                b3 = 0;
                            }
                            i43++;
                            i40++;
                            size2 = i4;
                        }
                        i3 = size2;
                        if (i43 != c0738aM563g3.f2920c) {
                            c0186c.mo624c(c0738aM563g3);
                            c0738aM563g3 = c0149e2.m563g(4, i42, i43);
                        }
                        if (b3 == 0) {
                            c0149e2.m559c(c0738aM563g3);
                        } else {
                            c0149e2.m564h(c0738aM563g3);
                        }
                    }
                } else {
                    i3 = size2;
                    c0149e2.m564h(c0738aM563g3);
                }
                i34++;
                size2 = i3;
                i2 = 8;
            }
            arrayList.clear();
        }
        boolean z8 = this.f1973h0 || this.f1975i0;
        boolean z9 = this.f1996t && this.f1944J != null && ((z2 = this.f1935A) || z8 || this.f1982m.f2866f) && (!z2 || this.f1980l.f2847b);
        C0735X c0735x2 = this.f1967e0;
        c0735x2.f2913j = z9;
        c0735x2.f2914k = z9 && z8 && !this.f1935A && this.f1944J != null && this.f1982m.mo1499C0();
        AbstractC0741b0 abstractC0741b0M1605L = null;
        View focusedChild = (this.f1959a0 && hasFocus() && this.f1980l != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewM1598D = m1598D(focusedChild)) != null) {
            abstractC0741b0M1605L = m1605L(viewM1598D);
        }
        if (abstractC0741b0M1605L == null) {
            c0735x.f2916m = -1L;
            c0735x.f2915l = -1;
            c0735x.f2917n = -1;
        } else {
            c0735x.f2916m = this.f1980l.f2847b ? abstractC0741b0M1605L.f2935e : -1L;
            if (!this.f1935A) {
                if (abstractC0741b0M1605L.m2054h()) {
                    iM1603J = abstractC0741b0M1605L.f2934d;
                } else {
                    RecyclerView recyclerView = abstractC0741b0M1605L.f2948r;
                    iM1603J = recyclerView == null ? -1 : recyclerView.m1603J(abstractC0741b0M1605L);
                }
                c0735x.f2915l = iM1603J;
                View focusedChild2 = abstractC0741b0M1605L.f2931a;
                int id = focusedChild2.getId();
                while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                    focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                    if (focusedChild2.getId() != -1) {
                        id = focusedChild2.getId();
                    }
                }
                c0735x.f2917n = id;
            }
        }
        c0735x.f2911h = c0735x.f2913j && this.f1975i0;
        this.f1975i0 = false;
        this.f1973h0 = false;
        c0735x.f2910g = c0735x.f2914k;
        c0735x.f2908e = this.f1980l.mo985a();
        m1600F(this.f1983m0);
        boolean z10 = c0735x.f2913j;
        C1031j c1031j = (C1031j) c0048n.f174b;
        if (z10) {
            int iM2067e = this.f1968f.m2067e();
            for (int i44 = 0; i44 < iM2067e; i44++) {
                AbstractC0741b0 abstractC0741b0M1586M = m1586M(this.f1968f.m2066d(i44));
                if (!abstractC0741b0M1586M.m2061o() && (!abstractC0741b0M1586M.m2052f() || this.f1980l.f2847b)) {
                    AbstractC0719G abstractC0719G = this.f1944J;
                    AbstractC0719G.m1977b(abstractC0741b0M1586M);
                    abstractC0741b0M1586M.m2049c();
                    abstractC0719G.getClass();
                    C0280q c0280q = new C0280q();
                    c0280q.m890a(abstractC0741b0M1586M);
                    C0761l0 c0761l0M2092a = (C0761l0) c1031j.get(abstractC0741b0M1586M);
                    if (c0761l0M2092a == null) {
                        c0761l0M2092a = C0761l0.m2092a();
                        c1031j.put(abstractC0741b0M1586M, c0761l0M2092a);
                    }
                    c0761l0M2092a.f3043b = c0280q;
                    c0761l0M2092a.f3042a |= 4;
                    if (c0735x.f2911h && abstractC0741b0M1586M.m2057k() && !abstractC0741b0M1586M.m2054h() && !abstractC0741b0M1586M.m2061o() && !abstractC0741b0M1586M.m2052f()) {
                        c1029h.m2481g(m1604K(abstractC0741b0M1586M), abstractC0741b0M1586M);
                    }
                }
            }
        }
        if (c0735x.f2914k) {
            int iM2070h = this.f1968f.m2070h();
            for (int i45 = 0; i45 < iM2070h; i45++) {
                AbstractC0741b0 abstractC0741b0M1586M2 = m1586M(this.f1968f.m2069g(i45));
                if (f1934z0 && abstractC0741b0M1586M2.f2933c == -1 && !abstractC0741b0M1586M2.m2054h()) {
                    throw new IllegalStateException(AbstractC0529T.m1415d(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!abstractC0741b0M1586M2.m2061o() && abstractC0741b0M1586M2.f2934d == -1) {
                    abstractC0741b0M1586M2.f2934d = abstractC0741b0M1586M2.f2933c;
                }
            }
            boolean z11 = c0735x.f2909f;
            c0735x.f2909f = false;
            this.f1982m.mo1513d0(this.f1962c, c0735x);
            c0735x.f2909f = z11;
            for (int i46 = 0; i46 < this.f1968f.m2067e(); i46++) {
                AbstractC0741b0 abstractC0741b0M1586M3 = m1586M(this.f1968f.m2066d(i46));
                if (!abstractC0741b0M1586M3.m2061o() && ((c0761l0 = (C0761l0) c1031j.get(abstractC0741b0M1586M3)) == null || (c0761l0.f3042a & 4) == 0)) {
                    AbstractC0719G.m1977b(abstractC0741b0M1586M3);
                    boolean z12 = (abstractC0741b0M1586M3.f2940j & 8192) != 0;
                    AbstractC0719G abstractC0719G2 = this.f1944J;
                    abstractC0741b0M1586M3.m2049c();
                    abstractC0719G2.getClass();
                    C0280q c0280q2 = new C0280q();
                    c0280q2.m890a(abstractC0741b0M1586M3);
                    if (z12) {
                        m1617Y(abstractC0741b0M1586M3, c0280q2);
                    } else {
                        C0761l0 c0761l0M2092a2 = (C0761l0) c1031j.get(abstractC0741b0M1586M3);
                        if (c0761l0M2092a2 == null) {
                            c0761l0M2092a2 = C0761l0.m2092a();
                            c1031j.put(abstractC0741b0M1586M3, c0761l0M2092a2);
                        }
                        c0761l0M2092a2.f3042a |= 2;
                        c0761l0M2092a2.f3043b = c0280q2;
                    }
                }
            }
            m1635m();
        } else {
            m1635m();
        }
        m1613U(true);
        m1634l0(false);
        c0735x.f2907d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2002w) {
            return;
        }
        boolean zMo1571d = abstractC0723K.mo1571d();
        boolean zMo1572e = this.f1982m.mo1572e();
        if (zMo1571d || zMo1572e) {
            if (!zMo1571d) {
                i2 = 0;
            }
            if (!zMo1572e) {
                i3 = 0;
            }
            m1622d0(i2, i3, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m1608P()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2006y |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C0745d0 c0745d0) {
        this.f1981l0 = c0745d0;
        AbstractC0240S.m785p(this, c0745d0);
    }

    public void setAdapter(AbstractC0714B abstractC0714B) {
        setLayoutFrozen(false);
        AbstractC0714B abstractC0714B2 = this.f1980l;
        C0731T c0731t = this.f1960b;
        if (abstractC0714B2 != null) {
            abstractC0714B2.f2846a.unregisterObserver(c0731t);
            this.f1980l.getClass();
        }
        AbstractC0719G abstractC0719G = this.f1944J;
        if (abstractC0719G != null) {
            abstractC0719G.mo1981e();
        }
        AbstractC0723K abstractC0723K = this.f1982m;
        C0729Q c0729q = this.f1962c;
        if (abstractC0723K != null) {
            abstractC0723K.m2005j0(c0729q);
            this.f1982m.m2006k0(c0729q);
        }
        c0729q.f2887a.clear();
        c0729q.m2025f();
        C0149e c0149e = this.f1966e;
        c0149e.m565i((ArrayList) c0149e.f467c);
        c0149e.m565i((ArrayList) c0149e.f468d);
        AbstractC0714B abstractC0714B3 = this.f1980l;
        this.f1980l = abstractC0714B;
        if (abstractC0714B != null) {
            abstractC0714B.f2846a.registerObserver(c0731t);
        }
        AbstractC0723K abstractC0723K2 = this.f1982m;
        if (abstractC0723K2 != null) {
            abstractC0723K2.mo1666Q();
        }
        AbstractC0714B abstractC0714B4 = this.f1980l;
        c0729q.f2887a.clear();
        c0729q.m2025f();
        c0729q.m2024e(abstractC0714B3, true);
        C0728P c0728pM2022c = c0729q.m2022c();
        if (abstractC0714B3 != null) {
            c0728pM2022c.f2885b--;
        }
        if (c0728pM2022c.f2885b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = c0728pM2022c.f2884a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                C0727O c0727o = (C0727O) sparseArray.valueAt(i2);
                Iterator it = c0727o.f2880a.iterator();
                while (it.hasNext()) {
                    AbstractC0383m.m1042g(((AbstractC0741b0) it.next()).f2931a);
                }
                c0727o.f2880a.clear();
                i2++;
            }
        }
        if (abstractC0714B4 != null) {
            c0728pM2022c.f2885b++;
        }
        c0729q.m2023d();
        this.f1967e0.f2909f = true;
        m1616X(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0717E interfaceC0717E) {
        if (interfaceC0717E == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1972h) {
            this.f1943I = null;
            this.f1941G = null;
            this.f1942H = null;
            this.f1940F = null;
        }
        this.f1972h = z2;
        super.setClipToPadding(z2);
        if (this.f1996t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC0718F abstractC0718F) {
        abstractC0718F.getClass();
        this.f1939E = abstractC0718F;
        this.f1943I = null;
        this.f1941G = null;
        this.f1942H = null;
        this.f1940F = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1994s = z2;
    }

    public void setItemAnimator(AbstractC0719G abstractC0719G) {
        AbstractC0719G abstractC0719G2 = this.f1944J;
        if (abstractC0719G2 != null) {
            abstractC0719G2.mo1981e();
            this.f1944J.f2849a = null;
        }
        this.f1944J = abstractC0719G;
        if (abstractC0719G != null) {
            abstractC0719G.f2849a = this.f1977j0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        C0729Q c0729q = this.f1962c;
        c0729q.f2891e = i2;
        c0729q.m2032m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(AbstractC0723K abstractC0723K) {
        RecyclerView recyclerView;
        if (abstractC0723K == this.f1982m) {
            return;
        }
        m1638n0();
        AbstractC0723K abstractC0723K2 = this.f1982m;
        C0729Q c0729q = this.f1962c;
        if (abstractC0723K2 != null) {
            AbstractC0719G abstractC0719G = this.f1944J;
            if (abstractC0719G != null) {
                abstractC0719G.mo1981e();
            }
            this.f1982m.m2005j0(c0729q);
            this.f1982m.m2006k0(c0729q);
            c0729q.f2887a.clear();
            c0729q.m2025f();
            if (this.f1992r) {
                AbstractC0723K abstractC0723K3 = this.f1982m;
                abstractC0723K3.f2867g = false;
                abstractC0723K3.mo1558S(this);
            }
            this.f1982m.m2016w0(null);
            this.f1982m = null;
        } else {
            c0729q.f2887a.clear();
            c0729q.m2025f();
        }
        C0742c c0742c = this.f1968f;
        c0742c.f2951b.m2045g();
        ArrayList arrayList = c0742c.f2952c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = c0742c.f2950a.f2845a;
            if (size < 0) {
                break;
            }
            AbstractC0741b0 abstractC0741b0M1586M = m1586M((View) arrayList.get(size));
            if (abstractC0741b0M1586M != null) {
                int i2 = abstractC0741b0M1586M.f2946p;
                if (recyclerView.m1608P()) {
                    abstractC0741b0M1586M.f2947q = i2;
                    recyclerView.f1993r0.add(abstractC0741b0M1586M);
                } else {
                    abstractC0741b0M1586M.f2931a.setImportantForAccessibility(i2);
                }
                abstractC0741b0M1586M.f2946p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            m1586M(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1982m = abstractC0723K;
        if (abstractC0723K != null) {
            if (abstractC0723K.f2862b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC0723K);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC0529T.m1415d(abstractC0723K.f2862b, sb));
            }
            abstractC0723K.m2016w0(this);
            if (this.f1992r) {
                AbstractC0723K abstractC0723K4 = this.f1982m;
                abstractC0723K4.f2867g = true;
                abstractC0723K4.mo1720R(this);
            }
        }
        c0729q.m2032m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0274n scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f852d) {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            AbstractC0229G.m724z(scrollingChildHelper.f851c);
        }
        scrollingChildHelper.f852d = z2;
    }

    public void setOnFlingListener(AbstractC0725M abstractC0725M) {
        this.f1953S = abstractC0725M;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0726N abstractC0726N) {
        this.f1969f0 = abstractC0726N;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1959a0 = z2;
    }

    public void setRecycledViewPool(C0728P c0728p) {
        C0729Q c0729q = this.f1962c;
        RecyclerView recyclerView = c0729q.f2894h;
        c0729q.m2024e(recyclerView.f1980l, false);
        if (c0729q.f2893g != null) {
            r2.f2885b--;
        }
        c0729q.f2893g = c0728p;
        if (c0728p != null && recyclerView.getAdapter() != null) {
            c0729q.f2893g.f2885b++;
        }
        c0729q.m2023d();
    }

    public void setScrollState(int i2) {
        C0772w c0772w;
        if (i2 == this.f1945K) {
            return;
        }
        if (f1926A0) {
            Log.d("RecyclerView", "setting scroll state to " + i2 + " from " + this.f1945K, new Exception());
        }
        this.f1945K = i2;
        if (i2 != 2) {
            RunnableC0739a0 runnableC0739a0 = this.f1961b0;
            runnableC0739a0.f2927g.removeCallbacks(runnableC0739a0);
            runnableC0739a0.f2923c.abortAnimation();
            AbstractC0723K abstractC0723K = this.f1982m;
            if (abstractC0723K != null && (c0772w = abstractC0723K.f2865e) != null) {
                c0772w.m2116i();
            }
        }
        AbstractC0723K abstractC0723K2 = this.f1982m;
        if (abstractC0723K2 != null) {
            abstractC0723K2.mo1682h0(i2);
        }
        AbstractC0726N abstractC0726N = this.f1969f0;
        if (abstractC0726N != null) {
            abstractC0726N.mo1733a(this, i2);
        }
        ArrayList arrayList = this.f1971g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0726N) this.f1971g0.get(size)).mo1733a(this, i2);
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.f1952R = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.f1952R = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0737Z abstractC0737Z) {
        this.f1962c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().m877g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m878h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.f2002w) {
            m1632k("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f2002w = true;
                this.f2004x = true;
                m1638n0();
                return;
            }
            this.f2002w = false;
            if (this.f2000v && this.f1982m != null && this.f1980l != null) {
                requestLayout();
            }
            this.f2000v = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m1643t() {
        m1631j0();
        m1612T();
        C0735X c0735x = this.f1967e0;
        c0735x.m2034a(6);
        this.f1966e.m558b();
        c0735x.f2908e = this.f1980l.mo985a();
        c0735x.f2906c = 0;
        if (this.f1964d != null) {
            AbstractC0714B abstractC0714B = this.f1980l;
            int iM2545a = AbstractC1048e.m2545a(abstractC0714B.f2848c);
            if (iM2545a == 1 ? abstractC0714B.mo985a() > 0 : iM2545a != 2) {
                Parcelable parcelable = this.f1964d.f2896c;
                if (parcelable != null) {
                    this.f1982m.mo1574f0(parcelable);
                }
                this.f1964d = null;
            }
        }
        c0735x.f2910g = false;
        this.f1982m.mo1513d0(this.f1962c, c0735x);
        c0735x.f2909f = false;
        c0735x.f2913j = c0735x.f2913j && this.f1944J != null;
        c0735x.f2907d = 4;
        m1613U(true);
        m1634l0(false);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m1644u(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m873c(i2, i3, i4, iArr, iArr2);
    }

    /* JADX INFO: renamed from: v */
    public final void m1645v(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().m874d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    /* JADX INFO: renamed from: w */
    public final void m1646w(int i2, int i3) {
        this.f1938D++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        AbstractC0726N abstractC0726N = this.f1969f0;
        if (abstractC0726N != null) {
            abstractC0726N.mo1734b(this, i2, i3);
        }
        ArrayList arrayList = this.f1971g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0726N) this.f1971g0.get(size)).mo1734b(this, i2, i3);
            }
        }
        this.f1938D--;
    }

    /* JADX INFO: renamed from: x */
    public final void m1647x() {
        if (this.f1943I != null) {
            return;
        }
        ((C0736Y) this.f1939E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1943I = edgeEffect;
        if (this.f1972h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m1648y() {
        if (this.f1940F != null) {
            return;
        }
        ((C0736Y) this.f1939E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1940F = edgeEffect;
        if (this.f1972h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m1649z() {
        if (this.f1942H != null) {
            return;
        }
        ((C0736Y) this.f1939E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1942H = edgeEffect;
        if (this.f1972h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        float fM795a;
        int i3;
        TypedArray typedArray;
        int i4;
        char c2;
        char c3;
        char c4;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i2);
        this.f1960b = new C0731T(this);
        this.f1962c = new C0729Q(this);
        this.f1970g = new C0048n(15);
        this.f1974i = new Rect();
        this.f1976j = new Rect();
        this.f1978k = new RectF();
        this.f1984n = new ArrayList();
        this.f1986o = new ArrayList();
        this.f1988p = new ArrayList();
        this.f1998u = 0;
        this.f1935A = false;
        this.f1936B = false;
        this.f1937C = 0;
        this.f1938D = 0;
        this.f1939E = f1933H0;
        C0756j c0756j = new C0756j();
        c0756j.f2849a = null;
        c0756j.f2850b = new ArrayList();
        c0756j.f2851c = 120L;
        c0756j.f2852d = 120L;
        c0756j.f2853e = 250L;
        c0756j.f2854f = 250L;
        c0756j.f3014g = true;
        c0756j.f3015h = new ArrayList();
        c0756j.f3016i = new ArrayList();
        c0756j.f3017j = new ArrayList();
        c0756j.f3018k = new ArrayList();
        c0756j.f3019l = new ArrayList();
        c0756j.f3020m = new ArrayList();
        c0756j.f3021n = new ArrayList();
        c0756j.f3022o = new ArrayList();
        c0756j.f3023p = new ArrayList();
        c0756j.f3024q = new ArrayList();
        c0756j.f3025r = new ArrayList();
        this.f1944J = c0756j;
        this.f1945K = 0;
        this.f1946L = -1;
        this.f1956V = Float.MIN_VALUE;
        this.f1957W = Float.MIN_VALUE;
        this.f1959a0 = true;
        this.f1961b0 = new RunnableC0739a0(this);
        this.f1965d0 = f1930E0 ? new C0763n() : null;
        C0735X c0735x = new C0735X();
        c0735x.f2904a = -1;
        c0735x.f2905b = 0;
        c0735x.f2906c = 0;
        c0735x.f2907d = 1;
        c0735x.f2908e = 0;
        c0735x.f2909f = false;
        c0735x.f2910g = false;
        c0735x.f2911h = false;
        c0735x.f2912i = false;
        c0735x.f2913j = false;
        c0735x.f2914k = false;
        this.f1967e0 = c0735x;
        this.f1973h0 = false;
        this.f1975i0 = false;
        C0713A c0713a = new C0713A(this);
        this.f1977j0 = c0713a;
        this.f1979k0 = false;
        this.f1983m0 = new int[2];
        this.f1987o0 = new int[2];
        this.f1989p0 = new int[2];
        this.f1991q0 = new int[2];
        this.f1993r0 = new ArrayList();
        this.f1995s0 = new RunnableC0191D(9, this);
        this.f1999u0 = 0;
        this.f2001v0 = 0;
        this.f2005x0 = new C0713A(this);
        this.f2007y0 = new C0260g(getContext(), new C0713A(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1952R = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = AbstractC0244W.f784a;
            fM795a = AbstractC0241T.m789a(viewConfiguration);
        } else {
            fM795a = AbstractC0244W.m795a(viewConfiguration, context);
        }
        this.f1956V = fM795a;
        this.f1957W = i5 >= 26 ? AbstractC0241T.m790b(viewConfiguration) : AbstractC0244W.m795a(viewConfiguration, context);
        this.f1954T = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1955U = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1958a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1944J.f2849a = c0713a;
        this.f1966e = new C0149e(new C0713A(this));
        this.f1968f = new C0742c(new C0713A(this));
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        if ((i5 >= 26 ? AbstractC0231I.m731c(this) : 0) == 0 && i5 >= 26) {
            AbstractC0231I.m741m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2008z = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0745d0(this));
        int[] iArr = AbstractC0697a.f2778a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        AbstractC0240S.m784o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1972h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(AbstractC0529T.m1415d(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c2 = 3;
            c4 = 2;
            typedArray = typedArrayObtainStyledAttributes;
            i4 = 4;
            c3 = 1;
            i3 = i2;
            new C0762m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.reddit.frontpage.R.dimen.resc), resources.getDimensionPixelSize(com.reddit.frontpage.R.dimen.resc), resources.getDimensionPixelOffset(com.reddit.frontpage.R.dimen.resc));
        } else {
            i3 = i2;
            typedArray = typedArrayObtainStyledAttributes;
            i4 = 4;
            c2 = 3;
            c3 = 1;
            c4 = 2;
        }
        typedArray.recycle();
        this.f2003w0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0723K.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f1931F0);
                        objArr = new Object[i4];
                        objArr[0] = context;
                        objArr[c3] = attributeSet;
                        objArr[c4] = Integer.valueOf(i3);
                        objArr[c2] = 0;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC0723K) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e4);
                } catch (ClassNotFoundException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e6);
                } catch (InstantiationException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e8);
                }
            }
        }
        int[] iArr2 = f1927B0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        AbstractC0240S.m784o(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i3);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(com.reddit.frontpage.R.id.resc, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0723K abstractC0723K = this.f1982m;
        if (abstractC0723K != null) {
            return abstractC0723K.mo1538t(layoutParams);
        }
        throw new IllegalStateException(AbstractC0529T.m1415d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC0730S interfaceC0730S) {
    }
}
