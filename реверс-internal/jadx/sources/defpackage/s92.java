package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class s92 {
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(s92.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = yi.a.objectFieldOffset(s92.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(s92.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(s92.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(s92.class, "blockingTasksInBuffer$volatile");

    public final zv1 a(zv1 zv1Var, boolean z) {
        if (z) {
            return b(zv1Var);
        }
        b.getClass();
        zv1 zv1Var2 = (zv1) yi.a.getAndSetObject(this, f, zv1Var);
        if (zv1Var2 == null) {
            return null;
        }
        return b(zv1Var2);
    }

    public final zv1 b(zv1 zv1Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return zv1Var;
        }
        if (zv1Var.f) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, zv1Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = yi.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(dc0 dc0Var) {
        b.getClass();
        zv1 zv1Var = (zv1) yi.a.getAndSetObject(this, f, (Object) null);
        if (zv1Var != null) {
            dc0Var.a(zv1Var);
        }
        while (true) {
            zv1 zv1VarF = f();
            if (zv1VarF == null) {
                return;
            } else {
                dc0Var.a(zv1VarF);
            }
        }
    }

    public final zv1 e() {
        b.getClass();
        zv1 zv1Var = (zv1) yi.a.getAndSetObject(this, f, (Object) null);
        return zv1Var == null ? f() : zv1Var;
    }

    public final zv1 f() {
        zv1 zv1Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (zv1Var = (zv1) this.a.getAndSet(i2, null)) != null) {
                if (zv1Var.f) {
                    e.decrementAndGet(this);
                }
                return zv1Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r9 = defpackage.s92.d.get(r4);
        r1 = defpackage.s92.c.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (defpackage.s92.e.get(r4) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r1 = r1 - 1;
        r2 = r4.h(r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        r4 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zv1 g() {
        s92 s92Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = yi.a;
            long j = f;
            zv1 zv1Var = (zv1) unsafe.getObjectVolatile(this, j);
            if (zv1Var == null || !zv1Var.f) {
                break;
            }
            while (true) {
                Unsafe unsafe2 = yi.a;
                s92Var = this;
                if (unsafe2.compareAndSwapObject(s92Var, f, zv1Var, (Object) null)) {
                    return zv1Var;
                }
                if (unsafe2.getObjectVolatile(s92Var, j) != zv1Var) {
                    break;
                }
                this = s92Var;
            }
            this = s92Var;
        }
    }

    public final zv1 h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        zv1 zv1Var = (zv1) atomicReferenceArray.get(i2);
        if (zv1Var != null && zv1Var.f == z) {
            while (!atomicReferenceArray.compareAndSet(i2, zv1Var, null)) {
                if (atomicReferenceArray.get(i2) != zv1Var) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return zv1Var;
        }
        return null;
    }

    public final long i(int i, zc1 zc1Var) {
        s92 s92Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = yi.a;
            long j = f;
            zv1 zv1Var = (zv1) unsafe.getObjectVolatile(this, j);
            if (zv1Var == null) {
                return -2L;
            }
            if (((zv1Var.f ? 1 : 2) & i) == 0) {
                return -2L;
            }
            bw1.f.getClass();
            long jNanoTime = System.nanoTime() - zv1Var.e;
            long j2 = bw1.b;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (true) {
                Unsafe unsafe2 = yi.a;
                s92Var = this;
                if (unsafe2.compareAndSwapObject(s92Var, f, zv1Var, (Object) null)) {
                    zc1Var.e = zv1Var;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(s92Var, j) != zv1Var) {
                    break;
                }
                this = s92Var;
            }
            this = s92Var;
        }
    }
}
