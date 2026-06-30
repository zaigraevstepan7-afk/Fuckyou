package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class rk1 extends xv0 {
    public final boolean a;
    public final jx0 b;
    public final pf0 c;
    public final boolean d;
    public final ha0 e;

    public rk1(boolean z, jx0 jx0Var, pf0 pf0Var, boolean z2, ha0 ha0Var) {
        this.a = z;
        this.b = jx0Var;
        this.c = pf0Var;
        this.d = z2;
        this.e = ha0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        tk1 tk1Var = new tk1(this.b, this.c, false, this.d, null, null, this.e);
        tk1Var.Q = this.a;
        return tk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rk1.class != obj.getClass()) {
            return false;
        }
        rk1 rk1Var = (rk1) obj;
        return this.a == rk1Var.a && xi0.o(this.b, rk1Var.b) && xi0.o(this.c, rk1Var.c) && this.d == rk1Var.d && this.e == rk1Var.e;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        tk1 tk1Var = (tk1) sv0Var;
        boolean z = tk1Var.Q;
        boolean z2 = this.a;
        if (z != z2) {
            tk1Var.Q = z2;
            kd1.t(tk1Var);
        }
        tk1Var.b1(this.b, this.c, false, this.d, null, null, this.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        jx0 jx0Var = this.b;
        int iHashCode2 = (iHashCode + (jx0Var != null ? jx0Var.hashCode() : 0)) * 31;
        pf0 pf0Var = this.c;
        return this.e.hashCode() + s91.d(s91.d((iHashCode2 + (pf0Var != null ? pf0Var.hashCode() : 0)) * 31, 31, false), 961, this.d);
    }
}
