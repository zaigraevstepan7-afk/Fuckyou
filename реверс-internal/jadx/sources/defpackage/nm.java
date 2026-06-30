package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nm implements sa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ nm(om omVar) {
        this.e = 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x021a A[PHI: r10
      0x021a: PHI (r10v4 double) = (r10v3 double), (r10v3 double), (r10v5 double) binds: [B:101:0x01c3, B:104:0x01d6, B:182:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e3  */
    @Override // defpackage.sa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        double d;
        double d2;
        double d3;
        double d4;
        int i = this.e;
        u42 u42Var = u42.e;
        double d5 = 30.0d;
        double d6 = 90.0d;
        double d7 = 1.0d;
        g20 g20Var = g20.g;
        switch (i) {
            case 0:
                ((h20) obj).getClass();
                return new ms(3.0d, 4.5d, 7.0d, 7.0d);
            case 1:
                h20 h20Var = (h20) obj;
                h20Var.getClass();
                return h20Var.f;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                h20 h20Var2 = (h20) obj;
                h20Var2.getClass();
                return h20Var2.h;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                h20 h20Var3 = (h20) obj;
                h20Var3.getClass();
                boolean z = h20Var3.b == u42Var;
                boolean z2 = h20Var3.c;
                if (z) {
                    d = z2 ? 10.0d : 100.0d;
                } else if (!z2) {
                }
                return Double.valueOf(d);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                vm vmVar = xi0.v;
                ((h20) obj).getClass();
                return vmVar.s();
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ((h20) obj).getClass();
                return new ms(4.5d, 7.0d, 11.0d, 21.0d);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                h20 h20Var4 = (h20) obj;
                h20Var4.getClass();
                return h20Var4.h;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                h20 h20Var5 = (h20) obj;
                h20Var5.getClass();
                double d8 = h20Var5.d;
                if (h20Var5.c) {
                    if (d8 <= -1.0d) {
                        d5 = 22.0d;
                    } else {
                        if (d8 < 0.0d) {
                            double d9 = (d8 - (-1.0d)) / 1.0d;
                            d = (1.0d - d9) * 22.0d;
                            d2 = d9 * 22.0d;
                        } else {
                            d6 = 26.0d;
                            if (d8 < 0.5d) {
                                d3 = (d8 - 0.0d) / 0.5d;
                                d = (1.0d - d3) * 22.0d;
                                d2 = d3 * d6;
                            } else if (d8 < 1.0d) {
                                double d10 = (d8 - 0.5d) / 0.5d;
                                d = (1.0d - d10) * 26.0d;
                                d2 = d10 * 30.0d;
                            }
                        }
                        d5 = d2 + d;
                    }
                } else if (d8 <= -1.0d) {
                    d5 = 90.0d;
                } else if (d8 < 0.0d) {
                    d3 = (d8 - (-1.0d)) / 1.0d;
                    d = (1.0d - d3) * 90.0d;
                    d2 = d3 * d6;
                    d5 = d2 + d;
                } else {
                    if (d8 < 0.5d) {
                        double d11 = (d8 - 0.0d) / 0.5d;
                        d = (1.0d - d11) * 90.0d;
                        d2 = d11 * 84.0d;
                    } else if (d8 < 1.0d) {
                        double d12 = (d8 - 0.5d) / 0.5d;
                        d = (1.0d - d12) * 84.0d;
                        d2 = d12 * 80.0d;
                    } else {
                        d5 = 80.0d;
                    }
                    d5 = d2 + d;
                }
                return Double.valueOf(d5);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                h20 h20Var6 = (h20) obj;
                h20Var6.getClass();
                return h20Var6.f;
            case el.a /* 9 */:
                h20 h20Var7 = (h20) obj;
                h20Var7.getClass();
                boolean z3 = h20Var7.c;
                double d13 = z3 ? 30.0d : 90.0d;
                if (h20Var7.b == u42Var) {
                    if (!z3) {
                        d5 = 85.0d;
                    }
                } else if (om.n(h20Var7)) {
                    g12 g12Var = h20Var7.f;
                    double d14 = g12Var.a;
                    double d15 = g12Var.b;
                    ld0 ld0VarU = hk.u(d14, d15, d13);
                    double d16 = ld0VarU.c;
                    if (d16 < d15) {
                        double dMax = d16;
                        while (true) {
                            double d17 = ld0VarU.c;
                            if (d17 < d15) {
                                d4 = (!z3 ? -1.0d : d7) + d13;
                                ld0 ld0VarU2 = hk.u(d14, d15, d4);
                                double d18 = d7;
                                double d19 = ld0VarU2.c;
                                if (dMax <= d19) {
                                    double d20 = d19 - d15;
                                    if (Math.abs(d20) >= 0.4d) {
                                        if (Math.abs(d20) < Math.abs(d17 - d15)) {
                                            ld0VarU = ld0VarU2;
                                        }
                                        dMax = Math.max(dMax, d19);
                                        d13 = d4;
                                        d7 = d18;
                                    }
                                }
                            }
                        }
                        d5 = d4;
                    }
                } else {
                    d5 = d13;
                }
                return Double.valueOf(d5);
            case el.b /* 10 */:
                ((h20) obj).getClass();
                return new ms(1.0d, 1.0d, 3.0d, 4.5d);
            case 11:
                h20 h20Var8 = (h20) obj;
                h20Var8.getClass();
                return h20Var8.h;
            case el.c /* 12 */:
                h20 h20Var9 = (h20) obj;
                h20Var9.getClass();
                return Double.valueOf(h20Var9.c ? 90.0d : 20.0d);
            case 13:
                h20 h20Var10 = (h20) obj;
                h20Var10.getClass();
                return h20Var10.k;
            case 14:
                h20 h20Var11 = (h20) obj;
                h20Var11.getClass();
                if (h20Var11.j != g20Var || h20Var11.d <= 0.0d) {
                    return null;
                }
                return l91.i(1.5d);
            case 15:
                h20 h20Var12 = (h20) obj;
                h20Var12.getClass();
                return h20Var12.g;
            case 16:
                vm vmVar2 = xi0.v;
                h20 h20Var13 = (h20) obj;
                h20Var13.getClass();
                return h20Var13.j == g20Var ? vmVar2.y() : vmVar2.J();
            case 17:
                h20 h20Var14 = (h20) obj;
                h20Var14.getClass();
                return h20Var14.j == g20Var ? l91.i(6.0d) : l91.i(7.0d);
            case 18:
                h20 h20Var15 = (h20) obj;
                h20Var15.getClass();
                return h20Var15.e;
            case 19:
                vm vmVar3 = xi0.v;
                ((h20) obj).getClass();
                return vmVar3.p();
            case 20:
                h20 h20Var16 = (h20) obj;
                h20Var16.getClass();
                return h20Var16.j == g20Var ? l91.i(6.0d) : l91.i(7.0d);
            case 21:
                h20 h20Var17 = (h20) obj;
                h20Var17.getClass();
                return h20Var17.e;
            case 22:
                vm vmVar4 = xi0.v;
                ((h20) obj).getClass();
                return vmVar4.r();
            case 23:
                ((h20) obj).getClass();
                return l91.i(4.5d);
            case 24:
                h20 h20Var18 = (h20) obj;
                h20Var18.getClass();
                return h20Var18.g;
            case 25:
                h20 h20Var19 = (h20) obj;
                h20Var19.getClass();
                return h20Var19.h;
            case 26:
                h20 h20Var20 = (h20) obj;
                h20Var20.getClass();
                if (h20Var20.j != g20Var) {
                    return Double.valueOf(1.0d);
                }
                u42 u42Var2 = h20Var20.b;
                if (u42Var2 == u42.f) {
                    d7 = 2.2d;
                } else if (u42Var2 == u42.g) {
                    d7 = 1.7d;
                } else if (u42Var2 == u42.i) {
                    d7 = h20Var20.h.c.b() ? h20Var20.c ? 3.0d : 2.3d : 1.6d;
                }
                return Double.valueOf(d7);
            case 27:
                vm vmVar5 = xi0.v;
                h20 h20Var21 = (h20) obj;
                h20Var21.getClass();
                return h20Var21.j == g20Var ? h20Var21.c ? vmVar5.w() : vmVar5.x() : vmVar5.H();
            case 28:
                h20 h20Var22 = (h20) obj;
                h20Var22.getClass();
                return h20Var22.j == g20Var ? h20Var22.c ? l91.i(6.0d) : l91.i(4.5d) : l91.i(7.0d);
            default:
                h20 h20Var23 = (h20) obj;
                h20Var23.getClass();
                return h20Var23.g;
        }
    }

    public /* synthetic */ nm(int i) {
        this.e = i;
    }
}
