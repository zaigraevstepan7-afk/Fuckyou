package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bt0 extends sk0 implements ha0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ct0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bt0(ct0 ct0Var, int i) {
        super(0);
        this.f = i;
        this.g = ct0Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        ys0 ys0VarU0;
        int i = this.f;
        sx0 sx0Var = null;
        placementScope = null;
        placementScope = null;
        y61 placementScope = null;
        t32 t32Var = t32.a;
        ct0 ct0Var = this.g;
        switch (i) {
            case 0:
                ul0 ul0Var = ct0Var.j;
                ul0Var.h = 0;
                iy0 iy0VarY = ul0Var.a.y();
                Object[] objArr = iy0VarY.e;
                int i2 = iy0VarY.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    ct0 ct0Var2 = ((ql0) objArr[i3]).J.q;
                    ct0Var2.getClass();
                    ct0Var2.l = ct0Var2.m;
                    ct0Var2.m = Integer.MAX_VALUE;
                    if (ct0Var2.n == ol0.f) {
                        ct0Var2.n = ol0.g;
                    }
                }
                ql0 ql0Var = ul0Var.a;
                ql0 ql0Var2 = ul0Var.a;
                iy0 iy0VarY2 = ql0Var.y();
                Object[] objArr2 = iy0VarY2.e;
                int i4 = iy0VarY2.g;
                for (int i5 = 0; i5 < i4; i5++) {
                    ct0 ct0Var3 = ((ql0) objArr2[i5]).J.q;
                    ct0Var3.getClass();
                    ct0Var3.v.d = false;
                }
                sg0 sg0Var = ct0Var.n().a0;
                if (sg0Var == null) {
                    yc.l("Expected lookahead delegate");
                } else {
                    qx0 qx0Var = (qx0) ql0Var2.n();
                    int i6 = ((iy0) qx0Var.f).g;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ql0 ql0Var3 = (ql0) qx0Var.get(i7);
                        ys0 ys0VarU02 = ql0Var3.I.d.U0();
                        if (ys0VarU02 != null) {
                            if (ys0VarU02.s) {
                                if (sx0Var == null) {
                                    sx0Var = new sx0();
                                }
                                sx0Var.a(ql0Var3);
                            }
                            ys0VarU02.s = sg0Var.s;
                        }
                    }
                    sg0Var.D0().b();
                    qx0 qx0Var2 = (qx0) ql0Var2.n();
                    int i8 = ((iy0) qx0Var2.f).g;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= i8) {
                            iy0 iy0VarY3 = ql0Var2.y();
                            Object[] objArr3 = iy0VarY3.e;
                            int i10 = iy0VarY3.g;
                            for (int i11 = 0; i11 < i10; i11++) {
                                ct0 ct0Var4 = ((ql0) objArr3[i11]).J.q;
                                ct0Var4.getClass();
                                int i12 = ct0Var4.l;
                                int i13 = ct0Var4.m;
                                if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                                    ct0Var4.r0(true);
                                }
                            }
                            iy0 iy0VarY4 = ql0Var2.y();
                            Object[] objArr4 = iy0VarY4.e;
                            int i14 = iy0VarY4.g;
                            for (int i15 = 0; i15 < i14; i15++) {
                                ct0 ct0Var5 = ((ql0) objArr4[i15]).J.q;
                                ct0Var5.getClass();
                                rl0 rl0Var = ct0Var5.v;
                                rl0Var.e = rl0Var.d;
                            }
                        } else {
                            ql0 ql0Var4 = (ql0) qx0Var2.get(i9);
                            boolean z = sx0Var != null && sx0Var.g(ql0Var4) >= 0;
                            ys0 ys0VarU03 = ql0Var4.I.d.U0();
                            if (ys0VarU03 != null) {
                                ys0VarU03.s = z;
                            }
                            i9++;
                        }
                    }
                }
                break;
            case 1:
                ul0 ul0Var2 = ct0Var.j;
                if (bk.K(ul0Var2.a) || ul0Var2.c) {
                    c01 c01Var = ul0Var2.a().y;
                    if (c01Var != null) {
                        placementScope = c01Var.t;
                    }
                } else {
                    c01 c01Var2 = ul0Var2.a().y;
                    if (c01Var2 != null && (ys0VarU0 = c01Var2.U0()) != null) {
                        placementScope = ys0VarU0.t;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((h4) tl0.a(ul0Var2.a)).getPlacementScope();
                }
                ys0 ys0VarU04 = ul0Var2.a().U0();
                ys0VarU04.getClass();
                y61.i(placementScope, ys0VarU04, ct0Var.s);
                break;
            default:
                ys0 ys0VarU05 = ct0Var.j.a().U0();
                ys0VarU05.getClass();
                ys0VarU05.e(ct0Var.C);
                break;
        }
        return t32Var;
    }
}
