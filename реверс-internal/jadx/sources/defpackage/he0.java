package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class he0 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ ie0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he0(ie0 ie0Var, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = ie0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((he0) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        ie0 ie0Var = this.k;
        switch (i) {
            case 0:
                return new he0(ie0Var, ksVar, 0);
            default:
                return new he0(ie0Var, ksVar, 1);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        ie0 ie0Var = this.k;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    this.j = 1;
                    if (ie0.L0(ie0Var, this) == wtVar) {
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
                    this.j = 1;
                    if (ie0.M0(ie0Var, this) == wtVar) {
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
