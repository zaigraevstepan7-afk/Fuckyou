package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class lm0 extends xv0 {
    public final in0 a;
    public final wg b;
    public final k31 c;

    public lm0(in0 in0Var, wg wgVar, k31 k31Var) {
        this.a = in0Var;
        this.b = wgVar;
        this.c = k31Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        om0 om0Var = new om0();
        om0Var.s = this.a;
        om0Var.t = this.b;
        om0Var.u = this.c;
        return om0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm0)) {
            return false;
        }
        lm0 lm0Var = (lm0) obj;
        return xi0.o(this.a, lm0Var.a) && xi0.o(this.b, lm0Var.b) && this.c == lm0Var.c;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        om0 om0Var = (om0) sv0Var;
        om0Var.s = this.a;
        om0Var.t = this.b;
        om0Var.u = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + s91.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
