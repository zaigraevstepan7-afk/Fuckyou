package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uy0 extends fm1 implements sy0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(uy0.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long j = yi.a.objectFieldOffset(uy0.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile = s22.f0;

    public final boolean d() {
        return Math.max(fm1.f.get(this), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r5 = defpackage.uy0.i;
        r2 = r0.f;
        r5.set(r2, null);
        r5 = r0.e;
        r5.G(r1, r5.g, new defpackage.wi(0, new defpackage.n(17, r2, r0)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ls lsVar) {
        boolean zF = f();
        t32 t32Var = t32.a;
        if (!zF) {
            xi xiVarU = s22.u(bl.E(lsVar));
            try {
                ty0 ty0Var = new ty0(this, xiVarU);
                while (true) {
                    int andDecrement = fm1.f.getAndDecrement(this);
                    if (andDecrement <= 1) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (a(ty0Var)) {
                            break;
                        }
                    }
                }
                Object objT = xiVarU.t();
                wt wtVar = wt.e;
                if (objT != wtVar) {
                    objT = t32Var;
                }
                if (objT == wtVar) {
                    return objT;
                }
            } catch (Throwable th) {
                xiVarU.D();
                throw th;
            }
        }
        return t32Var;
    }

    public final boolean f() {
        int iG = g();
        if (iG == 0) {
            return true;
        }
        if (iG == 1) {
            return false;
        }
        if (iG == 2) {
            throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
        yc.l("unexpected");
        return false;
    }

    public final int g() {
        int i2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = fm1.f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                if (i3 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    i.getClass();
                    yi.a.putObjectVolatile(this, j, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final void h(Object obj) {
        while (this.d()) {
            i.getClass();
            Unsafe unsafe = yi.a;
            long j2 = j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            s30 s30Var = s22.f0;
            if (objectVolatile != s30Var) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = yi.a;
                    uy0 uy0Var = this;
                    if (unsafe2.compareAndSwapObject(uy0Var, j, objectVolatile, s30Var)) {
                        uy0Var.b();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(uy0Var, j2) != objectVolatile) {
                            this = uy0Var;
                            break;
                        }
                        this = uy0Var;
                    }
                }
            }
        }
        yc.l("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(pv.n(this));
        sb.append("[isLocked=");
        sb.append(d());
        sb.append(",owner=");
        i.getClass();
        sb.append(yi.a.getObjectVolatile(this, j));
        sb.append(']');
        return sb.toString();
    }
}
