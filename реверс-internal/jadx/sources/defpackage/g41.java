package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g41 {
    public p6 a;
    public wl b;
    public float c = 1.0f;
    public al0 d = al0.e;

    public abstract void a(float f);

    public abstract void b(wl wlVar);

    public final void c(sl0 sl0Var, long j, float f, wl wlVar) {
        ej ejVar = sl0Var.e;
        if (this.c != f) {
            a(f);
            this.c = f;
        }
        if (!xi0.o(this.b, wlVar)) {
            b(wlVar);
            this.b = wlVar;
        }
        al0 layoutDirection = sl0Var.getLayoutDirection();
        if (this.d != layoutDirection) {
            this.d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ejVar.d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ejVar.d() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((qt0) ejVar.f.a).t(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    f(sl0Var);
                }
            } finally {
                ((qt0) ejVar.f.a).t(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract long e();

    public abstract void f(sl0 sl0Var);
}
