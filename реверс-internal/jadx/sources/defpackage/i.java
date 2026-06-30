package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ jx0 k;
    public final /* synthetic */ oa1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(oa1 oa1Var, jx0 jx0Var, ks ksVar) {
        super(2, ksVar);
        this.i = 0;
        this.l = oa1Var;
        this.k = jx0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((i) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        oa1 oa1Var = this.l;
        jx0 jx0Var = this.k;
        switch (i) {
            case 0:
                return new i(oa1Var, jx0Var, ksVar);
            case 1:
                return new i(jx0Var, oa1Var, ksVar, 1);
            default:
                return new i(jx0Var, oa1Var, ksVar, 2);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        oa1 oa1Var = this.l;
        jx0 jx0Var = this.k;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    pa1 pa1Var = new pa1(oa1Var);
                    this.j = 1;
                    if (jx0Var.a(pa1Var, this) == wtVar) {
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
                    this.j = 1;
                    if (jx0Var.a(oa1Var, this) == wtVar) {
                    }
                } else if (i3 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
            default:
                int i4 = this.j;
                if (i4 == 0) {
                    xc.G(obj);
                    this.j = 1;
                    if (jx0Var.a(oa1Var, this) == wtVar) {
                    }
                } else if (i4 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
        }
        return wtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(jx0 jx0Var, oa1 oa1Var, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = jx0Var;
        this.l = oa1Var;
    }
}
