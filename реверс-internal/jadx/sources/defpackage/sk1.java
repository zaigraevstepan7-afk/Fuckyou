package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sk1 implements xa0 {
    public final /* synthetic */ pf0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ha0 h;

    public sk1(pf0 pf0Var, boolean z, boolean z2, ha0 ha0Var) {
        this.e = pf0Var;
        this.f = z;
        this.g = z2;
        this.h = ha0Var;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        ob0 ob0Var = (ob0) obj2;
        ((Number) obj3).intValue();
        ob0Var.W(-1525724089);
        Object objK = ob0Var.K();
        if (objK == kp.a) {
            objK = new jx0();
            ob0Var.f0(objK);
        }
        jx0 jx0Var = (jx0) objK;
        tv0 tv0VarC = mf0.a(qv0.a, jx0Var, this.e).c(new rk1(this.f, jx0Var, null, this.g, this.h));
        ob0Var.p(false);
        return tv0VarC;
    }
}
