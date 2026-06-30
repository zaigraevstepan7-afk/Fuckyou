package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fz1 {
    public static final fz1 c = new fz1(uc1.p(0), uc1.p(0));
    public final long a;
    public final long b;

    public fz1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz1)) {
            return false;
        }
        fz1 fz1Var = (fz1) obj;
        return g02.a(this.a, fz1Var.a) && g02.a(this.b, fz1Var.b);
    }

    public final int hashCode() {
        h02[] h02VarArr = g02.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + g02.d(this.a) + ", restLine=" + g02.d(this.b) + ")";
    }
}
