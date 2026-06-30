package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class p9 extends sk0 implements xa0 {
    public final /* synthetic */ mq1 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ ba h;
    public final /* synthetic */ jo i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(mq1 mq1Var, Object obj, ba baVar, jo joVar) {
        super(3);
        this.f = mq1Var;
        this.g = obj;
        this.h = baVar;
        this.i = joVar;
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
    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        qa qaVar = (qa) obj;
        ob0 ob0Var = (ob0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? ob0Var.f(qaVar) : ob0Var.h(qaVar) ? 4 : 2;
        }
        if (ob0Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            mq1 mq1Var = this.f;
            boolean zF = ob0Var.f(mq1Var);
            Object obj4 = this.g;
            boolean zH = zF | ob0Var.h(obj4);
            ba baVar = this.h;
            boolean zH2 = zH | ob0Var.h(baVar);
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            if (zH2 || objK == l91Var) {
                objK = new o9(mq1Var, obj4, baVar, 0);
                ob0Var.f0(objK);
            }
            wi0.c(qaVar, (sa0) objK, ob0Var);
            zx0 zx0Var = baVar.c;
            qaVar.getClass();
            zx0Var.m(obj4, ((ra) qaVar).a);
            Object objK2 = ob0Var.K();
            if (objK2 == l91Var) {
                objK2 = new u9();
                ob0Var.f0(objK2);
            }
            this.i.n((u9) objK2, obj4, ob0Var, 0);
        } else {
            ob0Var.Q();
        }
        return t32.a;
    }
}
