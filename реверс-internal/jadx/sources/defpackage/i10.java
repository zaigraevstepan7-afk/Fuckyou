package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class i10 extends z00 {
    public hp1 N;
    public boolean O;
    public xa0 P;
    public xa0 Q;
    public boolean R;

    @Override // defpackage.z00
    public final Object S0(y00 y00Var, y00 y00Var2) {
        k31 k31Var = this.u;
        t32 t32Var = t32.a;
        if (k31Var != null) {
            hp1 hp1Var = this.N;
            ks ksVar = null;
            m6 m6Var = new m6(y00Var, this, k31Var, ksVar, 6);
            hp1Var.getClass();
            Object objR = bl.r(new qk1(hp1Var, m6Var, ksVar, 2), y00Var2);
            wt wtVar = wt.e;
            if (objR != wtVar) {
                objR = t32Var;
            }
            if (objR == wtVar) {
                return objR;
            }
        }
        return t32Var;
    }

    @Override // defpackage.z00
    public final void X0(long j) {
        if (!this.r || xi0.o(this.P, g10.a)) {
            return;
        }
        nu0.A(z0(), null, yt.h, new h10(this, j, null), 1);
    }

    @Override // defpackage.z00
    public final void Y0(j00 j00Var) {
        k31 k31Var;
        if (!this.r || xi0.o(this.Q, g10.b) || (k31Var = this.u) == null) {
            return;
        }
        nu0.A(z0(), null, yt.h, new m6(this, j00Var, k31Var, null, 7), 1);
    }

    @Override // defpackage.z00
    public final boolean d1() {
        return this.O;
    }
}
