package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractC0529T;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.reddit.frontpage.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p000A.C0005f;
import p001A0.AbstractC0016e;
import p007E.RunnableC0069o;
import p015I0.C0105a;
import p015I0.C0112h;
import p015I0.C0116l;
import p015I0.C0117m;
import p017J0.C0140a;
import p017J0.C0142c;
import p017J0.C0143d;
import p017J0.C0144e;
import p024N.AbstractC0229G;
import p024N.AbstractC0240S;
import p026O.C0306f;
import p026O.InterfaceC0321u;
import p028P.AbstractC0323a;
import p042W.C0404e;
import p079n0.AbstractC1013a;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0002c {

    /* JADX INFO: renamed from: a */
    public AbstractC0016e f2307a;

    /* JADX INFO: renamed from: b */
    public final C0112h f2308b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f2309c;

    /* JADX INFO: renamed from: d */
    public final C0117m f2310d;

    /* JADX INFO: renamed from: e */
    public final C0144e f2311e;

    /* JADX INFO: renamed from: f */
    public final float f2312f;

    /* JADX INFO: renamed from: g */
    public final boolean f2313g;

    /* JADX INFO: renamed from: h */
    public int f2314h;

    /* JADX INFO: renamed from: i */
    public C0404e f2315i;

    /* JADX INFO: renamed from: j */
    public boolean f2316j;

    /* JADX INFO: renamed from: k */
    public final float f2317k;

    /* JADX INFO: renamed from: l */
    public int f2318l;

    /* JADX INFO: renamed from: m */
    public int f2319m;

    /* JADX INFO: renamed from: n */
    public int f2320n;

    /* JADX INFO: renamed from: o */
    public int f2321o;

    /* JADX INFO: renamed from: p */
    public WeakReference f2322p;

    /* JADX INFO: renamed from: q */
    public WeakReference f2323q;

    /* JADX INFO: renamed from: r */
    public final int f2324r;

    /* JADX INFO: renamed from: s */
    public VelocityTracker f2325s;

    /* JADX INFO: renamed from: t */
    public int f2326t;

    /* JADX INFO: renamed from: u */
    public final LinkedHashSet f2327u;

    /* JADX INFO: renamed from: v */
    public final C0142c f2328v;

    public SideSheetBehavior() {
        this.f2311e = new C0144e(this);
        this.f2313g = true;
        this.f2314h = 5;
        this.f2317k = 0.1f;
        this.f2324r = -1;
        this.f2327u = new LinkedHashSet();
        this.f2328v = new C0142c(this, 0);
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: c */
    public final void mo64c(C0005f c0005f) {
        this.f2322p = null;
        this.f2315i = null;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: e */
    public final void mo66e() {
        this.f2322p = null;
        this.f2315i = null;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: f */
    public final boolean mo67f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0404e c0404e;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC0240S.m773d(view) == null) || !this.f2313g) {
            this.f2316j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f2325s) != null) {
            velocityTracker.recycle();
            this.f2325s = null;
        }
        if (this.f2325s == null) {
            this.f2325s = VelocityTracker.obtain();
        }
        this.f2325s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f2326t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f2316j) {
            this.f2316j = false;
            return false;
        }
        return (this.f2316j || (c0404e = this.f2315i) == null || !c0404e.m1130p(motionEvent)) ? false : true;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: g */
    public final boolean mo68g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        View view2;
        View view3;
        int i3;
        View viewFindViewById;
        int iMo212W = 0;
        int i4 = 1;
        C0112h c0112h = this.f2308b;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2322p == null) {
            this.f2322p = new WeakReference(view);
            Context context = view.getContext();
            AbstractC0016e.m195r0(context, R.attr.resc, AbstractC0323a.m981b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC0016e.m193q0(context, R.attr.resc, 300);
            AbstractC0016e.m193q0(context, R.attr.resc, 150);
            AbstractC0016e.m193q0(context, R.attr.resc, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.resc);
            resources.getDimension(R.dimen.resc);
            resources.getDimension(R.dimen.resc);
            if (c0112h != null) {
                view.setBackground(c0112h);
                float fM707i = this.f2312f;
                if (fM707i == -1.0f) {
                    fM707i = AbstractC0229G.m707i(view);
                }
                c0112h.m479k(fM707i);
            } else {
                ColorStateList colorStateList = this.f2309c;
                if (colorStateList != null) {
                    AbstractC0240S.m787r(view, colorStateList);
                }
            }
            int i5 = this.f2314h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            m1760u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC0240S.m773d(view) == null) {
                AbstractC0240S.m786q(view, view.getResources().getString(R.string.resc));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C0005f) view.getLayoutParams()).f5c, i2) == 3 ? 1 : 0;
        AbstractC0016e abstractC0016e = this.f2307a;
        if (abstractC0016e == null || abstractC0016e.mo214Y() != i6) {
            C0117m c0117m = this.f2310d;
            C0005f c0005f = null;
            if (i6 == 0) {
                this.f2307a = new C0140a(this, i4);
                if (c0117m != null) {
                    WeakReference weakReference = this.f2322p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C0005f)) {
                        c0005f = (C0005f) view3.getLayoutParams();
                    }
                    if (c0005f == null || ((ViewGroup.MarginLayoutParams) c0005f).rightMargin <= 0) {
                        C0116l c0116lM495e = c0117m.m495e();
                        c0116lM495e.f376f = new C0105a(0.0f);
                        c0116lM495e.f377g = new C0105a(0.0f);
                        C0117m c0117mM489a = c0116lM495e.m489a();
                        if (c0112h != null) {
                            c0112h.setShapeAppearanceModel(c0117mM489a);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i6 + ". Must be 0 or 1.");
                }
                this.f2307a = new C0140a(this, iMo212W);
                if (c0117m != null) {
                    WeakReference weakReference2 = this.f2322p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C0005f)) {
                        c0005f = (C0005f) view2.getLayoutParams();
                    }
                    if (c0005f == null || ((ViewGroup.MarginLayoutParams) c0005f).leftMargin <= 0) {
                        C0116l c0116lM495e2 = c0117m.m495e();
                        c0116lM495e2.f375e = new C0105a(0.0f);
                        c0116lM495e2.f378h = new C0105a(0.0f);
                        C0117m c0117mM489a2 = c0116lM495e2.m489a();
                        if (c0112h != null) {
                            c0112h.setShapeAppearanceModel(c0117mM489a2);
                        }
                    }
                }
            }
        }
        if (this.f2315i == null) {
            this.f2315i = new C0404e(coordinatorLayout.getContext(), coordinatorLayout, this.f2328v);
        }
        int iMo212W2 = this.f2307a.mo212W(view);
        coordinatorLayout.m1261q(view, i2);
        this.f2319m = coordinatorLayout.getWidth();
        this.f2320n = this.f2307a.mo213X(coordinatorLayout);
        this.f2318l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f2321o = marginLayoutParams != null ? this.f2307a.mo218e(marginLayoutParams) : 0;
        int i7 = this.f2314h;
        if (i7 == 1 || i7 == 2) {
            iMo212W = iMo212W2 - this.f2307a.mo212W(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f2314h);
            }
            iMo212W = this.f2307a.mo209Q();
        }
        AbstractC0240S.m779j(view, iMo212W);
        if (this.f2323q == null && (i3 = this.f2324r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.f2323q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f2327u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: h */
    public final boolean mo69h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: m */
    public final void mo74m(View view, Parcelable parcelable) {
        int i2 = ((C0143d) parcelable).f452c;
        if (i2 == 1 || i2 == 2) {
            i2 = 5;
        }
        this.f2314h = i2;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: n */
    public final Parcelable mo75n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C0143d(this);
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: q */
    public final boolean mo78q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2314h == 1 && actionMasked == 0) {
            return true;
        }
        if (m1758s()) {
            this.f2315i.m1124j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f2325s) != null) {
            velocityTracker.recycle();
            this.f2325s = null;
        }
        if (this.f2325s == null) {
            this.f2325s = VelocityTracker.obtain();
        }
        this.f2325s.addMovement(motionEvent);
        if (m1758s() && actionMasked == 2 && !this.f2316j && m1758s()) {
            float fAbs = Math.abs(this.f2326t - motionEvent.getX());
            C0404e c0404e = this.f2315i;
            if (fAbs > c0404e.f1092b) {
                c0404e.m1116b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2316j;
    }

    /* JADX INFO: renamed from: r */
    public final void m1757r(int i2) {
        View view;
        if (this.f2314h == i2) {
            return;
        }
        this.f2314h = i2;
        WeakReference weakReference = this.f2322p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = this.f2314h == 5 ? 4 : 0;
        if (view.getVisibility() != i3) {
            view.setVisibility(i3);
        }
        Iterator it = this.f2327u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        m1760u();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m1758s() {
        if (this.f2315i != null) {
            return this.f2313g || this.f2314h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.m1129o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        m1757r(2);
        r2.f2311e.m554a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1759t(View view, int i2, boolean z2) {
        int iMo208P;
        if (i2 == 3) {
            iMo208P = this.f2307a.mo208P();
        } else {
            if (i2 != 5) {
                throw new IllegalArgumentException(AbstractC0529T.m1416e("Invalid state to get outer edge offset: ", i2));
            }
            iMo208P = this.f2307a.mo209Q();
        }
        C0404e c0404e = this.f2315i;
        if (c0404e != null) {
            if (!z2) {
                int top = view.getTop();
                c0404e.f1108r = view;
                c0404e.f1093c = -1;
                boolean zM1122h = c0404e.m1122h(iMo208P, top, 0, 0);
                if (!zM1122h && c0404e.f1091a == 0 && c0404e.f1108r != null) {
                    c0404e.f1108r = null;
                }
            }
        }
        m1757r(i2);
    }

    /* JADX INFO: renamed from: u */
    public final void m1760u() {
        View view;
        WeakReference weakReference = this.f2322p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0240S.m782m(view, 262144);
        AbstractC0240S.m778i(view, 0);
        AbstractC0240S.m782m(view, 1048576);
        AbstractC0240S.m778i(view, 0);
        final int i2 = 5;
        if (this.f2314h != 5) {
            AbstractC0240S.m783n(view, C0306f.f899j, new InterfaceC0321u() { // from class: J0.b
                @Override // p026O.InterfaceC0321u
                /* JADX INFO: renamed from: m */
                public final boolean mo48m(View view2) {
                    int i3 = 1;
                    SideSheetBehavior sideSheetBehavior = this.f448a;
                    sideSheetBehavior.getClass();
                    int i4 = i2;
                    if (i4 == 1 || i4 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i4 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f2322p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m1757r(i4);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f2322p.get();
                    RunnableC0069o runnableC0069o = new RunnableC0069o(sideSheetBehavior, i4, i3);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap weakHashMap = AbstractC0240S.f777a;
                        if (view3.isAttachedToWindow()) {
                            view3.post(runnableC0069o);
                            return true;
                        }
                    }
                    runnableC0069o.run();
                    return true;
                }
            });
        }
        final int i3 = 3;
        if (this.f2314h != 3) {
            AbstractC0240S.m783n(view, C0306f.f897h, new InterfaceC0321u() { // from class: J0.b
                @Override // p026O.InterfaceC0321u
                /* JADX INFO: renamed from: m */
                public final boolean mo48m(View view2) {
                    int i32 = 1;
                    SideSheetBehavior sideSheetBehavior = this.f448a;
                    sideSheetBehavior.getClass();
                    int i4 = i3;
                    if (i4 == 1 || i4 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i4 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f2322p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m1757r(i4);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f2322p.get();
                    RunnableC0069o runnableC0069o = new RunnableC0069o(sideSheetBehavior, i4, i32);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap weakHashMap = AbstractC0240S.f777a;
                        if (view3.isAttachedToWindow()) {
                            view3.post(runnableC0069o);
                            return true;
                        }
                    }
                    runnableC0069o.run();
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f2311e = new C0144e(this);
        this.f2313g = true;
        this.f2314h = 5;
        this.f2317k = 0.1f;
        this.f2324r = -1;
        this.f2327u = new LinkedHashSet();
        this.f2328v = new C0142c(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1013a.f4011A);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f2309c = AbstractC0016e.m162K(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f2310d = C0117m.m492b(context, attributeSet, 0, R.style.resc).m489a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f2324r = resourceId;
            WeakReference weakReference = this.f2323q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2323q = null;
            WeakReference weakReference2 = this.f2322p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = AbstractC0240S.f777a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C0117m c0117m = this.f2310d;
        if (c0117m != null) {
            C0112h c0112h = new C0112h(c0117m);
            this.f2308b = c0112h;
            c0112h.m478j(context);
            ColorStateList colorStateList = this.f2309c;
            if (colorStateList != null) {
                this.f2308b.m480l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2308b.setTint(typedValue.data);
            }
        }
        this.f2312f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f2313g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
