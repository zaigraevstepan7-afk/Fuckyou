package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ik1 extends zu1 implements wa0 {
    public int i;
    public final /* synthetic */ h9 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ jk1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik1(h9 h9Var, int i, jk1 jk1Var, ks ksVar) {
        super(2, ksVar);
        this.j = h9Var;
        this.k = i;
        this.l = jk1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((ik1) o((ks) obj2, (vt) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        return new ik1(this.j, this.k, this.l, ksVar);
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        if (i == 0) {
            xc.G(obj);
            Integer num = new Integer(this.k);
            wa waVar = this.l.b;
            this.i = 1;
            Object objB = h9.b(this.j, num, waVar, null, null, this, 12);
            wt wtVar = wt.e;
            if (objB == wtVar) {
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
