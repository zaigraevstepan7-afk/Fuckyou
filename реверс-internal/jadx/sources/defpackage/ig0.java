package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ig0 {
    public final iy0 a = new iy0(new gg0[16]);
    public final v41 b = xc.B(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final v41 d = xc.B(Boolean.TRUE);

    public final void a(ob0 ob0Var, int i) {
        ob0Var.X(-318043801);
        int i2 = (ob0Var.h(this) ? 4 : 2) | i;
        if (ob0Var.N(i2 & 1, (i2 & 3) != 2)) {
            Object objK = ob0Var.K();
            ks ksVar = null;
            l91 l91Var = kp.a;
            if (objK == l91Var) {
                objK = xc.B(null);
                ob0Var.f0(objK);
            }
            fy0 fy0Var = (fy0) objK;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                ob0Var.W(-144841960);
                boolean zH = ob0Var.h(this);
                Object objK2 = ob0Var.K();
                if (zH || objK2 == l91Var) {
                    objK2 = new m6(fy0Var, this, ksVar, 10);
                    ob0Var.f0(objK2);
                }
                wi0.i((wa0) objK2, ob0Var, this);
                ob0Var.p(false);
            } else {
                ob0Var.W(-143455237);
                ob0Var.p(false);
            }
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new ud(i, 9, this);
        }
    }
}
