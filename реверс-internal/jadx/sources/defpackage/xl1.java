package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xl1 extends sk0 implements wa0 {
    public static final xl1 g;
    public static final xl1 h;
    public static final xl1 i;
    public final /* synthetic */ int f;

    static {
        int i2 = 2;
        g = new xl1(i2, 0);
        h = new xl1(i2, 1);
        i = new xl1(i2, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xl1(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        String str;
        eb0 eb0Var;
        switch (this.f) {
            case 0:
                r0 r0Var = (r0) obj;
                r0 r0Var2 = (r0) obj2;
                if (r0Var == null || (str = r0Var.a) == null) {
                    str = r0Var2.a;
                }
                if (r0Var == null || (eb0Var = r0Var.b) == null) {
                    eb0Var = r0Var2.b;
                }
                return new r0(str, eb0Var);
            case 1:
                return obj == null ? obj2 : obj;
            default:
                rl1 rl1Var = (rl1) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                nl1 nl1Var = ((rl1) obj).d;
                zl1 zl1Var = vl1.u;
                Object objG = nl1Var.e.g(zl1Var);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = rl1Var.d.e.g(zl1Var);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
