package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sj1 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ uj1 k;
    public /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sj1(uj1 uj1Var, long j, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = uj1Var;
        this.l = j;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return ((sj1) o((ks) obj2, (vt) obj)).q(t32Var);
            case 1:
                return ((sj1) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ((sj1) o((ks) obj2, (vt) obj)).q(t32Var);
            default:
                long j = ((w01) obj).a;
                sj1 sj1Var = new sj1(this.k, (ks) obj2);
                sj1Var.l = j;
                return sj1Var.q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        switch (this.i) {
            case 0:
                return new sj1(this.k, this.l, ksVar, 0);
            case 1:
                return new sj1(this.k, this.l, ksVar, 1);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return new sj1(this.k, this.l, ksVar, 2);
            default:
                sj1 sj1Var = new sj1(this.k, ksVar);
                sj1Var.l = ((w01) obj).a;
                return sj1Var;
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        uj1 uj1Var = this.k;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    bk1 bk1Var = uj1Var.R;
                    cg1 cg1Var = new cg1(this.l, null);
                    this.j = 1;
                    if (bk1Var.g(ly0.f, cg1Var, this) == wtVar) {
                    }
                } else if (i2 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
            case 1:
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    bk1 bk1Var2 = uj1Var.R;
                    long j = this.l;
                    this.j = 1;
                    if (bk1Var2.c(j, false, this) == wtVar) {
                    }
                } else if (i3 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.j;
                if (i4 == 0) {
                    xc.G(obj);
                    bk1 bk1Var3 = uj1Var.R;
                    long j2 = this.l;
                    this.j = 1;
                    if (bk1Var3.c(j2, true, this) == wtVar) {
                    }
                } else if (i4 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
            default:
                int i5 = this.j;
                if (i5 == 0) {
                    xc.G(obj);
                    long j3 = this.l;
                    bk1 bk1Var4 = uj1Var.R;
                    this.j = 1;
                    Object objA = oj1.a(bk1Var4, j3, this);
                    if (objA == wtVar) {
                    }
                } else if (i5 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
        }
        return wtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj1(uj1 uj1Var, ks ksVar) {
        super(2, ksVar);
        this.i = 3;
        this.k = uj1Var;
    }
}
