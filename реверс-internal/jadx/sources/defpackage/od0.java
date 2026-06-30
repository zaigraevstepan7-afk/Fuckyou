package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class od0 extends sv0 implements vp, il0, u01 {
    public d02 s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public d02 y;
    public d32 z;

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.il0
    public final int D(ws0 ws0Var, pu0 pu0Var, int i) {
        M0(ws0Var);
        int i2 = this.w;
        if (i2 == this.x) {
            return i2;
        }
        int iA0 = pu0Var.a0(i);
        int i3 = this.w;
        int i4 = this.x;
        if (iA0 < i3) {
            iA0 = i3;
        }
        return iA0 > i4 ? i4 : iA0;
    }

    @Override // defpackage.sv0
    public final void D0() {
        c90 c90Var = (c90) hk.o(this, aq.k);
        this.y = qc1.x(this.s, bl.P(this).C);
        lv1 lv1Var = N0().a.f;
        aa0 aa0Var = N0().a.c;
        if (aa0Var == null) {
            aa0Var = aa0.g;
        }
        y90 y90Var = N0().a.d;
        int i = y90Var != null ? y90Var.a : 0;
        z90 z90Var = N0().a.e;
        this.z = ((d90) c90Var).b(lv1Var, aa0Var, i, z90Var != null ? z90Var.a : 65535);
        bk.R(this, new nd0(this, 0));
        this.v = true;
    }

    @Override // defpackage.sv0
    public final void E0() {
        this.y = null;
        this.z = null;
        this.v = false;
    }

    @Override // defpackage.u01
    public final void K() {
        if (this.z != null) {
            bk.R(this, new nd0(this, 1));
        }
        this.v = true;
        el.D(this);
    }

    public final void L0(xu0 xu0Var, d02 d02Var, c90 c90Var) {
        nz1 nz1Var = jx1.b(d02Var, xu0Var, c90Var, 3).d;
        float fH = nz1Var.h(0);
        float fH2 = nz1Var.h(1);
        float fH3 = nz1Var.h(2);
        this.w = lk.F(fH, fH2, fH3, this.t, 1);
        this.x = lk.F(fH, fH2, fH3, this.u, Integer.MAX_VALUE);
    }

    public final void M0(ws0 ws0Var) {
        if (this.v) {
            L0(ws0Var, N0(), (c90) hk.o(this, aq.k));
            this.v = false;
        }
        int i = this.w;
        this.w = i >= 0 ? i : 0;
        int i2 = this.x;
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        this.x = i2;
    }

    public final d02 N0() {
        d02 d02Var = this.y;
        if (d02Var != null) {
            return d02Var;
        }
        throw s91.v("Resolved style is not set.");
    }

    @Override // defpackage.xw, defpackage.p81
    public final void a() {
        this.v = true;
        el.D(this);
    }

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        if (this.v) {
            L0(xu0Var, N0(), (c90) hk.o(this, aq.k));
            this.v = false;
        }
        int i = this.w;
        int iA = i != -1 ? lk.A(i, kr.i(j), kr.g(j)) : kr.i(j);
        int i2 = this.x;
        z61 z61VarE = pu0Var.e(kr.a(j, 0, 0, iA, i2 != -1 ? lk.A(i2, kr.i(j), kr.g(j)) : kr.g(j), 3));
        return xu0Var.f0(z61VarE.e, z61VarE.f, g40.e, new pd(z61VarE, 2));
    }

    @Override // defpackage.il0
    public final int n(ws0 ws0Var, pu0 pu0Var, int i) {
        M0(ws0Var);
        int i2 = this.w;
        int i3 = this.x;
        if (i2 == i3) {
            return i3;
        }
        int iF = pu0Var.f(i);
        int i4 = this.w;
        int i5 = this.x;
        if (iF < i4) {
            iF = i4;
        }
        return iF > i5 ? i5 : iF;
    }

    @Override // defpackage.xw
    public final void u0() {
        this.y = qc1.x(this.s, bl.P(this).C);
        this.v = true;
        el.D(this);
    }
}
