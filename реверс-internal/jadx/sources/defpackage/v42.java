package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v42 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ w42 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v42(w42 w42Var, int i) {
        super(1);
        this.f = i;
        this.g = w42Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.f;
        t32 t32Var = t32.a;
        w42 w42Var = this.g;
        switch (i) {
            case 0:
                w42Var.d = true;
                w42Var.f.a();
                return t32Var;
            default:
                p10 p10Var = (p10) obj;
                xc0 xc0Var = w42Var.b;
                float f = w42Var.k;
                float f2 = w42Var.l;
                oc ocVarE = p10Var.E();
                long jQ = ocVarE.q();
                ocVarE.i().l();
                try {
                    ((qt0) ocVarE.a).x(f, f2, 0L);
                    xc0Var.a(p10Var);
                    return t32Var;
                } finally {
                    s91.r(ocVarE, jQ);
                }
        }
    }
}
