package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class ee0 extends xv0 {
    public final jx0 a;

    public ee0(jx0 jx0Var) {
        this.a = jx0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        ie0 ie0Var = new ie0();
        ie0Var.s = this.a;
        return ie0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee0) && xi0.o(((ee0) obj).a, this.a);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ie0 ie0Var = (ie0) sv0Var;
        jx0 jx0Var = ie0Var.s;
        jx0 jx0Var2 = this.a;
        if (xi0.o(jx0Var, jx0Var2)) {
            return;
        }
        ie0Var.N0();
        ie0Var.s = jx0Var2;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
