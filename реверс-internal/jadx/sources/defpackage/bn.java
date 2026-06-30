package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bn implements uu0, qg1 {
    public final dd a;
    public final sf b;

    public bn(dd ddVar, sf sfVar) {
        this.a = ddVar;
        this.b = sfVar;
    }

    @Override // defpackage.qg1
    public final vu0 a(final z61[] z61VarArr, final xu0 xu0Var, final int[] iArr, int i, final int i2) {
        return xu0Var.f0(i2, i, g40.e, new sa0() { // from class: an
            @Override // defpackage.sa0
            public final Object i(Object obj) {
                y61 y61Var = (y61) obj;
                z61[] z61VarArr2 = z61VarArr;
                int length = z61VarArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    z61 z61Var = z61VarArr2[i3];
                    z61Var.getClass();
                    z61Var.i();
                    y61Var.g(z61Var, this.b.a(z61Var.e, i2, xu0Var.getLayoutDirection()), iArr[i4], 0.0f);
                    i3++;
                    i4++;
                }
                return t32.a;
            }
        });
    }

    @Override // defpackage.uu0
    public final int b(pi0 pi0Var, List list, int i) {
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
            int iF = pu0Var.f(i);
            if (fM == 0.0f) {
                i2 += iF;
            } else if (fM > 0.0f) {
                f += fM;
                iMax = Math.max(iMax, Math.round(iF / fM));
            }
        }
        return ((list.size() - 1) * iN) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.qg1
    public final void c(int i, xu0 xu0Var, int[] iArr, int[] iArr2) {
        this.a.e(i, xu0Var, iArr, iArr2);
    }

    @Override // defpackage.uu0
    public final int d(pi0 pi0Var, List list, int i) {
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
                int iMin2 = Math.min(pu0Var.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pu0Var.U(iMin2));
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
                iMax = Math.max(iMax, pu0Var2.U(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.qg1
    public final long e(int i, int i2, int i3, boolean z) {
        return !z ? lr.a(0, i3, i, i2) : bl.w(0, i3, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        return this.a.equals(bnVar.a) && this.b.equals(bnVar.b);
    }

    @Override // defpackage.qg1
    public final int f(z61 z61Var) {
        return z61Var.e;
    }

    @Override // defpackage.uu0
    public final vu0 g(xu0 xu0Var, List list, long j) {
        return qc1.t(this, kr.i(j), kr.j(j), kr.g(j), kr.h(j), xu0Var.N(this.a.a()), xu0Var, list, new z61[list.size()], list.size());
    }

    @Override // defpackage.uu0
    public final int h(pi0 pi0Var, List list, int i) {
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
            int iA0 = pu0Var.a0(i);
            if (fM == 0.0f) {
                i2 += iA0;
            } else if (fM > 0.0f) {
                f += fM;
                iMax = Math.max(iMax, Math.round(iA0 / fM));
            }
        }
        return ((list.size() - 1) * iN) + Math.round(iMax * f) + i2;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.qg1
    public final int i(z61 z61Var) {
        return z61Var.f;
    }

    @Override // defpackage.uu0
    public final int j(pi0 pi0Var, List list, int i) {
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
                int iMin2 = Math.min(pu0Var.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pu0Var.O(iMin2));
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
                iMax = Math.max(iMax, pu0Var2.O(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ")";
    }
}
