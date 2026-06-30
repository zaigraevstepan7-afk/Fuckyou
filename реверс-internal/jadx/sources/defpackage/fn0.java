package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fn0 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ hn0 f;

    public /* synthetic */ fn0(hn0 hn0Var, int i) {
        this.e = i;
        this.f = hn0Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        hn0 hn0Var = this.f;
        switch (i) {
            case 0:
                kn0 kn0Var = (kn0) hn0Var.s.a();
                int iC = kn0Var.c();
                int i2 = 0;
                while (true) {
                    if (i2 >= iC) {
                        i2 = -1;
                    } else if (!kn0Var.d(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int iIntValue = ((Integer) obj).intValue();
                kn0 kn0Var2 = (kn0) hn0Var.s.a();
                if (iIntValue < 0 || iIntValue >= kn0Var2.c()) {
                    qg0.a("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + kn0Var2.c() + ")");
                }
                nu0.A(hn0Var.z0(), null, null, new cf(hn0Var, iIntValue, null, 1), 3);
                return Boolean.TRUE;
        }
    }
}
