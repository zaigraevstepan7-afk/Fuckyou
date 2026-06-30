package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d5 implements wa0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d5(long j, tv0 tv0Var) {
        this.f = j;
        this.g = tv0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj3 = this.g;
        long j = this.f;
        switch (i) {
            case 0:
                tv0 tv0Var = (tv0) obj3;
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else if (j == 9205357640488583168L) {
                    ob0Var.W(-1243644858);
                    i5.b(tv0Var, ob0Var, 0, 0);
                    ob0Var.p(false);
                } else {
                    ob0Var.W(-1244013944);
                    tv0 tv0VarD = ko1.d(tv0Var, wz.b(j), wz.a(j), 0.0f, 0.0f, 12);
                    uu0 uu0VarD = sg.d(v20.g, false);
                    int iHashCode = Long.hashCode(ob0Var.T);
                    b61 b61VarL = ob0Var.l();
                    tv0 tv0VarP = bk.P(ob0Var, tv0VarD);
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
                    i5.b(null, ob0Var, 0, 1);
                    ob0Var.p(true);
                    ob0Var.p(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                sq0.f(j, (g32) obj3, (ob0) obj, al.V(49));
                break;
        }
        return t32Var;
    }

    public /* synthetic */ d5(long j, g32 g32Var, int i) {
        this.f = j;
        this.g = g32Var;
    }
}
