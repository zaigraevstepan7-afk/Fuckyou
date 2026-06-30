package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class tu0 extends z61 implements pu0, h3, fw0 {
    public boolean A;
    public boolean E;
    public float I;
    public boolean J;
    public sa0 K;
    public float M;
    public boolean O;
    public final ul0 j;
    public boolean k;
    public boolean n;
    public boolean o;
    public boolean q;
    public sa0 s;
    public float t;
    public Object v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public ol0 p = ol0.g;
    public long r = 0;
    public boolean u = true;
    public final rl0 B = new rl0(this, 0);
    public final iy0 C = new iy0(new tu0[16]);
    public boolean D = true;
    public long F = lr.b(0, 0, 0, 0, 15);
    public final su0 G = new su0(this, 1);
    public final su0 H = new su0(this, 0);
    public long L = 0;
    public final su0 N = new su0(this, 2);

    public tu0(ul0 ul0Var) {
        this.j = ul0Var;
    }

    public final void A0(long j, float f, sa0 sa0Var) {
        ul0 ul0Var = this.j;
        ql0 ql0Var = ul0Var.a;
        ql0 ql0Var2 = ul0Var.a;
        if (ql0Var.R) {
            ng0.a("place is called on a deactivated node");
        }
        ul0Var.d = ml0.g;
        this.r = j;
        this.t = f;
        this.s = sa0Var;
        this.J = false;
        w31 w31VarA = tl0.a(ql0Var2);
        if (this.z || !this.w) {
            this.B.g = false;
            ul0Var.f(false);
            this.K = sa0Var;
            this.L = j;
            this.M = f;
            y31 snapshotObserver = ((h4) w31VarA).getSnapshotObserver();
            snapshotObserver.a.c(ql0Var2, snapshotObserver.f, this.N);
        } else {
            c01 c01VarA = ul0Var.a();
            c01VarA.m1(oh0.c(j, c01VarA.i), f, sa0Var);
            z0();
        }
        ul0Var.d = ml0.i;
        if (ul0Var.a().s && (ul0Var.k || ul0Var.j)) {
            requestLayout();
        }
        this.o = true;
    }

    public final boolean B0(long j) {
        ul0 ul0Var = this.j;
        ql0 ql0Var = ul0Var.a;
        ql0 ql0Var2 = ul0Var.a;
        try {
            if (ql0Var.R) {
                ng0.a("measure is called on a deactivated node");
            }
            w31 w31VarA = tl0.a(ql0Var2);
            ql0 ql0VarU = ql0Var2.u();
            boolean z = true;
            ql0Var2.H = ql0Var2.H || (ql0VarU != null && ql0VarU.H);
            if (!ql0Var2.q() && kr.b(this.h, j)) {
                ((h4) w31VarA).h(ql0Var2, false);
                ql0Var2.b0();
                return false;
            }
            this.B.f = false;
            iy0 iy0VarY = ql0Var2.y();
            Object[] objArr = iy0VarY.e;
            int i = iy0VarY.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((ql0) objArr[i2]).J.p.B.c = false;
            }
            this.n = true;
            long j2 = ul0Var.a().g;
            o0(j);
            ml0 ml0Var = ul0Var.d;
            ml0 ml0Var2 = ml0.i;
            if (ml0Var != ml0Var2) {
                ng0.b("layout state is not idle before measure starts");
            }
            this.F = j;
            ml0 ml0Var3 = ml0.e;
            ul0Var.d = ml0Var3;
            this.y = false;
            y31 snapshotObserver = ((h4) tl0.a(ql0Var2)).getSnapshotObserver();
            snapshotObserver.a.c(ql0Var2, snapshotObserver.c, this.G);
            if (ul0Var.d == ml0Var3) {
                this.z = true;
                this.A = true;
                ul0Var.d = ml0Var2;
            }
            if (vh0.a(ul0Var.a().g, j2) && ul0Var.a().e == this.e && ul0Var.a().f == this.f) {
                z = false;
            }
            n0((((long) ul0Var.a().f) & 4294967295L) | (((long) ul0Var.a().e) << 32));
            return z;
        } catch (Throwable th) {
            ql0Var.c0(th);
            throw null;
        }
    }

    public final void C0() {
        ul0 ul0Var = this.j;
        ql0 ql0Var = ul0Var.a;
        ql0 ql0Var2 = ul0Var.a;
        if (!ql0Var.K() || ul0Var.l <= 0) {
            return;
        }
        ul0 ul0Var2 = ql0Var2.J;
        if ((ul0Var2.j || ul0Var2.k) && !ul0Var2.p.z) {
            ql0Var2.Y(false);
        }
        iy0 iy0VarY = ql0Var2.y();
        Object[] objArr = iy0VarY.e;
        int i = iy0VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((ql0) objArr[i2]).J.p.C0();
        }
    }

    @Override // defpackage.pu0
    public final int O(int i) {
        ul0 ul0Var = this.j;
        if (!bk.K(ul0Var.a)) {
            u0();
            return ul0Var.a().O(i);
        }
        ct0 ct0Var = ul0Var.q;
        ct0Var.getClass();
        return ct0Var.O(i);
    }

    @Override // defpackage.h3
    public final int P() {
        return this.m;
    }

    @Override // defpackage.h3
    public final void R() {
        ql0.Z(this.j.a, false, 7);
    }

    @Override // defpackage.pu0
    public final int U(int i) {
        ul0 ul0Var = this.j;
        if (!bk.K(ul0Var.a)) {
            u0();
            return ul0Var.a().U(i);
        }
        ct0 ct0Var = ul0Var.q;
        ct0Var.getClass();
        return ct0Var.U(i);
    }

    @Override // defpackage.h3
    public final rl0 a() {
        return this.B;
    }

    @Override // defpackage.pu0
    public final int a0(int i) {
        ul0 ul0Var = this.j;
        if (!bk.K(ul0Var.a)) {
            u0();
            return ul0Var.a().a0(i);
        }
        ct0 ct0Var = ul0Var.q;
        ct0Var.getClass();
        return ct0Var.a0(i);
    }

    @Override // defpackage.z61
    public final int b0(c3 c3Var) {
        ul0 ul0Var = this.j;
        ql0 ql0VarU = ul0Var.a.u();
        ml0 ml0Var = ql0VarU != null ? ql0VarU.J.d : null;
        ml0 ml0Var2 = ml0.e;
        rl0 rl0Var = this.B;
        if (ml0Var == ml0Var2) {
            rl0Var.c = true;
        } else {
            ql0 ql0VarU2 = ul0Var.a.u();
            if ((ql0VarU2 != null ? ql0VarU2.J.d : null) == ml0.g) {
                rl0Var.d = true;
            }
        }
        this.q = true;
        int iB0 = ul0Var.a().b0(c3Var);
        this.q = false;
        return iB0;
    }

    @Override // defpackage.pu0
    public final z61 e(long j) {
        ol0 ol0Var;
        ul0 ul0Var = this.j;
        ql0 ql0Var = ul0Var.a;
        ql0 ql0Var2 = ul0Var.a;
        ol0 ol0Var2 = ql0Var.F;
        ol0 ol0Var3 = ol0.g;
        if (ol0Var2 == ol0Var3) {
            ql0Var.e();
        }
        if (bk.K(ql0Var2)) {
            ct0 ct0Var = ul0Var.q;
            ct0Var.getClass();
            ct0Var.n = ol0Var3;
            ct0Var.e(j);
        }
        ql0 ql0VarU = ql0Var2.u();
        if (ql0VarU != null) {
            ul0 ul0Var2 = ql0VarU.J;
            if (this.p != ol0Var3 && !ql0Var2.H) {
                ng0.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = ul0Var2.d.ordinal();
            if (iOrdinal == 0) {
                ol0Var = ol0.e;
            } else {
                if (iOrdinal != 2) {
                    yc.k(ul0Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                ol0Var = ol0.f;
            }
            this.p = ol0Var;
        } else {
            this.p = ol0Var3;
        }
        B0(j);
        return this;
    }

    @Override // defpackage.pu0
    public final int f(int i) {
        ul0 ul0Var = this.j;
        if (!bk.K(ul0Var.a)) {
            u0();
            return ul0Var.a().f(i);
        }
        ct0 ct0Var = ul0Var.q;
        ct0Var.getClass();
        return ct0Var.f(i);
    }

    @Override // defpackage.z61
    public final int g0() {
        return this.j.a().g0();
    }

    @Override // defpackage.z61
    public final int h0() {
        return this.j.a().h0();
    }

    @Override // defpackage.z61, defpackage.pu0
    public final Object i() {
        return this.v;
    }

    @Override // defpackage.h3
    public final void k(g3 g3Var) {
        iy0 iy0VarY = this.j.a.y();
        Object[] objArr = iy0VarY.e;
        int i = iy0VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            g3Var.i(((ql0) objArr[i2]).J.p);
        }
    }

    @Override // defpackage.z61
    public final void k0(long j, float f, sa0 sa0Var) {
        y61 placementScope;
        ul0 ul0Var = this.j;
        ql0 ql0Var = ul0Var.a;
        ql0 ql0Var2 = ul0Var.a;
        try {
            this.x = true;
            if (!oh0.a(j, this.r) || sa0Var != this.s || this.O) {
                if (ul0Var.k || ul0Var.j || this.O) {
                    this.z = true;
                    this.O = false;
                }
            }
            ct0 ct0Var = ul0Var.q;
            if (ct0Var != null) {
                ul0 ul0Var2 = ct0Var.j;
                if (ct0Var.u == at0.g && !bk.K(ul0Var2.a)) {
                    ul0Var2.c = true;
                }
            }
            ct0 ct0Var2 = ul0Var.q;
            if (ct0Var2 != null && ct0Var2.q0()) {
                c01 c01Var = ul0Var.a().y;
                if (c01Var == null || (placementScope = c01Var.t) == null) {
                    placementScope = ((h4) tl0.a(ql0Var2)).getPlacementScope();
                }
                ct0 ct0Var3 = ul0Var.q;
                ct0Var3.getClass();
                ql0 ql0VarU = ql0Var2.u();
                if (ql0VarU != null) {
                    ql0VarU.J.h = 0;
                }
                ct0Var3.m = Integer.MAX_VALUE;
                placementScope.g(ct0Var3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            ct0 ct0Var4 = ul0Var.q;
            if (ct0Var4 != null && !ct0Var4.p) {
                ng0.b("Error: Placement happened before lookahead.");
            }
            A0(j, f, sa0Var);
        } catch (Throwable th) {
            ql0Var.c0(th);
            throw null;
        }
    }

    @Override // defpackage.fw0
    public final void m(boolean z) {
        ul0 ul0Var = this.j;
        if (z != ul0Var.a().p) {
            ul0Var.a().p = z;
            this.O = true;
        }
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
        return ul0Var.p;
    }

    @Override // defpackage.h3
    public final void p() {
        this.E = true;
        rl0 rl0Var = this.B;
        rl0Var.h();
        boolean z = this.z;
        ul0 ul0Var = this.j;
        if (z) {
            iy0 iy0VarY = ul0Var.a.y();
            Object[] objArr = iy0VarY.e;
            int i = iy0VarY.g;
            for (int i2 = 0; i2 < i; i2++) {
                ql0 ql0Var = (ql0) objArr[i2];
                if (ql0Var.q() && ql0Var.r() == ol0.e && ql0.S(ql0Var)) {
                    ql0.Z(ul0Var.a, false, 7);
                }
            }
        }
        if (this.A || (!this.q && !n().s && this.z)) {
            this.z = false;
            ml0 ml0Var = ul0Var.d;
            ul0Var.d = ml0.g;
            ul0Var.g(false);
            ql0 ql0Var2 = ul0Var.a;
            y31 snapshotObserver = ((h4) tl0.a(ql0Var2)).getSnapshotObserver();
            snapshotObserver.a.c(ql0Var2, snapshotObserver.e, this.H);
            ul0Var.d = ml0Var;
            this.A = false;
        }
        if (rl0Var.d) {
            rl0Var.e = true;
        }
        if (rl0Var.b && rl0Var.e()) {
            rl0Var.g();
        }
        this.E = false;
    }

    public final List q0() {
        ul0 ul0Var = this.j;
        ul0Var.a.j0();
        boolean z = this.D;
        iy0 iy0Var = this.C;
        if (!z) {
            return iy0Var.f();
        }
        ql0 ql0Var = ul0Var.a;
        iy0 iy0VarY = ql0Var.y();
        Object[] objArr = iy0VarY.e;
        int i = iy0VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            ql0 ql0Var2 = (ql0) objArr[i2];
            if (iy0Var.g <= i2) {
                iy0Var.b(ql0Var2.J.p);
            } else {
                tu0 tu0Var = ql0Var2.J.p;
                Object[] objArr2 = iy0Var.e;
                Object obj = objArr2[i2];
                objArr2[i2] = tu0Var;
            }
        }
        iy0Var.l(((iy0) ((qx0) ql0Var.n()).f).g, iy0Var.g);
        this.D = false;
        return iy0Var.f();
    }

    public final void r0() {
        boolean z = this.w;
        this.w = true;
        ul0 ul0Var = this.j;
        ql0 ql0Var = ul0Var.a;
        xz0 xz0Var = ql0Var.I;
        if (!z) {
            xz0Var.c.h1();
            ((h4) tl0.a(ql0Var)).getRectManager().h(ul0Var.a);
            if (ql0Var.q()) {
                ql0.Z(ql0Var, true, 6);
            } else if (ql0Var.J.e) {
                ql0.X(ql0Var, true, 6);
            }
        }
        c01 c01Var = xz0Var.c.x;
        for (c01 c01Var2 = xz0Var.d; !xi0.o(c01Var2, c01Var) && c01Var2 != null; c01Var2 = c01Var2.x) {
            if (c01Var2.S) {
                c01Var2.d1();
            }
        }
        iy0 iy0VarY = ql0Var.y();
        Object[] objArr = iy0VarY.e;
        int i = iy0VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            ql0 ql0Var2 = (ql0) objArr[i2];
            if (ql0Var2.v() != Integer.MAX_VALUE) {
                ql0Var2.J.p.r0();
                ql0.a0(ql0Var2);
            }
        }
    }

    @Override // defpackage.h3
    public final void requestLayout() {
        this.j.a.Y(false);
    }

    public final void t0() {
        if (this.w) {
            this.w = false;
            ul0 ul0Var = this.j;
            ql0 ql0Var = ul0Var.a;
            ql0 ql0Var2 = ul0Var.a;
            ((h4) tl0.a(ql0Var)).getRectManager().i(ql0Var2);
            xz0 xz0Var = ql0Var2.I;
            c01 c01Var = xz0Var.c.x;
            for (c01 c01Var2 = xz0Var.d; !xi0.o(c01Var2, c01Var) && c01Var2 != null; c01Var2 = c01Var2.x) {
                c01Var2.j1();
                c01Var2.o1();
            }
            iy0 iy0VarY = ql0Var2.y();
            Object[] objArr = iy0VarY.e;
            int i = iy0VarY.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((ql0) objArr[i2]).J.p.t0();
            }
        }
    }

    public final void u0() {
        ul0 ul0Var = this.j;
        ql0.Z(ul0Var.a, false, 7);
        ql0 ql0Var = ul0Var.a;
        ql0 ql0VarU = ql0Var.u();
        if (ql0VarU == null || ql0Var.F != ol0.g) {
            return;
        }
        int iOrdinal = ql0VarU.J.d.ordinal();
        ql0Var.F = iOrdinal != 0 ? iOrdinal != 2 ? ql0VarU.F : ol0.f : ol0.e;
    }

    public final void z0() {
        this.J = true;
        ul0 ul0Var = this.j;
        ql0 ql0VarU = ul0Var.a.u();
        float f = n().I;
        ql0 ql0Var = ul0Var.a;
        xz0 xz0Var = ql0Var.I;
        c01 c01Var = xz0Var.d;
        tg0 tg0Var = xz0Var.c;
        while (c01Var != tg0Var) {
            c01Var.getClass();
            kl0 kl0Var = (kl0) c01Var;
            f += kl0Var.I;
            c01Var = kl0Var.x;
        }
        if (f != this.I) {
            this.I = f;
            if (ql0VarU != null) {
                ql0VarU.Q();
            }
            if (ql0VarU != null) {
                ql0VarU.D();
            }
        }
        if (!n().s) {
            boolean z = this.w;
            if (!z || this.B.d()) {
                r0();
            }
            if (z) {
                ql0Var.I.c.h1();
            } else {
                if (ql0VarU != null) {
                    ql0VarU.D();
                }
                if (this.k && ql0VarU != null) {
                    ql0VarU.Y(false);
                }
            }
        }
        if (ql0VarU != null) {
            ul0 ul0Var2 = ql0VarU.J;
            if (!this.k && ul0Var2.d == ml0.g) {
                if (this.m != Integer.MAX_VALUE) {
                    ng0.b("Place was called on a node which was placed already");
                }
                int i = ul0Var2.i;
                this.m = i;
                ul0Var2.i = i + 1;
            }
        } else {
            this.m = 0;
        }
        p();
    }
}
