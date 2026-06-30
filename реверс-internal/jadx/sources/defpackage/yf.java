package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yf extends sv0 implements il0, pl1 {
    public sa0 s;

    public yf(sa0 sa0Var) {
        this.s = sa0Var;
    }

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        z61 z61VarE = pu0Var.e(j);
        return xu0Var.f0(z61VarE.e, z61VarE.f, g40.e, new b7(6, z61VarE, this));
    }

    @Override // defpackage.pl1
    public final void g0(am1 am1Var) {
        ym1 ym1Var;
        boolean z;
        c01 c01VarN = bl.N(this, 2);
        if (c01VarN.N) {
            ym1Var = c01VarN.L;
            z = c01VarN.M;
        } else {
            ue1 ue1Var = c2.s;
            if (ue1Var == null) {
                c2.s = new ue1();
            } else {
                ue1Var.a();
            }
            ue1 ue1Var2 = c2.s;
            ue1Var2.getClass();
            ue1Var2.w = c01VarN.w.B;
            ue1Var2.u = xk.P(c01VarN.g);
            sp1 sp1VarL = uc1.l();
            sa0 sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
            sp1 sp1VarU = uc1.u(sp1VarL);
            try {
                this.s.i(ue1Var2);
                uc1.B(sp1VarL, sp1VarU, sa0VarE);
                ym1Var = ue1Var2.s;
                z = ue1Var2.t;
            } catch (Throwable th) {
                uc1.B(sp1VarL, sp1VarU, sa0VarE);
                throw th;
            }
        }
        if (z) {
            yl1.c(am1Var, ym1Var);
        }
    }

    @Override // defpackage.pl1
    public final boolean h() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.s + ")";
    }
}
