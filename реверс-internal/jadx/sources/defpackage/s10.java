package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class s10 extends xv0 {
    public final sa0 a;

    public s10(sa0 sa0Var) {
        this.a = sa0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new ki(new li(), this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s10) {
            return this.a == ((s10) obj).a;
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ki kiVar = (ki) sv0Var;
        kiVar.u = this.a;
        kiVar.L0();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
