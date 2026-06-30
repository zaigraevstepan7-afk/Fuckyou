package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class i52 implements e52 {
    public final g52 e;
    public final sd1 f;
    public final long g;
    public final long h = 0;

    public i52(g52 g52Var, sd1 sd1Var) {
        this.e = g52Var;
        this.f = sd1Var;
        this.g = ((long) (g52Var.n() + g52Var.k())) * 1000000;
    }

    @Override // defpackage.e52
    public final boolean a() {
        return true;
    }

    @Override // defpackage.e52
    public final long b(cb cbVar, cb cbVar2, cb cbVar3) {
        return Long.MAX_VALUE;
    }

    public final long c(long j) {
        long j2 = this.h;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.g;
        long j5 = j3 / j4;
        return (this.f == sd1.e || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public final cb d(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        long j2 = this.h;
        long j3 = j + j2;
        long j4 = this.g;
        return j3 > j4 ? this.e.l(j4 - j2, cbVar, cbVar3, cbVar2) : cbVar2;
    }

    @Override // defpackage.e52
    public final cb l(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        return this.e.l(c(j), cbVar, cbVar2, d(j, cbVar, cbVar3, cbVar2));
    }

    @Override // defpackage.e52
    public final cb o(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        return this.e.o(c(j), cbVar, cbVar2, d(j, cbVar, cbVar3, cbVar2));
    }
}
