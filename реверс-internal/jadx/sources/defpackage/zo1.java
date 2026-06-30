package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zo1 implements xa0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ jx0 g;
    public final /* synthetic */ Object h;

    public /* synthetic */ zo1(jx0 jx0Var, no1 no1Var, boolean z) {
        this.g = jx0Var;
        this.h = no1Var;
        this.f = z;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj3).getClass();
                uo1.a.a(this.g, null, (no1) obj4, this.f, 0L, (ob0) obj2, 196608);
                return t32.a;
            default:
                ky1 ky1Var = (ky1) obj4;
                v41 v41Var = ky1Var.f;
                ob0 ob0Var = (ob0) obj2;
                ((Integer) obj3).getClass();
                ob0Var.W(-2137546592);
                boolean z = ((k31) v41Var.getValue()) == k31.e || !(ob0Var.j(aq.n) == al0.f);
                boolean zF = ob0Var.f(ky1Var);
                Object objK = ob0Var.K();
                l91 l91Var = kp.a;
                if (zF || objK == l91Var) {
                    objK = new wt1(5, ky1Var);
                    ob0Var.f0(objK);
                }
                fy0 fy0VarD = xc.D((sa0) objK, ob0Var);
                Object objK2 = ob0Var.K();
                if (objK2 == l91Var) {
                    nw nwVar = new nw(new p8(fy0VarD, 4));
                    ob0Var.f0(nwVar);
                    objK2 = nwVar;
                }
                vj1 vj1Var = (vj1) objK2;
                boolean zF2 = ob0Var.f(vj1Var) | ob0Var.f(ky1Var);
                Object objK3 = ob0Var.K();
                if (zF2 || objK3 == l91Var) {
                    objK3 = new jy1(vj1Var, ky1Var);
                    ob0Var.f0(objK3);
                }
                tv0 tv0VarB = oj1.b((jy1) objK3, (k31) v41Var.getValue(), this.f && ky1Var.b.g() != 0.0f, z, this.g);
                ob0Var.p(false);
                return tv0VarB;
        }
    }

    public /* synthetic */ zo1(ky1 ky1Var, boolean z, jx0 jx0Var) {
        this.h = ky1Var;
        this.f = z;
        this.g = jx0Var;
    }
}
