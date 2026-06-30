package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qf0 extends xv0 {
    public final boolean a;
    public final jx0 b;
    public final fx1 c;
    public final ym1 d;

    public qf0(boolean z, jx0 jx0Var, fx1 fx1Var, ym1 ym1Var) {
        this.a = z;
        this.b = jx0Var;
        this.c = fx1Var;
        this.d = ym1Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new sf0(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf0)) {
            return false;
        }
        qf0 qf0Var = (qf0) obj;
        return this.a == qf0Var.a && xi0.o(this.b, qf0Var.b) && this.c.equals(qf0Var.c) && xi0.o(this.d, qf0Var.d) && tz.b(2.0f, 2.0f) && tz.b(1.0f, 1.0f);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        boolean z;
        sf0 sf0Var = (sf0) sv0Var;
        boolean z2 = sf0Var.u;
        boolean z3 = this.a;
        boolean z4 = true;
        if (z2 != z3) {
            sf0Var.u = z3;
            z = true;
        } else {
            z = false;
        }
        jx0 jx0Var = sf0Var.v;
        jx0 jx0Var2 = this.b;
        if (jx0Var != jx0Var2) {
            sf0Var.v = jx0Var2;
            jr1 jr1Var = sf0Var.z;
            ks ksVar = null;
            if (jr1Var != null) {
                jr1Var.a(null);
            }
            sf0Var.z = nu0.A(sf0Var.z0(), null, null, new rf0(sf0Var, ksVar, 3), 3);
        }
        fx1 fx1Var = sf0Var.A;
        fx1 fx1Var2 = this.c;
        if (!xi0.o(fx1Var, fx1Var2)) {
            sf0Var.A = fx1Var2;
            z = true;
        }
        ym1 ym1Var = sf0Var.C;
        ym1 ym1Var2 = this.d;
        if (!xi0.o(ym1Var, ym1Var2)) {
            if (!xi0.o(sf0Var.C, ym1Var2)) {
                sf0Var.C = ym1Var2;
                sf0Var.E.L0();
            }
            z = true;
        }
        if (!tz.b(sf0Var.w, 2.0f)) {
            sf0Var.w = 2.0f;
            z = true;
        }
        if (tz.b(sf0Var.x, 1.0f)) {
            z4 = z;
        } else {
            sf0Var.x = 1.0f;
        }
        if (z4) {
            sf0Var.P0();
        }
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + s91.d(Boolean.hashCode(this.a) * 31, 31, false)) * 31)) * 31;
        ym1 ym1Var = this.d;
        return Float.hashCode(1.0f) + s91.a(2.0f, (iHashCode + (ym1Var != null ? ym1Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "IndicatorLineElement(enabled=" + this.a + ", isError=false, interactionSource=" + this.b + ", colors=" + this.c + ", textFieldShape=" + this.d + ", focusedIndicatorLineThickness=" + tz.c(2.0f) + ", unfocusedIndicatorLineThickness=" + tz.c(1.0f) + ")";
    }
}
