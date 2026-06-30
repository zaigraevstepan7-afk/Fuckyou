package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p8 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ fy0 f;

    public /* synthetic */ p8(fy0 fy0Var, int i) {
        this.e = i;
        this.f = fy0Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        fy0 fy0Var = this.f;
        switch (i) {
            case 0:
                fy0Var.setValue((zk0) obj);
                return t32Var;
            case 1:
                fy0Var.setValue((zk0) obj);
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                fy0Var.setValue((zk0) obj);
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                String str = (String) obj;
                str.getClass();
                fy0Var.setValue(str);
                return t32Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((sa0) fy0Var.getValue()).i(f)).floatValue());
            default:
                ((sa0) fy0Var.getValue()).i((w01) obj);
                return t32Var;
        }
    }
}
