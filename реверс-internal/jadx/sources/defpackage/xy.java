package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xy implements id1 {
    public final sa0 e;
    public yy f;

    public xy(sa0 sa0Var) {
        this.e = sa0Var;
    }

    @Override // defpackage.id1
    public final void c() {
        this.f = (yy) this.e.i(wi0.k);
    }

    @Override // defpackage.id1
    public final void e() {
        yy yyVar = this.f;
        if (yyVar != null) {
            yyVar.a();
        }
        this.f = null;
    }

    @Override // defpackage.id1
    public final void d() {
    }
}
