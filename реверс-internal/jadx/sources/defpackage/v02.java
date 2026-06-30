package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v02 extends sv0 implements il0 {
    public jx0 s;
    public boolean t;
    public p60 u;
    public boolean v;
    public h9 w;
    public h9 x;
    public float y;
    public float z;

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.sv0
    public final void D0() {
        nu0.A(z0(), null, null, new tv(this, (ks) null, 15), 3);
    }

    @Override // defpackage.sv0
    public final void F0() {
        this.w = null;
        this.x = null;
        this.z = Float.NaN;
        this.y = Float.NaN;
    }

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        float f = xi0.T;
        int i = 0;
        int i2 = 1;
        float fY = xu0Var.y(this.v ? xi0.N : ((pu0Var.f(kr.h(j)) != 0 && pu0Var.U(kr.g(j)) != 0) || this.t) ? iv1.a : iv1.b);
        h9 h9Var = this.x;
        int iFloatValue = (int) (h9Var != null ? ((Number) h9Var.d()).floatValue() : fY);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            pg0.a("width and height must be >= 0");
        }
        z61 z61VarE = pu0Var.e(lr.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fY2 = xu0Var.y((iv1.d - xu0Var.v0(fY)) / 2.0f);
        float fY3 = xu0Var.y((iv1.c - iv1.a) - iv1.e);
        boolean z = this.v;
        if (z && this.t) {
            fY2 = fY3 - xu0Var.y(f);
        } else if (z && !this.t) {
            fY2 = xu0Var.y(f);
        } else if (this.t) {
            fY2 = fY3;
        }
        h9 h9Var2 = this.x;
        ks ksVar = null;
        Float f2 = h9Var2 != null ? (Float) h9Var2.e.getValue() : null;
        if (f2 == null || f2.floatValue() != fY) {
            nu0.A(z0(), null, null, new u02(this, fY, ksVar, i), 3);
        }
        h9 h9Var3 = this.w;
        Float f3 = h9Var3 != null ? (Float) h9Var3.e.getValue() : null;
        if (f3 == null || f3.floatValue() != fY2) {
            nu0.A(z0(), null, null, new u02(this, fY2, ksVar, i2), 3);
        }
        if (Float.isNaN(this.z) && Float.isNaN(this.y)) {
            this.z = fY;
            this.y = fY2;
        }
        return xu0Var.f0(iFloatValue, iFloatValue, g40.e, new h5(z61VarE, this, fY2));
    }
}
