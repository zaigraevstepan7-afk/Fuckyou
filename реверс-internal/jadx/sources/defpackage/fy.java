package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import com.reddit.secondpage.R;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fy extends Dialog implements xo0, o11, xy0, vh1 {
    public zo0 e;
    public final n81 f;
    public final jv1 g;
    public final jv1 h;
    public ha0 i;
    public dy j;
    public final View k;
    public final cy l;
    public boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy(ha0 ha0Var, dy dyVar, View view, al0 al0Var, hx hxVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), dyVar.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        final int i = 0;
        this.f = new n81(new uh1(this, new p7(17, this)), 3);
        this.g = new jv1(new ha0(this) { // from class: eo
            public final /* synthetic */ fy f;

            {
                this.f = this;
            }

            @Override // defpackage.ha0
            public final Object a() {
                int i2 = i;
                fy fyVar = this.f;
                switch (i2) {
                    case 0:
                        iy iyVar = new iy();
                        fyVar.getNavigationEventDispatcher().b(iyVar);
                        return iyVar;
                    default:
                        return new n11(new p(5, fyVar));
                }
            }
        });
        final int i2 = 1;
        this.h = new jv1(new ha0(this) { // from class: eo
            public final /* synthetic */ fy f;

            {
                this.f = this;
            }

            @Override // defpackage.ha0
            public final Object a() {
                int i22 = i2;
                fy fyVar = this.f;
                switch (i22) {
                    case 0:
                        iy iyVar = new iy();
                        fyVar.getNavigationEventDispatcher().b(iyVar);
                        return iyVar;
                    default:
                        return new n11(new p(5, fyVar));
                }
            }
        });
        this.i = ha0Var;
        this.j = dyVar;
        this.k = view;
        Window window = getWindow();
        if (window == null) {
            yc.l("Dialog has no window");
            throw null;
        }
        dy dyVar2 = this.j;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = dyVar2.g;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        pd1.p(window, this.j.e);
        window.setGravity(17);
        if (!this.j.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                lb.a.a(attributes2);
            }
            if (i3 >= 30) {
                mb mbVar = mb.a;
                mbVar.b(attributes2, 0);
                mbVar.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        cy cyVar = new cy(getContext(), window);
        setTitle(this.j.f);
        cyVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        cyVar.setClipChildren(false);
        cyVar.setElevation(hxVar.y(8.0f));
        cyVar.setOutlineProvider(new ey(0));
        this.l = cyVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(cyVar);
        cyVar.setTag(R.id.view_tree_lifecycle_owner, ef1.i(view));
        cyVar.setTag(R.id.view_tree_view_model_store_owner, uc1.k(view));
        cyVar.setTag(R.id.view_tree_saved_state_registry_owner, qc1.n(view));
        h(this.i, this.j, al0Var);
        n11 n11VarB = b();
        j5 j5Var = new j5(this, 1);
        n11VarB.getClass();
        pe peVar = new pe(j5Var);
        final zo0 zo0VarE = e();
        if (zo0VarE.c == qo0.e) {
            return;
        }
        i11 i11Var = new i11(peVar, new j11(peVar, this));
        peVar.a.add(i11Var);
        i11Var.h(false);
        wy0.a(n11VarB.a(), i11Var);
        final kw kwVar = new kw(i11Var, n11VarB, zo0VarE);
        zo0VarE.a(kwVar);
        peVar.c.add(new AutoCloseable() { // from class: k11
            @Override // java.lang.AutoCloseable
            public final void close() {
                zo0VarE.f(kwVar);
            }
        });
    }

    public static void a(fy fyVar) {
        super.onBackPressed();
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof cy) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.o11
    public final n11 b() {
        return (n11) this.h.getValue();
    }

    @Override // defpackage.vh1
    public final n81 c() {
        return (n81) this.f.c;
    }

    public final zo0 e() {
        zo0 zo0Var = this.e;
        if (zo0Var != null) {
            return zo0Var;
        }
        zo0 zo0Var2 = new zo0(this, true);
        this.e = zo0Var2;
        return zo0Var2;
    }

    public final void f() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.xo0
    public final zo0 g() {
        return e();
    }

    @Override // defpackage.xy0
    public final wy0 getNavigationEventDispatcher() {
        return b().a();
    }

    public final void h(ha0 ha0Var, dy dyVar, al0 al0Var) {
        int i;
        this.i = ha0Var;
        this.j = dyVar;
        dk1 dk1Var = dyVar.c;
        boolean zB = l7.b(this.k);
        int iOrdinal = dk1Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    ez1.a();
                    return;
                }
                zB = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = al0Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                ez1.a();
                return;
            }
            i = 1;
        }
        cy cyVar = this.l;
        cyVar.setLayoutDirection(i);
        boolean z = dyVar.e;
        boolean z2 = dyVar.d;
        Window window2 = cyVar.n;
        boolean z3 = (cyVar.r && z2 == cyVar.p && z == cyVar.q) ? false : true;
        cyVar.p = z2;
        cyVar.q = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !cyVar.r) {
                window2.setLayout(i2, -2);
                cyVar.r = true;
            }
        }
        setCanceledOnTouchOutside(dyVar.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((iy) this.g.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            n11 n11VarB = b();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            n11VarB.b(onBackInvokedDispatcher);
        }
        this.f.k(bundle);
        e().d(po0.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.j.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.i.a();
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.f.l(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        e().d(po0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        e().d(po0.ON_DESTROY);
        this.e = null;
        super.onStop();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        int I;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (this.j.b) {
            cy cyVar = this.l;
            cyVar.getClass();
            if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = cyVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + cyVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + cyVar.getTop();
                int height = childAt.getHeight() + top;
                int I2 = nu0.I(motionEvent.getX());
                if (left <= I2 && I2 <= width && top <= (I = nu0.I(motionEvent.getY())) && I <= height) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                        this.m = false;
                        return zOnTouchEvent;
                    }
                }
            }
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.m = true;
                return true;
            }
            if (actionMasked2 != 1) {
                if (actionMasked2 == 3) {
                    this.m = false;
                    return zOnTouchEvent;
                }
            } else if (this.m) {
                this.i.a();
                this.m = false;
                return true;
            }
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        f();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        f();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
