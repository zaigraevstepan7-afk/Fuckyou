package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class ik0 extends xv0 {
    public final sa0 a;
    public final sa0 b;

    public ik0(sa0 sa0Var, sa0 sa0Var2) {
        this.a = sa0Var;
        this.b = sa0Var2;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        kk0 kk0Var = new kk0();
        kk0Var.s = this.a;
        kk0Var.t = this.b;
        return kk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik0)) {
            return false;
        }
        ik0 ik0Var = (ik0) obj;
        return this.a == ik0Var.a && this.b == ik0Var.b;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        kk0 kk0Var = (kk0) sv0Var;
        kk0Var.s = this.a;
        kk0Var.t = this.b;
    }

    public final int hashCode() {
        sa0 sa0Var = this.a;
        int iHashCode = (sa0Var != null ? sa0Var.hashCode() : 0) * 31;
        sa0 sa0Var2 = this.b;
        return iHashCode + (sa0Var2 != null ? sa0Var2.hashCode() : 0);
    }
}
