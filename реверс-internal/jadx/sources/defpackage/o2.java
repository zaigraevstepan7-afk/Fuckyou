package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class o2 extends xv0 {
    public final fi a;

    public o2(fi fiVar) {
        this.a = fiVar;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        p2 p2Var = new p2();
        p2Var.u = this.a;
        n nVar = new n(2, p2Var);
        n2 n2Var = new n2();
        n2Var.s = nVar;
        p2Var.L0(n2Var);
        return p2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o2) {
            return this.a == ((o2) obj).a;
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((p2) sv0Var).u = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
