package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sl0 implements p10 {
    public final ej e = new ej();
    public o10 f;

    @Override // defpackage.p10
    public final void A(w6 w6Var, lh lhVar, float f, q10 q10Var, wl wlVar, int i) {
        this.e.A(w6Var, lhVar, f, q10Var, wlVar, i);
    }

    @Override // defpackage.p10
    public final oc E() {
        return this.e.f;
    }

    @Override // defpackage.p10
    public final void H(nc0 nc0Var, long j, sa0 sa0Var) {
        nc0Var.e(this, getLayoutDirection(), j, new o9(this, this.f, sa0Var, 3));
    }

    @Override // defpackage.hx
    public final float J(long j) {
        return this.e.J(j);
    }

    @Override // defpackage.p10
    public final void L(long j, long j2, long j3, int i) {
        this.e.L(j, j2, j3, i);
    }

    @Override // defpackage.hx
    public final int N(float f) {
        return this.e.N(f);
    }

    @Override // defpackage.p10
    public final void Q(f6 f6Var, long j, long j2, long j3, float f, wl wlVar, int i) {
        this.e.Q(f6Var, j, j2, j3, f, wlVar, i);
    }

    @Override // defpackage.p10
    public final long S() {
        return this.e.S();
    }

    @Override // defpackage.p10
    public final void T(w6 w6Var, long j, q10 q10Var) {
        this.e.T(w6Var, j, q10Var);
    }

    @Override // defpackage.p10
    public final void W(lh lhVar, long j, long j2, long j3, float f, q10 q10Var, wl wlVar, int i) {
        this.e.W(lhVar, j, j2, j3, f, q10Var, wlVar, i);
    }

    @Override // defpackage.hx
    public final long X(long j) {
        return this.e.X(j);
    }

    public final void a() {
        ej ejVar = this.e;
        cj cjVarI = ejVar.f.i();
        xw xwVar = this.f;
        if (xwVar == null) {
            throw s91.g("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        sv0 sv0Var = (sv0) xwVar;
        sv0 sv0VarK = sv0Var.e.j;
        if (sv0VarK == null || (sv0VarK.h & 4) == 0) {
            sv0VarK = null;
        } else {
            while (sv0VarK != null) {
                int i = sv0VarK.g;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    sv0VarK = sv0VarK.j;
                }
            }
            sv0VarK = null;
        }
        if (sv0VarK == null) {
            c01 c01VarN = bl.N(xwVar, 4);
            if (c01VarN.W0() == sv0Var.e) {
                c01VarN = c01VarN.x;
                c01VarN.getClass();
            }
            c01VarN.l1(cjVarI, (nc0) ejVar.f.b);
            return;
        }
        iy0 iy0Var = null;
        while (sv0VarK != null) {
            if (sv0VarK instanceof o10) {
                o10 o10Var = (o10) sv0VarK;
                nc0 nc0Var = (nc0) ejVar.f.b;
                c01 c01VarN2 = bl.N(o10Var, 4);
                long jP = xk.P(c01VarN2.g);
                ql0 ql0Var = c01VarN2.w;
                ql0Var.getClass();
                ((h4) tl0.a(ql0Var)).getSharedDrawScope().c(cjVarI, jP, c01VarN2, o10Var, nc0Var);
            } else if ((sv0VarK.g & 4) != 0 && (sv0VarK instanceof yw)) {
                int i2 = 0;
                for (sv0 sv0Var2 = ((yw) sv0VarK).t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
                    if ((sv0Var2.g & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            sv0VarK = sv0Var2;
                        } else {
                            if (iy0Var == null) {
                                iy0Var = new iy0(new sv0[16]);
                            }
                            if (sv0VarK != null) {
                                iy0Var.b(sv0VarK);
                                sv0VarK = null;
                            }
                            iy0Var.b(sv0Var2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            sv0VarK = bl.k(iy0Var);
        }
    }

    @Override // defpackage.hx
    public final float b() {
        return this.e.b();
    }

    public final void c(cj cjVar, long j, c01 c01Var, o10 o10Var, nc0 nc0Var) {
        o10 o10Var2 = this.f;
        this.f = o10Var;
        al0 al0Var = c01Var.w.C;
        ej ejVar = this.e;
        hx hxVarK = ejVar.f.k();
        oc ocVar = ejVar.f;
        al0 al0VarO = ocVar.o();
        cj cjVarI = ocVar.i();
        long jQ = ocVar.q();
        nc0 nc0Var2 = (nc0) ocVar.b;
        ocVar.z(c01Var);
        ocVar.A(al0Var);
        ocVar.y(cjVar);
        ocVar.B(j);
        ocVar.b = nc0Var;
        cjVar.l();
        try {
            o10Var.M(this);
            cjVar.i();
            ocVar.z(hxVarK);
            ocVar.A(al0VarO);
            ocVar.y(cjVarI);
            ocVar.B(jQ);
            ocVar.b = nc0Var2;
            this.f = o10Var2;
        } catch (Throwable th) {
            cjVar.i();
            ocVar.z(hxVarK);
            ocVar.A(al0VarO);
            ocVar.y(cjVarI);
            ocVar.B(jQ);
            ocVar.b = nc0Var2;
            throw th;
        }
    }

    @Override // defpackage.p10
    public final long d() {
        return this.e.d();
    }

    @Override // defpackage.hx
    public final float d0(long j) {
        return this.e.d0(j);
    }

    @Override // defpackage.p10
    public final al0 getLayoutDirection() {
        return this.e.e.b;
    }

    @Override // defpackage.hx
    public final float l() {
        return this.e.l();
    }

    @Override // defpackage.hx
    public final long m0(float f) {
        return this.e.m0(f);
    }

    @Override // defpackage.p10
    public final void p0(lh lhVar, long j, long j2, float f, q10 q10Var, wl wlVar, int i) {
        this.e.p0(lhVar, j, j2, f, q10Var, wlVar, i);
    }

    @Override // defpackage.p10
    public final void q(float f, long j, long j2) {
        this.e.q(f, j, j2);
    }

    @Override // defpackage.hx
    public final float s0(int i) {
        return this.e.s0(i);
    }

    @Override // defpackage.hx
    public final long v(float f) {
        return this.e.v(f);
    }

    @Override // defpackage.hx
    public final float v0(float f) {
        return f / this.e.b();
    }

    @Override // defpackage.hx
    public final long w(long j) {
        return this.e.w(j);
    }

    @Override // defpackage.p10
    public final void w0(long j, float f, float f2, long j2, long j3, q10 q10Var) {
        this.e.w0(j, f, f2, j2, j3, q10Var);
    }

    @Override // defpackage.hx
    public final float y(float f) {
        return this.e.b() * f;
    }
}
