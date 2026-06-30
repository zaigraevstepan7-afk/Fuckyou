package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class qn1 {
    static {
        new bo0(new lh1(3));
    }

    public static final ym1 a(pn1 pn1Var, en1 en1Var) {
        switch (en1Var.ordinal()) {
            case 0:
                return pn1Var.h;
            case 1:
                return pn1Var.e;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return pn1Var.g;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return c(pn1Var.e);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return pn1Var.a;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return c(pn1Var.a);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return mg1.a;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return pn1Var.d;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                kg1 kg1Var = pn1Var.d;
                uz uzVar = cn1.i;
                return kg1.c(kg1Var, uzVar, null, null, uzVar, 6);
            case el.a /* 9 */:
                return pn1Var.f;
            case el.b /* 10 */:
                kg1 kg1Var2 = pn1Var.d;
                uz uzVar2 = cn1.i;
                return kg1.c(kg1Var2, null, uzVar2, uzVar2, null, 9);
            case 11:
                return c(pn1Var.d);
            case el.c /* 12 */:
                return pn1Var.c;
            case 13:
                return pv.w;
            case 14:
                return pn1Var.b;
            default:
                ez1.a();
                return null;
        }
    }

    public static final ym1 b(en1 en1Var, ob0 ob0Var) {
        return a(((ju0) ob0Var.j(mu0.b)).c, en1Var);
    }

    public static kg1 c(kg1 kg1Var) {
        uz uzVar = cn1.i;
        return kg1.c(kg1Var, null, null, uzVar, uzVar, 3);
    }
}
