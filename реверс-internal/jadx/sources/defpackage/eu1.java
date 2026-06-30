package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class eu1 extends xv0 {
    public final xz a;

    public eu1(xz xzVar) {
        this.a = xzVar;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new fu1(wi0.I, this.a);
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu1)) {
            return false;
        }
        eu1 eu1Var = (eu1) obj;
        d7 d7Var = wi0.I;
        return d7Var.equals(d7Var) && xi0.o(this.a, eu1Var.a);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        fu1 fu1Var = (fu1) sv0Var;
        d7 d7Var = wi0.I;
        if (!xi0.o(fu1Var.t, d7Var)) {
            fu1Var.t = d7Var;
            if (fu1Var.u) {
                fu1Var.N0();
            }
        }
        fu1Var.s = this.a;
    }

    public final int hashCode() {
        int iD = s91.d(1022 * 31, 31, false);
        xz xzVar = this.a;
        return iD + (xzVar != null ? xzVar.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + wi0.I + ", overrideDescendants=false, touchBoundsExpansion=" + this.a + ")";
    }
}
