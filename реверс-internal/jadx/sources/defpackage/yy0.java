package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class yy0 {
    public xk a;
    public boolean b;
    public wy0 c;

    public final boolean a() {
        wy0 wy0Var = this.c;
        if (wy0Var == null || wy0Var.c) {
            return this.b;
        }
        return false;
    }

    public abstract void c();

    public void e(vy0 vy0Var) {
        vy0Var.getClass();
    }

    public final void f() {
        wy0 wy0Var = this.c;
        if (wy0Var == null || !wy0Var.f.h(this)) {
            return;
        }
        cz0 cz0Var = wy0Var.d;
        cz0Var.getClass();
        if (equals(cz0Var.f)) {
            if (cz0Var.g == -1) {
                b();
            }
            cz0Var.f = null;
            cz0Var.g = 0;
            cz0Var.h = null;
        }
        cz0Var.d.remove(this);
        cz0Var.e.remove(this);
        this.c = null;
        cz0Var.b();
    }

    public final void g(boolean z) {
        cz0 cz0Var;
        if (this.b == z) {
            return;
        }
        this.b = z;
        wy0 wy0Var = this.c;
        if (wy0Var == null || (cz0Var = wy0Var.d) == null) {
            return;
        }
        cz0Var.b();
    }

    public void b() {
    }

    public void d(vy0 vy0Var) {
    }
}
