package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class tg1 implements uu0, qg1 {
    public final bd a;
    public final a3 b;

    public tg1(bd bdVar, a3 a3Var) {
        this.a = bdVar;
        this.b = a3Var;
    }

    @Override // defpackage.qg1
    public final vu0 a(z61[] z61VarArr, xu0 xu0Var, int[] iArr, int i, int i2) {
        return xu0Var.f0(i, i2, g40.e, new ox(z61VarArr, this, i2, iArr));
    }

    @Override // defpackage.uu0
    public final int b(pi0 pi0Var, List list, int i) {
        int iN = pi0Var.N(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iN, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            pu0 pu0Var = (pu0) list.get(i2);
            float fM = ef1.m(ef1.k(pu0Var));
            if (fM == 0.0f) {
                int iMin2 = Math.min(pu0Var.U(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pu0Var.f(iMin2));
            } else if (fM > 0.0f) {
                f += fM;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            pu0 pu0Var2 = (pu0) list.get(i3);
            float fM2 = ef1.m(ef1.k(pu0Var2));
            if (fM2 > 0.0f) {
                iMax = Math.max(iMax, pu0Var2.f(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.qg1
    public final void c(int i, xu0 xu0Var, int[] iArr, int[] iArr2) {
        this.a.b(xu0Var, i, iArr, xu0Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.uu0
    public final int d(pi0 pi0Var, List list, int i) {
        int iN = pi0Var.N(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            pu0 pu0Var = (pu0) list.get(i3);
            float fM = ef1.m(ef1.k(pu0Var));
            int iU = pu0Var.U(i);
            if (fM == 0.0f) {
                i2 += iU;
            } else if (fM > 0.0f) {
                f += fM;
                iMax = Math.max(iMax, Math.round(iU / fM));
            }
        }
        return ((list.size() - 1) * iN) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.qg1
    public final long e(int i, int i2, int i3, boolean z) {
        return !z ? lr.a(i, i2, 0, i3) : bl.x(i, i2, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg1)) {
            return false;
        }
        tg1 tg1Var = (tg1) obj;
        return this.a.equals(tg1Var.a) && xi0.o(this.b, tg1Var.b);
    }

    @Override // defpackage.qg1
    public final int f(z61 z61Var) {
        return z61Var.f;
    }

    @Override // defpackage.uu0
    public final vu0 g(xu0 xu0Var, List list, long j) {
        return qc1.t(this, kr.j(j), kr.i(j), kr.h(j), kr.g(j), xu0Var.N(this.a.a()), xu0Var, list, new z61[list.size()], list.size());
    }

    @Override // defpackage.uu0
    public final int h(pi0 pi0Var, List list, int i) {
        int iN = pi0Var.N(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iN, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            pu0 pu0Var = (pu0) list.get(i2);
            float fM = ef1.m(ef1.k(pu0Var));
            if (fM == 0.0f) {
                int iMin2 = Math.min(pu0Var.U(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pu0Var.a0(iMin2));
            } else if (fM > 0.0f) {
                f += fM;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            pu0 pu0Var2 = (pu0) list.get(i3);
            float fM2 = ef1.m(ef1.k(pu0Var2));
            if (fM2 > 0.0f) {
                iMax = Math.max(iMax, pu0Var2.a0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.qg1
    public final int i(z61 z61Var) {
        return z61Var.e;
    }

    @Override // defpackage.uu0
    public final int j(pi0 pi0Var, List list, int i) {
        int iN = pi0Var.N(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            pu0 pu0Var = (pu0) list.get(i3);
            float fM = ef1.m(ef1.k(pu0Var));
            int iO = pu0Var.O(i);
            if (fM == 0.0f) {
                i2 += iO;
            } else if (fM > 0.0f) {
                f += fM;
                iMax = Math.max(iMax, Math.round(iO / fM));
            }
        }
        return ((list.size() - 1) * iN) + Math.round(iMax * f) + i2;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ")";
    }
}
