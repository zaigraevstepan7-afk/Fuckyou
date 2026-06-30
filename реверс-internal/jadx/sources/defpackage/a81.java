package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class a81 {
    public final v71 a;
    public final m71 b;

    public a81(v71 v71Var, m71 m71Var) {
        this.a = v71Var;
        this.b = m71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a81)) {
            return false;
        }
        a81 a81Var = (a81) obj;
        return xi0.o(this.b, a81Var.b) && xi0.o(this.a, a81Var.a);
    }

    public final int hashCode() {
        v71 v71Var = this.a;
        int iHashCode = (v71Var != null ? v71Var.hashCode() : 0) * 31;
        m71 m71Var = this.b;
        return iHashCode + (m71Var != null ? m71Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ")";
    }
}
