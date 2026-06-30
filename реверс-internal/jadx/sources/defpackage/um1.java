package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class um1 {
    public static final um1 d = new um1(0.0f, lk.g(4278190080L), 0);
    public final long a;
    public final long b;
    public final float c;

    public um1(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um1)) {
            return false;
        }
        um1 um1Var = (um1) obj;
        return vl.c(this.a, um1Var.a) && w01.b(this.b, um1Var.b) && this.c == um1Var.c;
    }

    public final int hashCode() {
        int i = vl.h;
        return Float.hashCode(this.c) + s91.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = s91.o("Shadow(color=", vl.i(this.a), ", offset=", w01.g(this.b), ", blurRadius=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }
}
