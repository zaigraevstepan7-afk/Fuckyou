package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class y12 implements ns1 {
    public final c22 e;
    public sa0 f;
    public sa0 g;
    public final /* synthetic */ z12 h;

    public y12(z12 z12Var, c22 c22Var, sa0 sa0Var, sa0 sa0Var2) {
        this.h = z12Var;
        this.e = c22Var;
        this.f = sa0Var;
        this.g = sa0Var2;
    }

    public final void a(a22 a22Var, Object obj, cb cbVar) {
        Object objI = this.g.i(a22Var.c());
        boolean zG = this.h.c.g();
        c22 c22Var = this.e;
        if (zG) {
            c22Var.g(this.g.i(a22Var.b()), objI, (p60) this.f.i(a22Var));
        } else {
            c22Var.h(objI, (p60) this.f.i(a22Var), obj, cbVar);
        }
    }

    @Override // defpackage.ns1
    public final Object getValue() {
        a(this.h.c.f(), null, null);
        return this.e.l.getValue();
    }
}
