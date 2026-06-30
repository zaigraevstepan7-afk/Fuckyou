package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public interface hx {
    default float J(long j) {
        if (!h02.a(g02.b(j), 4294967296L)) {
            pg0.b("Only Sp can convert to Px");
        }
        float[] fArr = w90.a;
        if (l() < 1.03f) {
            return l() * g02.c(j);
        }
        v90 v90VarA = w90.a(l());
        if (v90VarA != null) {
            return v90VarA.b(g02.c(j));
        }
        return l() * g02.c(j);
    }

    default int N(float f) {
        float fY = y(f);
        if (Float.isInfinite(fY)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fY);
    }

    default long X(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fY = y(wz.b(j));
        float fY2 = y(wz.a(j));
        return (((long) Float.floatToRawIntBits(fY)) << 32) | (((long) Float.floatToRawIntBits(fY2)) & 4294967295L);
    }

    float b();

    default float d0(long j) {
        if (!h02.a(g02.b(j), 4294967296L)) {
            pg0.b("Only Sp can convert to Px");
        }
        return y(J(j));
    }

    float l();

    default long m0(float f) {
        return v(v0(f));
    }

    default float s0(int i) {
        return i / b();
    }

    default long v(float f) {
        float[] fArr = w90.a;
        if (l() < 1.03f) {
            return uc1.y(f / l(), 4294967296L);
        }
        v90 v90VarA = w90.a(l());
        return uc1.y(v90VarA != null ? v90VarA.a(f) : f / l(), 4294967296L);
    }

    default float v0(float f) {
        return f / b();
    }

    default long w(long j) {
        if (j != 9205357640488583168L) {
            return bk.c(v0(Float.intBitsToFloat((int) (j >> 32))), v0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float y(float f) {
        return b() * f;
    }
}
