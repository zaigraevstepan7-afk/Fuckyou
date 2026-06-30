package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ig1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;
    public final float h;
    public long i;

    public ig1(long j, long j2, long j3, ft ftVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        long jI = hk.I(j, j2);
        long jI2 = hk.I(j3, j2);
        float fZ = hk.z(jI);
        float fZ2 = hk.z(jI2);
        if (fZ <= 0.0f || fZ2 <= 0.0f) {
            this.d = z60.a(0.0f, 0.0f);
            this.e = z60.a(0.0f, 0.0f);
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 0.0f;
        } else {
            long jP = hk.p(fZ, jI);
            this.d = jP;
            long jP2 = hk.p(fZ2, jI2);
            this.e = jP2;
            float f = ftVar.a;
            this.f = f;
            this.g = 0.0f;
            float fQ = hk.q(jP, jP2);
            float f2 = q42.b;
            float fSqrt = (float) Math.sqrt(1.0f - (fQ * fQ));
            this.h = ((double) fSqrt) > 0.001d ? ((fQ + 1.0f) * f) / fSqrt : 0.0f;
        }
        this.i = z60.a(0.0f, 0.0f);
    }

    public static fu b(float f, float f2, long j, long j2, long j3, long j4, long j5, float f3) {
        long jI = hk.I(j2, j);
        float fZ = hk.z(jI);
        z60 z60Var = null;
        if (fZ <= 0.0f) {
            yc.p("Can't get the direction of a 0-length vector");
            return null;
        }
        long jP = hk.p(fZ, jI);
        long jN = hk.N(j, hk.W(1.0f + f2, hk.W(f, jP)));
        long jP2 = hk.p(2.0f, hk.N(j3, j4));
        long jA = z60.a(q42.b(hk.D(j3), hk.D(jP2), f2), q42.b(hk.E(j3), hk.E(jP2), f2));
        long jN2 = hk.N(j5, hk.W(f3, q42.a(hk.D(jA) - hk.D(j5), hk.E(jA) - hk.E(j5))));
        long jI2 = hk.I(jN2, j5);
        long jA2 = z60.a(-hk.E(jI2), hk.D(jI2));
        long jA3 = z60.a(-hk.E(jA2), hk.D(jA2));
        float fQ = hk.q(jP, jA3);
        if (Math.abs(fQ) >= 1.0E-4f) {
            float fQ2 = hk.q(hk.I(jN2, j2), jA3);
            if (Math.abs(fQ) >= Math.abs(fQ2) * 1.0E-4f) {
                z60Var = new z60(hk.N(j2, hk.W(fQ2 / fQ, jP)));
            }
        }
        long j6 = z60Var != null ? z60Var.a : j3;
        long jP3 = hk.p(3.0f, hk.N(jN, hk.W(2.0f, j6)));
        return new fu(new float[]{hk.D(jN), hk.E(jN), hk.D(jP3), hk.E(jP3), hk.D(j6), hk.E(j6), hk.D(jN2), hk.E(jN2)});
    }

    public final float a(float f) {
        float fC = c();
        float f2 = this.g;
        if (f > fC) {
            return f2;
        }
        float f3 = this.h;
        if (f > f3) {
            return ((f - f3) * f2) / (c() - f3);
        }
        return 0.0f;
    }

    public final float c() {
        return (1.0f + this.g) * this.h;
    }
}
