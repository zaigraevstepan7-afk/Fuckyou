package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gy1 extends zu1 implements xa0 {
    public int i;
    public /* synthetic */ ma1 j;
    public /* synthetic */ long k;
    public final /* synthetic */ vt l;
    public final /* synthetic */ fy0 m;
    public final /* synthetic */ jx0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy1(vt vtVar, fy0 fy0Var, jx0 jx0Var, ks ksVar) {
        super(3, ksVar);
        this.l = vtVar;
        this.m = fy0Var;
        this.n = jx0Var;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        long j = ((w01) obj2).a;
        fy0 fy0Var = this.m;
        jx0 jx0Var = this.n;
        gy1 gy1Var = new gy1(this.l, fy0Var, jx0Var, (ks) obj3);
        gy1Var.j = (ma1) obj;
        gy1Var.k = j;
        return gy1Var.q(t32.a);
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        vt vtVar = this.l;
        if (i == 0) {
            xc.G(obj);
            ma1 ma1Var = this.j;
            nu0.A(vtVar, null, null, new h(this.m, this.k, this.n, (ks) null, 4), 3);
            this.i = 1;
            obj = ma1Var.f(this);
            wt wtVar = wt.e;
            if (obj == wtVar) {
                return wtVar;
            }
        } else {
            if (i != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(obj);
        }
        nu0.A(vtVar, null, null, new fy1(this.m, ((Boolean) obj).booleanValue(), this.n, null), 3);
        return t32.a;
    }
}
