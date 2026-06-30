package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class p32 extends ui1 {
    public final ThreadLocal k;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public p32(ks ksVar, lt ltVar) {
        bj bjVar = bj.g;
        super(ksVar, ltVar.l(bjVar) == null ? ltVar.j(bjVar) : ltVar);
        this.k = new ThreadLocal();
        if (ksVar.e().l(v20.z) instanceof ot) {
            return;
        }
        Object objM = xi0.M(ltVar, null);
        xi0.G(ltVar, objM);
        s0(ltVar, objM);
    }

    @Override // defpackage.ui1, defpackage.vj0
    public final void A(Object obj) {
        r0();
        Object objQ = hk.Q(obj);
        ks ksVar = this.j;
        lt ltVarE = ksVar.e();
        Object objM = xi0.M(ltVarE, null);
        p32 p32VarP0 = objM != xi0.b0 ? lk.p0(ksVar, ltVarE, objM) : null;
        try {
            ksVar.g(objQ);
            if (p32VarP0 == null || p32VarP0.q0()) {
                xi0.G(ltVarE, objM);
            }
        } catch (Throwable th) {
            if (p32VarP0 == null || p32VarP0.q0()) {
                xi0.G(ltVarE, objM);
            }
            throw th;
        }
    }

    @Override // defpackage.ui1
    public final void p0() {
        r0();
    }

    public final boolean q0() {
        boolean z = this.threadLocalIsSet && this.k.get() == null;
        this.k.remove();
        return !z;
    }

    public final void r0() {
        if (this.threadLocalIsSet) {
            j41 j41Var = (j41) this.k.get();
            if (j41Var != null) {
                xi0.G((lt) j41Var.e, j41Var.f);
            }
            this.k.remove();
        }
    }

    public final void s0(lt ltVar, Object obj) {
        this.threadLocalIsSet = true;
        this.k.set(new j41(ltVar, obj));
    }
}
