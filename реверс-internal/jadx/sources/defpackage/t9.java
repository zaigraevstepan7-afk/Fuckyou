package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class t9 implements uu0 {
    public final ba a;

    public t9(ba baVar) {
        this.a = baVar;
    }

    @Override // defpackage.uu0
    public final int b(pi0 pi0Var, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((pu0) list.get(0)).f(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pu0) list.get(i2)).f(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.uu0
    public final int d(pi0 pi0Var, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((pu0) list.get(0)).U(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pu0) list.get(i2)).U(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.uu0
    public final vu0 g(xu0 xu0Var, List list, long j) {
        j41 j41Var;
        int size = list.size();
        z61[] z61VarArr = new z61[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            pu0 pu0Var = (pu0) list.get(i);
            Object objI = pu0Var.i();
            w9 w9Var = objI instanceof w9 ? (w9) objI : null;
            if (w9Var != null && ((Boolean) w9Var.a.getValue()).booleanValue()) {
                z61 z61VarE = pu0Var.e(j);
                long j3 = (((long) z61VarE.f) & 4294967295L) | (((long) z61VarE.e) << 32);
                z61VarArr[i] = z61VarE;
                j2 = j3;
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            pu0 pu0Var2 = (pu0) list.get(i2);
            if (z61VarArr[i2] == null) {
                z61VarArr[i2] = pu0Var2.e(j);
            }
        }
        if (xu0Var.s()) {
            j41Var = new j41(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                z61 z61Var = z61VarArr[i5];
                if (z61Var != null) {
                    Object objI2 = ((pu0) list.get(i5)).i();
                    w9 w9Var2 = objI2 instanceof w9 ? (w9) objI2 : null;
                    if (w9Var2 == null || !((Boolean) w9Var2.b.getValue()).booleanValue()) {
                        int i6 = z61Var.e;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = z61Var.f;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            j41Var = new j41(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) j41Var.e).intValue();
        int iIntValue2 = ((Number) j41Var.f).intValue();
        if (!xu0Var.s()) {
            this.a.b.setValue(new vh0((((long) iIntValue) << 32) | (((long) iIntValue2) & 4294967295L)));
        }
        return xu0Var.f0(iIntValue, iIntValue2, g40.e, new s9(z61VarArr, this, iIntValue, iIntValue2));
    }

    @Override // defpackage.uu0
    public final int h(pi0 pi0Var, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((pu0) list.get(0)).a0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pu0) list.get(i2)).a0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.uu0
    public final int j(pi0 pi0Var, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((pu0) list.get(0)).O(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pu0) list.get(i2)).O(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
