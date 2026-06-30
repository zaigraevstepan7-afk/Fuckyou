package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class km implements sa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ km(om omVar) {
        this.e = 16;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        int i = this.e;
        double d7 = 90.0d;
        u42 u42Var = u42.e;
        double d8 = 100.0d;
        switch (i) {
            case 0:
                vm vmVar = xi0.v;
                ((h20) obj).getClass();
                return vmVar.A();
            case 1:
                ((h20) obj).getClass();
                return new ms(4.5d, 7.0d, 11.0d, 21.0d);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                h20 h20Var = (h20) obj;
                h20Var.getClass();
                return h20Var.g;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                h20 h20Var2 = (h20) obj;
                h20Var2.getClass();
                boolean z = h20Var2.b == u42Var;
                boolean z2 = h20Var2.c;
                if (!z) {
                    d = z2 ? 20.0d : 100.0d;
                } else if (!z2) {
                    d = 90.0d;
                }
                return Double.valueOf(d);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                vm vmVar2 = xi0.v;
                ((h20) obj).getClass();
                return vmVar2.y();
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ((h20) obj).getClass();
                return new ms(4.5d, 7.0d, 11.0d, 21.0d);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                h20 h20Var3 = (h20) obj;
                h20Var3.getClass();
                return h20Var3.i;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                h20 h20Var4 = (h20) obj;
                h20Var4.getClass();
                return Double.valueOf(h20Var4.c ? 80.0d : 30.0d);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                ((h20) obj).getClass();
                return new ms(3.0d, 4.5d, 7.0d, 11.0d);
            case el.a /* 9 */:
                h20 h20Var5 = (h20) obj;
                h20Var5.getClass();
                return h20Var5.e;
            case el.b /* 10 */:
                h20 h20Var6 = (h20) obj;
                h20Var6.getClass();
                return Double.valueOf(h20Var6.c ? 80.0d : 40.0d);
            case 11:
                h20 h20Var7 = (h20) obj;
                h20Var7.getClass();
                return Double.valueOf(h20Var7.b == u42Var ? 100.0d : 10.0d);
            case el.c /* 12 */:
                vm vmVar3 = xi0.v;
                ((h20) obj).getClass();
                return vmVar3.r();
            case 13:
                vm vmVar4 = xi0.v;
                ((h20) obj).getClass();
                return vmVar4.q();
            case 14:
                ((h20) obj).getClass();
                return new ms(4.5d, 7.0d, 11.0d, 21.0d);
            case 15:
                h20 h20Var8 = (h20) obj;
                h20Var8.getClass();
                return h20Var8.g;
            case 16:
                h20 h20Var9 = (h20) obj;
                h20Var9.getClass();
                boolean z3 = h20Var9.c;
                if (h20Var9.b == u42Var) {
                    d7 = z3 ? 60.0d : 49.0d;
                } else if (om.n(h20Var9)) {
                    g12 g12Var = h20Var9.g;
                    d7 = xk.t(hk.u(g12Var.a, g12Var.b, h20Var9.a.d)).d;
                } else if (z3) {
                    d7 = 30.0d;
                }
                return Double.valueOf(d7);
            case 17:
                ((h20) obj).getClass();
                return new ms(1.0d, 1.0d, 3.0d, 4.5d);
            case 18:
                ((h20) obj).getClass();
                return new ms(3.0d, 4.5d, 7.0d, 7.0d);
            case 19:
                h20 h20Var10 = (h20) obj;
                h20Var10.getClass();
                return h20Var10.i;
            case 20:
                h20 h20Var11 = (h20) obj;
                h20Var11.getClass();
                return Double.valueOf(h20Var11.c ? 30.0d : 80.0d);
            case 21:
                ((h20) obj).getClass();
                return Double.valueOf(0.0d);
            case 22:
                ((h20) obj).getClass();
                return new ms(1.0d, 1.0d, 3.0d, 4.5d);
            case 23:
                h20 h20Var12 = (h20) obj;
                h20Var12.getClass();
                return h20Var12.h;
            case 24:
                h20 h20Var13 = (h20) obj;
                h20Var13.getClass();
                if (h20Var13.c) {
                    double d9 = h20Var13.d;
                    d8 = 4.0d;
                    if (d9 > -1.0d) {
                        if (d9 < 0.0d) {
                            double d10 = (d9 - (-1.0d)) / 1.0d;
                            d = (1.0d - d10) * 4.0d;
                            d2 = d10 * 4.0d;
                        } else if (d9 < 0.5d) {
                            double d11 = (d9 - 0.0d) / 0.5d;
                            d = (1.0d - d11) * 4.0d;
                            d2 = d11 * 2.0d;
                        } else if (d9 < 1.0d) {
                            double d12 = (d9 - 0.5d) / 0.5d;
                            d = (1.0d - d12) * 2.0d;
                            d2 = d12 * 0.0d;
                        } else {
                            d8 = 0.0d;
                        }
                        d8 = d2 + d;
                    }
                }
                return Double.valueOf(d8);
            case 25:
                h20 h20Var14 = (h20) obj;
                h20Var14.getClass();
                return h20Var14.h;
            case 26:
                h20 h20Var15 = (h20) obj;
                h20Var15.getClass();
                if (h20Var15.c) {
                    d6 = 6.0d;
                } else {
                    double d13 = h20Var15.d;
                    double d14 = 87.0d;
                    if (d13 > -1.0d) {
                        if (d13 < 0.0d) {
                            d3 = (d13 - (-1.0d)) / 1.0d;
                            d4 = (1.0d - d3) * 87.0d;
                        } else if (d13 < 0.5d) {
                            double d15 = (d13 - 0.0d) / 0.5d;
                            d4 = (1.0d - d15) * 87.0d;
                            d5 = d15 * 80.0d;
                            d6 = d5 + d4;
                        } else {
                            d14 = 75.0d;
                            if (d13 < 1.0d) {
                                d3 = (d13 - 0.5d) / 0.5d;
                                d4 = (1.0d - d3) * 80.0d;
                            }
                            d6 = d14;
                        }
                        d5 = d3 * d14;
                        d6 = d5 + d4;
                    } else {
                        d6 = d14;
                    }
                }
                return Double.valueOf(d6);
            case 27:
                h20 h20Var16 = (h20) obj;
                h20Var16.getClass();
                return h20Var16.k;
            case 28:
                h20 h20Var17 = (h20) obj;
                h20Var17.getClass();
                return Double.valueOf(h20Var17.c ? 80.0d : 40.0d);
            default:
                ((h20) obj).getClass();
                return new ms(3.0d, 4.5d, 7.0d, 7.0d);
        }
    }

    public /* synthetic */ km(int i) {
        this.e = i;
    }
}
