package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fa implements uu0 {
    public final ra a;
    public boolean b;

    public fa(ra raVar) {
        this.a = raVar;
    }

    @Override // defpackage.uu0
    public final int b(pi0 pi0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iF = ((pu0) list.get(0)).f(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iF2 = ((pu0) list.get(i2)).f(i);
                if (iF2 > iF) {
                    iF = iF2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iF;
    }

    @Override // defpackage.uu0
    public final int d(pi0 pi0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iU = ((pu0) list.get(0)).U(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iU2 = ((pu0) list.get(i2)).U(i);
                if (iU2 > iU) {
                    iU = iU2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iU;
    }

    @Override // defpackage.uu0
    public final vu0 g(xu0 xu0Var, List list, long j) {
        v41 v41Var = this.a.a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            z61 z61VarE = ((pu0) list.get(i)).e(j);
            iMax = Math.max(iMax, z61VarE.e);
            iMax2 = Math.max(iMax2, z61VarE.f);
            arrayList.add(z61VarE);
        }
        if (xu0Var.s()) {
            this.b = true;
            v41Var.setValue(new vh0((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            v41Var.setValue(new vh0((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return xu0Var.f0(iMax, iMax2, g40.e, new m5(2, arrayList));
    }

    @Override // defpackage.uu0
    public final int h(pi0 pi0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA0 = ((pu0) list.get(0)).a0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iA02 = ((pu0) list.get(i2)).a0(i);
                if (iA02 > iA0) {
                    iA0 = iA02;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iA0;
    }

    @Override // defpackage.uu0
    public final int j(pi0 pi0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iO = ((pu0) list.get(0)).O(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iO2 = ((pu0) list.get(i2)).O(i);
                if (iO2 > iO) {
                    iO = iO2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iO;
    }
}
