package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class f10 extends zu1 implements xa0 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f10(int i, ks ksVar, int i2) {
        super(i, ksVar);
        this.i = i2;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        int i = this.i;
        t32 t32Var = t32.a;
        int i2 = 3;
        switch (i) {
            case 0:
                long j = ((w01) obj2).a;
                new f10(i2, (ks) obj3, 0).q(t32Var);
                break;
            case 1:
                ((Number) obj2).floatValue();
                new f10(i2, (ks) obj3, 1).q(t32Var);
                break;
            default:
                long j2 = ((w01) obj2).a;
                new f10(i2, (ks) obj3, 2).q(t32Var);
                break;
        }
        return t32Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                xc.G(obj);
                break;
            case 1:
                xc.G(obj);
                break;
            default:
                xc.G(obj);
                break;
        }
        return t32Var;
    }
}
