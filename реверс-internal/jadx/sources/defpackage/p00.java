package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class p00 extends ne1 implements wa0 {
    public final /* synthetic */ int g = 0;
    public int h;
    public /* synthetic */ Object i;
    public Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ eb0 l;
    public final /* synthetic */ eb0 m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p00(e2 e2Var, wi wiVar, ud udVar, os0 os0Var, n nVar, ks ksVar) {
        super(ksVar);
        this.j = e2Var;
        this.k = wiVar;
        this.l = udVar;
        this.m = os0Var;
        this.n = nVar;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.g;
        t32 t32Var = t32.a;
        ev1 ev1Var = (ev1) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((p00) o(ksVar, ev1Var)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.g;
        Object obj2 = this.n;
        eb0 eb0Var = this.m;
        eb0 eb0Var2 = this.l;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                p00 p00Var = new p00((e2) this.j, (wi) obj3, (ud) eb0Var2, (os0) eb0Var, (n) obj2, ksVar);
                p00Var.i = obj;
                return p00Var;
            default:
                p00 p00Var2 = new p00((vt) obj3, (gy1) eb0Var2, (p8) eb0Var, (ma1) obj2, ksVar);
                p00Var2.i = obj;
                return p00Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        if (r3 == r9) goto L20;
     */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        ev1 ev1Var;
        Object objA;
        ev1 ev1Var2;
        oj0 oj0VarA;
        Object objB;
        ks ksVar;
        Object objI;
        int i = this.g;
        t32 t32Var = t32.a;
        eb0 eb0Var = this.m;
        eb0 eb0Var2 = this.l;
        wt wtVar = wt.e;
        Object obj2 = this.n;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                int i2 = this.h;
                if (i2 == 0) {
                    xc.G(obj);
                    ev1Var = (ev1) this.i;
                    this.i = ev1Var;
                    this.h = 1;
                    objA = xv1.a(ev1Var, false, f81.e, this);
                    if (objA != wtVar) {
                    }
                    return wtVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        xc.G(obj);
                        return t32Var;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ev1Var = (ev1) this.i;
                xc.G(obj);
                objA = obj;
                this.i = null;
                this.h = 2;
                if (s00.g(ev1Var, (l81) objA, (e2) this.j, (wi) obj3, (ud) eb0Var2, (os0) eb0Var, (n) obj2, this) != wtVar) {
                    return t32Var;
                }
                return wtVar;
            default:
                vt vtVar = (vt) obj3;
                ma1 ma1Var = (ma1) obj2;
                int i3 = this.h;
                ks ksVar2 = null;
                if (i3 == 0) {
                    xc.G(obj);
                    ev1Var2 = (ev1) this.i;
                    oj0VarA = nu0.A(vtVar, null, yt.h, new rv1(ma1Var, null, 0), 1);
                    this.i = ev1Var2;
                    this.j = oj0VarA;
                    this.h = 1;
                    objB = xv1.b(ev1Var2, this, 3);
                    if (objB != wtVar) {
                    }
                    return wtVar;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oj0VarA = (oj0) this.i;
                    xc.G(obj);
                    objI = obj;
                    ksVar = null;
                    l81 l81Var = (l81) objI;
                    if (l81Var == null) {
                        xv1.f(vtVar, oj0VarA, new qv1(ma1Var, ksVar, 0));
                        return t32Var;
                    }
                    l81Var.a();
                    xv1.f(vtVar, oj0VarA, new qv1(ma1Var, ksVar, 1));
                    ((p8) eb0Var).i(new w01(l81Var.c));
                    return t32Var;
                }
                oj0VarA = (jr1) this.j;
                ev1Var2 = (ev1) this.i;
                xc.G(obj);
                objB = obj;
                l81 l81Var2 = (l81) objB;
                l81Var2.a();
                gy1 gy1Var = (gy1) eb0Var2;
                if (gy1Var != xv1.a) {
                    ksVar = null;
                    xv1.f(vtVar, oj0VarA, new g(gy1Var, ma1Var, l81Var2, ksVar2, 18));
                } else {
                    ksVar = null;
                }
                this.i = oj0VarA;
                this.j = ksVar;
                this.h = 2;
                objI = xv1.i(ev1Var2, f81.f, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p00(vt vtVar, gy1 gy1Var, p8 p8Var, ma1 ma1Var, ks ksVar) {
        super(ksVar);
        this.k = vtVar;
        this.l = gy1Var;
        this.m = p8Var;
        this.n = ma1Var;
    }
}
