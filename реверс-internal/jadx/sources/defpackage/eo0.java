package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class eo0 extends sv0 implements vp, cc0 {
    public n6 s;
    public jo0 t;
    public ry1 u;
    public final v41 v = xc.B(null);

    public eo0(n6 n6Var, jo0 jo0Var, ry1 ry1Var) {
        this.s = n6Var;
        this.t = jo0Var;
        this.u = ry1Var;
    }

    @Override // defpackage.sv0
    public final void D0() {
        n6 n6Var = this.s;
        if (n6Var.a != null) {
            qg0.c("Expected textInputModifierNode to be null");
        }
        n6Var.a = this;
    }

    @Override // defpackage.sv0
    public final void E0() {
        this.s.k(this);
    }

    @Override // defpackage.cc0
    public final void t(c01 c01Var) {
        this.v.setValue(c01Var);
    }
}
