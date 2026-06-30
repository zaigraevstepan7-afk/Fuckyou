package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jj1 extends yw implements vp, u01 {
    public v5 A;
    public uj1 B;
    public xw C;
    public w5 D;
    public v5 E;
    public boolean F;
    public vj1 u;
    public k31 v;
    public boolean w;
    public aw x;
    public jx0 y;
    public boolean z;

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.sv0
    public final void D0() {
        this.F = P0();
        O0();
        if (this.B == null) {
            vj1 vj1Var = this.u;
            uj1 uj1Var = new uj1(this.z ? this.E : this.A, this.x, this.y, this.v, vj1Var, this.w, this.F);
            L0(uj1Var);
            this.B = uj1Var;
        }
    }

    @Override // defpackage.sv0
    public final void E0() {
        xw xwVar = this.C;
        if (xwVar != null) {
            M0(xwVar);
        }
    }

    @Override // defpackage.u01
    public final void K() {
        w5 w5Var = (w5) hk.o(this, s31.a);
        if (xi0.o(w5Var, this.D)) {
            return;
        }
        this.D = w5Var;
        this.E = null;
        xw xwVar = this.C;
        if (xwVar != null) {
            M0(xwVar);
        }
        this.C = null;
        O0();
        uj1 uj1Var = this.B;
        if (uj1Var != null) {
            vj1 vj1Var = this.u;
            k31 k31Var = this.v;
            uj1Var.g1(this.z ? this.E : this.A, this.x, this.y, k31Var, vj1Var, this.w, this.F);
        }
    }

    public final void O0() {
        xw xwVar = this.C;
        if (xwVar != null) {
            if (((sv0) xwVar).e.r) {
                return;
            }
            L0(xwVar);
            return;
        }
        if (this.z) {
            bk.R(this, new p7(18, this));
        }
        v5 v5Var = this.z ? this.E : this.A;
        if (v5Var != null) {
            yw ywVar = v5Var.i;
            if (ywVar.e.r) {
                return;
            }
            L0(ywVar);
            this.C = ywVar;
        }
    }

    public final boolean P0() {
        return (this.r ? bl.P(this).C : al0.e) != al0.f || this.v == k31.e;
    }

    public final void Q0(v5 v5Var, aw awVar, jx0 jx0Var, k31 k31Var, vj1 vj1Var, boolean z, boolean z2) {
        boolean z3;
        this.u = vj1Var;
        this.v = k31Var;
        boolean z4 = true;
        if (this.z != z) {
            this.z = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (xi0.o(this.A, v5Var)) {
            z4 = false;
        } else {
            this.A = v5Var;
        }
        if (z3 || (z4 && !z)) {
            xw xwVar = this.C;
            if (xwVar != null) {
                M0(xwVar);
            }
            this.C = null;
            O0();
        }
        this.w = z2;
        this.x = awVar;
        this.y = jx0Var;
        boolean zP0 = P0();
        this.F = zP0;
        uj1 uj1Var = this.B;
        if (uj1Var != null) {
            uj1Var.g1(this.z ? this.E : this.A, awVar, jx0Var, k31Var, vj1Var, z2, zP0);
        }
    }

    @Override // defpackage.xw
    public final void u0() {
        boolean zP0 = P0();
        if (this.F != zP0) {
            this.F = zP0;
            vj1 vj1Var = this.u;
            k31 k31Var = this.v;
            boolean z = this.z;
            Q0(z ? this.E : this.A, this.x, this.y, k31Var, vj1Var, z, this.w);
        }
    }
}
