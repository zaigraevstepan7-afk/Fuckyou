package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public interface il0 extends xw {
    default int D(ws0 ws0Var, pu0 pu0Var, int i) {
        return e(new dj0(ws0Var, ws0Var.getLayoutDirection()), new ew(pu0Var, f01.e, g01.f, 2), lr.b(0, i, 0, 0, 13)).d();
    }

    default int O(ws0 ws0Var, pu0 pu0Var, int i) {
        return e(new dj0(ws0Var, ws0Var.getLayoutDirection()), new ew(pu0Var, f01.e, g01.e, 2), lr.b(0, 0, 0, i, 7)).g();
    }

    vu0 e(xu0 xu0Var, pu0 pu0Var, long j);

    default int f(ws0 ws0Var, pu0 pu0Var, int i) {
        return e(new dj0(ws0Var, ws0Var.getLayoutDirection()), new ew(pu0Var, f01.f, g01.e, 2), lr.b(0, 0, 0, i, 7)).g();
    }

    default int n(ws0 ws0Var, pu0 pu0Var, int i) {
        return e(new dj0(ws0Var, ws0Var.getLayoutDirection()), new ew(pu0Var, f01.f, g01.f, 2), lr.b(0, i, 0, 0, 13)).d();
    }
}
