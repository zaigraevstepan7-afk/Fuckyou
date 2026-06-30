package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class ve extends xv0 {
    public final long a;
    public final float b = 1.0f;
    public final ym1 c;

    public ve(long j, ym1 ym1Var) {
        this.a = j;
        this.c = ym1Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        we weVar = new we();
        weVar.s = this.a;
        weVar.t = this.c;
        weVar.u = 9205357640488583168L;
        return weVar;
    }

    public final boolean equals(Object obj) {
        ve veVar = obj instanceof ve ? (ve) obj : null;
        return veVar != null && vl.c(this.a, veVar.a) && this.b == veVar.b && xi0.o(this.c, veVar.c);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        we weVar = (we) sv0Var;
        weVar.s = this.a;
        ym1 ym1Var = weVar.t;
        ym1 ym1Var2 = this.c;
        if (!xi0.o(ym1Var, ym1Var2)) {
            weVar.t = ym1Var2;
            kd1.t(weVar);
        }
        al.C(weVar);
    }

    public final int hashCode() {
        int i = vl.h;
        return this.c.hashCode() + s91.a(this.b, Long.hashCode(this.a) * 961, 31);
    }
}
