package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fk extends rj0 implements ek {
    public final vj0 l;

    public fk(vj0 vj0Var) {
        this.l = vj0Var;
    }

    @Override // defpackage.ek
    public final boolean c(Throwable th) {
        return q().G(th);
    }

    @Override // defpackage.rj0
    public final boolean r() {
        return true;
    }

    @Override // defpackage.rj0
    public final void s(Throwable th) {
        this.l.C(q());
    }
}
