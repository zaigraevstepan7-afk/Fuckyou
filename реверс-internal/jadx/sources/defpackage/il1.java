package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class il1 implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ns1 f;

    public /* synthetic */ il1(ns1 ns1Var, int i) {
        this.e = i;
        this.f = ns1Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i = this.e;
        ns1 ns1Var = this.f;
        switch (i) {
            case 0:
                return new w01(((w01) ns1Var.getValue()).a);
            case 1:
                za zaVar = kl1.a;
                return new w01(((w01) ns1Var.getValue()).a);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return Float.valueOf(ns1Var != null ? ((Number) ns1Var.getValue()).floatValue() : 1.0f);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return Float.valueOf(ns1Var != null ? ((Number) ns1Var.getValue()).floatValue() : 0.0f);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return Float.valueOf(ns1Var != null ? ((Number) ns1Var.getValue()).floatValue() : 0.0f);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return Boolean.valueOf((ns1Var != null ? ((Number) ns1Var.getValue()).floatValue() : 0.0f) > 0.0f);
            default:
                return Boolean.valueOf((ns1Var != null ? ((Number) ns1Var.getValue()).floatValue() : 0.0f) > 0.0f);
        }
    }
}
