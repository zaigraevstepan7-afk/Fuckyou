package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class go implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ go(d02 d02Var, jo joVar, int i) {
        this.e = 3;
        this.h = d02Var;
        this.g = joVar;
        this.f = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        int i2 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((jo) obj4).g(obj3, (ob0) obj, al.V(i2) | 1);
                break;
            case 1:
                ((Integer) obj2).intValue();
                lk.i((pb1) obj4, (wa0) obj3, (ob0) obj, al.V(i2 | 1));
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).intValue();
                lk.j((pb1[]) obj4, (wa0) obj3, (ob0) obj, al.V(i2 | 1));
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                mz1.a((d02) obj3, (jo) obj4, (ob0) obj, al.V(i2 | 1));
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).intValue();
                ((d22) obj4).a(obj3, (ob0) obj, al.V(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                uc1.e((v2) obj4, (ha0) obj3, (ob0) obj, al.V(i2 | 1));
                break;
        }
        return t32Var;
    }

    public /* synthetic */ go(int i, int i2, Object obj, Object obj2) {
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.f = i;
    }
}
