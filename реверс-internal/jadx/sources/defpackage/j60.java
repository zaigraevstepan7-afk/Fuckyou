package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class j60 extends xv0 {
    public final jy a;

    public j60(jy jyVar) {
        this.a = jyVar;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        k60 k60Var = new k60();
        k60Var.s = this.a;
        k60Var.t = 1.0f;
        return k60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j60) {
            return this.a == ((j60) obj).a;
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        k60 k60Var = (k60) sv0Var;
        k60Var.s = this.a;
        k60Var.t = 1.0f;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.a.hashCode() * 31);
    }
}
