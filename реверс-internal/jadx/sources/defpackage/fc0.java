package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fc0 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ sa0 f;

    public /* synthetic */ fc0(sa0 sa0Var, int i) {
        this.e = i;
        this.f = sa0Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        long j;
        switch (this.e) {
            case 0:
                yp1 yp1Var = (yp1) obj;
                synchronized (aq1.c) {
                    j = aq1.e;
                    aq1.e = 1 + j;
                }
                return new ac1(j, yp1Var, this.f);
            default:
                return this.f.i(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
