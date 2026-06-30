package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vi0 extends si0 {
    public ri0 t;
    public boolean u;

    @Override // defpackage.si0
    public final long L0(pu0 pu0Var, long j) {
        int iO = this.t == ri0.e ? pu0Var.O(kr.g(j)) : pu0Var.U(kr.g(j));
        if (iO < 0) {
            iO = 0;
        }
        if (iO < 0) {
            pg0.a("width must be >= 0");
        }
        return lr.h(iO, iO, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.si0
    public final boolean M0() {
        return this.u;
    }

    @Override // defpackage.si0, defpackage.il0
    public final int O(ws0 ws0Var, pu0 pu0Var, int i) {
        return this.t == ri0.e ? pu0Var.O(i) : pu0Var.U(i);
    }

    @Override // defpackage.si0, defpackage.il0
    public final int f(ws0 ws0Var, pu0 pu0Var, int i) {
        return this.t == ri0.e ? pu0Var.O(i) : pu0Var.U(i);
    }
}
