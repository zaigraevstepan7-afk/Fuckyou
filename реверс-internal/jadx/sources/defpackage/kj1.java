package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class kj1 extends xv0 {
    public final vj1 a;
    public final k31 b;
    public final boolean c;
    public final boolean d;
    public final jx0 e;

    public kj1(vj1 vj1Var, k31 k31Var, boolean z, boolean z2, jx0 jx0Var) {
        this.a = vj1Var;
        this.b = k31Var;
        this.c = z;
        this.d = z2;
        this.e = jx0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new uj1(null, null, this.e, this.b, this.a, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj1)) {
            return false;
        }
        kj1 kj1Var = (kj1) obj;
        return xi0.o(this.a, kj1Var.a) && this.b == kj1Var.b && this.c == kj1Var.c && this.d == kj1Var.d && xi0.o(this.e, kj1Var.e);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((uj1) sv0Var).g1(null, null, this.e, this.b, this.a, this.c, this.d);
    }

    public final int hashCode() {
        int iD = s91.d(s91.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 961, 31, this.c), 961, this.d);
        jx0 jx0Var = this.e;
        return (iD + (jx0Var != null ? jx0Var.hashCode() : 0)) * 31;
    }
}
