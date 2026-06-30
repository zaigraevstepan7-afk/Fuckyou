package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class lk1 {
    public static final lk1 a = new lk1();
    public static final float b = wi0.q;
    public static final float c = wi0.v;
    public static final e41 d;

    static {
        e41 e41Var = yh.c;
        d = new e41(12.0f, e41Var.b, 12.0f, e41Var.d);
    }

    public final void a(ob0 ob0Var, int i) {
        ob0 ob0Var2;
        ob0Var.X(-1273041460);
        if (ob0Var.N(i & 1, (i & 3) != 2)) {
            ye0 ye0VarB = bl.c;
            if (ye0VarB == null) {
                xe0 xe0Var = new xe0("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i2 = a52.a;
                uq1 uq1Var = new uq1(vl.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new f51(9.0f, 16.17f));
                arrayList.add(new e51(4.83f, 12.0f));
                arrayList.add(new m51(-1.42f, 1.41f));
                arrayList.add(new e51(9.0f, 19.0f));
                arrayList.add(new e51(21.0f, 7.0f));
                arrayList.add(new m51(-1.41f, -1.41f));
                arrayList.add(b51.c);
                xe0.a(xe0Var, arrayList, uq1Var);
                ye0VarB = xe0Var.b();
                bl.c = ye0VarB;
            }
            ob0Var2 = ob0Var;
            ue0.a(ye0VarB, null, ko1.e(qv0.a, c), 0L, ob0Var2, 48, 8);
        } else {
            ob0Var2 = ob0Var;
            ob0Var2.Q();
        }
        dc1 dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
            dc1VarR.d = new ud(i, 15, this);
        }
    }

    public final void b(final boolean z, wa0 wa0Var, ob0 ob0Var, final int i) {
        final wa0 wa0Var2;
        ob0Var.X(-657462570);
        int i2 = (ob0Var.g(z) ? 4 : 2) | i | 432;
        if (ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            wa0Var2 = s22.c;
            ob0Var.W(-1416240287);
            s22.b(z, null, r40.b(bl.W(jw0.f, ob0Var), 2).a(new w40(new e22((p50) null, (wi0) null, new mi1(0.0f, uc1.b(0.0f, 1.0f), bl.W(jw0.e, ob0Var)), (LinkedHashMap) null, 119))), j50.b, null, lk.d0(2059591811, new no(6), ob0Var), ob0Var, (i2 & 14) | 196608);
            ob0Var.p(false);
        } else {
            ob0Var.Q();
            wa0Var2 = wa0Var;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0(z, wa0Var2, i) { // from class: kk1
                public final /* synthetic */ boolean f;
                public final /* synthetic */ wa0 g;

                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = al.V(3073);
                    this.e.b(this.f, this.g, (ob0) obj, iV);
                    return t32.a;
                }
            };
        }
    }
}
