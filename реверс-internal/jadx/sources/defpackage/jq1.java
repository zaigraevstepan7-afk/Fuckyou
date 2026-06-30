package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jq1 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wa0 l;
    public final /* synthetic */ fy0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jq1(wa0 wa0Var, fy0 fy0Var, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.l = wa0Var;
        this.m = fy0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((jq1) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        switch (this.i) {
            case 0:
                jq1 jq1Var = new jq1(this.l, this.m, ksVar, 0);
                jq1Var.k = obj;
                return jq1Var;
            default:
                jq1 jq1Var2 = new jq1(this.l, this.m, ksVar, 1);
                jq1Var2.k = obj;
                return jq1Var2;
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        fy0 fy0Var = this.m;
        wa0 wa0Var = this.l;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    xa1 xa1Var = new xa1(fy0Var, ((vt) this.k).f());
                    this.j = 1;
                    if (wa0Var.h(xa1Var, this) == wtVar) {
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
                    xa1 xa1Var2 = new xa1(fy0Var, ((vt) this.k).f());
                    this.j = 1;
                    if (wa0Var.h(xa1Var2, this) == wtVar) {
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
