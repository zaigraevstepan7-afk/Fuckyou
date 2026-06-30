package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class py1 implements ex1 {
    public wz1 b;
    public final /* synthetic */ ry1 d;
    public boolean a = true;
    public yc c = l91.l;

    public py1(ry1 ry1Var) {
        this.d = ry1Var;
    }

    @Override // defpackage.ex1
    public final void a() {
        f();
    }

    @Override // defpackage.ex1
    public final void d(long j, yc ycVar) {
        long j2;
        qz1 qz1VarD;
        qz1 qz1VarD2;
        ry1 ry1Var = this.d;
        v41 v41Var = ry1Var.q;
        if (ry1Var.k() && ((ad0) v41Var.getValue()) == null) {
            v41Var.setValue(ad0.g);
            ry1Var.s = -1;
            this.a = true;
            this.c = ycVar;
            ry1Var.o();
            jo0 jo0Var = ry1Var.d;
            if (jo0Var == null || (qz1VarD2 = jo0Var.d()) == null || !qz1VarD2.c(j)) {
                j2 = j;
                jo0 jo0Var2 = ry1Var.d;
                if (jo0Var2 != null && (qz1VarD = jo0Var2.d()) != null) {
                    int iE = ry1Var.b.e(qz1VarD.b(j2, true));
                    az1 az1VarE = ry1.e(ry1Var.n().a, af1.g(iE, iE));
                    ry1Var.h(false);
                    id0 id0Var = ry1Var.j;
                    if (id0Var != null) {
                        ((d71) id0Var).a(0);
                    }
                    ry1Var.c.i(az1VarE);
                    ry1Var.v = new wz1(az1VarE.b);
                }
                this.a = false;
            } else {
                if (ry1Var.n().a.f.length() == 0) {
                    return;
                }
                ry1Var.h(false);
                long jC = ry1.c(ry1Var, az1.a(ry1Var.n(), null, wz1.b, 5), j, true, false, this.c, true, new jd0(0));
                j2 = j;
                ry1Var.o = new wz1(jC);
                this.b = new wz1(jC);
            }
            ry1Var.q(cd0.e);
            ry1Var.n = j2;
            ry1Var.r.setValue(new w01(j2));
            ry1Var.p = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    @Override // defpackage.ex1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j) {
        qz1 qz1VarD;
        long jC;
        ry1 ry1Var = this.d;
        if (!ry1Var.k() || ry1Var.n().a.f.length() == 0) {
            return;
        }
        ry1Var.p = w01.e(ry1Var.p, j);
        jo0 jo0Var = ry1Var.d;
        if (jo0Var != null && (qz1VarD = jo0Var.d()) != null) {
            ry1Var.r.setValue(new w01(w01.e(ry1Var.n, ry1Var.p)));
            if (ry1Var.o == null) {
                w01 w01VarI = ry1Var.i();
                w01VarI.getClass();
                if (qz1VarD.c(w01VarI.a)) {
                    wz1 wz1Var = ry1Var.o;
                    int iB = wz1Var != null ? (int) (wz1Var.a >> 32) : qz1VarD.b(ry1Var.n, false);
                    w01 w01VarI2 = ry1Var.i();
                    w01VarI2.getClass();
                    int iB2 = qz1VarD.b(w01VarI2.a, false);
                    if (ry1Var.o == null && iB == iB2) {
                        return;
                    }
                    az1 az1VarN = ry1Var.n();
                    w01 w01VarI3 = ry1Var.i();
                    w01VarI3.getClass();
                    jC = ry1.c(ry1Var, az1VarN, w01VarI3.a, false, false, this.c, true, new jd0(9));
                } else {
                    int iE = ry1Var.b.e(qz1VarD.b(ry1Var.n, true));
                    z01 z01Var = ry1Var.b;
                    w01 w01VarI4 = ry1Var.i();
                    w01VarI4.getClass();
                    yc ycVar = iE == z01Var.e(qz1VarD.b(w01VarI4.a, true)) ? l91.l : l91.m;
                    az1 az1VarN2 = ry1Var.n();
                    w01 w01VarI5 = ry1Var.i();
                    w01VarI5.getClass();
                    jC = ry1.c(ry1Var, az1VarN2, w01VarI5.a, false, false, ycVar, true, new jd0(9));
                }
                this.b = new wz1(jC);
                if (!wz1.a(jC, ry1Var.o)) {
                    this.a = false;
                }
            }
        }
        ry1Var.t(false);
    }

    public final void f() {
        ry1 ry1Var = this.d;
        ry1Var.q.setValue(null);
        ry1Var.r.setValue(null);
        this.c = l91.l;
        ry1Var.t(true);
        wz1 wz1Var = this.b;
        boolean zC = wz1.c(wz1Var != null ? wz1Var.a : ry1Var.n().b);
        ry1Var.q(zC ? cd0.g : cd0.f);
        jo0 jo0Var = ry1Var.d;
        if (jo0Var != null) {
            jo0Var.m.setValue(Boolean.valueOf(!zC && uc1.s(ry1Var, true)));
        }
        jo0 jo0Var2 = ry1Var.d;
        if (jo0Var2 != null) {
            jo0Var2.n.setValue(Boolean.valueOf(!zC && uc1.s(ry1Var, false)));
        }
        jo0 jo0Var3 = ry1Var.d;
        if (jo0Var3 != null) {
            jo0Var3.o.setValue(Boolean.valueOf(zC && uc1.s(ry1Var, true)));
        }
        if (this.a) {
            ry1.b(ry1Var, ry1Var.o);
        }
        ry1Var.o = null;
    }

    @Override // defpackage.ex1
    public final void onCancel() {
        f();
    }

    @Override // defpackage.ex1
    public final void b() {
    }

    @Override // defpackage.ex1
    public final void c() {
    }
}
