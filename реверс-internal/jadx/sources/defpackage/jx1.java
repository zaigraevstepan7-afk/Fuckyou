package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class jx1 {
    public static final String a = jt1.I();

    public static long a(d02 d02Var, hx hxVar, c90 c90Var) {
        r6 r6VarB = b(d02Var, hxVar, c90Var, 1);
        return (((long) qc1.f(r6VarB.a.a())) << 32) | (((long) qc1.f(r6VarB.b())) & 4294967295L);
    }

    public static final r6 b(d02 d02Var, hx hxVar, c90 c90Var, int i) {
        String strH0 = pl.h0(lk.o0(0, i), "\n", null, null, new fi1(14), 30);
        f40 f40Var = f40.e;
        return new r6(new v6(strH0, d02Var, f40Var, f40Var, c90Var, hxVar), i, 1, lr.b(0, 0, 0, 0, 15));
    }
}
