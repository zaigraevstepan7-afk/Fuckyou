package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ct0 extends z61 implements pu0, h3, fw0 {
    public Object B;
    public boolean F;
    public final ul0 j;
    public boolean k;
    public boolean o;
    public boolean p;
    public boolean q;
    public kr r;
    public sa0 t;
    public boolean y;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public ol0 n = ol0.g;
    public long s = 0;
    public at0 u = at0.g;
    public final rl0 v = new rl0(this, 1);
    public final iy0 w = new iy0(new ct0[16]);
    public boolean x = true;
    public final bt0 z = new bt0(this, 0);
    public boolean A = true;
    public long C = lr.b(0, 0, 0, 0, 15);
    public final bt0 D = new bt0(this, 2);
    public final bt0 E = new bt0(this, 1);

    public ct0(ul0 ul0Var) {
        this.j = ul0Var;
        this.B = ul0Var.p.v;
    }

    public final void A0() {
        ml0 ml0Var;
        this.F = true;
        ul0 ul0Var = this.j;
        ql0 ql0VarU = ul0Var.a.u();
        at0 at0Var = this.u;
        if ((at0Var != at0.e && !ul0Var.c) || (at0Var != at0.f && ul0Var.c)) {
            t0();
            if (this.k && ql0VarU != null) {
                ql0VarU.W(false);
            }
        }
        if (ql0VarU != null) {
            ul0 ul0Var2 = ql0VarU.J;
            if (!this.k && ((ml0Var = ul0Var2.d) == ml0.g || ml0Var == ml0.h)) {
                if (this.m != Integer.MAX_VALUE) {
                    ng0.b("Place was called on a node which was placed already");
                }
                int i = ul0Var2.h;
                this.m = i;
                ul0Var2.h = i + 1;
            }
        } else {
            this.m = 0;
        }
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0084, B:31:0x006e), top: B:36:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0(long j, sa0 sa0Var) {
        ul0 ul0Var = this.j;
        ql0 ql0Var = ul0Var.a;
        ql0 ql0Var2 = ul0Var.a;
        try {
            ql0 ql0VarU = ql0Var.u();
            ml0 ml0Var = ql0VarU != null ? ql0VarU.J.d : null;
            ml0 ml0Var2 = ml0.h;
            if (ml0Var == ml0Var2) {
                ul0Var.c = false;
            }
            if (ql0Var2.R) {
                ng0.a("place is called on a deactivated node");
            }
            ul0Var.d = ml0Var2;
            boolean z = true;
            this.p = true;
            this.F = false;
            if (!oh0.a(j, this.s)) {
                if (ul0Var.n || ul0Var.m) {
                    ul0Var.f = true;
                }
                u0();
            }
            w31 w31VarA = tl0.a(ql0Var2);
            this.s = j;
            if (ul0Var.f) {
                ul0Var.h(false);
                this.v.g = false;
                y31 snapshotObserver = ((h4) w31VarA).getSnapshotObserver();
                snapshotObserver.a.c(ql0Var2, snapshotObserver.g, this.E);
            } else {
                if (this.u == at0.g) {
                    z = false;
                }
                if (z) {
                    ys0 ys0VarU0 = ul0Var.a().U0();
                    ys0VarU0.getClass();
                    ys0VarU0.N0(oh0.c(j, ys0VarU0.i));
                    A0();
                }
            }
            this.t = sa0Var;
            ul0Var.d = ml0.i;
        } catch (Throwable th) {
            ql0Var.c0(th);
            throw null;
        }
    }

    public final boolean C0(long j) {
        ul0 ul0Var = this.j;
        ql0 ql0Var = ul0Var.a;
        ql0 ql0Var2 = ul0Var.a;
        try {
            if (ql0Var.R) {
                ng0.a("measure is called on a deactivated node");
            }
            ql0 ql0VarU = ql0Var2.u();
            ql0Var2.H = ql0Var2.H || (ql0VarU != null && ql0VarU.H);
            if (!ql0Var2.J.e) {
                kr krVar = this.r;
                if (krVar == null ? false : kr.b(krVar.a, j)) {
                    w31 w31Var = ql0Var2.r;
                    if (w31Var != null) {
                        ((h4) w31Var).h(ql0Var2, true);
                    }
                    ql0Var2.b0();
                    return false;
                }
            }
            this.r = new kr(j);
            o0(j);
            this.v.f = false;
            iy0 iy0VarY = ql0Var2.y();
            Object[] objArr = iy0VarY.e;
            int i = iy0VarY.g;
            for (int i2 = 0; i2 < i; i2++) {
                ct0 ct0Var = ((ql0) objArr[i2]).J.q;
                ct0Var.getClass();
                ct0Var.v.c = false;
            }
            long j2 = this.q ? this.g : -9223372034707292160L;
            this.q = true;
            ys0 ys0VarU0 = ul0Var.a().U0();
            if (ys0VarU0 == null) {
                ng0.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            ul0Var.c(j);
            n0((((long) ys0VarU0.e) << 32) | (((long) ys0VarU0.f) & 4294967295L));
            return (((int) (j2 >> 32)) == ys0VarU0.e && ((int) (j2 & 4294967295L)) == ys0VarU0.f) ? false : true;
        } catch (Throwable th) {
            ql0Var.c0(th);
            throw null;
        }
    }

    @Override // defpackage.pu0
    public final int O(int i) {
        z0();
        ys0 ys0VarU0 = this.j.a().U0();
        ys0VarU0.getClass();
        return ys0VarU0.O(i);
    }

    @Override // defpackage.h3
    public final int P() {
        return this.m;
    }

    @Override // defpackage.h3
    public final void R() {
        ql0.X(this.j.a, false, 7);
    }

    @Override // defpackage.pu0
    public final int U(int i) {
        z0();
        ys0 ys0VarU0 = this.j.a().U0();
        ys0VarU0.getClass();
        return ys0VarU0.U(i);
    }

    @Override // defpackage.h3
    public final rl0 a() {
        return this.v;
    }

    @Override // defpackage.pu0
    public final int a0(int i) {
        z0();
        ys0 ys0VarU0 = this.j.a().U0();
        ys0VarU0.getClass();
        return ys0VarU0.a0(i);
    }

    @Override // defpackage.z61
    public final int b0(c3 c3Var) {
        ul0 ul0Var = this.j;
        ql0 ql0VarU = ul0Var.a.u();
        ml0 ml0Var = ql0VarU != null ? ql0VarU.J.d : null;
        ml0 ml0Var2 = ml0.f;
        rl0 rl0Var = this.v;
        if (ml0Var == ml0Var2) {
            rl0Var.c = true;
        } else {
            ql0 ql0VarU2 = ul0Var.a.u();
            if ((ql0VarU2 != null ? ql0VarU2.J.d : null) == ml0.h) {
                rl0Var.d = true;
            }
        }
        this.o = true;
        ys0 ys0VarU0 = ul0Var.a().U0();
        ys0VarU0.getClass();
        int iB0 = ys0VarU0.b0(c3Var);
        this.o = false;
        return iB0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // defpackage.pu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z61 e(long j) {
        ol0 ol0Var;
        ul0 ul0Var = this.j;
        ql0 ql0Var = ul0Var.a;
        ql0 ql0Var2 = ul0Var.a;
        ql0 ql0VarU = ql0Var.u();
        if ((ql0VarU != null ? ql0VarU.J.d : null) == ml0.f) {
            ul0Var.b = false;
        } else {
            ql0 ql0VarU2 = ql0Var2.u();
            if ((ql0VarU2 != null ? ql0VarU2.J.d : null) == ml0.h) {
            }
        }
        ql0 ql0VarU3 = ql0Var2.u();
        ol0 ol0Var2 = ol0.g;
        if (ql0VarU3 != null) {
            ul0 ul0Var2 = ql0VarU3.J;
            if (this.n != ol0Var2 && !ql0Var2.H) {
                ng0.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = ul0Var2.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                ol0Var = ol0.e;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    yc.k(ul0Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                ol0Var = ol0.f;
            }
            this.n = ol0Var;
        } else {
            this.n = ol0Var2;
        }
        if (ql0Var2.F == ol0Var2) {
            ql0Var2.e();
        }
        C0(j);
        return this;
    }

    @Override // defpackage.pu0
    public final int f(int i) {
        z0();
        ys0 ys0VarU0 = this.j.a().U0();
        ys0VarU0.getClass();
        return ys0VarU0.f(i);
    }

    @Override // defpackage.z61, defpackage.pu0
    public final Object i() {
        return this.B;
    }

    @Override // defpackage.h3
    public final void k(g3 g3Var) {
        iy0 iy0VarY = this.j.a.y();
        Object[] objArr = iy0VarY.e;
        int i = iy0VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            ct0 ct0Var = ((ql0) objArr[i2]).J.q;
            ct0Var.getClass();
            g3Var.i(ct0Var);
        }
    }

    @Override // defpackage.z61
    public final void k0(long j, float f, sa0 sa0Var) {
        B0(j, sa0Var);
    }

    @Override // defpackage.fw0
    public final void m(boolean z) {
        ys0 ys0VarU0;
        ul0 ul0Var = this.j;
        ys0 ys0VarU02 = ul0Var.a().U0();
        if (Boolean.valueOf(z).equals(ys0VarU02 != null ? Boolean.valueOf(ys0VarU02.p) : null) || (ys0VarU0 = ul0Var.a().U0()) == null) {
            return;
        }
        ys0VarU0.p = z;
    }

    @Override // defpackage.h3
    public final tg0 n() {
        return this.j.a.I.c;
    }

    @Override // defpackage.h3
    public final h3 o() {
        ul0 ul0Var;
        ql0 ql0VarU = this.j.a.u();
        if (ql0VarU == null || (ul0Var = ql0VarU.J) == null) {
            return null;
        }
        return ul0Var.q;
    }

    @Override // defpackage.h3
    public final void p() {
        this.y = true;
        rl0 rl0Var = this.v;
        rl0Var.h();
        ul0 ul0Var = this.j;
        boolean z = ul0Var.f;
        ql0 ql0Var = ul0Var.a;
        if (z) {
            iy0 iy0VarY = ql0Var.y();
            Object[] objArr = iy0VarY.e;
            int i = iy0VarY.g;
            for (int i2 = 0; i2 < i; i2++) {
                ql0 ql0Var2 = (ql0) objArr[i2];
                ul0 ul0Var2 = ql0Var2.J;
                if (ul0Var2.e && ql0Var2.s() == ol0.e) {
                    ct0 ct0Var = ul0Var2.q;
                    ct0Var.getClass();
                    ct0 ct0Var2 = ul0Var2.q;
                    kr krVar = ct0Var2 != null ? ct0Var2.r : null;
                    krVar.getClass();
                    if (ct0Var.C0(krVar.a)) {
                        ql0.X(ql0Var, false, 7);
                    }
                }
            }
        }
        sg0 sg0Var = n().a0;
        sg0Var.getClass();
        if (ul0Var.g || (!this.o && !sg0Var.s && ul0Var.f)) {
            ul0Var.f = false;
            ml0 ml0Var = ul0Var.d;
            ul0Var.d = ml0.h;
            ul0Var.i(false);
            y31 snapshotObserver = ((h4) tl0.a(ql0Var)).getSnapshotObserver();
            snapshotObserver.a.c(ql0Var, snapshotObserver.h, this.z);
            ul0Var.d = ml0Var;
            if (ul0Var.m && sg0Var.s) {
                requestLayout();
            }
            ul0Var.g = false;
        }
        if (rl0Var.d) {
            rl0Var.e = true;
        }
        if (rl0Var.b && rl0Var.e()) {
            rl0Var.g();
        }
        this.y = false;
    }

    public final boolean q0() {
        ul0 ul0Var = this.j;
        return bk.K(ul0Var.a) || ul0Var.c;
    }

    public final void r0(boolean z) {
        if (z && q0()) {
            return;
        }
        if (z || q0()) {
            this.u = at0.g;
            iy0 iy0VarY = this.j.a.y();
            Object[] objArr = iy0VarY.e;
            int i = iy0VarY.g;
            for (int i2 = 0; i2 < i; i2++) {
                ct0 ct0Var = ((ql0) objArr[i2]).J.q;
                ct0Var.getClass();
                ct0Var.r0(true);
            }
        }
    }

    @Override // defpackage.h3
    public final void requestLayout() {
        this.j.a.W(false);
    }

    public final void t0() {
        at0 at0Var = this.u;
        ul0 ul0Var = this.j;
        boolean z = ul0Var.c;
        ql0 ql0Var = ul0Var.a;
        at0 at0Var2 = at0.e;
        if (z) {
            this.u = at0.f;
        } else {
            this.u = at0Var2;
        }
        if (at0Var != at0Var2 && ul0Var.e) {
            ql0.X(ql0Var, true, 6);
        }
        iy0 iy0VarY = ql0Var.y();
        Object[] objArr = iy0VarY.e;
        int i = iy0VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            ql0 ql0Var2 = (ql0) objArr[i2];
            ct0 ct0Var = ql0Var2.J.q;
            if (ct0Var == null) {
                yc.p("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (ct0Var.m != Integer.MAX_VALUE) {
                ct0Var.t0();
                ql0.a0(ql0Var2);
            }
        }
    }

    public final void u0() {
        ul0 ul0Var = this.j;
        if (ul0Var.o > 0) {
            iy0 iy0VarY = ul0Var.a.y();
            Object[] objArr = iy0VarY.e;
            int i = iy0VarY.g;
            for (int i2 = 0; i2 < i; i2++) {
                ql0 ql0Var = (ql0) objArr[i2];
                ul0 ul0Var2 = ql0Var.J;
                if ((ul0Var2.m || ul0Var2.n) && !ul0Var2.f) {
                    ql0Var.W(false);
                }
                ct0 ct0Var = ul0Var2.q;
                if (ct0Var != null) {
                    ct0Var.u0();
                }
            }
        }
    }

    public final void z0() {
        ul0 ul0Var = this.j;
        ql0.X(ul0Var.a, false, 7);
        ql0 ql0Var = ul0Var.a;
        ql0 ql0VarU = ql0Var.u();
        if (ql0VarU == null || ql0Var.F != ol0.g) {
            return;
        }
        int iOrdinal = ql0VarU.J.d.ordinal();
        ql0Var.F = iOrdinal != 0 ? iOrdinal != 2 ? ql0VarU.F : ol0.f : ol0.e;
    }
}
