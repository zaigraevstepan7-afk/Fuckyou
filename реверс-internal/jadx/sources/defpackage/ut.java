package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ut implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(ut.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(ut.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(ut.class, "_isTerminated$volatile");
    public static final s30 o = new s30("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int e;
    public final int f;
    public final long g;
    public final String h;
    public final dc0 i;
    public final dc0 j;
    public final ae1 k;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public ut(int i, int i2, long j, String str) {
        this.e = i;
        this.f = i2;
        this.g = j;
        this.h = str;
        if (i < 1) {
            yc.e(s91.h(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            yc.e(s91.j("Max pool size ", i2, " should be greater than or equals to core pool size ", i));
            throw null;
        }
        if (i2 > 2097150) {
            yc.e(s91.h(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.i = new dc0();
        this.j = new dc0();
        this.k = new ae1((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    public static /* synthetic */ void c(ut utVar, Runnable runnable, int i) {
        utVar.b(runnable, false, (i & 4) == 0);
    }

    public final int a() {
        synchronized (this.k) {
            try {
                if (n.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = m;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.e) {
                    return 0;
                }
                if (i >= this.f) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.k.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                st stVar = new st(this, i3);
                this.k.c(i3, stVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                stVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z, boolean z2) {
        zv1 aw1Var;
        tt ttVar;
        bw1.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof zv1) {
            aw1Var = (zv1) runnable;
            aw1Var.e = jNanoTime;
            aw1Var.f = z;
        } else {
            aw1Var = new aw1(runnable, jNanoTime, z);
        }
        boolean z3 = aw1Var.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = m;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        st stVar = null;
        st stVar2 = threadCurrentThread instanceof st ? (st) threadCurrentThread : null;
        if (stVar2 != null && stVar2.l == this) {
            stVar = stVar2;
        }
        if (stVar != null && (ttVar = stVar.g) != tt.i && (aw1Var.f || ttVar != tt.f)) {
            stVar.k = true;
            aw1Var = stVar.e.a(aw1Var, z2);
        }
        if (aw1Var != null) {
            if (!(aw1Var.f ? this.j.a(aw1Var) : this.i.a(aw1Var))) {
                throw new RejectedExecutionException(this.h + " was terminated");
            }
        }
        if (z3) {
            if (f() || e(jAddAndGet)) {
                return;
            }
            f();
            return;
        }
        if (f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i;
        zv1 zv1VarA;
        if (n.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            st stVar = null;
            st stVar2 = threadCurrentThread instanceof st ? (st) threadCurrentThread : null;
            if (stVar2 != null && stVar2.l == this) {
                stVar = stVar2;
            }
            synchronized (this.k) {
                i = (int) (m.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.k.b(i2);
                    objB.getClass();
                    st stVar3 = (st) objB;
                    if (stVar3 != stVar) {
                        while (stVar3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(stVar3);
                            stVar3.join(10000L);
                        }
                        stVar3.e.d(this.j);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.j.b();
            this.i.b();
            while (true) {
                if (stVar == null) {
                    zv1VarA = (zv1) this.i.d();
                    if (zv1VarA == null && (zv1VarA = (zv1) this.j.d()) == null) {
                        break;
                    }
                } else {
                    zv1VarA = stVar.a(true);
                    if (zv1VarA == null) {
                    }
                }
                try {
                    zv1VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (stVar != null) {
                stVar.h(tt.i);
            }
            l.set(this, 0L);
            m.set(this, 0L);
        }
    }

    public final void d(st stVar, int i, int i2) {
        while (true) {
            long j = l.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = stVar.c();
                    while (true) {
                        if (objC == o) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        st stVar2 = (st) objC;
                        int iB = stVar2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = stVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                ut utVar = this;
                if (l.compareAndSet(utVar, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = utVar;
                }
            }
        }
    }

    public final boolean e(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.e;
        if (i < i2) {
            int iA = a();
            if (iA == 1 && i2 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean f() {
        ut utVar;
        s30 s30Var;
        int iB;
        while (true) {
            long j = l.get(this);
            st stVar = (st) this.k.b((int) (2097151 & j));
            if (stVar == null) {
                stVar = null;
                utVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = stVar.c();
                while (true) {
                    s30Var = o;
                    if (objC == s30Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    st stVar2 = (st) objC;
                    iB = stVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = stVar2.c();
                    j = j;
                }
                if (iB >= 0) {
                    ut utVar2 = this;
                    boolean zCompareAndSet = l.compareAndSet(utVar2, j, ((long) iB) | j2);
                    utVar = utVar2;
                    if (zCompareAndSet) {
                        stVar.g(s30Var);
                    }
                    this = utVar;
                } else {
                    continue;
                }
            }
            if (stVar == null) {
                return false;
            }
            if (st.m.compareAndSet(stVar, -1, 0)) {
                LockSupport.unpark(stVar);
                return true;
            }
            this = utVar;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ae1 ae1Var = this.k;
        int iA = ae1Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            st stVar = (st) ae1Var.b(i6);
            if (stVar != null) {
                int iC = stVar.e.c();
                int iOrdinal = stVar.g.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iC);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iC);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iC > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iC);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        ez1.a();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = m.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.h);
        sb4.append('@');
        sb4.append(pv.n(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.e;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.f);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.i.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.j.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
