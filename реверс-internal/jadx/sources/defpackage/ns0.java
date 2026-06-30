package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ns0 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ex1 f;

    public /* synthetic */ ns0(ex1 ex1Var, int i) {
        this.e = i;
        this.f = ex1Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        ex1 ex1Var = this.f;
        switch (i) {
            case 0:
                ex1Var.d(((w01) obj).a, l91.l);
                break;
            case 1:
                l81 l81Var = (l81) obj;
                ex1Var.e(lk.a0(l81Var, false));
                l81Var.a();
                break;
            default:
                l81 l81Var2 = (l81) obj;
                ex1Var.e(lk.a0(l81Var2, false));
                l81Var2.a();
                break;
        }
        return t32Var;
    }
}
