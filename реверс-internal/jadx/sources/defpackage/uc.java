package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uc extends xv0 {
    public final boolean a;
    public final sa0 b;

    public uc(sa0 sa0Var, boolean z) {
        this.a = z;
        this.b = sa0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        ns nsVar = new ns();
        nsVar.s = this.a;
        nsVar.t = this.b;
        return nsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc)) {
            return false;
        }
        uc ucVar = (uc) obj;
        return this.a == ucVar.a && this.b == ucVar.b;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ns nsVar = (ns) sv0Var;
        nsVar.s = this.a;
        nsVar.t = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
