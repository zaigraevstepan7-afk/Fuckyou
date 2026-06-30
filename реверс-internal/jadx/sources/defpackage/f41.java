package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class f41 extends sv0 implements il0 {
    public c41 s;

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        float fA = this.s.a(xu0Var.getLayoutDirection());
        float fD = this.s.d();
        float fB = this.s.b(xu0Var.getLayoutDirection());
        float fC = this.s.c();
        if (!((tz.a(fA, 0.0f) >= 0) & (tz.a(fD, 0.0f) >= 0) & (tz.a(fB, 0.0f) >= 0) & (tz.a(fC, 0.0f) >= 0))) {
            lg0.a("Padding must be non-negative");
        }
        int iN = xu0Var.N(fA);
        int iN2 = xu0Var.N(fB) + iN;
        int iN3 = xu0Var.N(fD);
        int iN4 = xu0Var.N(fC) + iN3;
        z61 z61VarE = pu0Var.e(lr.i(-iN2, -iN4, j));
        return xu0Var.f0(lr.g(z61VarE.e + iN2, j), lr.f(z61VarE.f + iN4, j), g40.e, new ov0(z61VarE, iN, iN3, 1));
    }
}
