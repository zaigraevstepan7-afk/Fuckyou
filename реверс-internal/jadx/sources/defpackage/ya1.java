package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ya1 extends s implements mj, im1 {
    public final rh j;

    public ya1(lt ltVar, rh rhVar) {
        super(ltVar, true);
        this.j = rhVar;
    }

    @Override // defpackage.vj0
    public final void D(CancellationException cancellationException) {
        this.j.g(cancellationException, true);
        C(cancellationException);
    }

    @Override // defpackage.vj0, defpackage.oj0
    public final void a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new pj0(F(), null, this);
        }
        D(cancellationException);
    }

    @Override // defpackage.im1
    public final Object c(ks ksVar, Object obj) {
        return this.j.c(ksVar, obj);
    }

    @Override // defpackage.mj
    public final qh iterator() {
        rh rhVar = this.j;
        rhVar.getClass();
        return new qh(rhVar);
    }

    @Override // defpackage.s
    public final void m0(Throwable th, boolean z) throws IllegalAccessException, InvocationTargetException {
        if (this.j.g(th, false) || z) {
            return;
        }
        al.B(this.i, th);
    }

    @Override // defpackage.mj
    public final Object n(zu1 zu1Var) {
        rh rhVar = this.j;
        rhVar.getClass();
        return rh.D(rhVar, zu1Var);
    }

    @Override // defpackage.s
    public final void n0(Object obj) {
        this.j.g(null, false);
    }

    @Override // defpackage.mj
    public final Object r() {
        return this.j.r();
    }

    @Override // defpackage.im1
    public final Object t(Object obj) {
        return this.j.t(obj);
    }
}
