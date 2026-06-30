package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class z80 extends yw implements pl1, cc0, vp, u01, i22 {
    public static final wr A = new wr(10);
    public jx0 u;
    public final sa0 v;
    public c80 w;
    public xm0 x;
    public c01 y;
    public final w80 z;

    public z80(jx0 jx0Var, int i, f fVar) {
        this.u = jx0Var;
        this.v = fVar;
        w80 w80Var = new w80(i, new sc(2, this, z80.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 3), 10);
        L0(w80Var);
        this.z = w80Var;
    }

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.sv0
    public final void F0() {
        xm0 xm0Var = this.x;
        if (xm0Var != null) {
            xm0Var.b();
        }
        this.x = null;
    }

    @Override // defpackage.u01
    public final void K() {
        zc1 zc1Var = new zc1();
        bk.R(this, new f8(9, zc1Var, this));
        xm0 xm0Var = (xm0) zc1Var.e;
        if (this.z.Q0().a()) {
            xm0 xm0Var2 = this.x;
            if (xm0Var2 != null) {
                xm0Var2.b();
            }
            if (xm0Var != null) {
                xm0Var.a();
            } else {
                xm0Var = null;
            }
            this.x = xm0Var;
        }
    }

    public final void O0(jx0 jx0Var, yh0 yh0Var) {
        if (!this.r) {
            jx0Var.b(yh0Var);
            return;
        }
        oj0 oj0Var = (oj0) ((js) z0()).e.l(v20.O);
        nu0.A(z0(), null, null, new g(jx0Var, yh0Var, oj0Var != null ? oj0Var.s(new d(8, jx0Var, yh0Var)) : null, null, 8), 3);
    }

    public final void P0(jx0 jx0Var) {
        c80 c80Var;
        if (xi0.o(this.u, jx0Var)) {
            return;
        }
        jx0 jx0Var2 = this.u;
        if (jx0Var2 != null && (c80Var = this.w) != null) {
            jx0Var2.b(new d80(c80Var));
        }
        this.w = null;
        this.u = jx0Var;
    }

    @Override // defpackage.pl1
    public final void g0(am1 am1Var) {
        boolean zA = this.z.Q0().a();
        ck0[] ck0VarArr = yl1.a;
        zl1 zl1Var = vl1.l;
        ck0 ck0Var = yl1.a[4];
        am1Var.a(zl1Var, Boolean.valueOf(zA));
        am1Var.a(ml1.w, new r0(null, new w3(0, this, z80.class, "requestFocus", "requestFocus()Z", 0, 0, 7)));
    }

    @Override // defpackage.i22
    public final Object p() {
        return A;
    }

    @Override // defpackage.cc0
    public final void t(c01 c01Var) {
        this.y = c01Var;
        if (this.z.Q0().a()) {
            boolean z = c01Var.W0().r;
            wr wrVar = a90.s;
            if (!z) {
                if (this.r) {
                    pd1.m(this, wrVar);
                }
            } else {
                c01 c01Var2 = this.y;
                if (c01Var2 != null && c01Var2.W0().r && this.r) {
                    pd1.m(this, wrVar);
                }
            }
        }
    }
}
