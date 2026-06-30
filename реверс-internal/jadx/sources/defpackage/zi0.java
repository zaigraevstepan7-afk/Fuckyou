package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zi0 extends ls {
    public int h;
    public final /* synthetic */ wa0 i;
    public final /* synthetic */ ks j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(ks ksVar, lt ltVar, wa0 wa0Var, ks ksVar2) {
        super(ksVar, ltVar);
        this.i = wa0Var;
        this.j = ksVar2;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                yc.l("This coroutine had already completed");
                return null;
            }
            this.h = 2;
            xc.G(obj);
            return obj;
        }
        this.h = 1;
        xc.G(obj);
        wa0 wa0Var = this.i;
        wa0Var.getClass();
        s22.i(2, wa0Var);
        return wa0Var.h(this.j, this);
    }
}
