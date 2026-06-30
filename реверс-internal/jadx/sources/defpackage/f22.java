package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class f22 extends ey0 {
    public final ey0 o;
    public final boolean p;
    public final boolean q;
    public sa0 r;
    public sa0 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public f22(ey0 ey0Var, sa0 sa0Var, sa0 sa0Var2, boolean z, boolean z2) {
        sa0 sa0VarI;
        sa0 sa0VarE;
        fi1 fi1Var = aq1.a;
        super(0L, yp1.i, aq1.k(sa0Var, (ey0Var == null || (sa0VarE = ey0Var.e()) == null) ? aq1.j.e : sa0VarE, z), aq1.l(sa0Var2, (ey0Var == null || (sa0VarI = ey0Var.i()) == null) ? aq1.j.f : sa0VarI));
        this.o = ey0Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = xc.q();
    }

    @Override // defpackage.ey0
    public final void B(ay0 ay0Var) {
        xi0.L();
        throw null;
    }

    @Override // defpackage.ey0
    public final ey0 C(sa0 sa0Var, sa0 sa0Var2) {
        sa0 sa0VarK = aq1.k(sa0Var, this.r, true);
        sa0 sa0VarL = aq1.l(sa0Var2, this.s);
        return !this.p ? new f22(D().C(null, sa0VarL), sa0VarK, sa0VarL, false, true) : D().C(sa0VarK, sa0VarL);
    }

    public final ey0 D() {
        ey0 ey0Var = this.o;
        return ey0Var == null ? aq1.j : ey0Var;
    }

    @Override // defpackage.ey0, defpackage.sp1
    public final void c() {
        ey0 ey0Var;
        this.c = true;
        if (!this.q || (ey0Var = this.o) == null) {
            return;
        }
        ey0Var.c();
    }

    @Override // defpackage.sp1
    public final yp1 d() {
        return D().d();
    }

    @Override // defpackage.ey0, defpackage.sp1
    public final sa0 e() {
        return this.r;
    }

    @Override // defpackage.ey0, defpackage.sp1
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.sp1
    public final long g() {
        return D().g();
    }

    @Override // defpackage.ey0, defpackage.sp1
    public final int h() {
        return D().h();
    }

    @Override // defpackage.ey0, defpackage.sp1
    public final sa0 i() {
        return this.s;
    }

    @Override // defpackage.ey0, defpackage.sp1
    public final void k() {
        xi0.L();
        throw null;
    }

    @Override // defpackage.ey0, defpackage.sp1
    public final void l() {
        xi0.L();
        throw null;
    }

    @Override // defpackage.ey0, defpackage.sp1
    public final void m() {
        D().m();
    }

    @Override // defpackage.ey0, defpackage.sp1
    public final void n(vs1 vs1Var) {
        D().n(vs1Var);
    }

    @Override // defpackage.sp1
    public final void r(yp1 yp1Var) {
        xi0.L();
        throw null;
    }

    @Override // defpackage.sp1
    public final void s(long j) {
        xi0.L();
        throw null;
    }

    @Override // defpackage.ey0, defpackage.sp1
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.ey0, defpackage.sp1
    public final sp1 u(sa0 sa0Var) {
        sa0 sa0VarK = aq1.k(sa0Var, this.r, true);
        return !this.p ? aq1.g(D().u(null), sa0VarK, true) : D().u(sa0VarK);
    }

    @Override // defpackage.ey0
    public final kd1 w() {
        return D().w();
    }

    @Override // defpackage.ey0
    public final ay0 x() {
        return D().x();
    }

    @Override // defpackage.ey0
    /* JADX INFO: renamed from: y */
    public final sa0 e() {
        return this.r;
    }
}
