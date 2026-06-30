package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class a4 extends sk0 implements sa0 {
    public static final a4 A;
    public static final a4 B;
    public static final a4 C;
    public static final a4 D;
    public static final a4 E;
    public static final a4 F;
    public static final a4 G;
    public static final a4 H;
    public static final a4 I;
    public static final a4 J;
    public static final a4 g;
    public static final a4 h;
    public static final a4 i;
    public static final a4 j;
    public static final a4 k;
    public static final a4 l;
    public static final a4 m;
    public static final a4 n;
    public static final a4 o;
    public static final a4 p;
    public static final a4 q;
    public static final a4 r;
    public static final a4 s;
    public static final a4 t;
    public static final a4 u;
    public static final a4 v;
    public static final a4 w;
    public static final a4 x;
    public static final a4 y;
    public static final a4 z;
    public final /* synthetic */ int f;

    static {
        int i2 = 1;
        g = new a4(i2, 0);
        h = new a4(i2, 1);
        i = new a4(i2, 2);
        j = new a4(i2, 3);
        k = new a4(i2, 4);
        l = new a4(i2, 5);
        m = new a4(i2, 6);
        n = new a4(i2, 7);
        o = new a4(i2, 8);
        p = new a4(i2, 9);
        q = new a4(i2, 10);
        r = new a4(i2, 11);
        s = new a4(i2, 12);
        t = new a4(i2, 13);
        u = new a4(i2, 14);
        v = new a4(i2, 15);
        w = new a4(i2, 16);
        x = new a4(i2, 17);
        y = new a4(i2, 18);
        z = new a4(i2, 19);
        A = new a4(i2, 20);
        B = new a4(i2, 21);
        C = new a4(i2, 22);
        D = new a4(i2, 23);
        E = new a4(i2, 24);
        F = new a4(i2, 25);
        G = new a4(i2, 26);
        H = new a4(i2, 27);
        I = new a4(i2, 28);
        J = new a4(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.sa0
    public final Object i(Object obj) {
        xd0 xd0Var;
        int i2 = this.f;
        t32 t32Var = t32.a;
        switch (i2) {
            case 0:
                break;
            case 1:
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                up upVar = (up) obj;
                upVar.B(w4.a);
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ck0[] ck0VarArr = yl1.a;
                ((am1) obj).a(vl1.y, t32Var);
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ((Number) obj).longValue();
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                ck0[] ck0VarArr2 = yl1.a;
                ((am1) obj).a(vl1.x, t32Var);
                break;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case el.a /* 9 */:
                w40 w40VarA = r40.b(pv.G(220, 4, null), 2).a(new w40(new e22((p50) null, (wi0) null, new mi1(0.92f, u12.b, pv.G(220, 4, null)), (LinkedHashMap) null, 119)));
                p60 p60VarG = pv.G(90, 6, null);
                if ((1 & 2) != 0) {
                    p60VarG = pv.D(0.0f, 400.0f, null, 5);
                }
                break;
            case el.b /* 10 */:
                break;
            case 11:
                break;
            case el.c /* 12 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 13:
                long jA = vl.a(((vl) obj).a, gm.x);
                break;
            case 14:
                ((Number) obj).longValue();
                break;
            case 15:
                ep epVar = (ep) obj;
                ql0 ql0Var = epVar instanceof ql0 ? (ql0) epVar : null;
                if (ql0Var != null && ql0Var.R) {
                    ng0.b("Apply is called on deactivated node " + epVar);
                }
                break;
            case 16:
                break;
            case 17:
                float[] fArr = ((ou0) obj).a;
                break;
            case 18:
                float[] fArr2 = ((ou0) obj).a;
                break;
            case 19:
                break;
            case 20:
                long j2 = ((u12) obj).a;
                break;
            case 21:
                za zaVar = (za) obj;
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                p10.e0((p10) obj, vl.f, 0L, 0L, 126);
                break;
            case 28:
                b71 b71Var = (b71) obj;
                if (b71Var.z()) {
                    ws0 ws0Var = b71Var.f;
                    if (!ws0Var.s) {
                        sa0 sa0VarE = b71Var.e.e();
                        if (b71Var.e.c() != null) {
                            ws0Var.K0();
                        } else if (sa0VarE != null) {
                            ws0Var.l = null;
                            ws0Var.m = null;
                            ws0Var.t0(b71Var, 9223372034707292159L, 0L);
                            ws0Var.k = sa0VarE;
                        } else {
                            ws0Var.l = null;
                            ws0Var.m = null;
                            ws0Var.k = null;
                            ws0Var.K0();
                        }
                    }
                }
                break;
            default:
                b71 b71Var2 = (b71) obj;
                if (b71Var2.z() && (xd0Var = b71Var2.g) != null) {
                    ws0 ws0Var2 = b71Var2.f;
                    zx0 zx0Var = ws0Var2.v;
                    ay0 ay0Var = zx0Var != null ? (ay0) zx0Var.g(xd0Var) : null;
                    if (ay0Var != null) {
                        ub ubVar = ws0Var2.u;
                        if (ubVar != null) {
                            ubVar.c(xd0Var);
                        }
                        ws0Var2.I0(ay0Var);
                        ay0Var.b();
                    }
                }
                break;
        }
        return t32Var;
    }
}
