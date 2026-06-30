package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class xy1 extends xv0 {
    public final d02 a;

    public xy1(d02 d02Var) {
        this.a = d02Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new yy1(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy1)) {
            return false;
        }
        return xi0.o(this.a, ((xy1) obj).a);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        yy1 yy1Var = (yy1) sv0Var;
        yy1Var.getClass();
        d02 d02VarX = qc1.x(this.a, bl.P(yy1Var).C);
        yy1Var.L0(d02VarX, (c90) hk.o(yy1Var, aq.k));
        wy1 wy1Var = yy1Var.u;
        if (wy1Var == null) {
            throw s91.v("Min size state is not set.");
        }
        wy1.a(wy1Var, null, null, d02VarX, 23);
        el.D(yy1Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
