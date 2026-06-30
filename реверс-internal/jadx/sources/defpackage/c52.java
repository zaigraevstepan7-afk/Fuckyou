package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class c52 extends g41 {
    public final v41 e = xc.B(new io1(0));
    public final v41 f = xc.B(Boolean.FALSE);
    public final w42 g;
    public final v41 h;
    public float i;
    public wl j;

    public c52(xc0 xc0Var) {
        w42 w42Var = new w42(xc0Var);
        w42Var.f = new a7(16, this);
        this.g = w42Var;
        this.h = new v41(t32.a, v20.S);
        this.i = 1.0f;
    }

    @Override // defpackage.g41
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.g41
    public final void b(wl wlVar) {
        this.j = wlVar;
    }

    @Override // defpackage.g41
    public final long e() {
        return ((io1) this.e.getValue()).a;
    }

    @Override // defpackage.g41
    public final void f(sl0 sl0Var) {
        ej ejVar = sl0Var.e;
        wl wlVar = this.j;
        w42 w42Var = this.g;
        if (wlVar == null) {
            wlVar = (wl) w42Var.g.getValue();
        }
        if (((Boolean) this.f.getValue()).booleanValue() && sl0Var.getLayoutDirection() == al0.f) {
            long jS = ejVar.S();
            oc ocVar = ejVar.f;
            long jQ = ocVar.q();
            ocVar.i().l();
            try {
                ((qt0) ocVar.a).x(-1.0f, 1.0f, jS);
                w42Var.e(sl0Var, this.i, wlVar);
            } finally {
                s91.r(ocVar, jQ);
            }
        } else {
            w42Var.e(sl0Var, this.i, wlVar);
        }
        this.h.getValue();
    }
}
