package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class bu1 extends xv0 {
    public final ha0 a;

    public bu1(ha0 ha0Var) {
        this.a = ha0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new cu1(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bu1) {
            return this.a == ((bu1) obj).a;
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((cu1) sv0Var).u = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
