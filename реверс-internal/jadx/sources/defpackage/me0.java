package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class me0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public me0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof me0)) {
            return false;
        }
        me0 me0Var = (me0) obj;
        return vl.c(this.a, me0Var.a) && vl.c(this.b, me0Var.b) && vl.c(this.c, me0Var.c) && vl.c(this.d, me0Var.d);
    }

    public final int hashCode() {
        int i = vl.h;
        return Long.hashCode(this.d) + s91.c(s91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
