package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fo1 {
    public final uy0 a = new uy0();
    public final qt0 b = new qt0(8);
    public final y41 c = new y41(8, new t8(2, null, 1));

    public fo1(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.b.f).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [fo1] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [uy0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sa0 sa0Var, ls lsVar) {
        do1 do1Var;
        uy0 uy0Var;
        sy0 sy0Var;
        if (lsVar instanceof do1) {
            do1Var = (do1) lsVar;
            int i = do1Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                do1Var.l = i - Integer.MIN_VALUE;
            } else {
                do1Var = new do1(this, lsVar);
            }
        }
        Object objI = do1Var.j;
        int i2 = do1Var.l;
        wt wtVar = wt.e;
        try {
            if (i2 == 0) {
                xc.G(objI);
                do1Var.h = sa0Var;
                uy0 uy0Var2 = this.a;
                do1Var.i = uy0Var2;
                do1Var.l = 1;
                Object objE = uy0Var2.e(do1Var);
                uy0Var = uy0Var2;
                if (objE != wtVar) {
                }
                return wtVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sy0 sy0Var2 = (sy0) do1Var.h;
                xc.G(objI);
                sy0Var = sy0Var2;
                return objI;
            }
            uy0 uy0Var3 = do1Var.i;
            sa0Var = (sa0) do1Var.h;
            xc.G(objI);
            uy0Var = uy0Var3;
            do1Var.h = uy0Var;
            do1Var.i = null;
            do1Var.l = 2;
            objI = sa0Var.i(do1Var);
            sy0Var = uy0Var;
        } finally {
            ((uy0) this).h(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(wa0 wa0Var, ls lsVar) throws Throwable {
        eo1 eo1Var;
        uy0 uy0Var;
        boolean z;
        Throwable th;
        if (lsVar instanceof eo1) {
            eo1Var = (eo1) lsVar;
            int i = eo1Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                eo1Var.l = i - Integer.MIN_VALUE;
            } else {
                eo1Var = new eo1(this, lsVar);
            }
        }
        Object obj = eo1Var.j;
        int i2 = eo1Var.l;
        if (i2 != 0) {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = eo1Var.i;
            uy0Var = eo1Var.h;
            try {
                xc.G(obj);
                if (z) {
                    uy0Var.h(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                }
                throw th;
            }
        }
        xc.G(obj);
        uy0 uy0Var2 = this.a;
        boolean zF = uy0Var2.f();
        try {
            Object objValueOf = Boolean.valueOf(zF);
            eo1Var.h = uy0Var2;
            eo1Var.i = zF;
            eo1Var.l = 1;
            Object objH = wa0Var.h(objValueOf, eo1Var);
            Object obj2 = wt.e;
            if (objH == obj2) {
                return obj2;
            }
            uy0Var = uy0Var2;
            z = zF;
            obj = objH;
            if (z) {
            }
            return obj;
        } catch (Throwable th3) {
            uy0Var = uy0Var2;
            z = zF;
            th = th3;
            if (z) {
                uy0Var.h(null);
            }
            throw th;
        }
    }
}
