package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.reddit.secondpage.R;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v81 extends r implements xy0 {
    public final qx A;
    public final Rect B;
    public final qq1 C;
    public final iy D;
    public h11 E;
    public final wy0 F;
    public final v41 G;
    public boolean H;
    public final int[] I;
    public ha0 n;
    public z81 o;
    public String p;
    public final View q;
    public final boolean r;
    public final t61 s;
    public final WindowManager t;
    public final WindowManager.LayoutParams u;
    public y81 v;
    public al0 w;
    public final v41 x;
    public final v41 y;
    public sh0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v81(ha0 ha0Var, z81 z81Var, String str, View view, hx hxVar, y81 y81Var, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        int i2 = 4;
        t61 x81Var = i >= 30 ? new x81(i2) : i >= 29 ? new w81(i2) : new t61(i2);
        this.n = ha0Var;
        this.o = z81Var;
        this.p = str;
        this.q = view;
        this.r = z;
        this.s = x81Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.t = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        z81 z81Var2 = this.o;
        boolean zB = l7.b(view);
        boolean z2 = z81Var2.b;
        int i3 = z81Var2.a;
        if (z2 && zB) {
            i3 |= 8192;
        } else if (z2 && !zB) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = this.o.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.u = layoutParams;
        this.v = y81Var;
        this.w = al0.e;
        this.x = xc.B(null);
        this.y = xc.B(null);
        this.A = xc.s(new a7(12, this));
        this.B = new Rect();
        this.C = new qq1(new h7(this, 3));
        iy iyVar = new iy();
        this.D = iyVar;
        oe oeVar = new oe(this);
        wy0 wy0Var = new wy0(null);
        wy0.a(wy0Var, oeVar);
        wy0Var.b(iyVar);
        this.F = wy0Var;
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, ef1.i(view));
        setTag(R.id.view_tree_view_model_store_owner, uc1.k(view));
        setTag(R.id.view_tree_saved_state_registry_owner, qc1.n(view));
        setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
        wy0 navigationEventDispatcher = getNavigationEventDispatcher();
        z81 z81Var3 = this.o;
        boolean z3 = (z81Var3.a & 8) == 0 && z81Var3.c;
        navigationEventDispatcher.d();
        if (navigationEventDispatcher.c != z3) {
            navigationEventDispatcher.c = z3;
            navigationEventDispatcher.d.b();
        }
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(hxVar.y(8.0f));
        setOutlineProvider(new ey(1));
        this.G = xc.B(lo.a);
        this.I = new int[2];
    }

    private final wa0 getContent() {
        return (wa0) this.G.getValue();
    }

    private final sh0 getDisplayBounds() {
        int i = this.o.a & 512;
        View view = this.q;
        Rect rect = this.B;
        t61 t61Var = this.s;
        if (i == 0) {
            t61Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            t61Var.g(view, rect);
        }
        return new sh0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zk0 getParentLayoutCoordinates() {
        return (zk0) this.y.getValue();
    }

    private final void setContent(wa0 wa0Var) {
        this.G.setValue(wa0Var);
    }

    private final void setParentLayoutCoordinates(zk0 zk0Var) {
        this.y.setValue(zk0Var);
    }

    @Override // defpackage.r
    public final void b(ob0 ob0Var, int i) {
        ob0Var.X(-857613600);
        int i2 = (ob0Var.h(this) ? 4 : 2) | i;
        if (ob0Var.N(i2 & 1, (i2 & 3) != 2)) {
            getContent().h(ob0Var, 0);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new q(this, i, 8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.o.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                this.D.a();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.A.getValue()).booleanValue();
    }

    @Override // defpackage.xy0
    public wy0 getNavigationEventDispatcher() {
        return this.F;
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.u;
    }

    public final al0 getParentLayoutDirection() {
        return this.w;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final vh0 m1959getPopupContentSizebOM6tXw() {
        return (vh0) this.x.getValue();
    }

    public final y81 getPositionProvider() {
        return this.v;
    }

    @Override // defpackage.r
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.H;
    }

    public final String getTestTag() {
        return this.p;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.r
    public final void h(boolean z, int i, int i2, int i3, int i4) {
        super.h(z, i, i2, i3, i4);
        this.o.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.u;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.s.getClass();
        this.t.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.r
    public final void i(int i, int i2) {
        this.o.getClass();
        sh0 displayBounds = getDisplayBounds();
        super.i(View.MeasureSpec.makeMeasureSpec(displayBounds.c - displayBounds.a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.d - displayBounds.b, Integer.MIN_VALUE));
    }

    public final void o(op opVar, wa0 wa0Var) {
        setParentCompositionContext(opVar);
        setContent(wa0Var);
        this.H = true;
    }

    @Override // defpackage.r, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C.d();
        if (!this.o.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        i1.e(this, getNavigationEventDispatcher(), new h7(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qq1 qq1Var = this.C;
        i2 i2Var = qq1Var.h;
        if (i2Var != null) {
            i2Var.a();
        }
        qq1Var.a();
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        h11 h11Var = this.E;
        if (h11Var != null) {
            wy0 navigationEventDispatcher = getNavigationEventDispatcher();
            navigationEventDispatcher.getClass();
            navigationEventDispatcher.d();
            if (navigationEventDispatcher.g.h(h11Var)) {
                cz0 cz0Var = navigationEventDispatcher.d;
                cz0Var.getClass();
                cz0Var.k.h(h11Var);
                cz0Var.j.h(h11Var);
                cz0Var.i.h(h11Var);
                h11Var.a = null;
                h11Var.c();
            }
        }
        this.E = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.o.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            ha0 ha0Var = this.n;
            if (ha0Var != null) {
                ha0Var.a();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            ha0 ha0Var2 = this.n;
            if (ha0Var2 != null) {
                ha0Var2.a();
            }
        }
        return true;
    }

    public final void p(ha0 ha0Var, z81 z81Var, String str, al0 al0Var) {
        this.n = ha0Var;
        this.p = str;
        int i = 0;
        if (!xi0.o(this.o, z81Var)) {
            z81Var.getClass();
            this.o = z81Var;
            wy0 navigationEventDispatcher = getNavigationEventDispatcher();
            z81 z81Var2 = this.o;
            boolean z = (z81Var2.a & 8) == 0 && z81Var2.c;
            navigationEventDispatcher.d();
            if (navigationEventDispatcher.c != z) {
                navigationEventDispatcher.c = z;
                navigationEventDispatcher.d.b();
            }
            boolean zB = l7.b(this.q);
            boolean z2 = z81Var.b;
            int i2 = z81Var.a;
            if (z2 && zB) {
                i2 |= 8192;
            } else if (z2 && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.u;
            layoutParams.flags = i2;
            this.s.getClass();
            this.t.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = al0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                ez1.a();
                return;
            }
            i = 1;
        }
        super.setLayoutDirection(i);
    }

    public final void q() {
        zk0 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.B()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jK = parentLayoutCoordinates.K();
            long jC = this.r ? parentLayoutCoordinates.c(0L) : parentLayoutCoordinates.h(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jC >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jC & 4294967295L)))) & 4294967295L);
            int i = (int) (jRound >> 32);
            int i2 = (int) (jRound & 4294967295L);
            sh0 sh0Var = new sh0(i, i2, ((int) (jK >> 32)) + i, ((int) (jK & 4294967295L)) + i2);
            if (sh0Var.equals(this.z)) {
                return;
            }
            this.z = sh0Var;
            s();
        }
    }

    public final void r(zk0 zk0Var) {
        setParentLayoutCoordinates(zk0Var);
        q();
    }

    public final void s() {
        vh0 vh0VarM1959getPopupContentSizebOM6tXw;
        sh0 sh0Var = this.z;
        if (sh0Var == null || (vh0VarM1959getPopupContentSizebOM6tXw = m1959getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = vh0VarM1959getPopupContentSizebOM6tXw.a;
        sh0 displayBounds = getDisplayBounds();
        long j2 = (((long) (displayBounds.d - displayBounds.b)) & 4294967295L) | (((long) (displayBounds.c - displayBounds.a)) << 32);
        yc1 yc1Var = new yc1();
        yc1Var.e = 0L;
        this.C.c(this, zz0.r, new u81(yc1Var, this, sh0Var, j2, j));
        long j3 = yc1Var.e;
        WindowManager.LayoutParams layoutParams = this.u;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        boolean z = this.o.e;
        t61 t61Var = this.s;
        if (z) {
            t61Var.j(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        t61Var.getClass();
        this.t.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(al0 al0Var) {
        this.w = al0Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1960setPopupContentSizefhxjrPA(vh0 vh0Var) {
        this.x.setValue(vh0Var);
    }

    public final void setPositionProvider(y81 y81Var) {
        this.v = y81Var;
    }

    public final void setTestTag(String str) {
        this.p = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public r getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
