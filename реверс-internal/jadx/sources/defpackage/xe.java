package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xe extends sv0 implements il0, o10, pl1, p81, vv0, w41, xk0, cc0, b80, q80, x31, wh {
    public rv0 s;

    @Override // defpackage.il0
    public final int D(ws0 ws0Var, pu0 pu0Var, int i) {
        rv0 rv0Var = this.s;
        rv0Var.getClass();
        return ((gl0) rv0Var).e(new dj0(ws0Var, ws0Var.getLayoutDirection()), new ew(pu0Var, bv0.e, cv0.f, 1), lr.b(0, i, 0, 0, 13)).d();
    }

    @Override // defpackage.sv0
    public final void D0() {
        L0(true);
    }

    @Override // defpackage.sv0
    public final void E0() {
        if (!this.r) {
            ng0.b("unInitializeModifier called on unattached node");
        }
        if ((this.g & 8) != 0) {
            ((h4) bl.Q(this)).w();
        }
    }

    @Override // defpackage.p81
    public final void I(e81 e81Var, f81 f81Var, long j) {
        this.s.getClass();
        throw new ClassCastException();
    }

    public final void L0(boolean z) {
        if (!this.r) {
            ng0.b("initializeModifier called on unattached node");
        }
        rv0 rv0Var = this.s;
        if ((this.g & 4) != 0 && !z) {
            el.C(this);
        }
        if ((this.g & 2) != 0) {
            nv1 nv1Var = bl.P(this).I.e;
            nv1Var.getClass();
            if (nv1Var.s) {
                c01 c01Var = this.l;
                c01Var.getClass();
                ((kl0) c01Var).y1(this);
                v31 v31Var = c01Var.T;
                if (v31Var != null) {
                    ((qc0) v31Var).c();
                }
            }
            if (!z) {
                el.C(this);
                bl.P(this).G();
            }
        }
        if (rv0Var instanceof sn0) {
            ((sn0) rv0Var).a.k = bl.P(this);
        }
        if ((this.g & 8) != 0) {
            ((h4) bl.Q(this)).w();
        }
    }

    @Override // defpackage.o10
    public final void M(sl0 sl0Var) {
        rv0 rv0Var = this.s;
        rv0Var.getClass();
        sl0Var.a();
    }

    @Override // defpackage.il0
    public final int O(ws0 ws0Var, pu0 pu0Var, int i) {
        rv0 rv0Var = this.s;
        rv0Var.getClass();
        return ((gl0) rv0Var).e(new dj0(ws0Var, ws0Var.getLayoutDirection()), new ew(pu0Var, bv0.e, cv0.e, 1), lr.b(0, 0, 0, i, 7)).g();
    }

    @Override // defpackage.b80
    public final void R(v80 v80Var) {
        rv0 rv0Var = this.s;
        ng0.b("onFocusEvent called on wrong node");
        rv0Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.p81
    public final boolean U() {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.wh
    public final hx b() {
        return bl.P(this).B;
    }

    @Override // defpackage.wh
    public final long d() {
        return xk.P(bl.N(this, 128).g);
    }

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        rv0 rv0Var = this.s;
        rv0Var.getClass();
        return ((gl0) rv0Var).e(xu0Var, pu0Var, j);
    }

    @Override // defpackage.il0
    public final int f(ws0 ws0Var, pu0 pu0Var, int i) {
        rv0 rv0Var = this.s;
        rv0Var.getClass();
        return ((gl0) rv0Var).e(new dj0(ws0Var, ws0Var.getLayoutDirection()), new ew(pu0Var, bv0.f, cv0.e, 1), lr.b(0, 0, 0, i, 7)).g();
    }

    @Override // defpackage.pl1
    public final void g0(am1 am1Var) {
        rv0 rv0Var = this.s;
        rv0Var.getClass();
        uc ucVar = (uc) rv0Var;
        nl1 nl1Var = new nl1();
        nl1Var.g = ucVar.a;
        ucVar.b.i(nl1Var);
        am1Var.getClass();
        nl1 nl1Var2 = (nl1) am1Var;
        zx0 zx0Var = nl1Var2.e;
        if (nl1Var.g) {
            nl1Var2.g = true;
        }
        if (nl1Var.h) {
            nl1Var2.h = true;
        }
        zx0 zx0Var2 = nl1Var.e;
        Object[] objArr = zx0Var2.b;
        Object[] objArr2 = zx0Var2.c;
        long[] jArr = zx0Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        zl1 zl1Var = (zl1) obj;
                        if (!zx0Var.b(zl1Var)) {
                            zx0Var.m(zl1Var, obj2);
                        } else if (obj2 instanceof r0) {
                            Object objG = zx0Var.g(zl1Var);
                            objG.getClass();
                            r0 r0Var = (r0) objG;
                            String str = r0Var.a;
                            if (str == null) {
                                str = ((r0) obj2).a;
                            }
                            eb0 eb0Var = r0Var.b;
                            if (eb0Var == null) {
                                eb0Var = ((r0) obj2).b;
                            }
                            zx0Var.m(zl1Var, new r0(str, eb0Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.wh
    public final al0 getLayoutDirection() {
        return bl.P(this).C;
    }

    @Override // defpackage.p81
    public final void h0() {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.vv0
    public final v20 i() {
        return v20.I;
    }

    @Override // defpackage.il0
    public final int n(ws0 ws0Var, pu0 pu0Var, int i) {
        rv0 rv0Var = this.s;
        rv0Var.getClass();
        return ((gl0) rv0Var).e(new dj0(ws0Var, ws0Var.getLayoutDirection()), new ew(pu0Var, bv0.f, cv0.f, 1), lr.b(0, i, 0, 0, 13)).d();
    }

    @Override // defpackage.w41
    public final Object n0(Object obj) {
        rv0 rv0Var = this.s;
        rv0Var.getClass();
        return (w9) rv0Var;
    }

    @Override // defpackage.o10
    public final void o0() {
        al.C(this);
    }

    @Override // defpackage.p81
    public final boolean q0() {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.cc0
    public final void t(c01 c01Var) {
        this.s.getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        return this.s.toString();
    }

    @Override // defpackage.x31
    public final boolean z() {
        return this.r;
    }

    @Override // defpackage.xw, defpackage.p81
    public final void a() {
    }

    @Override // defpackage.xk0, defpackage.av0
    public final void c(long j) {
    }

    @Override // defpackage.xk0
    public final void o(zk0 zk0Var) {
    }
}
