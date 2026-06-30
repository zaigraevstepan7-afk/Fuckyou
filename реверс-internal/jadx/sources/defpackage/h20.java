package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class h20 {
    public final ld0 a;
    public final u42 b;
    public final boolean c;
    public final double d;
    public final g12 e;
    public final g12 f;
    public final g12 g;
    public final g12 h;
    public final g12 i;
    public final g20 j;
    public final g12 k;
    public final hm l;

    public h20(ld0 ld0Var, u42 u42Var, boolean z, double d, g12 g12Var, g12 g12Var2, g12 g12Var3, g12 g12Var4, g12 g12Var5, g20 g20Var, hm hmVar, g12 g12Var6) {
        ld0Var.getClass();
        u42Var.getClass();
        g12Var.getClass();
        g12Var2.getClass();
        g12Var3.getClass();
        g12Var4.getClass();
        g12Var5.getClass();
        g20Var.getClass();
        hmVar.getClass();
        g12Var6.getClass();
        this.a = ld0Var;
        this.b = u42Var;
        this.c = z;
        this.d = d;
        this.e = g12Var;
        this.f = g12Var2;
        this.g = g12Var3;
        this.h = g12Var4;
        this.i = g12Var5;
        this.j = g20Var;
        this.k = g12Var6;
        switch (u42Var.ordinal()) {
            case 0:
            case t91.STRING_FIELD_NUMBER /* 5 */:
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                hmVar = hm.e;
                break;
            case 1:
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
            case t91.LONG_FIELD_NUMBER /* 4 */:
                break;
            default:
                ez1.a();
                throw null;
        }
        this.l = hmVar;
    }
}
