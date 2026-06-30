package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gh0 extends kl implements Runnable, c11, View.OnAttachStateChangeListener {
    public final t82 g;
    public boolean h;
    public boolean i;
    public p82 j;

    public gh0(t82 t82Var) {
        super(!t82Var.s ? 1 : 0);
        this.g = t82Var;
    }

    @Override // defpackage.c11
    public final p82 a(View view, p82 p82Var) {
        this.j = p82Var;
        t82 t82Var = this.g;
        t42 t42Var = t82Var.q;
        m82 m82Var = p82Var.a;
        t42Var.f(ef1.r(m82Var.h(8)));
        if (this.h) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.i) {
            t82Var.r.f(ef1.r(m82Var.h(8)));
            t82.a(t82Var, p82Var);
        }
        return t82Var.s ? p82.b : p82Var;
    }

    @Override // defpackage.kl
    public final void e(t72 t72Var) {
        this.h = false;
        this.i = false;
        p82 p82Var = this.j;
        if (t72Var.a.a() > 0 && p82Var != null) {
            m82 m82Var = p82Var.a;
            t82 t82Var = this.g;
            t82Var.r.f(ef1.r(m82Var.h(8)));
            t82Var.q.f(ef1.r(m82Var.h(8)));
            t82.a(t82Var, p82Var);
        }
        this.j = null;
    }

    @Override // defpackage.kl
    public final void f(t72 t72Var) {
        this.h = true;
        this.i = true;
    }

    @Override // defpackage.kl
    public final p82 g(p82 p82Var, List list) {
        t82 t82Var = this.g;
        t82.a(t82Var, p82Var);
        return t82Var.s ? p82.b : p82Var;
    }

    @Override // defpackage.kl
    public final n81 h(t72 t72Var, n81 n81Var) {
        this.h = false;
        return n81Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.h) {
            this.h = false;
            this.i = false;
            p82 p82Var = this.j;
            if (p82Var != null) {
                t82 t82Var = this.g;
                t82Var.r.f(ef1.r(p82Var.a.h(8)));
                t82.a(t82Var, p82Var);
                this.j = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
