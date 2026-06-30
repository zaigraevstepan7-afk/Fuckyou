package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wu extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ mv k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu(mv mvVar, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = mvVar;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return ((wu) o((ks) obj2, (g70) obj)).q(t32Var);
            case 1:
                return ((wu) o((ks) obj2, (vt) obj)).q(t32Var);
            default:
                return ((wu) o((ks) obj2, (vt) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        mv mvVar = this.k;
        switch (i) {
            case 0:
                return new wu(mvVar, ksVar, 0);
            case 1:
                return new wu(mvVar, ksVar, 1);
            default:
                return new wu(mvVar, ksVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r10 == r6) goto L22;
     */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws Throwable {
        int i = this.i;
        t32 t32Var = t32.a;
        wt wtVar = wt.e;
        mv mvVar = this.k;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    this.j = 1;
                    return mv.c(mvVar, this) == wtVar ? wtVar : t32Var;
                }
                if (i3 == 1) {
                    xc.G(obj);
                    return t32Var;
                }
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i4 = this.j;
                if (i4 == 0) {
                    xc.G(obj);
                    vu vuVar = mvVar.l;
                    this.j = 1;
                    Object objB = ((ln) vuVar.f).B(this);
                    if (objB != wtVar) {
                        objB = t32Var;
                    }
                    if (objB != wtVar) {
                    }
                    return wtVar;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        xc.G(obj);
                        return t32Var;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                f70 f70VarF = xk.f(mvVar.i().c, -1);
                j6 j6Var = new j6(i2, mvVar);
                this.j = 2;
                if (f70VarF.c(j6Var, this) != wtVar) {
                    return t32Var;
                }
                return wtVar;
            default:
                qt0 qt0Var = mvVar.k;
                int i5 = this.j;
                try {
                    if (i5 == 0) {
                        xc.G(obj);
                        if (qt0Var.q() instanceof n60) {
                            return qt0Var.q();
                        }
                        this.j = 1;
                        if (mv.d(mvVar, this) != wtVar) {
                        }
                        return wtVar;
                    }
                    if (i5 != 1) {
                        if (i5 == 2) {
                            xc.G(obj);
                            return (ms1) obj;
                        }
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                    this.j = 2;
                    obj = mv.e(mvVar, false, this);
                } catch (Throwable th) {
                    return new yb1(th, -1);
                }
                break;
        }
    }
}
