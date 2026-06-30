package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hg0 extends zu1 implements wa0 {
    public /* synthetic */ float i;

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((hg0) o((ks) obj2, Float.valueOf(((Number) obj).floatValue()))).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        hg0 hg0Var = new hg0(2, ksVar);
        hg0Var.i = ((Number) obj).floatValue();
        return hg0Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        xc.G(obj);
        return Boolean.valueOf(this.i > 0.0f);
    }
}
