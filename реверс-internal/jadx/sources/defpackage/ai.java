package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ai extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ jx0 k;
    public final /* synthetic */ mq1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai(jx0 jx0Var, mq1 mq1Var, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = jx0Var;
        this.l = mq1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((ai) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        switch (this.i) {
            case 0:
                return new ai(this.k, this.l, ksVar, 0);
            default:
                return new ai(this.k, this.l, ksVar, 1);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) throws Throwable {
        int i = this.i;
        mq1 mq1Var = this.l;
        jx0 jx0Var = this.k;
        t32 t32Var = t32.a;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    tn1 tn1Var = jx0Var.a;
                    zh zhVar = new zh(mq1Var, 0);
                    this.j = 1;
                    tn1Var.getClass();
                    tn1.k(tn1Var, zhVar, this);
                } else if (i2 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
            default:
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    tn1 tn1Var2 = jx0Var.a;
                    zh zhVar2 = new zh(mq1Var, 1);
                    this.j = 1;
                    tn1Var2.getClass();
                    tn1.k(tn1Var2, zhVar2, this);
                } else if (i3 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
        }
        return wtVar;
    }
}
