package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class p11 extends xv0 {
    public final sa0 a;

    public p11(sa0 sa0Var) {
        this.a = sa0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        q11 q11Var = new q11();
        q11Var.s = this.a;
        return q11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p11) {
            return this.a == ((p11) obj).a;
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((q11) sv0Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
