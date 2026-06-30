package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h32 {
    public static final i32 a;

    static {
        al.F(new lh1(8));
        a = new i32();
    }

    public static final d02 a(g32 g32Var, ob0 ob0Var) {
        f32 f32Var = ((ju0) ob0Var.j(mu0.b)).b;
        switch (g32Var.ordinal()) {
            case 0:
                return f32Var.j;
            case 1:
                return f32Var.k;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return f32Var.l;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return f32Var.a;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return f32Var.b;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return f32Var.c;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return f32Var.d;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return f32Var.e;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return f32Var.f;
            case el.a /* 9 */:
                return f32Var.m;
            case el.b /* 10 */:
                return f32Var.n;
            case 11:
                return f32Var.o;
            case el.c /* 12 */:
                return f32Var.g;
            case 13:
                return f32Var.h;
            case 14:
                return f32Var.i;
            case 15:
                return f32Var.y;
            case 16:
                return f32Var.z;
            case 17:
                return f32Var.A;
            case 18:
                return f32Var.p;
            case 19:
                return f32Var.q;
            case 20:
                return f32Var.r;
            case 21:
                return f32Var.s;
            case 22:
                return f32Var.t;
            case 23:
                return f32Var.u;
            case 24:
                return f32Var.B;
            case 25:
                return f32Var.C;
            case 26:
                return f32Var.D;
            case 27:
                return f32Var.v;
            case 28:
                return f32Var.w;
            case 29:
                return f32Var.x;
            default:
                ez1.a();
                return null;
        }
    }
}
