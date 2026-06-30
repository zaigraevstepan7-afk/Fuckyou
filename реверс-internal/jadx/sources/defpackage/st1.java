package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class st1 extends sv0 implements il0 {
    public xt1 s;

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.sv0
    public final void D0() {
        i22 i22VarM = pd1.m(this, "StyleOuterNode");
        i22VarM.getClass();
        xt1 xt1Var = (xt1) i22VarM;
        xt1Var.u = this;
        this.s = xt1Var;
        xt1Var.R0(true);
    }

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        xt1 xt1Var = this.s;
        xt1Var.getClass();
        yt1 yt1VarQ0 = xt1.Q0(xt1Var, 1);
        float f = yt1VarQ0.u((byte) 8) ? yt1VarQ0.k : 0.0f;
        final float f2 = (yt1VarQ0.u((byte) 0) ? yt1VarQ0.c : 0.0f) + f;
        float f3 = (yt1VarQ0.u((byte) 1) ? yt1VarQ0.d : 0.0f) + f;
        final float f4 = (yt1VarQ0.u((byte) 2) ? yt1VarQ0.e : 0.0f) + f;
        float f5 = yt1VarQ0.u((byte) 3) ? yt1VarQ0.f : 0.0f;
        int iRound = Math.round(f3 + f2);
        int iRound2 = Math.round(f5 + f + f4);
        final z61 z61VarE = pu0Var.e(lr.i(-iRound, -iRound2, j));
        return xu0Var.f0(lr.g(z61VarE.e + iRound, j), lr.f(z61VarE.f + iRound2, j), g40.e, new sa0() { // from class: rt1
            @Override // defpackage.sa0
            public final Object i(Object obj) {
                ((y61) obj).g(z61VarE, Math.round(f2), Math.round(f4), 0.0f);
                return t32.a;
            }
        });
    }
}
