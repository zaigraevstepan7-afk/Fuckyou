package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ ha0 f;

    public /* synthetic */ r3(ha0 ha0Var, int i) {
        this.e = i;
        this.f = ha0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        ha0 ha0Var = this.f;
        switch (i) {
            case 0:
                ha0Var.a();
                break;
            case 1:
                ha0Var.a();
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ha0Var.a();
                break;
            default:
                ha0Var.a();
                break;
        }
    }
}
