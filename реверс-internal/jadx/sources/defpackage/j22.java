package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class j22 extends xv0 {
    public final bn0 a;

    public j22(bn0 bn0Var) {
        this.a = bn0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        k22 k22Var = new k22();
        k22Var.s = this.a;
        return k22Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j22) && xi0.o(this.a, ((j22) obj).a);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((k22) sv0Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ")";
    }
}
