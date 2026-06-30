package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class oi0 extends si0 {
    public ri0 t;
    public boolean u;

    @Override // defpackage.si0, defpackage.il0
    public final int D(ws0 ws0Var, pu0 pu0Var, int i) {
        return this.t == ri0.e ? pu0Var.a0(i) : pu0Var.f(i);
    }

    @Override // defpackage.si0
    public final long L0(pu0 pu0Var, long j) {
        int iA0 = this.t == ri0.e ? pu0Var.a0(kr.h(j)) : pu0Var.f(kr.h(j));
        if (iA0 < 0) {
            iA0 = 0;
        }
        if (iA0 < 0) {
            pg0.a("height must be >= 0");
        }
        return lr.h(0, Integer.MAX_VALUE, iA0, iA0);
    }

    @Override // defpackage.si0
    public final boolean M0() {
        return this.u;
    }

    @Override // defpackage.si0, defpackage.il0
    public final int n(ws0 ws0Var, pu0 pu0Var, int i) {
        return this.t == ri0.e ? pu0Var.a0(i) : pu0Var.f(i);
    }
}
