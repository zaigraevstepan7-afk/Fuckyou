package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yo1 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ hp1 f;

    public /* synthetic */ yo1(hx hxVar, hp1 hp1Var, fy0 fy0Var) {
        this.e = 1;
        this.f = hp1Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) throws Throwable {
        boolean z;
        int i = this.e;
        t32 t32Var = t32.a;
        hp1 hp1Var = this.f;
        switch (i) {
            case 0:
                Float f = (Float) obj;
                float fFloatValue = f.floatValue();
                sa0 sa0Var = hp1Var.d;
                if (sa0Var != null) {
                    sa0Var.i(f);
                } else {
                    hp1Var.c(fFloatValue);
                }
                return t32Var;
            case 1:
                vh0 vh0Var = (vh0) obj;
                hp1Var.k.h((int) (vh0Var.a >> 32));
                hp1Var.l.h((int) (vh0Var.a & 4294967295L));
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                float fFloatValue2 = ((Float) obj).floatValue();
                fl flVar = hp1Var.b;
                r41 r41Var = hp1Var.c;
                float fZ = lk.z(fFloatValue2, flVar.a, flVar.b);
                if (fZ == r41Var.g()) {
                    z = false;
                } else {
                    if (fZ != r41Var.g()) {
                        sa0 sa0Var2 = hp1Var.d;
                        if (sa0Var2 != null) {
                            sa0Var2.i(Float.valueOf(fZ));
                        } else {
                            hp1Var.c(fZ);
                        }
                    }
                    ha0 ha0Var = hp1Var.a;
                    if (ha0Var != null) {
                        ha0Var.a();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                hp1Var.a(0.0f);
                hp1Var.o.a();
                return t32Var;
        }
    }

    public /* synthetic */ yo1(hp1 hp1Var, int i) {
        this.e = i;
        this.f = hp1Var;
    }
}
