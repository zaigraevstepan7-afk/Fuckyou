package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r7 implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ r7(int i, jo joVar, Object obj, Object obj2) {
        this.e = 3;
        this.i = joVar;
        this.g = obj;
        this.h = obj2;
        this.f = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        int i2 = this.f;
        Object obj3 = this.i;
        Object obj4 = this.h;
        t32 t32Var = t32.a;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xi0.e((a11) obj5, (b3) obj4, (jo) obj3, (ob0) obj, al.V(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                xi0.j((iq) obj5, (wa0) obj4, (ha0) obj3, (ob0) obj, al.V(i2 | 1));
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                pv.b((tv0) obj5, (nb1) obj4, (jo) obj3, (ob0) obj, al.V(i2 | 1));
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                ((jo) obj3).l(obj5, obj4, (ob0) obj, al.V(i2) | 1);
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                is.b((tv0) obj5, (cs) obj4, (sa0) obj3, (ob0) obj, al.V(1), this.f);
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                is.a((cs) obj5, (tv0) obj4, (jo) obj3, (ob0) obj, al.V(i2 | 1));
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj2).intValue();
                qw.c((ww1) obj5, (lw1) obj4, (ha0) obj3, (ob0) obj, al.V(i2 | 1));
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                int iV = al.V(1);
                bl.f((kn0) obj5, this.h, this.f, this.i, (ob0) obj, iV);
                break;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                ((Integer) obj2).getClass();
                ((xn0) obj5).b(obj4, (jo) obj3, (ob0) obj, al.V(i2 | 1));
                break;
            case el.a /* 9 */:
                ((Integer) obj2).intValue();
                el.d((xo0) obj5, (dp0) obj4, (sa0) obj3, (ob0) obj, al.V(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((ih1) obj5).b(obj4, (jo) obj3, (ob0) obj, al.V(i2 | 1));
                break;
        }
        return t32Var;
    }

    public /* synthetic */ r7(kn0 kn0Var, Object obj, int i, Object obj2, int i2) {
        this.e = 7;
        this.g = kn0Var;
        this.h = obj;
        this.f = i;
        this.i = obj2;
    }

    public /* synthetic */ r7(tv0 tv0Var, cs csVar, sa0 sa0Var, int i, int i2) {
        this.e = 4;
        this.g = tv0Var;
        this.h = csVar;
        this.i = sa0Var;
        this.f = i2;
    }

    public /* synthetic */ r7(Object obj, Object obj2, eb0 eb0Var, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.i = eb0Var;
        this.f = i;
    }
}
