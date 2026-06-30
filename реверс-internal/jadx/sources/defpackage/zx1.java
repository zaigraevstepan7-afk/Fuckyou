package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zx1 {
    public final sf a;
    public final sf b;

    public zx1() {
        sf sfVar = v20.q;
        this.a = sfVar;
        this.b = sfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx1)) {
            return false;
        }
        zx1 zx1Var = (zx1) obj;
        return xi0.o(this.a, zx1Var.a) && xi0.o(this.b, zx1Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + s91.a(this.a.a, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ")";
    }
}
