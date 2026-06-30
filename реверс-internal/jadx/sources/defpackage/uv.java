package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uv extends sv0 implements o10 {
    public final jx0 s;
    public boolean t;
    public boolean u;
    public boolean v;

    public uv(jx0 jx0Var) {
        this.s = jx0Var;
    }

    @Override // defpackage.sv0
    public final void D0() {
        nu0.A(z0(), null, null, new tv(this, (ks) null, 0), 3);
    }

    @Override // defpackage.o10
    public final void M(sl0 sl0Var) {
        sl0Var.a();
        ej ejVar = sl0Var.e;
        if (this.t) {
            p10.e0(sl0Var, vl.b(0.3f, vl.b), 0L, ejVar.d(), 122);
        } else if (this.u || this.v) {
            p10.e0(sl0Var, vl.b(0.1f, vl.b), 0L, ejVar.d(), 122);
        }
    }
}
