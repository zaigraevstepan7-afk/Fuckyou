package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xh {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public xh(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xh)) {
            return false;
        }
        xh xhVar = (xh) obj;
        return vl.c(this.a, xhVar.a) && vl.c(this.b, xhVar.b) && vl.c(this.c, xhVar.c) && vl.c(this.d, xhVar.d);
    }

    public final int hashCode() {
        int i = vl.h;
        return Long.hashCode(this.d) + s91.c(s91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
