package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dk extends rj0 {
    public final xi l;

    public dk(xi xiVar) {
        this.l = xiVar;
    }

    @Override // defpackage.rj0
    public final boolean r() {
        return true;
    }

    @Override // defpackage.rj0
    public final void s(Throwable th) {
        vj0 vj0VarQ = q();
        xi xiVar = this.l;
        Throwable thR = xiVar.r(vj0VarQ);
        if (!xiVar.A() ? false : ((my) xiVar.h).q(thR)) {
            return;
        }
        xiVar.m(thR);
        if (xiVar.A()) {
            return;
        }
        xiVar.p();
    }
}
