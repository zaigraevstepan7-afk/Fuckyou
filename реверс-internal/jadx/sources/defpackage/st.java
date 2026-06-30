package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class st extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(st.class, "workerCtl$volatile");
    public final s92 e;
    public final zc1 f;
    public tt g;
    public long h;
    public long i;
    private volatile int indexInArray;
    public int j;
    public boolean k;
    public final /* synthetic */ ut l;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public st(ut utVar, int i) {
        this.l = utVar;
        setDaemon(true);
        setContextClassLoader(ut.class.getClassLoader());
        this.e = new s92();
        this.f = new zc1();
        this.g = tt.h;
        this.nextParkedWorker = ut.o;
        int iNanoTime = (int) System.nanoTime();
        this.j = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final zv1 a(boolean z) {
        zv1 zv1VarE;
        zv1 zv1VarE2;
        long j;
        tt ttVar = this.g;
        ut utVar = this.l;
        s92 s92Var = this.e;
        tt ttVar2 = tt.e;
        if (ttVar != ttVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ut.m;
            do {
                j = atomicLongFieldUpdater.get(utVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    zv1 zv1VarG = s92Var.g();
                    return (zv1VarG == null && (zv1VarG = (zv1) utVar.j.d()) == null) ? i(1) : zv1VarG;
                }
            } while (!ut.m.compareAndSet(utVar, j, j - 4398046511104L));
            this.g = ttVar2;
        }
        if (z) {
            boolean z2 = d(utVar.e * 2) == 0;
            if (z2 && (zv1VarE2 = e()) != null) {
                return zv1VarE2;
            }
            zv1 zv1VarE3 = s92Var.e();
            if (zv1VarE3 != null) {
                return zv1VarE3;
            }
            if (!z2 && (zv1VarE = e()) != null) {
                return zv1VarE;
            }
        } else {
            zv1 zv1VarE4 = e();
            if (zv1VarE4 != null) {
                return zv1VarE4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.j;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.j = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final zv1 e() {
        int iD = d(2);
        ut utVar = this.l;
        dc0 dc0Var = utVar.j;
        dc0 dc0Var2 = utVar.i;
        if (iD == 0) {
            zv1 zv1Var = (zv1) dc0Var2.d();
            return zv1Var != null ? zv1Var : (zv1) dc0Var.d();
        }
        zv1 zv1Var2 = (zv1) dc0Var.d();
        return zv1Var2 != null ? zv1Var2 : (zv1) dc0Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.l.h);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(tt ttVar) {
        tt ttVar2 = this.g;
        boolean z = ttVar2 == tt.e;
        if (z) {
            ut.m.addAndGet(this.l, 4398046511104L);
        }
        if (ttVar2 != ttVar) {
            this.g = ttVar;
        }
        return z;
    }

    public final zv1 i(int i) {
        zv1 zv1VarH;
        long jI;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ut.m;
        ut utVar = this.l;
        int i2 = (int) (atomicLongFieldUpdater.get(utVar) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            st stVar = (st) utVar.k.b(iD);
            if (stVar != null && stVar != this) {
                s92 s92Var = stVar.e;
                s92Var.getClass();
                if (i == 3) {
                    zv1VarH = s92Var.f();
                } else {
                    boolean z = i == 1;
                    int i4 = s92.d.get(s92Var);
                    int i5 = s92.c.get(s92Var);
                    while (i4 != i5 && (!z || s92.e.get(s92Var) != 0)) {
                        int i6 = i4 + 1;
                        zv1VarH = s92Var.h(i4, z);
                        if (zv1VarH != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    zv1VarH = null;
                }
                zc1 zc1Var = this.f;
                if (zv1VarH != null) {
                    zc1Var.e = zv1VarH;
                    jI = -1;
                } else {
                    jI = s92Var.i(i, zc1Var);
                }
                if (jI == -1) {
                    zv1 zv1Var = (zv1) zc1Var.e;
                    zc1Var.e = null;
                    return zv1Var;
                }
                if (jI > 0) {
                    jMin = Math.min(jMin, jI);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.i = jMin;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (ut.n.get(this.l) != 1) {
                tt ttVar = this.g;
                tt ttVar2 = tt.i;
                if (ttVar == ttVar2) {
                    break loop0;
                }
                zv1 zv1VarA = a(this.k);
                if (zv1VarA != null) {
                    this.i = 0L;
                    ut utVar = this.l;
                    this.h = 0L;
                    if (this.g == tt.g) {
                        this.g = tt.f;
                    }
                    if (zv1VarA.f) {
                        if (h(tt.f) && !utVar.f() && !utVar.e(ut.m.get(utVar))) {
                            utVar.f();
                        }
                        try {
                            zv1VarA.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        ut.m.addAndGet(utVar, -2097152L);
                        if (this.g != ttVar2) {
                            this.g = tt.h;
                        }
                    } else {
                        try {
                            zv1VarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                    }
                } else {
                    this.k = false;
                    if (this.i == 0) {
                        Object obj = this.nextParkedWorker;
                        s30 s30Var = ut.o;
                        if (obj != s30Var) {
                            m.set(this, -1);
                            while (this.nextParkedWorker != ut.o) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    ut utVar2 = this.l;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ut.n;
                                    if (atomicIntegerFieldUpdater2.get(utVar2) == 1) {
                                        break;
                                    }
                                    tt ttVar3 = this.g;
                                    tt ttVar4 = tt.i;
                                    if (ttVar3 == ttVar4) {
                                        break;
                                    }
                                    h(tt.g);
                                    Thread.interrupted();
                                    if (this.h == 0) {
                                        j = 2097151;
                                        this.h = System.nanoTime() + this.l.g;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.l.g);
                                    if (System.nanoTime() - this.h >= 0) {
                                        this.h = 0L;
                                        ut utVar3 = this.l;
                                        synchronized (utVar3.k) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(utVar3) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ut.m;
                                                    if (((int) (atomicLongFieldUpdater.get(utVar3) & j)) > utVar3.e && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        f(0);
                                                        utVar3.d(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(utVar3) & j);
                                                        if (andDecrement != i) {
                                                            Object objB = utVar3.k.b(andDecrement);
                                                            objB.getClass();
                                                            st stVar = (st) objB;
                                                            utVar3.k.c(i, stVar);
                                                            stVar.f(i);
                                                            utVar3.d(stVar, andDecrement, i);
                                                        }
                                                        utVar3.k.c(andDecrement, null);
                                                        this.g = ttVar4;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ut utVar4 = this.l;
                            if (this.nextParkedWorker == s30Var) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ut.l;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(utVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = utVar4.k.b((int) (j2 & 2097151));
                                    ut utVar5 = utVar4;
                                    if (ut.l.compareAndSet(utVar5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        utVar4 = utVar5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(tt.g);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.i);
                        this.i = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(tt.i);
    }
}
