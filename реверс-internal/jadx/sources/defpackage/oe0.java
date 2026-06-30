package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oe0 implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ jo f;

    public /* synthetic */ oe0(jo joVar) {
        this.e = 0;
        this.f = joVar;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        jo joVar = this.f;
        ob0 ob0Var = (ob0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    long jM = v20.m();
                    j60 j60Var = ko1.a;
                    tv0 tv0VarF = ko1.f(qv0.a, wz.b(jM), wz.a(jM));
                    uu0 uu0VarD = sg.d(v20.j, false);
                    int iHashCode = Long.hashCode(ob0Var.T);
                    b61 b61VarL = ob0Var.l();
                    tv0 tv0VarP = bk.P(ob0Var, tv0VarF);
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
                    ob0Var.p(true);
                }
                break;
            case 1:
                num.getClass();
                xk.c(joVar, ob0Var, al.V(7));
                break;
            default:
                num.getClass();
                b91.a(joVar, ob0Var, al.V(7));
                break;
        }
        return t32Var;
    }

    public /* synthetic */ oe0(jo joVar, int i, int i2) {
        this.e = i2;
        this.f = joVar;
    }
}
