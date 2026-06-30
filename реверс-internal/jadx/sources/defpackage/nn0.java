package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nn0 {
    public final hx0 a;
    public final kn0 b;
    public final vm0 c;
    public final long d;
    public final /* synthetic */ vm0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ sf h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ long k;
    public final /* synthetic */ un0 l;

    public nn0(long j, kn0 kn0Var, vm0 vm0Var, int i, int i2, sf sfVar, int i3, int i4, long j2, un0 un0Var) {
        this.e = vm0Var;
        this.f = i;
        this.g = i2;
        this.h = sfVar;
        this.i = i3;
        this.j = i4;
        this.k = j2;
        this.l = un0Var;
        hx0 hx0Var = nh0.a;
        this.a = new hx0();
        this.b = kn0Var;
        this.c = vm0Var;
        this.d = lr.b(0, kr.h(j), 0, Integer.MAX_VALUE, 5);
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
    public final qn0 a(int i, long j) {
        long j2;
        List list;
        kn0 kn0Var = this.b;
        Object objD = kn0Var.d(i);
        kn0Var.b(i);
        hx0 hx0Var = this.a;
        List list2 = (List) hx0Var.b(i);
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            vm0 vm0Var = this.c;
            kn0 kn0Var2 = vm0Var.g;
            hx0 hx0Var2 = vm0Var.h;
            List listG = (List) hx0Var2.b(i);
            if (listG == null) {
                Object objD2 = kn0Var2.d(i);
                kn0Var2.b(i);
                listG = vm0Var.f.G(vm0Var.e.a(i, objD2, null), objD2);
                hx0Var2.i(i, listG);
            }
            int size = listG.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((pu0) listG.get(i2)).e(j));
            }
            j2 = j;
            hx0Var.i(i, arrayList);
            list = arrayList;
        }
        return new qn0(i, list, this.h, this.e.f.getLayoutDirection(), this.i, this.j, i != this.f + (-1) ? this.g : 0, this.k, objD, null, this.l.n, j2);
    }
}
