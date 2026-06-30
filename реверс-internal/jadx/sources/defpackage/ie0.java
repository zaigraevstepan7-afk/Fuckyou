package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ie0 extends sv0 implements p81 {
    public jx0 s;
    public ce0 t;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object L0(ie0 ie0Var, ls lsVar) throws Throwable {
        fe0 fe0Var;
        ce0 ce0Var;
        if (lsVar instanceof fe0) {
            fe0Var = (fe0) lsVar;
            int i = fe0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fe0Var.k = i - Integer.MIN_VALUE;
            } else {
                fe0Var = new fe0(ie0Var, lsVar);
            }
        }
        Object obj = fe0Var.i;
        int i2 = fe0Var.k;
        if (i2 == 0) {
            xc.G(obj);
            if (ie0Var.t == null) {
                ce0 ce0Var2 = new ce0();
                jx0 jx0Var = ie0Var.s;
                fe0Var.h = ce0Var2;
                fe0Var.k = 1;
                Object objA = jx0Var.a(ce0Var2, fe0Var);
                wt wtVar = wt.e;
                if (objA == wtVar) {
                    return wtVar;
                }
                ce0Var = ce0Var2;
            }
            return t32.a;
        }
        if (i2 != 1) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ce0Var = fe0Var.h;
        xc.G(obj);
        ie0Var.t = ce0Var;
        return t32.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object M0(ie0 ie0Var, ls lsVar) throws Throwable {
        ge0 ge0Var;
        if (lsVar instanceof ge0) {
            ge0Var = (ge0) lsVar;
            int i = ge0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ge0Var.j = i - Integer.MIN_VALUE;
            } else {
                ge0Var = new ge0(ie0Var, lsVar);
            }
        }
        Object obj = ge0Var.h;
        int i2 = ge0Var.j;
        if (i2 == 0) {
            xc.G(obj);
            ce0 ce0Var = ie0Var.t;
            if (ce0Var != null) {
                de0 de0Var = new de0(ce0Var);
                jx0 jx0Var = ie0Var.s;
                ge0Var.j = 1;
                Object objA = jx0Var.a(de0Var, ge0Var);
                wt wtVar = wt.e;
                if (objA == wtVar) {
                    return wtVar;
                }
            }
            return t32.a;
        }
        if (i2 != 1) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xc.G(obj);
        ie0Var.t = null;
        return t32.a;
    }

    @Override // defpackage.sv0
    public final void E0() {
        N0();
    }

    @Override // defpackage.p81
    public final void I(e81 e81Var, f81 f81Var, long j) {
        if (f81Var == f81.f) {
            int i = e81Var.f;
            ks ksVar = null;
            if (i == 4) {
                nu0.A(z0(), null, null, new he0(this, ksVar, 0), 3);
            } else if (i == 5) {
                nu0.A(z0(), null, null, new he0(this, ksVar, 1), 3);
            }
        }
    }

    public final void N0() {
        ce0 ce0Var = this.t;
        if (ce0Var != null) {
            this.s.b(new de0(ce0Var));
            this.t = null;
        }
    }

    @Override // defpackage.p81
    public final void h0() {
        N0();
    }
}
