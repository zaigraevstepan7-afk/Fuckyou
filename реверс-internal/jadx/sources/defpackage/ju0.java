package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ju0 {
    public final bm a;
    public final f32 b;
    public final pn1 c;
    public final iw0 d;

    public ju0(bm bmVar, f32 f32Var, pn1 pn1Var, iw0 iw0Var) {
        this.a = bmVar;
        this.b = f32Var;
        this.c = pn1Var;
        this.d = iw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ju0.class != obj.getClass()) {
            return false;
        }
        ju0 ju0Var = (ju0) obj;
        return xi0.o(this.a, ju0Var.a) && xi0.o(this.b, ju0Var.b) && xi0.o(this.c, ju0Var.c) && xi0.o(this.d, ju0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Values(colorScheme=" + this.a + ", typography=" + this.b + ", shapes=" + this.c + ", motionScheme=" + this.d + ")";
    }
}
