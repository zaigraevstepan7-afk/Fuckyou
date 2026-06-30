package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class oa extends sk0 implements xa0 {
    public final /* synthetic */ sa0 f;
    public final /* synthetic */ d22 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(sa0 sa0Var, d22 d22Var) {
        super(3);
        this.f = sa0Var;
        this.g = d22Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // defpackage.xa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2, Object obj3) {
        long j;
        xu0 xu0Var = (xu0) obj;
        z61 z61VarE = ((pu0) obj2).e(((kr) obj3).a);
        if (xu0Var.s()) {
            if (((Boolean) this.f.i(this.g.d.getValue())).booleanValue()) {
                j = (((long) z61VarE.e) << 32) | (((long) z61VarE.f) & 4294967295L);
            } else {
                j = 0;
            }
        }
        return xu0Var.f0((int) (j >> 32), (int) (4294967295L & j), g40.e, new u3(z61VarE, 2));
    }
}
