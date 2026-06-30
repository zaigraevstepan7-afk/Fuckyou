package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hv1 implements wa0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ hv1(l91 l91Var, boolean z, jx0 jx0Var, fx1 fx1Var, ym1 ym1Var, int i) {
        this.g = l91Var;
        this.f = z;
        this.h = jx0Var;
        this.i = fx1Var;
        this.j = ym1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iV = al.V(3073);
                iv1.a(this.f, (sa0) obj6, (tv0) obj5, (wa0) obj4, (gv1) obj3, (ob0) obj, iV);
                break;
            default:
                ((Integer) obj2).getClass();
                int iV2 = al.V(114822145);
                ((l91) obj6).f(this.f, (jx0) obj5, (fx1) obj4, (ym1) obj3, (ob0) obj, iV2);
                break;
        }
        return t32Var;
    }

    public /* synthetic */ hv1(boolean z, sa0 sa0Var, tv0 tv0Var, wa0 wa0Var, gv1 gv1Var, int i) {
        this.f = z;
        this.g = sa0Var;
        this.h = tv0Var;
        this.i = wa0Var;
        this.j = gv1Var;
    }
}
