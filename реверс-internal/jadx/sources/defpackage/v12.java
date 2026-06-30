package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v12 {
    public final hb a;
    public final z01 b;

    public v12(hb hbVar, z01 z01Var) {
        this.a = hbVar;
        this.b = z01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v12)) {
            return false;
        }
        v12 v12Var = (v12) obj;
        return xi0.o(this.a, v12Var.a) && this.b.equals(v12Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ")";
    }
}
