package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class bl0 extends xv0 {
    public final xa0 a;

    public bl0(xa0 xa0Var) {
        this.a = xa0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        hl0 hl0Var = new hl0();
        hl0Var.s = this.a;
        return hl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bl0) {
            return this.a == ((bl0) obj).a;
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((hl0) sv0Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
