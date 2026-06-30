package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pm implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ vm f;

    public /* synthetic */ pm(vm vmVar, int i) {
        this.e = i;
        this.f = vmVar;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        double dA;
        double d;
        double d2;
        ld0 ld0VarU;
        int i = this.e;
        g20 g20Var = g20.g;
        vm vmVar = this.f;
        h20 h20Var = (h20) obj;
        switch (i) {
            case 0:
                h20Var.getClass();
                return Double.valueOf(vmVar.A().a(h20Var));
            case 1:
                h20Var.getClass();
                return new i12(vmVar.B(), vmVar.A(), 5.0d, j12.e, false, h12.e, 16);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                h20Var.getClass();
                return h20Var.j == g20Var ? h20Var.c ? vmVar.w() : vmVar.x() : vmVar.H();
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                h20Var.getClass();
                if (h20Var.j == g20Var) {
                    return new i12(vmVar.z(), vmVar.y(), 5.0d, j12.h, false, h12.f, 16);
                }
                return null;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                h20Var.getClass();
                return Double.valueOf(vmVar.u().a(h20Var));
            case t91.STRING_FIELD_NUMBER /* 5 */:
                h20Var.getClass();
                return new i12(vmVar.v(), vmVar.u(), 5.0d, j12.e, false, h12.e, 16);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                h20Var.getClass();
                return Double.valueOf(vmVar.q().a(h20Var));
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                h20Var.getClass();
                return new i12(vmVar.r(), vmVar.q(), 5.0d, j12.e, false, h12.e, 16);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                h20Var.getClass();
                return Double.valueOf(vmVar.t().a(new h20(h20Var.a, h20Var.b, false, 0.0d, h20Var.e, h20Var.f, h20Var.g, h20Var.h, h20Var.i, h20Var.j, h20Var.l, h20Var.k)));
            case el.a /* 9 */:
                h20Var.getClass();
                if (h20Var.j == g20Var) {
                    return h20Var.c ? vmVar.w() : vmVar.x();
                }
                return null;
            case el.b /* 10 */:
                h20Var.getClass();
                return vmVar.H();
            case 11:
                h20Var.getClass();
                return new i12(vmVar.F(), vmVar.s(), 5.0d, j12.e, false, h12.f, 16);
            case el.c /* 12 */:
                h20Var.getClass();
                return vmVar.H();
            case 13:
                h20Var.getClass();
                return new i12(vmVar.J(), vmVar.y(), 5.0d, j12.e, false, h12.f, 16);
            case 14:
                h20Var.getClass();
                return vmVar.H();
            case 15:
                h20Var.getClass();
                return new i12(vmVar.E(), vmVar.o(), 5.0d, j12.e, false, h12.f, 16);
            case 16:
                h20Var.getClass();
                return vmVar.H();
            case 17:
                h20Var.getClass();
                return new i12(vmVar.C(), vmVar.b(), 5.0d, j12.e, false, h12.f, 16);
            case 18:
                h20Var.getClass();
                return h20Var.j == g20Var ? h20Var.c ? vmVar.w() : vmVar.x() : vmVar.H();
            case 19:
                h20Var.getClass();
                if (h20Var.j == g20Var) {
                    return new i12(vmVar.p(), vmVar.o(), 5.0d, j12.h, false, h12.f, 16);
                }
                return null;
            case 20:
                h20Var.getClass();
                return h20Var.j == g20Var ? h20Var.c ? vmVar.w() : vmVar.x() : vmVar.H();
            case 21:
                h20Var.getClass();
                if (h20Var.j == g20Var) {
                    return new i12(vmVar.c(), vmVar.b(), 5.0d, j12.h, false, h12.f, 16);
                }
                return null;
            case 22:
                h20Var.getClass();
                if (h20Var.j == g20Var) {
                    return h20Var.c ? vmVar.w() : vmVar.x();
                }
                return null;
            case 23:
                h20Var.getClass();
                return Double.valueOf(vmVar.p().a(new h20(h20Var.a, h20Var.b, false, 0.0d, h20Var.e, h20Var.f, h20Var.g, h20Var.h, h20Var.i, h20Var.j, h20Var.l, h20Var.k)));
            case 24:
                h20Var.getClass();
                if (h20Var.j == g20Var) {
                    return h20Var.c ? vmVar.w() : vmVar.x();
                }
                return null;
            case 25:
                h20Var.getClass();
                if (h20Var.b == u42.h) {
                    g12 g12Var = h20Var.h;
                    double d3 = g12Var.a;
                    double d4 = 1.1d * g12Var.b;
                    double d5 = 100.0d;
                    ld0 ld0VarU2 = hk.u(d3, d4, 100.0d);
                    while (true) {
                        d = d5;
                        do {
                            d2 = ld0VarU2.c;
                            if (d2 < d4 && 0.0d <= d5 && d5 <= 100.0d) {
                                d5 -= 1.0d;
                                ld0VarU = hk.u(d3, d4, d5);
                            }
                        } while (d2 >= ld0VarU.c);
                        ld0VarU2 = ld0VarU;
                    }
                    dA = lk.y(d, 0.0d, 100.0d);
                } else {
                    dA = (h20Var.j == g20Var ? h20Var.c ? vmVar.w() : vmVar.x() : vmVar.H()).a(h20Var);
                }
                return Double.valueOf(dA);
            case 26:
                h20Var.getClass();
                return h20Var.j == g20Var ? h20Var.c ? vmVar.w() : vmVar.x() : vmVar.H();
            case 27:
                h20Var.getClass();
                if (h20Var.j == g20.h) {
                    return new i12(vmVar.c(), vmVar.C(), 10.0d, j12.e, false, h12.f, 16);
                }
                return null;
            case 28:
                h20Var.getClass();
                return Double.valueOf(vmVar.z().a(new h20(h20Var.a, h20Var.b, false, 0.0d, h20Var.e, h20Var.f, h20Var.g, h20Var.h, h20Var.i, h20Var.j, h20Var.l, h20Var.k)));
            default:
                h20Var.getClass();
                if (h20Var.j == g20Var) {
                    return h20Var.c ? vmVar.w() : vmVar.x();
                }
                return null;
        }
    }
}
