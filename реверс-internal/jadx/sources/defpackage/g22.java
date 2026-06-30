package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class g22 extends sp1 {
    public final sp1 e;
    public final boolean f;
    public final boolean g;
    public sa0 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g22(sp1 sp1Var, sa0 sa0Var, boolean z, boolean z2) {
        sa0 sa0VarE;
        super(0L, yp1.i);
        fi1 fi1Var = aq1.a;
        this.e = sp1Var;
        this.f = z;
        this.g = z2;
        this.h = aq1.k(sa0Var, (sp1Var == null || (sa0VarE = sp1Var.e()) == null) ? aq1.j.e : sa0VarE, z);
        this.i = xc.q();
    }

    @Override // defpackage.sp1
    public final void c() {
        sp1 sp1Var;
        this.c = true;
        if (!this.g || (sp1Var = this.e) == null) {
            return;
        }
        sp1Var.c();
    }

    @Override // defpackage.sp1
    public final yp1 d() {
        return v().d();
    }

    @Override // defpackage.sp1
    public final sa0 e() {
        return this.h;
    }

    @Override // defpackage.sp1
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.sp1
    public final long g() {
        return v().g();
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
    public final void m() {
        v().m();
    }

    @Override // defpackage.sp1
    public final void n(vs1 vs1Var) {
        v().n(vs1Var);
    }

    @Override // defpackage.sp1
    public final sp1 u(sa0 sa0Var) {
        sa0 sa0VarK = aq1.k(sa0Var, this.h, true);
        return !this.f ? aq1.g(v().u(null), sa0VarK, true) : v().u(sa0VarK);
    }

    public final sp1 v() {
        sp1 sp1Var = this.e;
        return sp1Var == null ? aq1.j : sp1Var;
    }
}
