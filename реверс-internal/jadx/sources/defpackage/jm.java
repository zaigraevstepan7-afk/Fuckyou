package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jm implements sa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ jm(int i) {
        this.e = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    @Override // defpackage.sa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        boolean z;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        int i = this.e;
        u42 u42Var = u42.e;
        switch (i) {
            case 0:
                h20 h20Var = (h20) obj;
                h20Var.getClass();
                return h20Var.e;
            case 1:
                h20 h20Var2 = (h20) obj;
                h20Var2.getClass();
                z = h20Var2.b == u42Var;
                boolean z2 = h20Var2.c;
                return Double.valueOf(z ? z2 ? 100.0d : 0.0d : z2 ? 80.0d : 40.0d);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((h20) obj).getClass();
                return new ms(3.0d, 4.5d, 7.0d, 7.0d);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                h20 h20Var3 = (h20) obj;
                h20Var3.getClass();
                return h20Var3.h;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                h20 h20Var4 = (h20) obj;
                h20Var4.getClass();
                double d9 = h20Var4.d;
                if (!h20Var4.c) {
                    d = 96.0d;
                    if (d9 > -1.0d) {
                        if (d9 < 0.0d) {
                            d3 = (d9 - (-1.0d)) / 1.0d;
                        } else if (d9 < 0.5d) {
                            d3 = (d9 - 0.0d) / 0.5d;
                        } else {
                            d = 95.0d;
                            if (d9 < 1.0d) {
                                d2 = d9 - 0.5d;
                                double d10 = d2 / 0.5d;
                                d4 = (1.0d - d10) * d;
                                d5 = d10 * d;
                            } else {
                                d = 95.0d;
                            }
                        }
                        d4 = (1.0d - d3) * d;
                        d5 = d3 * d;
                    }
                    return Double.valueOf(d);
                }
                if (d9 > -1.0d) {
                    if (d9 >= 0.0d) {
                        d = 11.0d;
                        if (d9 < 0.5d) {
                            d2 = d9 - 0.0d;
                            double d102 = d2 / 0.5d;
                            d4 = (1.0d - d102) * d;
                            d5 = d102 * d;
                        } else {
                            d = 12.0d;
                            if (d9 < 1.0d) {
                                d3 = (d9 - 0.5d) / 0.5d;
                                d4 = (1.0d - d3) * 11.0d;
                                d5 = d3 * d;
                            }
                        }
                    }
                    d3 = (d9 - (-1.0d)) / 1.0d;
                    d4 = (1.0d - d3) * d;
                    d5 = d3 * d;
                }
                return Double.valueOf(d);
                d = d5 + d4;
                return Double.valueOf(d);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                h20 h20Var5 = (h20) obj;
                h20Var5.getClass();
                return h20Var5.h;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                h20 h20Var6 = (h20) obj;
                h20Var6.getClass();
                return Double.valueOf(h20Var6.c ? 6.0d : 98.0d);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                h20 h20Var7 = (h20) obj;
                h20Var7.getClass();
                return h20Var7.e;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                h20 h20Var8 = (h20) obj;
                h20Var8.getClass();
                return Double.valueOf(h20Var8.b == u42Var ? 40.0d : 90.0d);
            case el.a /* 9 */:
                ((h20) obj).getClass();
                return new ms(1.0d, 1.0d, 3.0d, 4.5d);
            case el.b /* 10 */:
                ((h20) obj).getClass();
                return new ms(1.0d, 1.0d, 3.0d, 4.5d);
            case 11:
                h20 h20Var9 = (h20) obj;
                h20Var9.getClass();
                return h20Var9.g;
            case el.c /* 12 */:
                h20 h20Var10 = (h20) obj;
                h20Var10.getClass();
                return Double.valueOf(h20Var10.b == u42Var ? 90.0d : 30.0d);
            case 13:
                vm vmVar = xi0.v;
                ((h20) obj).getClass();
                return vmVar.B();
            case 14:
                vm vmVar2 = xi0.v;
                ((h20) obj).getClass();
                return vmVar2.A();
            case 15:
                ((h20) obj).getClass();
                return new ms(3.0d, 4.5d, 7.0d, 11.0d);
            case 16:
                h20 h20Var11 = (h20) obj;
                h20Var11.getClass();
                return h20Var11.g;
            case 17:
                vm vmVar3 = xi0.v;
                h20 h20Var12 = (h20) obj;
                h20Var12.getClass();
                boolean z3 = h20Var12.c;
                if (h20Var12.b == u42Var) {
                    dY = z3 ? 0.0d : 100.0d;
                } else if (om.n(h20Var12)) {
                    dY = bk.y(((Number) vmVar3.z().c.i(h20Var12)).doubleValue(), 4.5d);
                } else if (z3) {
                    dY = 90.0d;
                }
                return Double.valueOf(dY);
            case 18:
                vm vmVar4 = xi0.v;
                ((h20) obj).getClass();
                return vmVar4.z();
            case 19:
                ((h20) obj).getClass();
                return new ms(3.0d, 4.5d, 7.0d, 11.0d);
            case 20:
                h20 h20Var13 = (h20) obj;
                h20Var13.getClass();
                return h20Var13.k;
            case 21:
                h20 h20Var14 = (h20) obj;
                h20Var14.getClass();
                z = h20Var14.b == u42Var;
                boolean z4 = h20Var14.c;
                if (z) {
                    dY = z4 ? 90.0d : 10.0d;
                } else if (z4) {
                }
                return Double.valueOf(dY);
            case 22:
                vm vmVar5 = xi0.v;
                ((h20) obj).getClass();
                return vmVar5.c();
            case 23:
                ((h20) obj).getClass();
                return new ms(3.0d, 4.5d, 7.0d, 11.0d);
            case 24:
                h20 h20Var15 = (h20) obj;
                h20Var15.getClass();
                return h20Var15.h;
            case 25:
                h20 h20Var16 = (h20) obj;
                h20Var16.getClass();
                if (h20Var16.c) {
                    double d11 = h20Var16.d;
                    d = 24.0d;
                    if (d11 > -1.0d) {
                        if (d11 < 0.0d) {
                            d6 = (d11 - (-1.0d)) / 1.0d;
                            d7 = (1.0d - d6) * 24.0d;
                        } else if (d11 < 0.5d) {
                            double d12 = (d11 - 0.0d) / 0.5d;
                            d7 = (1.0d - d12) * 24.0d;
                            d8 = d12 * 29.0d;
                            d = d8 + d7;
                        } else {
                            d = 34.0d;
                            if (d11 < 1.0d) {
                                d6 = (d11 - 0.5d) / 0.5d;
                                d7 = (1.0d - d6) * 29.0d;
                            }
                        }
                        d8 = d6 * d;
                        d = d8 + d7;
                    }
                }
                return Double.valueOf(d);
            case 26:
                h20 h20Var17 = (h20) obj;
                h20Var17.getClass();
                return h20Var17.g;
            case 27:
                h20 h20Var18 = (h20) obj;
                h20Var18.getClass();
                return Double.valueOf(h20Var18.b == u42Var ? 100.0d : 10.0d);
            case 28:
                vm vmVar6 = xi0.v;
                ((h20) obj).getClass();
                return vmVar6.B();
            default:
                h20 h20Var19 = (h20) obj;
                h20Var19.getClass();
                return h20Var19.f;
        }
    }
}
