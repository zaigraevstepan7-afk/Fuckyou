package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class no1 {
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

    public no1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
    }

    public final long a(boolean z, boolean z2) {
        return z ? z2 ? this.b : this.d : z2 ? this.g : this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof no1)) {
            return false;
        }
        no1 no1Var = (no1) obj;
        return vl.c(this.a, no1Var.a) && vl.c(this.b, no1Var.b) && vl.c(this.c, no1Var.c) && vl.c(this.d, no1Var.d) && vl.c(this.e, no1Var.e) && vl.c(this.f, no1Var.f) && vl.c(this.g, no1Var.g) && vl.c(this.h, no1Var.h) && vl.c(this.i, no1Var.i) && vl.c(this.j, no1Var.j);
    }

    public final int hashCode() {
        int i = vl.h;
        return Long.hashCode(this.j) + s91.c(s91.c(s91.c(s91.c(s91.c(s91.c(s91.c(s91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
