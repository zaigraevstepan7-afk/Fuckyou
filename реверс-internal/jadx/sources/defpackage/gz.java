package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gz implements g70 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ g70 f;
    public final /* synthetic */ zc1 g;

    public gz(hz hzVar, zc1 zc1Var, g70 g70Var) {
        this.g = zc1Var;
        this.f = g70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.g70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj, ks ksVar) {
        fz fzVar;
        n70 n70Var;
        int i = this.e;
        zc1 zc1Var = this.g;
        Object obj2 = t32.a;
        g70 g70Var = this.f;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                if (ksVar instanceof fz) {
                    fzVar = (fz) ksVar;
                    int i2 = fzVar.j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        fzVar.j = i2 - Integer.MIN_VALUE;
                    } else {
                        fzVar = new fz(this, ksVar);
                    }
                }
                Object obj3 = fzVar.h;
                int i3 = fzVar.j;
                if (i3 != 0) {
                    if (i3 == 1) {
                        xc.G(obj3);
                        return obj2;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj3);
                Object obj4 = zc1Var.e;
                if (obj4 != c2.t && xi0.o(obj4, obj)) {
                    return obj2;
                }
                zc1Var.e = obj;
                fzVar.j = 1;
                return g70Var.l(obj, fzVar) == wtVar ? wtVar : obj2;
            default:
                if (ksVar instanceof n70) {
                    n70Var = (n70) ksVar;
                    int i4 = n70Var.j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        n70Var.j = i4 - Integer.MIN_VALUE;
                    } else {
                        n70Var = new n70(this, ksVar);
                    }
                }
                Object obj5 = n70Var.h;
                int i5 = n70Var.j;
                try {
                    if (i5 == 0) {
                        xc.G(obj5);
                        n70Var.j = 1;
                        if (g70Var.l(obj, n70Var) == wtVar) {
                            obj2 = wtVar;
                        }
                    } else {
                        if (i5 != 1) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xc.G(obj5);
                    }
                    return obj2;
                } catch (Throwable th) {
                    zc1Var.e = th;
                    throw th;
                }
        }
    }

    public gz(g70 g70Var, zc1 zc1Var) {
        this.f = g70Var;
        this.g = zc1Var;
    }
}
