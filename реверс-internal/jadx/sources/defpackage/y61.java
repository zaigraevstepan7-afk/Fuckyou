package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class y61 implements hx {
    public boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(y61 y61Var, z61 z61Var) {
        y61Var.getClass();
        if (z61Var instanceof fw0) {
            ((fw0) z61Var).m(y61Var.e);
        }
    }

    public static void i(y61 y61Var, z61 z61Var, long j) {
        y61Var.getClass();
        a(y61Var, z61Var);
        z61Var.k0(oh0.c(j, z61Var.i), 0.0f, null);
    }

    public static void j(y61 y61Var, z61 z61Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (y61Var.e() == al0.e || y61Var.f() == 0) {
            a(y61Var, z61Var);
            z61Var.k0(oh0.c(j, z61Var.i), 0.0f, null);
        } else {
            int iF = (y61Var.f() - z61Var.e) - ((int) (j >> 32));
            a(y61Var, z61Var);
            z61Var.k0(oh0.c((((long) iF) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), z61Var.i), 0.0f, null);
        }
    }

    public static void k(y61 y61Var, z61 z61Var, int i, int i2, sa0 sa0Var, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = a71.b;
            sa0Var = zz0.q;
        }
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (y61Var.e() == al0.e || y61Var.f() == 0) {
            a(y61Var, z61Var);
            z61Var.k0(oh0.c(j, z61Var.i), 0.0f, sa0Var);
        } else {
            a(y61Var, z61Var);
            z61Var.k0(oh0.c((((long) ((y61Var.f() - z61Var.e) - ((int) (j >> 32)))) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), z61Var.i), 0.0f, sa0Var);
        }
    }

    public static void m(y61 y61Var, z61 z61Var, int i, int i2, sa0 sa0Var) {
        y61Var.getClass();
        a(y61Var, z61Var);
        z61Var.k0(oh0.c((((long) i2) & 4294967295L) | (((long) i) << 32), z61Var.i), 0.0f, sa0Var);
    }

    public float c(xd0 xd0Var) {
        return Float.NaN;
    }

    public abstract al0 e();

    public abstract int f();

    public final void g(z61 z61Var, int i, int i2, float f) {
        a(this, z61Var);
        z61Var.k0(oh0.c((((long) i2) & 4294967295L) | (((long) i) << 32), z61Var.i), f, null);
    }
}
