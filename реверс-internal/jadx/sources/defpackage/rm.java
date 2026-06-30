package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rm implements sa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ rm(int i) {
        this.e = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x016c  */
    @Override // defpackage.sa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        double dW;
        int i = this.e;
        double d = 98.0d;
        u42 u42Var = u42.g;
        u42 u42Var2 = u42.f;
        double dW2 = 90.0d;
        double d2 = 100.0d;
        g20 g20Var = g20.g;
        switch (i) {
            case 0:
                ((h20) obj).getClass();
                return l91.i(7.0d);
            case 1:
                h20 h20Var = (h20) obj;
                h20Var.getClass();
                return h20Var.f;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                h20 h20Var2 = (h20) obj;
                h20Var2.getClass();
                return Double.valueOf(h20Var2.b == u42Var2 ? 85.0d : l91.w(h20Var2.f, 0.0d, 90.0d));
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((h20) obj).getClass();
                return l91.i(4.5d);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                h20 h20Var3 = (h20) obj;
                h20Var3.getClass();
                return h20Var3.g;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                h20 h20Var4 = (h20) obj;
                h20Var4.getClass();
                u42 u42Var3 = h20Var4.b;
                g12 g12Var = h20Var4.g;
                return Double.valueOf(u42Var3 == u42Var ? l91.w(g12Var, 0.0d, 90.0d) : l91.w(g12Var, 0.0d, 100.0d));
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                h20 h20Var5 = (h20) obj;
                h20Var5.getClass();
                return h20Var5.j == g20Var ? l91.i(6.0d) : l91.i(7.0d);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                ((h20) obj).getClass();
                return l91.i(4.5d);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                h20 h20Var6 = (h20) obj;
                h20Var6.getClass();
                return h20Var6.e;
            case el.a /* 9 */:
                h20 h20Var7 = (h20) obj;
                h20Var7.getClass();
                u42 u42Var4 = h20Var7.b;
                if (u42Var4 == u42Var2) {
                    dW = 85.0d;
                } else {
                    g12 g12Var2 = h20Var7.e;
                    dW = u42Var4 == u42Var ? l91.w(g12Var2, 0.0d, 90.0d) : l91.w(g12Var2, 0.0d, 100.0d);
                }
                return Double.valueOf(dW);
            case el.b /* 10 */:
                ((h20) obj).getClass();
                return l91.i(4.5d);
            case 11:
                h20 h20Var8 = (h20) obj;
                h20Var8.getClass();
                return h20Var8.k;
            case el.c /* 12 */:
                h20 h20Var9 = (h20) obj;
                h20Var9.getClass();
                g12 g12Var3 = h20Var9.k;
                double d3 = g12Var3.a;
                double d4 = g12Var3.b;
                double d5 = 0.0d;
                ld0 ld0VarU = hk.u(d3, d4, 0.0d);
                double d6 = 0.0d;
                while (true) {
                    double d7 = ld0VarU.c;
                    if (d7 < d4 && 0.0d <= d5 && d5 <= d2) {
                        d5 += 1.0d;
                        ld0 ld0VarU2 = hk.u(d3, d4, d5);
                        if (d7 < ld0VarU2.c) {
                            d6 = d5;
                            ld0VarU = ld0VarU2;
                        }
                        d2 = 100.0d;
                    }
                }
                return Double.valueOf(lk.y(d6, 0.0d, 100.0d));
            case 13:
                h20 h20Var10 = (h20) obj;
                h20Var10.getClass();
                return h20Var10.e;
            case 14:
                ((h20) obj).getClass();
                return l91.i(4.5d);
            case 15:
                h20 h20Var11 = (h20) obj;
                h20Var11.getClass();
                g12 g12Var4 = h20Var11.e;
                boolean z = h20Var11.c;
                g20 g20Var2 = h20Var11.j;
                u42 u42Var5 = h20Var11.b;
                if (u42Var5 == u42Var2) {
                    if (g20Var2 == g20Var) {
                        dW2 = z ? 80.0d : 40.0d;
                    }
                } else if (u42Var5 != u42Var) {
                    if (u42Var5 == u42.i) {
                        if (g20Var2 == g20Var) {
                            if (g12Var4.c.b()) {
                                i = 25;
                            } else if (g12Var4.c.a()) {
                                i = 88;
                            }
                            dW2 = l91.w(g12Var4, 0.0d, i);
                        } else {
                            dW2 = l91.w(g12Var4, 0.0d, 100.0d);
                        }
                    } else if (g20Var2 == g20Var) {
                        dW2 = l91.w(g12Var4, 0.0d, g12Var4.c.a() ? 88 : 98);
                    } else {
                        dW2 = l91.w(g12Var4, 0.0d, 100.0d);
                    }
                } else if (g20Var2 != g20Var) {
                    dW2 = l91.w(g12Var4, 0.0d, 90.0d);
                } else if (!z) {
                    dW2 = l91.w(g12Var4, 0.0d, 100.0d);
                }
                return Double.valueOf(dW2);
            case 16:
                h20 h20Var12 = (h20) obj;
                h20Var12.getClass();
                return h20Var12.j == g20Var ? l91.i(4.5d) : l91.i(7.0d);
            case 17:
                h20 h20Var13 = (h20) obj;
                h20Var13.getClass();
                double dX = 30.0d;
                if (h20Var13.j != g20.h) {
                    boolean z2 = h20Var13.c;
                    g12 g12Var5 = h20Var13.k;
                    dX = z2 ? l91.x(g12Var5, 30.0d, 93.0d) : l91.w(g12Var5, 0.0d, 90.0d);
                }
                return Double.valueOf(dX);
            case 18:
                h20 h20Var14 = (h20) obj;
                h20Var14.getClass();
                return h20Var14.h;
            case 19:
                h20 h20Var15 = (h20) obj;
                h20Var15.getClass();
                if (h20Var15.j != g20Var) {
                    d = 0.0d;
                } else if (h20Var15.c) {
                    d = 4.0d;
                } else if (h20Var15.h.c.b()) {
                    d = 99.0d;
                } else if (h20Var15.b == u42.h) {
                    d = 97.0d;
                }
                return Double.valueOf(d);
            case 20:
                h20 h20Var16 = (h20) obj;
                h20Var16.getClass();
                return h20Var16.k;
            case 21:
                h20 h20Var17 = (h20) obj;
                h20Var17.getClass();
                g12 g12Var6 = h20Var17.k;
                return Double.valueOf(h20Var17.j == g20Var ? h20Var17.c ? l91.x(g12Var6, 0.0d, 98.0d) : l91.w(g12Var6, 0.0d, 100.0d) : l91.x(g12Var6, 0.0d, 100.0d));
            case 22:
                h20 h20Var18 = (h20) obj;
                h20Var18.getClass();
                return h20Var18.j == g20Var ? l91.i(4.5d) : l91.i(7.0d);
            case 23:
                h20 h20Var19 = (h20) obj;
                h20Var19.getClass();
                return h20Var19.e;
            case 24:
                h20 h20Var20 = (h20) obj;
                h20Var20.getClass();
                return Double.valueOf(l91.w(h20Var20.e, 0.0d, 100.0d));
            case 25:
                vm vmVar = xi0.v;
                ((h20) obj).getClass();
                return vmVar.m();
            case 26:
                h20 h20Var21 = (h20) obj;
                h20Var21.getClass();
                return h20Var21.j == g20Var ? l91.i(6.0d) : l91.i(7.0d);
            case 27:
                h20 h20Var22 = (h20) obj;
                h20Var22.getClass();
                return h20Var22.e;
            case 28:
                h20 h20Var23 = (h20) obj;
                h20Var23.getClass();
                if (h20Var23.j != g20Var || h20Var23.d <= 0.0d) {
                    return null;
                }
                return l91.i(1.5d);
            default:
                h20 h20Var24 = (h20) obj;
                h20Var24.getClass();
                return h20Var24.h;
        }
    }
}
