package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class l52 extends xv0 {
    public final d22 a;
    public final z12 b;
    public final w40 c;
    public final j50 d;
    public final vn1 e;

    public l52(d22 d22Var, z12 z12Var, w40 w40Var, j50 j50Var, vn1 vn1Var) {
        this.a = d22Var;
        this.b = z12Var;
        this.c = w40Var;
        this.d = j50Var;
        this.e = vn1Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        n52 n52Var = new n52();
        n52Var.s = this.b;
        n52Var.t = this.c;
        n52Var.u = this.d;
        n52Var.v = this.e;
        return n52Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l52) {
            l52 l52Var = (l52) obj;
            return this.a == l52Var.a && xi0.o(this.b, l52Var.b) && this.c.equals(l52Var.c) && xi0.o(this.d, l52Var.d) && this.e == l52Var.e;
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        n52 n52Var = (n52) sv0Var;
        n52Var.getClass();
        n52Var.s = this.b;
        n52Var.t = this.c;
        n52Var.u = this.d;
        n52Var.v = this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.a.hashCode() + ((this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.a + ", veilAnimation=" + this.b + ", enter=" + this.c + ", exit=" + this.d + ", mutableTransformState=" + this.e + ")";
    }
}
