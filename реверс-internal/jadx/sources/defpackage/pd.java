package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pd implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ z61 f;

    public /* synthetic */ pd(z61 z61Var, int i) {
        this.e = i;
        this.f = z61Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        z61 z61Var = this.f;
        y61 y61Var = (y61) obj;
        switch (i) {
            case 0:
                y61.j(y61Var, z61Var, 0, 0);
                break;
            case 1:
                y61.j(y61Var, z61Var, 0, 0);
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                y61.j(y61Var, z61Var, 0, 0);
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                if (y61Var.e() == al0.e || y61Var.f() == 0) {
                    y61.a(y61Var, z61Var);
                    z61Var.k0(oh0.c(0L, z61Var.i), 0.0f, null);
                } else {
                    long jF = ((long) (y61Var.f() - z61Var.e)) << 32;
                    y61.a(y61Var, z61Var);
                    z61Var.k0(oh0.c(jF, z61Var.i), 0.0f, null);
                }
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                y61Var.g(z61Var, 0, 0, 0.0f);
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                y61.j(y61Var, z61Var, 0, 0);
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                y61Var.g(z61Var, 0, 0, 0.0f);
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                y61Var.g(z61Var, 0, 0, 0.0f);
                break;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                y61.j(y61Var, z61Var, 0, 0);
                break;
            case el.a /* 9 */:
                y61Var.g(z61Var, 0, 0, 0.0f);
                break;
            default:
                y61.j(y61Var, z61Var, 0, 0);
                break;
        }
        return t32Var;
    }
}
