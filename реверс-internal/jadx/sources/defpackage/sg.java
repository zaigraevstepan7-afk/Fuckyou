package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class sg {
    public static final zx0 a = c(true);
    public static final zx0 b = c(false);
    public static final n5 c = n5.d;

    public static final void a(tv0 tv0Var, ob0 ob0Var, int i) {
        ob0Var.X(-211209833);
        int i2 = (ob0Var.f(tv0Var) ? 4 : 2) | i;
        if (ob0Var.N(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(ob0Var.T);
            tv0 tv0VarP = bk.P(ob0Var, tv0Var);
            b61 b61VarL = ob0Var.l();
            ep.c.getClass();
            zp zpVar = dp.b;
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(zpVar);
            } else {
                ob0Var.i0();
            }
            xc.E(dp.f, ob0Var, c);
            xc.E(dp.e, ob0Var, b61VarL);
            xc.C(ob0Var, dp.h);
            xc.E(dp.d, ob0Var, tv0VarP);
            xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
            ob0Var.p(true);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new ud(i, 3, tv0Var);
        }
    }

    public static final void b(y61 y61Var, z61 z61Var, pu0 pu0Var, al0 al0Var, int i, int i2, uf ufVar) {
        uf ufVar2;
        Object objI = pu0Var.i();
        rg rgVar = objI instanceof rg ? (rg) objI : null;
        y61.i(y61Var, z61Var, ((rgVar == null || (ufVar2 = rgVar.s) == null) ? ufVar : ufVar2).a((((long) z61Var.e) << 32) | (((long) z61Var.f) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), al0Var));
    }

    public static final zx0 c(boolean z) {
        zx0 zx0Var = new zx0(9);
        uf ufVar = v20.f;
        zx0Var.m(ufVar, new ug(ufVar, z));
        uf ufVar2 = v20.g;
        zx0Var.m(ufVar2, new ug(ufVar2, z));
        uf ufVar3 = v20.h;
        zx0Var.m(ufVar3, new ug(ufVar3, z));
        uf ufVar4 = v20.i;
        zx0Var.m(ufVar4, new ug(ufVar4, z));
        uf ufVar5 = v20.j;
        zx0Var.m(ufVar5, new ug(ufVar5, z));
        uf ufVar6 = v20.k;
        zx0Var.m(ufVar6, new ug(ufVar6, z));
        uf ufVar7 = v20.l;
        zx0Var.m(ufVar7, new ug(ufVar7, z));
        uf ufVar8 = v20.m;
        zx0Var.m(ufVar8, new ug(ufVar8, z));
        uf ufVar9 = v20.n;
        zx0Var.m(ufVar9, new ug(ufVar9, z));
        return zx0Var;
    }

    public static final uu0 d(uf ufVar, boolean z) {
        uu0 uu0Var = (uu0) (z ? a : b).g(ufVar);
        return uu0Var == null ? new ug(ufVar, z) : uu0Var;
    }
}
