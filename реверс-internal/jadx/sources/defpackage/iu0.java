package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class iu0 implements ym1 {
    public final w6 a;
    public w6 b;
    public long c;

    public iu0(pg1 pg1Var) {
        w6 w6VarA = y6.a();
        aq0 aq0Var = pg1Var.c;
        long j = pg1Var.b;
        pd1.n(w6VarA, aq0Var, hk.D(j), hk.E(j));
        this.a = w6VarA;
        this.c = 9205357640488583168L;
    }

    @Override // defpackage.ym1
    public final hk a(long j, al0 al0Var, hx hxVar) {
        w6 w6Var;
        if (!io1.a(j, this.c) || (w6Var = this.b) == null) {
            this.c = j;
            this.b = y6.a();
        } else {
            w6Var.h();
        }
        w6 w6Var2 = this.b;
        w6Var2.getClass();
        w6.a(w6Var2, this.a);
        float[] fArrA = ou0.a();
        ou0.g(fArrA, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), 4);
        w6Var2.i(fArrA);
        w6Var2.j(w01.d(ef1.j(j), w6Var2.d().b()));
        return new n31(w6Var2);
    }
}
