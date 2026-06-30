package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ul0 {
    public final ql0 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public ct0 q;
    public ml0 d = ml0.i;
    public final tu0 p = new tu0(this);

    public ul0(ql0 ql0Var) {
        this.a = ql0Var;
    }

    public final c01 a() {
        return this.a.I.d;
    }

    public final void b() {
        ml0 ml0Var = this.a.J.d;
        ml0 ml0Var2 = ml0.g;
        ml0 ml0Var3 = ml0.h;
        if (ml0Var == ml0Var2 || ml0Var == ml0Var3) {
            if (this.p.E) {
                g(true);
            } else {
                f(true);
            }
        }
        if (ml0Var == ml0Var3) {
            ct0 ct0Var = this.q;
            if (ct0Var == null || !ct0Var.y) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        ct0 ct0Var = this.q;
        if (ct0Var != null) {
            ul0 ul0Var = ct0Var.j;
            ul0Var.d = ml0.f;
            ql0 ql0Var = ul0Var.a;
            ul0Var.e = false;
            ct0Var.C = j;
            y31 snapshotObserver = ((h4) tl0.a(ql0Var)).getSnapshotObserver();
            bt0 bt0Var = ct0Var.D;
            snapshotObserver.a.c(ql0Var, snapshotObserver.b, bt0Var);
            ul0Var.f = true;
            ul0Var.g = true;
            boolean zK = bk.K(ql0Var);
            tu0 tu0Var = ul0Var.p;
            if (zK) {
                tu0Var.z = true;
                tu0Var.A = true;
            } else {
                tu0Var.y = true;
            }
            ul0Var.d = ml0.i;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            ql0 ql0VarU = this.a.u();
            ul0 ul0Var = ql0VarU != null ? ql0VarU.J : null;
            if (ul0Var != null) {
                int i3 = ul0Var.l;
                if (i == 0) {
                    ul0Var.d(i3 - 1);
                } else {
                    ul0Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            ql0 ql0VarU = this.a.u();
            ul0 ul0Var = ql0VarU != null ? ql0VarU.J : null;
            if (ul0Var != null) {
                int i3 = ul0Var.o;
                if (i == 0) {
                    ul0Var.e(i3 - 1);
                } else {
                    ul0Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        tu0 tu0Var = this.p;
        ul0 ul0Var = tu0Var.j;
        Object obj = tu0Var.v;
        ql0 ql0Var = this.a;
        if ((obj != null || ul0Var.a().i() != null) && tu0Var.u) {
            tu0Var.u = false;
            tu0Var.v = ul0Var.a().i();
            ql0 ql0VarU = ql0Var.u();
            if (ql0VarU != null) {
                ql0.Z(ql0VarU, false, 7);
            }
        }
        ct0 ct0Var = this.q;
        if (ct0Var != null) {
            ul0 ul0Var2 = ct0Var.j;
            if (ct0Var.B == null) {
                ys0 ys0VarU0 = ul0Var2.a().U0();
                ys0VarU0.getClass();
                if (ys0VarU0.w.i() == null) {
                    return;
                }
            }
            if (ct0Var.A) {
                ct0Var.A = false;
                ys0 ys0VarU02 = ul0Var2.a().U0();
                ys0VarU02.getClass();
                ct0Var.B = ys0VarU02.w.i();
                if (bk.K(ql0Var)) {
                    ql0 ql0VarU2 = ql0Var.u();
                    if (ql0VarU2 != null) {
                        ql0.Z(ql0VarU2, false, 7);
                        return;
                    }
                    return;
                }
                ql0 ql0VarU3 = ql0Var.u();
                if (ql0VarU3 != null) {
                    ql0.X(ql0VarU3, false, 7);
                }
            }
        }
    }
}
