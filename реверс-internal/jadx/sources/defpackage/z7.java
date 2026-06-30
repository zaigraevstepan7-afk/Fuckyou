package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z7 implements xa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ z7(no1 no1Var, boolean z) {
        this.e = 2;
        this.f = z;
        this.g = no1Var;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        final boolean z = this.f;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                final ha0 ha0Var = (ha0) obj4;
                tv0 tv0Var = (tv0) obj;
                ob0 ob0Var = (ob0) obj2;
                ((Integer) obj3).getClass();
                ob0Var.W(-196777734);
                final long j = ((xz1) ob0Var.j(yz1.a)).a;
                boolean zE = ob0Var.e(j) | ob0Var.f(ha0Var) | ob0Var.g(z);
                Object objK = ob0Var.K();
                if (zE || objK == kp.a) {
                    objK = new sa0() { // from class: a8
                        @Override // defpackage.sa0
                        public final Object i(Object obj5) {
                            li liVar = (li) obj5;
                            final f6 f6VarX = xi0.x(liVar, Float.intBitsToFloat((int) (liVar.e.d() >> 32)) / 2.0f);
                            final wf wfVar = new wf(5, j);
                            final ha0 ha0Var2 = ha0Var;
                            final boolean z2 = z;
                            return liVar.a(new sa0() { // from class: s7
                                @Override // defpackage.sa0
                                public final Object i(Object obj6) {
                                    sl0 sl0Var = (sl0) obj6;
                                    sl0Var.a();
                                    ej ejVar = sl0Var.e;
                                    boolean zBooleanValue = ((Boolean) ha0Var2.a()).booleanValue();
                                    t32 t32Var = t32.a;
                                    if (!zBooleanValue) {
                                        return t32Var;
                                    }
                                    boolean z3 = z2;
                                    f6 f6Var = f6VarX;
                                    wf wfVar2 = wfVar;
                                    if (!z3) {
                                        p10.Y(sl0Var, f6Var, 0L, 0.0f, wfVar2, 46);
                                        return t32Var;
                                    }
                                    long jS = ejVar.S();
                                    oc ocVar = ejVar.f;
                                    long jQ = ocVar.q();
                                    ocVar.i().l();
                                    try {
                                        ((qt0) ocVar.a).x(-1.0f, 1.0f, jS);
                                        p10.Y(sl0Var, f6Var, 0L, 0.0f, wfVar2, 46);
                                        return t32Var;
                                    } finally {
                                        s91.r(ocVar, jQ);
                                    }
                                }
                            });
                        }
                    };
                    ob0Var.f0(objK);
                }
                tv0 tv0VarK = pv.k(tv0Var, (sa0) objK);
                ob0Var.p(false);
                return tv0VarK;
            case 1:
                final ns1 ns1Var = (ns1) obj4;
                final z61 z61VarE = ((pu0) obj2).e(((kr) obj3).a);
                return ((xu0) obj).f0(z61VarE.e, z61VarE.f, g40.e, new sa0() { // from class: nk1
                    @Override // defpackage.sa0
                    public final Object i(Object obj5) {
                        ((y61) obj5).g(z61VarE, 0, 0, ((Number) ns1Var.getValue()).floatValue() + (z ? 5.0f : 0.0f));
                        return t32.a;
                    }
                });
            default:
                int iIntValue = ((Integer) obj3).intValue();
                uo1 uo1Var = uo1.a;
                uo1Var.b((hp1) obj, null, this.f, (no1) obj4, null, null, 0.0f, 0.0f, (ob0) obj2, (iIntValue & 14) | 100663296);
                return t32.a;
        }
    }

    public /* synthetic */ z7(int i, Object obj, boolean z) {
        this.e = i;
        this.g = obj;
        this.f = z;
    }
}
