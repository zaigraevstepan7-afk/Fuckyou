package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qj1 {
    public final bk1 a;
    public boolean b;

    public qj1(bk1 bk1Var, boolean z) {
        this.a = bk1Var;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, ls lsVar) throws Throwable {
        pj1 pj1Var;
        long jD;
        if (lsVar instanceof pj1) {
            pj1Var = (pj1) lsVar;
            int i = pj1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pj1Var.k = i - Integer.MIN_VALUE;
            } else {
                pj1Var = new pj1(this, lsVar);
            }
        }
        Object objA = pj1Var.i;
        int i2 = pj1Var.k;
        if (i2 == 0) {
            xc.G(objA);
            jD = 0;
            if (this.b) {
                bk1 bk1Var = this.a;
                if (!bk1Var.i) {
                    pj1Var.h = j2;
                    pj1Var.k = 1;
                    objA = bk1Var.a(j2, pj1Var);
                    wt wtVar = wt.e;
                    if (objA == wtVar) {
                        return wtVar;
                    }
                }
                jD = o52.d(j2, jD);
            }
            return new o52(jD);
        }
        if (i2 != 1) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = pj1Var.h;
        xc.G(objA);
        jD = ((o52) objA).a;
        jD = o52.d(j2, jD);
        return new o52(jD);
    }
}
