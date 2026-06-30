package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bx implements zl {
    public final /* synthetic */ int e;
    public final /* synthetic */ cx f;

    public /* synthetic */ bx(cx cxVar, int i) {
        this.e = i;
        this.f = cxVar;
    }

    @Override // defpackage.zl
    public final long d() {
        int i = this.e;
        cx cxVar = this.f;
        switch (i) {
            case 0:
                long jD = cxVar.x.d();
                if (jD != 16) {
                    return jD;
                }
                ff1 ff1Var = (ff1) hk.o(cxVar, jf1.b);
                if (ff1Var != null) {
                    long j = ff1Var.a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((vl) hk.o(cxVar, rr.a)).a;
            case 1:
                return ((ju0) hk.o(cxVar, mu0.b)).a.g;
            default:
                return ((ju0) hk.o(cxVar, mu0.b)).a.f;
        }
    }
}
