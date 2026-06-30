package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wj1 extends xv0 {
    public final hj1 a;

    public wj1(hj1 hj1Var) {
        this.a = hj1Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        dj1 dj1Var = new dj1();
        dj1Var.s = this.a;
        dj1Var.t = true;
        return dj1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wj1) {
            return xi0.o(this.a, ((wj1) obj).a);
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        dj1 dj1Var = (dj1) sv0Var;
        dj1Var.s = this.a;
        dj1Var.t = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + s91.d(this.a.hashCode() * 31, 31, false);
    }
}
