package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qm implements sa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ qm(int i) {
        this.e = i;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        double dW;
        int i = this.e;
        g20 g20Var = g20.h;
        double d = 98.0d;
        u42 u42Var = u42.f;
        u42 u42Var2 = u42.i;
        u42 u42Var3 = u42.g;
        u42 u42Var4 = u42.h;
        g20 g20Var2 = g20.g;
        switch (i) {
            case 0:
                h20 h20Var = (h20) obj;
                h20Var.getClass();
                return h20Var.e;
            case 1:
                vm vmVar = xi0.v;
                h20 h20Var2 = (h20) obj;
                h20Var2.getClass();
                return h20Var2.j == g20Var2 ? vmVar.o() : vmVar.E();
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                h20 h20Var3 = (h20) obj;
                h20Var3.getClass();
                return h20Var3.j == g20Var2 ? l91.i(6.0d) : l91.i(7.0d);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                vm vmVar2 = xi0.v;
                ((h20) obj).getClass();
                return vmVar2.B();
            case t91.LONG_FIELD_NUMBER /* 4 */:
                vm vmVar3 = xi0.v;
                h20 h20Var4 = (h20) obj;
                h20Var4.getClass();
                return Double.valueOf(h20Var4.j != g20Var ? vmVar3.D().a(h20Var4) : 100.0d);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                h20 h20Var5 = (h20) obj;
                h20Var5.getClass();
                return h20Var5.g;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                h20 h20Var6 = (h20) obj;
                h20Var6.getClass();
                g12 g12Var = h20Var6.g;
                boolean z = h20Var6.c;
                g20 g20Var3 = h20Var6.j;
                u42 u42Var5 = h20Var6.b;
                if (g20Var3 == g20Var) {
                    dW = u42Var5 == u42Var3 ? l91.w(g12Var, 0.0d, 90.0d) : l91.w(g12Var, 0.0d, 100.0d);
                } else if (u42Var5 == u42Var2 || u42Var5 == u42Var4) {
                    dW = l91.w(g12Var, 0.0d, g12Var.c.a() ? 88 : z ? 98 : 100);
                } else {
                    dW = z ? l91.w(g12Var, 0.0d, 98.0d) : l91.w(g12Var, 0.0d, 100.0d);
                }
                return Double.valueOf(dW);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                h20 h20Var7 = (h20) obj;
                h20Var7.getClass();
                return h20Var7.j == g20Var2 ? l91.i(4.5d) : l91.i(7.0d);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                h20 h20Var8 = (h20) obj;
                h20Var8.getClass();
                return h20Var8.f;
            case el.a /* 9 */:
                h20 h20Var9 = (h20) obj;
                h20Var9.getClass();
                return h20Var9.e;
            case el.b /* 10 */:
                ((h20) obj).getClass();
                return l91.i(7.0d);
            case 11:
                h20 h20Var10 = (h20) obj;
                h20Var10.getClass();
                return h20Var10.f;
            case el.c /* 12 */:
                h20 h20Var11 = (h20) obj;
                h20Var11.getClass();
                if (h20Var11.j != g20Var2 || h20Var11.d <= 0.0d) {
                    return null;
                }
                return l91.i(1.5d);
            case 13:
                h20 h20Var12 = (h20) obj;
                h20Var12.getClass();
                return h20Var12.k;
            case 14:
                vm vmVar4 = xi0.v;
                h20 h20Var13 = (h20) obj;
                h20Var13.getClass();
                return h20Var13.j == g20Var2 ? vmVar4.b() : vmVar4.C();
            case 15:
                h20 h20Var14 = (h20) obj;
                h20Var14.getClass();
                return h20Var14.j == g20Var2 ? l91.i(6.0d) : l91.i(7.0d);
            case 16:
                h20 h20Var15 = (h20) obj;
                h20Var15.getClass();
                return h20Var15.h;
            case 17:
                h20 h20Var16 = (h20) obj;
                h20Var16.getClass();
                return h20Var16.f;
            case 18:
                h20 h20Var17 = (h20) obj;
                h20Var17.getClass();
                if (h20Var17.j != g20Var2) {
                    return Double.valueOf(1.0d);
                }
                u42 u42Var6 = h20Var17.b;
                return Double.valueOf(u42Var6 == u42Var ? 2.2d : u42Var6 == u42Var3 ? 1.7d : u42Var6 == u42Var2 ? h20Var17.h.c.b() ? h20Var17.c ? 3.0d : 2.3d : 1.6d : u42Var6 == u42Var4 ? 1.29d : 1.0d);
            case 19:
                vm vmVar5 = xi0.v;
                h20 h20Var18 = (h20) obj;
                h20Var18.getClass();
                return h20Var18.j == g20Var2 ? h20Var18.c ? vmVar5.w() : vmVar5.x() : vmVar5.H();
            case 20:
                h20 h20Var19 = (h20) obj;
                h20Var19.getClass();
                return h20Var19.j == g20Var2 ? l91.i(1.5d) : l91.i(3.0d);
            case 21:
                h20 h20Var20 = (h20) obj;
                h20Var20.getClass();
                return h20Var20.h;
            case 22:
                h20 h20Var21 = (h20) obj;
                h20Var21.getClass();
                if (h20Var21.c) {
                    d = 18.0d;
                } else if (h20Var21.h.c.b()) {
                    d = 99.0d;
                } else if (h20Var21.b == u42Var4) {
                    d = 97.0d;
                }
                return Double.valueOf(d);
            case 23:
                h20 h20Var22 = (h20) obj;
                h20Var22.getClass();
                if (h20Var22.c) {
                    u42 u42Var7 = h20Var22.b;
                    if (u42Var7 == u42Var) {
                        return Double.valueOf(2.5d);
                    }
                    if (u42Var7 == u42Var3) {
                        return Double.valueOf(1.7d);
                    }
                    if (u42Var7 == u42Var2) {
                        return h20Var22.h.c.b() ? Double.valueOf(2.7d) : Double.valueOf(1.75d);
                    }
                    if (u42Var7 == u42Var4) {
                        return Double.valueOf(1.36d);
                    }
                }
                return Double.valueOf(1.0d);
            case 24:
                h20 h20Var23 = (h20) obj;
                h20Var23.getClass();
                return h20Var23.g;
            case 25:
                vm vmVar6 = xi0.v;
                ((h20) obj).getClass();
                return vmVar6.B();
            case 26:
                ((h20) obj).getClass();
                return l91.i(4.5d);
            case 27:
                h20 h20Var24 = (h20) obj;
                h20Var24.getClass();
                return h20Var24.f;
            case 28:
                vm vmVar7 = xi0.v;
                h20 h20Var25 = (h20) obj;
                h20Var25.getClass();
                return h20Var25.j == g20Var2 ? vmVar7.s() : vmVar7.F();
            default:
                vm vmVar8 = xi0.v;
                ((h20) obj).getClass();
                return vmVar8.v();
        }
    }
}
