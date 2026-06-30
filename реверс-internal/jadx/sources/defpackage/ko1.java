package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ko1 {
    public static final j60 a;
    public static final j60 b;
    public static final j60 c;
    public static final t92 d;
    public static final t92 e;
    public static final t92 f;
    public static final t92 g;
    public static final t92 h;
    public static final t92 i;

    static {
        jy jyVar = jy.f;
        a = new j60(jyVar);
        jy jyVar2 = jy.e;
        b = new j60(jyVar2);
        jy jyVar3 = jy.g;
        c = new j60(jyVar3);
        sf sfVar = v20.r;
        int i2 = 22;
        d = new t92(jyVar, new ud(i2, sfVar), sfVar);
        sf sfVar2 = v20.q;
        e = new t92(jyVar, new ud(i2, sfVar2), sfVar2);
        tf tfVar = v20.p;
        int i3 = 23;
        f = new t92(jyVar2, new ud(i3, tfVar), tfVar);
        tf tfVar2 = v20.o;
        g = new t92(jyVar2, new ud(i3, tfVar2), tfVar2);
        uf ufVar = v20.j;
        int i4 = 24;
        h = new t92(jyVar3, new ud(i4, ufVar), ufVar);
        uf ufVar2 = v20.f;
        i = new t92(jyVar3, new ud(i4, ufVar2), ufVar2);
    }

    public static final tv0 a(tv0 tv0Var, float f2, float f3) {
        return tv0Var.c(new g42(f2, f3));
    }

    public static final tv0 b(tv0 tv0Var, float f2) {
        return tv0Var.c(new jo1(0.0f, f2, 0.0f, f2, 5));
    }

    public static final tv0 c(tv0 tv0Var, float f2, float f3) {
        return tv0Var.c(new jo1(0.0f, f2, 0.0f, f3, 5));
    }

    public static tv0 d(tv0 tv0Var, float f2, float f3, float f4, float f5, int i2) {
        return tv0Var.c(new jo1(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final tv0 e(tv0 tv0Var, float f2) {
        return tv0Var.c(new jo1(f2, f2, f2, f2, true));
    }

    public static final tv0 f(tv0 tv0Var, float f2, float f3) {
        return tv0Var.c(new jo1(f2, f3, f2, f3, true));
    }

    public static final tv0 g(tv0 tv0Var, float f2, float f3, float f4, float f5) {
        return tv0Var.c(new jo1(f2, f3, f4, f5, true));
    }

    public static final tv0 h(tv0 tv0Var, float f2) {
        return tv0Var.c(new jo1(f2, 0.0f, f2, 0.0f, 10));
    }

    public static tv0 i(tv0 tv0Var, float f2) {
        return tv0Var.c(new jo1(Float.NaN, 0.0f, f2, 0.0f, 10));
    }

    public static tv0 j(tv0 tv0Var) {
        t92 t92Var;
        tf tfVar = v20.p;
        if (xi0.o(tfVar, tfVar)) {
            t92Var = f;
        } else if (xi0.o(tfVar, v20.o)) {
            t92Var = g;
        } else {
            t92Var = new t92(jy.e, new ud(23, tfVar), tfVar);
        }
        return tv0Var.c(t92Var);
    }

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
    public static tv0 k(tv0 tv0Var) {
        t92 t92Var;
        uf ufVar = v20.j;
        if (ufVar.equals(ufVar)) {
            t92Var = h;
        } else if (ufVar.equals(v20.f)) {
            t92Var = i;
        } else {
            t92Var = new t92(jy.g, new ud(24, ufVar), ufVar);
        }
        return tv0Var.c(t92Var);
    }

    public static tv0 l(tv0 tv0Var) {
        t92 t92Var;
        sf sfVar = v20.r;
        if (xi0.o(sfVar, sfVar)) {
            t92Var = d;
        } else if (xi0.o(sfVar, v20.q)) {
            t92Var = e;
        } else {
            t92Var = new t92(jy.f, new ud(22, sfVar), sfVar);
        }
        return tv0Var.c(t92Var);
    }
}
