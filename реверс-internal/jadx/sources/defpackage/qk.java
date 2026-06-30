package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class qk extends xv0 {
    public final jx0 a;
    public final pf0 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final yf1 f;
    public final ha0 g;

    public qk(jx0 jx0Var, pf0 pf0Var, boolean z, boolean z2, String str, yf1 yf1Var, ha0 ha0Var) {
        this.a = jx0Var;
        this.b = pf0Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = yf1Var;
        this.g = ha0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new uk(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qk.class != obj.getClass()) {
            return false;
        }
        qk qkVar = (qk) obj;
        return xi0.o(this.a, qkVar.a) && xi0.o(this.b, qkVar.b) && this.c == qkVar.c && this.d == qkVar.d && xi0.o(this.e, qkVar.e) && xi0.o(this.f, qkVar.f) && this.g == qkVar.g;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((uk) sv0Var).b1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final int hashCode() {
        jx0 jx0Var = this.a;
        int iHashCode = (jx0Var != null ? jx0Var.hashCode() : 0) * 31;
        pf0 pf0Var = this.b;
        int iD = s91.d(s91.d((iHashCode + (pf0Var != null ? pf0Var.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode2 = (iD + (str != null ? str.hashCode() : 0)) * 31;
        yf1 yf1Var = this.f;
        return this.g.hashCode() + ((iHashCode2 + (yf1Var != null ? Integer.hashCode(yf1Var.a) : 0)) * 31);
    }
}
