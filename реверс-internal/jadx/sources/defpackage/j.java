package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ jx0 k;
    public final /* synthetic */ oa1 l;
    public final /* synthetic */ m m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(jx0 jx0Var, oa1 oa1Var, m mVar, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = jx0Var;
        this.l = oa1Var;
        this.m = mVar;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((j) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        switch (this.i) {
            case 0:
                return new j(this.k, this.l, this.m, ksVar, 0);
            default:
                return new j(this.k, this.l, this.m, ksVar, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L31;
     */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        m mVar = this.m;
        jx0 jx0Var = this.k;
        wt wtVar = wt.e;
        oa1 oa1Var = this.l;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    long j = vk.a;
                    this.j = 1;
                    if (al.s(j, this) != wtVar) {
                    }
                } else if (i2 == 1) {
                    xc.G(obj);
                } else if (i2 != 2) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                    mVar.K = oa1Var;
                }
                this.j = 2;
                break;
            default:
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    long j2 = vk.a;
                    this.j = 1;
                    if (al.s(j2, this) != wtVar) {
                    }
                } else if (i3 == 1) {
                    xc.G(obj);
                } else if (i3 != 2) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                    mVar.G = oa1Var;
                }
                this.j = 2;
                break;
        }
        return t32Var;
    }
}
