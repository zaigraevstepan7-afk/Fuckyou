package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ux0 extends ne1 implements wa0 {
    public yb0 g;
    public vx0 h;
    public long[] i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ vx0 m;
    public final /* synthetic */ yb0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux0(vx0 vx0Var, yb0 yb0Var, ks ksVar) {
        super(ksVar);
        this.m = vx0Var;
        this.n = yb0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((ux0) o((ks) obj2, (lm1) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        ux0 ux0Var = new ux0(this.m, this.n, ksVar);
        ux0Var.l = obj;
        return ux0Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        lm1 lm1Var;
        vx0 vx0Var;
        long[] jArr;
        int i;
        yb0 yb0Var;
        int i2 = this.k;
        if (i2 == 0) {
            xc.G(obj);
            lm1Var = (lm1) this.l;
            vx0Var = this.m;
            tx0 tx0Var = vx0Var.f;
            jArr = tx0Var.c;
            i = tx0Var.e;
            yb0Var = this.n;
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.j;
            jArr = this.i;
            vx0Var = this.h;
            yb0Var = this.g;
            lm1Var = (lm1) this.l;
            xc.G(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return t32.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        yb0Var.f = i;
        Object obj2 = vx0Var.f.b[i];
        this.l = lm1Var;
        this.g = yb0Var;
        this.h = vx0Var;
        this.i = jArr;
        this.j = i3;
        this.k = 1;
        lm1Var.b(obj2, this);
        return wt.e;
    }
}
