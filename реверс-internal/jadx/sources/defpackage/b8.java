package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class b8 {
    public ym1 a;
    public long b;
    public al0 c;
    public float d;

    public b8(ym1 ym1Var, long j, al0 al0Var, float f, tm1 tm1Var) {
        this.a = ym1Var;
        this.b = j;
        this.c = al0Var;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        return xi0.o(this.a, b8Var.a) && io1.a(this.b, b8Var.b) && this.c == b8Var.c && Float.compare(this.d, b8Var.d) == 0 && xi0.o(null, null);
    }

    public final int hashCode() {
        return s91.a(this.d, (this.c.hashCode() + s91.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.a + ", size=" + io1.d(this.b) + ", layoutDirection=" + this.c + ", density=" + this.d + ", shadow=" + ((Object) null) + ")";
    }
}
