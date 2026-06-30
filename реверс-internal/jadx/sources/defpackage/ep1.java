package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ep1 extends zu1 implements xa0 {
    public int i;
    public /* synthetic */ Object j;
    public /* synthetic */ long k;
    public final /* synthetic */ jx0 l;
    public final /* synthetic */ hp1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep1(jx0 jx0Var, hp1 hp1Var, ks ksVar) {
        super(3, ksVar);
        this.l = jx0Var;
        this.m = hp1Var;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        long j = ((w01) obj2).a;
        ep1 ep1Var = new ep1(this.l, this.m, (ks) obj3);
        ep1Var.j = (ma1) obj;
        ep1Var.k = j;
        return ep1Var.q(t32.a);
    }

    @Override // defpackage.ye
    public final Object q(Object obj) throws Throwable {
        Throwable th;
        int i = this.i;
        oa1 oa1Var = null;
        jx0 jx0Var = this.l;
        wt wtVar = wt.e;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (i == 0) {
            xc.G(obj);
            ma1 ma1Var = (ma1) this.j;
            long j = this.k;
            oa1 oa1Var2 = new oa1(j);
            try {
                jx0Var.b(oa1Var2);
                hp1 hp1Var = this.m;
                hp1Var.q.h((hp1Var.m == k31.e ? Float.intBitsToFloat((int) (j & 4294967295L)) : hp1Var.i ? hp1Var.g.g() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32))) - hp1Var.p.g());
                this.j = oa1Var2;
                this.i = 1;
                obj = ma1Var.f(this);
                if (obj != wtVar) {
                    oa1Var = oa1Var2;
                }
            } catch (Throwable th3) {
                th = th3;
                oa1Var = oa1Var2;
                if (oa1Var == null) {
                    throw th;
                }
                na1 na1Var = new na1(oa1Var);
                this.j = th;
                this.i = 3;
                if (jx0Var.a(na1Var, this) != wtVar) {
                    th = th;
                    throw th;
                }
            }
            return wtVar;
        }
        if (i != 1) {
            if (i == 2) {
                xc.G(obj);
                return t32.a;
            }
            if (i != 3) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            th = (Throwable) this.j;
            xc.G(obj);
            throw th;
        }
        oa1Var = (oa1) this.j;
        xc.G(obj);
        jx0Var.b(((Boolean) obj).booleanValue() ? new pa1(oa1Var) : new na1(oa1Var));
        return t32.a;
    }
}
