package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kr1 implements wa {
    public final wa a;
    public final long b;

    public kr1(p60 p60Var, long j) {
        this.a = p60Var;
        this.b = j;
    }

    @Override // defpackage.wa
    public final e52 a(r22 r22Var) {
        return new lr1(this.a.a(r22Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kr1)) {
            return false;
        }
        kr1 kr1Var = (kr1) obj;
        return kr1Var.b == this.b && xi0.o(kr1Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
