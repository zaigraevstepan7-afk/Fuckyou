package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class fm1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(fm1.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ AtomicLongFieldUpdater e;
    public static final /* synthetic */ AtomicIntegerFieldUpdater f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final wi a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = yi.a;
        g = unsafe.objectFieldOffset(fm1.class.getDeclaredField("head$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(fm1.class, "deqIdx$volatile");
        d = AtomicReferenceFieldUpdater.newUpdater(fm1.class, Object.class, "tail$volatile");
        h = unsafe.objectFieldOffset(fm1.class.getDeclaredField("tail$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(fm1.class, "enqIdx$volatile");
        f = AtomicIntegerFieldUpdater.newUpdater(fm1.class, "_availablePermits$volatile");
    }

    public fm1() {
        hm1 hm1Var = new hm1(0L, null, 2);
        this.head$volatile = hm1Var;
        this.tail$volatile = hm1Var;
        this._availablePermits$volatile = 1;
        this.a = new wi(7, this);
    }

    public final boolean a(ty0 ty0Var) throws IllegalAccessException, ly, InvocationTargetException {
        Object objH;
        Unsafe unsafe;
        fm1 fm1Var = this;
        d.getClass();
        Unsafe unsafe2 = yi.a;
        long j = h;
        hm1 hm1Var = (hm1) unsafe2.getObjectVolatile(fm1Var, j);
        long andIncrement = e.getAndIncrement(fm1Var);
        dm1 dm1Var = dm1.l;
        long j2 = andIncrement / ((long) gm1.f);
        loop0: while (true) {
            objH = u4.h(hm1Var, j2, dm1Var);
            if (!kd1.u(objH)) {
                ek1 ek1VarN = kd1.n(objH);
                while (true) {
                    ek1 ek1Var = (ek1) yi.a.getObjectVolatile(fm1Var, j);
                    if (ek1Var.e >= ek1VarN.e) {
                        break loop0;
                    }
                    if (!ek1VarN.n()) {
                        break;
                    }
                    do {
                        unsafe = yi.a;
                        fm1Var = this;
                        if (unsafe.compareAndSwapObject(fm1Var, h, ek1Var, ek1VarN)) {
                            if (ek1Var.j()) {
                                ek1Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(fm1Var, j) == ek1Var);
                    if (ek1VarN.j()) {
                        ek1VarN.h();
                    }
                }
            } else {
                break;
            }
            fm1Var = this;
        }
        hm1 hm1Var2 = (hm1) kd1.n(objH);
        AtomicReferenceArray atomicReferenceArray = hm1Var2.g;
        int i = (int) (andIncrement % ((long) gm1.f));
        while (!atomicReferenceArray.compareAndSet(i, null, ty0Var)) {
            if (atomicReferenceArray.get(i) != null) {
                s30 s30Var = gm1.b;
                s30 s30Var2 = gm1.c;
                do {
                    int i2 = 0;
                    if (atomicReferenceArray.compareAndSet(i, s30Var, s30Var2)) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uy0.i;
                        uy0 uy0Var = ty0Var.f;
                        atomicReferenceFieldUpdater.set(uy0Var, null);
                        xi xiVar = ty0Var.e;
                        n nVar = new n(17, uy0Var, ty0Var);
                        xiVar.G(t32.a, xiVar.g, new wi(i2, nVar));
                        return true;
                    }
                } while (atomicReferenceArray.get(i) == s30Var);
                return false;
            }
        }
        ty0Var.a(hm1Var2, i);
        return true;
    }

    public final void b() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!c());
    }

    public final boolean c() {
        Object objH;
        Unsafe unsafe;
        b.getClass();
        Unsafe unsafe2 = yi.a;
        long j = g;
        hm1 hm1Var = (hm1) unsafe2.getObjectVolatile(this, j);
        long andIncrement = c.getAndIncrement(this);
        long j2 = andIncrement / ((long) gm1.f);
        em1 em1Var = em1.l;
        loop0: while (true) {
            objH = u4.h(hm1Var, j2, em1Var);
            if (kd1.u(objH)) {
                break;
            }
            ek1 ek1VarN = kd1.n(objH);
            while (true) {
                ek1 ek1Var = (ek1) yi.a.getObjectVolatile(this, j);
                if (ek1Var.e >= ek1VarN.e) {
                    break loop0;
                }
                if (!ek1VarN.n()) {
                    break;
                }
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(this, g, ek1Var, ek1VarN)) {
                        if (ek1Var.j()) {
                            ek1Var.h();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == ek1Var);
                if (ek1VarN.j()) {
                    ek1VarN.h();
                }
            }
        }
        hm1 hm1Var2 = (hm1) kd1.n(objH);
        AtomicReferenceArray atomicReferenceArray = hm1Var2.g;
        hm1Var2.a();
        boolean z = false;
        if (hm1Var2.e <= j2) {
            int i = (int) (andIncrement % ((long) gm1.f));
            Object andSet = atomicReferenceArray.getAndSet(i, gm1.b);
            if (andSet == null) {
                int i2 = gm1.a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == gm1.c) {
                        return true;
                    }
                }
                s30 s30Var = gm1.b;
                s30 s30Var2 = gm1.d;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, s30Var, s30Var2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i) != s30Var) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != gm1.e) {
                if (!(andSet instanceof vi)) {
                    yc.g(andSet, "unexpected: ");
                    return false;
                }
                vi viVar = (vi) andSet;
                s30 s30VarK = viVar.k(t32.a, this.a);
                if (s30VarK != null) {
                    viVar.z(s30VarK);
                    return true;
                }
            }
        }
        return false;
    }
}
