package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class se implements sa0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ se(ro roVar, boolean z) {
        this.g = roVar;
        this.f = z;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        Object obj2 = this.g;
        boolean z = this.f;
        switch (i) {
            case 0:
                ro roVar = (ro) obj2;
                roVar.a(z);
                return new te((dp0) obj, roVar);
            default:
                hp1 hp1Var = (hp1) obj2;
                am1 am1Var = (am1) obj;
                t32 t32Var = t32.a;
                if (!z) {
                    ck0[] ck0VarArr = yl1.a;
                    am1Var.a(vl1.j, t32Var);
                }
                String strValueOf = String.valueOf(nu0.I(hp1Var.c.g() * 100.0f) / 100.0f);
                ck0[] ck0VarArr2 = yl1.a;
                zl1 zl1Var = vl1.b;
                ck0 ck0Var = yl1.a[0];
                am1Var.a(zl1Var, strValueOf);
                am1Var.a(ml1.i, new r0(null, new yo1(hp1Var, 2)));
                return t32Var;
        }
    }

    public /* synthetic */ se(boolean z, hp1 hp1Var) {
        this.f = z;
        this.g = hp1Var;
    }
}
