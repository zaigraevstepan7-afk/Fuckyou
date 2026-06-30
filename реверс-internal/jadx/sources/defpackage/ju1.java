package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ju1 extends sk0 implements wa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ku1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ju1(ku1 ku1Var, int i) {
        super(2);
        this.f = i;
        this.g = ku1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.f;
        t32 t32Var = t32.a;
        ku1 ku1Var = this.g;
        switch (i) {
            case 0:
                ku1Var.a().f = (op) obj2;
                break;
            case 1:
                em0 em0VarA = ku1Var.a();
                ((ql0) obj).g0(new am0(em0VarA, (wa0) obj2, em0VarA.t));
                break;
            default:
                ql0 ql0Var = (ql0) obj;
                nu1 nu1Var = ku1Var.a;
                em0 em0Var = ql0Var.K;
                if (em0Var == null) {
                    em0Var = new em0(ql0Var, nu1Var);
                    ql0Var.K = em0Var;
                }
                ku1Var.b = em0Var;
                ku1Var.a().h();
                em0 em0VarA2 = ku1Var.a();
                if (em0VarA2.g != nu1Var) {
                    em0VarA2.g = nu1Var;
                    em0VarA2.i(false);
                    ql0.Z(em0VarA2.e, false, 7);
                }
                break;
        }
        return t32Var;
    }
}
