package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sj0 extends xi {
    public final vj0 o;

    public sj0(ks ksVar, vj0 vj0Var) {
        super(1, ksVar);
        this.o = vj0Var;
    }

    @Override // defpackage.xi
    public final String C() {
        return "AwaitContinuation";
    }

    @Override // defpackage.xi
    public final Throwable r(vj0 vj0Var) {
        Throwable thE;
        Object objP = this.o.P();
        return (!(objP instanceof uj0) || (thE = ((uj0) objP).e()) == null) ? objP instanceof on ? ((on) objP).a : vj0Var.p() : thE;
    }
}
