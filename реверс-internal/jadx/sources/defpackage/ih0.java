package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ih0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ih0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih0)) {
            return false;
        }
        ih0 ih0Var = (ih0) obj;
        return this.a == ih0Var.a && this.b == ih0Var.b && this.c == ih0Var.c && this.d == ih0Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbN = s91.n("InsetsValues(left=", this.a, ", top=", this.b, ", right=");
        sbN.append(this.c);
        sbN.append(", bottom=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
