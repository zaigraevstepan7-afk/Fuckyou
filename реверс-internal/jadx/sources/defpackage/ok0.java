package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ok0 {
    public final Float a;
    public j20 b;

    public ok0(Float f, j20 j20Var) {
        this.a = f;
        this.b = j20Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ok0)) {
            return false;
        }
        ok0 ok0Var = (ok0) obj;
        return ok0Var.a.equals(this.a) && xi0.o(ok0Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + s91.b(0, this.a.hashCode() * 31, 31);
    }
}
