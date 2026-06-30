package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class d41 extends xv0 {
    public final c41 a;

    public d41(c41 c41Var) {
        this.a = c41Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        f41 f41Var = new f41();
        f41Var.s = this.a;
        return f41Var;
    }

    public final boolean equals(Object obj) {
        d41 d41Var = obj instanceof d41 ? (d41) obj : null;
        if (d41Var == null) {
            return false;
        }
        return xi0.o(this.a, d41Var.a);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((f41) sv0Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
