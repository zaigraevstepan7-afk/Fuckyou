package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class my1 extends zu1 implements sa0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ry1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my1(ry1 ry1Var, ks ksVar, int i) {
        super(1, ksVar);
        this.i = i;
        this.j = ry1Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        ry1 ry1Var = this.j;
        ks ksVar = (ks) obj;
        switch (i) {
            case 0:
                new my1(ry1Var, ksVar, 0).q(t32Var);
                break;
            case 1:
                new my1(ry1Var, ksVar, 1).q(t32Var);
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                new my1(ry1Var, ksVar, 2).q(t32Var);
                break;
            default:
                new my1(ry1Var, ksVar, 3).q(t32Var);
                break;
        }
        return t32Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        ry1 ry1Var = this.j;
        switch (i) {
            case 0:
                xc.G(obj);
                ry1Var.A = false;
                break;
            case 1:
                xc.G(obj);
                ry1Var.f();
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                xc.G(obj);
                ry1Var.d(ry1Var.A);
                break;
            default:
                xc.G(obj);
                ry1Var.p();
                break;
        }
        return t32Var;
    }
}
