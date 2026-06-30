package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sf0 extends yw implements vp {
    public fx1 A;
    public h9 B;
    public ym1 C;
    public final h9 D;
    public final ki E;
    public boolean u;
    public jx0 v;
    public float w = 2.0f;
    public float x = 1.0f;
    public boolean y;
    public jr1 z;

    public sf0(boolean z, jx0 jx0Var, fx1 fx1Var, ym1 ym1Var) {
        this.u = z;
        this.v = jx0Var;
        this.A = fx1Var;
        this.C = ym1Var;
        this.D = new h9(new tz((this.y && z) ? 2.0f : 1.0f), c2.R, null, 12);
        ki kiVar = new ki(new li(), new n(12, this));
        L0(kiVar);
        this.E = kiVar;
    }

    public static final void O0(sf0 sf0Var, zu1 zu1Var) throws Throwable {
        sf0Var.y = false;
        ArrayList arrayList = new ArrayList();
        tn1 tn1Var = sf0Var.v.a;
        r70 r70Var = new r70(2, arrayList, sf0Var);
        tn1Var.getClass();
        tn1.k(tn1Var, r70Var, zu1Var);
    }

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.sv0
    public final void D0() {
        this.z = nu0.A(z0(), null, null, new rf0(this, null, 2), 3);
        if (this.B == null) {
            fx1 fx1VarM = this.A;
            if (fx1VarM == null) {
                fx1VarM = l91.m(((ju0) hk.o(this, mu0.b)).a, (xz1) hk.o(this, yz1.a));
            }
            long j = !this.u ? fx1VarM.n : this.y ? fx1VarM.l : fx1VarM.m;
            this.B = new h9(new vl(j), new r22(a4.t, new g3(6, vl.f(j))), null, 12);
        }
    }

    public final void P0() {
        ks ksVar = null;
        nu0.A(z0(), null, null, new rf0(this, ksVar, 0), 3);
        nu0.A(z0(), null, null, new rf0(this, ksVar, 1), 3);
    }
}
