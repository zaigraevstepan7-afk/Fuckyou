package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class xf extends xv0 {
    public final sa0 a;

    public xf(sa0 sa0Var) {
        this.a = sa0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new yf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xf) {
            return this.a == ((xf) obj).a;
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        yf yfVar = (yf) sv0Var;
        sa0 sa0Var = this.a;
        yfVar.s = sa0Var;
        el.V(yfVar, sa0Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
