package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gk1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    public gk1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gk1.class != obj.getClass()) {
            return false;
        }
        gk1 gk1Var = (gk1) obj;
        return vl.c(this.c, gk1Var.c) && vl.c(this.b, gk1Var.b) && vl.c(this.a, gk1Var.a) && vl.c(this.f, gk1Var.f) && vl.c(this.e, gk1Var.e) && vl.c(this.d, gk1Var.d) && vl.c(this.i, gk1Var.i) && vl.c(this.h, gk1Var.h) && vl.c(this.g, gk1Var.g) && vl.c(this.l, gk1Var.l) && vl.c(this.k, gk1Var.k) && vl.c(this.j, gk1Var.j);
    }

    public final int hashCode() {
        int i = vl.h;
        return Long.hashCode(this.j) + s91.c(s91.c(s91.c(s91.c(s91.c(s91.c(s91.c(s91.c(s91.c(s91.c(Long.hashCode(this.c) * 31, 31, this.b), 31, this.a), 31, this.f), 31, this.e), 31, this.d), 31, this.i), 31, this.h), 31, this.g), 31, this.l), 31, this.k);
    }
}
