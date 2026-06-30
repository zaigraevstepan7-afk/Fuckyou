package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class xg extends xv0 {
    public final zg a;

    public xg(zg zgVar) {
        this.a = zgVar;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        ah ahVar = new ah();
        ahVar.s = this.a;
        return ahVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xg) {
            return xi0.o(this.a, ((xg) obj).a);
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ah ahVar = (ah) sv0Var;
        zg zgVar = ahVar.s;
        if (zgVar != null) {
            zgVar.a.j(ahVar);
        }
        zg zgVar2 = this.a;
        if (zgVar2 != null) {
            zgVar2.a.b(ahVar);
        }
        ahVar.s = zgVar2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
