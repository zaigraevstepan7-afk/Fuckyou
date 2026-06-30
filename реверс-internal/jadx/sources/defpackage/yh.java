package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yh {
    public static final float a;
    public static final float b;
    public static final e41 c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;
    public static final float j;
    public static final float k;
    public static final float l;
    public static final float m;

    static {
        float f2 = u4.x0;
        float f3 = u4.y0;
        a = c2.d;
        b = c2.f;
        c = new e41(f2, 8.0f, f3, 8.0f);
        xi0.f(16.0f, 8.0f, f3, 8.0f);
        xi0.f(12.0f, 8.0f, 12.0f, 8.0f);
        xi0.f(12.0f, 8.0f, 16.0f, 8.0f);
        d = 58.0f;
        e = 56.0f;
        f = 96.0f;
        g = 136.0f;
        h = pv.E;
        i = pv.F;
        j = 16.0f;
        k = 32.0f;
        l = u4.z0;
        m = u4.A0;
    }

    public static e41 a(float f2) {
        if (tz.a(f2, b()) < 0) {
            return new e41(12.0f, 6.0f, 12.0f, 6.0f);
        }
        if (tz.a(f2, e) < 0) {
            v41 v41Var = a91.a;
            return new e41(a, ((Boolean) v41Var.getValue()).booleanValue() ? 8.0f : 10.0f, b, ((Boolean) v41Var.getValue()).booleanValue() ? 8.0f : 10.0f);
        }
        if (tz.a(f2, f) < 0) {
            float f3 = h;
            float f4 = j;
            return new e41(f3, f4, i, f4);
        }
        if (tz.a(f2, g) >= 0) {
            return new e41(wi0.L, 48.0f, wi0.M, 48.0f);
        }
        float f5 = l;
        float f6 = k;
        return new e41(f5, f6, m, f6);
    }

    public static float b() {
        return ((Boolean) a91.a.getValue()).booleanValue() ? 36.0f : 40.0f;
    }

    public static gi c(ob0 ob0Var) {
        pn1 pn1Var = ((ju0) ob0Var.j(mu0.b)).c;
        gi giVar = pn1Var.i;
        if (giVar != null) {
            return giVar;
        }
        gi giVar2 = new gi(qn1.a(pn1Var, c2.c), qn1.a(pn1Var, c2.e));
        pn1Var.i = giVar2;
        return giVar2;
    }
}
