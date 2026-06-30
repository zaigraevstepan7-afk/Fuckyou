package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hv extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ boolean k;
    public final /* synthetic */ mv l;
    public final /* synthetic */ int m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hv(mv mvVar, int i, ks ksVar, int i2) {
        super(2, ksVar);
        this.i = i2;
        this.l = mvVar;
        this.m = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((hv) o(ksVar, bool)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        int i2 = this.m;
        mv mvVar = this.l;
        switch (i) {
            case 0:
                hv hvVar = new hv(mvVar, i2, ksVar, 0);
                hvVar.k = ((Boolean) obj).booleanValue();
                return hvVar;
            default:
                hv hvVar2 = new hv(mvVar, i2, ksVar, 1);
                hvVar2.k = ((Boolean) obj).booleanValue();
                return hvVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Throwable th;
        ms1 yb1Var;
        boolean z;
        boolean z2;
        Object obj2;
        int i = this.i;
        int iIntValue = this.m;
        wt wtVar = wt.e;
        mv mvVar = this.l;
        switch (i) {
            case 0:
                boolean z3 = this.j;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    if (z3 != 0) {
                        fo1 fo1VarI = mvVar.i();
                        this.n = th;
                        this.k = z3;
                        this.j = 2;
                        Integer numA = fo1VarI.a();
                        if (numA != wtVar) {
                            obj = numA;
                            th = th;
                            z3 = z3;
                        }
                        return wtVar;
                    }
                }
                if (z3 == 0) {
                    xc.G(obj);
                    boolean z4 = this.k;
                    this.k = z4;
                    this.j = 1;
                    obj = mv.f(mvVar, z4, this);
                    z3 = z4;
                    if (obj == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (z3 != 1) {
                        if (z3 != 2) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z5 = this.k;
                        th = (Throwable) this.n;
                        xc.G(obj);
                        z3 = z5;
                        iIntValue = ((Number) obj).intValue();
                        th = th;
                        yb1Var = new yb1(th, iIntValue);
                        z = z3;
                        return new j41(yb1Var, Boolean.valueOf(z));
                    }
                    boolean z6 = this.k;
                    xc.G(obj);
                    z3 = z6;
                }
                yb1Var = (ms1) obj;
                z = z3;
                return new j41(yb1Var, Boolean.valueOf(z));
            default:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    z2 = this.k;
                    this.k = z2;
                    this.j = 1;
                    obj = mvVar.j(this);
                    if (obj != wtVar) {
                    }
                    return wtVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.n;
                    xc.G(obj);
                    iIntValue = ((Number) obj).intValue();
                    obj = obj2;
                    return new lu(obj == null ? obj.hashCode() : 0, iIntValue, obj);
                }
                z2 = this.k;
                xc.G(obj);
                if (z2) {
                    fo1 fo1VarI2 = mvVar.i();
                    this.n = obj;
                    this.j = 2;
                    Integer numA2 = fo1VarI2.a();
                    if (numA2 != wtVar) {
                        Object obj3 = obj;
                        obj = numA2;
                        obj2 = obj3;
                        iIntValue = ((Number) obj).intValue();
                        obj = obj2;
                    }
                    return wtVar;
                }
                return new lu(obj == null ? obj.hashCode() : 0, iIntValue, obj);
        }
    }
}
