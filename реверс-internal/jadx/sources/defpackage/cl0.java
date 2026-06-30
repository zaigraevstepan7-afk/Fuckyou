package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cl0 {
    public final int a;
    public final int b;
    public final boolean c;

    public cl0(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl0)) {
            return false;
        }
        cl0 cl0Var = (cl0) obj;
        return this.a == cl0Var.a && this.b == cl0Var.b && this.c == cl0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + s91.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = s91.n("BidiRun(start=", this.a, ", end=", this.b, ", isRtl=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
