package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g50 extends b50 implements vw {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(g50.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l;
    public static final /* synthetic */ AtomicIntegerFieldUpdater m;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long o;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = yi.a;
        o = unsafe.objectFieldOffset(g50.class.getDeclaredField("_queue$volatile"));
        l = AtomicReferenceFieldUpdater.newUpdater(g50.class, Object.class, "_delayed$volatile");
        n = unsafe.objectFieldOffset(g50.class.getDeclaredField("_delayed$volatile"));
        m = AtomicIntegerFieldUpdater.newUpdater(g50.class, "_isCompleted$volatile");
    }

    public void A(Runnable runnable) {
        B();
        if (!C(runnable)) {
            xv.p.A(runnable);
            return;
        }
        Thread threadE = E();
        if (Thread.currentThread() != threadE) {
            LockSupport.unpark(threadE);
        }
    }

    public final void B() {
        e50 e50VarB;
        l.getClass();
        f50 f50Var = (f50) yi.a.getObjectVolatile(this, n);
        if (f50Var == null || n02.b.get(f50Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (f50Var) {
                try {
                    e50[] e50VarArr = f50Var.a;
                    e50VarB = null;
                    e50 e50Var = e50VarArr != null ? e50VarArr[0] : null;
                    if (e50Var != null) {
                        if (jNanoTime - e50Var.e >= 0 ? C(e50Var) : false) {
                            e50VarB = f50Var.b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (e50VarB != null);
    }

    public final boolean C(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        loop0: while (true) {
            k.getClass();
            Unsafe unsafe4 = yi.a;
            long j = o;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (m.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(this, o, (Object) null, runnable)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof hs0) {
                hs0 hs0Var = (hs0) objectVolatile;
                int iA = hs0Var.a(runnable);
                if (iA == 0) {
                    break;
                }
                if (iA == 1) {
                    hs0 hs0VarD = hs0Var.d();
                    do {
                        unsafe2 = yi.a;
                        if (unsafe2.compareAndSwapObject(this, o, objectVolatile, hs0VarD)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == nu0.i) {
                    return false;
                }
                hs0 hs0Var2 = new hs0(8, true);
                hs0Var2.a((Runnable) objectVolatile);
                hs0Var2.a(runnable);
                do {
                    unsafe3 = yi.a;
                    if (unsafe3.compareAndSwapObject(this, o, objectVolatile, hs0Var2)) {
                        break loop0;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
        return true;
    }

    public final long D() {
        e50 e50Var;
        fd fdVar = this.i;
        if (((fdVar == null || fdVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            k.getClass();
            Unsafe unsafe = yi.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, o);
            if (objectVolatile != null) {
                if (objectVolatile instanceof hs0) {
                    long j = hs0.f.get((hs0) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == nu0.i) {
                    return Long.MAX_VALUE;
                }
            }
            l.getClass();
            f50 f50Var = (f50) unsafe.getObjectVolatile(this, n);
            if (f50Var != null) {
                synchronized (f50Var) {
                    e50[] e50VarArr = f50Var.a;
                    e50Var = e50VarArr != null ? e50VarArr[0] : null;
                }
                if (e50Var != null) {
                    long jNanoTime = e50Var.e - System.nanoTime();
                    if (jNanoTime >= 0) {
                        return jNanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public abstract Thread E();

    public final boolean F() {
        fd fdVar = this.i;
        if (fdVar != null ? fdVar.isEmpty() : true) {
            l.getClass();
            Unsafe unsafe = yi.a;
            f50 f50Var = (f50) unsafe.getObjectVolatile(this, n);
            if (f50Var != null && n02.b.get(f50Var) != 0) {
                return false;
            }
            k.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, o);
            if (objectVolatile != null) {
                if (objectVolatile instanceof hs0) {
                    long j = hs0.f.get((hs0) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == nu0.i) {
                }
            }
            return true;
        }
        return false;
    }

    public void G(long j, e50 e50Var) {
        xv.p.J(j, e50Var);
    }

    public final void H() {
        e50 e50VarB;
        long jNanoTime = System.nanoTime();
        while (true) {
            l.getClass();
            f50 f50Var = (f50) yi.a.getObjectVolatile(this, n);
            if (f50Var == null) {
                return;
            }
            synchronized (f50Var) {
                e50VarB = n02.b.get(f50Var) > 0 ? f50Var.b(0) : null;
            }
            if (e50VarB == null) {
                return;
            } else {
                G(jNanoTime, e50VarB);
            }
        }
    }

    public final void I() {
        k.getClass();
        Unsafe unsafe = yi.a;
        unsafe.putObjectVolatile(this, o, (Object) null);
        l.getClass();
        unsafe.putObjectVolatile(this, n, (Object) null);
    }

    public final void J(long j, e50 e50Var) {
        Thread threadE;
        int iK = K(j, e50Var);
        if (iK == 0) {
            if (!L(e50Var) || Thread.currentThread() == (threadE = E())) {
                return;
            }
            LockSupport.unpark(threadE);
            return;
        }
        if (iK == 1) {
            G(j, e50Var);
        } else {
            if (iK == 2) {
                return;
            }
            yc.l("unexpected result");
        }
    }

    public final int K(long j, e50 e50Var) {
        g50 g50Var;
        Unsafe unsafe;
        if (m.get(this) == 1) {
            return 1;
        }
        l.getClass();
        Unsafe unsafe2 = yi.a;
        long j2 = n;
        f50 f50Var = (f50) unsafe2.getObjectVolatile(this, j2);
        if (f50Var == null) {
            f50 f50Var2 = new f50();
            f50Var2.c = j;
            while (true) {
                unsafe = yi.a;
                g50Var = this;
                if (unsafe.compareAndSwapObject(g50Var, n, (Object) null, f50Var2) || unsafe.getObjectVolatile(g50Var, j2) != null) {
                    break;
                }
                this = g50Var;
            }
            Object objectVolatile = unsafe.getObjectVolatile(g50Var, j2);
            objectVolatile.getClass();
            f50Var = (f50) objectVolatile;
        } else {
            g50Var = this;
        }
        return e50Var.b(j, f50Var, g50Var);
    }

    public final boolean L(e50 e50Var) {
        l.getClass();
        f50 f50Var = (f50) yi.a.getObjectVolatile(this, n);
        if (f50Var != null) {
            synchronized (f50Var) {
                e50[] e50VarArr = f50Var.a;
                e50Var = e50VarArr != null ? e50VarArr[0] : null;
            }
        }
        return e50Var == e50Var;
    }

    @Override // defpackage.vw
    public final void d(long j, xi xiVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            c50 c50Var = new c50(this, j2 + jNanoTime, xiVar);
            J(jNanoTime, c50Var);
            xiVar.y(new si(1, c50Var));
        }
    }

    @Override // defpackage.ot
    public final void e(lt ltVar, Runnable runnable) {
        A(runnable);
    }

    @Override // defpackage.b50
    public final long r() {
        if (t()) {
            return 0L;
        }
        B();
        Runnable runnableZ = z();
        if (runnableZ == null) {
            return D();
        }
        runnableZ.run();
        return 0L;
    }

    @Override // defpackage.b50
    public void shutdown() {
        l02.a.set(null);
        m.set(this, 1);
        y();
        while (r() <= 0) {
        }
        H();
    }

    public final void y() {
        g50 g50Var;
        Unsafe unsafe;
        s30 s30Var = nu0.i;
        while (true) {
            k.getClass();
            Unsafe unsafe2 = yi.a;
            long j = o;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = yi.a;
                    g50Var = this;
                    if (unsafe3.compareAndSwapObject(g50Var, o, (Object) null, s30Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(g50Var, j) != null) {
                        break;
                    } else {
                        this = g50Var;
                    }
                }
            } else {
                g50Var = this;
                if (objectVolatile instanceof hs0) {
                    ((hs0) objectVolatile).c();
                    return;
                }
                if (objectVolatile == s30Var) {
                    return;
                }
                hs0 hs0Var = new hs0(8, true);
                hs0Var.a((Runnable) objectVolatile);
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(g50Var, o, objectVolatile, hs0Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(g50Var, j) == objectVolatile);
            }
            this = g50Var;
        }
    }

    public final Runnable z() {
        g50 g50Var;
        Unsafe unsafe;
        while (true) {
            k.getClass();
            Unsafe unsafe2 = yi.a;
            long j = o;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof hs0) {
                hs0 hs0Var = (hs0) objectVolatile;
                Object objE = hs0Var.e();
                if (objE != hs0.g) {
                    return (Runnable) objE;
                }
                hs0 hs0VarD = hs0Var.d();
                while (true) {
                    Unsafe unsafe3 = yi.a;
                    g50Var = this;
                    if (!unsafe3.compareAndSwapObject(g50Var, o, objectVolatile, hs0VarD) && unsafe3.getObjectVolatile(g50Var, j) == objectVolatile) {
                        this = g50Var;
                    }
                }
            } else {
                g50Var = this;
                if (objectVolatile == nu0.i) {
                    return null;
                }
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(g50Var, o, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(g50Var, j) == objectVolatile);
            }
            this = g50Var;
        }
    }
}
