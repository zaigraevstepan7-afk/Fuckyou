package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yg1 extends ls implements g70 {
    public final g70 h;
    public final lt i;
    public final int j;
    public lt k;
    public ks l;

    public yg1(g70 g70Var, lt ltVar) {
        super(nn.g, d40.e);
        this.h = g70Var;
        this.i = ltVar;
        this.j = ((Number) ltVar.q(new pc(24, (byte) 0), 0)).intValue();
    }

    @Override // defpackage.ye, defpackage.xt
    public final xt d() {
        ks ksVar = this.l;
        if (ksVar instanceof xt) {
            return (xt) ksVar;
        }
        return null;
    }

    @Override // defpackage.ls, defpackage.ks
    public final lt e() {
        lt ltVar = this.k;
        return ltVar == null ? d40.e : ltVar;
    }

    @Override // defpackage.g70
    public final Object l(Object obj, ks ksVar) {
        try {
            Object objS = s(ksVar, obj);
            return objS == wt.e ? objS : t32.a;
        } catch (Throwable th) {
            this.k = new sz(ksVar.e(), th);
            throw th;
        }
    }

    @Override // defpackage.ye
    public final StackTraceElement p() {
        return null;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        Throwable thA = pe1.a(obj);
        if (thA != null) {
            this.k = new sz(e(), thA);
        }
        ks ksVar = this.l;
        if (ksVar != null) {
            ksVar.g(obj);
        }
        return wt.e;
    }

    public final Object s(ks ksVar, Object obj) {
        lt ltVarE = ksVar.e();
        bk.t(ltVarE);
        lt ltVar = this.k;
        if (ltVar != ltVarE) {
            if (ltVar instanceof sz) {
                throw new IllegalStateException(dt1.G("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((sz) ltVar).f + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) ltVarE.q(new ud(13, this), 0)).intValue() != this.j) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.i + ",\n\t\tbut emission happened in " + ltVarE + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.k = ltVarE;
        }
        this.l = ksVar;
        xa0 xa0Var = ah1.a;
        g70 g70Var = this.h;
        g70Var.getClass();
        Object objF = xa0Var.f(g70Var, obj, this);
        if (!xi0.o(objF, wt.e)) {
            this.l = null;
        }
        return objF;
    }
}
