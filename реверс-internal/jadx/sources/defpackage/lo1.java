package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class lo1 extends sv0 implements il0 {
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;

    @Override // defpackage.il0
    public final int D(ws0 ws0Var, pu0 pu0Var, int i) {
        long jL0 = L0(ws0Var);
        if (kr.e(jL0)) {
            return kr.g(jL0);
        }
        if (!this.w) {
            i = lr.g(i, jL0);
        }
        return lr.f(pu0Var.a0(i), jL0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long L0(xu0 xu0Var) {
        int iN;
        int iN2;
        int iN3;
        int i = 0;
        if (Float.isNaN(this.u)) {
            iN = Integer.MAX_VALUE;
        } else {
            iN = xu0Var.N(this.u);
            if (iN < 0) {
                iN = 0;
            }
        }
        if (Float.isNaN(this.v)) {
            iN2 = Integer.MAX_VALUE;
        } else {
            iN2 = xu0Var.N(this.v);
            if (iN2 < 0) {
                iN2 = 0;
            }
        }
        if (Float.isNaN(this.s)) {
            iN3 = 0;
        } else {
            iN3 = xu0Var.N(this.s);
            if (iN3 < 0) {
                iN3 = 0;
            }
            if (iN3 > iN) {
                iN3 = iN;
            }
            if (iN3 == Integer.MAX_VALUE) {
            }
        }
        if (!Float.isNaN(this.t)) {
            int iN4 = xu0Var.N(this.t);
            if (iN4 < 0) {
                iN4 = 0;
            }
            if (iN4 > iN2) {
                iN4 = iN2;
            }
            if (iN4 != Integer.MAX_VALUE) {
                i = iN4;
            }
        }
        return lr.a(iN3, iN, i, iN2);
    }

    @Override // defpackage.il0
    public final int O(ws0 ws0Var, pu0 pu0Var, int i) {
        long jL0 = L0(ws0Var);
        if (kr.f(jL0)) {
            return kr.h(jL0);
        }
        if (!this.w) {
            i = lr.f(i, jL0);
        }
        return lr.g(pu0Var.O(i), jL0);
    }

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jL0 = L0(xu0Var);
        if (this.w) {
            jA = lr.e(j, jL0);
        } else {
            if (Float.isNaN(this.s)) {
                iJ = kr.j(j);
                int iH2 = kr.h(jL0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = kr.j(jL0);
            }
            if (Float.isNaN(this.u)) {
                iH = kr.h(j);
                int iJ2 = kr.j(jL0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = kr.h(jL0);
            }
            if (Float.isNaN(this.t)) {
                i = kr.i(j);
                int iG2 = kr.g(jL0);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = kr.i(jL0);
            }
            if (Float.isNaN(this.v)) {
                iG = kr.g(j);
                int i2 = kr.i(jL0);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = kr.g(jL0);
            }
            jA = lr.a(iJ, iH, i, iG);
        }
        z61 z61VarE = pu0Var.e(jA);
        return xu0Var.f0(z61VarE.e, z61VarE.f, g40.e, new pd(z61VarE, 5));
    }

    @Override // defpackage.il0
    public final int f(ws0 ws0Var, pu0 pu0Var, int i) {
        long jL0 = L0(ws0Var);
        if (kr.f(jL0)) {
            return kr.h(jL0);
        }
        if (!this.w) {
            i = lr.f(i, jL0);
        }
        return lr.g(pu0Var.U(i), jL0);
    }

    @Override // defpackage.il0
    public final int n(ws0 ws0Var, pu0 pu0Var, int i) {
        long jL0 = L0(ws0Var);
        if (kr.e(jL0)) {
            return kr.g(jL0);
        }
        if (!this.w) {
            i = lr.g(i, jL0);
        }
        return lr.f(pu0Var.f(i), jL0);
    }
}
