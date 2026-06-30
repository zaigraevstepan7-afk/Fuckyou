package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hs implements wa0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ tv0 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ hs(int i, jo joVar, ha0 ha0Var, me0 me0Var, tv0 tv0Var, ym1 ym1Var, boolean z) {
        this.f = tv0Var;
        this.g = ha0Var;
        this.h = z;
        this.j = ym1Var;
        this.k = me0Var;
        this.l = joVar;
        this.i = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        int i2 = this.i;
        Object obj3 = this.g;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iV = al.V(i2 | 1);
                is.c((String) obj6, this.h, (cs) obj5, this.f, (xa0) obj4, (ha0) obj3, (ob0) obj, iV);
                break;
            case 1:
                jo joVar = (jo) obj4;
                ob0 ob0Var = (ob0) obj;
                ((Integer) obj2).getClass();
                int iV2 = al.V(i2 | 1);
                wi0.g(iV2, joVar, (ha0) obj3, ob0Var, (me0) obj5, this.f, (ym1) obj6, this.h);
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                int iV3 = al.V(i2 | 1);
                wi0.n((ha0) obj3, this.f, this.h, (re0) obj6, (me0) obj5, (jo) obj4, (ob0) obj, iV3);
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                int iV4 = al.V(i2 | 1);
                fp1.d(this.f, (hp1) obj6, this.h, (jx0) obj5, (jo) obj4, (jo) obj3, (ob0) obj, iV4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iV5 = al.V(i2 | 1);
                iv1.b(this.f, this.h, (gv1) obj6, (wa0) obj5, (jx0) obj4, (ym1) obj3, (ob0) obj, iV5);
                break;
        }
        return t32Var;
    }

    public /* synthetic */ hs(ha0 ha0Var, tv0 tv0Var, boolean z, re0 re0Var, me0 me0Var, jo joVar, int i) {
        this.g = ha0Var;
        this.f = tv0Var;
        this.h = z;
        this.j = re0Var;
        this.k = me0Var;
        this.l = joVar;
        this.i = i;
    }

    public /* synthetic */ hs(tv0 tv0Var, hp1 hp1Var, boolean z, jx0 jx0Var, jo joVar, jo joVar2, int i) {
        this.f = tv0Var;
        this.j = hp1Var;
        this.h = z;
        this.k = jx0Var;
        this.l = joVar;
        this.g = joVar2;
        this.i = i;
    }

    public /* synthetic */ hs(tv0 tv0Var, boolean z, gv1 gv1Var, wa0 wa0Var, jx0 jx0Var, ym1 ym1Var, int i) {
        this.f = tv0Var;
        this.h = z;
        this.j = gv1Var;
        this.k = wa0Var;
        this.l = jx0Var;
        this.g = ym1Var;
        this.i = i;
    }

    public /* synthetic */ hs(String str, boolean z, cs csVar, tv0 tv0Var, xa0 xa0Var, ha0 ha0Var, int i) {
        this.j = str;
        this.h = z;
        this.k = csVar;
        this.f = tv0Var;
        this.l = xa0Var;
        this.g = ha0Var;
        this.i = i;
    }
}
