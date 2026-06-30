package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uv1 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ xa0 k;
    public final /* synthetic */ ma1 l;
    public final /* synthetic */ l81 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv1(xa0 xa0Var, ma1 ma1Var, l81 l81Var, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = xa0Var;
        this.l = ma1Var;
        this.m = l81Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((uv1) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        switch (this.i) {
            case 0:
                return new uv1(this.k, this.l, this.m, ksVar, 0);
            default:
                return new uv1(this.k, this.l, this.m, ksVar, 1);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        l81 l81Var = this.m;
        ma1 ma1Var = this.l;
        xa0 xa0Var = this.k;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    w01 w01Var = new w01(l81Var.c);
                    this.j = 1;
                    if (xa0Var.f(ma1Var, w01Var, this) == wtVar) {
                    }
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
                    w01 w01Var2 = new w01(l81Var.c);
                    this.j = 1;
                    if (xa0Var.f(ma1Var, w01Var2, this) == wtVar) {
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
}
