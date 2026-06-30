package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class eb {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public eb(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        return xi0.o(this.a, ebVar.a) && this.b == ebVar.b && this.c == ebVar.c && xi0.o(this.d, ebVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + s91.b(this.c, s91.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }
}
