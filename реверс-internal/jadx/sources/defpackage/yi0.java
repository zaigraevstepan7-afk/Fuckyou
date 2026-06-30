package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yi0 extends me1 {
    public int f;
    public final /* synthetic */ wa0 g;
    public final /* synthetic */ ks h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi0(ks ksVar, ks ksVar2, wa0 wa0Var) {
        super(ksVar);
        this.g = wa0Var;
        this.h = ksVar2;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                yc.l("This coroutine had already completed");
                return null;
            }
            this.f = 2;
            xc.G(obj);
            return obj;
        }
        this.f = 1;
        xc.G(obj);
        wa0 wa0Var = this.g;
        wa0Var.getClass();
        s22.i(2, wa0Var);
        return wa0Var.h(this.h, this);
    }
}
