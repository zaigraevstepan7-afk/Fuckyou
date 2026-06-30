package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ug implements uu0 {
    public final uf a;
    public final boolean b;

    public ug(uf ufVar, boolean z) {
        this.a = ufVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug)) {
            return false;
        }
        ug ugVar = (ug) obj;
        return this.a.equals(ugVar.a) && this.b == ugVar.b;
    }

    @Override // defpackage.uu0
    public final vu0 g(xu0 xu0Var, List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        g40 g40Var = g40.e;
        if (zIsEmpty) {
            return xu0Var.f0(kr.j(j), kr.i(j), g40Var, new mt(9));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            pu0 pu0Var = (pu0) list.get(0);
            pu0Var.i();
            z61 z61VarE = pu0Var.e(j2);
            int iMax = Math.max(kr.j(j), z61VarE.e);
            int iMax2 = Math.max(kr.i(j), z61VarE.f);
            return xu0Var.f0(iMax, iMax2, g40Var, new tg(z61VarE, pu0Var, xu0Var, iMax, iMax2, this));
        }
        z61[] z61VarArr = new z61[list.size()];
        xc1 xc1Var = new xc1();
        xc1Var.e = kr.j(j);
        xc1 xc1Var2 = new xc1();
        xc1Var2.e = kr.i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pu0 pu0Var2 = (pu0) list.get(i);
            pu0Var2.i();
            z61 z61VarE2 = pu0Var2.e(j2);
            z61VarArr[i] = z61VarE2;
            xc1Var.e = Math.max(xc1Var.e, z61VarE2.e);
            xc1Var2.e = Math.max(xc1Var2.e, z61VarE2.f);
        }
        return xu0Var.f0(xc1Var.e, xc1Var2.e, g40Var, new dg(z61VarArr, list, xu0Var, xc1Var, xc1Var2, this, 1));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
