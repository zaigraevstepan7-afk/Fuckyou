package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gp0 extends ot implements vw {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(gp0.class, "runningWorkers$volatile");
    public final /* synthetic */ vw g;
    public final ot h;
    public final int i;
    public final fs0 j;
    public final Object k;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public gp0(ot otVar, int i) {
        vw vwVar = otVar instanceof vw ? (vw) otVar : null;
        this.g = vwVar == null ? yv.a : vwVar;
        this.h = otVar;
        this.i = i;
        this.j = new fs0();
        this.k = new Object();
    }

    @Override // defpackage.vw
    public final az c(long j, x02 x02Var, lt ltVar) {
        return this.g.c(j, x02Var, ltVar);
    }

    @Override // defpackage.vw
    public final void d(long j, xi xiVar) {
        this.g.d(j, xiVar);
    }

    @Override // defpackage.ot
    public final void e(lt ltVar, Runnable runnable) {
        boolean z;
        Runnable runnableK;
        this.j.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
        if (atomicIntegerFieldUpdater.get(this) < this.i) {
            synchronized (this.k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = l;
                if (atomicIntegerFieldUpdater2.get(this) >= this.i) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater2.incrementAndGet(this);
                    z = true;
                }
            }
            if (!z || (runnableK = k()) == null) {
                return;
            }
            try {
                s22.I(this.h, this, new pi(this, runnableK));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    public final Runnable k() {
        while (true) {
            Runnable runnable = (Runnable) this.j.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.j.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.ot
    public final String toString() {
        return this.h + ".limitedParallelism(" + this.i + ')';
    }
}
