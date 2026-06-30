package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gu0 {
    public final long a;
    public final ft b;

    public gu0(long j, ft ftVar) {
        this.a = j;
        this.b = ftVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu0)) {
            return false;
        }
        gu0 gu0Var = (gu0) obj;
        return w01.b(this.a, gu0Var.a) && xi0.o(this.b, gu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PointNRound(o=" + w01.g(this.a) + ", r=" + this.b + ")";
    }
}
