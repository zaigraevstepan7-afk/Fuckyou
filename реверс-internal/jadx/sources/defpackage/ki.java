package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ki extends sv0 implements u01, wh, o10 {
    public final li s;
    public boolean t;
    public sa0 u;

    public ki(li liVar, sa0 sa0Var) {
        this.s = liVar;
        this.u = sa0Var;
        liVar.e = this;
    }

    @Override // defpackage.sv0
    public final void F0() {
        L0();
    }

    @Override // defpackage.u01
    public final void K() {
        L0();
    }

    public final void L0() {
        this.t = false;
        this.s.f = null;
        al.C(this);
    }

    @Override // defpackage.o10
    public final void M(sl0 sl0Var) {
        boolean z = this.t;
        li liVar = this.s;
        if (!z) {
            liVar.f = null;
            bk.R(this, new y3(3, this, liVar));
            if (liVar.f == null) {
                throw s91.g("DrawResult not defined, did you forget to call onDraw?");
            }
            this.t = true;
        }
        qt0 qt0Var = liVar.f;
        qt0Var.getClass();
        ((sa0) qt0Var.f).i(sl0Var);
    }

    @Override // defpackage.xw, defpackage.p81
    public final void a() {
        L0();
    }

    @Override // defpackage.wh
    public final hx b() {
        return bl.P(this).B;
    }

    @Override // defpackage.wh
    public final long d() {
        return xk.P(bl.N(this, 4).g);
    }

    @Override // defpackage.wh
    public final al0 getLayoutDirection() {
        return bl.P(this).C;
    }

    @Override // defpackage.o10
    public final void o0() {
        L0();
    }

    @Override // defpackage.xw
    public final void u0() {
        L0();
    }

    @Override // defpackage.sv0
    public final void E0() {
    }
}
