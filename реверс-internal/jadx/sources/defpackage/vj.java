package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vj extends qj {
    public final xa0 i;

    public vj(xa0 xa0Var, f70 f70Var, lt ltVar, int i, ph phVar) {
        super(f70Var, ltVar, i, phVar);
        this.i = xa0Var;
    }

    @Override // defpackage.nj
    public final nj b(lt ltVar, int i, ph phVar) {
        return new vj(this.i, this.h, ltVar, i, phVar);
    }

    @Override // defpackage.qj
    public final Object f(g70 g70Var, ks ksVar) {
        Object objR = bl.r(new sj(this, g70Var, null), ksVar);
        return objR == wt.e ? objR : t32.a;
    }
}
