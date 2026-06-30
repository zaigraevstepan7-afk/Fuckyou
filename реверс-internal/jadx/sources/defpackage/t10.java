package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class t10 extends xv0 {
    public final sa0 a;

    public t10(sa0 sa0Var) {
        this.a = sa0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        u10 u10Var = new u10();
        u10Var.s = this.a;
        return u10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t10) {
            return this.a == ((t10) obj).a;
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((u10) sv0Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
