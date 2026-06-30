package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dh extends sv0 implements vg, xk0 {
    public vr s;
    public boolean t;

    public static final pc1 L0(dh dhVar, c01 c01Var, y3 y3Var) {
        pc1 pc1Var;
        if (dhVar.r && dhVar.t) {
            c01 c01VarO = bl.O(dhVar);
            if (!c01Var.W0().r) {
                c01Var = null;
            }
            if (c01Var != null && (pc1Var = (pc1) y3Var.a()) != null) {
                return pc1Var.i(c01VarO.I(c01Var, false).d());
            }
        }
        return null;
    }

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.vg
    public final Object b0(c01 c01Var, y3 y3Var, ls lsVar) {
        Object objR = bl.r(new ch(this, c01Var, y3Var, new ke(this, c01Var, y3Var, 1), null), lsVar);
        return objR == wt.e ? objR : t32.a;
    }

    @Override // defpackage.xk0
    public final void o(zk0 zk0Var) {
        this.t = true;
    }
}
