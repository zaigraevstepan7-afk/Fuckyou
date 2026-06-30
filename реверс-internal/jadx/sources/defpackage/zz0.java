package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zz0 extends sk0 implements sa0 {
    public static final zz0 g;
    public static final zz0 h;
    public static final zz0 i;
    public static final zz0 j;
    public static final zz0 k;
    public static final zz0 l;
    public static final zz0 m;
    public static final zz0 n;
    public static final zz0 o;
    public static final zz0 p;
    public static final zz0 q;
    public static final zz0 r;
    public static final zz0 s;
    public static final zz0 t;
    public static final zz0 u;
    public static final zz0 v;
    public static final zz0 w;
    public static final zz0 x;
    public static final zz0 y;
    public final /* synthetic */ int f;

    static {
        int i2 = 1;
        g = new zz0(i2, 0);
        h = new zz0(i2, 1);
        i = new zz0(i2, 2);
        j = new zz0(i2, 3);
        k = new zz0(i2, 4);
        l = new zz0(i2, 5);
        m = new zz0(i2, 6);
        n = new zz0(i2, 7);
        o = new zz0(i2, 8);
        p = new zz0(i2, 9);
        q = new zz0(i2, 10);
        r = new zz0(i2, 11);
        s = new zz0(i2, 12);
        t = new zz0(i2, 13);
        u = new zz0(i2, 14);
        v = new zz0(i2, 15);
        w = new zz0(i2, 16);
        x = new zz0(i2, 17);
        y = new zz0(i2, 18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz0(int i2) {
        super(1);
        this.f = 19;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i2 = this.f;
        t32 t32Var = t32.a;
        switch (i2) {
            case 0:
                v31 v31Var = ((c01) obj).T;
                if (v31Var != null) {
                    ((qc0) v31Var).c();
                }
                return t32Var;
            case 1:
                c01 c01Var = (c01) obj;
                ql0 ql0Var = c01Var.w;
                try {
                    if (c01Var.z()) {
                        c01Var.w1(true);
                        break;
                    }
                    return t32Var;
                } catch (Throwable th) {
                    ql0Var.c0(th);
                    throw null;
                }
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                v01 v01Var = (v01) obj;
                if (v01Var.z()) {
                    v01Var.e.K();
                }
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ql0 ql0Var2 = (ql0) obj;
                if (ql0Var2.J()) {
                    ql0Var2.Y(false);
                }
                return t32Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ql0 ql0Var3 = (ql0) obj;
                if (ql0Var3.J()) {
                    ql0Var3.Y(false);
                }
                return t32Var;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ql0 ql0Var4 = (ql0) obj;
                if (ql0Var4.J()) {
                    ql0Var4.W(false);
                }
                return t32Var;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                ql0 ql0Var5 = (ql0) obj;
                if (ql0Var5.J()) {
                    ql0Var5.W(false);
                }
                return t32Var;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                ql0 ql0Var6 = (ql0) obj;
                if (ql0Var6.J()) {
                    ql0.X(ql0Var6, false, 7);
                }
                return t32Var;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                ql0 ql0Var7 = (ql0) obj;
                if (ql0Var7.J()) {
                    ql0.Z(ql0Var7, false, 7);
                }
                return t32Var;
            case el.a /* 9 */:
                ql0 ql0Var8 = (ql0) obj;
                if (ql0Var8.J()) {
                    ql0Var8.H();
                }
                return t32Var;
            case el.b /* 10 */:
                return t32Var;
            case 11:
                v81 v81Var = (v81) obj;
                if (v81Var.isAttachedToWindow()) {
                    v81Var.s();
                }
                return t32Var;
            case el.c /* 12 */:
                return t32Var;
            case 13:
                return Integer.valueOf(((yi1) obj).b);
            case 14:
                sh0 sh0Var = ((yi1) obj).c;
                return Integer.valueOf(sh0Var.d - sh0Var.b);
            case 15:
                return t32Var;
            case 16:
                int i3 = ((cf0) obj).a;
                return t32Var;
            case 17:
                return t32Var;
            case 18:
                int i4 = ((cf0) obj).a;
                return t32Var;
            case 19:
                return Boolean.valueOf(((w80) obj).L0());
            default:
                ((be0) obj).getClass();
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz0(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz0(zc1 zc1Var) {
        super(1);
        this.f = 20;
    }
}
