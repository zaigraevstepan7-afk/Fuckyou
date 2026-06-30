package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gb {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public gb(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        og0.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return xi0.o(this.a, gbVar.a) && this.b == gbVar.b && this.c == gbVar.c && xi0.o(this.d, gbVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + s91.b(this.c, s91.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public gb(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }
}
