package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class tj0 extends rj0 {
    public final vj0 l;
    public final uj0 m;
    public final fk n;
    public final Object o;

    public tj0(vj0 vj0Var, uj0 uj0Var, fk fkVar, Object obj) {
        this.l = vj0Var;
        this.m = uj0Var;
        this.n = fkVar;
        this.o = obj;
    }

    @Override // defpackage.rj0
    public final boolean r() {
        return false;
    }

    @Override // defpackage.rj0
    public final void s(Throwable th) {
        fk fkVar = this.n;
        fk fkVarY = vj0.Y(fkVar);
        vj0 vj0Var = this.l;
        uj0 uj0Var = this.m;
        Object obj = this.o;
        if (fkVarY == null || !vj0Var.l0(uj0Var, fkVarY, obj)) {
            uj0Var.e.e(new bq0(2), 2);
            fk fkVarY2 = vj0.Y(fkVar);
            if (fkVarY2 == null || !vj0Var.l0(uj0Var, fkVarY2, obj)) {
                vj0Var.y(vj0Var.J(uj0Var, obj));
            }
        }
    }
}
