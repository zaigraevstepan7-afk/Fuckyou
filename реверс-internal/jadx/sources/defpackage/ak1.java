package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ak1 extends zu1 implements wa0 {
    public long i;
    public int j;
    public /* synthetic */ long k;
    public final /* synthetic */ bk1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak1(bk1 bk1Var, ks ksVar) {
        super(2, ksVar);
        this.l = bk1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        long j = ((o52) obj).a;
        ak1 ak1Var = new ak1(this.l, (ks) obj2);
        ak1Var.k = j;
        return ak1Var.q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        ak1 ak1Var = new ak1(this.l, ksVar);
        ak1Var.k = ((o52) obj).a;
        return ak1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.j;
        bk1 bk1Var = this.l;
        wt wtVar = wt.e;
        if (i == 0) {
            xc.G(obj);
            j = this.k;
            vu vuVar = bk1Var.f;
            this.k = j;
            this.j = 1;
            obj = vuVar.d(j, this);
            if (obj != wtVar) {
            }
            return wtVar;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j4 = this.i;
                j3 = this.k;
                xc.G(obj);
                return new o52(o52.d(j3, o52.d(j4, ((o52) obj).a)));
            }
            j2 = this.i;
            j = this.k;
            xc.G(obj);
            long j5 = ((o52) obj).a;
            vu vuVar2 = bk1Var.f;
            long jD = o52.d(j2, j5);
            this.k = j;
            this.i = j5;
            this.j = 3;
            obj = vuVar2.c(jD, j5, this);
            if (obj != wtVar) {
                j3 = j;
                j4 = j5;
                return new o52(o52.d(j3, o52.d(j4, ((o52) obj).a)));
            }
            return wtVar;
        }
        j = this.k;
        xc.G(obj);
        long jD2 = o52.d(j, ((o52) obj).a);
        this.k = j;
        this.i = jD2;
        this.j = 2;
        obj = bk1Var.a(jD2, this);
        if (obj != wtVar) {
            j2 = jD2;
            long j52 = ((o52) obj).a;
            vu vuVar22 = bk1Var.f;
            long jD3 = o52.d(j2, j52);
            this.k = j;
            this.i = j52;
            this.j = 3;
            obj = vuVar22.c(jD3, j52, this);
            if (obj != wtVar) {
            }
        }
        return wtVar;
    }
}
