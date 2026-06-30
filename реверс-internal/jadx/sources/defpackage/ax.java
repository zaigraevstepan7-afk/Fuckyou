package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ax implements ha0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ cx f;

    public /* synthetic */ ax(cx cxVar) {
        this.f = cxVar;
    }

    @Override // defpackage.ha0
    public final Object a() {
        uc1 pf1Var;
        int i = this.e;
        cx cxVar = this.f;
        switch (i) {
            case 0:
                iw0 iw0Var = ((ju0) hk.o(cxVar, mu0.b)).d;
                xf1 xf1Var = (xf1) hk.o(cxVar, jf1.a);
                pd1 tf1Var = cxVar.y ? new tf1() : sf1.b;
                if (cxVar.z) {
                    wf1 wf1Var = xf1Var.a;
                    pf1Var = new pf1();
                } else {
                    pf1Var = of1.a;
                }
                return new uf1(tf1Var, pf1Var, cxVar.A ? new rf1() : qf1.c, cxVar.B ? new nf1() : mf1.c);
            default:
                ff1 ff1Var = (ff1) hk.o(cxVar, jf1.b);
                kf1 kf1Var = cxVar.C;
                if (ff1Var == null) {
                    if (kf1Var != null) {
                        cxVar.M0(kf1Var);
                    }
                    cxVar.C = null;
                } else if (kf1Var == null) {
                    bx bxVar = new bx(cxVar, 0);
                    ax axVar = new ax(cxVar, new bx(cxVar, 2), new bx(cxVar, 1));
                    jx0 jx0Var = cxVar.u;
                    boolean z = cxVar.v;
                    float f = cxVar.w;
                    q22 q22Var = if1.a;
                    kf1 kf1Var2 = new kf1();
                    kf1Var2.L0(new q7(jx0Var, z, f, bxVar, axVar));
                    cxVar.L0(kf1Var2);
                    cxVar.C = kf1Var2;
                }
                return t32.a;
        }
    }

    public /* synthetic */ ax(cx cxVar, bx bxVar, bx bxVar2) {
        this.f = cxVar;
    }
}
