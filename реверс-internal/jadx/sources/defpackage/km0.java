package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class km0 {
    public final int a;
    public final int b;

    public km0(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            qg0.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        qg0.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km0)) {
            return false;
        }
        km0 km0Var = (km0) obj;
        return this.a == km0Var.a && this.b == km0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return s91.k("Interval(start=", this.a, ", end=", this.b, ")");
    }
}
