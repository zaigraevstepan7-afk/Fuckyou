package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xe1 implements iz {
    public final /* synthetic */ int e;
    public final /* synthetic */ cf1 f;

    public /* synthetic */ xe1(cf1 cf1Var, int i) {
        this.e = i;
        this.f = cf1Var;
    }

    @Override // defpackage.iz
    public final double c(double d) {
        int i = this.e;
        cf1 cf1Var = this.f;
        switch (i) {
            case 0:
                return lk.y(cf1Var.k.c(d), cf1Var.e, cf1Var.f);
            default:
                return cf1Var.n.c(lk.y(d, cf1Var.e, cf1Var.f));
        }
    }
}
