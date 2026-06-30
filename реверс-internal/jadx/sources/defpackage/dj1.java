package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dj1 extends sv0 implements il0, pl1 {
    public hj1 s;
    public boolean t;

    @Override // defpackage.il0
    public final int D(ws0 ws0Var, pu0 pu0Var, int i) {
        if (!this.t) {
            i = Integer.MAX_VALUE;
        }
        return pu0Var.a0(i);
    }

    @Override // defpackage.il0
    public final int O(ws0 ws0Var, pu0 pu0Var, int i) {
        if (this.t) {
            i = Integer.MAX_VALUE;
        }
        return pu0Var.O(i);
    }

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        bk.p(j, this.t ? k31.e : k31.f);
        z61 z61VarE = pu0Var.e(kr.a(j, 0, this.t ? kr.h(j) : Integer.MAX_VALUE, 0, this.t ? Integer.MAX_VALUE : kr.g(j), 5));
        int i = z61VarE.e;
        int iH = kr.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = z61VarE.f;
        int iG = kr.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = z61VarE.f - i2;
        int i4 = z61VarE.e - i;
        if (!this.t) {
            i3 = i4;
        }
        hj1 hj1Var = this.s;
        s41 s41Var = hj1Var.f;
        s41 s41Var2 = hj1Var.a;
        s41Var.h(i3);
        sp1 sp1VarL = uc1.l();
        sa0 sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
        sp1 sp1VarU = uc1.u(sp1VarL);
        try {
            if (s41Var2.g() > i3) {
                s41Var2.h(i3);
            }
            uc1.B(sp1VarL, sp1VarU, sa0VarE);
            this.s.b.h(this.t ? i2 : i);
            this.s.c.h(this.t ? z61VarE.f : z61VarE.e);
            this.s.d.setValue(Boolean.FALSE);
            return xu0Var.f0(i, i2, g40.e, new cc1(i3, 1, this, z61VarE));
        } catch (Throwable th) {
            uc1.B(sp1VarL, sp1VarU, sa0VarE);
            throw th;
        }
    }

    @Override // defpackage.il0
    public final int f(ws0 ws0Var, pu0 pu0Var, int i) {
        if (this.t) {
            i = Integer.MAX_VALUE;
        }
        return pu0Var.U(i);
    }

    @Override // defpackage.pl1
    public final void g0(am1 am1Var) {
        ck0[] ck0VarArr = yl1.a;
        zl1 zl1Var = vl1.n;
        ck0[] ck0VarArr2 = yl1.a;
        ck0 ck0Var = ck0VarArr2[6];
        am1Var.a(zl1Var, Boolean.TRUE);
        final int i = 0;
        final int i2 = 1;
        wi1 wi1Var = new wi1(new ha0(this) { // from class: cj1
            public final /* synthetic */ dj1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ha0
            public final Object a() {
                int iG;
                int i3 = i;
                dj1 dj1Var = this.f;
                switch (i3) {
                    case 0:
                        iG = dj1Var.s.a.g();
                        break;
                    default:
                        iG = dj1Var.s.f.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        }, new ha0(this) { // from class: cj1
            public final /* synthetic */ dj1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ha0
            public final Object a() {
                int iG;
                int i3 = i2;
                dj1 dj1Var = this.f;
                switch (i3) {
                    case 0:
                        iG = dj1Var.s.a.g();
                        break;
                    default:
                        iG = dj1Var.s.f.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        });
        if (this.t) {
            zl1 zl1Var2 = vl1.w;
            ck0 ck0Var2 = ck0VarArr2[13];
            am1Var.a(zl1Var2, wi1Var);
        } else {
            zl1 zl1Var3 = vl1.v;
            ck0 ck0Var3 = ck0VarArr2[12];
            am1Var.a(zl1Var3, wi1Var);
        }
    }

    @Override // defpackage.il0
    public final int n(ws0 ws0Var, pu0 pu0Var, int i) {
        if (!this.t) {
            i = Integer.MAX_VALUE;
        }
        return pu0Var.f(i);
    }
}
