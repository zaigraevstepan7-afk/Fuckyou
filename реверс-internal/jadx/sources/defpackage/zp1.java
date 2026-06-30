package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zp1 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ sa0 f;
    public final /* synthetic */ sa0 g;

    public /* synthetic */ zp1(sa0 sa0Var, sa0 sa0Var2, int i) {
        this.e = i;
        this.f = sa0Var;
        this.g = sa0Var2;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        sa0 sa0Var = this.g;
        sa0 sa0Var2 = this.f;
        switch (i) {
            case 0:
                sa0Var2.i(obj);
                sa0Var.i(obj);
                break;
            default:
                sa0Var2.i(obj);
                sa0Var.i(obj);
                break;
        }
        return t32Var;
    }
}
