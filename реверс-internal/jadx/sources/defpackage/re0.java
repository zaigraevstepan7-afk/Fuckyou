package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class re0 {
    public final ym1 a;
    public final ym1 b;

    public re0(ym1 ym1Var, ym1 ym1Var2) {
        this.a = ym1Var;
        this.b = ym1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof re0)) {
            return false;
        }
        re0 re0Var = (re0) obj;
        return xi0.o(this.a, re0Var.a) && xi0.o(this.b, re0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
