package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u3 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ z61 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u3(z61 z61Var, int i) {
        super(1);
        this.f = i;
        this.g = z61Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.f;
        z61 z61Var = this.g;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                ((y61) obj).g(z61Var, 0, 0, 0.0f);
                break;
            case 1:
                y61.j((y61) obj, z61Var, 0, 0);
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((y61) obj).g(z61Var, 0, 0, 0.0f);
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((y61) obj).g(z61Var, 0, 0, 0.0f);
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ((y61) obj).g(z61Var, 0, 0, 0.0f);
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                y61.j((y61) obj, z61Var, 0, 0);
                break;
            default:
                y61.k((y61) obj, this.g, 0, 0, null, 12);
                break;
        }
        return t32Var;
    }
}
