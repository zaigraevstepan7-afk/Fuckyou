package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cp1 extends zu1 implements xa0 {
    public final /* synthetic */ hp1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp1(hp1 hp1Var, ks ksVar) {
        super(3, ksVar);
        this.i = hp1Var;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) throws Throwable {
        ((Number) obj2).floatValue();
        cp1 cp1Var = new cp1(this.i, (ks) obj3);
        t32 t32Var = t32.a;
        cp1Var.q(t32Var);
        return t32Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) throws Throwable {
        xc.G(obj);
        this.i.o.a();
        return t32.a;
    }
}
