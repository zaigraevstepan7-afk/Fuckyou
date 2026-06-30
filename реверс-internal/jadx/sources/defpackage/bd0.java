package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bd0 implements y81 {
    public final b3 e;
    public final a11 f;
    public long g = 0;

    public bd0(b3 b3Var, a11 a11Var) {
        this.e = b3Var;
        this.f = a11Var;
    }

    @Override // defpackage.y81
    public final long a(sh0 sh0Var, long j, al0 al0Var, long j2) {
        long jA = this.f.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.g;
        }
        this.g = jA;
        return oh0.c(oh0.c((((long) sh0Var.b) & 4294967295L) | (((long) sh0Var.a) << 32), hk.S(jA)), this.e.a(j2, 0L, al0Var));
    }
}
