package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h42 extends sv0 implements il0 {
    public float s;
    public float t;

    @Override // defpackage.il0
    public final int D(ws0 ws0Var, pu0 pu0Var, int i) {
        int iA0 = pu0Var.a0(i);
        int iN = !Float.isNaN(this.t) ? ws0Var.N(this.t) : 0;
        return iA0 < iN ? iN : iA0;
    }

    @Override // defpackage.il0
    public final int O(ws0 ws0Var, pu0 pu0Var, int i) {
        int iO = pu0Var.O(i);
        int iN = !Float.isNaN(this.s) ? ws0Var.N(this.s) : 0;
        return iO < iN ? iN : iO;
    }

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        int iJ;
        int i;
        if (Float.isNaN(this.s) || kr.j(j) != 0) {
            iJ = kr.j(j);
        } else {
            int iN = xu0Var.N(this.s);
            iJ = kr.h(j);
            if (iN < 0) {
                iN = 0;
            }
            if (iN <= iJ) {
                iJ = iN;
            }
        }
        int iH = kr.h(j);
        if (Float.isNaN(this.t) || kr.i(j) != 0) {
            i = kr.i(j);
        } else {
            int iN2 = xu0Var.N(this.t);
            i = kr.g(j);
            int i2 = iN2 >= 0 ? iN2 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        z61 z61VarE = pu0Var.e(lr.a(iJ, iH, i, kr.g(j)));
        return xu0Var.f0(z61VarE.e, z61VarE.f, g40.e, new pd(z61VarE, 10));
    }

    @Override // defpackage.il0
    public final int f(ws0 ws0Var, pu0 pu0Var, int i) {
        int iU = pu0Var.U(i);
        int iN = !Float.isNaN(this.s) ? ws0Var.N(this.s) : 0;
        return iU < iN ? iN : iU;
    }

    @Override // defpackage.il0
    public final int n(ws0 ws0Var, pu0 pu0Var, int i) {
        int iF = pu0Var.f(i);
        int iN = !Float.isNaN(this.t) ? ws0Var.N(this.t) : 0;
        return iF < iN ? iN : iF;
    }
}
