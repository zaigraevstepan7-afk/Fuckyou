package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sj extends zu1 implements wa0 {
    public final /* synthetic */ int i = 0;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vj l;
    public final /* synthetic */ g70 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(vj vjVar, g70 g70Var, Object obj, ks ksVar) {
        super(2, ksVar);
        this.l = vjVar;
        this.m = g70Var;
        this.k = obj;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((sj) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        g70 g70Var = this.m;
        vj vjVar = this.l;
        switch (i) {
            case 0:
                return new sj(vjVar, g70Var, this.k, ksVar);
            default:
                sj sjVar = new sj(vjVar, g70Var, ksVar);
                sjVar.k = obj;
                return sjVar;
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    xa0 xa0Var = this.l.i;
                    Object obj2 = this.k;
                    this.j = 1;
                    if (xa0Var.f(this.m, obj2, this) == wtVar) {
                    }
                } else if (i2 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
            default:
                vt vtVar = (vt) this.k;
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    zc1 zc1Var = new zc1();
                    vj vjVar = this.l;
                    f70 f70Var = vjVar.h;
                    uj ujVar = new uj(zc1Var, vtVar, vjVar, this.m, 0);
                    this.k = null;
                    this.j = 1;
                    if (f70Var.c(ujVar, this) == wtVar) {
                    }
                } else if (i3 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
        }
        return wtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(vj vjVar, g70 g70Var, ks ksVar) {
        super(2, ksVar);
        this.l = vjVar;
        this.m = g70Var;
    }
}
