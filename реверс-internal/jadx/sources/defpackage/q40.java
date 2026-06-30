package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q40 extends sk0 implements sa0 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ha0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q40(boolean z, ha0 ha0Var) {
        super(1);
        this.f = z;
        this.g = ha0Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        ((ue1) obj).f(!this.f && ((Boolean) this.g.a()).booleanValue());
        return t32.a;
    }
}
