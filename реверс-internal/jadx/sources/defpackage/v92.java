package defpackage;

import com.reddit.secondpage.R;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v92 implements np, vo0 {
    public final h4 e;
    public final tp f;
    public boolean g;
    public zo0 h;
    public wa0 i = qo.a;

    public v92(h4 h4Var, tp tpVar) {
        this.e = h4Var;
        this.f = tpVar;
    }

    public final void d() {
        if (!this.g) {
            this.g = true;
            this.e.getView().setTag(R.id.wrapped_composition_tag, null);
            zo0 zo0Var = this.h;
            if (zo0Var != null) {
                zo0Var.f(this);
            }
            this.h = null;
        }
        this.f.m();
    }

    @Override // defpackage.vo0
    public final void e(xo0 xo0Var, po0 po0Var) {
        if (po0Var == po0.ON_DESTROY) {
            d();
        } else {
            if (po0Var != po0.ON_CREATE || this.g) {
                return;
            }
            f(this.i);
        }
    }

    public final void f(wa0 wa0Var) {
        this.e.setOnReadyForComposition(new b7(9, this, wa0Var));
    }
}
