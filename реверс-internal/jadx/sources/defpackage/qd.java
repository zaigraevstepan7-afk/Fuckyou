package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qd extends sv0 implements il0 {
    public float s;
    public boolean t;

    @Override // defpackage.il0
    public final int D(ws0 ws0Var, pu0 pu0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.s) : pu0Var.a0(i);
    }

    public final long L0(long j, boolean z) {
        int iRound;
        int iG = kr.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.s)) <= 0) {
            return 0L;
        }
        if (!z || wi0.A(iRound, iG, j)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long M0(long j, boolean z) {
        int iRound;
        int iH = kr.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.s)) <= 0) {
            return 0L;
        }
        if (!z || wi0.A(iH, iRound, j)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long N0(long j, boolean z) {
        int i = kr.i(j);
        int iRound = Math.round(i * this.s);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || wi0.A(iRound, i, j)) {
            return (((long) iRound) << 32) | (((long) i) & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.il0
    public final int O(ws0 ws0Var, pu0 pu0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.s) : pu0Var.O(i);
    }

    public final long O0(long j, boolean z) {
        int iJ = kr.j(j);
        int iRound = Math.round(iJ / this.s);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || wi0.A(iJ, iRound, j)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    @Override // defpackage.il0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        long jL0;
        if (this.t) {
            jL0 = L0(j, true);
            if (vh0.a(jL0, 0L)) {
                jL0 = M0(j, true);
                if (vh0.a(jL0, 0L)) {
                    jL0 = N0(j, true);
                    if (vh0.a(jL0, 0L)) {
                        jL0 = O0(j, true);
                        if (vh0.a(jL0, 0L)) {
                            jL0 = L0(j, false);
                            if (vh0.a(jL0, 0L)) {
                                jL0 = M0(j, false);
                                if (vh0.a(jL0, 0L)) {
                                    jL0 = N0(j, false);
                                    if (vh0.a(jL0, 0L)) {
                                        jL0 = O0(j, false);
                                        if (vh0.a(jL0, 0L)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jL0 = M0(j, true);
            if (vh0.a(jL0, 0L)) {
                jL0 = L0(j, true);
                if (vh0.a(jL0, 0L)) {
                    jL0 = O0(j, true);
                    if (vh0.a(jL0, 0L)) {
                        jL0 = N0(j, true);
                        if (vh0.a(jL0, 0L)) {
                            jL0 = M0(j, false);
                            if (vh0.a(jL0, 0L)) {
                                jL0 = L0(j, false);
                                if (vh0.a(jL0, 0L)) {
                                    jL0 = O0(j, false);
                                    if (vh0.a(jL0, 0L)) {
                                        jL0 = N0(j, false);
                                        if (vh0.a(jL0, 0L)) {
                                            jL0 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!vh0.a(jL0, 0L)) {
            int i = (int) (jL0 >> 32);
            int i2 = (int) (4294967295L & jL0);
            if (!((i >= 0) & (i2 >= 0))) {
                pg0.a("width and height must be >= 0");
            }
            j = lr.h(i, i, i2, i2);
        }
        z61 z61VarE = pu0Var.e(j);
        return xu0Var.f0(z61VarE.e, z61VarE.f, g40.e, new pd(z61VarE, 0));
    }

    @Override // defpackage.il0
    public final int f(ws0 ws0Var, pu0 pu0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.s) : pu0Var.U(i);
    }

    @Override // defpackage.il0
    public final int n(ws0 ws0Var, pu0 pu0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.s) : pu0Var.f(i);
    }
}
