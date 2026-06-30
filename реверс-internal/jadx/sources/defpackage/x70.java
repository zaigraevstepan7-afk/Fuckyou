package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x70 extends zu1 implements wa0 {
    public /* synthetic */ int i;

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((x70) o((ks) obj2, Integer.valueOf(((Number) obj).intValue()))).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        x70 x70Var = new x70(2, ksVar);
        x70Var.i = ((Number) obj).intValue();
        return x70Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        xc.G(obj);
        return Boolean.valueOf(i > 0);
    }
}
