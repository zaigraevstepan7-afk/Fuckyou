package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ie extends sv0 {
    public q02 s;
    public final /* synthetic */ je t;

    public ie(je jeVar) {
        this.t = jeVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.sv0
    public final void D0() {
        je jeVar = this.t;
        jeVar.a = this;
        if (jeVar.b != null) {
            d dVar = new d(1, this, jeVar);
            ql0 ql0VarP = bl.P(this);
            int i = ql0VarP.f;
            sc1 rectManager = ((h4) tl0.a(ql0VarP)).getRectManager();
            r02 r02Var = rectManager.d;
            r02Var.getClass();
            hx0 hx0Var = r02Var.a;
            q02 q02Var = new q02(r02Var, i, this, dVar);
            Object objB = hx0Var.b(i);
            if (objB == null) {
                hx0Var.i(i, q02Var);
                objB = q02Var;
            }
            q02 q02Var2 = (q02) objB;
            if (q02Var2 != q02Var) {
                while (true) {
                    q02 q02Var3 = q02Var2.d;
                    if (q02Var3 == null) {
                        break;
                    } else {
                        q02Var2 = q02Var3;
                    }
                }
                q02Var2.d = q02Var;
            }
            ql0 ql0VarP2 = bl.P(this.e);
            if (sc1.d(ql0VarP2)) {
                g6 g6Var = rectManager.c;
                int iE = rectManager.e(ql0VarP2);
                long[] jArr = (long[]) g6Var.b;
                int i2 = iE + 2;
                jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
            }
            rectManager.f = true;
            rectManager.k();
            this.s = q02Var;
        }
    }

    @Override // defpackage.sv0
    public final void E0() {
        je jeVar = this.t;
        if (jeVar.a == this) {
            jeVar.a = null;
        }
        q02 q02Var = this.s;
        if (q02Var != null) {
            q02Var.b();
        }
        this.s = null;
    }
}
