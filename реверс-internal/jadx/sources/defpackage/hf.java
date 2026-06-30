package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hf implements tw1 {
    public final jo a;
    public final qy0 b = new qy0();
    public final v41 c = xc.B(null);

    public hf(jo joVar) {
        this.a = joVar;
    }

    @Override // defpackage.tw1
    public final Object a(lw1 lw1Var, zu1 zu1Var) {
        ks ksVar = null;
        k8 k8Var = new k8(this, new gf(lw1Var), ksVar, 1);
        qy0 qy0Var = this.b;
        qy0Var.getClass();
        Object objR = bl.r(new i9(qy0Var, k8Var, ksVar, 3), zu1Var);
        return objR == wt.e ? objR : t32.a;
    }

    public final void b(final ha0 ha0Var, ob0 ob0Var, final int i) {
        final ha0 ha0Var2;
        ob0 ob0Var2;
        ob0Var.X(723898654);
        int i2 = (ob0Var.f(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (ob0Var.N(i2 & 1, (i2 & 19) != 18)) {
            gf gfVar = (gf) this.c.getValue();
            if (gfVar == null) {
                dc1 dc1VarR = ob0Var.r();
                if (dc1VarR != null) {
                    dc1VarR.d = new wa0(this, ha0Var, i, i3) { // from class: ff
                        public final /* synthetic */ int e;
                        public final /* synthetic */ hf f;
                        public final /* synthetic */ ha0 g;

                        {
                            this.e = i3;
                            this.f = this;
                        }

                        @Override // defpackage.wa0
                        public final Object h(Object obj, Object obj2) {
                            int i5 = this.e;
                            t32 t32Var = t32.a;
                            ha0 ha0Var3 = this.g;
                            hf hfVar = this.f;
                            ob0 ob0Var3 = (ob0) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    hfVar.b(ha0Var3, ob0Var3, al.V(7));
                                    break;
                                default:
                                    hfVar.b(ha0Var3, ob0Var3, al.V(7));
                                    break;
                            }
                            return t32Var;
                        }
                    };
                    return;
                }
                return;
            }
            ha0Var2 = ha0Var;
            ob0Var2 = ob0Var;
            this.a.j(gfVar, gfVar.a, ha0Var2, ob0Var2, 384);
        } else {
            ha0Var2 = ha0Var;
            ob0Var2 = ob0Var;
            ob0Var2.Q();
        }
        dc1 dc1VarR2 = ob0Var2.r();
        if (dc1VarR2 != null) {
            dc1VarR2.d = new wa0(this, ha0Var2, i, i4) { // from class: ff
                public final /* synthetic */ int e;
                public final /* synthetic */ hf f;
                public final /* synthetic */ ha0 g;

                {
                    this.e = i4;
                    this.f = this;
                }

                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    int i5 = this.e;
                    t32 t32Var = t32.a;
                    ha0 ha0Var3 = this.g;
                    hf hfVar = this.f;
                    ob0 ob0Var3 = (ob0) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            hfVar.b(ha0Var3, ob0Var3, al.V(7));
                            break;
                        default:
                            hfVar.b(ha0Var3, ob0Var3, al.V(7));
                            break;
                    }
                    return t32Var;
                }
            };
        }
    }
}
