package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pq0 implements wa0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ fy0 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ pq0(tv0 tv0Var, fy0 fy0Var, jo joVar, hf hfVar, ha0 ha0Var) {
        this.g = tv0Var;
        this.f = fy0Var;
        this.h = joVar;
        this.i = hfVar;
        this.j = ha0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                sq0.a((jx0) obj6, this.f, (fy0) obj5, (fy0) obj4, (fy0) obj3, (ob0) obj, al.V(28081));
                break;
            default:
                tv0 tv0Var = (tv0) obj6;
                jo joVar = (jo) obj5;
                hf hfVar = (hf) obj4;
                ha0 ha0Var = (ha0) obj3;
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    Object objK = ob0Var.K();
                    if (objK == kp.a) {
                        objK = new p8(this.f, 2);
                        ob0Var.f0(objK);
                    }
                    tv0 tv0VarO = u4.o(tv0Var, (sa0) objK);
                    uu0 uu0VarD = sg.d(v20.f, true);
                    int iHashCode = Long.hashCode(ob0Var.T);
                    b61 b61VarL = ob0Var.l();
                    tv0 tv0VarP = bk.P(ob0Var, tv0VarO);
                    ep.c.getClass();
                    zp zpVar = dp.b;
                    ob0Var.Z();
                    if (ob0Var.S) {
                        ob0Var.k(zpVar);
                    } else {
                        ob0Var.i0();
                    }
                    xc.E(dp.f, ob0Var, uu0VarD);
                    xc.E(dp.e, ob0Var, b61VarL);
                    xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
                    xc.C(ob0Var, dp.h);
                    xc.E(dp.d, ob0Var, tv0VarP);
                    joVar.h(ob0Var, 0);
                    hfVar.b(ha0Var, ob0Var, 6);
                    ob0Var.p(true);
                }
                break;
        }
        return t32Var;
    }

    public /* synthetic */ pq0(jx0 jx0Var, fy0 fy0Var, fy0 fy0Var2, fy0 fy0Var3, fy0 fy0Var4, int i) {
        this.g = jx0Var;
        this.f = fy0Var;
        this.h = fy0Var2;
        this.i = fy0Var3;
        this.j = fy0Var4;
    }
}
