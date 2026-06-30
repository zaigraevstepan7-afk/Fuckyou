package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jk extends xv0 {
    public final p1 a;

    public jk(p1 p1Var) {
        this.a = p1Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        ik ikVar = new ik();
        ikVar.s = this.a;
        return ikVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jk) {
            return this.a == ((jk) obj).a;
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ik ikVar = (ik) sv0Var;
        ikVar.s = this.a;
        kd1.t(ikVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
