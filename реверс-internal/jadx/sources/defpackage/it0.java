package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class it0 extends sv0 implements cc0, o10, pl1, u01 {
    public vh0 B;
    public rh C;
    public uq s;
    public uy1 t;
    public h71 u;
    public View v;
    public hx w;
    public g71 x;
    public qx z;
    public final v41 y = new v41(null, v20.S);
    public long A = 9205357640488583168L;

    public it0(uq uqVar, uy1 uy1Var, h71 h71Var) {
        this.s = uqVar;
        this.t = uy1Var;
        this.u = h71Var;
    }

    @Override // defpackage.sv0
    public final void D0() {
        K();
        this.C = nu0.d(0, 7, null);
        nu0.A(z0(), null, yt.h, new tv(this, (ks) null, 8), 1);
    }

    @Override // defpackage.sv0
    public final void E0() {
        g71 g71Var = this.x;
        if (g71Var != null) {
            ((i71) g71Var).b();
        }
        this.x = null;
    }

    @Override // defpackage.u01
    public final void K() {
        bk.R(this, new ht0(this, 0));
    }

    public final long L0() {
        if (this.z == null) {
            this.z = xc.s(new ht0(this, 2));
        }
        qx qxVar = this.z;
        if (qxVar != null) {
            return ((w01) qxVar.getValue()).a;
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.o10
    public final void M(sl0 sl0Var) {
        sl0Var.a();
        rh rhVar = this.C;
        if (rhVar != null) {
            rhVar.t(t32.a);
        }
    }

    public final void M0() {
        g71 g71Var = this.x;
        if (g71Var != null) {
            ((i71) g71Var).b();
        }
        View viewL = this.v;
        if (viewL == null) {
            viewL = el.L(this);
        }
        this.v = viewL;
        hx hxVar = this.w;
        if (hxVar == null) {
            hxVar = bl.P(this).B;
        }
        this.w = hxVar;
        this.x = this.u.b(viewL, hxVar);
        O0();
    }

    public final void N0() {
        hx hxVar = this.w;
        if (hxVar == null) {
            hxVar = bl.P(this).B;
            this.w = hxVar;
        }
        long j = ((w01) this.s.i(hxVar)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & L0()) == 9205357640488583168L) {
            this.A = 9205357640488583168L;
            g71 g71Var = this.x;
            if (g71Var != null) {
                ((i71) g71Var).b();
                return;
            }
            return;
        }
        this.A = w01.e(L0(), j);
        if (this.x == null) {
            M0();
        }
        g71 g71Var2 = this.x;
        if (g71Var2 != null) {
            g71Var2.a(this.A, 9205357640488583168L);
        }
        O0();
    }

    public final void O0() {
        hx hxVar;
        g71 g71Var = this.x;
        if (g71Var == null || (hxVar = this.w) == null) {
            return;
        }
        i71 i71Var = (i71) g71Var;
        long jC = i71Var.c();
        vh0 vh0Var = this.B;
        if (vh0Var != null && jC == vh0Var.a) {
            return;
        }
        this.t.i(new wz(hxVar.w(xk.P(i71Var.c()))));
        this.B = new vh0(i71Var.c());
    }

    @Override // defpackage.pl1
    public final void g0(am1 am1Var) {
        am1Var.a(jt0.a, new ht0(this, 1));
    }

    @Override // defpackage.cc0
    public final void t(c01 c01Var) {
        this.y.setValue(c01Var);
    }
}
