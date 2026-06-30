package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class tu {
    public final /* synthetic */ sy0 a;
    public final /* synthetic */ vc1 b;
    public final /* synthetic */ zc1 c;
    public final /* synthetic */ mv d;

    public tu(sy0 sy0Var, vc1 vc1Var, zc1 zc1Var, mv mvVar) {
        this.a = sy0Var;
        this.b = vc1Var;
        this.c = zc1Var;
        this.d = mvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00aa, B:37:0x00b2), top: B:53:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(l6 l6Var, ls lsVar) throws Throwable {
        su suVar;
        vc1 vc1Var;
        zc1 zc1Var;
        mv mvVar;
        sy0 sy0Var;
        wa0 wa0Var;
        sy0 sy0Var2;
        sy0 sy0Var3;
        zc1 zc1Var2;
        Object obj;
        sy0 sy0Var4;
        if (lsVar instanceof su) {
            suVar = (su) lsVar;
            int i = suVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                suVar.o = i - Integer.MIN_VALUE;
            } else {
                suVar = new su(this, lsVar);
            }
        }
        Object obj2 = suVar.m;
        int i2 = suVar.o;
        wt wtVar = wt.e;
        try {
            if (i2 == 0) {
                xc.G(obj2);
                suVar.h = l6Var;
                sy0 sy0Var5 = this.a;
                suVar.i = sy0Var5;
                vc1Var = this.b;
                suVar.j = vc1Var;
                zc1Var = this.c;
                suVar.k = zc1Var;
                mvVar = this.d;
                suVar.l = mvVar;
                suVar.o = 1;
                uy0 uy0Var = (uy0) sy0Var5;
                Object objE = uy0Var.e(suVar);
                wa0Var = l6Var;
                sy0Var = uy0Var;
                if (objE != wtVar) {
                }
                return wtVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = suVar.j;
                    zc1Var2 = (zc1) suVar.i;
                    sy0Var2 = (sy0) suVar.h;
                    try {
                        xc.G(obj2);
                        sy0Var4 = sy0Var2;
                        zc1Var2.e = obj;
                        sy0Var2 = sy0Var4;
                        Object obj3 = zc1Var2.e;
                        ((uy0) sy0Var2).h(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        ((uy0) sy0Var2).h(null);
                        throw th;
                    }
                }
                mvVar = (mv) suVar.j;
                zc1Var2 = (zc1) suVar.i;
                sy0Var3 = (sy0) suVar.h;
                try {
                    xc.G(obj2);
                    sy0Var3 = sy0Var3;
                    if (!xi0.o(obj2, zc1Var2.e)) {
                        sy0Var2 = sy0Var3;
                        Object obj32 = zc1Var2.e;
                        ((uy0) sy0Var2).h(null);
                        return obj32;
                    }
                    suVar.h = sy0Var3;
                    suVar.i = zc1Var2;
                    suVar.j = obj2;
                    suVar.o = 3;
                    if (mvVar.k(obj2, false, suVar) != wtVar) {
                        obj = obj2;
                        sy0Var4 = sy0Var3;
                        zc1Var2.e = obj;
                        sy0Var2 = sy0Var4;
                        Object obj322 = zc1Var2.e;
                        ((uy0) sy0Var2).h(null);
                        return obj322;
                    }
                    return wtVar;
                } catch (Throwable th2) {
                    th = th2;
                    sy0Var2 = sy0Var3;
                    ((uy0) sy0Var2).h(null);
                    throw th;
                }
            }
            mvVar = suVar.l;
            zc1 zc1Var3 = suVar.k;
            vc1Var = (vc1) suVar.j;
            sy0 sy0Var6 = (sy0) suVar.i;
            wa0 wa0Var2 = (wa0) suVar.h;
            xc.G(obj2);
            zc1Var = zc1Var3;
            wa0Var = wa0Var2;
            sy0Var = sy0Var6;
            if (vc1Var.e) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj4 = zc1Var.e;
            suVar.h = sy0Var;
            suVar.i = zc1Var;
            suVar.j = mvVar;
            suVar.k = null;
            suVar.l = null;
            suVar.o = 2;
            Object objH = wa0Var.h(obj4, suVar);
            if (objH != wtVar) {
                sy0Var3 = sy0Var;
                obj2 = objH;
                zc1Var2 = zc1Var;
                if (!xi0.o(obj2, zc1Var2.e)) {
                }
            }
            return wtVar;
        } catch (Throwable th3) {
            th = th3;
            sy0Var2 = sy0Var;
            ((uy0) sy0Var2).h(null);
            throw th;
        }
    }
}
