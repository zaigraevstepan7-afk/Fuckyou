package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bc1 implements os1, f70, ib0 {
    public final /* synthetic */ qs1 e;
    private final oj0 job;

    public bc1(qs1 qs1Var, jr1 jr1Var) {
        this.e = qs1Var;
        this.job = jr1Var;
    }

    @Override // defpackage.f70
    public final Object c(g70 g70Var, ks ksVar) {
        this.e.c(g70Var, ksVar);
        return wt.e;
    }

    @Override // defpackage.ib0
    public final f70 e(lt ltVar, int i, ph phVar) {
        return ((((i < 0 || i >= 2) && i != -2) || phVar != ph.f) && !((i == 0 || i == -3) && phVar == ph.e)) ? new rj(this, ltVar, i, phVar) : this;
    }

    @Override // defpackage.os1
    public final Object getValue() {
        return this.e.getValue();
    }
}
