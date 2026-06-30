package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class z12 {
    public final r22 a;
    public final v41 b = xc.B(null);
    public final /* synthetic */ d22 c;

    public z12(d22 d22Var, r22 r22Var, String str) {
        this.c = d22Var;
        this.a = r22Var;
    }

    public final y12 a(sa0 sa0Var, Object obj, cb cbVar, sa0 sa0Var2) {
        v41 v41Var = this.b;
        y12 y12Var = (y12) v41Var.getValue();
        d22 d22Var = this.c;
        if (y12Var == null) {
            Object objI = sa0Var2.i(d22Var.c());
            Object objI2 = sa0Var2.i(d22Var.c());
            r22 r22Var = this.a;
            cb cbVar2 = (cb) r22Var.a.i(objI2);
            cbVar2.d();
            c22 c22Var = new c22(d22Var, objI, cbVar2, r22Var);
            y12Var = new y12(this, c22Var, sa0Var, sa0Var2);
            v41Var.setValue(y12Var);
            d22Var.j.add(c22Var);
        }
        y12Var.g = sa0Var2;
        y12Var.f = sa0Var;
        y12Var.a(d22Var.f(), obj, cbVar);
        return y12Var;
    }
}
