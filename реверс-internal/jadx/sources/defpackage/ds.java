package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ds {
    public final mq1 a = new mq1();

    public static void b(ds dsVar, wa0 wa0Var, jo joVar, ha0 ha0Var, int i) {
        if ((i & 8) != 0) {
            joVar = null;
        }
        dsVar.a.add(new jo(-1789283891, true, new um0(wa0Var, dsVar, joVar, ha0Var)));
    }

    public final void a(cs csVar, ob0 ob0Var, int i) {
        ob0Var.X(-798501095);
        int i2 = 2;
        int i3 = (ob0Var.f(csVar) ? 4 : 2) | i | (ob0Var.f(this) ? 32 : 16);
        if (ob0Var.N(i3 & 1, (i3 & 19) != 18)) {
            mq1 mq1Var = this.a;
            int size = mq1Var.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((xa0) mq1Var.get(i4)).f(csVar, ob0Var, Integer.valueOf(i3 & 14));
            }
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new fi(i, i2, this, csVar);
        }
    }
}
