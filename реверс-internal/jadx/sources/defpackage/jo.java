package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jo implements wa0, xa0, ya0, za0, ab0, bb0, cb0, db0, ia0, ja0, la0, ma0, na0, oa0, pa0, qa0, ra0, ta0, ua0 {
    public final int e;
    public final boolean f;
    public eb0 g;
    public dc1 h;
    public ArrayList i;

    public jo(int i, boolean z, eb0 eb0Var) {
        this.e = i;
        this.f = z;
        this.g = eb0Var;
    }

    @Override // defpackage.cb0
    public final /* bridge */ /* synthetic */ Object b(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, ob0 ob0Var, Integer num) {
        return k(obj, bool, obj2, obj3, obj4, ob0Var, num.intValue());
    }

    public final Object d(gf gfVar, Object obj, Object obj2, ob0 ob0Var, int i) {
        ob0Var.X(this.e);
        m(ob0Var);
        int iP = ob0Var.f(this) ? lk.p(2, 3) : lk.p(1, 3);
        eb0 eb0Var = this.g;
        s22.i(5, eb0Var);
        Object objJ = ((za0) eb0Var).j(gfVar, obj, obj2, ob0Var, Integer.valueOf(iP | i));
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new fo(this, gfVar, obj, obj2, i, 0);
        }
        return objJ;
    }

    public final Object e(ob0 ob0Var, int i) {
        ob0Var.X(this.e);
        m(ob0Var);
        int iP = i | (ob0Var.f(this) ? lk.p(2, 0) : lk.p(1, 0));
        eb0 eb0Var = this.g;
        s22.i(2, eb0Var);
        Object objH = ((wa0) eb0Var).h(ob0Var, Integer.valueOf(iP));
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new io(2, this, jo.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objH;
    }

    @Override // defpackage.xa0
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3) {
        return g(obj, (ob0) obj2, ((Number) obj3).intValue());
    }

    public final Object g(Object obj, ob0 ob0Var, int i) {
        ob0Var.X(this.e);
        m(ob0Var);
        int iP = ob0Var.f(this) ? lk.p(2, 1) : lk.p(1, 1);
        eb0 eb0Var = this.g;
        s22.i(3, eb0Var);
        Object objF = ((xa0) eb0Var).f(obj, ob0Var, Integer.valueOf(iP | i));
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new go(i, 0, this, obj);
        }
        return objF;
    }

    @Override // defpackage.wa0
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
        return e((ob0) obj, ((Number) obj2).intValue());
    }

    @Override // defpackage.za0
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return d((gf) obj, obj2, obj3, (ob0) obj4, ((Number) obj5).intValue());
    }

    public final Object k(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, ob0 ob0Var, int i) {
        ob0Var.X(this.e);
        m(ob0Var);
        int iP = ob0Var.f(this) ? lk.p(2, 6) : lk.p(1, 6);
        eb0 eb0Var = this.g;
        s22.i(8, eb0Var);
        Object objB = ((cb0) eb0Var).b(obj, bool, obj2, obj3, obj4, ob0Var, Integer.valueOf(i | iP));
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new ho(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objB;
    }

    public final Object l(Object obj, Object obj2, ob0 ob0Var, int i) {
        ob0Var.X(this.e);
        m(ob0Var);
        int iP = ob0Var.f(this) ? lk.p(2, 2) : lk.p(1, 2);
        eb0 eb0Var = this.g;
        s22.i(4, eb0Var);
        Object objN = ((ya0) eb0Var).n(obj, obj2, ob0Var, Integer.valueOf(iP | i));
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new r7(i, this, obj, obj2);
        }
        return objN;
    }

    public final void m(ob0 ob0Var) {
        dc1 dc1VarW;
        if (!this.f || (dc1VarW = ob0Var.w()) == null) {
            return;
        }
        dc1VarW.b |= 1;
        dc1 dc1Var = this.h;
        if (dc1Var == null || !dc1Var.a() || dc1Var == dc1VarW || xi0.o(dc1Var.c, dc1VarW.c)) {
            this.h = dc1VarW;
            return;
        }
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.i = arrayList2;
            arrayList2.add(dc1VarW);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dc1 dc1Var2 = (dc1) arrayList.get(i);
            if (dc1Var2 == null || !dc1Var2.a() || dc1Var2 == dc1VarW || xi0.o(dc1Var2.c, dc1VarW.c)) {
                arrayList.set(i, dc1VarW);
                return;
            }
        }
        arrayList.add(dc1VarW);
    }

    @Override // defpackage.ya0
    public final /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        return l(obj, obj2, (ob0) obj3, ((Number) obj4).intValue());
    }
}
