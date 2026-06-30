package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class en0 extends xv0 {
    public final ha0 a;
    public final dn0 b;
    public final k31 c;
    public final boolean d;

    public en0(ha0 ha0Var, dn0 dn0Var, k31 k31Var, boolean z) {
        this.a = ha0Var;
        this.b = dn0Var;
        this.c = k31Var;
        this.d = z;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new hn0(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en0)) {
            return false;
        }
        en0 en0Var = (en0) obj;
        return this.a == en0Var.a && xi0.o(this.b, en0Var.b) && this.c == en0Var.c && this.d == en0Var.d;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        hn0 hn0Var = (hn0) sv0Var;
        hn0Var.s = this.a;
        hn0Var.t = this.b;
        k31 k31Var = hn0Var.u;
        k31 k31Var2 = this.c;
        if (k31Var != k31Var2) {
            hn0Var.u = k31Var2;
            kd1.t(hn0Var);
        }
        boolean z = hn0Var.v;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        hn0Var.v = z2;
        hn0Var.L0();
        kd1.t(hn0Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + s91.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
