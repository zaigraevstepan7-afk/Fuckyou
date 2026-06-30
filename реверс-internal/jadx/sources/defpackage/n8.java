package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n8 implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ fy0 f;

    public /* synthetic */ n8(fy0 fy0Var, int i) {
        this.e = i;
        this.f = fy0Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i = this.e;
        vi1 vi1Var = vi1.e;
        t32 t32Var = t32.a;
        fy0 fy0Var = this.f;
        switch (i) {
            case 0:
                zk0 zk0Var = (zk0) fy0Var.getValue();
                if (zk0Var != null) {
                    return zk0Var;
                }
                qg0.d("Required value was null.");
                yc.j();
                return null;
            case 1:
                fy0Var.setValue(vi1Var);
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                fy0Var.setValue(vi1.f);
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                fy0Var.setValue(vi1Var);
                return t32Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                zk0 zk0Var2 = (zk0) fy0Var.getValue();
                if (zk0Var2 != null) {
                    return zk0Var2;
                }
                qg0.d("Required value was null.");
                yc.j();
                return null;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                fy0Var.setValue(null);
                return t32Var;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                fy0Var.setValue(null);
                return t32Var;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                Boolean bool = (Boolean) fy0Var.getValue();
                bool.booleanValue();
                return bool;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return (kn0) ((ha0) fy0Var.getValue()).a();
            case el.a /* 9 */:
                return new jn0((sa0) fy0Var.getValue());
            default:
                zk0 zk0Var3 = (zk0) fy0Var.getValue();
                if (zk0Var3 != null) {
                    return zk0Var3;
                }
                qg0.d("Required value was null.");
                yc.j();
                return null;
        }
    }
}
