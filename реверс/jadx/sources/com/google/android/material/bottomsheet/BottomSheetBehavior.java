package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractC0529T;
import com.reddit.frontpage.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p000A.C0005f;
import p001A0.AbstractC0016e;
import p004C.RunnableC0021b;
import p005C0.C0048n;
import p005C0.C0050p;
import p005C0.ViewOnAttachStateChangeListenerC0049o;
import p015I0.C0112h;
import p015I0.C0117m;
import p017J0.C0142c;
import p017J0.C0144e;
import p018K.C0154j;
import p019K0.C0160b;
import p020L.C0176j;
import p024N.AbstractC0227E;
import p024N.AbstractC0229G;
import p024N.AbstractC0240S;
import p024N.C0248a;
import p024N.C0250b;
import p024N.C0254d;
import p024N.C0261g0;
import p024N.C0263h0;
import p024N.ViewOnApplyWindowInsetsListenerC0259f0;
import p026O.C0306f;
import p028P.AbstractC0323a;
import p042W.C0404e;
import p079n0.AbstractC1013a;
import p088s0.C1043a;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0002c {

    /* JADX INFO: renamed from: A */
    public final C0144e f2070A;

    /* JADX INFO: renamed from: B */
    public final ValueAnimator f2071B;

    /* JADX INFO: renamed from: C */
    public final int f2072C;

    /* JADX INFO: renamed from: D */
    public int f2073D;

    /* JADX INFO: renamed from: E */
    public int f2074E;

    /* JADX INFO: renamed from: F */
    public final float f2075F;

    /* JADX INFO: renamed from: G */
    public int f2076G;

    /* JADX INFO: renamed from: H */
    public final float f2077H;

    /* JADX INFO: renamed from: I */
    public boolean f2078I;

    /* JADX INFO: renamed from: J */
    public boolean f2079J;

    /* JADX INFO: renamed from: K */
    public final boolean f2080K;

    /* JADX INFO: renamed from: L */
    public int f2081L;

    /* JADX INFO: renamed from: M */
    public C0404e f2082M;

    /* JADX INFO: renamed from: N */
    public boolean f2083N;

    /* JADX INFO: renamed from: O */
    public int f2084O;

    /* JADX INFO: renamed from: P */
    public boolean f2085P;

    /* JADX INFO: renamed from: Q */
    public final float f2086Q;

    /* JADX INFO: renamed from: R */
    public int f2087R;

    /* JADX INFO: renamed from: S */
    public int f2088S;

    /* JADX INFO: renamed from: T */
    public int f2089T;

    /* JADX INFO: renamed from: U */
    public WeakReference f2090U;

    /* JADX INFO: renamed from: V */
    public WeakReference f2091V;

    /* JADX INFO: renamed from: W */
    public final ArrayList f2092W;

    /* JADX INFO: renamed from: X */
    public VelocityTracker f2093X;

    /* JADX INFO: renamed from: Y */
    public int f2094Y;

    /* JADX INFO: renamed from: Z */
    public int f2095Z;

    /* JADX INFO: renamed from: a */
    public final int f2096a;

    /* JADX INFO: renamed from: a0 */
    public boolean f2097a0;

    /* JADX INFO: renamed from: b */
    public boolean f2098b;

    /* JADX INFO: renamed from: b0 */
    public HashMap f2099b0;

    /* JADX INFO: renamed from: c */
    public final float f2100c;

    /* JADX INFO: renamed from: c0 */
    public final SparseIntArray f2101c0;

    /* JADX INFO: renamed from: d */
    public final int f2102d;

    /* JADX INFO: renamed from: d0 */
    public final C0142c f2103d0;

    /* JADX INFO: renamed from: e */
    public int f2104e;

    /* JADX INFO: renamed from: f */
    public boolean f2105f;

    /* JADX INFO: renamed from: g */
    public int f2106g;

    /* JADX INFO: renamed from: h */
    public final int f2107h;

    /* JADX INFO: renamed from: i */
    public final C0112h f2108i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f2109j;

    /* JADX INFO: renamed from: k */
    public final int f2110k;

    /* JADX INFO: renamed from: l */
    public final int f2111l;

    /* JADX INFO: renamed from: m */
    public int f2112m;

    /* JADX INFO: renamed from: n */
    public final boolean f2113n;

    /* JADX INFO: renamed from: o */
    public final boolean f2114o;

    /* JADX INFO: renamed from: p */
    public final boolean f2115p;

    /* JADX INFO: renamed from: q */
    public final boolean f2116q;

    /* JADX INFO: renamed from: r */
    public final boolean f2117r;

    /* JADX INFO: renamed from: s */
    public final boolean f2118s;

    /* JADX INFO: renamed from: t */
    public final boolean f2119t;

    /* JADX INFO: renamed from: u */
    public final boolean f2120u;

    /* JADX INFO: renamed from: v */
    public int f2121v;

    /* JADX INFO: renamed from: w */
    public int f2122w;

    /* JADX INFO: renamed from: x */
    public final boolean f2123x;

    /* JADX INFO: renamed from: y */
    public final C0117m f2124y;

    /* JADX INFO: renamed from: z */
    public boolean f2125z;

    public BottomSheetBehavior() {
        this.f2096a = 0;
        this.f2098b = true;
        this.f2110k = -1;
        this.f2111l = -1;
        this.f2070A = new C0144e(this);
        this.f2075F = 0.5f;
        this.f2077H = -1.0f;
        this.f2080K = true;
        this.f2081L = 4;
        this.f2086Q = 0.1f;
        this.f2092W = new ArrayList();
        this.f2095Z = -1;
        this.f2101c0 = new SparseIntArray();
        this.f2103d0 = new C0142c(this, 1);
    }

    /* JADX INFO: renamed from: v */
    public static View m1689v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        if (AbstractC0229G.m714p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewM1689v = m1689v(viewGroup.getChildAt(i2));
            if (viewM1689v != null) {
                return viewM1689v;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static int m1690w(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: A */
    public final void m1691A(int i2) {
        if (i2 == -1) {
            if (this.f2105f) {
                return;
            } else {
                this.f2105f = true;
            }
        } else {
            if (!this.f2105f && this.f2104e == i2) {
                return;
            }
            this.f2105f = false;
            this.f2104e = Math.max(0, i2);
        }
        m1699I();
    }

    /* JADX INFO: renamed from: B */
    public final void m1692B(int i2) {
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i2 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f2078I && i2 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i2);
            return;
        }
        int i3 = (i2 == 6 && this.f2098b && m1705y(i2) <= this.f2073D) ? 3 : i2;
        WeakReference weakReference = this.f2090U;
        if (weakReference == null || weakReference.get() == null) {
            m1693C(i2);
            return;
        }
        View view = (View) this.f2090U.get();
        RunnableC0021b runnableC0021b = new RunnableC0021b(this, view, i3);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC0021b);
                return;
            }
        }
        runnableC0021b.run();
    }

    /* JADX INFO: renamed from: C */
    public final void m1693C(int i2) {
        if (this.f2081L == i2) {
            return;
        }
        this.f2081L = i2;
        if (i2 != 4 && i2 != 3 && i2 != 6) {
            boolean z2 = this.f2078I;
        }
        WeakReference weakReference = this.f2090U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            m1698H(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            m1698H(false);
        }
        m1697G(i2, true);
        ArrayList arrayList = this.f2092W;
        if (arrayList.size() <= 0) {
            m1696F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m1694D(View view, float f) {
        if (this.f2079J) {
            return true;
        }
        if (view.getTop() < this.f2076G) {
            return false;
        }
        return Math.abs(((f * this.f2086Q) + ((float) view.getTop())) - ((float) this.f2076G)) / ((float) m1702t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m1693C(2);
        m1697G(r4, true);
        r2.f2070A.m554a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m1129o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1695E(View view, int i2, boolean z2) {
        int iM1705y = m1705y(i2);
        C0404e c0404e = this.f2082M;
        if (c0404e != null) {
            if (!z2) {
                int left = view.getLeft();
                c0404e.f1108r = view;
                c0404e.f1093c = -1;
                boolean zM1122h = c0404e.m1122h(left, iM1705y, 0, 0);
                if (!zM1122h && c0404e.f1091a == 0 && c0404e.f1108r != null) {
                    c0404e.f1108r = null;
                }
            }
        }
        m1693C(i2);
    }

    /* JADX INFO: renamed from: F */
    public final void m1696F() {
        View view;
        int iM940a;
        WeakReference weakReference = this.f2090U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0240S.m782m(view, 524288);
        AbstractC0240S.m778i(view, 0);
        AbstractC0240S.m782m(view, 262144);
        AbstractC0240S.m778i(view, 0);
        AbstractC0240S.m782m(view, 1048576);
        AbstractC0240S.m778i(view, 0);
        SparseIntArray sparseIntArray = this.f2101c0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            AbstractC0240S.m782m(view, i2);
            AbstractC0240S.m778i(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f2098b && this.f2081L != 6) {
            String string = view.getResources().getString(R.string.resc);
            C0154j c0154j = new C0154j(this, 6);
            ArrayList arrayListM774e = AbstractC0240S.m774e(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListM774e.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = AbstractC0240S.f781e[i5];
                        boolean z2 = true;
                        for (int i7 = 0; i7 < arrayListM774e.size(); i7++) {
                            z2 &= ((C0306f) arrayListM774e.get(i7)).m940a() != i6;
                        }
                        if (z2) {
                            i4 = i6;
                        }
                    }
                    iM940a = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0306f) arrayListM774e.get(i3)).f905a).getLabel())) {
                        iM940a = ((C0306f) arrayListM774e.get(i3)).m940a();
                        break;
                    }
                    i3++;
                }
            }
            if (iM940a != -1) {
                C0306f c0306f = new C0306f(null, iM940a, string, c0154j, null);
                View.AccessibilityDelegate accessibilityDelegateM772c = AbstractC0240S.m772c(view);
                C0250b c0250b = accessibilityDelegateM772c == null ? null : accessibilityDelegateM772c instanceof C0248a ? ((C0248a) accessibilityDelegateM772c).f791a : new C0250b(accessibilityDelegateM772c);
                if (c0250b == null) {
                    c0250b = new C0250b();
                }
                AbstractC0240S.m785p(view, c0250b);
                AbstractC0240S.m782m(view, c0306f.m940a());
                AbstractC0240S.m774e(view).add(c0306f);
                AbstractC0240S.m778i(view, 0);
            }
            sparseIntArray.put(0, iM940a);
        }
        if (this.f2078I && this.f2081L != 5) {
            AbstractC0240S.m783n(view, C0306f.f899j, new C0154j(this, 5));
        }
        int i8 = this.f2081L;
        if (i8 == 3) {
            AbstractC0240S.m783n(view, C0306f.f898i, new C0154j(this, this.f2098b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            AbstractC0240S.m783n(view, C0306f.f897h, new C0154j(this, this.f2098b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            AbstractC0240S.m783n(view, C0306f.f898i, new C0154j(this, 4));
            AbstractC0240S.m783n(view, C0306f.f897h, new C0154j(this, 3));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m1697G(int i2, boolean z2) {
        C0112h c0112h = this.f2108i;
        ValueAnimator valueAnimator = this.f2071B;
        if (i2 == 2) {
            return;
        }
        boolean z3 = this.f2081L == 3 && (this.f2123x || m1706z());
        if (this.f2125z == z3 || c0112h == null) {
            return;
        }
        this.f2125z = z3;
        if (!z2 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            c0112h.m481m(this.f2125z ? m1701s() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(c0112h.f346a.f336i, z3 ? m1701s() : 1.0f);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m1698H(boolean z2) {
        WeakReference weakReference = this.f2090U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f2099b0 != null) {
                    return;
                } else {
                    this.f2099b0 = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.f2090U.get() && z2) {
                    this.f2099b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f2099b0 = null;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m1699I() {
        View view;
        if (this.f2090U != null) {
            m1700r();
            if (this.f2081L != 4 || (view = (View) this.f2090U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: c */
    public final void mo64c(C0005f c0005f) {
        this.f2090U = null;
        this.f2082M = null;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: e */
    public final void mo66e() {
        this.f2090U = null;
        this.f2082M = null;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: f */
    public final boolean mo67f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i2;
        C0404e c0404e;
        if (!view.isShown() || !this.f2080K) {
            this.f2083N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2094Y = -1;
            this.f2095Z = -1;
            VelocityTracker velocityTracker = this.f2093X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2093X = null;
            }
        }
        if (this.f2093X == null) {
            this.f2093X = VelocityTracker.obtain();
        }
        this.f2093X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f2095Z = (int) motionEvent.getY();
            if (this.f2081L != 2) {
                WeakReference weakReference = this.f2091V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m1259o(view2, x2, this.f2095Z)) {
                    this.f2094Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f2097a0 = true;
                }
            }
            this.f2083N = this.f2094Y == -1 && !coordinatorLayout.m1259o(view, x2, this.f2095Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2097a0 = false;
            this.f2094Y = -1;
            if (this.f2083N) {
                this.f2083N = false;
                return false;
            }
        }
        if (this.f2083N || (c0404e = this.f2082M) == null || !c0404e.m1130p(motionEvent)) {
            WeakReference weakReference2 = this.f2091V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f2083N || this.f2081L == 1 || coordinatorLayout.m1259o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f2082M == null || (i2 = this.f2095Z) == -1 || Math.abs(i2 - motionEvent.getY()) <= this.f2082M.f1092b) {
                return false;
            }
        }
        return true;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: g */
    public final boolean mo68g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3 = this.f2111l;
        C0112h c0112h = this.f2108i;
        int i4 = 0;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2090U == null) {
            this.f2106g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.resc);
            int i5 = Build.VERSION.SDK_INT;
            boolean z2 = (i5 < 29 || this.f2113n || this.f2105f) ? false : true;
            if (this.f2114o || this.f2115p || this.f2116q || this.f2118s || this.f2119t || this.f2120u || z2) {
                C0176j c0176j = new C0176j(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C0050p c0050p = new C0050p();
                c0050p.f176a = paddingStart;
                c0050p.f177b = paddingEnd;
                c0050p.f178c = paddingBottom;
                AbstractC0229G.m719u(view, new C0048n(c0176j, i4, c0050p));
                if (view.isAttachedToWindow()) {
                    AbstractC0227E.m698c(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0049o());
                }
            }
            C0254d c0254d = new C0254d(view);
            if (i5 >= 30) {
                view.setWindowInsetsAnimationCallback(new C0263h0(c0254d));
            } else {
                PathInterpolator pathInterpolator = C0261g0.f821e;
                Object tag = view.getTag(R.id.resc);
                View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0259f0 = new ViewOnApplyWindowInsetsListenerC0259f0(view, c0254d);
                view.setTag(R.id.resc, viewOnApplyWindowInsetsListenerC0259f0);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0259f0);
                }
            }
            this.f2090U = new WeakReference(view);
            Context context = view.getContext();
            AbstractC0016e.m195r0(context, R.attr.resc, AbstractC0323a.m981b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC0016e.m193q0(context, R.attr.resc, 300);
            AbstractC0016e.m193q0(context, R.attr.resc, 150);
            AbstractC0016e.m193q0(context, R.attr.resc, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.resc);
            resources.getDimension(R.dimen.resc);
            if (c0112h != null) {
                view.setBackground(c0112h);
                float fM707i = this.f2077H;
                if (fM707i == -1.0f) {
                    fM707i = AbstractC0229G.m707i(view);
                }
                c0112h.m479k(fM707i);
            } else {
                ColorStateList colorStateList = this.f2109j;
                if (colorStateList != null) {
                    AbstractC0240S.m787r(view, colorStateList);
                }
            }
            m1696F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f2082M == null) {
            this.f2082M = new C0404e(coordinatorLayout.getContext(), coordinatorLayout, this.f2103d0);
        }
        int top = view.getTop();
        coordinatorLayout.m1261q(view, i2);
        this.f2088S = coordinatorLayout.getWidth();
        this.f2089T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f2087R = height;
        int iMin = this.f2089T;
        int i6 = iMin - height;
        int i7 = this.f2122w;
        if (i6 < i7) {
            if (this.f2117r) {
                if (i3 != -1) {
                    iMin = Math.min(iMin, i3);
                }
                this.f2087R = iMin;
            } else {
                int iMin2 = iMin - i7;
                if (i3 != -1) {
                    iMin2 = Math.min(iMin2, i3);
                }
                this.f2087R = iMin2;
            }
        }
        this.f2073D = Math.max(0, this.f2089T - this.f2087R);
        this.f2074E = (int) ((1.0f - this.f2075F) * this.f2089T);
        m1700r();
        int i8 = this.f2081L;
        if (i8 == 3) {
            AbstractC0240S.m780k(view, m1704x());
        } else if (i8 == 6) {
            AbstractC0240S.m780k(view, this.f2074E);
        } else if (this.f2078I && i8 == 5) {
            AbstractC0240S.m780k(view, this.f2089T);
        } else if (i8 == 4) {
            AbstractC0240S.m780k(view, this.f2076G);
        } else if (i8 == 1 || i8 == 2) {
            AbstractC0240S.m780k(view, top - view.getTop());
        }
        m1697G(this.f2081L, false);
        this.f2091V = new WeakReference(m1689v(view));
        ArrayList arrayList = this.f2092W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: h */
    public final boolean mo69h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m1690w(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f2110k, marginLayoutParams.width), m1690w(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2111l, marginLayoutParams.height));
        return true;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: i */
    public final boolean mo70i(View view) {
        WeakReference weakReference = this.f2091V;
        return (weakReference == null || view != weakReference.get() || this.f2081L == 3) ? false : true;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: j */
    public final void mo71j(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 1) {
            return;
        }
        WeakReference weakReference = this.f2091V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i5 = top - i3;
        if (i3 > 0) {
            if (i5 < m1704x()) {
                int iM1704x = top - m1704x();
                iArr[1] = iM1704x;
                AbstractC0240S.m780k(view, -iM1704x);
                m1693C(3);
            } else {
                if (!this.f2080K) {
                    return;
                }
                iArr[1] = i3;
                AbstractC0240S.m780k(view, -i3);
                m1693C(1);
            }
        } else if (i3 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.f2076G;
            if (i5 > i6 && !this.f2078I) {
                int i7 = top - i6;
                iArr[1] = i7;
                AbstractC0240S.m780k(view, -i7);
                m1693C(4);
            } else {
                if (!this.f2080K) {
                    return;
                }
                iArr[1] = i3;
                AbstractC0240S.m780k(view, -i3);
                m1693C(1);
            }
        }
        m1703u(view.getTop());
        this.f2084O = i3;
        this.f2085P = true;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: m */
    public final void mo74m(View view, Parcelable parcelable) {
        C1043a c1043a = (C1043a) parcelable;
        int i2 = this.f2096a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f2104e = c1043a.f4134d;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f2098b = c1043a.f4135e;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.f2078I = c1043a.f4136f;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.f2079J = c1043a.f4137g;
            }
        }
        int i3 = c1043a.f4133c;
        if (i3 == 1 || i3 == 2) {
            this.f2081L = 4;
        } else {
            this.f2081L = i3;
        }
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: n */
    public final Parcelable mo75n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C1043a(this);
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: o */
    public final boolean mo76o(View view, int i2, int i3) {
        this.f2084O = 0;
        this.f2085P = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo77p(View view, View view2, int i2) {
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == m1704x()) {
            m1693C(3);
            return;
        }
        WeakReference weakReference = this.f2091V;
        if (weakReference != null && view2 == weakReference.get() && this.f2085P) {
            if (this.f2084O > 0) {
                if (!this.f2098b && view.getTop() > this.f2074E) {
                    i3 = 6;
                }
            } else if (this.f2078I) {
                VelocityTracker velocityTracker = this.f2093X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f2100c);
                    yVelocity = this.f2093X.getYVelocity(this.f2094Y);
                }
                if (m1694D(view, yVelocity)) {
                    i3 = 5;
                }
            } else if (this.f2084O == 0) {
                int top = view.getTop();
                if (!this.f2098b) {
                    int i4 = this.f2074E;
                    if (top < i4) {
                        if (top >= Math.abs(top - this.f2076G)) {
                        }
                    } else if (Math.abs(top - i4) < Math.abs(top - this.f2076G)) {
                    }
                    i3 = 6;
                } else if (Math.abs(top - this.f2073D) >= Math.abs(top - this.f2076G)) {
                    i3 = 4;
                }
            } else {
                if (!this.f2098b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.f2074E) < Math.abs(top2 - this.f2076G)) {
                    }
                }
                i3 = 4;
            }
            m1695E(view, i3, false);
            this.f2085P = false;
        }
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: q */
    public final boolean mo78q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f2081L;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        C0404e c0404e = this.f2082M;
        if (c0404e != null && (this.f2080K || i2 == 1)) {
            c0404e.m1124j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2094Y = -1;
            this.f2095Z = -1;
            VelocityTracker velocityTracker = this.f2093X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2093X = null;
            }
        }
        if (this.f2093X == null) {
            this.f2093X = VelocityTracker.obtain();
        }
        this.f2093X.addMovement(motionEvent);
        if (this.f2082M != null && ((this.f2080K || this.f2081L == 1) && actionMasked == 2 && !this.f2083N)) {
            float fAbs = Math.abs(this.f2095Z - motionEvent.getY());
            C0404e c0404e2 = this.f2082M;
            if (fAbs > c0404e2.f1092b) {
                c0404e2.m1116b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2083N;
    }

    /* JADX INFO: renamed from: r */
    public final void m1700r() {
        int iM1702t = m1702t();
        if (this.f2098b) {
            this.f2076G = Math.max(this.f2089T - iM1702t, this.f2073D);
        } else {
            this.f2076G = this.f2089T - iM1702t;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m1701s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        if (this.f2108i != null && (weakReference = this.f2090U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f2090U.get();
            if (m1706z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fM476h = this.f2108i.m476h();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    f = (radius <= 0.0f || fM476h <= 0.0f) ? 0.0f : radius / fM476h;
                }
                C0112h c0112h = this.f2108i;
                float fMo453a = c0112h.f346a.f328a.f388f.mo453a(c0112h.m475g());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fMo453a > 0.0f) {
                        f2 = radius2 / fMo453a;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: t */
    public final int m1702t() {
        int i2;
        return this.f2105f ? Math.min(Math.max(this.f2106g, this.f2089T - ((this.f2088S * 9) / 16)), this.f2087R) + this.f2121v : (this.f2113n || this.f2114o || (i2 = this.f2112m) <= 0) ? this.f2104e + this.f2121v : Math.max(this.f2104e, i2 + this.f2107h);
    }

    /* JADX INFO: renamed from: u */
    public final void m1703u(int i2) {
        if (((View) this.f2090U.get()) != null) {
            ArrayList arrayList = this.f2092W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i3 = this.f2076G;
            if (i2 <= i3 && i3 != m1704x()) {
                m1704x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m1704x() {
        if (this.f2098b) {
            return this.f2073D;
        }
        return Math.max(this.f2072C, this.f2117r ? 0 : this.f2122w);
    }

    /* JADX INFO: renamed from: y */
    public final int m1705y(int i2) {
        if (i2 == 3) {
            return m1704x();
        }
        if (i2 == 4) {
            return this.f2076G;
        }
        if (i2 == 5) {
            return this.f2089T;
        }
        if (i2 == 6) {
            return this.f2074E;
        }
        throw new IllegalArgumentException(AbstractC0529T.m1416e("Invalid state to get top offset: ", i2));
    }

    /* JADX INFO: renamed from: z */
    public final boolean m1706z() {
        WeakReference weakReference = this.f2090U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f2090U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        this.f2096a = 0;
        this.f2098b = true;
        this.f2110k = -1;
        this.f2111l = -1;
        this.f2070A = new C0144e(this);
        this.f2075F = 0.5f;
        this.f2077H = -1.0f;
        this.f2080K = true;
        this.f2081L = 4;
        this.f2086Q = 0.1f;
        this.f2092W = new ArrayList();
        this.f2095Z = -1;
        this.f2101c0 = new SparseIntArray();
        this.f2103d0 = new C0142c(this, 1);
        this.f2107h = context.getResources().getDimensionPixelSize(R.dimen.resc);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1013a.f4019a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f2109j = AbstractC0016e.m162K(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f2124y = C0117m.m492b(context, attributeSet, R.attr.resc, R.style.resc).m489a();
        }
        C0117m c0117m = this.f2124y;
        if (c0117m != null) {
            C0112h c0112h = new C0112h(c0117m);
            this.f2108i = c0112h;
            c0112h.m478j(context);
            ColorStateList colorStateList = this.f2109j;
            if (colorStateList != null) {
                this.f2108i.m480l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2108i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m1701s(), 1.0f);
        this.f2071B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f2071B.addUpdateListener(new C0160b(3, this));
        this.f2077H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f2110k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f2111l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i2 = typedValuePeekValue.data) == -1) {
            m1691A(i2);
        } else {
            m1691A(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f2078I != z2) {
            this.f2078I = z2;
            if (!z2 && this.f2081L == 5) {
                m1692B(4);
            }
            m1696F();
        }
        this.f2113n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f2098b != z3) {
            this.f2098b = z3;
            if (this.f2090U != null) {
                m1700r();
            }
            m1693C((this.f2098b && this.f2081L == 6) ? 3 : this.f2081L);
            m1697G(this.f2081L, true);
            m1696F();
        }
        this.f2079J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f2080K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f2096a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f2075F = f;
            if (this.f2090U != null) {
                this.f2074E = (int) ((1.0f - f) * this.f2089T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.f2072C = i3;
                    m1697G(this.f2081L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f2072C = dimensionPixelOffset;
                    m1697G(this.f2081L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f2102d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f2114o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f2115p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f2116q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f2117r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f2118s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f2119t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f2120u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f2123x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f2100c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: k */
    public final void mo72k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
    }
}
