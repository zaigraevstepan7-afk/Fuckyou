package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l80 extends sk0 implements sa0 {
    public final /* synthetic */ zc1 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l80(int i, zc1 zc1Var) {
        super(1);
        this.f = zc1Var;
        this.g = i;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((w80) obj).S0(this.g));
        this.f.e = boolValueOf;
        return boolValueOf;
    }
}
