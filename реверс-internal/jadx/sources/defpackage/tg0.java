package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class tg0 extends c01 {
    public static final p6 b0;
    public final nv1 Z;
    public sg0 a0;

    static {
        p6 p6VarL = wi0.l();
        int i = vl.h;
        p6VarL.f(vl.d);
        p6VarL.j(1.0f);
        p6VarL.k(1);
        b0 = p6VarL;
    }

    public tg0(ql0 ql0Var) {
        super(ql0Var);
        nv1 nv1Var = new nv1();
        nv1Var.h = 0;
        this.Z = nv1Var;
        nv1Var.l = this;
        this.a0 = ql0Var.l != null ? new sg0(this) : null;
    }

    @Override // defpackage.pu0
    public final int O(int i) {
        xg0 xg0VarT = this.w.t();
        uu0 uu0VarV = xg0VarT.v();
        ql0 ql0Var = (ql0) xg0VarT.f;
        return uu0VarV.j(ql0Var.I.d, ql0Var.m(), i);
    }

    @Override // defpackage.c01
    public final void R0() {
        if (this.a0 == null) {
            this.a0 = new sg0(this);
        }
    }

    @Override // defpackage.pu0
    public final int U(int i) {
        xg0 xg0VarT = this.w.t();
        uu0 uu0VarV = xg0VarT.v();
        ql0 ql0Var = (ql0) xg0VarT.f;
        return uu0VarV.d(ql0Var.I.d, ql0Var.m(), i);
    }

    @Override // defpackage.c01
    public final ys0 U0() {
        return this.a0;
    }

    @Override // defpackage.c01
    public final sv0 W0() {
        return this.Z;
    }

    @Override // defpackage.pu0
    public final int a0(int i) {
        xg0 xg0VarT = this.w.t();
        uu0 uu0VarV = xg0VarT.v();
        ql0 ql0Var = (ql0) xg0VarT.f;
        return uu0VarV.h(ql0Var.I.d, ql0Var.m(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.c01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(a01 a01Var, long j, td0 td0Var, int i, boolean z) {
        int i2;
        boolean z2;
        ql0 ql0Var = this.w;
        boolean z3 = false;
        if (a01Var.h(ql0Var)) {
            if (x1(j)) {
                i2 = i;
                z2 = z;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(O0(j, V0())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
            }
            z3 = true;
            if (z3) {
                return;
            }
            int i3 = td0Var.g;
            iy0 iy0VarX = ql0Var.x();
            Object[] objArr = iy0VarX.e;
            int i4 = iy0VarX.g - 1;
            while (i4 >= 0) {
                ql0 ql0Var2 = (ql0) objArr[i4];
                if (ql0Var2.K()) {
                    a01Var.d(ql0Var2, j, td0Var, i2, z2);
                    long jA = td0Var.a();
                    if (el.B(jA) < 0.0f && el.G(jA) && !el.F(jA) && !a01Var.f(td0Var, ql0Var2)) {
                        break;
                    }
                }
                i4--;
                i2 = i;
            }
            td0Var.g = i3;
            return;
        }
        i2 = i;
        z2 = z;
        if (z3) {
        }
    }

    @Override // defpackage.pu0
    public final z61 e(long j) {
        o0(j);
        ql0 ql0Var = this.w;
        iy0 iy0VarY = ql0Var.y();
        Object[] objArr = iy0VarY.e;
        int i = iy0VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((ql0) objArr[i2]).J.p.p = ol0.g;
        }
        p1(ql0Var.z.g(this, ql0Var.m(), j));
        g1();
        return this;
    }

    @Override // defpackage.pu0
    public final int f(int i) {
        xg0 xg0VarT = this.w.t();
        uu0 uu0VarV = xg0VarT.v();
        ql0 ql0Var = (ql0) xg0VarT.f;
        return uu0VarV.b(ql0Var.I.d, ql0Var.m(), i);
    }

    @Override // defpackage.z61
    public final void k0(long j, float f, sa0 sa0Var) {
        m1(j, f, sa0Var);
        if (this.r) {
            return;
        }
        this.w.J.p.z0();
    }

    @Override // defpackage.c01
    public final void l1(cj cjVar, nc0 nc0Var) {
        ql0 ql0Var = this.w;
        w31 w31VarA = tl0.a(ql0Var);
        iy0 iy0VarX = ql0Var.x();
        Object[] objArr = iy0VarX.e;
        int i = iy0VarX.g;
        for (int i2 = 0; i2 < i; i2++) {
            ql0 ql0Var2 = (ql0) objArr[i2];
            if (ql0Var2.K()) {
                ql0Var2.i(cjVar, nc0Var);
            }
        }
        if (((h4) w31VarA).getShowLayoutBounds()) {
            long j = this.g;
            cjVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, b0);
        }
    }

    @Override // defpackage.ws0
    public final int r0(c3 c3Var) {
        sg0 sg0Var = this.a0;
        if (sg0Var != null) {
            return sg0Var.r0(c3Var);
        }
        tu0 tu0Var = this.w.J.p;
        rl0 rl0Var = tu0Var.B;
        if (!tu0Var.q) {
            if (tu0Var.j.d == ml0.e) {
                rl0Var.f = true;
                if (rl0Var.b) {
                    tu0Var.z = true;
                    tu0Var.A = true;
                }
            } else {
                rl0Var.g = true;
            }
        }
        tg0 tg0VarN = tu0Var.n();
        boolean z = tg0VarN.s;
        tg0VarN.s = true;
        tu0Var.p();
        tg0VarN.s = z;
        Integer num = (Integer) rl0Var.i.get(c3Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
