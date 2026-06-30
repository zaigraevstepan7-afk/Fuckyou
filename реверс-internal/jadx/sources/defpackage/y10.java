package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class y10 extends g41 {
    public final ym1 e;
    public final xg0 f;

    public y10(ym1 ym1Var, tm1 tm1Var, xg0 xg0Var) {
        this.e = ym1Var;
        this.f = xg0Var;
    }

    @Override // defpackage.g41
    public final long e() {
        return 9205357640488583168L;
    }

    @Override // defpackage.g41
    public final void f(sl0 sl0Var) {
        xg0 xg0Var = this.f;
        ym1 ym1Var = this.e;
        long jD = sl0Var.e.d();
        al0 layoutDirection = sl0Var.getLayoutDirection();
        synchronized (xg0Var) {
            b8 b8Var = (b8) xg0Var.g;
            if (b8Var == null) {
                b8 b8Var2 = new b8(pv.w, 0L, al0.e, 1.0f, null);
                xg0Var.g = b8Var2;
                b8Var = b8Var2;
            }
            b8Var.a = ym1Var;
            b8Var.b = jD;
            b8Var.c = layoutDirection;
            b8Var.d = sl0Var.e.b();
            throw null;
        }
    }

    @Override // defpackage.g41
    public final void a(float f) {
    }

    @Override // defpackage.g41
    public final void b(wl wlVar) {
    }
}
