package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class j7 extends sk0 implements wa0 {
    public final /* synthetic */ y81 f;
    public final /* synthetic */ ha0 g;
    public final /* synthetic */ z81 h;
    public final /* synthetic */ jo i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(y81 y81Var, ha0 ha0Var, z81 z81Var, jo joVar, int i, int i2) {
        super(2);
        this.f = y81Var;
        this.g = ha0Var;
        this.h = z81Var;
        this.i = joVar;
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        l7.a(this.f, this.g, this.h, this.i, (ob0) obj, al.V(this.j | 1), this.k);
        return t32.a;
    }
}
