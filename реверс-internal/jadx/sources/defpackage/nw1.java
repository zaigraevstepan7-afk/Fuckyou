package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class nw1 extends xv0 {
    public final ly1 a;

    public nw1(ly1 ly1Var) {
        this.a = ly1Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new pw1(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nw1) {
            return this.a == ((nw1) obj).a;
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((pw1) sv0Var).u = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
