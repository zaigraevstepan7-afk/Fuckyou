package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fo implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ fo(bm bmVar, iw0 iw0Var, f32 f32Var, jo joVar, int i) {
        this.e = 3;
        this.h = bmVar;
        this.i = iw0Var;
        this.j = f32Var;
        this.g = joVar;
        this.f = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        Object obj3 = this.i;
        Object obj4 = this.j;
        t32 t32Var = t32.a;
        int i2 = this.f;
        Object obj5 = this.g;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iV = al.V(i2) | 1;
                ((jo) obj5).d((gf) obj6, this.i, this.j, (ob0) obj, iV);
                break;
            case 1:
                ((Integer) obj2).getClass();
                wi0.h((String) obj5, (sa0) obj6, (tv0) obj3, (String) obj4, (ob0) obj, al.V(i2 | 1));
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                int iV2 = al.V(i2 | 1);
                el.c((Boolean) obj5, this.i, (xo0) obj6, (sa0) obj4, (ob0) obj, iV2);
                break;
            default:
                ((Integer) obj2).getClass();
                mu0.a((bm) obj6, (iw0) obj3, (f32) obj4, (jo) obj5, (ob0) obj, al.V(i2 | 1));
                break;
        }
        return t32Var;
    }

    public /* synthetic */ fo(Boolean bool, Object obj, xo0 xo0Var, sa0 sa0Var, int i) {
        this.e = 2;
        this.g = bool;
        this.i = obj;
        this.h = xo0Var;
        this.j = sa0Var;
        this.f = i;
    }

    public /* synthetic */ fo(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.f = i;
    }
}
