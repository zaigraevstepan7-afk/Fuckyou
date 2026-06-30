package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h10 extends zu1 implements wa0 {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ i10 k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h10(i10 i10Var, long j, ks ksVar) {
        super(2, ksVar);
        this.k = i10Var;
        this.l = j;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((h10) o((ks) obj2, (vt) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        h10 h10Var = new h10(this.k, this.l, ksVar);
        h10Var.j = obj;
        return h10Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        if (i == 0) {
            xc.G(obj);
            vt vtVar = (vt) this.j;
            xa0 xa0Var = this.k.P;
            w01 w01Var = new w01(this.l);
            this.i = 1;
            Object objF = xa0Var.f(vtVar, w01Var, this);
            wt wtVar = wt.e;
            if (objF == wtVar) {
                return wtVar;
            }
        } else {
            if (i != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(obj);
        }
        return t32.a;
    }
}
