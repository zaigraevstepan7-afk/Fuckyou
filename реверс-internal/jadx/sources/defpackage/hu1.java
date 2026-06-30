package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hu1 extends sk0 implements wa0 {
    public final /* synthetic */ ku1 f;
    public final /* synthetic */ tv0 g;
    public final /* synthetic */ wa0 h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu1(ku1 ku1Var, tv0 tv0Var, wa0 wa0Var, int i) {
        super(2);
        this.f = ku1Var;
        this.g = tv0Var;
        this.h = wa0Var;
        this.i = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = al.V(this.i | 1);
        pv.d(this.f, this.g, this.h, (ob0) obj, iV);
        return t32.a;
    }
}
