package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k60 extends sv0 implements il0 {
    public jy s;
    public float t;

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        int iJ;
        int iH;
        int iG;
        int i;
        if (!kr.d(j) || this.s == jy.e) {
            iJ = kr.j(j);
            iH = kr.h(j);
        } else {
            int iRound = Math.round(kr.h(j) * this.t);
            int iJ2 = kr.j(j);
            iJ = kr.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!kr.c(j) || this.s == jy.f) {
            int i2 = kr.i(j);
            int iG2 = kr.g(j);
            iG = i2;
            i = iG2;
        } else {
            int iRound2 = Math.round(kr.g(j) * this.t);
            int i3 = kr.i(j);
            iG = kr.g(j);
            if (iRound2 < i3) {
                iRound2 = i3;
            }
            if (iRound2 <= iG) {
                iG = iRound2;
            }
            i = iG;
        }
        z61 z61VarE = pu0Var.e(lr.a(iJ, iH, iG, i));
        return xu0Var.f0(z61VarE.e, z61VarE.f, g40.e, new pd(z61VarE, 1));
    }
}
