package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class b41 extends sv0 implements il0 {
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        int iN = xu0Var.N(this.u) + xu0Var.N(this.s);
        int iN2 = xu0Var.N(this.v) + xu0Var.N(this.t);
        z61 z61VarE = pu0Var.e(lr.i(-iN, -iN2, j));
        return xu0Var.f0(lr.g(z61VarE.e + iN, j), lr.f(z61VarE.f + iN2, j), g40.e, new d(16, this, z61VarE));
    }
}
