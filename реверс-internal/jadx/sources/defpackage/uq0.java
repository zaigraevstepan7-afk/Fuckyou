package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uq0 implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ wa0 f;

    public /* synthetic */ uq0(int i, wa0 wa0Var) {
        this.e = i;
        this.f = wa0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        jh1 jh1Var;
        int i = this.e;
        wa0 wa0Var = this.f;
        switch (i) {
            case 0:
                gh1 gh1Var = (gh1) obj;
                List list = (List) wa0Var.h(gh1Var, obj2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && (jh1Var = gh1Var.f) != null && !jh1Var.d(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            default:
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tv0 tv0VarA = xi0.A(qv0.a, "Container");
                    uu0 uu0VarD = sg.d(v20.f, true);
                    int iHashCode = Long.hashCode(ob0Var.T);
                    b61 b61VarL = ob0Var.l();
                    tv0 tv0VarP = bk.P(ob0Var, tv0VarA);
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
                    wa0Var.h(ob0Var, 0);
                    ob0Var.p(true);
                } else {
                    ob0Var.Q();
                }
                return t32.a;
        }
    }
}
