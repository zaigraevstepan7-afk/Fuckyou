package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class c12 extends xv0 {
    public final boolean a;
    public final jx0 b;
    public final yf1 c;
    public final sa0 d;

    public c12(boolean z, jx0 jx0Var, yf1 yf1Var, sa0 sa0Var) {
        this.a = z;
        this.b = jx0Var;
        this.c = yf1Var;
        this.d = sa0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new d12(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c12.class != obj.getClass()) {
            return false;
        }
        c12 c12Var = (c12) obj;
        return this.a == c12Var.a && xi0.o(this.b, c12Var.b) && this.c.equals(c12Var.c) && this.d == c12Var.d;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        d12 d12Var = (d12) sv0Var;
        boolean z = d12Var.Q;
        boolean z2 = this.a;
        if (z != z2) {
            d12Var.Q = z2;
            kd1.t(d12Var);
        }
        d12Var.R = this.d;
        d12Var.b1(this.b, null, false, true, null, this.c, d12Var.S);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        jx0 jx0Var = this.b;
        return this.d.hashCode() + s91.b(this.c.a, s91.d(s91.d((iHashCode + (jx0Var != null ? jx0Var.hashCode() : 0)) * 961, 31, false), 31, true), 31);
    }
}
