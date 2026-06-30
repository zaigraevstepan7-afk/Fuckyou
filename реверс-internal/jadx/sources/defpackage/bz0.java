package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class bz0 {
    public wy0 a;
    public boolean b;

    public final void a() {
        wy0 wy0Var = this.a;
        if (wy0Var == null) {
            yc.l("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            wy0Var.e(this, null);
        }
        wy0Var.d();
        if (wy0Var.c) {
            cz0 cz0Var = wy0Var.d;
            i2 i2Var = wy0Var.a;
            cz0Var.getClass();
            if (equals(cz0Var.h) && -1 == cz0Var.g) {
                yy0 yy0VarC = cz0Var.f;
                if (yy0VarC == null) {
                    yy0VarC = cz0Var.c(-1);
                }
                cz0Var.f = null;
                cz0Var.g = 0;
                cz0Var.h = null;
                if (yy0VarC != null) {
                    yy0VarC.c();
                } else if (i2Var != null) {
                    ((n11) i2Var.a).a.run();
                }
                qs1 qs1Var = cz0Var.a;
                qs1Var.getClass();
                qs1Var.k(null, dz0.d);
            }
        }
        this.b = false;
    }

    public void c() {
    }

    public void b(boolean z) {
    }
}
