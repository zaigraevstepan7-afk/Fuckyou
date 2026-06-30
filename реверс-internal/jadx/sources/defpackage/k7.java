package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k7 extends sk0 implements wa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ v81 g;
    public final /* synthetic */ fy0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7(v81 v81Var, fy0 fy0Var, int i) {
        super(2);
        this.f = i;
        this.g = v81Var;
        this.h = fy0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.f;
        t32 t32Var = t32.a;
        fy0 fy0Var = this.h;
        v81 v81Var = this.g;
        int i2 = 0;
        switch (i) {
            case 0:
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    Object objK = ob0Var.K();
                    l91 l91Var = kp.a;
                    if (objK == l91Var) {
                        objK = a4.n;
                        ob0Var.f0(objK);
                    }
                    tv0 tv0VarA = ol1.a(qv0.a, false, (sa0) objK);
                    boolean zH = ob0Var.h(v81Var);
                    Object objK2 = ob0Var.K();
                    if (zH || objK2 == l91Var) {
                        objK2 = new h7(v81Var, 1);
                        ob0Var.f0(objK2);
                    }
                    tv0 tv0VarY = pv.y(tv0VarA, (sa0) objK2);
                    float f = v81Var.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f != 1.0f) {
                        tv0VarY = c2.n(tv0VarY, f, 0.0f, null, true, 1044475);
                    }
                    bq bqVar = l7.a;
                    wa0 wa0Var = (wa0) fy0Var.getValue();
                    Object objK3 = ob0Var.K();
                    if (objK3 == l91Var) {
                        objK3 = n5.c;
                        ob0Var.f0(objK3);
                    }
                    uu0 uu0Var = (uu0) objK3;
                    int iHashCode = Long.hashCode(ob0Var.T);
                    b61 b61VarL = ob0Var.l();
                    tv0 tv0VarP = bk.P(ob0Var, tv0VarY);
                    ep.c.getClass();
                    zp zpVar = dp.b;
                    ob0Var.Z();
                    if (ob0Var.S) {
                        ob0Var.k(zpVar);
                    } else {
                        ob0Var.i0();
                    }
                    xc.E(dp.f, ob0Var, uu0Var);
                    xc.E(dp.e, ob0Var, b61VarL);
                    xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
                    xc.C(ob0Var, dp.h);
                    xc.E(dp.d, ob0Var, tv0VarP);
                    wa0Var.h(ob0Var, 0);
                    ob0Var.p(true);
                }
                break;
            default:
                ob0 ob0Var2 = (ob0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ob0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ob0Var2.Q();
                } else {
                    lk.i(l7.b.a(Boolean.TRUE), lk.d0(1022273628, new k7(v81Var, fy0Var, i2), ob0Var2), ob0Var2, 56);
                }
                break;
        }
        return t32Var;
    }
}
