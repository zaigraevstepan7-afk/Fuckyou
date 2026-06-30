package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lm implements sa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ lm(int i) {
        this.e = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r1 < 1.0d) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        r1 = (r1 - 0.5d) / 0.5d;
        r5 = (1.0d - r1) * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        if (r1 < 1.0d) goto L27;
     */
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
        int i = this.e;
        u42 u42Var = u42.e;
        double d5 = 25.0d;
        switch (i) {
            case 0:
                h20 h20Var = (h20) obj;
                h20Var.getClass();
                return h20Var.f;
            case 1:
                h20 h20Var2 = (h20) obj;
                h20Var2.getClass();
                return h20Var2.h;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((h20) obj).getClass();
                return Double.valueOf(10.0d);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                vm vmVar = xi0.v;
                ((h20) obj).getClass();
                return vmVar.v();
            case t91.LONG_FIELD_NUMBER /* 4 */:
                vm vmVar2 = xi0.v;
                ((h20) obj).getClass();
                return vmVar2.u();
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ((h20) obj).getClass();
                return new ms(4.5d, 7.0d, 11.0d, 21.0d);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                h20 h20Var3 = (h20) obj;
                h20Var3.getClass();
                return h20Var3.k;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                h20 h20Var4 = (h20) obj;
                h20Var4.getClass();
                return Double.valueOf(h20Var4.c ? 20.0d : 100.0d);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                vm vmVar3 = xi0.v;
                ((h20) obj).getClass();
                return vmVar3.b();
            case el.a /* 9 */:
                ((h20) obj).getClass();
                return new ms(4.5d, 7.0d, 11.0d, 21.0d);
            case el.b /* 10 */:
                h20 h20Var5 = (h20) obj;
                h20Var5.getClass();
                return h20Var5.g;
            case 11:
                h20 h20Var6 = (h20) obj;
                h20Var6.getClass();
                z = h20Var6.b == u42Var;
                boolean z2 = h20Var6.c;
                if (!z) {
                    d5 = z2 ? 80.0d : 40.0d;
                } else if (z2) {
                    d5 = 90.0d;
                }
                return Double.valueOf(d5);
            case el.c /* 12 */:
                h20 h20Var7 = (h20) obj;
                h20Var7.getClass();
                return Double.valueOf(h20Var7.c ? 6.0d : 98.0d);
            case 13:
                ((h20) obj).getClass();
                return new ms(3.0d, 4.5d, 7.0d, 7.0d);
            case 14:
                h20 h20Var8 = (h20) obj;
                h20Var8.getClass();
                return h20Var8.k;
            case 15:
                h20 h20Var9 = (h20) obj;
                h20Var9.getClass();
                return Double.valueOf(h20Var9.c ? 30.0d : 90.0d);
            case 16:
                ((h20) obj).getClass();
                return new ms(1.0d, 1.0d, 3.0d, 4.5d);
            case 17:
                h20 h20Var10 = (h20) obj;
                h20Var10.getClass();
                return h20Var10.h;
            case 18:
                h20 h20Var11 = (h20) obj;
                h20Var11.getClass();
                return Double.valueOf(h20Var11.c ? 90.0d : 10.0d);
            case 19:
                vm vmVar4 = xi0.v;
                ((h20) obj).getClass();
                return vmVar4.a();
            case 20:
                ((h20) obj).getClass();
                return new ms(3.0d, 3.0d, 4.5d, 7.0d);
            case 21:
                h20 h20Var12 = (h20) obj;
                h20Var12.getClass();
                return h20Var12.i;
            case 22:
                h20 h20Var13 = (h20) obj;
                h20Var13.getClass();
                return h20Var13.e;
            case 23:
                vm vmVar5 = xi0.v;
                h20 h20Var14 = (h20) obj;
                h20Var14.getClass();
                if (om.n(h20Var14)) {
                    dY = bk.y(((Number) vmVar5.p().c.i(h20Var14)).doubleValue(), 4.5d);
                } else {
                    z = h20Var14.b == u42Var;
                    boolean z3 = h20Var14.c;
                    if (z) {
                        dY = z3 ? 0.0d : 100.0d;
                    } else if (z3) {
                        dY = 90.0d;
                    }
                }
                return Double.valueOf(dY);
            case 24:
                vm vmVar6 = xi0.v;
                ((h20) obj).getClass();
                return vmVar6.p();
            case 25:
                ((h20) obj).getClass();
                return new ms(3.0d, 4.5d, 7.0d, 11.0d);
            case 26:
                h20 h20Var15 = (h20) obj;
                h20Var15.getClass();
                return h20Var15.h;
            case 27:
                h20 h20Var16 = (h20) obj;
                h20Var16.getClass();
                double d6 = h20Var16.d;
                if (h20Var16.c) {
                    if (d6 <= -1.0d) {
                        d5 = 17.0d;
                    } else if (d6 >= 0.0d) {
                        d = 21.0d;
                        if (d6 < 0.5d) {
                            d2 = (d6 - 0.0d) / 0.5d;
                            d3 = (1.0d - d2) * 17.0d;
                            d4 = d2 * d;
                            d5 = d4 + d3;
                        }
                    } else {
                        double d7 = (d6 - (-1.0d)) / 1.0d;
                        d3 = (1.0d - d7) * 17.0d;
                        d4 = d7 * 17.0d;
                        d5 = d4 + d3;
                    }
                    break;
                } else {
                    d5 = 92.0d;
                    if (d6 > -1.0d) {
                        if (d6 >= 0.0d) {
                            d = 88.0d;
                            if (d6 >= 0.5d) {
                                d5 = 85.0d;
                            } else {
                                d2 = (d6 - 0.0d) / 0.5d;
                                d3 = (1.0d - d2) * 92.0d;
                                d4 = d2 * d;
                                d5 = d4 + d3;
                            }
                        } else {
                            double d8 = (d6 - (-1.0d)) / 1.0d;
                            d3 = (1.0d - d8) * 92.0d;
                            d4 = d8 * d5;
                            d5 = d4 + d3;
                        }
                    }
                    break;
                }
                return Double.valueOf(d5);
            case 28:
                h20 h20Var17 = (h20) obj;
                h20Var17.getClass();
                return h20Var17.h;
            default:
                h20 h20Var18 = (h20) obj;
                h20Var18.getClass();
                return Double.valueOf(h20Var18.c ? 20.0d : 95.0d);
        }
    }
}
