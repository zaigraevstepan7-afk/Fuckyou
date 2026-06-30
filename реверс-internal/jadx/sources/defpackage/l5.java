package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l5 extends sk0 implements wa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ wa0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(ip ipVar, v92 v92Var, wa0 wa0Var) {
        super(2);
        this.f = 2;
        this.g = ipVar;
        this.h = v92Var;
        this.i = wa0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.f;
        t32 t32Var = t32.a;
        wa0 wa0Var = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                nu0.e((ha0) obj4, (dy) obj3, (jo) wa0Var, (ob0) obj, al.V(385));
                break;
            case 1:
                ((Number) obj2).intValue();
                aq.a((w31) obj4, (l91) obj3, wa0Var, (ob0) obj, al.V(1));
                break;
            default:
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    ((ip) obj4).a(((v92) obj3).e, wa0Var, ob0Var, 0);
                }
                break;
        }
        return t32Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(Object obj, Object obj2, wa0 wa0Var, int i, int i2) {
        super(2);
        this.f = i2;
        this.g = obj;
        this.h = obj2;
        this.i = wa0Var;
    }
}
