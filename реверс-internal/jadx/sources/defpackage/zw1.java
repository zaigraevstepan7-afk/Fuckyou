package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zw1 extends yw implements vp, lw1 {
    public n81 u;
    public cv v;
    public my1 w;
    public vs x;
    public jr1 y;
    public final qx z = xc.s(new p7(25, this));
    public pc1 A = pc1.e;

    public zw1(n81 n81Var, cv cvVar, my1 my1Var, vs vsVar) {
        this.u = n81Var;
        this.v = cvVar;
        this.w = my1Var;
        this.x = vsVar;
    }

    @Override // defpackage.sv0
    public final void D0() {
        n81 n81Var = this.u;
        n81Var.c = k12.g;
        n81Var.b = this;
    }

    @Override // defpackage.sv0
    public final void E0() {
        n81 n81Var = this.u;
        n81Var.c = k12.f;
        n81Var.b = null;
    }

    @Override // defpackage.lw1
    public final long g(zk0 zk0Var) {
        return m(zk0Var).d();
    }

    @Override // defpackage.lw1
    public final pc1 m(zk0 zk0Var) {
        if (!this.r) {
            return this.A;
        }
        pc1 pc1Var = (pc1) this.x.i(zk0Var);
        if (pc1Var == null) {
            return this.A;
        }
        this.A = pc1Var;
        return pc1Var;
    }

    @Override // defpackage.lw1
    public final kw1 t0() {
        return (kw1) this.z.getValue();
    }
}
