package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fy1 extends zu1 implements wa0 {
    public fy0 i;
    public int j;
    public final /* synthetic */ fy0 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ jx0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy1(fy0 fy0Var, boolean z, jx0 jx0Var, ks ksVar) {
        super(2, ksVar);
        this.k = fy0Var;
        this.l = z;
        this.m = jx0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((fy1) o((ks) obj2, (vt) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        return new fy1(this.k, this.l, this.m, ksVar);
    }

    @Override // defpackage.ye
    public final Object q(Object obj) throws Throwable {
        fy0 fy0Var;
        fy0 fy0Var2;
        int i = this.j;
        if (i == 0) {
            xc.G(obj);
            fy0Var = this.k;
            oa1 oa1Var = (oa1) fy0Var.getValue();
            if (oa1Var != null) {
                yh0 pa1Var = this.l ? new pa1(oa1Var) : new na1(oa1Var);
                jx0 jx0Var = this.m;
                if (jx0Var != null) {
                    this.i = fy0Var;
                    this.j = 1;
                    Object objA = jx0Var.a(pa1Var, this);
                    wt wtVar = wt.e;
                    if (objA == wtVar) {
                        return wtVar;
                    }
                    fy0Var2 = fy0Var;
                }
                fy0Var.setValue(null);
            }
            return t32.a;
        }
        if (i != 1) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fy0Var2 = this.i;
        xc.G(obj);
        fy0Var = fy0Var2;
        fy0Var.setValue(null);
        return t32.a;
    }
}
