package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class y70 extends xv0 {
    public final sa0 a;

    public y70(sa0 sa0Var) {
        this.a = sa0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        z70 z70Var = new z70();
        z70Var.s = this.a;
        return z70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y70) {
            return this.a == ((y70) obj).a;
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((z70) sv0Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
