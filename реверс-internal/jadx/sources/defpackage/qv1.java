package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qv1 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ma1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qv1(ma1 ma1Var, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.j = ma1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
            case 0:
                ((qv1) o(ksVar, vtVar)).q(t32Var);
                break;
            case 1:
                ((qv1) o(ksVar, vtVar)).q(t32Var);
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((qv1) o(ksVar, vtVar)).q(t32Var);
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((qv1) o(ksVar, vtVar)).q(t32Var);
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ((qv1) o(ksVar, vtVar)).q(t32Var);
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ((qv1) o(ksVar, vtVar)).q(t32Var);
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                ((qv1) o(ksVar, vtVar)).q(t32Var);
                break;
            default:
                ((qv1) o(ksVar, vtVar)).q(t32Var);
                break;
        }
        return t32Var;
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        ma1 ma1Var = this.j;
        switch (i) {
            case 0:
                return new qv1(ma1Var, ksVar, 0);
            case 1:
                return new qv1(ma1Var, ksVar, 1);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return new qv1(ma1Var, ksVar, 2);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return new qv1(ma1Var, ksVar, 3);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return new qv1(ma1Var, ksVar, 4);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return new qv1(ma1Var, ksVar, 5);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return new qv1(ma1Var, ksVar, 6);
            default:
                return new qv1(ma1Var, ksVar, 7);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        ma1 ma1Var = this.j;
        switch (i) {
            case 0:
                xc.G(obj);
                ma1Var.a();
                break;
            case 1:
                xc.G(obj);
                ma1Var.c();
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                xc.G(obj);
                ma1Var.c();
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                xc.G(obj);
                ma1Var.a();
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                xc.G(obj);
                ma1Var.c();
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                xc.G(obj);
                ma1Var.c();
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                xc.G(obj);
                ma1Var.a();
                break;
            default:
                xc.G(obj);
                ma1Var.c();
                break;
        }
        return t32Var;
    }
}
