package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg implements sa0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ fg(pc1 pc1Var, n31 n31Var, lh lhVar, float f, w6 w6Var) {
        this.g = pc1Var;
        this.h = n31Var;
        this.i = lhVar;
        this.f = f;
        this.j = w6Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                pc1 pc1Var = (pc1) obj5;
                n31 n31Var = (n31) obj4;
                lh lhVar = (lh) obj3;
                float f = this.f;
                w6 w6Var = (w6) obj2;
                p10 p10Var = (p10) obj;
                float f2 = -pc1Var.a;
                float f3 = -pc1Var.b;
                ((qt0) p10Var.E().a).A(f2, f3);
                try {
                    p10.y0(p10Var, n31Var.b, lhVar, 0.0f, new kt1(f * 2.0f, 0.0f, 0, 0, 30), null, 52);
                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (p10Var.d() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (p10Var.d() >> 32));
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (p10Var.d() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (p10Var.d() & 4294967295L));
                    long jS = p10Var.S();
                    oc ocVarE = p10Var.E();
                    long jQ = ocVarE.q();
                    ocVarE.i().l();
                    try {
                        ((qt0) ocVarE.a).x(fIntBitsToFloat, fIntBitsToFloat2, jS);
                        p10.y0(p10Var, w6Var, lhVar, 0.0f, null, null, 28);
                        return t32Var;
                    } finally {
                        ocVarE.i().i();
                        ocVarE.B(jQ);
                    }
                } finally {
                    ((qt0) p10Var.E().a).A(-f2, -f3);
                }
            default:
                long jLongValue = ((Long) obj).longValue();
                Object obj6 = ((zc1) obj5).e;
                obj6.getClass();
                kd1.i((va) obj6, jLongValue, this.f, (sa) obj4, (xa) obj3, (sa0) obj2);
                return t32Var;
        }
    }

    public /* synthetic */ fg(zc1 zc1Var, float f, sa saVar, xa xaVar, sa0 sa0Var) {
        this.g = zc1Var;
        this.f = f;
        this.h = saVar;
        this.i = xaVar;
        this.j = sa0Var;
    }
}
