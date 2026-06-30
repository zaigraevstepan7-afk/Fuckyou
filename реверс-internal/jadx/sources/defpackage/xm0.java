package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xm0 {
    public final Object a;
    public final ym0 b;
    public int d;
    public xm0 e;
    public boolean f;
    public int c = -1;
    public final v41 g = xc.B(null);

    public xm0(Object obj, ym0 ym0Var) {
        this.a = obj;
        this.b = ym0Var;
    }

    public final xm0 a() {
        if (this.f) {
            qg0.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.e.add(this);
            xm0 xm0Var = (xm0) this.g.getValue();
            if (xm0Var != null) {
                xm0Var.a();
            } else {
                xm0Var = null;
            }
            this.e = xm0Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            qg0.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            c();
        }
    }

    public final void c() {
        this.b.e.remove(this);
        xm0 xm0Var = this.e;
        if (xm0Var != null) {
            xm0Var.b();
        }
        this.e = null;
    }
}
