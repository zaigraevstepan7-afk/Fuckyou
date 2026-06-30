package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ty0 implements vi, a72 {
    public final xi e;
    public final /* synthetic */ uy0 f;

    public ty0(uy0 uy0Var, xi xiVar) {
        this.f = uy0Var;
        this.e = xiVar;
    }

    @Override // defpackage.a72
    public final void a(ek1 ek1Var, int i) {
        this.e.a(ek1Var, i);
    }

    @Override // defpackage.ks
    public final lt e() {
        return this.e.i;
    }

    @Override // defpackage.ks
    public final void g(Object obj) throws IllegalAccessException, ly, InvocationTargetException {
        this.e.g(obj);
    }

    @Override // defpackage.vi
    public final s30 k(Object obj, xa0 xa0Var) {
        uy0 uy0Var = this.f;
        wi wiVar = new wi(uy0Var, this);
        s30 s30VarJ = this.e.J((t32) obj, wiVar);
        if (s30VarJ != null) {
            uy0.i.set(uy0Var, null);
        }
        return s30VarJ;
    }

    @Override // defpackage.vi
    public final boolean m(Throwable th) {
        return this.e.m(th);
    }

    @Override // defpackage.vi
    public final void z(Object obj) throws ly {
        this.e.z(obj);
    }
}
