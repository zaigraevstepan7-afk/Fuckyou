package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tm implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ vm f;

    public /* synthetic */ tm(vm vmVar, int i) {
        this.e = i;
        this.f = vmVar;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        g20 g20Var = g20.h;
        g20 g20Var2 = g20.g;
        vm vmVar = this.f;
        h20 h20Var = (h20) obj;
        switch (i) {
            case 0:
                h20Var.getClass();
                if (h20Var.j == g20Var2) {
                    return h20Var.c ? vmVar.w() : vmVar.x();
                }
                return null;
            case 1:
                h20Var.getClass();
                if (h20Var.j == g20Var) {
                    return new i12(vmVar.p(), vmVar.E(), 10.0d, j12.e, false, h12.f, 16);
                }
                return null;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                h20Var.getClass();
                return h20Var.j == g20Var2 ? h20Var.c ? vmVar.w() : vmVar.x() : vmVar.H();
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                h20Var.getClass();
                if (h20Var.j == g20Var2) {
                    return h20Var.c ? vmVar.w() : vmVar.x();
                }
                return null;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                h20Var.getClass();
                if (h20Var.j == g20Var) {
                    return new i12(vmVar.t(), vmVar.F(), 10.0d, j12.e, false, h12.f, 16);
                }
                return null;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                h20Var.getClass();
                if (h20Var.j == g20Var2) {
                    return h20Var.c ? vmVar.w() : vmVar.x();
                }
                return null;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                h20Var.getClass();
                if (h20Var.j == g20Var) {
                    return new i12(vmVar.z(), vmVar.J(), 10.0d, j12.e, false, h12.f, 16);
                }
                return null;
            default:
                h20Var.getClass();
                if (h20Var.j == g20Var2) {
                    return new i12(vmVar.t(), vmVar.s(), 5.0d, j12.h, false, h12.f, 16);
                }
                return null;
        }
    }
}
