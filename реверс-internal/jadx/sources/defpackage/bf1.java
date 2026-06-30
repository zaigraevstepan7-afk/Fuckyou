package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bf1 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ cf1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf1(cf1 cf1Var, int i) {
        super(1);
        this.f = i;
        this.g = cf1Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.f;
        cf1 cf1Var = this.g;
        switch (i) {
            case 0:
                return Double.valueOf(cf1Var.n.c(lk.y(((Number) obj).doubleValue(), cf1Var.e, cf1Var.f)));
            default:
                return Double.valueOf(lk.y(cf1Var.k.c(((Number) obj).doubleValue()), cf1Var.e, cf1Var.f));
        }
    }
}
