package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ow1 implements lw1 {
    public final long e;
    public final /* synthetic */ pw1 f;

    public ow1(pw1 pw1Var, long j) {
        this.f = pw1Var;
        this.e = j;
    }

    @Override // defpackage.lw1
    public final long g(zk0 zk0Var) {
        zk0 zk0Var2 = (zk0) this.f.v.getValue();
        if (zk0Var2 != null) {
            if (zk0Var2.B()) {
                return zk0Var.t(zk0Var2.c(this.e));
            }
            return 0L;
        }
        qg0.d("Tried to open context menu before the anchor was placed.");
        yc.j();
        return 0L;
    }

    @Override // defpackage.lw1
    public final pc1 m(zk0 zk0Var) {
        return qc1.a(g(zk0Var), 0L);
    }

    @Override // defpackage.lw1
    public final kw1 t0() {
        return ef1.c(this.f);
    }
}
