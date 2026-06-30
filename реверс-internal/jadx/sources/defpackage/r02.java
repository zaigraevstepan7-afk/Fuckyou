package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class r02 {
    public final hx0 a;
    public q02 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public r02() {
        hx0 hx0Var = nh0.a;
        this.a = new hx0();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(q02 q02Var, long j, long j2, float[] fArr, long j3) {
        long j4 = q02Var.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            q02Var.g = j3;
            q02Var.a(q02Var.e, q02Var.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (oh0.a(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!oh0.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
