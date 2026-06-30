package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o5 extends sk0 implements wa0 {
    public final /* synthetic */ tv0 f;
    public final /* synthetic */ wa0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(tv0 tv0Var, wa0 wa0Var, int i) {
        super(2);
        this.f = tv0Var;
        this.g = wa0Var;
        this.h = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = al.V(this.h | 1);
        nu0.h(this.f, this.g, (ob0) obj, iV);
        return t32.a;
    }
}
