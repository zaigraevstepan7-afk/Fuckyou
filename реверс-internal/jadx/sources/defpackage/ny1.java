package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ny1 implements ex1 {
    public final /* synthetic */ ry1 a;

    public ny1(ry1 ry1Var) {
        this.a = ry1Var;
    }

    @Override // defpackage.ex1
    public final void a() {
        ry1 ry1Var = this.a;
        ry1Var.q.setValue(null);
        ry1Var.r.setValue(null);
    }

    @Override // defpackage.ex1
    public final void b() {
        ry1 ry1Var = this.a;
        ry1Var.q.setValue(null);
        ry1Var.r.setValue(null);
    }

    @Override // defpackage.ex1
    public final void d(long j, yc ycVar) {
        qz1 qz1VarD;
        ry1 ry1Var = this.a;
        long jA = hl1.a(ry1Var.l(true));
        jo0 jo0Var = ry1Var.d;
        if (jo0Var == null || (qz1VarD = jo0Var.d()) == null) {
            return;
        }
        long jE = qz1VarD.e(jA);
        ry1Var.n = jE;
        ry1Var.r.setValue(new w01(jE));
        ry1Var.p = 0L;
        ry1Var.q.setValue(ad0.e);
        ry1Var.t(false);
    }

    @Override // defpackage.ex1
    public final void e(long j) {
        qz1 qz1VarD;
        id0 id0Var;
        ry1 ry1Var = this.a;
        ry1Var.p = w01.e(ry1Var.p, j);
        jo0 jo0Var = ry1Var.d;
        if (jo0Var == null || (qz1VarD = jo0Var.d()) == null) {
            return;
        }
        ry1Var.r.setValue(new w01(w01.e(ry1Var.n, ry1Var.p)));
        z01 z01Var = ry1Var.b;
        w01 w01VarI = ry1Var.i();
        w01VarI.getClass();
        int iE = z01Var.e(qz1VarD.b(w01VarI.a, true));
        long jG = af1.g(iE, iE);
        if (wz1.b(jG, ry1Var.n().b)) {
            return;
        }
        jo0 jo0Var2 = ry1Var.d;
        if ((jo0Var2 == null || ((Boolean) jo0Var2.q.getValue()).booleanValue()) && (id0Var = ry1Var.j) != null) {
            ((d71) id0Var).a(9);
        }
        ry1Var.c.i(ry1.e(ry1Var.n().a, jG));
        ry1Var.v = new wz1(jG);
    }

    @Override // defpackage.ex1
    public final void c() {
    }

    @Override // defpackage.ex1
    public final void onCancel() {
    }
}
