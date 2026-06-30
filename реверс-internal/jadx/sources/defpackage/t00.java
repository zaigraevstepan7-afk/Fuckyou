package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t00 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;

    public /* synthetic */ t00(d22 d22Var, float f) {
        this.e = 2;
        this.g = d22Var;
        this.f = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    @Override // defpackage.sa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        boolean z;
        int i = this.e;
        t32 t32Var = t32.a;
        float f = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                vc1 vc1Var = (vc1) obj2;
                e10 e10Var = (e10) obj;
                boolean zO = xi0.o(e10Var.r0(), "waiting");
                if (e10Var.j() == null) {
                    z = false;
                } else {
                    k31 k31VarJ = e10Var.j();
                    k31VarJ.getClass();
                    f10 f10Var = g10.a;
                    if (k31VarJ != k31.f ? !(f <= 30.0f || f > 90.0f) : f <= 30.0f) {
                        z = true;
                    }
                }
                if (vc1Var.e || (zO && z)) {
                    z = true;
                }
                vc1Var.e = z;
                return Boolean.valueOf(!z);
            case 1:
                fl flVar = (fl) obj2;
                fb1 fb1Var = new fb1(((Number) lk.C(Float.valueOf(f), flVar)).floatValue(), flVar);
                ck0[] ck0VarArr = yl1.a;
                zl1 zl1Var = vl1.c;
                ck0 ck0Var = yl1.a[1];
                ((am1) obj).a(zl1Var, fb1Var);
                return t32Var;
            default:
                d22 d22Var = (d22) obj2;
                long jLongValue = ((Long) obj).longValue();
                boolean zG = d22Var.g();
                t41 t41Var = d22Var.h;
                if (zG) {
                    return t32Var;
                }
                if (t41Var.g() == Long.MIN_VALUE) {
                    t41Var.h(jLongValue);
                    ((v41) d22Var.a.f).setValue(Boolean.TRUE);
                }
                long jG = jLongValue - t41Var.g();
                if (f != 0.0f) {
                    double d = jG / ((double) f);
                    if (Double.isNaN(d)) {
                        yc.p("Cannot round NaN value.");
                        return null;
                    }
                    jG = Math.round(d);
                }
                if (d22Var.b == null) {
                    d22Var.g.h(jG);
                }
                d22Var.h(jG, f == 0.0f);
                return t32Var;
        }
    }

    public /* synthetic */ t00(float f, Object obj, int i) {
        this.e = i;
        this.f = f;
        this.g = obj;
    }
}
