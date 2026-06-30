package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cv extends zu1 implements sa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cv(Object obj, ks ksVar, int i) {
        super(1, ksVar);
        this.i = i;
        this.k = obj;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        Object obj2 = this.k;
        ks ksVar = (ks) obj;
        switch (i) {
            case 0:
                return new cv((jv) obj2, ksVar, 0).q(t32Var);
            default:
                return new cv((ry1) obj2, ksVar, 1).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        wt wtVar = wt.e;
        Object obj2 = this.k;
        ks ksVar = null;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    this.j = 1;
                    Object objI = ((jv) obj2).i(this);
                    return objI == wtVar ? wtVar : objI;
                }
                if (i2 == 1) {
                    xc.G(obj);
                    return obj;
                }
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ry1 ry1Var = (ry1) obj2;
                int i3 = this.j;
                t32 t32Var = t32.a;
                if (i3 == 0) {
                    xc.G(obj);
                    this.j = 1;
                    if (ry1Var.s(this) == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xc.G(obj);
                        ry1Var.A = true;
                        return t32Var;
                    }
                    xc.G(obj);
                }
                j41 j41VarA = ry1.a(ry1Var);
                if (j41VarA != null) {
                    String str = (String) j41VarA.e;
                    long j = ((wz1) j41VarA.f).a;
                    s71 s71Var = ry1Var.i;
                    if (s71Var != null) {
                        this.j = 2;
                        Object objP = (str.length() == 0 || wz1.c(j)) ? t32Var : nu0.P(s71Var.a, new m6(s71Var, new h(j, null, s71Var, str), ksVar, 13), this);
                        if (objP != wtVar) {
                            objP = t32Var;
                        }
                        if (objP == wtVar) {
                            return wtVar;
                        }
                    }
                }
                ry1Var.A = true;
                return t32Var;
        }
    }
}
