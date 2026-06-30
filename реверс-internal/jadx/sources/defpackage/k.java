package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ m k;
    public final /* synthetic */ oa1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, oa1 oa1Var, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = mVar;
        this.l = oa1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((k) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        oa1 oa1Var = this.l;
        m mVar = this.k;
        switch (i) {
            case 0:
                return new k(mVar, oa1Var, ksVar, 0);
            case 1:
                return new k(mVar, oa1Var, ksVar, 1);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return new k(mVar, oa1Var, ksVar, 2);
            default:
                return new k(mVar, oa1Var, ksVar, 3);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        oa1 oa1Var = this.l;
        m mVar = this.k;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    jx0 jx0Var = mVar.u;
                    if (jx0Var != null) {
                        na1 na1Var = new na1(oa1Var);
                        this.j = 1;
                        if (jx0Var.a(na1Var, this) == wtVar) {
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
                    jx0 jx0Var2 = mVar.u;
                    if (jx0Var2 != null) {
                        na1 na1Var2 = new na1(oa1Var);
                        this.j = 1;
                        if (jx0Var2.a(na1Var2, this) == wtVar) {
                        }
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
                    jx0 jx0Var3 = mVar.u;
                    if (jx0Var3 != null) {
                        this.j = 1;
                        if (jx0Var3.a(oa1Var, this) == wtVar) {
                        }
                    }
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
                    jx0 jx0Var4 = mVar.u;
                    if (jx0Var4 != null) {
                        pa1 pa1Var = new pa1(oa1Var);
                        this.j = 1;
                        if (jx0Var4.a(pa1Var, this) == wtVar) {
                        }
                    }
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
