package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yy1 extends sv0 implements vp, il0 {
    public final d02 s;
    public d32 t;
    public wy1 u;

    public yy1(d02 d02Var) {
        this.s = d02Var;
    }

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.sv0
    public final void D0() {
        d02 d02VarX = qc1.x(this.s, bl.P(this).C);
        c90 c90Var = (c90) hk.o(this, aq.k);
        L0(d02VarX, c90Var);
        al0 al0Var = bl.P(this).C;
        hx hxVar = bl.P(this).B;
        d32 d32Var = this.t;
        if (d32Var == null) {
            throw s91.v("Font resolution state is not set.");
        }
        this.u = new wy1(al0Var, hxVar, c90Var, d02VarX, d32Var.e);
    }

    @Override // defpackage.sv0
    public final void E0() {
        this.t = null;
        this.u = null;
    }

    public final void L0(d02 d02Var, c90 c90Var) {
        zq1 zq1Var = d02Var.a;
        lv1 lv1Var = zq1Var.f;
        aa0 aa0Var = zq1Var.c;
        if (aa0Var == null) {
            aa0Var = aa0.g;
        }
        y90 y90Var = zq1Var.d;
        int i = y90Var != null ? y90Var.a : 0;
        z90 z90Var = zq1Var.e;
        this.t = ((d90) c90Var).b(lv1Var, aa0Var, i, z90Var != null ? z90Var.a : 65535);
        el.D(this);
    }

    @Override // defpackage.xw, defpackage.p81
    public final void a() {
        wy1 wy1Var = this.u;
        if (wy1Var != null) {
            wy1.a(wy1Var, null, bl.P(this).B, null, 29);
        }
        el.D(this);
    }

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        wy1 wy1Var = this.u;
        if (wy1Var == null) {
            throw s91.v("Min size state is not set.");
        }
        v41 v41Var = wy1Var.f;
        d32 d32Var = this.t;
        if (d32Var == null) {
            throw s91.v("Font resolution state is not set.");
        }
        Object obj = d32Var.e;
        if (!xi0.o(obj, wy1Var.e)) {
            wy1Var.e = obj;
            v41Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) v41Var.getValue()).booleanValue()) {
            wy1Var.g = jx1.a(wy1Var.d, wy1Var.b, wy1Var.c);
            v41Var.setValue(Boolean.FALSE);
        }
        long j2 = wy1Var.g;
        z61 z61VarE = pu0Var.e(lr.e(j, lr.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return xu0Var.f0(z61VarE.e, z61VarE.f, g40.e, new pd(z61VarE, 8));
    }

    @Override // defpackage.xw
    public final void u0() {
        wy1 wy1Var = this.u;
        if (wy1Var != null) {
            wy1.a(wy1Var, bl.P(this).C, null, null, 30);
        }
        el.D(this);
    }
}
