package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qe1 extends rj0 {
    public final sj0 l;

    public qe1(sj0 sj0Var) {
        this.l = sj0Var;
    }

    @Override // defpackage.rj0
    public final boolean r() {
        return false;
    }

    @Override // defpackage.rj0
    public final void s(Throwable th) throws IllegalAccessException, ly, InvocationTargetException {
        Object objP = q().P();
        boolean z = objP instanceof on;
        sj0 sj0Var = this.l;
        if (z) {
            sj0Var.g(xc.p(((on) objP).a));
        } else {
            sj0Var.g(s22.S(objP));
        }
    }
}
