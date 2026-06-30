package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cu1 extends yw implements p81, b80, q80 {
    public ha0 u;
    public boolean v;
    public final fv1 w;

    public cu1(ha0 ha0Var) {
        this.u = ha0Var;
        u5 u5Var = new u5(2, this);
        e81 e81Var = bv1.a;
        fv1 fv1Var = new fv1(null, null, u5Var);
        L0(fv1Var);
        this.w = fv1Var;
    }

    @Override // defpackage.p81
    public final void I(e81 e81Var, f81 f81Var, long j) {
        this.w.I(e81Var, f81Var, j);
    }

    @Override // defpackage.b80
    public final void R(v80 v80Var) {
        this.v = v80Var.a();
    }

    @Override // defpackage.p81
    public final void h0() {
        this.w.h0();
    }

    @Override // defpackage.p81
    public final long r() {
        xz xzVar = u4.v0;
        hx hxVar = bl.P(this).B;
        xzVar.getClass();
        int i = l12.b;
        return t61.i(hxVar.N(10.0f), hxVar.N(40.0f), hxVar.N(10.0f), hxVar.N(40.0f));
    }
}
