package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mi1 {
    public final float a;
    public final long b;
    public final p60 c;

    public mi1(float f, long j, p60 p60Var) {
        this.a = f;
        this.b = j;
        this.c = p60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi1)) {
            return false;
        }
        mi1 mi1Var = (mi1) obj;
        return Float.compare(this.a, mi1Var.a) == 0 && u12.a(this.b, mi1Var.b) && xi0.o(this.c, mi1Var.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = u12.c;
        return this.c.hashCode() + s91.c(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + u12.b(this.b) + ", animationSpec=" + this.c + ")";
    }
}
