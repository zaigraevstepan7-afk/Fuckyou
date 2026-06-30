package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class x9<S> extends xv0 {
    public final z12 a;
    public final fy0 b;
    public final ba c;

    public x9(z12 z12Var, fy0 fy0Var, ba baVar) {
        this.a = z12Var;
        this.b = fy0Var;
        this.c = baVar;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        aa aaVar = new aa(1);
        aaVar.t = this.a;
        aaVar.u = this.b;
        aaVar.v = this.c;
        aaVar.w = -9223372034707292160L;
        return aaVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x9)) {
            return false;
        }
        x9 x9Var = (x9) obj;
        return xi0.o(x9Var.a, this.a) && x9Var.b.equals(this.b);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        aa aaVar = (aa) sv0Var;
        aaVar.t = this.a;
        aaVar.u = this.b;
        aaVar.v = this.c;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        z12 z12Var = this.a;
        return this.b.hashCode() + ((iHashCode + (z12Var != null ? z12Var.hashCode() : 0)) * 31);
    }
}
