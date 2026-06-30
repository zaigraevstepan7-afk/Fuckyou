package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gi {
    public final ym1 a;
    public final ym1 b;

    public gi(ym1 ym1Var, ym1 ym1Var2) {
        this.a = ym1Var;
        this.b = ym1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gi)) {
            return false;
        }
        gi giVar = (gi) obj;
        return xi0.o(this.a, giVar.a) && xi0.o(this.b, giVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
