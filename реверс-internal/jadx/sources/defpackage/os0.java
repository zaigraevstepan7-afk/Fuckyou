package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class os0 implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ex1 f;

    public /* synthetic */ os0(ex1 ex1Var, int i) {
        this.e = i;
        this.f = ex1Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i = this.e;
        t32 t32Var = t32.a;
        ex1 ex1Var = this.f;
        switch (i) {
            case 0:
                ex1Var.a();
                break;
            default:
                ex1Var.onCancel();
                break;
        }
        return t32Var;
    }
}
