package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wp0 extends xp0 {
    public final String a;
    public final sz1 b;

    public wp0(String str, sz1 sz1Var) {
        this.a = str;
        this.b = sz1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp0)) {
            return false;
        }
        wp0 wp0Var = (wp0) obj;
        return this.a.equals(wp0Var.a) && xi0.o(this.b, wp0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        sz1 sz1Var = this.b;
        return (iHashCode + (sz1Var != null ? sz1Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return s91.l("LinkAnnotation.Url(url=", this.a, ")");
    }
}
