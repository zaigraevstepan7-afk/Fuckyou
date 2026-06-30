package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sg0 extends ys0 {
    @Override // defpackage.ys0
    public final void M0() {
        ct0 ct0Var = this.w.w.J.q;
        ct0Var.getClass();
        ct0Var.A0();
    }

    @Override // defpackage.pu0
    public final int O(int i) {
        xg0 xg0VarT = this.w.w.t();
        uu0 uu0VarV = xg0VarT.v();
        ql0 ql0Var = (ql0) xg0VarT.f;
        return uu0VarV.j(ql0Var.I.d, ql0Var.l(), i);
    }

    @Override // defpackage.pu0
    public final int U(int i) {
        xg0 xg0VarT = this.w.w.t();
        uu0 uu0VarV = xg0VarT.v();
        ql0 ql0Var = (ql0) xg0VarT.f;
        return uu0VarV.d(ql0Var.I.d, ql0Var.l(), i);
    }

    @Override // defpackage.pu0
    public final int a0(int i) {
        xg0 xg0VarT = this.w.w.t();
        uu0 uu0VarV = xg0VarT.v();
        ql0 ql0Var = (ql0) xg0VarT.f;
        return uu0VarV.h(ql0Var.I.d, ql0Var.l(), i);
    }

    @Override // defpackage.pu0
    public final z61 e(long j) {
        o0(j);
        c01 c01Var = this.w;
        iy0 iy0VarY = c01Var.w.y();
        Object[] objArr = iy0VarY.e;
        int i = iy0VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            ct0 ct0Var = ((ql0) objArr[i2]).J.q;
            ct0Var.getClass();
            ct0Var.n = ol0.g;
        }
        ql0 ql0Var = c01Var.w;
        ys0.L0(this, ql0Var.z.g(this, ql0Var.l(), j));
        return this;
    }

    @Override // defpackage.pu0
    public final int f(int i) {
        xg0 xg0VarT = this.w.w.t();
        uu0 uu0VarV = xg0VarT.v();
        ql0 ql0Var = (ql0) xg0VarT.f;
        return uu0VarV.b(ql0Var.I.d, ql0Var.l(), i);
    }

    @Override // defpackage.ws0
    public final int r0(c3 c3Var) {
        ct0 ct0Var = this.w.w.J.q;
        ct0Var.getClass();
        rl0 rl0Var = ct0Var.v;
        if (!ct0Var.o) {
            ul0 ul0Var = ct0Var.j;
            if (ul0Var.d == ml0.f) {
                rl0Var.f = true;
                if (rl0Var.b) {
                    ul0Var.f = true;
                    ul0Var.g = true;
                }
            } else {
                rl0Var.g = true;
            }
        }
        sg0 sg0Var = ct0Var.n().a0;
        Boolean boolValueOf = sg0Var != null ? Boolean.valueOf(sg0Var.s) : null;
        sg0 sg0Var2 = ct0Var.n().a0;
        if (sg0Var2 != null) {
            sg0Var2.s = true;
        }
        ct0Var.p();
        sg0 sg0Var3 = ct0Var.n().a0;
        if (sg0Var3 != null) {
            sg0Var3.s = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) rl0Var.i.get(c3Var);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.B.g(iIntValue, c3Var);
        return iIntValue;
    }
}
