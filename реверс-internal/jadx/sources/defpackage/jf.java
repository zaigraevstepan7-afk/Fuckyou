package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jf implements wa0 {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ jf(bm bmVar, iw0 iw0Var, f32 f32Var, jo joVar) {
        this.f = bmVar;
        this.g = iw0Var;
        this.i = f32Var;
        this.h = joVar;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj3 = this.h;
        Object obj4 = this.i;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                tv0 tv0Var = (tv0) obj6;
                fy0 fy0Var = (fy0) obj5;
                jo joVar = (jo) obj3;
                hf hfVar = (hf) obj4;
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    Object objK = ob0Var.K();
                    l91 l91Var = kp.a;
                    if (objK == l91Var) {
                        objK = new p8(fy0Var, 1);
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
                    Object objK2 = ob0Var.K();
                    if (objK2 == l91Var) {
                        objK2 = new n8(fy0Var, 4);
                        ob0Var.f0(objK2);
                    }
                    hfVar.b((ha0) objK2, ob0Var, 6);
                    ob0Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                bk.d((ha0) obj5, (tv0) obj6, (bn0) obj3, (on0) obj4, (ob0) obj, al.V(1));
                break;
            default:
                bm bmVarD = (bm) obj6;
                iw0 iw0Var = (iw0) obj5;
                f32 f32Var = (f32) obj4;
                jo joVar2 = (jo) obj3;
                ob0 ob0Var2 = (ob0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ob0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ob0Var2.Q();
                } else {
                    if (bmVarD == null) {
                        ys1 ys1Var = dm.a;
                        bmVarD = dm.d(k41.w, k41.C, k41.I, k41.c, -33558793);
                    }
                    bm bmVar = bmVarD;
                    if (iw0Var == null) {
                        iw0Var = gw0.a;
                    }
                    iw0 iw0Var2 = iw0Var;
                    pn1 pn1Var = new pn1();
                    if (f32Var == null) {
                        f32Var = new f32();
                    }
                    mu0.b(bmVar, iw0Var2, pn1Var, f32Var, joVar2, ob0Var2, 0);
                }
                break;
        }
        return t32Var;
    }

    public /* synthetic */ jf(ha0 ha0Var, tv0 tv0Var, bn0 bn0Var, on0 on0Var, int i) {
        this.g = ha0Var;
        this.f = tv0Var;
        this.h = bn0Var;
        this.i = on0Var;
    }

    public /* synthetic */ jf(tv0 tv0Var, fy0 fy0Var, jo joVar, hf hfVar) {
        this.f = tv0Var;
        this.g = fy0Var;
        this.h = joVar;
        this.i = hfVar;
    }
}
