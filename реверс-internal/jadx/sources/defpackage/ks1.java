package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ks1 extends zu1 implements xa0 {
    public int i;
    public /* synthetic */ g70 j;
    public /* synthetic */ int k;
    public final /* synthetic */ ls1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks1(ls1 ls1Var, ks ksVar) {
        super(3, ksVar);
        this.l = ls1Var;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        ks1 ks1Var = new ks1(this.l, (ks) obj3);
        ks1Var.j = (g70) obj;
        ks1Var.k = iIntValue;
        return ks1Var.q(t32.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r0.l(defpackage.wn1.e, r10) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r0.l(defpackage.wn1.g, r10) != r9) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        g70 g70Var = this.j;
        int i = this.k;
        int i2 = this.i;
        wt wtVar = wt.e;
        if (i2 == 0) {
            xc.G(obj);
            if (i > 0) {
                this.j = null;
                this.k = i;
                this.i = 1;
            } else {
                this.j = g70Var;
                this.k = i;
                this.i = 2;
                if (al.s(0L, this) != wtVar) {
                    this.j = g70Var;
                    this.k = i;
                    this.i = 3;
                    if (g70Var.l(wn1.f, this) != wtVar) {
                    }
                }
            }
            return wtVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                xc.G(obj);
                this.j = g70Var;
                this.k = i;
                this.i = 3;
                if (g70Var.l(wn1.f, this) != wtVar) {
                    this.j = g70Var;
                    this.k = i;
                    this.i = 4;
                    if (al.s(Long.MAX_VALUE, this) != wtVar) {
                    }
                }
                return wtVar;
            }
            if (i2 == 3) {
                xc.G(obj);
                this.j = g70Var;
                this.k = i;
                this.i = 4;
                if (al.s(Long.MAX_VALUE, this) != wtVar) {
                    this.j = null;
                    this.k = i;
                    this.i = 5;
                }
                return wtVar;
            }
            if (i2 == 4) {
                xc.G(obj);
                this.j = null;
                this.k = i;
                this.i = 5;
            } else if (i2 != 5) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        xc.G(obj);
        return t32.a;
    }
}
