package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class qj extends nj {
    public final f70 h;

    public qj(f70 f70Var, lt ltVar, int i, ph phVar) {
        super(ltVar, i, phVar);
        this.h = f70Var;
    }

    @Override // defpackage.nj
    public final Object a(ya1 ya1Var, ks ksVar) {
        Object objF = f(new jm1(ya1Var), ksVar);
        return objF == wt.e ? objF : t32.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    @Override // defpackage.nj, defpackage.f70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(g70 g70Var, ks ksVar) throws Throwable {
        int i = this.f;
        wt wtVar = wt.e;
        if (i == -3) {
            lt ltVarE = ksVar.e();
            Boolean bool = Boolean.FALSE;
            pc pcVar = new pc(19, (byte) 0);
            lt ltVar = this.e;
            lt ltVarJ = !((Boolean) ltVar.q(pcVar, bool)).booleanValue() ? ltVarE.j(ltVar) : lk.J(ltVarE, ltVar, false);
            if (xi0.o(ltVarJ, ltVarE)) {
                Object objF = f(g70Var, ksVar);
                if (objF == wtVar) {
                    return objF;
                }
            } else {
                v20 v20Var = v20.z;
                if (xi0.o(ltVarJ.l(v20Var), ltVarE.l(v20Var))) {
                    lt ltVarE2 = ksVar.e();
                    if (!(g70Var instanceof jm1) && !(g70Var instanceof m01)) {
                        g70Var = new ma(g70Var, ltVarE2);
                    }
                    Object objN = xi0.N(ltVarJ, g70Var, xi0.J(ltVarJ), new e(this, null, 7), ksVar);
                    if (objN == wtVar) {
                        return objN;
                    }
                } else {
                    Object objC = super.c(g70Var, ksVar);
                    if (objC == wtVar) {
                        return objC;
                    }
                }
            }
        }
        return t32.a;
    }

    public abstract Object f(g70 g70Var, ks ksVar);

    @Override // defpackage.nj
    public final String toString() {
        return this.h + " -> " + super.toString();
    }
}
