package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ed1 extends ef1 {
    public final ef1 a;
    public final int b;

    public ed1(ef1 ef1Var, int i) {
        this.a = ef1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ed1)) {
            return false;
        }
        ed1 ed1Var = (ed1) obj;
        return ed1Var.a.equals(this.a) && ed1Var.b == this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }
}
