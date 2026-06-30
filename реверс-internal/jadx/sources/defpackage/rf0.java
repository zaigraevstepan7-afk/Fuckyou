package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rf0 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ sf0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf0(sf0 sf0Var, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = sf0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((rf0) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        sf0 sf0Var = this.k;
        switch (i) {
            case 0:
                return new rf0(sf0Var, ksVar, 0);
            case 1:
                return new rf0(sf0Var, ksVar, 1);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return new rf0(sf0Var, ksVar, 2);
            default:
                return new rf0(sf0Var, ksVar, 3);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) throws Throwable {
        int i = this.i;
        sf0 sf0Var = this.k;
        t32 t32Var = t32.a;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    h9 h9Var = sf0Var.B;
                    if (h9Var != null) {
                        fx1 fx1VarM = sf0Var.A;
                        if (fx1VarM == null) {
                            fx1VarM = l91.m(((ju0) hk.o(sf0Var, mu0.b)).a, (xz1) hk.o(sf0Var, yz1.a));
                        }
                        vl vlVar = new vl(!sf0Var.u ? fx1VarM.n : sf0Var.y ? fx1VarM.l : fx1VarM.m);
                        wa waVarY = sf0Var.u ? bl.y(((ju0) hk.o(sf0Var, mu0.b)).d, jw0.g) : new rp1();
                        this.j = 1;
                        obj = h9.b(h9Var, vlVar, waVarY, null, null, this, 12);
                        if (obj == wtVar) {
                        }
                    }
                } else if (i2 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
            case 1:
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    h9 h9Var2 = sf0Var.D;
                    tz tzVar = new tz((sf0Var.y && sf0Var.u) ? sf0Var.w : sf0Var.x);
                    wa waVarY2 = sf0Var.u ? bl.y(((ju0) hk.o(sf0Var, mu0.b)).d, jw0.e) : new rp1();
                    this.j = 1;
                    if (h9.b(h9Var2, tzVar, waVarY2, null, null, this, 12) == wtVar) {
                    }
                } else if (i3 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.j;
                if (i4 == 0) {
                    xc.G(obj);
                    this.j = 1;
                    sf0.O0(sf0Var, this);
                } else if (i4 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
            default:
                int i5 = this.j;
                if (i5 == 0) {
                    xc.G(obj);
                    this.j = 1;
                    sf0.O0(sf0Var, this);
                } else if (i5 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
        }
        return wtVar;
    }
}
