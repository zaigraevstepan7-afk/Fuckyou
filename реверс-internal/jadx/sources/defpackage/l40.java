package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class l40 extends xv0 {
    public final d22 a;
    public final z12 b;
    public final z12 c;
    public final z12 d;
    public final w40 e;
    public final j50 f;
    public final vn1 g;
    public final ha0 h;
    public final m40 i;

    public l40(d22 d22Var, z12 z12Var, z12 z12Var2, z12 z12Var3, w40 w40Var, j50 j50Var, vn1 vn1Var, ha0 ha0Var, m40 m40Var) {
        this.a = d22Var;
        this.b = z12Var;
        this.c = z12Var2;
        this.d = z12Var3;
        this.e = w40Var;
        this.f = j50Var;
        this.g = vn1Var;
        this.h = ha0Var;
        this.i = m40Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new v40(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l40)) {
            return false;
        }
        l40 l40Var = (l40) obj;
        return l40Var.a == this.a && xi0.o(l40Var.b, this.b) && xi0.o(l40Var.c, this.c) && xi0.o(l40Var.d, this.d) && l40Var.e.equals(this.e) && xi0.o(l40Var.f, this.f) && l40Var.g == this.g && l40Var.h == this.h && xi0.o(l40Var.i, this.i);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        v40 v40Var = (v40) sv0Var;
        v40Var.t = this.a;
        v40Var.u = this.b;
        v40Var.v = this.c;
        v40Var.w = this.d;
        v40Var.x = this.e;
        v40Var.y = this.f;
        v40Var.z = this.g;
        v40Var.A = this.h;
        v40Var.B = this.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        z12 z12Var = this.b;
        int iHashCode2 = (iHashCode + (z12Var != null ? z12Var.hashCode() : 0)) * 31;
        z12 z12Var2 = this.c;
        int iHashCode3 = (iHashCode2 + (z12Var2 != null ? z12Var2.hashCode() : 0)) * 31;
        z12 z12Var3 = this.d;
        return this.g.hashCode() + (this.i.hashCode() * 31) + ((this.h.hashCode() + ((this.f.a.hashCode() + ((this.e.a.hashCode() + ((iHashCode3 + (z12Var3 != null ? z12Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
