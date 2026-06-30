package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class we extends sv0 implements o10, u01, pl1 {
    public long s;
    public ym1 t;
    public long u;
    public al0 v;
    public hk w;
    public ym1 x;
    public hk y;

    @Override // defpackage.u01
    public final void K() {
        this.u = 9205357640488583168L;
        this.v = null;
        this.w = null;
        this.x = null;
        al.C(this);
    }

    @Override // defpackage.o10
    public final void M(sl0 sl0Var) {
        sl0 sl0Var2;
        hk hkVar;
        ej ejVar = sl0Var.e;
        if (this.t != pv.w) {
            sl0Var2 = sl0Var;
            if (io1.a(ejVar.d(), this.u) && sl0Var2.getLayoutDirection() == this.v && xi0.o(this.x, this.t)) {
                hkVar = this.w;
                hkVar.getClass();
            } else {
                bk.R(this, new f8(3, this, sl0Var2));
                hkVar = this.y;
                this.y = null;
            }
            this.w = hkVar;
            this.u = ejVar.d();
            this.v = sl0Var2.getLayoutDirection();
            this.x = this.t;
            hkVar.getClass();
            if (!vl.c(this.s, vl.g)) {
                lk.H(sl0Var2, hkVar, this.s);
            }
        } else if (vl.c(this.s, vl.g)) {
            sl0Var2 = sl0Var;
        } else {
            sl0Var2 = sl0Var;
            p10.e0(sl0Var2, this.s, 0L, 0L, 126);
        }
        sl0Var2.a();
    }

    @Override // defpackage.pl1
    public final void g0(am1 am1Var) {
        yl1.c(am1Var, this.t);
    }

    @Override // defpackage.pl1
    public final boolean h() {
        return false;
    }
}
