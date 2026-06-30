package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class qg extends xv0 {
    public final uf a;

    public qg(uf ufVar) {
        this.a = ufVar;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        rg rgVar = new rg();
        rgVar.s = this.a;
        return rgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        qg qgVar = obj instanceof qg ? (qg) obj : null;
        return qgVar != null && this.a.equals(qgVar.a);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((rg) sv0Var).s = this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }
}
