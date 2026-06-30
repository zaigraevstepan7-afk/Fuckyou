package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gc0 extends ey0 {
    @Override // defpackage.ey0
    public final ey0 C(sa0 sa0Var, sa0 sa0Var2) {
        return (ey0) ((sp1) aq1.e(new tq(new cr(2, sa0Var, sa0Var2), 3)));
    }

    @Override // defpackage.ey0, defpackage.sp1
    public final void c() {
        synchronized (aq1.c) {
            o();
        }
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
        aq1.a();
    }

    @Override // defpackage.ey0, defpackage.sp1
    public final sp1 u(sa0 sa0Var) {
        return (ac1) ((sp1) aq1.e(new tq(new fc0(sa0Var, 0), 3)));
    }

    @Override // defpackage.ey0
    public final kd1 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
