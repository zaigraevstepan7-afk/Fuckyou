package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class oy1 implements ex1 {
    public final /* synthetic */ ry1 a;
    public final /* synthetic */ boolean b;

    public oy1(ry1 ry1Var, boolean z) {
        this.a = ry1Var;
        this.b = z;
    }

    @Override // defpackage.ex1
    public final void a() {
        ry1 ry1Var = this.a;
        ry1Var.q.setValue(null);
        ry1Var.r.setValue(null);
        ry1Var.t(true);
    }

    @Override // defpackage.ex1
    public final void b() {
        ry1 ry1Var = this.a;
        ry1Var.q.setValue(null);
        ry1Var.r.setValue(null);
        ry1Var.t(true);
    }

    @Override // defpackage.ex1
    public final void c() {
        qz1 qz1VarD;
        boolean z = this.b;
        ad0 ad0Var = z ? ad0.f : ad0.g;
        ry1 ry1Var = this.a;
        ry1Var.q.setValue(ad0Var);
        long jA = hl1.a(ry1Var.l(z));
        jo0 jo0Var = ry1Var.d;
        if (jo0Var == null || (qz1VarD = jo0Var.d()) == null) {
            return;
        }
        long jE = qz1VarD.e(jA);
        ry1Var.n = jE;
        ry1Var.r.setValue(new w01(jE));
        ry1Var.p = 0L;
        ry1Var.s = -1;
        jo0 jo0Var2 = ry1Var.d;
        if (jo0Var2 != null) {
            jo0Var2.q.setValue(Boolean.TRUE);
        }
        ry1Var.t(false);
    }

    @Override // defpackage.ex1
    public final void e(long j) {
        ry1 ry1Var = this.a;
        long jE = w01.e(ry1Var.p, j);
        ry1Var.p = jE;
        ry1Var.r.setValue(new w01(w01.e(ry1Var.n, jE)));
        az1 az1VarN = ry1Var.n();
        w01 w01VarI = ry1Var.i();
        w01VarI.getClass();
        ry1.c(ry1Var, az1VarN, w01VarI.a, false, this.b, l91.o, true, new jd0(9));
        ry1Var.t(false);
    }

    @Override // defpackage.ex1
    public final void onCancel() {
    }

    @Override // defpackage.ex1
    public final void d(long j, yc ycVar) {
    }
}
