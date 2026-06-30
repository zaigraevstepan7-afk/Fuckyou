package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ma implements g70 {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;
    public final Object h;

    public ma(g70 g70Var, lt ltVar) {
        this.e = 2;
        this.f = ltVar;
        this.g = xi0.J(ltVar);
        this.h = new qk1(g70Var, (ks) null, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    @Override // defpackage.g70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj, ks ksVar) throws Throwable {
        o70 o70Var;
        int i = this.e;
        wt wtVar = wt.e;
        t32 t32Var = t32.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                d22 d22Var = (d22) obj3;
                ((xa1) obj4).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((wa0) ((fy0) obj2).getValue()).h(d22Var.c(), d22Var.d.getValue())).booleanValue() : false));
                return t32Var;
            case 1:
                g70 g70Var = (g70) obj3;
                vc1 vc1Var = (vc1) obj4;
                if (ksVar instanceof o70) {
                    o70Var = (o70) ksVar;
                    int i2 = o70Var.k;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        o70Var.k = i2 - Integer.MIN_VALUE;
                    } else {
                        o70Var = new o70(this, ksVar);
                    }
                }
                Object objH = o70Var.i;
                int i3 = o70Var.k;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            obj = o70Var.h;
                            xc.G(objH);
                            if (!((Boolean) objH).booleanValue()) {
                                vc1Var.e = true;
                                o70Var.h = null;
                                o70Var.k = 3;
                                if (g70Var.l(obj, o70Var) == wtVar) {
                                    return wtVar;
                                }
                            }
                        } else if (i3 != 3) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    xc.G(objH);
                } else {
                    xc.G(objH);
                    if (vc1Var.e) {
                        o70Var.h = null;
                        o70Var.k = 1;
                        if (g70Var.l(obj, o70Var) == wtVar) {
                            return wtVar;
                        }
                    } else {
                        o70Var.h = obj;
                        o70Var.k = 2;
                        objH = ((wa0) obj2).h(obj, o70Var);
                        if (objH == wtVar) {
                            return wtVar;
                        }
                        if (!((Boolean) objH).booleanValue()) {
                        }
                    }
                }
                return t32Var;
            default:
                Object objN = xi0.N((lt) obj4, obj, obj3, (qk1) obj2, ksVar);
                return objN == wtVar ? objN : t32Var;
        }
    }

    public /* synthetic */ ma(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
