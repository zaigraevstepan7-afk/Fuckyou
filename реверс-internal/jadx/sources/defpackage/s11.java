package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class s11 extends xv0 {
    public final sa0 a;

    public s11(sa0 sa0Var) {
        this.a = sa0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        t11 t11Var = new t11();
        t11Var.s = this.a;
        t11Var.t = -9223372034707292160L;
        return t11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s11) {
            return this.a == ((s11) obj).a;
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        t11 t11Var = (t11) sv0Var;
        t11Var.s = this.a;
        t11Var.t = -9223372034707292160L;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
