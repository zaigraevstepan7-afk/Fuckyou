package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class ij1 extends xv0 {
    public final vj1 a;
    public final k31 b;
    public final boolean c;
    public final aw d;
    public final jx0 e;
    public final boolean f;
    public final v5 g;

    public ij1(v5 v5Var, aw awVar, jx0 jx0Var, k31 k31Var, vj1 vj1Var, boolean z, boolean z2) {
        this.a = vj1Var;
        this.b = k31Var;
        this.c = z;
        this.d = awVar;
        this.e = jx0Var;
        this.f = z2;
        this.g = v5Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        jj1 jj1Var = new jj1();
        jj1Var.u = this.a;
        jj1Var.v = this.b;
        jj1Var.w = this.c;
        jj1Var.x = this.d;
        jj1Var.y = this.e;
        jj1Var.z = this.f;
        jj1Var.A = this.g;
        return jj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ij1.class != obj.getClass()) {
            return false;
        }
        ij1 ij1Var = (ij1) obj;
        return xi0.o(this.a, ij1Var.a) && this.b == ij1Var.b && this.c == ij1Var.c && xi0.o(this.d, ij1Var.d) && xi0.o(this.e, ij1Var.e) && this.f == ij1Var.f && xi0.o(this.g, ij1Var.g);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((jj1) sv0Var).Q0(this.g, this.d, this.e, this.b, this.a, this.f, this.c);
    }

    public final int hashCode() {
        int iD = s91.d(s91.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, false);
        aw awVar = this.d;
        int iHashCode = (iD + (awVar != null ? awVar.hashCode() : 0)) * 31;
        jx0 jx0Var = this.e;
        int iD2 = s91.d((iHashCode + (jx0Var != null ? jx0Var.hashCode() : 0)) * 961, 31, this.f);
        v5 v5Var = this.g;
        return iD2 + (v5Var != null ? v5Var.hashCode() : 0);
    }
}
