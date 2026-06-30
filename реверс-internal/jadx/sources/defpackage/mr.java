package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class mr extends xv0 {
    public final sa0 a;

    public mr(sa0 sa0Var) {
        this.a = sa0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        nr nrVar = new nr();
        q60 q60Var = pv.D;
        nrVar.s = q60Var;
        nrVar.t = q60Var;
        nrVar.u = this.a;
        return nrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mr) && ((mr) obj).a == this.a;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        nr nrVar = (nr) sv0Var;
        sa0 sa0Var = nrVar.u;
        sa0 sa0Var2 = this.a;
        if (sa0Var2 != sa0Var) {
            nrVar.u = sa0Var2;
            k72 k72Var = nrVar.s;
            sa0Var2.i(k72Var);
            nrVar.t = k72Var;
            pd1.v(nrVar, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new fh0(nrVar, 0));
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
