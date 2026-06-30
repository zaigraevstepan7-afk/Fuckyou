package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class i12 {
    public final f20 a;
    public final f20 b;
    public final double c;
    public final j12 d;
    public final boolean e;
    public final h12 f;

    public i12(f20 f20Var, f20 f20Var2, double d, j12 j12Var, boolean z, h12 h12Var, int i) {
        z = (i & 16) != 0 ? true : z;
        h12Var = (i & 32) != 0 ? h12.e : h12Var;
        f20Var.getClass();
        f20Var2.getClass();
        this.a = f20Var;
        this.b = f20Var2;
        this.c = d;
        this.d = j12Var;
        this.e = z;
        this.f = h12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i12)) {
            return false;
        }
        i12 i12Var = (i12) obj;
        return xi0.o(this.a, i12Var.a) && xi0.o(this.b, i12Var.b) && Double.compare(this.c, i12Var.c) == 0 && this.d == i12Var.d && this.e == i12Var.e && this.f == i12Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + s91.d((this.d.hashCode() + ((Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "ToneDeltaPair(roleA=" + this.a + ", roleB=" + this.b + ", delta=" + this.c + ", polarity=" + this.d + ", stayTogether=" + this.e + ", deltaConstraint=" + this.f + ")";
    }
}
