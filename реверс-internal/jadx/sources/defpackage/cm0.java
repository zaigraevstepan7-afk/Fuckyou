package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cm0 implements iu1 {
    public final ix0 a;
    public final /* synthetic */ em0 b;
    public final /* synthetic */ Object c;

    public cm0(em0 em0Var, Object obj) {
        this.b = em0Var;
        this.c = obj;
        int[] iArr = uh0.a;
        this.a = new ix0();
    }

    @Override // defpackage.iu1
    public final void a() {
        em0.c(this.b, this.c);
    }

    @Override // defpackage.iu1
    public final void b(rk rkVar) {
        xz0 xz0Var;
        ql0 ql0Var = (ql0) this.b.n.g(this.c);
        sv0 sv0Var = (ql0Var == null || (xz0Var = ql0Var.I) == null) ? null : xz0Var.f;
        if (sv0Var == null || !sv0Var.r) {
            return;
        }
        pd1.v(sv0Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", rkVar);
    }

    @Override // defpackage.iu1
    public final int c() {
        ql0 ql0Var = (ql0) this.b.n.g(this.c);
        if (ql0Var != null) {
            return ((iy0) ((qx0) ql0Var.n()).f).g;
        }
        return 0;
    }

    @Override // defpackage.iu1
    public final void d(int i, long j) {
        em0 em0Var = this.b;
        ql0 ql0Var = (ql0) em0Var.n.g(this.c);
        if (ql0Var == null || !ql0Var.J()) {
            return;
        }
        int i2 = ((iy0) ((qx0) ql0Var.n()).f).g;
        if (i < 0 || i >= i2) {
            ng0.d("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (ql0Var.K()) {
            ng0.a("Pre-measure called on node that is not placed");
        }
        ql0 ql0Var2 = em0Var.e;
        ql0Var2.t = true;
        ((h4) tl0.a(ql0Var)).s((ql0) ((qx0) ql0Var.n()).get(i), j);
        ql0Var2.t = false;
        this.a.a(i);
    }
}
