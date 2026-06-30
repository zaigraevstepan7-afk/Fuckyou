package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class m12 {
    public k31 a;
    public long b;

    public m12(long j, k31 k31Var) {
        this.a = k31Var;
        this.b = j;
    }

    public static long a(m12 m12Var, long j, float f) {
        long jE = w01.e(m12Var.b, j);
        m12Var.b = jE;
        if ((m12Var.a == null ? w01.c(jE) : Math.abs(m12Var.b(jE))) < f) {
            return 9205357640488583168L;
        }
        k31 k31Var = m12Var.a;
        long j2 = m12Var.b;
        if (k31Var == null) {
            float fC = w01.c(j2);
            return w01.d(m12Var.b, w01.f(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / fC)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / fC)) & 4294967295L)));
        }
        float fB = m12Var.b(j2) - (Math.signum(m12Var.b(m12Var.b)) * f);
        long j3 = m12Var.b;
        k31 k31Var2 = m12Var.a;
        k31 k31Var3 = k31.f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (k31Var2 == k31Var3 ? j3 & 4294967295L : j3 >> 32));
        if (m12Var.a == k31Var3) {
            return (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.a == k31.f ? j >> 32 : j & 4294967295L));
    }

    public /* synthetic */ m12(k31 k31Var) {
        this(0L, k31Var);
    }
}
