package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sh0 {
    public static final sh0 e = new sh0(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public sh0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh0)) {
            return false;
        }
        sh0 sh0Var = (sh0) obj;
        return this.a == sh0Var.a && this.b == sh0Var.b && this.c == sh0Var.c && this.d == sh0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + s91.b(this.c, s91.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = s91.n("IntRect.fromLTRB(", this.a, ", ", this.b, ", ");
        sbN.append(this.c);
        sbN.append(", ");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
