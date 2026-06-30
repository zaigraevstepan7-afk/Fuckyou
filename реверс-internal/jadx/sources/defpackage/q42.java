package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q42 {
    public static final long a = z60.a(0.0f, 0.0f);
    public static final float b = 3.1415927f;

    public static final long a(float f, float f2) {
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        if (fSqrt > 0.0f) {
            return z60.a(f / fSqrt, f2 / fSqrt);
        }
        yc.p("Required distance greater than zero");
        return 0L;
    }

    public static final float b(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final float c(float f) {
        return ((f % 1.0f) + 1.0f) % 1.0f;
    }

    public static long d(float f, float f2) {
        double d = f2;
        return hk.N(hk.W(f, z60.a((float) Math.cos(d), (float) Math.sin(d))), a);
    }
}
