package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.reddit.secondpage.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends ViewGroup {
    public WeakReference e;
    public IBinder f;
    public v92 g;
    public op h;
    public ip i;
    public ts0 j;
    public boolean k;
    public boolean l;
    public boolean m;

    public r(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        int i = 1;
        setImportantForAccessibility(1);
        d6 d6Var = new d6(i, this);
        addOnAttachStateChangeListener(d6Var);
        ez1 ez1Var = new ez1(3);
        bl.B(this).a.add(ez1Var);
        this.j = new ts0(this, d6Var, ez1Var, i);
    }

    private final void setParentContext(op opVar) {
        if (this.h != opVar) {
            this.h = opVar;
            if (opVar != null) {
                this.e = null;
            }
            v92 v92Var = this.g;
            if (v92Var != null) {
                v92Var.d();
                this.g = null;
                if (isAttachedToWindow()) {
                    g();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f != iBinder) {
            this.f = iBinder;
            this.e = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        d();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        d();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public abstract void b(ob0 ob0Var, int i);

    public final void c() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.i == null) {
                h4 h4Var = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof h4) {
                        h4Var = (h4) childAt;
                    }
                }
                if (h4Var != null) {
                    h4Var.setComposeViewContext(l(el.y(this), h4Var.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                g();
            }
        }
    }

    public final void d() {
        if (!this.l) {
            throw new UnsupportedOperationException(s91.l("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
        }
    }

    public final void e() {
        ip ipVar;
        View view;
        if (this.h == null && !isAttachedToWindow() && ((ipVar = this.i) == null || (view = ipVar.a) == null || !view.isAttachedToWindow())) {
            yc.l("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            g();
        }
    }

    public final void f() {
        View childAt = getChildAt(0);
        h4 h4Var = childAt instanceof h4 ? (h4) childAt : null;
        if (h4Var != null && h4Var.E0) {
            h4Var.e.b();
            h4Var.E0 = false;
        }
        v92 v92Var = this.g;
        if (v92Var != null) {
            v92Var.d();
        }
        this.g = null;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        if (this.g == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.l = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    ip ipVarJ = this.i;
                    if (ipVarJ == null) {
                        ipVarJ = j();
                    }
                    this.g = y92.a(this, ipVarJ, new jo(1003123809, true, new q(objArr == true ? 1 : 0, this)));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.l = false;
            }
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m1941getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        ae aeVar = tag instanceof ae ? (ae) tag : null;
        if (aeVar != null) {
            return aeVar.a;
        }
        return 1;
    }

    public final ip getComposeViewContext$ui() {
        return this.i;
    }

    public final boolean getHasComposition() {
        return this.g != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.k;
    }

    public void h(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void i(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.m || super.isTransitionGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ip j() {
        ip composeViewContext;
        t62 t62Var;
        t62 t62Var2 = null;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            h4 h4Var = childAt instanceof h4 ? (h4) childAt : null;
            if (h4Var != null) {
                composeViewContext = h4Var.getComposeViewContext();
            }
        }
        View viewY = el.y(this);
        ip ipVarA = el.A(viewY);
        if (ipVarA != null) {
            return l(viewY, ipVarA);
        }
        op opVarK = k();
        xo0 xo0VarI = ef1.i(viewY);
        if (xo0VarI == null) {
            xo0VarI = composeViewContext != null ? composeViewContext.c() : null;
            if (xo0VarI == null) {
                yc.l("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        xo0 xo0Var = xo0VarI;
        vh1 vh1VarN = qc1.n(viewY);
        if (vh1VarN == null) {
            if (composeViewContext != null) {
                composeViewContext.f();
                vh1VarN = composeViewContext.e;
                vh1VarN.getClass();
            } else {
                vh1VarN = null;
            }
            if (vh1VarN == null) {
                yc.l("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        vh1 vh1Var = vh1VarN;
        t62 t62VarK = uc1.k(viewY);
        if (t62VarK == null) {
            if (composeViewContext != null) {
                composeViewContext.f();
                t62Var2 = composeViewContext.f;
            }
            t62Var = t62Var2;
        } else {
            t62Var = t62VarK;
        }
        ip ipVar = new ip(el.A(el.y(viewY)), viewY, opVarK, xo0Var, vh1Var, t62Var);
        viewY.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(ipVar));
        return ipVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Type inference failed for: r0v0, types: [op] */
    /* JADX WARN: Type inference failed for: r0v1, types: [op] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [op] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [jc1] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final op k() {
        op opVar;
        ?? A = this.h;
        if (A == 0) {
            A = l92.a(this);
            if (A == 0) {
                Object parent = getParent();
                A = A;
                while (A == 0 && (parent instanceof View)) {
                    View view = (View) parent;
                    op opVarA = l92.a(view);
                    parent = af1.s(view);
                    A = opVarA;
                }
            }
            gc1 gc1Var = gc1.f;
            if (A != 0) {
                ?? r3 = (!(A instanceof jc1) || ((gc1) ((jc1) A).u.getValue()).compareTo(gc1Var) > 0) ? A : 0;
                if (r3 != 0) {
                    this.e = new WeakReference(r3);
                }
            } else {
                A = 0;
            }
            if (A == 0) {
                WeakReference weakReference = this.e;
                if (weakReference == null || (opVar = (op) weakReference.get()) == null) {
                    A = 0;
                    if (A == 0) {
                        A = l92.b(this);
                        ?? r2 = ((gc1) A.u.getValue()).compareTo(gc1Var) > 0 ? A : 0;
                        if (r2 != 0) {
                            this.e = new WeakReference(r2);
                        }
                    }
                } else {
                    boolean z = opVar instanceof jc1;
                    A = opVar;
                    if (z) {
                        int iCompareTo = ((gc1) ((jc1) opVar).u.getValue()).compareTo(gc1Var);
                        A = opVar;
                        if (iCompareTo <= 0) {
                        }
                    }
                    if (A == 0) {
                    }
                }
            }
        }
        return A;
    }

    public final ip l(View view, ip ipVar) {
        op opVarK = k();
        xo0 xo0VarI = ef1.i(view);
        t62 t62VarK = uc1.k(view);
        vh1 vh1VarN = qc1.n(view);
        ipVar.f();
        op opVar = ipVar.c;
        opVar.getClass();
        if (opVarK == opVar && xo0VarI == ipVar.c()) {
            ipVar.f();
            if (t62VarK == ipVar.f) {
                ipVar.f();
                vh1 vh1Var = ipVar.e;
                vh1Var.getClass();
                if (vh1VarN == vh1Var) {
                    return ipVar;
                }
            }
        }
        lt ltVarJ = opVarK.j();
        ipVar.f();
        op opVar2 = ipVar.c;
        opVar2.getClass();
        if (ltVarJ != opVar2.j()) {
            f();
        }
        if (xo0VarI == null) {
            xo0VarI = ipVar.c();
        }
        xo0 xo0Var = xo0VarI;
        if (vh1VarN == null) {
            ipVar.f();
            vh1VarN = ipVar.e;
            vh1VarN.getClass();
        }
        ip ipVar2 = new ip(ipVar, view, opVarK, xo0Var, vh1VarN, t62VarK);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(ipVar2));
        return ipVar2;
    }

    public final void m(ip ipVar) {
        v92 v92Var = this.g;
        boolean z = (v92Var == null || v92Var.f.v()) ? false : true;
        f();
        View childAt = getChildAt(0);
        h4 h4Var = childAt instanceof h4 ? (h4) childAt : null;
        if (ipVar != null) {
            if (h4Var != null) {
                h4Var.setComposeViewContext(ipVar);
            }
            if (z) {
                g();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zx0 zx0Var = l92.a;
        Object objS = af1.s(this);
        View view = this;
        while (objS instanceof View) {
            View view2 = (View) objS;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objS = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new p(0, this));
        } else {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        h(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        g();
        i(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1942setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new ae(i));
    }

    public final void setComposeViewContext$ui(ip ipVar) {
        if (this.i == ipVar) {
            return;
        }
        this.i = ipVar;
        m(ipVar);
    }

    public final void setParentCompositionContext(op opVar) {
        setParentContext(opVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.k = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((h4) ((w31) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.m = true;
    }

    public final void setViewCompositionStrategy(i62 i62Var) {
        ts0 ts0Var = this.j;
        if (ts0Var != null) {
            ts0Var.a();
        }
        ((xc) i62Var).getClass();
        int i = 1;
        d6 d6Var = new d6(i, this);
        addOnAttachStateChangeListener(d6Var);
        ez1 ez1Var = new ez1(3);
        bl.B(this).a.add(ez1Var);
        this.j = new ts0(this, d6Var, ez1Var, i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        d();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        d();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        d();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
