package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class g9 extends zu1 implements sa0 {
    public final /* synthetic */ h9 i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(h9 h9Var, Object obj, ks ksVar) {
        super(1, ksVar);
        this.i = h9Var;
        this.j = obj;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        g9 g9Var = new g9(this.i, this.j, (ks) obj);
        t32 t32Var = t32.a;
        g9Var.q(t32Var);
        return t32Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        xc.G(obj);
        h9 h9Var = this.i;
        h9.a(h9Var);
        Object objC = h9Var.c(this.j);
        h9Var.c.f.setValue(objC);
        h9Var.e.setValue(objC);
        return t32.a;
    }
}
