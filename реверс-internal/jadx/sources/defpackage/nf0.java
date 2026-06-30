package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class nf0 extends xv0 {
    public final jx0 a;
    public final pf0 b;

    public nf0(jx0 jx0Var, pf0 pf0Var) {
        this.a = jx0Var;
        this.b = pf0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        xw xwVarA = this.b.a(this.a);
        of0 of0Var = new of0();
        of0Var.u = xwVarA;
        of0Var.L0(xwVarA);
        return of0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf0)) {
            return false;
        }
        nf0 nf0Var = (nf0) obj;
        return xi0.o(this.a, nf0Var.a) && xi0.o(this.b, nf0Var.b);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        of0 of0Var = (of0) sv0Var;
        xw xwVarA = this.b.a(this.a);
        of0Var.M0(of0Var.u);
        of0Var.u = xwVarA;
        of0Var.L0(xwVarA);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
