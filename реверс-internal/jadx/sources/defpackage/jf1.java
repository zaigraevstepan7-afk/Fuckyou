package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class jf1 {
    public static final bq a = new bq(new e2(28));
    public static final bq b = new bq(new mt(25));
    public static final vf1 c;
    public static final vf1 d;

    static {
        long j = vl.g;
        c = new vf1(true, Float.NaN, j, null, true);
        d = new vf1(false, Float.NaN, j, null, true);
    }

    public static vf1 a(float f, ym1 ym1Var, int i) {
        boolean z = (i & 1) != 0;
        float f2 = (i & 2) != 0 ? Float.NaN : f;
        long j = vl.g;
        if ((i & 8) != 0) {
            ym1Var = null;
        }
        ym1 ym1Var2 = ym1Var;
        return (tz.b(f2, Float.NaN) && vl.c(j, j) && ym1Var2 == null) ? z ? c : d : new vf1(z, f2, j, ym1Var2, true);
    }
}
