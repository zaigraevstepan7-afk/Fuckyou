package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wy0 {
    public final i2 a;
    public boolean b;
    public boolean c = true;
    public final cz0 d = new cz0();
    public final tx0 e = j31.a();
    public final tx0 f = j31.a();
    public final tx0 g = j31.a();

    public wy0(i2 i2Var) {
        this.a = i2Var;
    }

    public static void a(wy0 wy0Var, yy0 yy0Var) {
        wy0Var.getClass();
        yy0Var.getClass();
        wy0Var.d();
        if (wy0Var.f.a(yy0Var)) {
            cz0 cz0Var = wy0Var.d;
            cz0Var.getClass();
            if (yy0Var.c != null) {
                yc.f(yy0Var, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            cz0Var.e.addFirst(yy0Var);
            yy0Var.c = wy0Var;
            cz0Var.b();
        }
    }

    public final void b(bz0 bz0Var) {
        d();
        if (this.g.a(bz0Var)) {
            this.d.a(this, bz0Var, -1);
        }
    }

    public final void c(g11 g11Var, int i) {
        d();
        if (i != 1 && i != 0) {
            yc.e(s91.i("Unsupported priority value: ", i));
        } else if (this.g.a(g11Var)) {
            this.d.a(this, g11Var, i);
        }
    }

    public final void d() {
        if (this.b) {
            yc.l("This NavigationEventDispatcher has already been disposed and cannot be used.");
        }
    }

    public final void e(bz0 bz0Var, vy0 vy0Var) {
        d();
        if (this.c) {
            cz0 cz0Var = this.d;
            cz0Var.getClass();
            if (cz0Var.g != 0) {
                return;
            }
            yy0 yy0VarC = cz0Var.c(-1);
            cz0Var.f = yy0VarC;
            cz0Var.g = -1;
            cz0Var.h = bz0Var;
            if (vy0Var != null) {
                if (yy0VarC != null) {
                    yy0VarC.e(vy0Var);
                }
                qs1 qs1Var = cz0Var.a;
                ez0 ez0Var = new ez0(vy0Var);
                qs1Var.getClass();
                qs1Var.k(null, ez0Var);
            }
        }
    }
}
