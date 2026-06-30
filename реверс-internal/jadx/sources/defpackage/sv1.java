package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sv1 extends ne1 implements wa0 {
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ vt i;
    public final /* synthetic */ ma1 j;
    public final /* synthetic */ xa0 k;
    public final /* synthetic */ sa0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv1(vt vtVar, ma1 ma1Var, xa0 xa0Var, sa0 sa0Var, ks ksVar) {
        super(ksVar);
        this.i = vtVar;
        this.j = ma1Var;
        this.k = xa0Var;
        this.l = sa0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((sv1) o((ks) obj2, (ev1) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        sv1 sv1Var = new sv1(this.i, this.j, this.k, this.l, ksVar);
        sv1Var.h = obj;
        return sv1Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) throws Throwable {
        int i = this.g;
        if (i == 0) {
            xc.G(obj);
            ev1 ev1Var = (ev1) this.h;
            this.g = 1;
            Object objG = xv1.g(ev1Var, this.i, this.j, this.k, this.l, this);
            wt wtVar = wt.e;
            if (objG == wtVar) {
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
