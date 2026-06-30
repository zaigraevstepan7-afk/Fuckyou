package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class dn extends xv0 {
    public final jx0 a;
    public final pf0 b;
    public final boolean c;
    public final ha0 d;

    public dn(ha0 ha0Var, pf0 pf0Var, jx0 jx0Var, boolean z) {
        this.a = jx0Var;
        this.b = pf0Var;
        this.c = z;
        this.d = ha0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new fn(this.d, this.b, this.a, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dn.class != obj.getClass()) {
            return false;
        }
        dn dnVar = (dn) obj;
        return xi0.o(this.a, dnVar.a) && xi0.o(this.b, dnVar.b) && this.c == dnVar.c && this.d == dnVar.d;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        fn fnVar = (fn) sv0Var;
        fnVar.getClass();
        boolean z = fnVar.z;
        boolean z2 = this.c;
        boolean z3 = z != z2;
        fnVar.b1(this.a, this.b, false, z2, null, null, this.d);
        if (z3) {
            fnVar.c1(false);
            fnVar.c1(true);
        }
    }

    public final int hashCode() {
        jx0 jx0Var = this.a;
        int iHashCode = (jx0Var != null ? jx0Var.hashCode() : 0) * 31;
        pf0 pf0Var = this.b;
        return Boolean.hashCode(true) + ((this.d.hashCode() + s91.d(s91.d((iHashCode + (pf0Var != null ? pf0Var.hashCode() : 0)) * 31, 31, false), 29791, this.c)) * 923521);
    }
}
