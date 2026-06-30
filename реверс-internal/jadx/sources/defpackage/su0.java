package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class su0 extends sk0 implements ha0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ tu0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ su0(tu0 tu0Var, int i) {
        super(0);
        this.f = i;
        this.g = tu0Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        y61 placementScope;
        int i = this.f;
        t32 t32Var = t32.a;
        tu0 tu0Var = this.g;
        switch (i) {
            case 0:
                ul0 ul0Var = tu0Var.j;
                ul0Var.i = 0;
                iy0 iy0VarY = ul0Var.a.y();
                Object[] objArr = iy0VarY.e;
                int i2 = iy0VarY.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    tu0 tu0Var2 = ((ql0) objArr[i3]).J.p;
                    tu0Var2.l = tu0Var2.m;
                    tu0Var2.m = Integer.MAX_VALUE;
                    tu0Var2.x = false;
                    if (tu0Var2.p == ol0.f) {
                        tu0Var2.p = ol0.g;
                    }
                }
                ql0 ql0Var = ul0Var.a;
                ql0 ql0Var2 = ul0Var.a;
                iy0 iy0VarY2 = ql0Var.y();
                Object[] objArr2 = iy0VarY2.e;
                int i4 = iy0VarY2.g;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((ql0) objArr2[i5]).J.p.B.d = false;
                }
                if (tu0Var.n().s) {
                    qx0 qx0Var = (qx0) ql0Var2.n();
                    int i6 = ((iy0) qx0Var.f).g;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((ql0) qx0Var.get(i7)).I.d.s = true;
                    }
                }
                tu0Var.n().D0().b();
                if (tu0Var.n().s) {
                    qx0 qx0Var2 = (qx0) ql0Var2.n();
                    int i8 = ((iy0) qx0Var2.f).g;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((ql0) qx0Var2.get(i9)).I.d.s = false;
                    }
                }
                iy0 iy0VarY3 = ql0Var2.y();
                Object[] objArr3 = iy0VarY3.e;
                int i10 = iy0VarY3.g;
                for (int i11 = 0; i11 < i10; i11++) {
                    ql0 ql0Var3 = (ql0) objArr3[i11];
                    ul0 ul0Var2 = ql0Var3.J;
                    if (ul0Var2.p.l != ql0Var3.v()) {
                        ql0Var2.Q();
                        ql0Var2.D();
                        if (ql0Var3.v() == Integer.MAX_VALUE) {
                            if (ul0Var2.c || bk.K(ql0Var3)) {
                                ct0 ct0Var = ul0Var2.q;
                                ct0Var.getClass();
                                ct0Var.r0(false);
                            }
                            ul0Var2.p.t0();
                        }
                    }
                }
                iy0 iy0VarY4 = ql0Var2.y();
                Object[] objArr4 = iy0VarY4.e;
                int i12 = iy0VarY4.g;
                for (int i13 = 0; i13 < i12; i13++) {
                    rl0 rl0Var = ((ql0) objArr4[i13]).J.p.B;
                    rl0Var.e = rl0Var.d;
                }
                break;
            case 1:
                tu0Var.j.a().e(tu0Var.F);
                break;
            default:
                ul0 ul0Var3 = tu0Var.j;
                c01 c01Var = ul0Var3.a().y;
                if (c01Var == null || (placementScope = c01Var.t) == null) {
                    placementScope = ((h4) tl0.a(ul0Var3.a)).getPlacementScope();
                }
                sa0 sa0Var = tu0Var.K;
                if (sa0Var == null) {
                    c01 c01VarA = ul0Var3.a();
                    long j = tu0Var.L;
                    float f = tu0Var.M;
                    placementScope.getClass();
                    y61.a(placementScope, c01VarA);
                    c01VarA.k0(oh0.c(j, c01VarA.i), f, null);
                } else {
                    c01 c01VarA2 = ul0Var3.a();
                    long j2 = tu0Var.L;
                    float f2 = tu0Var.M;
                    placementScope.getClass();
                    y61.a(placementScope, c01VarA2);
                    c01VarA2.k0(oh0.c(j2, c01VarA2.i), f2, sa0Var);
                }
                break;
        }
        return t32Var;
    }
}
