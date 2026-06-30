package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class y3 extends sk0 implements ha0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(int i, Object obj, Object obj2) {
        super(0);
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [sv0] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [sv0] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [iy0] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [iy0] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v18 */
    @Override // defpackage.ha0
    public final Object a() {
        rl1 rl1Var;
        ql0 ql0Var;
        int i = this.f;
        t32 t32Var = t32.a;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                break;
            case 1:
                m4 m4Var = (m4) obj;
                ej1 ej1Var = (ej1) obj2;
                wi1 wi1Var = ej1Var.i;
                wi1 wi1Var2 = ej1Var.j;
                Float f = ej1Var.g;
                Float f2 = ej1Var.h;
                float fFloatValue = (wi1Var == null || f == null) ? 0.0f : ((Number) wi1Var.a.a()).floatValue() - f.floatValue();
                float fFloatValue2 = (wi1Var2 == null || f2 == null) ? 0.0f : ((Number) wi1Var2.a.a()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iU = m4Var.u(ej1Var.e);
                    tl1 tl1Var = (tl1) m4Var.m().b(m4Var.o);
                    if (tl1Var != null) {
                        try {
                            m1 m1Var = m4Var.q;
                            if (m1Var != null) {
                                m1Var.a.setBoundsInScreen(m4Var.f(tl1Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    tl1 tl1Var2 = (tl1) m4Var.m().b(m4Var.p);
                    if (tl1Var2 != null) {
                        try {
                            m1 m1Var2 = m4Var.r;
                            if (m1Var2 != null) {
                                m1Var2.a.setBoundsInScreen(m4Var.f(tl1Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    m4Var.h.invalidate();
                    tl1 tl1Var3 = (tl1) m4Var.m().b(iU);
                    if (tl1Var3 != null && (rl1Var = tl1Var3.a) != null && (ql0Var = rl1Var.c) != null) {
                        if (wi1Var != null) {
                            m4Var.t.i(iU, wi1Var);
                        }
                        if (wi1Var2 != null) {
                            m4Var.u.i(iU, wi1Var2);
                        }
                        m4Var.q(ql0Var);
                    }
                }
                if (wi1Var != null) {
                    ej1Var.g = (Float) wi1Var.a.a();
                }
                if (wi1Var2 != null) {
                    ej1Var.h = (Float) wi1Var2.a.a();
                }
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ha0 ha0Var = (ha0) obj2;
                if (ha0Var == null || (r10 = (pc1) ha0Var.a()) == null) {
                    c01 c01Var = (c01) obj;
                    if (!c01Var.W0().r) {
                        c01Var = null;
                    }
                    if (c01Var != null) {
                    }
                }
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((ki) obj2).u.i((li) obj);
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ((zc1) obj2).e = ((w80) obj).N0();
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ((qd0) obj2).d((sv0) obj);
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                xz0 xz0Var = ((ql0) obj2).I;
                zc1 zc1Var = (zc1) obj;
                if ((xz0Var.f.h & 8) != 0) {
                    for (sv0 sv0Var = xz0Var.e; sv0Var != null; sv0Var = sv0Var.i) {
                        if ((sv0Var.g & 8) != 0) {
                            ?? K = sv0Var;
                            ?? iy0Var = 0;
                            while (K != 0) {
                                if (K instanceof pl1) {
                                    pl1 pl1Var = (pl1) K;
                                    if (pl1Var.i0()) {
                                        nl1 nl1Var = new nl1();
                                        zc1Var.e = nl1Var;
                                        nl1Var.h = true;
                                    }
                                    if (pl1Var.k0()) {
                                        ((nl1) zc1Var.e).g = true;
                                    }
                                    pl1Var.g0((am1) zc1Var.e);
                                } else if ((K.g & 8) != 0 && (K instanceof yw)) {
                                    sv0 sv0Var2 = ((yw) K).t;
                                    int i2 = 0;
                                    K = K;
                                    iy0Var = iy0Var;
                                    while (sv0Var2 != null) {
                                        if ((sv0Var2.g & 8) != 0) {
                                            i2++;
                                            iy0Var = iy0Var;
                                            if (i2 == 1) {
                                                K = sv0Var2;
                                            } else {
                                                if (iy0Var == 0) {
                                                    iy0Var = new iy0(new sv0[16]);
                                                }
                                                if (K != 0) {
                                                    iy0Var.b(K);
                                                    K = 0;
                                                }
                                                iy0Var.b(sv0Var2);
                                            }
                                        }
                                        sv0Var2 = sv0Var2.j;
                                        K = K;
                                        iy0Var = iy0Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                K = bl.k(iy0Var);
                            }
                        }
                    }
                }
                break;
            default:
                ue1 ue1Var = c01.U;
                ((sa0) obj2).i(ue1Var);
                c01 c01Var2 = (c01) obj;
                boolean zO = xi0.o(c01Var2.L, ue1Var.s);
                boolean z = c01Var2.M;
                boolean z2 = ue1Var.t;
                boolean z3 = z != z2;
                if (!zO || z3) {
                    c01Var2.L = ue1Var.s;
                    c01Var2.M = z2;
                    if (c01Var2.N && (z3 || (z2 && !zO))) {
                        c01Var2.w.H();
                    }
                }
                c01Var2.N = true;
                ue1Var.A = ue1Var.s.a(ue1Var.u, ue1Var.x, ue1Var.w);
                break;
        }
        return t32Var;
    }
}
