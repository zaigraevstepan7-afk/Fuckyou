package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mz0 extends sv0 implements i22 {
    public final qj1 s;
    public final vu t;
    public mz0 u;
    public final String v = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public mz0(qj1 qj1Var, vu vuVar) {
        this.s = qj1Var;
        this.t = vuVar;
    }

    @Override // defpackage.sv0
    public final void D0() {
        vu vuVar = this.t;
        vuVar.e = this;
        vuVar.f = null;
        this.u = null;
        vuVar.g = new a7(11, this);
        vuVar.h = z0();
    }

    @Override // defpackage.sv0
    public final void E0() {
        zc1 zc1Var = new zc1();
        pd1.u(this, new z3(2, zc1Var));
        mz0 mz0Var = (mz0) ((i22) zc1Var.e);
        this.u = mz0Var;
        vu vuVar = this.t;
        vuVar.f = mz0Var;
        if (((mz0) vuVar.e) == this) {
            vuVar.e = null;
        }
    }

    public final vt L0() {
        mz0 mz0VarM0 = M0();
        vt vtVarL0 = mz0VarM0 != null ? mz0VarM0.L0() : null;
        if (vtVarL0 != null && bl.G(vtVarL0)) {
            return vtVarL0;
        }
        vt vtVar = (vt) this.t.h;
        if (vtVar != null) {
            return vtVar;
        }
        yc.l("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final mz0 M0() {
        xz0 xz0Var;
        i22 i22Var = null;
        if (!this.r) {
            return null;
        }
        if (!this.e.r) {
            ng0.b("visitAncestors called on an unattached node");
        }
        sv0 sv0Var = this.e.i;
        ql0 ql0VarP = bl.P(this);
        loop0: while (true) {
            if (ql0VarP == null) {
                break;
            }
            if ((ql0VarP.I.f.h & 262144) != 0) {
                while (sv0Var != null) {
                    if ((sv0Var.g & 262144) != 0) {
                        sv0 sv0VarK = sv0Var;
                        iy0 iy0Var = null;
                        while (sv0VarK != null) {
                            if (sv0VarK instanceof i22) {
                                i22 i22Var2 = (i22) sv0VarK;
                                if (xi0.o(this.v, i22Var2.p()) && mz0.class == i22Var2.getClass()) {
                                    i22Var = i22Var2;
                                    break loop0;
                                }
                            }
                            if ((sv0VarK.g & 262144) != 0 && (sv0VarK instanceof yw)) {
                                int i = 0;
                                for (sv0 sv0Var2 = ((yw) sv0VarK).t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
                                    if ((sv0Var2.g & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i == 1) {
                                }
                            }
                            sv0VarK = bl.k(iy0Var);
                        }
                    }
                    sv0Var = sv0Var.i;
                }
            }
            ql0VarP = ql0VarP.u();
            sv0Var = (ql0VarP == null || (xz0Var = ql0VarP.I) == null) ? null : xz0Var.e;
        }
        return (mz0) i22Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object N0(long j, long j2, ls lsVar) {
        kz0 kz0Var;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (lsVar instanceof kz0) {
            kz0Var = (kz0) lsVar;
            int i = kz0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                kz0Var.l = i - Integer.MIN_VALUE;
            } else {
                kz0Var = new kz0(this, lsVar);
            }
        }
        kz0 kz0Var2 = kz0Var;
        Object objA = kz0Var2.j;
        int i2 = kz0Var2.l;
        mz0 mz0VarM0 = null;
        wt wtVar = wt.e;
        if (i2 == 0) {
            xc.G(objA);
            kz0Var2.h = j;
            kz0Var2.i = j2;
            kz0Var2.l = 1;
            objA = this.s.a(j, j2, kz0Var2);
            if (objA != wtVar) {
                j3 = j;
                j4 = j2;
            }
            return wtVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = kz0Var2.h;
            xc.G(objA);
            j6 = ((o52) objA).a;
            j5 = j7;
            return new o52(o52.e(j5, j6));
        }
        j4 = kz0Var2.i;
        j3 = kz0Var2.h;
        xc.G(objA);
        j5 = ((o52) objA).a;
        boolean z = this.r;
        if (!z) {
            mz0VarM0 = this.u;
        } else if (z) {
            mz0VarM0 = M0();
        }
        if (mz0VarM0 == null) {
            j6 = 0;
            return new o52(o52.e(j5, j6));
        }
        long jE = o52.e(j3, j5);
        long jD = o52.d(j4, j5);
        kz0Var2.h = j5;
        kz0Var2.l = 2;
        objA = mz0VarM0.N0(jE, jD, kz0Var2);
        if (objA != wtVar) {
            j7 = j5;
            j6 = ((o52) objA).a;
            j5 = j7;
            return new o52(o52.e(j5, j6));
        }
        return wtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long O0(long j, long j2, int i) {
        long jI;
        qj1 qj1Var = this.s;
        if (qj1Var.b) {
            bk1 bk1Var = qj1Var.a;
            jI = bk1Var.a.b() ? 0L : bk1Var.i(bk1Var.e(bk1Var.a.e(bk1Var.e(bk1Var.h(j2)))));
        }
        mz0 mz0VarM0 = this.r ? M0() : null;
        return w01.e(jI, mz0VarM0 != null ? mz0VarM0.O0(w01.e(j, jI), w01.d(j2, jI), i) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r11 == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r11 != r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P0(long j, ks ksVar) {
        lz0 lz0Var;
        long j2;
        long j3;
        if (ksVar instanceof lz0) {
            lz0Var = (lz0) ksVar;
            int i = lz0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lz0Var.k = i - Integer.MIN_VALUE;
            } else {
                lz0Var = new lz0(this, (ls) ksVar);
            }
        }
        Object objP0 = lz0Var.i;
        int i2 = lz0Var.k;
        wt wtVar = wt.e;
        if (i2 == 0) {
            xc.G(objP0);
            mz0 mz0VarM0 = this.r ? M0() : null;
            if (mz0VarM0 != null) {
                lz0Var.h = j;
                lz0Var.k = 1;
                objP0 = mz0VarM0.P0(j, lz0Var);
            } else {
                j2 = j;
                j3 = 0;
                o52.d(j2, j3);
                lz0Var.h = j3;
                lz0Var.k = 2;
                objP0 = new o52(0L);
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = lz0Var.h;
                xc.G(objP0);
                return new o52(o52.e(j3, ((o52) objP0).a));
            }
            j = lz0Var.h;
            xc.G(objP0);
        }
        j2 = j;
        j3 = ((o52) objP0).a;
        o52.d(j2, j3);
        lz0Var.h = j3;
        lz0Var.k = 2;
        objP0 = new o52(0L);
    }

    public final long Q0(int i, long j) {
        mz0 mz0VarM0 = this.r ? M0() : null;
        long jQ0 = mz0VarM0 != null ? mz0VarM0.Q0(i, j) : 0L;
        w01.d(j, jQ0);
        return w01.e(jQ0, 0L);
    }

    @Override // defpackage.i22
    public final Object p() {
        return this.v;
    }
}
