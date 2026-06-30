package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class a00 extends sv0 implements i22, xk0 {
    public a00 s;
    public a00 t;
    public long u;

    @Override // defpackage.sv0
    public final void E0() {
        this.t = null;
        this.s = null;
    }

    public final boolean L0() {
        a00 a00Var = this.s;
        if (a00Var != null) {
            return a00Var.L0();
        }
        a00 a00Var2 = this.t;
        if (a00Var2 != null) {
            return a00Var2.L0();
        }
        return false;
    }

    public final void M0() {
        a00 a00Var = this.t;
        if (a00Var != null) {
            a00Var.M0();
            return;
        }
        a00 a00Var2 = this.s;
        if (a00Var2 != null) {
            a00Var2.M0();
        }
    }

    public final void N0() {
        a00 a00Var = this.t;
        if (a00Var != null) {
            a00Var.N0();
        }
        a00 a00Var2 = this.s;
        if (a00Var2 != null) {
            a00Var2.N0();
        }
        this.s = null;
    }

    public final void O0(qt0 qt0Var) {
        i22 i22Var;
        a00 a00Var;
        a00 a00Var2 = this.s;
        int i = 1;
        if (a00Var2 == null || !hk.f(a00Var2, lk.R(qt0Var))) {
            if (this.e.r) {
                zc1 zc1Var = new zc1();
                pd1.w(this, new o9(zc1Var, this, qt0Var, i));
                i22Var = (i22) zc1Var.e;
            } else {
                i22Var = null;
            }
            a00Var = (a00) i22Var;
        } else {
            a00Var = a00Var2;
        }
        if (a00Var != null && a00Var2 == null) {
            a00Var.M0();
            a00Var.O0(qt0Var);
            a00 a00Var3 = this.t;
            if (a00Var3 != null) {
                a00Var3.N0();
            }
        } else if (a00Var == null && a00Var2 != null) {
            a00 a00Var4 = this.t;
            if (a00Var4 != null) {
                a00Var4.M0();
                a00Var4.O0(qt0Var);
            }
            a00Var2.N0();
        } else if (!xi0.o(a00Var, a00Var2)) {
            if (a00Var != null) {
                a00Var.M0();
                a00Var.O0(qt0Var);
            }
            if (a00Var2 != null) {
                a00Var2.N0();
            }
        } else if (a00Var != null) {
            a00Var.O0(qt0Var);
        } else {
            a00 a00Var5 = this.t;
            if (a00Var5 != null) {
                a00Var5.O0(qt0Var);
            }
        }
        this.s = a00Var;
    }

    public final void P0() {
        a00 a00Var = this.t;
        if (a00Var != null) {
            a00Var.P0();
            return;
        }
        a00 a00Var2 = this.s;
        if (a00Var2 != null) {
            a00Var2.P0();
        }
    }

    @Override // defpackage.xk0, defpackage.av0
    public final void c(long j) {
        this.u = j;
    }

    @Override // defpackage.i22
    public final Object p() {
        return v20.D;
    }
}
