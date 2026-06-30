package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class s70 extends zu1 implements xa0 {
    public g70 i;
    public int j;
    public /* synthetic */ g70 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ wa0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s70(wa0 wa0Var, ks ksVar) {
        super(3, ksVar);
        this.m = wa0Var;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        s70 s70Var = new s70(this.m, (ks) obj3);
        s70Var.k = (g70) obj;
        s70Var.l = obj2;
        return s70Var.q(t32.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r0.l(r8, r7) == r6) goto L15;
     */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        g70 g70Var = this.k;
        Object obj2 = this.l;
        int i = this.j;
        wt wtVar = wt.e;
        if (i == 0) {
            xc.G(obj);
            this.k = null;
            this.l = null;
            this.i = g70Var;
            this.j = 1;
            obj = this.m.h(obj2, this);
            if (obj != wtVar) {
            }
            return wtVar;
        }
        if (i != 1) {
            if (i == 2) {
                xc.G(obj);
                return t32.a;
            }
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g70Var = this.i;
        xc.G(obj);
        this.k = null;
        this.l = null;
        this.i = null;
        this.j = 2;
    }
}
