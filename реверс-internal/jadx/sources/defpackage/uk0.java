package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uk0 implements id1, pt {
    public final lt e;
    public final wa0 f;
    public final js g;
    public jr1 h;

    public uk0(lt ltVar, wa0 wa0Var) {
        this.e = ltVar;
        this.f = wa0Var;
        this.g = bl.d(ltVar.j(this));
    }

    @Override // defpackage.id1
    public final void c() {
        jr1 jr1Var = this.h;
        if (jr1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            jr1Var.a(cancellationException);
        }
        this.h = nu0.A(this.g, null, null, this.f, 3);
    }

    @Override // defpackage.id1
    public final void d() {
        jr1 jr1Var = this.h;
        if (jr1Var != null) {
            jr1Var.D(new fa0(1));
        }
        this.h = null;
    }

    @Override // defpackage.id1
    public final void e() {
        jr1 jr1Var = this.h;
        if (jr1Var != null) {
            jr1Var.D(new fa0(1));
        }
        this.h = null;
    }

    @Override // defpackage.jt
    public final kt getKey() {
        return v20.A;
    }

    @Override // defpackage.lt
    public final lt j(lt ltVar) {
        return hk.L(this, ltVar);
    }

    @Override // defpackage.lt
    public final jt l(kt ktVar) {
        return hk.v(this, ktVar);
    }

    @Override // defpackage.pt
    public final void o(lt ltVar, Throwable th) throws Throwable {
        rp rpVar = (rp) ltVar.l(rp.f);
        if (rpVar != null) {
            bl.U(th, new f8(5, rpVar, this));
        }
        pt ptVar = (pt) this.e.l(v20.A);
        if (ptVar == null) {
            throw th;
        }
        ptVar.o(ltVar, th);
    }

    @Override // defpackage.lt
    public final Object q(wa0 wa0Var, Object obj) {
        return wa0Var.h(obj, this);
    }

    @Override // defpackage.lt
    public final lt u(kt ktVar) {
        return hk.J(this, ktVar);
    }
}
