package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vp0 extends xp0 {
    public final String a;
    public final sz1 b;

    public vp0(String str, sz1 sz1Var) {
        this.a = str;
        this.b = sz1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp0)) {
            return false;
        }
        vp0 vp0Var = (vp0) obj;
        return this.a.equals(vp0Var.a) && xi0.o(this.b, vp0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        sz1 sz1Var = this.b;
        return (iHashCode + (sz1Var != null ? sz1Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return s91.l("LinkAnnotation.Clickable(tag=", this.a, ")");
    }
}
