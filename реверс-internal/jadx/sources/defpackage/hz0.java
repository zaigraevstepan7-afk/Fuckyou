package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hz0 extends sp1 {
    public final sa0 e;
    public final sp1 f;

    public hz0(long j, yp1 yp1Var, sa0 sa0Var, sp1 sp1Var) {
        super(j, yp1Var);
        this.e = sa0Var;
        this.f = sp1Var;
        sp1Var.k();
    }

    @Override // defpackage.sp1
    public final void c() {
        sp1 sp1Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != sp1Var.g()) {
            a();
        }
        sp1Var.l();
        this.c = true;
        synchronized (aq1.c) {
            o();
        }
    }

    @Override // defpackage.sp1
    public final sa0 e() {
        return this.e;
    }

    @Override // defpackage.sp1
    public final boolean f() {
        return true;
    }

    @Override // defpackage.sp1
    public final sa0 i() {
        return null;
    }

    @Override // defpackage.sp1
    public final void k() {
        xi0.L();
        throw null;
    }

    @Override // defpackage.sp1
    public final void l() {
        xi0.L();
        throw null;
    }

    @Override // defpackage.sp1
    public final void n(vs1 vs1Var) {
        fi1 fi1Var = aq1.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.sp1
    public final sp1 u(sa0 sa0Var) {
        return new hz0(this.b, this.a, aq1.k(sa0Var, this.e, true), this.f);
    }

    @Override // defpackage.sp1
    public final void m() {
    }
}
