package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ys extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ q81 k;
    public final /* synthetic */ ex1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys(q81 q81Var, ex1 ex1Var, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = q81Var;
        this.l = ex1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((ys) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        switch (this.i) {
            case 0:
                return new ys(this.k, this.l, ksVar, 0);
            case 1:
                return new ys(this.k, this.l, ksVar, 1);
            default:
                return new ys(this.k, this.l, ksVar, 2);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        ex1 ex1Var = this.l;
        q81 q81Var = this.k;
        wt wtVar = wt.e;
        t32 t32Var = t32.a;
        ks ksVar = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.j;
                if (i3 != 0) {
                    if (i3 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        xc.G(obj);
                    }
                    break;
                } else {
                    xc.G(obj);
                    this.j = 1;
                    Object objR = bl.r(new da(q81Var, ex1Var, ksVar, 2), this);
                    if (objR != wtVar) {
                        objR = t32Var;
                    }
                    if (objR == wtVar) {
                    }
                }
                break;
            case 1:
                int i4 = this.j;
                if (i4 != 0) {
                    if (i4 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        xc.G(obj);
                    }
                    break;
                } else {
                    xc.G(obj);
                    this.j = 1;
                    Object objO = el.o(q81Var, new ea0(ex1Var, ksVar, i2), this);
                    if (objO != wtVar) {
                        objO = t32Var;
                    }
                    if (objO == wtVar) {
                    }
                }
                break;
            default:
                int i5 = this.j;
                if (i5 != 0) {
                    if (i5 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        xc.G(obj);
                    }
                    break;
                } else {
                    xc.G(obj);
                    this.j = 1;
                    ns0 ns0Var = new ns0(ex1Var, 0);
                    os0 os0Var = new os0(ex1Var, 0);
                    os0 os0Var2 = new os0(ex1Var, 1);
                    ud udVar = new ud(10, ex1Var);
                    float f = s00.a;
                    Object objO2 = el.o(q81Var, new p00(new e2(10), new wi(3, ns0Var), udVar, os0Var2, new n(8, os0Var), null), this);
                    if (objO2 != wtVar) {
                        objO2 = t32Var;
                    }
                    if (objO2 != wtVar) {
                        objO2 = t32Var;
                    }
                    if (objO2 != wtVar) {
                        objO2 = t32Var;
                    }
                    if (objO2 == wtVar) {
                    }
                }
                break;
        }
        return t32Var;
    }
}
