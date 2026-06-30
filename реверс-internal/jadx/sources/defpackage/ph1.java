package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ph1 implements vo0, AutoCloseable {
    public final String e;
    public final oh1 f;
    public boolean g;

    public ph1(String str, oh1 oh1Var) {
        this.e = str;
        this.f = oh1Var;
    }

    public final void d(zo0 zo0Var, n81 n81Var) {
        n81Var.getClass();
        zo0Var.getClass();
        if (this.g) {
            yc.l("Already attached to lifecycleOwner");
            return;
        }
        this.g = true;
        zo0Var.a(this);
        n81Var.n(this.e, (un) this.f.a.e);
    }

    @Override // defpackage.vo0
    public final void e(xo0 xo0Var, po0 po0Var) {
        if (po0Var == po0.ON_DESTROY) {
            this.g = false;
            xo0Var.g().f(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
